package tech.jitao.dmhub.responses.customer;

import java.math.BigDecimal;

public class DmhCustomer {
    private Long id;
    private String idStr;
    private String displayName;
    private String name;
    private String img;
    private Integer gender;
    private String mobile;
    private Boolean mobileVerified;
    private String email;
    private Boolean emailVerified;
    private String birthday;
    private String wechat;
    private String nickName;
    private String country;
    private String province;
    private String city;
    private String county;
    private String homeAddress;
    private String officeAddress;
    private String qq;
    private String stage;
    private String dateJoin;
    private String source;
    private String contentName;
    private String source1;
    private String source2;
    private String source3;
    private String source4;
    private String source5;
    private String source6;
    private String source7;
    private String source8;
    private String company;
    private String title;
    private String industry;
    private Integer employeeNumber;
    private BigDecimal annualRevenue;
    private String website;
    private String telephone;
    private Boolean isEmployee;
    private String campaignId;
    private String remark;

    @Override
    public String toString() {
        return "DmhCustomer{" +
                "id=" + id +
                ", idStr='" + idStr + '\'' +
                ", displayName='" + displayName + '\'' +
                ", name='" + name + '\'' +
                ", img='" + img + '\'' +
                ", gender=" + gender +
                ", mobile='" + mobile + '\'' +
                ", mobileVerified=" + mobileVerified +
                ", email='" + email + '\'' +
                ", emailVerified=" + emailVerified +
                ", birthday='" + birthday + '\'' +
                ", wechat='" + wechat + '\'' +
                ", nickName='" + nickName + '\'' +
                ", country='" + country + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", officeAddress='" + officeAddress + '\'' +
                ", qq='" + qq + '\'' +
                ", stage='" + stage + '\'' +
                ", dateJoin='" + dateJoin + '\'' +
                ", source='" + source + '\'' +
                ", contentName='" + contentName + '\'' +
                ", source1='" + source1 + '\'' +
                ", source2='" + source2 + '\'' +
                ", source3='" + source3 + '\'' +
                ", source4='" + source4 + '\'' +
                ", source5='" + source5 + '\'' +
                ", source6='" + source6 + '\'' +
                ", source7='" + source7 + '\'' +
                ", source8='" + source8 + '\'' +
                ", company='" + company + '\'' +
                ", title='" + title + '\'' +
                ", industry='" + industry + '\'' +
                ", employeeNumber=" + employeeNumber +
                ", annualRevenue=" + annualRevenue +
                ", website='" + website + '\'' +
                ", telephone='" + telephone + '\'' +
                ", isEmployee=" + isEmployee +
                ", campaignId='" + campaignId + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Boolean getMobileVerified() {
        return mobileVerified;
    }

    public void setMobileVerified(Boolean mobileVerified) {
        this.mobileVerified = mobileVerified;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getDateJoin() {
        return dateJoin;
    }

    public void setDateJoin(String dateJoin) {
        this.dateJoin = dateJoin;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public String getSource1() {
        return source1;
    }

    public void setSource1(String source1) {
        this.source1 = source1;
    }

    public String getSource2() {
        return source2;
    }

    public void setSource2(String source2) {
        this.source2 = source2;
    }

    public String getSource3() {
        return source3;
    }

    public void setSource3(String source3) {
        this.source3 = source3;
    }

    public String getSource4() {
        return source4;
    }

    public void setSource4(String source4) {
        this.source4 = source4;
    }

    public String getSource5() {
        return source5;
    }

    public void setSource5(String source5) {
        this.source5 = source5;
    }

    public String getSource6() {
        return source6;
    }

    public void setSource6(String source6) {
        this.source6 = source6;
    }

    public String getSource7() {
        return source7;
    }

    public void setSource7(String source7) {
        this.source7 = source7;
    }

    public String getSource8() {
        return source8;
    }

    public void setSource8(String source8) {
        this.source8 = source8;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public BigDecimal getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(BigDecimal annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Boolean getEmployee() {
        return isEmployee;
    }

    public void setEmployee(Boolean employee) {
        isEmployee = employee;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
