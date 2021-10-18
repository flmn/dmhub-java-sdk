package com.github.flmn.dmhub.customer.dto;

import java.util.List;

public class DmhBulkGetByCustomerIdRequest {
    private List<Long> customerIds;

    public List<Long> getCustomerIds() {
        return customerIds;
    }

    public void setCustomerIds(List<Long> customerIds) {
        this.customerIds = customerIds;
    }
}
