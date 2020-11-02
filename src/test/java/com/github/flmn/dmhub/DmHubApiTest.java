package com.github.flmn.dmhub;

import com.github.flmn.dmhub.dto.customer.CreateCustomerRequest;
import com.github.flmn.dmhub.dto.customer.DmhCustomer;
import com.github.flmn.dmhub.dto.customer.DmhIdentity;
import com.github.flmn.dmhub.dto.customer.Genders;
import com.github.flmn.dmhub.exception.DmHubSdkException;
import com.github.flmn.dmhub.util.TimeUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DmHubApiTest {
    private DmHubApi dmHubApi;

    @BeforeAll
    void setUp() {
        DmHubApiConfigurationBuilder builder = new DmHubApiConfigurationBuilder();
        builder.serverUrl("https://api.convertlab.com/v2/")
                .appId("YOUR_APP_ID")
                .appSecret("YOUR_APP_SECRET");

        dmHubApi = new DmHubApi(builder.build());
        try {
            dmHubApi.init();
        } catch (DmHubSdkException e) {
            System.out.println(e);

            return;
        }
    }

    @Test
    void test() {
        CreateCustomerRequest request = new CreateCustomerRequest();
        DmhCustomer customer = new DmhCustomer();
        customer.setName("testqi2");
        customer.setGender(Genders.FEMALE);
        customer.setMobile("18356348977");
        customer.setEmail("li.wang@163.com");
        customer.setBirthday("2000-11-19");
        customer.setWechat("test432956");
        customer.setNickName("格");
        customer.setCountry("中国");
        customer.setProvince("陕西");
        customer.setCity("西安");
        customer.setCounty("小店区");
        customer.setHomeAddress("爱国路313号");
        customer.setOfficeAddress("耶里路");
        customer.setQq("1466504230");
        customer.setStage("Subscriber");
        customer.setDateJoin(TimeUtils.parseZonedDateTime("2020-06-01T12:12:12Z"));
        customer.setSource("微博");
        customer.setContentName("XX宣传转发");
        customer.setAttr1("广告");
        request.setCustomer(customer);

        DmhIdentity identity = new DmhIdentity();
        identity.setType("mobile");
        identity.setValue("18356348977");
        identity.setName("手机号");
        request.setIdentity(identity);

        customer = dmHubApi.createCustomer(request, false);
        if (customer.getError() != null) {
            System.out.println(customer.getError());
        } else {
            System.out.println(customer);
        }
    }
}