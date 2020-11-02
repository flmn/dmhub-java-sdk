package com.github.flmn.dmhub;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.flmn.dmhub.dto.DmhAccessToken;
import com.github.flmn.dmhub.dto.DmhData;
import com.github.flmn.dmhub.dto.DmhResult;
import com.github.flmn.dmhub.dto.DmhScopes;
import com.github.flmn.dmhub.dto.customer.CreateCustomerRequest;
import com.github.flmn.dmhub.dto.customer.DmhCustomer;
import com.github.flmn.dmhub.dto.customer.IdMappingResult;
import com.github.flmn.dmhub.dto.wechat.DmhWechatPubAccount;
import com.github.flmn.dmhub.exception.DmHubSdkException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class DmHubApi {
    private static final String GRANT_TYPE = "client_credentials";
    private static final int MARGIN = 120; // seconds
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final DmHubApiConfiguration cfg;
    private DmHubApiInterface dmHubApiInterface;
    private boolean initialized = false;
    private String accessToken;
    private Instant validUtil;

    public DmHubApi(DmHubApiConfiguration cfg) {
        this.cfg = cfg;
    }

    public void init() throws DmHubSdkException {
        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(cfg.getServerUrl())
                .addConverterFactory(JacksonConverterFactory.create(objectMapper))
                .build();

        this.dmHubApiInterface = retrofit.create(DmHubApiInterface.class);

        //
        refreshAccessToken();

        initialized = true;
    }

    public DmhScopes getScopes() {
        check();

        Call<DmhScopes> call = dmHubApiInterface.oauth2Scopes(accessToken);

        return result(call, "getScopes");
    }

    // ******************** 客户 ********************

    public DmhCustomer createCustomer(CreateCustomerRequest request, boolean forceUpdate) {
        check();

        Call<DmhCustomer> call = dmHubApiInterface.customers(accessToken,
                forceUpdate,
                request);

        return result(call, "createCustomer");
    }

    public DmhResult bulkCreateCustomer(List<CreateCustomerRequest> request, boolean forceUpdate) {
        check();

        Call<DmhResult> call = dmHubApiInterface.customersBulkAdd(accessToken,
                forceUpdate,
                request);

        return result(call, "bulkCreateCustomer");
    }

    public DmhData<DmhCustomer> listCustomers(String select,
                                              String sort,
                                              Integer limit,
                                              Long id,
                                              ZonedDateTime dateJoin,
                                              ZonedDateTime lastUpdated,
                                              String stage,
                                              String mobile,
                                              String email) throws DmHubSdkException {
        check();

        Call<DmhData<DmhCustomer>> call = dmHubApiInterface.customers(accessToken,
                select,
                sort,
                limit,
                id,
                dateJoin,
                lastUpdated,
                stage,
                mobile,
                email);

        return result(call, "listCustomers");
    }

    public DmhCustomer findCustomerByIdentity(String identityType, String identityValue) {
        check();

        Call<DmhCustomer> call = dmHubApiInterface.customerServiceFindCustomerByIdentity(accessToken,
                identityType,
                identityValue);

        return result(call, "findCustomerByIdentity");
    }

    public String customerIdToClCid(Long customerId) {
        check();

        Call<IdMappingResult> call = dmHubApiInterface.customerServiceIdMapping(accessToken,
                customerId,
                null);

        IdMappingResult result = result(call, "customerIdToClCid");

        return result.getClCid();
    }

    public Long clCidToCustomerId(String clCid) {
        check();

        Call<IdMappingResult> call = dmHubApiInterface.customerServiceIdMapping(accessToken,
                null,
                clCid);

        IdMappingResult result = result(call, "clCidToCustomerId");

        return result.getCustomerId();
    }

    // ******************** 微信 ********************

    public DmhData<DmhWechatPubAccount> listWechatPubAccounts() throws DmHubSdkException {
        check();

        Call<DmhData<DmhWechatPubAccount>> call = dmHubApiInterface.wechatPubAccounts(accessToken);

        return result(call, "listWechatPubAccounts");
    }

    // ******************** 私有方法 ********************

    private void check() throws DmHubSdkException {
        if (!initialized) {
            throw new DmHubSdkException("Please call init() first.");
        }

        Instant now = Instant.now();
        if (now.isAfter(validUtil)) { // 如果当前时间已经超出有效期，同步刷新
            refreshAccessToken();

            return;
        }
    }

    private synchronized void refreshAccessToken() throws DmHubSdkException {
        if (validUtil != null && !Instant.now().isAfter(validUtil)) {
            return;
        }

        Call<DmhAccessToken> call = dmHubApiInterface.oauth2Token(cfg.getAppId(), cfg.getAppSecret(), GRANT_TYPE);
        DmhAccessToken dmhAccessToken = result(call, "getAccessToken");

        if (dmhAccessToken == null) {
            logger.warn("refreshAccessToken error: dmhAccessToken is null");

            throw new DmHubSdkException("Response is null when refresh access token.");
        }

        if (dmhAccessToken.getError() != null) {
            logger.warn("refreshAccessToken error: {}", dmhAccessToken.getError());

            throw new DmHubSdkException(dmhAccessToken.getError().getMessage());
        }

        if (dmhAccessToken.getAccessToken() == null ||
                dmhAccessToken.getExpiresIn() == null) {

            logger.warn("refreshAccessToken error: {}", dmhAccessToken);

            throw new DmHubSdkException("access_token or expires_in is null when refresh.");
        }

        accessToken = dmhAccessToken.getAccessToken();
        validUtil = Instant.now().plus(dmhAccessToken.getExpiresIn() - MARGIN, ChronoUnit.SECONDS);
    }

    // 结果检查
    private <T extends DmhResult> T result(Call<T> call, String func) {
        try {
            Response<T> response = call.execute();
            if (response.isSuccessful()) {
                logger.info("{}, code={}, message={}", func, response.code(), response.message());

                return response.body();
            } else {
                logger.warn("{} not successful, code={}, message={}", func, response.code(), response.message());

                return null;
            }
        } catch (IOException e) {
            logger.warn("{}, IOException, message={}", func, e.getMessage());

            return null;
        }
    }
}
