package tech.jitao.dmhub;

public class DmHubApiConfiguration {
    private final String serverUrl;
    private final String appId;
    private final String appSecret;

    public DmHubApiConfiguration(String serverUrl,
                                 String appId,
                                 String appSecret) {
        this.serverUrl = serverUrl;
        this.appId = appId;
        this.appSecret = appSecret;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public String getAppId() {
        return appId;
    }

    public String getAppSecret() {
        return appSecret;
    }
}
