package com.github.flmn.dmhub.event;

import com.github.flmn.dmhub.BaseTest;
import com.github.flmn.dmhub.event.dto.DmhEvent;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

class DmhOpsForEventTest extends BaseTest {

    @Test
    @Disabled
    void createEvent() {
        DmhEvent event = new DmhEvent();
        event.setCustomerId(814443154529861632L);
        event.setEvent("c_sdk_test");
        event.setDate(ZonedDateTime.now(ZoneOffset.UTC));
        event.setSource("人民广场");
        event.setSource1("销售部");
        event.addCustomField("c_sdk_version", "0.0.3");

        DmhOpsForEvent ops = dmHubApi.opsForEvent();
        event = ops.createEvent(event, false);

        System.out.println(event);
    }
}