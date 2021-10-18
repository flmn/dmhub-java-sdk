package com.github.flmn.dmhub.customer.dto;

import com.github.flmn.dmhub.common.dto.DmhResult;

import java.util.List;

public class DmhBulkGetByCustomerIdResult extends DmhResult {
    private List<DmhCustomerIdentity> data;

    @Override
    public String toString() {
        return "DmhBulkGetByCustomerIdResult{" +
                "data=" + data +
                "} " + super.toString();
    }

    public List<DmhCustomerIdentity> getData() {
        return data;
    }

    public void setData(List<DmhCustomerIdentity> data) {
        this.data = data;
    }
}
