package com.github.flmn.dmhub.dto;

public class DmhScopes extends DmhResult {
    private String scope;

    @Override
    public String toString() {
        return "DmhScopes{" +
                "scope='" + scope + '\'' +
                "} " + super.toString();
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
