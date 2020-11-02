package com.github.flmn.dmhub.dto.wechat;

public class DmhWechatPubAccount {
    private Integer id;
    private String name;
    private String serviceTypeInfo;
    private String verifyTypeInfo;
    private String appId;

    @Override
    public String toString() {
        return "DmhWechatPubAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", serviceTypeInfo='" + serviceTypeInfo + '\'' +
                ", verifyTypeInfo='" + verifyTypeInfo + '\'' +
                ", appId='" + appId + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getServiceTypeInfo() {
        return serviceTypeInfo;
    }

    public void setServiceTypeInfo(String serviceTypeInfo) {
        this.serviceTypeInfo = serviceTypeInfo;
    }

    public String getVerifyTypeInfo() {
        return verifyTypeInfo;
    }

    public void setVerifyTypeInfo(String verifyTypeInfo) {
        this.verifyTypeInfo = verifyTypeInfo;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
