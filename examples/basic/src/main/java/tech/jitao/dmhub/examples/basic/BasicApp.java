package tech.jitao.dmhub.examples.basic;

import tech.jitao.dmhub.DmHubApi;
import tech.jitao.dmhub.DmHubApiConfigurationBuilder;
import tech.jitao.dmhub.exception.GetAccessTokenException;
import tech.jitao.dmhub.responses.DmhData;
import tech.jitao.dmhub.responses.customer.DmhCustomer;
import tech.jitao.dmhub.responses.wechat.DmhWechatPubAccount;

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
