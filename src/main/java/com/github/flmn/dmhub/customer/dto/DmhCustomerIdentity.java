package com.github.flmn.dmhub.customer.dto;

import com.github.flmn.dmhub.common.dto.DmhResult;

import java.time.ZonedDateTime;

public class DmhCustomerIdentity extends DmhResult {
    private Long id;
    private Long customerId;
    private String customerIdStr;
    private String type;
    private String name;
    private String value;
    private ZonedDateTime dateCreated;
    private ZonedDateTime lastUpdated;

    @Override
    public String toString() {
        return "DmhCustomerIdentity{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", customerIdStr='" + customerIdStr + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", dateCreated=" + dateCreated +
                ", lastUpdated=" + lastUpdated +
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

    public String getCustomerIdStr() {
        return customerIdStr;
    }

    public void setCustomerIdStr(String customerIdStr) {
        this.customerIdStr = customerIdStr;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
}
