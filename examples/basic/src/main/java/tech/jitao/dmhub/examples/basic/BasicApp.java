package tech.jitao.dmhub.examples.basic;

import tech.jitao.dmhub.DmHubApi;
import tech.jitao.dmhub.DmHubApiConfigurationBuilder;

public class BasicApp {
    public static void main(String[] args) {
        DmHubApiConfigurationBuilder builder = new DmHubApiConfigurationBuilder();
        builder.serverUrl("https://api.convertlab.com/v2/")
                .appId("YOUR_APP_ID")
                .appSecret("YOUR_APP_SECRET");

        DmHubApi api = new DmHubApi(builder.build());
    }
}
