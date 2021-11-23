package com.github.flmn.dmhub.customer.dto;

import com.github.flmn.dmhub.common.dto.DmhResult;

import java.time.ZonedDateTime;

public class PushInfoRegisterResult extends DmhResult {
    private Long customerId;
    private String customerIdStr;
    private ZonedDateTime dateCreated;
    private ZonedDateTime lastUpdated;
    private String provider;
    private String appKey;
    private String pushId;
    private String os;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerIdStr() {
        return customerIdStr;
    }

    public void setCustomerIdStr(String customerIdStr) {
        this.customerIdStr = customerIdStr;
    }

    public ZonedDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(ZonedDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public ZonedDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(ZonedDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
