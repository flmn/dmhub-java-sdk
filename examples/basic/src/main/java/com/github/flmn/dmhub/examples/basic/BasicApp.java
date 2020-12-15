package com.github.flmn.dmhub.examples.basic;

import com.github.flmn.dmhub.DmHubApi;
import com.github.flmn.dmhub.DmHubApiConfigurationBuilder;
import com.github.flmn.dmhub.common.dto.DmhData;
import com.github.flmn.dmhub.customer.dto.DmhCustomer;
import com.github.flmn.dmhub.wechat.dto.DmhWechatPubAccount;

public class BasicApp {
    public static void main(String[] args) {
        DmHubApiConfigurationBuilder builder = new DmHubApiConfigurationBuilder();
        builder.serverUrl("https://api.convertlab.com/v2/")
                .appId("YOUR_APP_ID")
                .appSecret("YOUR_APP_SECRET");

        DmHubApi dmHubApi = new DmHubApi(builder.build());
        dmHubApi.init();

        DmhData<DmhCustomer> customers = dmHubApi.opsForCustomer().listCustomers(null,
                "-dateJoin",
                100,
                null,
                null,
                null,
                null,
                null,
                null);

        if (customers.getError() != null) {
            System.out.println(customers);
        } else {
            customers.getData().forEach(System.out::println);
        }

        DmhData<DmhWechatPubAccount> wechatPubAccounts = dmHubApi.opsForWechat().listWechatPubAccounts();
        if (wechatPubAccounts.getError() != null) {
            System.out.println(wechatPubAccounts);
        } else {
            wechatPubAccounts.getData().forEach(System.out::println);
        }
    }
}
