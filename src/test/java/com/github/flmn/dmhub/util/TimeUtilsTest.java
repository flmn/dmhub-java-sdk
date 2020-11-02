package com.github.flmn.dmhub.util;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

class TimeUtilsTest {

    @Test
    void parse() {
        ZonedDateTime zdt = TimeUtils.parseZonedDateTime("2020-06-01T12:12:12Z");

        System.out.println(zdt);
        System.out.println(zdt.toLocalDateTime());
        System.out.println(zdt.getZone());
        System.out.println(zdt.getOffset());
        System.out.println(ZonedDateTime.now());
        System.out.println(zdt.withZoneSameInstant(ZoneId.systemDefault()));
        System.out.println(zdt.withZoneSameLocal(ZoneId.systemDefault()));
        System.out.println(ZoneId.systemDefault());
    }
}