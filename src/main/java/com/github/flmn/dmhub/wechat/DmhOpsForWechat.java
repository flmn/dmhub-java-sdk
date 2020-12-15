package com.github.flmn.dmhub.wechat;

import com.github.flmn.dmhub.DmHubApi;
import com.github.flmn.dmhub.common.DmhOps;
import com.github.flmn.dmhub.common.dto.DmhData;
import com.github.flmn.dmhub.exception.DmHubSdkException;
import com.github.flmn.dmhub.wechat.dto.DmhWechatPubAccount;
import retrofit2.Call;

public final class DmhOpsForWechat extends DmhOps {
    private final DmhWechatInterface wechatInterface;

    public DmhOpsForWechat(DmHubApi api) {
        super(api);
        this.wechatInterface = api.create(DmhWechatInterface.class);
    }

    // ******************** 微信 ********************

    public DmhData<DmhWechatPubAccount> listWechatPubAccounts() throws DmHubSdkException {
        Call<DmhData<DmhWechatPubAccount>> call = wechatInterface.wechatPubAccounts(api.getAccessToken());

        return result(call, "listWechatPubAccounts");
    }
}
