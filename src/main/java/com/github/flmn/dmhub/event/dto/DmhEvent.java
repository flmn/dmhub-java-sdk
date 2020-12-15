package com.github.flmn.dmhub.event.dto;

import com.github.flmn.dmhub.common.dto.DmhResult;
import com.github.flmn.dmhub.common.dto.HasCustomFields;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;

public class DmhEvent extends DmhResult implements HasCustomFields {
    private Long id;
    private Long customerId;
    private String event;
    private ZonedDateTime date;
    private String externalId;
    private String identityType;
    private String identityValue;
    private String referrer;
    private String tag;
    private String campaign;
    private String source;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private String country;
    private String province;
    private String city;
    private String county;
    private String location;
    private String source1;
    private String source2;
    private String source3;
    private String source4;
    private String source5;
    private String source6;
    private String source7;
    private String source8;
    private Map<String, Object> customFields = new HashMap<>();

    public DmhEvent() {
    }

    public DmhEvent(Map<String, Object> map) {
        id = getLong(map, "id");
        customerId = getLong(map, "customerId");
        event = getString(map, "event");
        date = getZonedDateTime(map, "date");
        externalId = getString(map, "externalId");
        identityType = getString(map, "identityType");
        identityValue = getString(map, "identityValue");
        referrer = getString(map, "referrer");
        tag = getString(map, "tag");
        campaign = getString(map, "campaign");
        source = getString(map, "source");
        longitude = getBigDecimal(map, "longitude");
        latitude = getBigDecimal(map, "latitude");
        country = getString(map, "country");
        province = getString(map, "province");
        city = getString(map, "city");
        county = getString(map, "county");
        location = getString(map, "location");
        source1 = getString(map, "source1");
        source2 = getString(map, "source2");
        source3 = getString(map, "source3");
        source4 = getString(map, "source4");
        source5 = getString(map, "source5");
        source6 = getString(map, "source6");
        source7 = getString(map, "source7");
        source8 = getString(map, "source8");

        map.forEach((k, v) -> {
            if (k.startsWith("c_")) {
                customFields.put(k, v);
            }
        });
    }

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>(customFields);

        putNonNull(map, "id", id);
        putNonNull(map, "customerId", customerId);
        putNonNull(map, "event", event);
        putNonNull(map, "date", date);
        putNonNull(map, "externalId", externalId);
        putNonNull(map, "identityType", identityType);
        putNonNull(map, "identityValue", identityValue);
        putNonNull(map, "referrer", referrer);
        putNonNull(map, "tag", tag);
        putNonNull(map, "campaign", campaign);
        putNonNull(map, "source", source);
        putNonNull(map, "longitude", longitude);
        putNonNull(map, "latitude", latitude);
        putNonNull(map, "country", country);
        putNonNull(map, "province", province);
        putNonNull(map, "city", city);
        putNonNull(map, "county", county);
        putNonNull(map, "location", location);
        putNonNull(map, "source1", source1);
        putNonNull(map, "source2", source2);
        putNonNull(map, "source3", source3);
        putNonNull(map, "source4", source4);
        putNonNull(map, "source5", source5);
        putNonNull(map, "source6", source6);
        putNonNull(map, "source7", source7);
        putNonNull(map, "source8", source8);

        return map;
    }

    public void addCustomField(String key, Object value) {
        customFields.put(key, value);
    }

    @Override
    public String toString() {
        return "DmhEvent{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", event='" + event + '\'' +
                ", date=" + date +
                ", externalId='" + externalId + '\'' +
                ", identityType='" + identityType + '\'' +
                ", identityValue='" + identityValue + '\'' +
                ", referrer='" + referrer + '\'' +
                ", tag='" + tag + '\'' +
                ", campaign='" + campaign + '\'' +
                ", source='" + source + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", location='" + location + '\'' +
                ", source1='" + source1 + '\'' +
                ", source2='" + source2 + '\'' +
                ", source3='" + source3 + '\'' +
                ", source4='" + source4 + '\'' +
                ", source5='" + source5 + '\'' +
                ", source6='" + source6 + '\'' +
                ", source7='" + source7 + '\'' +
                ", source8='" + source8 + '\'' +
                ", customFields=" + customFields +
                "} " + super.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public String getIdentityValue() {
        return identityValue;
    }

    public void setIdentityValue(String identityValue) {
        this.identityValue = identityValue;
    }

    public String getReferrer() {
        return referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getCampaign() {
        return campaign;
    }

    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSource1() {
        return source1;
    }

    public void setSource1(String source1) {
        this.source1 = source1;
    }

    public String getSource2() {
        return source2;
    }

    public void setSource2(String source2) {
        this.source2 = source2;
    }

    public String getSource3() {
        return source3;
    }

    public void setSource3(String source3) {
        this.source3 = source3;
    }

    public String getSource4() {
        return source4;
    }

    public void setSource4(String source4) {
        this.source4 = source4;
    }

    public String getSource5() {
        return source5;
    }

    public void setSource5(String source5) {
        this.source5 = source5;
    }

    public String getSource6() {
        return source6;
    }

    public void setSource6(String source6) {
        this.source6 = source6;
    }

    public String getSource7() {
        return source7;
    }

    public void setSource7(String source7) {
        this.source7 = source7;
    }

    public String getSource8() {
        return source8;
    }

    public void setSource8(String source8) {
        this.source8 = source8;
    }

    public Map<String, Object> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(Map<String, Object> customFields) {
        this.customFields = customFields;
    }
}
