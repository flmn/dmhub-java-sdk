package com.github.flmn.dmhub.examples.basic;

import com.github.flmn.dmhub.DmHubApi;
import com.github.flmn.dmhub.DmHubApiConfigurationBuilder;
import com.github.flmn.dmhub.exception.GetAccessTokenException;
import com.github.flmn.dmhub.dto.DmhData;
import com.github.flmn.dmhub.dto.customer.DmhCustomer;
import com.github.flmn.dmhub.dto.wechat.DmhWechatPubAccount;

public class BasicApp {
    public static void main(String[] args) {
        DmHubApiConfigurationBuilder builder = new DmHubApiConfigurationBuilder();
        builder.serverUrl("https://api.convertlab.com/v2/")
                .appId("YOUR_APP_ID")
                .appSecret("YOUR_APP_SECRET");

        DmHubApi dmHubApi = new DmHubApi(builder.build());
        try {
            dmHubApi.init();
        } catch (GetAccessTokenException e) {
            System.out.println(e);

            return;
        }

        DmhData<DmhCustomer> customers = dmHubApi.listCustomers(null,
                "-dateJoin",
                10);

        if (customers.getError() != null) {
            System.out.println(customers);
        } else {
            customers.getData().forEach(System.out::println);
        }

        DmhData<DmhWechatPubAccount> wechatPubAccounts = dmHubApi.listWechatPubAccounts();
        if (wechatPubAccounts.getError() != null) {
            System.out.println(wechatPubAccounts);
        } else {
            wechatPubAccounts.getData().forEach(System.out::println);
        }
    }
}
