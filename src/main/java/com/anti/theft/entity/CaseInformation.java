package com.anti.theft.entity;

import java.util.Date;

public class CaseInformation {
    private Integer id;

    private String alarmPeopleOpenid;

    private String alarmPeopleName;

    private String alarmPeopleIdCard;

    private String alarmPeoplePhone;

    private String alarmPeoplePhoto;

    private String alarmPeopleFrontPhoto;

    private String alarmPeopleBackPhoto;

    private String ownerName;

    private String ownerCardId;

    private String lostPhoneNumber;

    private String lostPhoneNumberTwo;

    private String lostPhoneBrand;

    private String lostPhoneModel;

    private String lostPhoneColor;

    private String lostPhoneMemory;

    private String lostPhonePurchasingDate;

    private String lostPhonePrice;

    private String IMEI1;

    private String IMEI2;

    private String MEID;

    private String IMSI1;

    private String IMSI2;

    private String MAC;

    private String lostPhoneBluetoothAddress;

    private String lostPhoneSerialNumber;

    private String lostOtherFeatures;

    private Integer alarmType;

    private Date findCaseTime;

    private String findCasePlace;

    private String findCasePlaceReplenish;

    private String findCaseLongitude;

    private String findCaseLatitude;

    private Date alarmTime;

    private String alarmPlace;

    private String alarmLongitude;

    private String alarmLatitude;

    private String contactNumber;

    private Integer alarmStatus;

    private String alarmPass;

    private Integer alarmChannel;

    private Integer extractStatus;

    private String isLost;

    private String isAgree;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlarmPeopleOpenid() {
        return alarmPeopleOpenid;
    }

    public void setAlarmPeopleOpenid(String alarmPeopleOpenid) {
        this.alarmPeopleOpenid = alarmPeopleOpenid == null ? null : alarmPeopleOpenid.trim();
    }

    public String getAlarmPeopleName() {
        return alarmPeopleName;
    }

    public void setAlarmPeopleName(String alarmPeopleName) {
        this.alarmPeopleName = alarmPeopleName == null ? null : alarmPeopleName.trim();
    }

    public String getAlarmPeopleIdCard() {
        return alarmPeopleIdCard;
    }

    public void setAlarmPeopleIdCard(String alarmPeopleIdCard) {
        this.alarmPeopleIdCard = alarmPeopleIdCard == null ? null : alarmPeopleIdCard.trim();
    }

    public String getAlarmPeoplePhone() {
        return alarmPeoplePhone;
    }

    public void setAlarmPeoplePhone(String alarmPeoplePhone) {
        this.alarmPeoplePhone = alarmPeoplePhone == null ? null : alarmPeoplePhone.trim();
    }

    public String getAlarmPeoplePhoto() {
        return alarmPeoplePhoto;
    }

    public void setAlarmPeoplePhoto(String alarmPeoplePhoto) {
        this.alarmPeoplePhoto = alarmPeoplePhoto == null ? null : alarmPeoplePhoto.trim();
    }

    public String getAlarmPeopleFrontPhoto() {
        return alarmPeopleFrontPhoto;
    }

    public void setAlarmPeopleFrontPhoto(String alarmPeopleFrontPhoto) {
        this.alarmPeopleFrontPhoto = alarmPeopleFrontPhoto == null ? null : alarmPeopleFrontPhoto.trim();
    }

    public String getAlarmPeopleBackPhoto() {
        return alarmPeopleBackPhoto;
    }

    public void setAlarmPeopleBackPhoto(String alarmPeopleBackPhoto) {
        this.alarmPeopleBackPhoto = alarmPeopleBackPhoto == null ? null : alarmPeopleBackPhoto.trim();
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName == null ? null : ownerName.trim();
    }

    public String getOwnerCardId() {
        return ownerCardId;
    }

    public void setOwnerCardId(String ownerCardId) {
        this.ownerCardId = ownerCardId == null ? null : ownerCardId.trim();
    }

    public String getLostPhoneNumber() {
        return lostPhoneNumber;
    }

    public void setLostPhoneNumber(String lostPhoneNumber) {
        this.lostPhoneNumber = lostPhoneNumber == null ? null : lostPhoneNumber.trim();
    }

    public String getLostPhoneNumberTwo() {
        return lostPhoneNumberTwo;
    }

    public void setLostPhoneNumberTwo(String lostPhoneNumberTwo) {
        this.lostPhoneNumberTwo = lostPhoneNumberTwo == null ? null : lostPhoneNumberTwo.trim();
    }

    public String getLostPhoneBrand() {
        return lostPhoneBrand;
    }

    public void setLostPhoneBrand(String lostPhoneBrand) {
        this.lostPhoneBrand = lostPhoneBrand == null ? null : lostPhoneBrand.trim();
    }

    public String getLostPhoneModel() {
        return lostPhoneModel;
    }

    public void setLostPhoneModel(String lostPhoneModel) {
        this.lostPhoneModel = lostPhoneModel == null ? null : lostPhoneModel.trim();
    }

    public String getLostPhoneColor() {
        return lostPhoneColor;
    }

    public void setLostPhoneColor(String lostPhoneColor) {
        this.lostPhoneColor = lostPhoneColor == null ? null : lostPhoneColor.trim();
    }

    public String getLostPhoneMemory() {
        return lostPhoneMemory;
    }

    public void setLostPhoneMemory(String lostPhoneMemory) {
        this.lostPhoneMemory = lostPhoneMemory == null ? null : lostPhoneMemory.trim();
    }

    public String getLostPhonePurchasingDate() {
        return lostPhonePurchasingDate;
    }

    public void setLostPhonePurchasingDate(String lostPhonePurchasingDate) {
        this.lostPhonePurchasingDate = lostPhonePurchasingDate == null ? null : lostPhonePurchasingDate.trim();
    }

    public String getLostPhonePrice() {
        return lostPhonePrice;
    }

    public void setLostPhonePrice(String lostPhonePrice) {
        this.lostPhonePrice = lostPhonePrice == null ? null : lostPhonePrice.trim();
    }

    public String getIMEI1() {
        return IMEI1;
    }

    public void setIMEI1(String IMEI1) {
        this.IMEI1 = IMEI1 == null ? null : IMEI1.trim();
    }

    public String getIMEI2() {
        return IMEI2;
    }

    public void setIMEI2(String IMEI2) {
        this.IMEI2 = IMEI2 == null ? null : IMEI2.trim();
    }

    public String getMEID() {
        return MEID;
    }

    public void setMEID(String MEID) {
        this.MEID = MEID == null ? null : MEID.trim();
    }

    public String getIMSI1() {
        return IMSI1;
    }

    public void setIMSI1(String IMSI1) {
        this.IMSI1 = IMSI1 == null ? null : IMSI1.trim();
    }

    public String getIMSI2() {
        return IMSI2;
    }

    public void setIMSI2(String IMSI2) {
        this.IMSI2 = IMSI2 == null ? null : IMSI2.trim();
    }

    public String getMAC() {
        return MAC;
    }

    public void setMAC(String MAC) {
        this.MAC = MAC == null ? null : MAC.trim();
    }

    public String getLostPhoneBluetoothAddress() {
        return lostPhoneBluetoothAddress;
    }

    public void setLostPhoneBluetoothAddress(String lostPhoneBluetoothAddress) {
        this.lostPhoneBluetoothAddress = lostPhoneBluetoothAddress == null ? null : lostPhoneBluetoothAddress.trim();
    }

    public String getLostPhoneSerialNumber() {
        return lostPhoneSerialNumber;
    }

    public void setLostPhoneSerialNumber(String lostPhoneSerialNumber) {
        this.lostPhoneSerialNumber = lostPhoneSerialNumber == null ? null : lostPhoneSerialNumber.trim();
    }

    public String getLostOtherFeatures() {
        return lostOtherFeatures;
    }

    public void setLostOtherFeatures(String lostOtherFeatures) {
        this.lostOtherFeatures = lostOtherFeatures == null ? null : lostOtherFeatures.trim();
    }

    public Integer getAlarmType() {
        return alarmType;
    }

    public void setAlarmType(Integer alarmType) {
        this.alarmType = alarmType;
    }

    public Date getFindCaseTime() {
        return findCaseTime;
    }

    public void setFindCaseTime(Date findCaseTime) {
        this.findCaseTime = findCaseTime;
    }

    public String getFindCasePlace() {
        return findCasePlace;
    }

    public void setFindCasePlace(String findCasePlace) {
        this.findCasePlace = findCasePlace == null ? null : findCasePlace.trim();
    }

    public String getFindCasePlaceReplenish() {
        return findCasePlaceReplenish;
    }

    public void setFindCasePlaceReplenish(String findCasePlaceReplenish) {
        this.findCasePlaceReplenish = findCasePlaceReplenish == null ? null : findCasePlaceReplenish.trim();
    }

    public String getFindCaseLongitude() {
        return findCaseLongitude;
    }

    public void setFindCaseLongitude(String findCaseLongitude) {
        this.findCaseLongitude = findCaseLongitude == null ? null : findCaseLongitude.trim();
    }

    public String getFindCaseLatitude() {
        return findCaseLatitude;
    }

    public void setFindCaseLatitude(String findCaseLatitude) {
        this.findCaseLatitude = findCaseLatitude == null ? null : findCaseLatitude.trim();
    }

    public Date getAlarmTime() {
        return alarmTime;
    }

    public void setAlarmTime(Date alarmTime) {
        this.alarmTime = alarmTime;
    }

    public String getAlarmPlace() {
        return alarmPlace;
    }

    public void setAlarmPlace(String alarmPlace) {
        this.alarmPlace = alarmPlace == null ? null : alarmPlace.trim();
    }

    public String getAlarmLongitude() {
        return alarmLongitude;
    }

    public void setAlarmLongitude(String alarmLongitude) {
        this.alarmLongitude = alarmLongitude == null ? null : alarmLongitude.trim();
    }

    public String getAlarmLatitude() {
        return alarmLatitude;
    }

    public void setAlarmLatitude(String alarmLatitude) {
        this.alarmLatitude = alarmLatitude == null ? null : alarmLatitude.trim();
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    public Integer getAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(Integer alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public String getAlarmPass() {
        return alarmPass;
    }

    public void setAlarmPass(String alarmPass) {
        this.alarmPass = alarmPass == null ? null : alarmPass.trim();
    }

    public Integer getAlarmChannel() {
        return alarmChannel;
    }

    public void setAlarmChannel(Integer alarmChannel) {
        this.alarmChannel = alarmChannel;
    }

    public Integer getExtractStatus() {
        return extractStatus;
    }

    public void setExtractStatus(Integer extractStatus) {
        this.extractStatus = extractStatus;
    }

    public String getIsLost() {
        return isLost;
    }

    public void setIsLost(String isLost) {
        this.isLost = isLost == null ? null : isLost.trim();
    }

    public String getIsAgree() {
        return isAgree;
    }

    public void setIsAgree(String isAgree) {
        this.isAgree = isAgree == null ? null : isAgree.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}