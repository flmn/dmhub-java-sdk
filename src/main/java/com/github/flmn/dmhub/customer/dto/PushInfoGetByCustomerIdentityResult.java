package com.github.flmn.dmhub.customer.dto;

import com.github.flmn.dmhub.common.dto.DmhResult;

import java.util.List;

public class PushInfoGetByCustomerIdentityResult extends DmhResult {
    private List<PushInfoRegisterResult> data;

    public List<PushInfoRegisterResult> getData() {
        return data;
    }

    public void setData(List<PushInfoRegisterResult> data) {
        this.data = data;
    }
}
