package com.github.flmn.dmhub.customer.dto;

import java.util.List;

public class PushInfoRegisterRequest {
    private String provider;
    private String appKey;
    private String pushId;
    private String os;
    private Long customerId;
    private List<DmhIdentity> customerIdentities;

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

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public List<DmhIdentity> getCustomerIdentities() {
        return customerIdentities;
    }

    public void setCustomerIdentities(List<DmhIdentity> customerIdentities) {
        this.customerIdentities = customerIdentities;
    }
}
