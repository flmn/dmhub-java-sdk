package com.github.flmn.dmhub;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.github.flmn.dmhub.exception.DmHubSdkException;
import com.github.flmn.dmhub.responses.DmhAccessToken;
import com.github.flmn.dmhub.responses.DmhData;
import com.github.flmn.dmhub.responses.DmhResult;
import com.github.flmn.dmhub.responses.DmhScopes;
import com.github.flmn.dmhub.responses.customer.DmhCustomer;
import com.github.flmn.dmhub.responses.wechat.DmhWechatPubAccount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

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
//        objectMapper.registerModule(new JavaTimeModule());
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
        Call<DmhScopes> call = dmHubApiInterface.oauth2Scopes(accessToken);

        return result(call, "getScopes");
    }

    // 客户

    public DmhData<DmhCustomer> listCustomers(String select,
                                              String sort,
                                              Integer limit) throws DmHubSdkException {
        check();

        Call<DmhData<DmhCustomer>> call = dmHubApiInterface.customers(accessToken,
                select,
                sort,
                limit);

        return result(call, "listCustomers");
    }

    // 微信
    public DmhData<DmhWechatPubAccount> listWechatPubAccounts() throws DmHubSdkException {
        check();

        Call<DmhData<DmhWechatPubAccount>> call = dmHubApiInterface.wechatPubAccounts(accessToken);

        return result(call, "listWechatPubAccounts");
    }

    // 私有方法

    private void check() throws DmHubSdkException {
        if (!initialized) {
            throw new DmHubSdkException("Please call init() first.");
        }

        Instant now = Instant.now();
        if (now.isAfter(validUtil)) { // 如果当前时间已经超出有效期，直接同步刷新
            refreshAccessToken();

            return;
        }
    }

    private void refreshAccessToken() throws DmHubSdkException {
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

    //结果检查
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
