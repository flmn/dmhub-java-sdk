package com.github.flmn.dmhub.customer;

import com.github.flmn.dmhub.BaseTest;
import com.github.flmn.dmhub.common.dto.DmhData;
import com.github.flmn.dmhub.common.dto.DmhResult;
import com.github.flmn.dmhub.customer.dto.*;
import com.github.flmn.dmhub.util.TimeUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DmhOpsForCustomerTest extends BaseTest {

    @Test
    @Disabled
    void createCustomer() {
        DmhCreateCustomerRequest request = new DmhCreateCustomerRequest();
        DmhCustomer customer = new DmhCustomer();
        customer.setName("testqi2");
        customer.setGender(DmhGenders.FEMALE);
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

        DmhOpsForCustomer ops = dmHubApi.opsForCustomer();
        customer = ops.createCustomer(request, false);
        if (customer.getError() != null) {
            System.out.println(customer.getError());
        } else {
            System.out.println(customer);
        }
    }

    @Test
    @Disabled
    void bulkCreateCustomer() {
        DmhCreateCustomerRequest request = new DmhCreateCustomerRequest();
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

        DmhOpsForCustomer ops = dmHubApi.opsForCustomer();
        DmhResult result = ops.bulkCreateCustomer(Collections.singletonList(request), false);
        System.out.println(result);
    }

    @Test
    @Disabled
    void listCustomers() {
        DmhOpsForCustomer ops = dmHubApi.opsForCustomer();
        DmhData<DmhCustomer> customers = ops.listCustomers(null,
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
        DmhOpsForCustomer ops = dmHubApi.opsForCustomer();
        DmhCustomer customer = ops.findCustomerByIdentity("wechat", "ogrw7v8X8-6S8fV-E5BGyZIFnJa4");
        if (customer.getError() != null) {
            System.out.println(customer.getError());
        } else {
            System.out.println(customer);
        }
    }

    @Test
    @Disabled
    void idMapping() {
        DmhOpsForCustomer ops = dmHubApi.opsForCustomer();
        String clCid = ops.customerIdToClCid(814443154529861632L);
        System.out.println(clCid);
        Long customerId = ops.clCidToCustomerId(clCid);
        System.out.println(customerId);

        Assertions.assertEquals(814443154529861632L, customerId);
    }

    @Test
    @Disabled
    void createIdentity() {
        DmhOpsForCustomer ops = dmHubApi.opsForCustomer();

        DmhCustomerIdentity customerIdentity = ops.createIdentity(897590518215763968L, "mobile", "13012345678");

        System.out.println(customerIdentity);
    }

    @Test
    @Disabled
    void bulkGetIdentities() {
        DmhOpsForCustomer ops = dmHubApi.opsForCustomer();

        List<Long> customerIds = new ArrayList<>();
        customerIds.add(1093485448065482752L);

        List<DmhCustomerIdentity> identities = ops.bulkGetIdentities(customerIds);

        System.out.println(identities);
    }

    @Test
    @Disabled
    void registerPushInfo() {
        DmhOpsForCustomer ops = dmHubApi.opsForCustomer();

        PushInfoRegisterRequest request = new PushInfoRegisterRequest();
        request.setProvider("plugin");
        request.setAppKey("ma");
        request.setPushId("2345678910JQKA");
        request.setOs("ios");
        request.setCustomerId(1118698964347144192L);

        PushInfoRegisterResult result = ops.registerPushInfo(request, null);

        System.out.println(result);
    }
}