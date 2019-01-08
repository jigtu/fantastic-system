package com.anti.theft.entity;

import java.util.Date;

public class AppealInformation {
    private Integer id;

    private String openid;

    private String name;

    private String idCard;

    private String photo;

    private String frontPhoto;

    private String backPhoto;

    private String contactNumber;

    private String appealCause;

    private String otherAppealCause;

    private Date buyingTime;

    private String imei;

    private String ecidence;

    private String cellPhoneFeatures;

    private Date appealTime;

    private String appealUsualAddr;

    private Date complainTime;

    private String appealAddr;

    private String appealLongitude;

    private String appealLatitude;

    private String buyingAddr;

    private String appealState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getFrontPhoto() {
        return frontPhoto;
    }

    public void setFrontPhoto(String frontPhoto) {
        this.frontPhoto = frontPhoto == null ? null : frontPhoto.trim();
    }

    public String getBackPhoto() {
        return backPhoto;
    }

    public void setBackPhoto(String backPhoto) {
        this.backPhoto = backPhoto == null ? null : backPhoto.trim();
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    public String getAppealCause() {
        return appealCause;
    }

    public void setAppealCause(String appealCause) {
        this.appealCause = appealCause == null ? null : appealCause.trim();
    }

    public String getOtherAppealCause() {
        return otherAppealCause;
    }

    public void setOtherAppealCause(String otherAppealCause) {
        this.otherAppealCause = otherAppealCause == null ? null : otherAppealCause.trim();
    }

    public Date getBuyingTime() {
        return buyingTime;
    }

    public void setBuyingTime(Date buyingTime) {
        this.buyingTime = buyingTime;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public String getEcidence() {
        return ecidence;
    }

    public void setEcidence(String ecidence) {
        this.ecidence = ecidence == null ? null : ecidence.trim();
    }

    public String getCellPhoneFeatures() {
        return cellPhoneFeatures;
    }

    public void setCellPhoneFeatures(String cellPhoneFeatures) {
        this.cellPhoneFeatures = cellPhoneFeatures == null ? null : cellPhoneFeatures.trim();
    }

    public Date getAppealTime() {
        return appealTime;
    }

    public void setAppealTime(Date appealTime) {
        this.appealTime = appealTime;
    }

    public String getAppealUsualAddr() {
        return appealUsualAddr;
    }

    public void setAppealUsualAddr(String appealUsualAddr) {
        this.appealUsualAddr = appealUsualAddr == null ? null : appealUsualAddr.trim();
    }

    public Date getComplainTime() {
        return complainTime;
    }

    public void setComplainTime(Date complainTime) {
        this.complainTime = complainTime;
    }

    public String getAppealAddr() {
        return appealAddr;
    }

    public void setAppealAddr(String appealAddr) {
        this.appealAddr = appealAddr == null ? null : appealAddr.trim();
    }

    public String getAppealLongitude() {
        return appealLongitude;
    }

    public void setAppealLongitude(String appealLongitude) {
        this.appealLongitude = appealLongitude == null ? null : appealLongitude.trim();
    }

    public String getAppealLatitude() {
        return appealLatitude;
    }

    public void setAppealLatitude(String appealLatitude) {
        this.appealLatitude = appealLatitude == null ? null : appealLatitude.trim();
    }

    public String getBuyingAddr() {
        return buyingAddr;
    }

    public void setBuyingAddr(String buyingAddr) {
        this.buyingAddr = buyingAddr == null ? null : buyingAddr.trim();
    }

    public String getAppealState() {
        return appealState;
    }

    public void setAppealState(String appealState) {
        this.appealState = appealState == null ? null : appealState.trim();
    }
}