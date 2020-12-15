package com.github.flmn.dmhub;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.flmn.dmhub.basic.DmhOpsForBasic;
import com.github.flmn.dmhub.campaign.DmhOpsForCampaign;
import com.github.flmn.dmhub.common.dto.DmhAccessToken;
import com.github.flmn.dmhub.content.DmhOpsForContent;
import com.github.flmn.dmhub.customer.DmhOpsForCustomer;
import com.github.flmn.dmhub.deal.DmhOpsForDeal;
import com.github.flmn.dmhub.event.DmhOpsForEvent;
import com.github.flmn.dmhub.exception.DmHubSdkException;
import com.github.flmn.dmhub.goods.DmhOpsForGoods;
import com.github.flmn.dmhub.list.DmhOpsForList;
import com.github.flmn.dmhub.membership.DmhOpsForMembership;
import com.github.flmn.dmhub.tag.DmhOpsForTag;
import com.github.flmn.dmhub.tenant.DmhOpsForTenant;
import com.github.flmn.dmhub.udo.DmhOpsForUdo;
import com.github.flmn.dmhub.wechat.DmhOpsForWechat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class DmHubApi {
    private static final int MARGIN = 120; // seconds
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private boolean initialized = false;
    private String accessToken;
    private Instant validUtil;
    private final DmHubApiConfiguration cfg;
    private final Retrofit retrofit;
    private final DmhOpsForBasic opsForBasic;
    private final DmhOpsForCustomer opsForCustomer;
    private final DmhOpsForList opsForList;
    private final DmhOpsForTag opsForTag;
    private final DmhOpsForEvent opsForEvent;
    private final DmhOpsForDeal opsForDeal;
    private final DmhOpsForGoods opsForGoods;
    private final DmhOpsForMembership opsForMembership;
    private final DmhOpsForWechat opsForWechat;
    private final DmhOpsForCampaign opsForCampaign;
    private final DmhOpsForTenant opsForTenant;
    private final DmhOpsForUdo opsForUdo;
    private final DmhOpsForContent opsForContent;

    public DmHubApi(DmHubApiConfiguration cfg) {
        this.cfg = cfg;

        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

        this.retrofit = new Retrofit.Builder()
                .baseUrl(cfg.getServerUrl())
                .addConverterFactory(JacksonConverterFactory.create(objectMapper))
                .build();

        this.opsForBasic = new DmhOpsForBasic(this);
        this.opsForCustomer = new DmhOpsForCustomer(this);
        this.opsForList = new DmhOpsForList(this);
        this.opsForTag = new DmhOpsForTag(this);
        this.opsForEvent = new DmhOpsForEvent(this);
        this.opsForDeal = new DmhOpsForDeal(this);
        this.opsForGoods = new DmhOpsForGoods(this);
        this.opsForMembership = new DmhOpsForMembership(this);
        this.opsForWechat = new DmhOpsForWechat(this);
        this.opsForCampaign = new DmhOpsForCampaign(this);
        this.opsForTenant = new DmhOpsForTenant(this);
        this.opsForUdo = new DmhOpsForUdo(this);
        this.opsForContent = new DmhOpsForContent(this);
    }

    public <T> T create(Class<T> clazz) {
        return retrofit.create(clazz);
    }

    public synchronized void init() throws DmHubSdkException {
        //
        refreshAccessToken();

        initialized = true;
    }

    public DmhOpsForBasic opsForBasic() {
        return opsForBasic;
    }

    public DmhOpsForCustomer opsForCustomer() {
        return opsForCustomer;
    }

    public DmhOpsForList opsForList() {
        return opsForList;
    }

    public DmhOpsForTag opsForTag() {
        return opsForTag;
    }

    public DmhOpsForEvent opsForEvent() {
        return opsForEvent;
    }

    public DmhOpsForDeal opsForDeal() {
        return opsForDeal;
    }

    public DmhOpsForGoods opsForGoods() {
        return opsForGoods;
    }

    public DmhOpsForMembership opsForMembership() {
        return opsForMembership;
    }

    public DmhOpsForWechat opsForWechat() {
        return opsForWechat;
    }

    public DmhOpsForCampaign opsForCampaign() {
        return opsForCampaign;
    }

    public DmhOpsForTenant opsForTenant() {
        return opsForTenant;
    }

    public DmhOpsForUdo opsForUdo() {
        return opsForUdo;
    }

    public DmhOpsForContent opsForContent() {
        return opsForContent;
    }

    public String getAccessToken() throws DmHubSdkException {
        if (!initialized) {
            throw new DmHubSdkException("Please call init() first.");
        }

        Instant now = Instant.now();
        if (now.isAfter(validUtil)) { // 如果当前时间已经超出有效期，同步刷新
            refreshAccessToken();
        }

        return accessToken;
    }

    private synchronized void refreshAccessToken() throws DmHubSdkException {
        if (validUtil != null && !Instant.now().isAfter(validUtil)) {
            return;
        }

        DmhAccessToken dmhAccessToken = opsForBasic.getAccessToken(cfg.getAppId(), cfg.getAppSecret());

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
}
