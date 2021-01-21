package com.github.flmn.dmhub;

import com.github.flmn.dmhub.exception.DmHubSdkException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class BaseTest {
    protected DmHubApi dmHubApi;

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
        }
    }
}
