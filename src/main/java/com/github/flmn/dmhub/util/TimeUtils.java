package com.github.flmn.dmhub.util;

import com.github.flmn.util.StringUtils;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public final class TimeUtils {
    private TimeUtils() {
    }

    public static ZonedDateTime parseZonedDateTime(String s) {
        if (StringUtils.isNullOrEmpty(s)) {
            return null;
        }

        try {
            return ZonedDateTime.parse(s, DateTimeFormatter.ISO_ZONED_DATE_TIME);
        } catch (DateTimeParseException ignored) {
            return null;
        }
    }
}
