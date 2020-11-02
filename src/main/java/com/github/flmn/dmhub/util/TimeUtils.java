package com.github.flmn.dmhub.util;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtils {
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private TimeUtils() {
    }

    public static ZonedDateTime parseZonedDateTime(String s) {
        return ZonedDateTime.parse(s, DateTimeFormatter.ISO_ZONED_DATE_TIME);
    }
}
