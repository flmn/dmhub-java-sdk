package com.github.flmn.dmhub.basic;

import com.github.flmn.dmhub.DmHubApi;
import com.github.flmn.dmhub.common.DmhOps;
import com.github.flmn.dmhub.common.dto.DmhAccessToken;
import com.github.flmn.dmhub.common.dto.DmhScopes;
import retrofit2.Call;

public final class DmhOpsForBasic extends DmhOps {
    private static final String GRANT_TYPE = "client_credentials";
    private final DmhBasicInterface basicInterface;

    public DmhOpsForBasic(DmHubApi api) {
        super(api);

        this.basicInterface = api.create(DmhBasicInterface.class);
    }

    public DmhAccessToken getAccessToken(String appId, String appSecret) {
        Call<DmhAccessToken> call = basicInterface.oauth2Token(appId, appSecret, GRANT_TYPE);

        return result(call, "getAccessToken");
    }

    public DmhScopes getScopes() {
        Call<DmhScopes> call = basicInterface.oauth2Scopes(api.getAccessToken());

        return result(call, "getScopes");
    }
}
