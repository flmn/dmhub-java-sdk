package com.github.flmn.dmhub;

import com.github.flmn.dmhub.responses.DmhAccessToken;
import com.github.flmn.dmhub.responses.DmhData;
import com.github.flmn.dmhub.responses.DmhScopes;
import com.github.flmn.dmhub.responses.customer.DmhCustomer;
import com.github.flmn.dmhub.responses.wechat.DmhWechatPubAccount;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface DmHubApiInterface {

    @GET("oauth2/token")
    Call<DmhAccessToken> oauth2Token(@Query("app_id") String appId,
                                     @Query("secret") String appSecret,
                                     @Query("grant_type") String grantType);

    @POST("oauth2/scopes")
    Call<DmhScopes> oauth2Scopes(@Query("access_token") String accessToken);

    // 客户
    @GET("customers")
    Call<DmhData<DmhCustomer>> customers(@Query("access_token") String accessToken,
                                         @Query("select") String select,
                                         @Query("sort") String sort,
                                         @Query("limit") Integer limit);

    // 微信
    @GET("wechatPubAccounts")
    Call<DmhData<DmhWechatPubAccount>> wechatPubAccounts(@Query("access_token") String accessToken);
}
