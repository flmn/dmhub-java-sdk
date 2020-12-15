package com.github.flmn.dmhub.basic;

import com.github.flmn.dmhub.common.dto.DmhAccessToken;
import com.github.flmn.dmhub.common.dto.DmhScopes;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface DmhBasicInterface {

    @GET("oauth2/token")
    Call<DmhAccessToken> oauth2Token(@Query("app_id") String appId,
                                     @Query("secret") String appSecret,
                                     @Query("grant_type") String grantType);

    @POST("oauth2/scopes")
    Call<DmhScopes> oauth2Scopes(@Query("access_token") String accessToken);
}
