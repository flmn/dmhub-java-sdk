package com.github.flmn.dmhub;

import com.github.flmn.dmhub.dto.DmhData;
import com.github.flmn.dmhub.dto.DmhResult;
import com.github.flmn.dmhub.dto.customer.CreateCustomerRequest;
import com.github.flmn.dmhub.dto.customer.DmhCustomer;
import com.github.flmn.dmhub.dto.customer.DmhIdentity;
import com.github.flmn.dmhub.dto.customer.Genders;
import com.github.flmn.dmhub.exception.DmHubSdkException;
import com.github.flmn.dmhub.util.TimeUtils;
import com.google.common.collect.Lists;
import org.junit.jupiter.api.*;

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
    @Disabled
    void createCustomer() {
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

    @Test
    @Disabled
    void bulkCreateCustomer() {
        CreateCustomerRequest request = new CreateCustomerRequest();
        DmhCustomer customer = new DmhCustomer();
        customer.setName("testqi1-0617-3");
        customer.setMobile("18356348977");
        customer.setBirthday("2019-06-09");
        customer.setDateJoin(TimeUtils.parseZonedDateTime("2019-06-07T09:08:07Z"));
        customer.setMember(true);

        DmhIdentity identity = new DmhIdentity();
        identity.setType("wehcat");
        identity.setValue("testqi1-0617-2");
        request.setIdentity(identity);

        DmhResult result = dmHubApi.bulkCreateCustomer(Lists.newArrayList(request), false);
        System.out.println(result);
    }

    @Test
    @Disabled
    void listCustomers() {
        DmhData<DmhCustomer> customers = dmHubApi.listCustomers(null,
                "-dateJoin",
                100,
                null,
                null,
                null,
                null,
                null,
                null);

        if (customers.getError() != null) {
            System.out.println(customers.getError());
        } else if (customers.getData() == null || customers.getData().isEmpty()) {
            System.out.println(customers.getData());
        } else {
            customers.getData().forEach(System.out::println);
        }
    }

    @Test
    @Disabled
    void findCustomerByIdentity() {
        DmhCustomer customer = dmHubApi.findCustomerByIdentity("wechat", "ogrw7v8X8-6S8fV-E5BGyZIFnJa4");
        if (customer.getError() != null) {
            System.out.println(customer.getError());
        } else {
            System.out.println(customer);
        }
    }

    @Test
    void idMapping() {
        String clCid = dmHubApi.customerIdToClCid(814443154529861632L);
        System.out.println(clCid);
        Long customerId = dmHubApi.clCidToCustomerId(clCid);
        System.out.println(customerId);

        Assertions.assertEquals(814443154529861632L, customerId);
    }
}