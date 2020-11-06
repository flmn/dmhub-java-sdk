package com.github.flmn.dmhub.dto.customer;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.flmn.dmhub.dto.DmhResult;

public class DmhIdMappingResult extends DmhResult {
    private Long customerId;

    @JsonProperty("cl_cid")
    private String clCid;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getClCid() {
        return clCid;
    }

    public void setClCid(String clCid) {
        this.clCid = clCid;
    }
}
