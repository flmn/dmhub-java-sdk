package com.github.flmn.dmhub.dto;

import com.github.flmn.dmhub.util.TimeUtils;
import com.github.flmn.util.NumberUtils;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Map;

public interface HasCustomFields {
    Map<String, Object> toMap();

    default void putNonNull(Map<String, Object> map, String key, Object value) {
        if (value != null) {
            map.put(key, value);
        }
    }

    default String getString(Map<String, Object> map, String key) {
        if (!map.containsKey(key)) {
            return null;
        }

        return map.get(key).toString();
    }

    default Long getLong(Map<String, Object> map, String key) {
        if (!map.containsKey(key)) {
            return null;
        }

        long value = NumberUtils.toLong(map.get(key).toString(), -1);

        return value == -1 ? null : value;
    }

    default ZonedDateTime getZonedDateTime(Map<String, Object> map, String key) {
        if (!map.containsKey(key)) {
            return null;
        }

        return TimeUtils.parseZonedDateTime(map.get(key).toString());
    }

    default BigDecimal getBigDecimal(Map<String, Object> map, String key) {
        if (!map.containsKey(key)) {
            return null;
        }

        try {
            return new BigDecimal(map.get(key).toString());
        } catch (NumberFormatException ignored) {
            return null;
        }
    }
}
