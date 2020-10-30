package com.github.flmn.dmhub;

import com.github.flmn.dmhub.exception.DmHubSdkException;
import com.github.flmn.dmhub.responses.DmhData;
import com.github.flmn.dmhub.responses.wechat.DmhWechatPubAccount;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DmHubApiTest {
    private DmHubApi dmHubApi;

    @BeforeAll
    void setUp() {
        DmHubApiConfigurationBuilder builder = new DmHubApiConfigurationBuilder();
        builder.serverUrl("https://api.convertlab.com/v2/")
                .appId("YOUR_APP_ID")
                .appSecret("YOUR_APP_SECRET");

        dmHubApi = new DmHubApi(builder.build());
        try {
            dmHubApi.init();
        } catch (DmHubSdkException e) {
            System.out.println(e);

            return;
        }
    }

    @Test
    void test() {
        DmhData<DmhWechatPubAccount> wechatPubAccounts = dmHubApi.listWechatPubAccounts();
        if (wechatPubAccounts.getError() != null) {
            System.out.println(wechatPubAccounts);
        } else {
            wechatPubAccounts.getData().forEach(System.out::println);
        }
    }
}