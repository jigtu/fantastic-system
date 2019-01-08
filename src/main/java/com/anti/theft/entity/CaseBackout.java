package com.anti.theft.entity;

import java.util.Date;

/**
 * @author ZiQiang
 */
public class CaseBackout {
    private Integer caseId;

    private String openid;

    private String backoutPhone;

    private String backoutName;

    private String backoutIdCard;

    private String backoutPhoto;

    private String backoutFrontPhoto;

    private String backoutBackPhoto;

    private String backoutReason;

    private Date backoutTime;

    private String backoutStatus;

    private String backoutPlace;

    private String backoutPlaceLongitude;

    private String backoutPlaceLatitude;

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getBackoutPhone() {
        return backoutPhone;
    }

    public void setBackoutPhone(String backoutPhone) {
        this.backoutPhone = backoutPhone == null ? null : backoutPhone.trim();
    }

    public String getBackoutName() {
        return backoutName;
    }

    public void setBackoutName(String backoutName) {
        this.backoutName = backoutName == null ? null : backoutName.trim();
    }

    public String getBackoutIdCard() {
        return backoutIdCard;
    }

    public void setBackoutIdCard(String backoutIdCard) {
        this.backoutIdCard = backoutIdCard == null ? null : backoutIdCard.trim();
    }

    public String getBackoutPhoto() {
        return backoutPhoto;
    }

    public void setBackoutPhoto(String backoutPhoto) {
        this.backoutPhoto = backoutPhoto == null ? null : backoutPhoto.trim();
    }

    public String getBackoutFrontPhoto() {
        return backoutFrontPhoto;
    }

    public void setBackoutFrontPhoto(String backoutFrontPhoto) {
        this.backoutFrontPhoto = backoutFrontPhoto == null ? null : backoutFrontPhoto.trim();
    }

    public String getBackoutBackPhoto() {
        return backoutBackPhoto;
    }

    public void setBackoutBackPhoto(String backoutBackPhoto) {
        this.backoutBackPhoto = backoutBackPhoto == null ? null : backoutBackPhoto.trim();
    }

    public String getBackoutReason() {
        return backoutReason;
    }

    public void setBackoutReason(String backoutReason) {
        this.backoutReason = backoutReason == null ? null : backoutReason.trim();
    }

    public Date getBackoutTime() {
        return backoutTime;
    }

    public void setBackoutTime(Date backoutTime) {
        this.backoutTime = backoutTime;
    }

    public String getBackoutStatus() {
        return backoutStatus;
    }

    public void setBackoutStatus(String backoutStatus) {
        this.backoutStatus = backoutStatus == null ? null : backoutStatus.trim();
    }

    public String getBackoutPlace() {
        return backoutPlace;
    }

    public void setBackoutPlace(String backoutPlace) {
        this.backoutPlace = backoutPlace == null ? null : backoutPlace.trim();
    }

    public String getBackoutPlaceLongitude() {
        return backoutPlaceLongitude;
    }

    public void setBackoutPlaceLongitude(String backoutPlaceLongitude) {
        this.backoutPlaceLongitude = backoutPlaceLongitude == null ? null : backoutPlaceLongitude.trim();
    }

    public String getBackoutPlaceLatitude() {
        return backoutPlaceLatitude;
    }

    public void setBackoutPlaceLatitude(String backoutPlaceLatitude) {
        this.backoutPlaceLatitude = backoutPlaceLatitude == null ? null : backoutPlaceLatitude.trim();
    }
}