package com.github.flmn.dmhub.dto.customer;

import com.github.flmn.dmhub.dto.DmhResult;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class DmhCustomer extends DmhResult {
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
    private ZonedDateTime dateJoin;
    private String createFrom;
    private String createFromName;
    private String createMethod;
    private String source;
    private String contentName;
    private String company;
    private String title;
    private String industry;
    private Integer employeeNumber;
    private BigDecimal annualRevenue;
    private String website;
    private String telephone;
    private String ownerId;
    private String ownerName;
    private Boolean isEmployee;
    private Boolean isReferrer;
    private String referrer;
    private String referrerName;
    private String campaignId;
    private String campaignName;
    private ZonedDateTime lastUpdated;
    private String remark;
    private Boolean isMember;
    private String language;
    private String subscribeScene;
    private String source1;
    private String source2;
    private String source3;
    private String source4;
    private String source5;
    private String source6;
    private String source7;
    private String source8;
    private ZonedDateTime dateCreated;
    private Object attr1;
    private Object attr2;
    private Object attr3;
    private Object attr4;
    private Object attr5;
    private Object attr6;
    private Object attr7;
    private Object attr8;
    private Object attr9;
    private Object attr10;
    private Object attr11;
    private Object attr12;
    private Object attr13;
    private Object attr14;
    private Object attr15;
    private Object attr16;
    private Object attr17;
    private Object attr18;
    private Object attr19;
    private Object attr20;
    private Object attr21;
    private Object attr22;
    private Object attr23;
    private Object attr24;
    private Object attr25;
    private Object attr26;
    private Object attr27;
    private Object attr28;
    private Object attr29;
    private Object attr30;
    private Object attr31;
    private Object attr32;
    private Object attr33;
    private Object attr34;
    private Object attr35;
    private Object attr36;
    private Object attr37;
    private Object attr38;
    private Object attr39;
    private Object attr40;
    private Object attr41;
    private Object attr42;
    private Object attr43;
    private Object attr44;
    private Object attr45;
    private Object attr46;
    private Object attr47;
    private Object attr48;
    private Object attr49;
    private Object attr50;
    private Object attr51;
    private Object attr52;
    private Object attr53;
    private Object attr54;
    private Object attr55;
    private Object attr56;
    private Object attr57;
    private Object attr58;
    private Object attr59;
    private Object attr60;
    private Object attr61;
    private Object attr62;
    private Object attr63;
    private Object attr64;
    private Object attr65;
    private Object attr66;
    private Object attr67;
    private Object attr68;
    private Object attr69;
    private Object attr70;
    private Object attr71;
    private Object attr72;
    private Object attr73;
    private Object attr74;
    private Object attr75;
    private Object attr76;
    private Object attr77;
    private Object attr78;
    private Object attr79;
    private Object attr80;
    private Object attr81;
    private Object attr82;
    private Object attr83;
    private Object attr84;
    private Object attr85;
    private Object attr86;
    private Object attr87;
    private Object attr88;
    private Object attr89;
    private Object attr90;
    private Object attr91;
    private Object attr92;
    private Object attr93;
    private Object attr94;
    private Object attr95;
    private Object attr96;
    private Object attr97;
    private Object attr98;
    private Object attr99;
    private Object attr100;
    private Object attr101;
    private Object attr102;
    private Object attr103;
    private Object attr104;
    private Object attr105;
    private Object attr106;
    private Object attr107;
    private Object attr108;
    private Object attr109;
    private Object attr110;
    private Object attr111;
    private Object attr112;
    private Object attr113;
    private Object attr114;
    private Object attr115;
    private Object attr116;
    private Object attr117;
    private Object attr118;
    private Object attr119;
    private Object attr120;

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
                ", dateJoin=" + dateJoin +
                ", createFrom='" + createFrom + '\'' +
                ", createFromName='" + createFromName + '\'' +
                ", createMethod='" + createMethod + '\'' +
                ", source='" + source + '\'' +
                ", contentName='" + contentName + '\'' +
                ", company='" + company + '\'' +
                ", title='" + title + '\'' +
                ", industry='" + industry + '\'' +
                ", employeeNumber=" + employeeNumber +
                ", annualRevenue=" + annualRevenue +
                ", website='" + website + '\'' +
                ", telephone='" + telephone + '\'' +
                ", ownerId='" + ownerId + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", isEmployee=" + isEmployee +
                ", isReferrer=" + isReferrer +
                ", referrer='" + referrer + '\'' +
                ", referrerName='" + referrerName + '\'' +
                ", campaignId='" + campaignId + '\'' +
                ", campaignName='" + campaignName + '\'' +
                ", lastUpdated=" + lastUpdated +
                ", remark='" + remark + '\'' +
                ", isMember=" + isMember +
                ", language='" + language + '\'' +
                ", subscribeScene='" + subscribeScene + '\'' +
                ", source1='" + source1 + '\'' +
                ", source2='" + source2 + '\'' +
                ", source3='" + source3 + '\'' +
                ", source4='" + source4 + '\'' +
                ", source5='" + source5 + '\'' +
                ", source6='" + source6 + '\'' +
                ", source7='" + source7 + '\'' +
                ", source8='" + source8 + '\'' +
                ", dateCreated=" + dateCreated +
                ", attr1=" + attr1 +
                ", attr2=" + attr2 +
                ", attr3=" + attr3 +
                ", attr4=" + attr4 +
                ", attr5=" + attr5 +
                ", attr6=" + attr6 +
                ", attr7=" + attr7 +
                ", attr8=" + attr8 +
                ", attr9=" + attr9 +
                ", attr10=" + attr10 +
                ", attr11=" + attr11 +
                ", attr12=" + attr12 +
                ", attr13=" + attr13 +
                ", attr14=" + attr14 +
                ", attr15=" + attr15 +
                ", attr16=" + attr16 +
                ", attr17=" + attr17 +
                ", attr18=" + attr18 +
                ", attr19=" + attr19 +
                ", attr20=" + attr20 +
                ", attr21=" + attr21 +
                ", attr22=" + attr22 +
                ", attr23=" + attr23 +
                ", attr24=" + attr24 +
                ", attr25=" + attr25 +
                ", attr26=" + attr26 +
                ", attr27=" + attr27 +
                ", attr28=" + attr28 +
                ", attr29=" + attr29 +
                ", attr30=" + attr30 +
                ", attr31=" + attr31 +
                ", attr32=" + attr32 +
                ", attr33=" + attr33 +
                ", attr34=" + attr34 +
                ", attr35=" + attr35 +
                ", attr36=" + attr36 +
                ", attr37=" + attr37 +
                ", attr38=" + attr38 +
                ", attr39=" + attr39 +
                ", attr40=" + attr40 +
                ", attr41=" + attr41 +
                ", attr42=" + attr42 +
                ", attr43=" + attr43 +
                ", attr44=" + attr44 +
                ", attr45=" + attr45 +
                ", attr46=" + attr46 +
                ", attr47=" + attr47 +
                ", attr48=" + attr48 +
                ", attr49=" + attr49 +
                ", attr50=" + attr50 +
                ", attr51=" + attr51 +
                ", attr52=" + attr52 +
                ", attr53=" + attr53 +
                ", attr54=" + attr54 +
                ", attr55=" + attr55 +
                ", attr56=" + attr56 +
                ", attr57=" + attr57 +
                ", attr58=" + attr58 +
                ", attr59=" + attr59 +
                ", attr60=" + attr60 +
                ", attr61=" + attr61 +
                ", attr62=" + attr62 +
                ", attr63=" + attr63 +
                ", attr64=" + attr64 +
                ", attr65=" + attr65 +
                ", attr66=" + attr66 +
                ", attr67=" + attr67 +
                ", attr68=" + attr68 +
                ", attr69=" + attr69 +
                ", attr70=" + attr70 +
                ", attr71=" + attr71 +
                ", attr72=" + attr72 +
                ", attr73=" + attr73 +
                ", attr74=" + attr74 +
                ", attr75=" + attr75 +
                ", attr76=" + attr76 +
                ", attr77=" + attr77 +
                ", attr78=" + attr78 +
                ", attr79=" + attr79 +
                ", attr80=" + attr80 +
                ", attr81=" + attr81 +
                ", attr82=" + attr82 +
                ", attr83=" + attr83 +
                ", attr84=" + attr84 +
                ", attr85=" + attr85 +
                ", attr86=" + attr86 +
                ", attr87=" + attr87 +
                ", attr88=" + attr88 +
                ", attr89=" + attr89 +
                ", attr90=" + attr90 +
                ", attr91=" + attr91 +
                ", attr92=" + attr92 +
                ", attr93=" + attr93 +
                ", attr94=" + attr94 +
                ", attr95=" + attr95 +
                ", attr96=" + attr96 +
                ", attr97=" + attr97 +
                ", attr98=" + attr98 +
                ", attr99=" + attr99 +
                ", attr100=" + attr100 +
                ", attr101=" + attr101 +
                ", attr102=" + attr102 +
                ", attr103=" + attr103 +
                ", attr104=" + attr104 +
                ", attr105=" + attr105 +
                ", attr106=" + attr106 +
                ", attr107=" + attr107 +
                ", attr108=" + attr108 +
                ", attr109=" + attr109 +
                ", attr110=" + attr110 +
                ", attr111=" + attr111 +
                ", attr112=" + attr112 +
                ", attr113=" + attr113 +
                ", attr114=" + attr114 +
                ", attr115=" + attr115 +
                ", attr116=" + attr116 +
                ", attr117=" + attr117 +
                ", attr118=" + attr118 +
                ", attr119=" + attr119 +
                ", attr120=" + attr120 +
                "} " + super.toString();
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

    public ZonedDateTime getDateJoin() {
        return dateJoin;
    }

    public void setDateJoin(ZonedDateTime dateJoin) {
        this.dateJoin = dateJoin;
    }

    public String getCreateFrom() {
        return createFrom;
    }

    public void setCreateFrom(String createFrom) {
        this.createFrom = createFrom;
    }

    public String getCreateFromName() {
        return createFromName;
    }

    public void setCreateFromName(String createFromName) {
        this.createFromName = createFromName;
    }

    public String getCreateMethod() {
        return createMethod;
    }

    public void setCreateMethod(String createMethod) {
        this.createMethod = createMethod;
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

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Boolean getEmployee() {
        return isEmployee;
    }

    public void setEmployee(Boolean employee) {
        isEmployee = employee;
    }

    public Boolean getReferrer() {
        return isReferrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public void setReferrer(Boolean referrer) {
        isReferrer = referrer;
    }

    public String getReferrerName() {
        return referrerName;
    }

    public void setReferrerName(String referrerName) {
        this.referrerName = referrerName;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public ZonedDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(ZonedDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getMember() {
        return isMember;
    }

    public void setMember(Boolean member) {
        isMember = member;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSubscribeScene() {
        return subscribeScene;
    }

    public void setSubscribeScene(String subscribeScene) {
        this.subscribeScene = subscribeScene;
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

    public ZonedDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(ZonedDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Object getAttr1() {
        return attr1;
    }

    public void setAttr1(Object attr1) {
        this.attr1 = attr1;
    }

    public Object getAttr2() {
        return attr2;
    }

    public void setAttr2(Object attr2) {
        this.attr2 = attr2;
    }

    public Object getAttr3() {
        return attr3;
    }

    public void setAttr3(Object attr3) {
        this.attr3 = attr3;
    }

    public Object getAttr4() {
        return attr4;
    }

    public void setAttr4(Object attr4) {
        this.attr4 = attr4;
    }

    public Object getAttr5() {
        return attr5;
    }

    public void setAttr5(Object attr5) {
        this.attr5 = attr5;
    }

    public Object getAttr6() {
        return attr6;
    }

    public void setAttr6(Object attr6) {
        this.attr6 = attr6;
    }

    public Object getAttr7() {
        return attr7;
    }

    public void setAttr7(Object attr7) {
        this.attr7 = attr7;
    }

    public Object getAttr8() {
        return attr8;
    }

    public void setAttr8(Object attr8) {
        this.attr8 = attr8;
    }

    public Object getAttr9() {
        return attr9;
    }

    public void setAttr9(Object attr9) {
        this.attr9 = attr9;
    }

    public Object getAttr10() {
        return attr10;
    }

    public void setAttr10(Object attr10) {
        this.attr10 = attr10;
    }

    public Object getAttr11() {
        return attr11;
    }

    public void setAttr11(Object attr11) {
        this.attr11 = attr11;
    }

    public Object getAttr12() {
        return attr12;
    }

    public void setAttr12(Object attr12) {
        this.attr12 = attr12;
    }

    public Object getAttr13() {
        return attr13;
    }

    public void setAttr13(Object attr13) {
        this.attr13 = attr13;
    }

    public Object getAttr14() {
        return attr14;
    }

    public void setAttr14(Object attr14) {
        this.attr14 = attr14;
    }

    public Object getAttr15() {
        return attr15;
    }

    public void setAttr15(Object attr15) {
        this.attr15 = attr15;
    }

    public Object getAttr16() {
        return attr16;
    }

    public void setAttr16(Object attr16) {
        this.attr16 = attr16;
    }

    public Object getAttr17() {
        return attr17;
    }

    public void setAttr17(Object attr17) {
        this.attr17 = attr17;
    }

    public Object getAttr18() {
        return attr18;
    }

    public void setAttr18(Object attr18) {
        this.attr18 = attr18;
    }

    public Object getAttr19() {
        return attr19;
    }

    public void setAttr19(Object attr19) {
        this.attr19 = attr19;
    }

    public Object getAttr20() {
        return attr20;
    }

    public void setAttr20(Object attr20) {
        this.attr20 = attr20;
    }

    public Object getAttr21() {
        return attr21;
    }

    public void setAttr21(Object attr21) {
        this.attr21 = attr21;
    }

    public Object getAttr22() {
        return attr22;
    }

    public void setAttr22(Object attr22) {
        this.attr22 = attr22;
    }

    public Object getAttr23() {
        return attr23;
    }

    public void setAttr23(Object attr23) {
        this.attr23 = attr23;
    }

    public Object getAttr24() {
        return attr24;
    }

    public void setAttr24(Object attr24) {
        this.attr24 = attr24;
    }

    public Object getAttr25() {
        return attr25;
    }

    public void setAttr25(Object attr25) {
        this.attr25 = attr25;
    }

    public Object getAttr26() {
        return attr26;
    }

    public void setAttr26(Object attr26) {
        this.attr26 = attr26;
    }

    public Object getAttr27() {
        return attr27;
    }

    public void setAttr27(Object attr27) {
        this.attr27 = attr27;
    }

    public Object getAttr28() {
        return attr28;
    }

    public void setAttr28(Object attr28) {
        this.attr28 = attr28;
    }

    public Object getAttr29() {
        return attr29;
    }

    public void setAttr29(Object attr29) {
        this.attr29 = attr29;
    }

    public Object getAttr30() {
        return attr30;
    }

    public void setAttr30(Object attr30) {
        this.attr30 = attr30;
    }

    public Object getAttr31() {
        return attr31;
    }

    public void setAttr31(Object attr31) {
        this.attr31 = attr31;
    }

    public Object getAttr32() {
        return attr32;
    }

    public void setAttr32(Object attr32) {
        this.attr32 = attr32;
    }

    public Object getAttr33() {
        return attr33;
    }

    public void setAttr33(Object attr33) {
        this.attr33 = attr33;
    }

    public Object getAttr34() {
        return attr34;
    }

    public void setAttr34(Object attr34) {
        this.attr34 = attr34;
    }

    public Object getAttr35() {
        return attr35;
    }

    public void setAttr35(Object attr35) {
        this.attr35 = attr35;
    }

    public Object getAttr36() {
        return attr36;
    }

    public void setAttr36(Object attr36) {
        this.attr36 = attr36;
    }

    public Object getAttr37() {
        return attr37;
    }

    public void setAttr37(Object attr37) {
        this.attr37 = attr37;
    }

    public Object getAttr38() {
        return attr38;
    }

    public void setAttr38(Object attr38) {
        this.attr38 = attr38;
    }

    public Object getAttr39() {
        return attr39;
    }

    public void setAttr39(Object attr39) {
        this.attr39 = attr39;
    }

    public Object getAttr40() {
        return attr40;
    }

    public void setAttr40(Object attr40) {
        this.attr40 = attr40;
    }

    public Object getAttr41() {
        return attr41;
    }

    public void setAttr41(Object attr41) {
        this.attr41 = attr41;
    }

    public Object getAttr42() {
        return attr42;
    }

    public void setAttr42(Object attr42) {
        this.attr42 = attr42;
    }

    public Object getAttr43() {
        return attr43;
    }

    public void setAttr43(Object attr43) {
        this.attr43 = attr43;
    }

    public Object getAttr44() {
        return attr44;
    }

    public void setAttr44(Object attr44) {
        this.attr44 = attr44;
    }

    public Object getAttr45() {
        return attr45;
    }

    public void setAttr45(Object attr45) {
        this.attr45 = attr45;
    }

    public Object getAttr46() {
        return attr46;
    }

    public void setAttr46(Object attr46) {
        this.attr46 = attr46;
    }

    public Object getAttr47() {
        return attr47;
    }

    public void setAttr47(Object attr47) {
        this.attr47 = attr47;
    }

    public Object getAttr48() {
        return attr48;
    }

    public void setAttr48(Object attr48) {
        this.attr48 = attr48;
    }

    public Object getAttr49() {
        return attr49;
    }

    public void setAttr49(Object attr49) {
        this.attr49 = attr49;
    }

    public Object getAttr50() {
        return attr50;
    }

    public void setAttr50(Object attr50) {
        this.attr50 = attr50;
    }

    public Object getAttr51() {
        return attr51;
    }

    public void setAttr51(Object attr51) {
        this.attr51 = attr51;
    }

    public Object getAttr52() {
        return attr52;
    }

    public void setAttr52(Object attr52) {
        this.attr52 = attr52;
    }

    public Object getAttr53() {
        return attr53;
    }

    public void setAttr53(Object attr53) {
        this.attr53 = attr53;
    }

    public Object getAttr54() {
        return attr54;
    }

    public void setAttr54(Object attr54) {
        this.attr54 = attr54;
    }

    public Object getAttr55() {
        return attr55;
    }

    public void setAttr55(Object attr55) {
        this.attr55 = attr55;
    }

    public Object getAttr56() {
        return attr56;
    }

    public void setAttr56(Object attr56) {
        this.attr56 = attr56;
    }

    public Object getAttr57() {
        return attr57;
    }

    public void setAttr57(Object attr57) {
        this.attr57 = attr57;
    }

    public Object getAttr58() {
        return attr58;
    }

    public void setAttr58(Object attr58) {
        this.attr58 = attr58;
    }

    public Object getAttr59() {
        return attr59;
    }

    public void setAttr59(Object attr59) {
        this.attr59 = attr59;
    }

    public Object getAttr60() {
        return attr60;
    }

    public void setAttr60(Object attr60) {
        this.attr60 = attr60;
    }

    public Object getAttr61() {
        return attr61;
    }

    public void setAttr61(Object attr61) {
        this.attr61 = attr61;
    }

    public Object getAttr62() {
        return attr62;
    }

    public void setAttr62(Object attr62) {
        this.attr62 = attr62;
    }

    public Object getAttr63() {
        return attr63;
    }

    public void setAttr63(Object attr63) {
        this.attr63 = attr63;
    }

    public Object getAttr64() {
        return attr64;
    }

    public void setAttr64(Object attr64) {
        this.attr64 = attr64;
    }

    public Object getAttr65() {
        return attr65;
    }

    public void setAttr65(Object attr65) {
        this.attr65 = attr65;
    }

    public Object getAttr66() {
        return attr66;
    }

    public void setAttr66(Object attr66) {
        this.attr66 = attr66;
    }

    public Object getAttr67() {
        return attr67;
    }

    public void setAttr67(Object attr67) {
        this.attr67 = attr67;
    }

    public Object getAttr68() {
        return attr68;
    }

    public void setAttr68(Object attr68) {
        this.attr68 = attr68;
    }

    public Object getAttr69() {
        return attr69;
    }

    public void setAttr69(Object attr69) {
        this.attr69 = attr69;
    }

    public Object getAttr70() {
        return attr70;
    }

    public void setAttr70(Object attr70) {
        this.attr70 = attr70;
    }

    public Object getAttr71() {
        return attr71;
    }

    public void setAttr71(Object attr71) {
        this.attr71 = attr71;
    }

    public Object getAttr72() {
        return attr72;
    }

    public void setAttr72(Object attr72) {
        this.attr72 = attr72;
    }

    public Object getAttr73() {
        return attr73;
    }

    public void setAttr73(Object attr73) {
        this.attr73 = attr73;
    }

    public Object getAttr74() {
        return attr74;
    }

    public void setAttr74(Object attr74) {
        this.attr74 = attr74;
    }

    public Object getAttr75() {
        return attr75;
    }

    public void setAttr75(Object attr75) {
        this.attr75 = attr75;
    }

    public Object getAttr76() {
        return attr76;
    }

    public void setAttr76(Object attr76) {
        this.attr76 = attr76;
    }

    public Object getAttr77() {
        return attr77;
    }

    public void setAttr77(Object attr77) {
        this.attr77 = attr77;
    }

    public Object getAttr78() {
        return attr78;
    }

    public void setAttr78(Object attr78) {
        this.attr78 = attr78;
    }

    public Object getAttr79() {
        return attr79;
    }

    public void setAttr79(Object attr79) {
        this.attr79 = attr79;
    }

    public Object getAttr80() {
        return attr80;
    }

    public void setAttr80(Object attr80) {
        this.attr80 = attr80;
    }

    public Object getAttr81() {
        return attr81;
    }

    public void setAttr81(Object attr81) {
        this.attr81 = attr81;
    }

    public Object getAttr82() {
        return attr82;
    }

    public void setAttr82(Object attr82) {
        this.attr82 = attr82;
    }

    public Object getAttr83() {
        return attr83;
    }

    public void setAttr83(Object attr83) {
        this.attr83 = attr83;
    }

    public Object getAttr84() {
        return attr84;
    }

    public void setAttr84(Object attr84) {
        this.attr84 = attr84;
    }

    public Object getAttr85() {
        return attr85;
    }

    public void setAttr85(Object attr85) {
        this.attr85 = attr85;
    }

    public Object getAttr86() {
        return attr86;
    }

    public void setAttr86(Object attr86) {
        this.attr86 = attr86;
    }

    public Object getAttr87() {
        return attr87;
    }

    public void setAttr87(Object attr87) {
        this.attr87 = attr87;
    }

    public Object getAttr88() {
        return attr88;
    }

    public void setAttr88(Object attr88) {
        this.attr88 = attr88;
    }

    public Object getAttr89() {
        return attr89;
    }

    public void setAttr89(Object attr89) {
        this.attr89 = attr89;
    }

    public Object getAttr90() {
        return attr90;
    }

    public void setAttr90(Object attr90) {
        this.attr90 = attr90;
    }

    public Object getAttr91() {
        return attr91;
    }

    public void setAttr91(Object attr91) {
        this.attr91 = attr91;
    }

    public Object getAttr92() {
        return attr92;
    }

    public void setAttr92(Object attr92) {
        this.attr92 = attr92;
    }

    public Object getAttr93() {
        return attr93;
    }

    public void setAttr93(Object attr93) {
        this.attr93 = attr93;
    }

    public Object getAttr94() {
        return attr94;
    }

    public void setAttr94(Object attr94) {
        this.attr94 = attr94;
    }

    public Object getAttr95() {
        return attr95;
    }

    public void setAttr95(Object attr95) {
        this.attr95 = attr95;
    }

    public Object getAttr96() {
        return attr96;
    }

    public void setAttr96(Object attr96) {
        this.attr96 = attr96;
    }

    public Object getAttr97() {
        return attr97;
    }

    public void setAttr97(Object attr97) {
        this.attr97 = attr97;
    }

    public Object getAttr98() {
        return attr98;
    }

    public void setAttr98(Object attr98) {
        this.attr98 = attr98;
    }

    public Object getAttr99() {
        return attr99;
    }

    public void setAttr99(Object attr99) {
        this.attr99 = attr99;
    }

    public Object getAttr100() {
        return attr100;
    }

    public void setAttr100(Object attr100) {
        this.attr100 = attr100;
    }

    public Object getAttr101() {
        return attr101;
    }

    public void setAttr101(Object attr101) {
        this.attr101 = attr101;
    }

    public Object getAttr102() {
        return attr102;
    }

    public void setAttr102(Object attr102) {
        this.attr102 = attr102;
    }

    public Object getAttr103() {
        return attr103;
    }

    public void setAttr103(Object attr103) {
        this.attr103 = attr103;
    }

    public Object getAttr104() {
        return attr104;
    }

    public void setAttr104(Object attr104) {
        this.attr104 = attr104;
    }

    public Object getAttr105() {
        return attr105;
    }

    public void setAttr105(Object attr105) {
        this.attr105 = attr105;
    }

    public Object getAttr106() {
        return attr106;
    }

    public void setAttr106(Object attr106) {
        this.attr106 = attr106;
    }

    public Object getAttr107() {
        return attr107;
    }

    public void setAttr107(Object attr107) {
        this.attr107 = attr107;
    }

    public Object getAttr108() {
        return attr108;
    }

    public void setAttr108(Object attr108) {
        this.attr108 = attr108;
    }

    public Object getAttr109() {
        return attr109;
    }

    public void setAttr109(Object attr109) {
        this.attr109 = attr109;
    }

    public Object getAttr110() {
        return attr110;
    }

    public void setAttr110(Object attr110) {
        this.attr110 = attr110;
    }

    public Object getAttr111() {
        return attr111;
    }

    public void setAttr111(Object attr111) {
        this.attr111 = attr111;
    }

    public Object getAttr112() {
        return attr112;
    }

    public void setAttr112(Object attr112) {
        this.attr112 = attr112;
    }

    public Object getAttr113() {
        return attr113;
    }

    public void setAttr113(Object attr113) {
        this.attr113 = attr113;
    }

    public Object getAttr114() {
        return attr114;
    }

    public void setAttr114(Object attr114) {
        this.attr114 = attr114;
    }

    public Object getAttr115() {
        return attr115;
    }

    public void setAttr115(Object attr115) {
        this.attr115 = attr115;
    }

    public Object getAttr116() {
        return attr116;
    }

    public void setAttr116(Object attr116) {
        this.attr116 = attr116;
    }

    public Object getAttr117() {
        return attr117;
    }

    public void setAttr117(Object attr117) {
        this.attr117 = attr117;
    }

    public Object getAttr118() {
        return attr118;
    }

    public void setAttr118(Object attr118) {
        this.attr118 = attr118;
    }

    public Object getAttr119() {
        return attr119;
    }

    public void setAttr119(Object attr119) {
        this.attr119 = attr119;
    }

    public Object getAttr120() {
        return attr120;
    }

    public void setAttr120(Object attr120) {
        this.attr120 = attr120;
    }
}
