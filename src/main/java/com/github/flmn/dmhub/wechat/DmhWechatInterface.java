package com.github.flmn.dmhub.wechat;

import com.github.flmn.dmhub.common.dto.DmhData;
import com.github.flmn.dmhub.wechat.dto.DmhWechatPubAccount;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DmhWechatInterface {

    @GET("wechatPubAccounts")
    Call<DmhData<DmhWechatPubAccount>> wechatPubAccounts(@Query("access_token") String accessToken);
}
