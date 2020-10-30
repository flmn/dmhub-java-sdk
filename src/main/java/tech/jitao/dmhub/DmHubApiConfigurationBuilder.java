package tech.jitao.dmhub;

public class DmHubApiConfigurationBuilder {
    private String serverUrl;
    private String appId;
    private String appSecret;

    public DmHubApiConfiguration build() {
        return new DmHubApiConfiguration(serverUrl, appId, appSecret);
    }

    public DmHubApiConfigurationBuilder serverUrl(String serverUrl) {
        this.serverUrl = serverUrl;

        return this;
    }

    public DmHubApiConfigurationBuilder appId(String appId) {
        this.appId = appId;

        return this;
    }

    public DmHubApiConfigurationBuilder appSecret(String appSecret) {
        this.appSecret = appSecret;

        return this;
    }
}
