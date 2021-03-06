package com.github.flmn.dmhub.customer.dto;

public class DmhIdentity {
    private String type;
    private String value;
    private String name;

    @Override
    public String toString() {
        return "DmhIdentity{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
