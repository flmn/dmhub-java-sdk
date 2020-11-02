package com.github.flmn.dmhub.dto.customer;

public class CreateCustomerRequest {
    private DmhCustomer customer;
    private DmhIdentity identity;

    @Override
    public String toString() {
        return "CreateCustomerRequest{" +
                "customer=" + customer +
                ", identity=" + identity +
                '}';
    }

    public DmhCustomer getCustomer() {
        return customer;
    }

    public void setCustomer(DmhCustomer customer) {
        this.customer = customer;
    }

    public DmhIdentity getIdentity() {
        return identity;
    }

    public void setIdentity(DmhIdentity identity) {
        this.identity = identity;
    }
}
