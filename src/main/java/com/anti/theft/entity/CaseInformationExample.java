package com.anti.theft.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaseInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaseInformationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleOpenidIsNull() {
            addCriterion("alarmPeopleOpenid is null");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleOpenidIsNotNull() {
            addCriterion("alarmPeopleOpenid is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleOpenidEqualTo(String value) {
            addCriterion("alarmPeopleOpenid =", value, "alarmPeopleOpenid");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleOpenidNotEqualTo(String value) {
            addCriterion("alarmPeopleOpenid <>", value, "alarmPeopleOpenid");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleOpenidGreaterThan(String value) {
            addCriterion("alarmPeopleOpenid >", value, "alarmPeopleOpenid");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("alarmPeopleOpenid >=", value, "alarmPeopleOpenid");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleOpenidLessThan(String value) {
            addCriterion("alarmPeopleOpenid <", value, "alarmPeopleOpenid");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleOpenidLessThanOrEqualTo(String value) {
            addCriterion("alarmPeopleOpenid <=", value, "alarmPeopleOpenid");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleOpenidLike(String value) {
            addCriterion("alarmPeopleOpenid like", value, "alarmPeopleOpenid");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleOpenidNotLike(String value) {
            addCriterion("alarmPeopleOpenid not like", value, "alarmPeopleOpenid");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleOpenidIn(List<String> values) {
            addCriterion("alarmPeopleOpenid in", values, "alarmPeopleOpenid");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleOpenidNotIn(List<String> values) {
            addCriterion("alarmPeopleOpenid not in", values, "alarmPeopleOpenid");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleOpenidBetween(String value1, String value2) {
            addCriterion("alarmPeopleOpenid between", value1, value2, "alarmPeopleOpenid");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleOpenidNotBetween(String value1, String value2) {
            addCriterion("alarmPeopleOpenid not between", value1, value2, "alarmPeopleOpenid");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleNameIsNull() {
            addCriterion("alarmPeopleName is null");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleNameIsNotNull() {
            addCriterion("alarmPeopleName is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleNameEqualTo(String value) {
            addCriterion("alarmPeopleName =", value, "alarmPeopleName");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleNameNotEqualTo(String value) {
            addCriterion("alarmPeopleName <>", value, "alarmPeopleName");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleNameGreaterThan(String value) {
            addCriterion("alarmPeopleName >", value, "alarmPeopleName");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleNameGreaterThanOrEqualTo(String value) {
            addCriterion("alarmPeopleName >=", value, "alarmPeopleName");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleNameLessThan(String value) {
            addCriterion("alarmPeopleName <", value, "alarmPeopleName");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleNameLessThanOrEqualTo(String value) {
            addCriterion("alarmPeopleName <=", value, "alarmPeopleName");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleNameLike(String value) {
            addCriterion("alarmPeopleName like", value, "alarmPeopleName");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleNameNotLike(String value) {
            addCriterion("alarmPeopleName not like", value, "alarmPeopleName");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleNameIn(List<String> values) {
            addCriterion("alarmPeopleName in", values, "alarmPeopleName");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleNameNotIn(List<String> values) {
            addCriterion("alarmPeopleName not in", values, "alarmPeopleName");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleNameBetween(String value1, String value2) {
            addCriterion("alarmPeopleName between", value1, value2, "alarmPeopleName");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleNameNotBetween(String value1, String value2) {
            addCriterion("alarmPeopleName not between", value1, value2, "alarmPeopleName");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleIdCardIsNull() {
            addCriterion("alarmPeopleIdCard is null");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleIdCardIsNotNull() {
            addCriterion("alarmPeopleIdCard is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleIdCardEqualTo(String value) {
            addCriterion("alarmPeopleIdCard =", value, "alarmPeopleIdCard");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleIdCardNotEqualTo(String value) {
            addCriterion("alarmPeopleIdCard <>", value, "alarmPeopleIdCard");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleIdCardGreaterThan(String value) {
            addCriterion("alarmPeopleIdCard >", value, "alarmPeopleIdCard");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("alarmPeopleIdCard >=", value, "alarmPeopleIdCard");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleIdCardLessThan(String value) {
            addCriterion("alarmPeopleIdCard <", value, "alarmPeopleIdCard");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleIdCardLessThanOrEqualTo(String value) {
            addCriterion("alarmPeopleIdCard <=", value, "alarmPeopleIdCard");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleIdCardLike(String value) {
            addCriterion("alarmPeopleIdCard like", value, "alarmPeopleIdCard");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleIdCardNotLike(String value) {
            addCriterion("alarmPeopleIdCard not like", value, "alarmPeopleIdCard");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleIdCardIn(List<String> values) {
            addCriterion("alarmPeopleIdCard in", values, "alarmPeopleIdCard");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleIdCardNotIn(List<String> values) {
            addCriterion("alarmPeopleIdCard not in", values, "alarmPeopleIdCard");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleIdCardBetween(String value1, String value2) {
            addCriterion("alarmPeopleIdCard between", value1, value2, "alarmPeopleIdCard");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleIdCardNotBetween(String value1, String value2) {
            addCriterion("alarmPeopleIdCard not between", value1, value2, "alarmPeopleIdCard");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhoneIsNull() {
            addCriterion("alarmPeoplePhone is null");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhoneIsNotNull() {
            addCriterion("alarmPeoplePhone is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhoneEqualTo(String value) {
            addCriterion("alarmPeoplePhone =", value, "alarmPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhoneNotEqualTo(String value) {
            addCriterion("alarmPeoplePhone <>", value, "alarmPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhoneGreaterThan(String value) {
            addCriterion("alarmPeoplePhone >", value, "alarmPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("alarmPeoplePhone >=", value, "alarmPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhoneLessThan(String value) {
            addCriterion("alarmPeoplePhone <", value, "alarmPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhoneLessThanOrEqualTo(String value) {
            addCriterion("alarmPeoplePhone <=", value, "alarmPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhoneLike(String value) {
            addCriterion("alarmPeoplePhone like", value, "alarmPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhoneNotLike(String value) {
            addCriterion("alarmPeoplePhone not like", value, "alarmPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhoneIn(List<String> values) {
            addCriterion("alarmPeoplePhone in", values, "alarmPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhoneNotIn(List<String> values) {
            addCriterion("alarmPeoplePhone not in", values, "alarmPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhoneBetween(String value1, String value2) {
            addCriterion("alarmPeoplePhone between", value1, value2, "alarmPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhoneNotBetween(String value1, String value2) {
            addCriterion("alarmPeoplePhone not between", value1, value2, "alarmPeoplePhone");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhotoIsNull() {
            addCriterion("alarmPeoplePhoto is null");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhotoIsNotNull() {
            addCriterion("alarmPeoplePhoto is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhotoEqualTo(String value) {
            addCriterion("alarmPeoplePhoto =", value, "alarmPeoplePhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhotoNotEqualTo(String value) {
            addCriterion("alarmPeoplePhoto <>", value, "alarmPeoplePhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhotoGreaterThan(String value) {
            addCriterion("alarmPeoplePhoto >", value, "alarmPeoplePhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("alarmPeoplePhoto >=", value, "alarmPeoplePhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhotoLessThan(String value) {
            addCriterion("alarmPeoplePhoto <", value, "alarmPeoplePhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhotoLessThanOrEqualTo(String value) {
            addCriterion("alarmPeoplePhoto <=", value, "alarmPeoplePhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhotoLike(String value) {
            addCriterion("alarmPeoplePhoto like", value, "alarmPeoplePhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhotoNotLike(String value) {
            addCriterion("alarmPeoplePhoto not like", value, "alarmPeoplePhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhotoIn(List<String> values) {
            addCriterion("alarmPeoplePhoto in", values, "alarmPeoplePhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhotoNotIn(List<String> values) {
            addCriterion("alarmPeoplePhoto not in", values, "alarmPeoplePhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhotoBetween(String value1, String value2) {
            addCriterion("alarmPeoplePhoto between", value1, value2, "alarmPeoplePhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeoplePhotoNotBetween(String value1, String value2) {
            addCriterion("alarmPeoplePhoto not between", value1, value2, "alarmPeoplePhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleFrontPhotoIsNull() {
            addCriterion("alarmPeopleFrontPhoto is null");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleFrontPhotoIsNotNull() {
            addCriterion("alarmPeopleFrontPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleFrontPhotoEqualTo(String value) {
            addCriterion("alarmPeopleFrontPhoto =", value, "alarmPeopleFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleFrontPhotoNotEqualTo(String value) {
            addCriterion("alarmPeopleFrontPhoto <>", value, "alarmPeopleFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleFrontPhotoGreaterThan(String value) {
            addCriterion("alarmPeopleFrontPhoto >", value, "alarmPeopleFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleFrontPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("alarmPeopleFrontPhoto >=", value, "alarmPeopleFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleFrontPhotoLessThan(String value) {
            addCriterion("alarmPeopleFrontPhoto <", value, "alarmPeopleFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleFrontPhotoLessThanOrEqualTo(String value) {
            addCriterion("alarmPeopleFrontPhoto <=", value, "alarmPeopleFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleFrontPhotoLike(String value) {
            addCriterion("alarmPeopleFrontPhoto like", value, "alarmPeopleFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleFrontPhotoNotLike(String value) {
            addCriterion("alarmPeopleFrontPhoto not like", value, "alarmPeopleFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleFrontPhotoIn(List<String> values) {
            addCriterion("alarmPeopleFrontPhoto in", values, "alarmPeopleFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleFrontPhotoNotIn(List<String> values) {
            addCriterion("alarmPeopleFrontPhoto not in", values, "alarmPeopleFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleFrontPhotoBetween(String value1, String value2) {
            addCriterion("alarmPeopleFrontPhoto between", value1, value2, "alarmPeopleFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleFrontPhotoNotBetween(String value1, String value2) {
            addCriterion("alarmPeopleFrontPhoto not between", value1, value2, "alarmPeopleFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleBackPhotoIsNull() {
            addCriterion("alarmPeopleBackPhoto is null");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleBackPhotoIsNotNull() {
            addCriterion("alarmPeopleBackPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleBackPhotoEqualTo(String value) {
            addCriterion("alarmPeopleBackPhoto =", value, "alarmPeopleBackPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleBackPhotoNotEqualTo(String value) {
            addCriterion("alarmPeopleBackPhoto <>", value, "alarmPeopleBackPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleBackPhotoGreaterThan(String value) {
            addCriterion("alarmPeopleBackPhoto >", value, "alarmPeopleBackPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleBackPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("alarmPeopleBackPhoto >=", value, "alarmPeopleBackPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleBackPhotoLessThan(String value) {
            addCriterion("alarmPeopleBackPhoto <", value, "alarmPeopleBackPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleBackPhotoLessThanOrEqualTo(String value) {
            addCriterion("alarmPeopleBackPhoto <=", value, "alarmPeopleBackPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleBackPhotoLike(String value) {
            addCriterion("alarmPeopleBackPhoto like", value, "alarmPeopleBackPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleBackPhotoNotLike(String value) {
            addCriterion("alarmPeopleBackPhoto not like", value, "alarmPeopleBackPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleBackPhotoIn(List<String> values) {
            addCriterion("alarmPeopleBackPhoto in", values, "alarmPeopleBackPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleBackPhotoNotIn(List<String> values) {
            addCriterion("alarmPeopleBackPhoto not in", values, "alarmPeopleBackPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleBackPhotoBetween(String value1, String value2) {
            addCriterion("alarmPeopleBackPhoto between", value1, value2, "alarmPeopleBackPhoto");
            return (Criteria) this;
        }

        public Criteria andAlarmPeopleBackPhotoNotBetween(String value1, String value2) {
            addCriterion("alarmPeopleBackPhoto not between", value1, value2, "alarmPeopleBackPhoto");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNull() {
            addCriterion("ownerName is null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIsNotNull() {
            addCriterion("ownerName is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerNameEqualTo(String value) {
            addCriterion("ownerName =", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotEqualTo(String value) {
            addCriterion("ownerName <>", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThan(String value) {
            addCriterion("ownerName >", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameGreaterThanOrEqualTo(String value) {
            addCriterion("ownerName >=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThan(String value) {
            addCriterion("ownerName <", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLessThanOrEqualTo(String value) {
            addCriterion("ownerName <=", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameLike(String value) {
            addCriterion("ownerName like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotLike(String value) {
            addCriterion("ownerName not like", value, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameIn(List<String> values) {
            addCriterion("ownerName in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotIn(List<String> values) {
            addCriterion("ownerName not in", values, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameBetween(String value1, String value2) {
            addCriterion("ownerName between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerNameNotBetween(String value1, String value2) {
            addCriterion("ownerName not between", value1, value2, "ownerName");
            return (Criteria) this;
        }

        public Criteria andOwnerCardIdIsNull() {
            addCriterion("ownerCardId is null");
            return (Criteria) this;
        }

        public Criteria andOwnerCardIdIsNotNull() {
            addCriterion("ownerCardId is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerCardIdEqualTo(String value) {
            addCriterion("ownerCardId =", value, "ownerCardId");
            return (Criteria) this;
        }

        public Criteria andOwnerCardIdNotEqualTo(String value) {
            addCriterion("ownerCardId <>", value, "ownerCardId");
            return (Criteria) this;
        }

        public Criteria andOwnerCardIdGreaterThan(String value) {
            addCriterion("ownerCardId >", value, "ownerCardId");
            return (Criteria) this;
        }

        public Criteria andOwnerCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("ownerCardId >=", value, "ownerCardId");
            return (Criteria) this;
        }

        public Criteria andOwnerCardIdLessThan(String value) {
            addCriterion("ownerCardId <", value, "ownerCardId");
            return (Criteria) this;
        }

        public Criteria andOwnerCardIdLessThanOrEqualTo(String value) {
            addCriterion("ownerCardId <=", value, "ownerCardId");
            return (Criteria) this;
        }

        public Criteria andOwnerCardIdLike(String value) {
            addCriterion("ownerCardId like", value, "ownerCardId");
            return (Criteria) this;
        }

        public Criteria andOwnerCardIdNotLike(String value) {
            addCriterion("ownerCardId not like", value, "ownerCardId");
            return (Criteria) this;
        }

        public Criteria andOwnerCardIdIn(List<String> values) {
            addCriterion("ownerCardId in", values, "ownerCardId");
            return (Criteria) this;
        }

        public Criteria andOwnerCardIdNotIn(List<String> values) {
            addCriterion("ownerCardId not in", values, "ownerCardId");
            return (Criteria) this;
        }

        public Criteria andOwnerCardIdBetween(String value1, String value2) {
            addCriterion("ownerCardId between", value1, value2, "ownerCardId");
            return (Criteria) this;
        }

        public Criteria andOwnerCardIdNotBetween(String value1, String value2) {
            addCriterion("ownerCardId not between", value1, value2, "ownerCardId");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberIsNull() {
            addCriterion("lostPhoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberIsNotNull() {
            addCriterion("lostPhoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberEqualTo(String value) {
            addCriterion("lostPhoneNumber =", value, "lostPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberNotEqualTo(String value) {
            addCriterion("lostPhoneNumber <>", value, "lostPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberGreaterThan(String value) {
            addCriterion("lostPhoneNumber >", value, "lostPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("lostPhoneNumber >=", value, "lostPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberLessThan(String value) {
            addCriterion("lostPhoneNumber <", value, "lostPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("lostPhoneNumber <=", value, "lostPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberLike(String value) {
            addCriterion("lostPhoneNumber like", value, "lostPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberNotLike(String value) {
            addCriterion("lostPhoneNumber not like", value, "lostPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberIn(List<String> values) {
            addCriterion("lostPhoneNumber in", values, "lostPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberNotIn(List<String> values) {
            addCriterion("lostPhoneNumber not in", values, "lostPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberBetween(String value1, String value2) {
            addCriterion("lostPhoneNumber between", value1, value2, "lostPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("lostPhoneNumber not between", value1, value2, "lostPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberTwoIsNull() {
            addCriterion("lostPhoneNumberTwo is null");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberTwoIsNotNull() {
            addCriterion("lostPhoneNumberTwo is not null");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberTwoEqualTo(String value) {
            addCriterion("lostPhoneNumberTwo =", value, "lostPhoneNumberTwo");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberTwoNotEqualTo(String value) {
            addCriterion("lostPhoneNumberTwo <>", value, "lostPhoneNumberTwo");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberTwoGreaterThan(String value) {
            addCriterion("lostPhoneNumberTwo >", value, "lostPhoneNumberTwo");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberTwoGreaterThanOrEqualTo(String value) {
            addCriterion("lostPhoneNumberTwo >=", value, "lostPhoneNumberTwo");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberTwoLessThan(String value) {
            addCriterion("lostPhoneNumberTwo <", value, "lostPhoneNumberTwo");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberTwoLessThanOrEqualTo(String value) {
            addCriterion("lostPhoneNumberTwo <=", value, "lostPhoneNumberTwo");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberTwoLike(String value) {
            addCriterion("lostPhoneNumberTwo like", value, "lostPhoneNumberTwo");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberTwoNotLike(String value) {
            addCriterion("lostPhoneNumberTwo not like", value, "lostPhoneNumberTwo");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberTwoIn(List<String> values) {
            addCriterion("lostPhoneNumberTwo in", values, "lostPhoneNumberTwo");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberTwoNotIn(List<String> values) {
            addCriterion("lostPhoneNumberTwo not in", values, "lostPhoneNumberTwo");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberTwoBetween(String value1, String value2) {
            addCriterion("lostPhoneNumberTwo between", value1, value2, "lostPhoneNumberTwo");
            return (Criteria) this;
        }

        public Criteria andLostPhoneNumberTwoNotBetween(String value1, String value2) {
            addCriterion("lostPhoneNumberTwo not between", value1, value2, "lostPhoneNumberTwo");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBrandIsNull() {
            addCriterion("lostPhoneBrand is null");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBrandIsNotNull() {
            addCriterion("lostPhoneBrand is not null");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBrandEqualTo(String value) {
            addCriterion("lostPhoneBrand =", value, "lostPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBrandNotEqualTo(String value) {
            addCriterion("lostPhoneBrand <>", value, "lostPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBrandGreaterThan(String value) {
            addCriterion("lostPhoneBrand >", value, "lostPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBrandGreaterThanOrEqualTo(String value) {
            addCriterion("lostPhoneBrand >=", value, "lostPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBrandLessThan(String value) {
            addCriterion("lostPhoneBrand <", value, "lostPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBrandLessThanOrEqualTo(String value) {
            addCriterion("lostPhoneBrand <=", value, "lostPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBrandLike(String value) {
            addCriterion("lostPhoneBrand like", value, "lostPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBrandNotLike(String value) {
            addCriterion("lostPhoneBrand not like", value, "lostPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBrandIn(List<String> values) {
            addCriterion("lostPhoneBrand in", values, "lostPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBrandNotIn(List<String> values) {
            addCriterion("lostPhoneBrand not in", values, "lostPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBrandBetween(String value1, String value2) {
            addCriterion("lostPhoneBrand between", value1, value2, "lostPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBrandNotBetween(String value1, String value2) {
            addCriterion("lostPhoneBrand not between", value1, value2, "lostPhoneBrand");
            return (Criteria) this;
        }

        public Criteria andLostPhoneModelIsNull() {
            addCriterion("lostPhoneModel is null");
            return (Criteria) this;
        }

        public Criteria andLostPhoneModelIsNotNull() {
            addCriterion("lostPhoneModel is not null");
            return (Criteria) this;
        }

        public Criteria andLostPhoneModelEqualTo(String value) {
            addCriterion("lostPhoneModel =", value, "lostPhoneModel");
            return (Criteria) this;
        }

        public Criteria andLostPhoneModelNotEqualTo(String value) {
            addCriterion("lostPhoneModel <>", value, "lostPhoneModel");
            return (Criteria) this;
        }

        public Criteria andLostPhoneModelGreaterThan(String value) {
            addCriterion("lostPhoneModel >", value, "lostPhoneModel");
            return (Criteria) this;
        }

        public Criteria andLostPhoneModelGreaterThanOrEqualTo(String value) {
            addCriterion("lostPhoneModel >=", value, "lostPhoneModel");
            return (Criteria) this;
        }

        public Criteria andLostPhoneModelLessThan(String value) {
            addCriterion("lostPhoneModel <", value, "lostPhoneModel");
            return (Criteria) this;
        }

        public Criteria andLostPhoneModelLessThanOrEqualTo(String value) {
            addCriterion("lostPhoneModel <=", value, "lostPhoneModel");
            return (Criteria) this;
        }

        public Criteria andLostPhoneModelLike(String value) {
            addCriterion("lostPhoneModel like", value, "lostPhoneModel");
            return (Criteria) this;
        }

        public Criteria andLostPhoneModelNotLike(String value) {
            addCriterion("lostPhoneModel not like", value, "lostPhoneModel");
            return (Criteria) this;
        }

        public Criteria andLostPhoneModelIn(List<String> values) {
            addCriterion("lostPhoneModel in", values, "lostPhoneModel");
            return (Criteria) this;
        }

        public Criteria andLostPhoneModelNotIn(List<String> values) {
            addCriterion("lostPhoneModel not in", values, "lostPhoneModel");
            return (Criteria) this;
        }

        public Criteria andLostPhoneModelBetween(String value1, String value2) {
            addCriterion("lostPhoneModel between", value1, value2, "lostPhoneModel");
            return (Criteria) this;
        }

        public Criteria andLostPhoneModelNotBetween(String value1, String value2) {
            addCriterion("lostPhoneModel not between", value1, value2, "lostPhoneModel");
            return (Criteria) this;
        }

        public Criteria andLostPhoneColorIsNull() {
            addCriterion("lostPhoneColor is null");
            return (Criteria) this;
        }

        public Criteria andLostPhoneColorIsNotNull() {
            addCriterion("lostPhoneColor is not null");
            return (Criteria) this;
        }

        public Criteria andLostPhoneColorEqualTo(String value) {
            addCriterion("lostPhoneColor =", value, "lostPhoneColor");
            return (Criteria) this;
        }

        public Criteria andLostPhoneColorNotEqualTo(String value) {
            addCriterion("lostPhoneColor <>", value, "lostPhoneColor");
            return (Criteria) this;
        }

        public Criteria andLostPhoneColorGreaterThan(String value) {
            addCriterion("lostPhoneColor >", value, "lostPhoneColor");
            return (Criteria) this;
        }

        public Criteria andLostPhoneColorGreaterThanOrEqualTo(String value) {
            addCriterion("lostPhoneColor >=", value, "lostPhoneColor");
            return (Criteria) this;
        }

        public Criteria andLostPhoneColorLessThan(String value) {
            addCriterion("lostPhoneColor <", value, "lostPhoneColor");
            return (Criteria) this;
        }

        public Criteria andLostPhoneColorLessThanOrEqualTo(String value) {
            addCriterion("lostPhoneColor <=", value, "lostPhoneColor");
            return (Criteria) this;
        }

        public Criteria andLostPhoneColorLike(String value) {
            addCriterion("lostPhoneColor like", value, "lostPhoneColor");
            return (Criteria) this;
        }

        public Criteria andLostPhoneColorNotLike(String value) {
            addCriterion("lostPhoneColor not like", value, "lostPhoneColor");
            return (Criteria) this;
        }

        public Criteria andLostPhoneColorIn(List<String> values) {
            addCriterion("lostPhoneColor in", values, "lostPhoneColor");
            return (Criteria) this;
        }

        public Criteria andLostPhoneColorNotIn(List<String> values) {
            addCriterion("lostPhoneColor not in", values, "lostPhoneColor");
            return (Criteria) this;
        }

        public Criteria andLostPhoneColorBetween(String value1, String value2) {
            addCriterion("lostPhoneColor between", value1, value2, "lostPhoneColor");
            return (Criteria) this;
        }

        public Criteria andLostPhoneColorNotBetween(String value1, String value2) {
            addCriterion("lostPhoneColor not between", value1, value2, "lostPhoneColor");
            return (Criteria) this;
        }

        public Criteria andLostPhoneMemoryIsNull() {
            addCriterion("lostPhoneMemory is null");
            return (Criteria) this;
        }

        public Criteria andLostPhoneMemoryIsNotNull() {
            addCriterion("lostPhoneMemory is not null");
            return (Criteria) this;
        }

        public Criteria andLostPhoneMemoryEqualTo(String value) {
            addCriterion("lostPhoneMemory =", value, "lostPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andLostPhoneMemoryNotEqualTo(String value) {
            addCriterion("lostPhoneMemory <>", value, "lostPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andLostPhoneMemoryGreaterThan(String value) {
            addCriterion("lostPhoneMemory >", value, "lostPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andLostPhoneMemoryGreaterThanOrEqualTo(String value) {
            addCriterion("lostPhoneMemory >=", value, "lostPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andLostPhoneMemoryLessThan(String value) {
            addCriterion("lostPhoneMemory <", value, "lostPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andLostPhoneMemoryLessThanOrEqualTo(String value) {
            addCriterion("lostPhoneMemory <=", value, "lostPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andLostPhoneMemoryLike(String value) {
            addCriterion("lostPhoneMemory like", value, "lostPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andLostPhoneMemoryNotLike(String value) {
            addCriterion("lostPhoneMemory not like", value, "lostPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andLostPhoneMemoryIn(List<String> values) {
            addCriterion("lostPhoneMemory in", values, "lostPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andLostPhoneMemoryNotIn(List<String> values) {
            addCriterion("lostPhoneMemory not in", values, "lostPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andLostPhoneMemoryBetween(String value1, String value2) {
            addCriterion("lostPhoneMemory between", value1, value2, "lostPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andLostPhoneMemoryNotBetween(String value1, String value2) {
            addCriterion("lostPhoneMemory not between", value1, value2, "lostPhoneMemory");
            return (Criteria) this;
        }

        public Criteria andLostPhonePurchasingDateIsNull() {
            addCriterion("lostPhonePurchasingDate is null");
            return (Criteria) this;
        }

        public Criteria andLostPhonePurchasingDateIsNotNull() {
            addCriterion("lostPhonePurchasingDate is not null");
            return (Criteria) this;
        }

        public Criteria andLostPhonePurchasingDateEqualTo(String value) {
            addCriterion("lostPhonePurchasingDate =", value, "lostPhonePurchasingDate");
            return (Criteria) this;
        }

        public Criteria andLostPhonePurchasingDateNotEqualTo(String value) {
            addCriterion("lostPhonePurchasingDate <>", value, "lostPhonePurchasingDate");
            return (Criteria) this;
        }

        public Criteria andLostPhonePurchasingDateGreaterThan(String value) {
            addCriterion("lostPhonePurchasingDate >", value, "lostPhonePurchasingDate");
            return (Criteria) this;
        }

        public Criteria andLostPhonePurchasingDateGreaterThanOrEqualTo(String value) {
            addCriterion("lostPhonePurchasingDate >=", value, "lostPhonePurchasingDate");
            return (Criteria) this;
        }

        public Criteria andLostPhonePurchasingDateLessThan(String value) {
            addCriterion("lostPhonePurchasingDate <", value, "lostPhonePurchasingDate");
            return (Criteria) this;
        }

        public Criteria andLostPhonePurchasingDateLessThanOrEqualTo(String value) {
            addCriterion("lostPhonePurchasingDate <=", value, "lostPhonePurchasingDate");
            return (Criteria) this;
        }

        public Criteria andLostPhonePurchasingDateLike(String value) {
            addCriterion("lostPhonePurchasingDate like", value, "lostPhonePurchasingDate");
            return (Criteria) this;
        }

        public Criteria andLostPhonePurchasingDateNotLike(String value) {
            addCriterion("lostPhonePurchasingDate not like", value, "lostPhonePurchasingDate");
            return (Criteria) this;
        }

        public Criteria andLostPhonePurchasingDateIn(List<String> values) {
            addCriterion("lostPhonePurchasingDate in", values, "lostPhonePurchasingDate");
            return (Criteria) this;
        }

        public Criteria andLostPhonePurchasingDateNotIn(List<String> values) {
            addCriterion("lostPhonePurchasingDate not in", values, "lostPhonePurchasingDate");
            return (Criteria) this;
        }

        public Criteria andLostPhonePurchasingDateBetween(String value1, String value2) {
            addCriterion("lostPhonePurchasingDate between", value1, value2, "lostPhonePurchasingDate");
            return (Criteria) this;
        }

        public Criteria andLostPhonePurchasingDateNotBetween(String value1, String value2) {
            addCriterion("lostPhonePurchasingDate not between", value1, value2, "lostPhonePurchasingDate");
            return (Criteria) this;
        }

        public Criteria andLostPhonePriceIsNull() {
            addCriterion("lostPhonePrice is null");
            return (Criteria) this;
        }

        public Criteria andLostPhonePriceIsNotNull() {
            addCriterion("lostPhonePrice is not null");
            return (Criteria) this;
        }

        public Criteria andLostPhonePriceEqualTo(String value) {
            addCriterion("lostPhonePrice =", value, "lostPhonePrice");
            return (Criteria) this;
        }

        public Criteria andLostPhonePriceNotEqualTo(String value) {
            addCriterion("lostPhonePrice <>", value, "lostPhonePrice");
            return (Criteria) this;
        }

        public Criteria andLostPhonePriceGreaterThan(String value) {
            addCriterion("lostPhonePrice >", value, "lostPhonePrice");
            return (Criteria) this;
        }

        public Criteria andLostPhonePriceGreaterThanOrEqualTo(String value) {
            addCriterion("lostPhonePrice >=", value, "lostPhonePrice");
            return (Criteria) this;
        }

        public Criteria andLostPhonePriceLessThan(String value) {
            addCriterion("lostPhonePrice <", value, "lostPhonePrice");
            return (Criteria) this;
        }

        public Criteria andLostPhonePriceLessThanOrEqualTo(String value) {
            addCriterion("lostPhonePrice <=", value, "lostPhonePrice");
            return (Criteria) this;
        }

        public Criteria andLostPhonePriceLike(String value) {
            addCriterion("lostPhonePrice like", value, "lostPhonePrice");
            return (Criteria) this;
        }

        public Criteria andLostPhonePriceNotLike(String value) {
            addCriterion("lostPhonePrice not like", value, "lostPhonePrice");
            return (Criteria) this;
        }

        public Criteria andLostPhonePriceIn(List<String> values) {
            addCriterion("lostPhonePrice in", values, "lostPhonePrice");
            return (Criteria) this;
        }

        public Criteria andLostPhonePriceNotIn(List<String> values) {
            addCriterion("lostPhonePrice not in", values, "lostPhonePrice");
            return (Criteria) this;
        }

        public Criteria andLostPhonePriceBetween(String value1, String value2) {
            addCriterion("lostPhonePrice between", value1, value2, "lostPhonePrice");
            return (Criteria) this;
        }

        public Criteria andLostPhonePriceNotBetween(String value1, String value2) {
            addCriterion("lostPhonePrice not between", value1, value2, "lostPhonePrice");
            return (Criteria) this;
        }

        public Criteria andIMEI1IsNull() {
            addCriterion("IMEI1 is null");
            return (Criteria) this;
        }

        public Criteria andIMEI1IsNotNull() {
            addCriterion("IMEI1 is not null");
            return (Criteria) this;
        }

        public Criteria andIMEI1EqualTo(String value) {
            addCriterion("IMEI1 =", value, "IMEI1");
            return (Criteria) this;
        }

        public Criteria andIMEI1NotEqualTo(String value) {
            addCriterion("IMEI1 <>", value, "IMEI1");
            return (Criteria) this;
        }

        public Criteria andIMEI1GreaterThan(String value) {
            addCriterion("IMEI1 >", value, "IMEI1");
            return (Criteria) this;
        }

        public Criteria andIMEI1GreaterThanOrEqualTo(String value) {
            addCriterion("IMEI1 >=", value, "IMEI1");
            return (Criteria) this;
        }

        public Criteria andIMEI1LessThan(String value) {
            addCriterion("IMEI1 <", value, "IMEI1");
            return (Criteria) this;
        }

        public Criteria andIMEI1LessThanOrEqualTo(String value) {
            addCriterion("IMEI1 <=", value, "IMEI1");
            return (Criteria) this;
        }

        public Criteria andIMEI1Like(String value) {
            addCriterion("IMEI1 like", value, "IMEI1");
            return (Criteria) this;
        }

        public Criteria andIMEI1NotLike(String value) {
            addCriterion("IMEI1 not like", value, "IMEI1");
            return (Criteria) this;
        }

        public Criteria andIMEI1In(List<String> values) {
            addCriterion("IMEI1 in", values, "IMEI1");
            return (Criteria) this;
        }

        public Criteria andIMEI1NotIn(List<String> values) {
            addCriterion("IMEI1 not in", values, "IMEI1");
            return (Criteria) this;
        }

        public Criteria andIMEI1Between(String value1, String value2) {
            addCriterion("IMEI1 between", value1, value2, "IMEI1");
            return (Criteria) this;
        }

        public Criteria andIMEI1NotBetween(String value1, String value2) {
            addCriterion("IMEI1 not between", value1, value2, "IMEI1");
            return (Criteria) this;
        }

        public Criteria andIMEI2IsNull() {
            addCriterion("IMEI2 is null");
            return (Criteria) this;
        }

        public Criteria andIMEI2IsNotNull() {
            addCriterion("IMEI2 is not null");
            return (Criteria) this;
        }

        public Criteria andIMEI2EqualTo(String value) {
            addCriterion("IMEI2 =", value, "IMEI2");
            return (Criteria) this;
        }

        public Criteria andIMEI2NotEqualTo(String value) {
            addCriterion("IMEI2 <>", value, "IMEI2");
            return (Criteria) this;
        }

        public Criteria andIMEI2GreaterThan(String value) {
            addCriterion("IMEI2 >", value, "IMEI2");
            return (Criteria) this;
        }

        public Criteria andIMEI2GreaterThanOrEqualTo(String value) {
            addCriterion("IMEI2 >=", value, "IMEI2");
            return (Criteria) this;
        }

        public Criteria andIMEI2LessThan(String value) {
            addCriterion("IMEI2 <", value, "IMEI2");
            return (Criteria) this;
        }

        public Criteria andIMEI2LessThanOrEqualTo(String value) {
            addCriterion("IMEI2 <=", value, "IMEI2");
            return (Criteria) this;
        }

        public Criteria andIMEI2Like(String value) {
            addCriterion("IMEI2 like", value, "IMEI2");
            return (Criteria) this;
        }

        public Criteria andIMEI2NotLike(String value) {
            addCriterion("IMEI2 not like", value, "IMEI2");
            return (Criteria) this;
        }

        public Criteria andIMEI2In(List<String> values) {
            addCriterion("IMEI2 in", values, "IMEI2");
            return (Criteria) this;
        }

        public Criteria andIMEI2NotIn(List<String> values) {
            addCriterion("IMEI2 not in", values, "IMEI2");
            return (Criteria) this;
        }

        public Criteria andIMEI2Between(String value1, String value2) {
            addCriterion("IMEI2 between", value1, value2, "IMEI2");
            return (Criteria) this;
        }

        public Criteria andIMEI2NotBetween(String value1, String value2) {
            addCriterion("IMEI2 not between", value1, value2, "IMEI2");
            return (Criteria) this;
        }

        public Criteria andMEIDIsNull() {
            addCriterion("MEID is null");
            return (Criteria) this;
        }

        public Criteria andMEIDIsNotNull() {
            addCriterion("MEID is not null");
            return (Criteria) this;
        }

        public Criteria andMEIDEqualTo(String value) {
            addCriterion("MEID =", value, "MEID");
            return (Criteria) this;
        }

        public Criteria andMEIDNotEqualTo(String value) {
            addCriterion("MEID <>", value, "MEID");
            return (Criteria) this;
        }

        public Criteria andMEIDGreaterThan(String value) {
            addCriterion("MEID >", value, "MEID");
            return (Criteria) this;
        }

        public Criteria andMEIDGreaterThanOrEqualTo(String value) {
            addCriterion("MEID >=", value, "MEID");
            return (Criteria) this;
        }

        public Criteria andMEIDLessThan(String value) {
            addCriterion("MEID <", value, "MEID");
            return (Criteria) this;
        }

        public Criteria andMEIDLessThanOrEqualTo(String value) {
            addCriterion("MEID <=", value, "MEID");
            return (Criteria) this;
        }

        public Criteria andMEIDLike(String value) {
            addCriterion("MEID like", value, "MEID");
            return (Criteria) this;
        }

        public Criteria andMEIDNotLike(String value) {
            addCriterion("MEID not like", value, "MEID");
            return (Criteria) this;
        }

        public Criteria andMEIDIn(List<String> values) {
            addCriterion("MEID in", values, "MEID");
            return (Criteria) this;
        }

        public Criteria andMEIDNotIn(List<String> values) {
            addCriterion("MEID not in", values, "MEID");
            return (Criteria) this;
        }

        public Criteria andMEIDBetween(String value1, String value2) {
            addCriterion("MEID between", value1, value2, "MEID");
            return (Criteria) this;
        }

        public Criteria andMEIDNotBetween(String value1, String value2) {
            addCriterion("MEID not between", value1, value2, "MEID");
            return (Criteria) this;
        }

        public Criteria andIMSI1IsNull() {
            addCriterion("IMSI1 is null");
            return (Criteria) this;
        }

        public Criteria andIMSI1IsNotNull() {
            addCriterion("IMSI1 is not null");
            return (Criteria) this;
        }

        public Criteria andIMSI1EqualTo(String value) {
            addCriterion("IMSI1 =", value, "IMSI1");
            return (Criteria) this;
        }

        public Criteria andIMSI1NotEqualTo(String value) {
            addCriterion("IMSI1 <>", value, "IMSI1");
            return (Criteria) this;
        }

        public Criteria andIMSI1GreaterThan(String value) {
            addCriterion("IMSI1 >", value, "IMSI1");
            return (Criteria) this;
        }

        public Criteria andIMSI1GreaterThanOrEqualTo(String value) {
            addCriterion("IMSI1 >=", value, "IMSI1");
            return (Criteria) this;
        }

        public Criteria andIMSI1LessThan(String value) {
            addCriterion("IMSI1 <", value, "IMSI1");
            return (Criteria) this;
        }

        public Criteria andIMSI1LessThanOrEqualTo(String value) {
            addCriterion("IMSI1 <=", value, "IMSI1");
            return (Criteria) this;
        }

        public Criteria andIMSI1Like(String value) {
            addCriterion("IMSI1 like", value, "IMSI1");
            return (Criteria) this;
        }

        public Criteria andIMSI1NotLike(String value) {
            addCriterion("IMSI1 not like", value, "IMSI1");
            return (Criteria) this;
        }

        public Criteria andIMSI1In(List<String> values) {
            addCriterion("IMSI1 in", values, "IMSI1");
            return (Criteria) this;
        }

        public Criteria andIMSI1NotIn(List<String> values) {
            addCriterion("IMSI1 not in", values, "IMSI1");
            return (Criteria) this;
        }

        public Criteria andIMSI1Between(String value1, String value2) {
            addCriterion("IMSI1 between", value1, value2, "IMSI1");
            return (Criteria) this;
        }

        public Criteria andIMSI1NotBetween(String value1, String value2) {
            addCriterion("IMSI1 not between", value1, value2, "IMSI1");
            return (Criteria) this;
        }

        public Criteria andIMSI2IsNull() {
            addCriterion("IMSI2 is null");
            return (Criteria) this;
        }

        public Criteria andIMSI2IsNotNull() {
            addCriterion("IMSI2 is not null");
            return (Criteria) this;
        }

        public Criteria andIMSI2EqualTo(String value) {
            addCriterion("IMSI2 =", value, "IMSI2");
            return (Criteria) this;
        }

        public Criteria andIMSI2NotEqualTo(String value) {
            addCriterion("IMSI2 <>", value, "IMSI2");
            return (Criteria) this;
        }

        public Criteria andIMSI2GreaterThan(String value) {
            addCriterion("IMSI2 >", value, "IMSI2");
            return (Criteria) this;
        }

        public Criteria andIMSI2GreaterThanOrEqualTo(String value) {
            addCriterion("IMSI2 >=", value, "IMSI2");
            return (Criteria) this;
        }

        public Criteria andIMSI2LessThan(String value) {
            addCriterion("IMSI2 <", value, "IMSI2");
            return (Criteria) this;
        }

        public Criteria andIMSI2LessThanOrEqualTo(String value) {
            addCriterion("IMSI2 <=", value, "IMSI2");
            return (Criteria) this;
        }

        public Criteria andIMSI2Like(String value) {
            addCriterion("IMSI2 like", value, "IMSI2");
            return (Criteria) this;
        }

        public Criteria andIMSI2NotLike(String value) {
            addCriterion("IMSI2 not like", value, "IMSI2");
            return (Criteria) this;
        }

        public Criteria andIMSI2In(List<String> values) {
            addCriterion("IMSI2 in", values, "IMSI2");
            return (Criteria) this;
        }

        public Criteria andIMSI2NotIn(List<String> values) {
            addCriterion("IMSI2 not in", values, "IMSI2");
            return (Criteria) this;
        }

        public Criteria andIMSI2Between(String value1, String value2) {
            addCriterion("IMSI2 between", value1, value2, "IMSI2");
            return (Criteria) this;
        }

        public Criteria andIMSI2NotBetween(String value1, String value2) {
            addCriterion("IMSI2 not between", value1, value2, "IMSI2");
            return (Criteria) this;
        }

        public Criteria andMACIsNull() {
            addCriterion("MAC is null");
            return (Criteria) this;
        }

        public Criteria andMACIsNotNull() {
            addCriterion("MAC is not null");
            return (Criteria) this;
        }

        public Criteria andMACEqualTo(String value) {
            addCriterion("MAC =", value, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACNotEqualTo(String value) {
            addCriterion("MAC <>", value, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACGreaterThan(String value) {
            addCriterion("MAC >", value, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACGreaterThanOrEqualTo(String value) {
            addCriterion("MAC >=", value, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACLessThan(String value) {
            addCriterion("MAC <", value, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACLessThanOrEqualTo(String value) {
            addCriterion("MAC <=", value, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACLike(String value) {
            addCriterion("MAC like", value, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACNotLike(String value) {
            addCriterion("MAC not like", value, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACIn(List<String> values) {
            addCriterion("MAC in", values, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACNotIn(List<String> values) {
            addCriterion("MAC not in", values, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACBetween(String value1, String value2) {
            addCriterion("MAC between", value1, value2, "MAC");
            return (Criteria) this;
        }

        public Criteria andMACNotBetween(String value1, String value2) {
            addCriterion("MAC not between", value1, value2, "MAC");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBluetoothAddressIsNull() {
            addCriterion("lostPhoneBluetoothAddress is null");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBluetoothAddressIsNotNull() {
            addCriterion("lostPhoneBluetoothAddress is not null");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBluetoothAddressEqualTo(String value) {
            addCriterion("lostPhoneBluetoothAddress =", value, "lostPhoneBluetoothAddress");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBluetoothAddressNotEqualTo(String value) {
            addCriterion("lostPhoneBluetoothAddress <>", value, "lostPhoneBluetoothAddress");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBluetoothAddressGreaterThan(String value) {
            addCriterion("lostPhoneBluetoothAddress >", value, "lostPhoneBluetoothAddress");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBluetoothAddressGreaterThanOrEqualTo(String value) {
            addCriterion("lostPhoneBluetoothAddress >=", value, "lostPhoneBluetoothAddress");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBluetoothAddressLessThan(String value) {
            addCriterion("lostPhoneBluetoothAddress <", value, "lostPhoneBluetoothAddress");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBluetoothAddressLessThanOrEqualTo(String value) {
            addCriterion("lostPhoneBluetoothAddress <=", value, "lostPhoneBluetoothAddress");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBluetoothAddressLike(String value) {
            addCriterion("lostPhoneBluetoothAddress like", value, "lostPhoneBluetoothAddress");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBluetoothAddressNotLike(String value) {
            addCriterion("lostPhoneBluetoothAddress not like", value, "lostPhoneBluetoothAddress");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBluetoothAddressIn(List<String> values) {
            addCriterion("lostPhoneBluetoothAddress in", values, "lostPhoneBluetoothAddress");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBluetoothAddressNotIn(List<String> values) {
            addCriterion("lostPhoneBluetoothAddress not in", values, "lostPhoneBluetoothAddress");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBluetoothAddressBetween(String value1, String value2) {
            addCriterion("lostPhoneBluetoothAddress between", value1, value2, "lostPhoneBluetoothAddress");
            return (Criteria) this;
        }

        public Criteria andLostPhoneBluetoothAddressNotBetween(String value1, String value2) {
            addCriterion("lostPhoneBluetoothAddress not between", value1, value2, "lostPhoneBluetoothAddress");
            return (Criteria) this;
        }

        public Criteria andLostPhoneSerialNumberIsNull() {
            addCriterion("lostPhoneSerialNumber is null");
            return (Criteria) this;
        }

        public Criteria andLostPhoneSerialNumberIsNotNull() {
            addCriterion("lostPhoneSerialNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLostPhoneSerialNumberEqualTo(String value) {
            addCriterion("lostPhoneSerialNumber =", value, "lostPhoneSerialNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneSerialNumberNotEqualTo(String value) {
            addCriterion("lostPhoneSerialNumber <>", value, "lostPhoneSerialNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneSerialNumberGreaterThan(String value) {
            addCriterion("lostPhoneSerialNumber >", value, "lostPhoneSerialNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneSerialNumberGreaterThanOrEqualTo(String value) {
            addCriterion("lostPhoneSerialNumber >=", value, "lostPhoneSerialNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneSerialNumberLessThan(String value) {
            addCriterion("lostPhoneSerialNumber <", value, "lostPhoneSerialNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneSerialNumberLessThanOrEqualTo(String value) {
            addCriterion("lostPhoneSerialNumber <=", value, "lostPhoneSerialNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneSerialNumberLike(String value) {
            addCriterion("lostPhoneSerialNumber like", value, "lostPhoneSerialNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneSerialNumberNotLike(String value) {
            addCriterion("lostPhoneSerialNumber not like", value, "lostPhoneSerialNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneSerialNumberIn(List<String> values) {
            addCriterion("lostPhoneSerialNumber in", values, "lostPhoneSerialNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneSerialNumberNotIn(List<String> values) {
            addCriterion("lostPhoneSerialNumber not in", values, "lostPhoneSerialNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneSerialNumberBetween(String value1, String value2) {
            addCriterion("lostPhoneSerialNumber between", value1, value2, "lostPhoneSerialNumber");
            return (Criteria) this;
        }

        public Criteria andLostPhoneSerialNumberNotBetween(String value1, String value2) {
            addCriterion("lostPhoneSerialNumber not between", value1, value2, "lostPhoneSerialNumber");
            return (Criteria) this;
        }

        public Criteria andLostOtherFeaturesIsNull() {
            addCriterion("lostOtherFeatures is null");
            return (Criteria) this;
        }

        public Criteria andLostOtherFeaturesIsNotNull() {
            addCriterion("lostOtherFeatures is not null");
            return (Criteria) this;
        }

        public Criteria andLostOtherFeaturesEqualTo(String value) {
            addCriterion("lostOtherFeatures =", value, "lostOtherFeatures");
            return (Criteria) this;
        }

        public Criteria andLostOtherFeaturesNotEqualTo(String value) {
            addCriterion("lostOtherFeatures <>", value, "lostOtherFeatures");
            return (Criteria) this;
        }

        public Criteria andLostOtherFeaturesGreaterThan(String value) {
            addCriterion("lostOtherFeatures >", value, "lostOtherFeatures");
            return (Criteria) this;
        }

        public Criteria andLostOtherFeaturesGreaterThanOrEqualTo(String value) {
            addCriterion("lostOtherFeatures >=", value, "lostOtherFeatures");
            return (Criteria) this;
        }

        public Criteria andLostOtherFeaturesLessThan(String value) {
            addCriterion("lostOtherFeatures <", value, "lostOtherFeatures");
            return (Criteria) this;
        }

        public Criteria andLostOtherFeaturesLessThanOrEqualTo(String value) {
            addCriterion("lostOtherFeatures <=", value, "lostOtherFeatures");
            return (Criteria) this;
        }

        public Criteria andLostOtherFeaturesLike(String value) {
            addCriterion("lostOtherFeatures like", value, "lostOtherFeatures");
            return (Criteria) this;
        }

        public Criteria andLostOtherFeaturesNotLike(String value) {
            addCriterion("lostOtherFeatures not like", value, "lostOtherFeatures");
            return (Criteria) this;
        }

        public Criteria andLostOtherFeaturesIn(List<String> values) {
            addCriterion("lostOtherFeatures in", values, "lostOtherFeatures");
            return (Criteria) this;
        }

        public Criteria andLostOtherFeaturesNotIn(List<String> values) {
            addCriterion("lostOtherFeatures not in", values, "lostOtherFeatures");
            return (Criteria) this;
        }

        public Criteria andLostOtherFeaturesBetween(String value1, String value2) {
            addCriterion("lostOtherFeatures between", value1, value2, "lostOtherFeatures");
            return (Criteria) this;
        }

        public Criteria andLostOtherFeaturesNotBetween(String value1, String value2) {
            addCriterion("lostOtherFeatures not between", value1, value2, "lostOtherFeatures");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIsNull() {
            addCriterion("alarmType is null");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIsNotNull() {
            addCriterion("alarmType is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeEqualTo(Integer value) {
            addCriterion("alarmType =", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotEqualTo(Integer value) {
            addCriterion("alarmType <>", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeGreaterThan(Integer value) {
            addCriterion("alarmType >", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarmType >=", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLessThan(Integer value) {
            addCriterion("alarmType <", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeLessThanOrEqualTo(Integer value) {
            addCriterion("alarmType <=", value, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeIn(List<Integer> values) {
            addCriterion("alarmType in", values, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotIn(List<Integer> values) {
            addCriterion("alarmType not in", values, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeBetween(Integer value1, Integer value2) {
            addCriterion("alarmType between", value1, value2, "alarmType");
            return (Criteria) this;
        }

        public Criteria andAlarmTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("alarmType not between", value1, value2, "alarmType");
            return (Criteria) this;
        }

        public Criteria andFindCaseTimeIsNull() {
            addCriterion("findCaseTime is null");
            return (Criteria) this;
        }

        public Criteria andFindCaseTimeIsNotNull() {
            addCriterion("findCaseTime is not null");
            return (Criteria) this;
        }

        public Criteria andFindCaseTimeEqualTo(Date value) {
            addCriterion("findCaseTime =", value, "findCaseTime");
            return (Criteria) this;
        }

        public Criteria andFindCaseTimeNotEqualTo(Date value) {
            addCriterion("findCaseTime <>", value, "findCaseTime");
            return (Criteria) this;
        }

        public Criteria andFindCaseTimeGreaterThan(Date value) {
            addCriterion("findCaseTime >", value, "findCaseTime");
            return (Criteria) this;
        }

        public Criteria andFindCaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("findCaseTime >=", value, "findCaseTime");
            return (Criteria) this;
        }

        public Criteria andFindCaseTimeLessThan(Date value) {
            addCriterion("findCaseTime <", value, "findCaseTime");
            return (Criteria) this;
        }

        public Criteria andFindCaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("findCaseTime <=", value, "findCaseTime");
            return (Criteria) this;
        }

        public Criteria andFindCaseTimeIn(List<Date> values) {
            addCriterion("findCaseTime in", values, "findCaseTime");
            return (Criteria) this;
        }

        public Criteria andFindCaseTimeNotIn(List<Date> values) {
            addCriterion("findCaseTime not in", values, "findCaseTime");
            return (Criteria) this;
        }

        public Criteria andFindCaseTimeBetween(Date value1, Date value2) {
            addCriterion("findCaseTime between", value1, value2, "findCaseTime");
            return (Criteria) this;
        }

        public Criteria andFindCaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("findCaseTime not between", value1, value2, "findCaseTime");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceIsNull() {
            addCriterion("findCasePlace is null");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceIsNotNull() {
            addCriterion("findCasePlace is not null");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceEqualTo(String value) {
            addCriterion("findCasePlace =", value, "findCasePlace");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceNotEqualTo(String value) {
            addCriterion("findCasePlace <>", value, "findCasePlace");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceGreaterThan(String value) {
            addCriterion("findCasePlace >", value, "findCasePlace");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("findCasePlace >=", value, "findCasePlace");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceLessThan(String value) {
            addCriterion("findCasePlace <", value, "findCasePlace");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceLessThanOrEqualTo(String value) {
            addCriterion("findCasePlace <=", value, "findCasePlace");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceLike(String value) {
            addCriterion("findCasePlace like", value, "findCasePlace");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceNotLike(String value) {
            addCriterion("findCasePlace not like", value, "findCasePlace");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceIn(List<String> values) {
            addCriterion("findCasePlace in", values, "findCasePlace");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceNotIn(List<String> values) {
            addCriterion("findCasePlace not in", values, "findCasePlace");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceBetween(String value1, String value2) {
            addCriterion("findCasePlace between", value1, value2, "findCasePlace");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceNotBetween(String value1, String value2) {
            addCriterion("findCasePlace not between", value1, value2, "findCasePlace");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceReplenishIsNull() {
            addCriterion("findCasePlaceReplenish is null");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceReplenishIsNotNull() {
            addCriterion("findCasePlaceReplenish is not null");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceReplenishEqualTo(String value) {
            addCriterion("findCasePlaceReplenish =", value, "findCasePlaceReplenish");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceReplenishNotEqualTo(String value) {
            addCriterion("findCasePlaceReplenish <>", value, "findCasePlaceReplenish");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceReplenishGreaterThan(String value) {
            addCriterion("findCasePlaceReplenish >", value, "findCasePlaceReplenish");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceReplenishGreaterThanOrEqualTo(String value) {
            addCriterion("findCasePlaceReplenish >=", value, "findCasePlaceReplenish");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceReplenishLessThan(String value) {
            addCriterion("findCasePlaceReplenish <", value, "findCasePlaceReplenish");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceReplenishLessThanOrEqualTo(String value) {
            addCriterion("findCasePlaceReplenish <=", value, "findCasePlaceReplenish");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceReplenishLike(String value) {
            addCriterion("findCasePlaceReplenish like", value, "findCasePlaceReplenish");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceReplenishNotLike(String value) {
            addCriterion("findCasePlaceReplenish not like", value, "findCasePlaceReplenish");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceReplenishIn(List<String> values) {
            addCriterion("findCasePlaceReplenish in", values, "findCasePlaceReplenish");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceReplenishNotIn(List<String> values) {
            addCriterion("findCasePlaceReplenish not in", values, "findCasePlaceReplenish");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceReplenishBetween(String value1, String value2) {
            addCriterion("findCasePlaceReplenish between", value1, value2, "findCasePlaceReplenish");
            return (Criteria) this;
        }

        public Criteria andFindCasePlaceReplenishNotBetween(String value1, String value2) {
            addCriterion("findCasePlaceReplenish not between", value1, value2, "findCasePlaceReplenish");
            return (Criteria) this;
        }

        public Criteria andFindCaseLongitudeIsNull() {
            addCriterion("findCaseLongitude is null");
            return (Criteria) this;
        }

        public Criteria andFindCaseLongitudeIsNotNull() {
            addCriterion("findCaseLongitude is not null");
            return (Criteria) this;
        }

        public Criteria andFindCaseLongitudeEqualTo(String value) {
            addCriterion("findCaseLongitude =", value, "findCaseLongitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLongitudeNotEqualTo(String value) {
            addCriterion("findCaseLongitude <>", value, "findCaseLongitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLongitudeGreaterThan(String value) {
            addCriterion("findCaseLongitude >", value, "findCaseLongitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("findCaseLongitude >=", value, "findCaseLongitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLongitudeLessThan(String value) {
            addCriterion("findCaseLongitude <", value, "findCaseLongitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLongitudeLessThanOrEqualTo(String value) {
            addCriterion("findCaseLongitude <=", value, "findCaseLongitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLongitudeLike(String value) {
            addCriterion("findCaseLongitude like", value, "findCaseLongitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLongitudeNotLike(String value) {
            addCriterion("findCaseLongitude not like", value, "findCaseLongitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLongitudeIn(List<String> values) {
            addCriterion("findCaseLongitude in", values, "findCaseLongitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLongitudeNotIn(List<String> values) {
            addCriterion("findCaseLongitude not in", values, "findCaseLongitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLongitudeBetween(String value1, String value2) {
            addCriterion("findCaseLongitude between", value1, value2, "findCaseLongitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLongitudeNotBetween(String value1, String value2) {
            addCriterion("findCaseLongitude not between", value1, value2, "findCaseLongitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLatitudeIsNull() {
            addCriterion("findCaseLatitude is null");
            return (Criteria) this;
        }

        public Criteria andFindCaseLatitudeIsNotNull() {
            addCriterion("findCaseLatitude is not null");
            return (Criteria) this;
        }

        public Criteria andFindCaseLatitudeEqualTo(String value) {
            addCriterion("findCaseLatitude =", value, "findCaseLatitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLatitudeNotEqualTo(String value) {
            addCriterion("findCaseLatitude <>", value, "findCaseLatitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLatitudeGreaterThan(String value) {
            addCriterion("findCaseLatitude >", value, "findCaseLatitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("findCaseLatitude >=", value, "findCaseLatitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLatitudeLessThan(String value) {
            addCriterion("findCaseLatitude <", value, "findCaseLatitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLatitudeLessThanOrEqualTo(String value) {
            addCriterion("findCaseLatitude <=", value, "findCaseLatitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLatitudeLike(String value) {
            addCriterion("findCaseLatitude like", value, "findCaseLatitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLatitudeNotLike(String value) {
            addCriterion("findCaseLatitude not like", value, "findCaseLatitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLatitudeIn(List<String> values) {
            addCriterion("findCaseLatitude in", values, "findCaseLatitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLatitudeNotIn(List<String> values) {
            addCriterion("findCaseLatitude not in", values, "findCaseLatitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLatitudeBetween(String value1, String value2) {
            addCriterion("findCaseLatitude between", value1, value2, "findCaseLatitude");
            return (Criteria) this;
        }

        public Criteria andFindCaseLatitudeNotBetween(String value1, String value2) {
            addCriterion("findCaseLatitude not between", value1, value2, "findCaseLatitude");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeIsNull() {
            addCriterion("alarmTime is null");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeIsNotNull() {
            addCriterion("alarmTime is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeEqualTo(Date value) {
            addCriterion("alarmTime =", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeNotEqualTo(Date value) {
            addCriterion("alarmTime <>", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeGreaterThan(Date value) {
            addCriterion("alarmTime >", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("alarmTime >=", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeLessThan(Date value) {
            addCriterion("alarmTime <", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeLessThanOrEqualTo(Date value) {
            addCriterion("alarmTime <=", value, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeIn(List<Date> values) {
            addCriterion("alarmTime in", values, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeNotIn(List<Date> values) {
            addCriterion("alarmTime not in", values, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeBetween(Date value1, Date value2) {
            addCriterion("alarmTime between", value1, value2, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmTimeNotBetween(Date value1, Date value2) {
            addCriterion("alarmTime not between", value1, value2, "alarmTime");
            return (Criteria) this;
        }

        public Criteria andAlarmPlaceIsNull() {
            addCriterion("alarmPlace is null");
            return (Criteria) this;
        }

        public Criteria andAlarmPlaceIsNotNull() {
            addCriterion("alarmPlace is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmPlaceEqualTo(String value) {
            addCriterion("alarmPlace =", value, "alarmPlace");
            return (Criteria) this;
        }

        public Criteria andAlarmPlaceNotEqualTo(String value) {
            addCriterion("alarmPlace <>", value, "alarmPlace");
            return (Criteria) this;
        }

        public Criteria andAlarmPlaceGreaterThan(String value) {
            addCriterion("alarmPlace >", value, "alarmPlace");
            return (Criteria) this;
        }

        public Criteria andAlarmPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("alarmPlace >=", value, "alarmPlace");
            return (Criteria) this;
        }

        public Criteria andAlarmPlaceLessThan(String value) {
            addCriterion("alarmPlace <", value, "alarmPlace");
            return (Criteria) this;
        }

        public Criteria andAlarmPlaceLessThanOrEqualTo(String value) {
            addCriterion("alarmPlace <=", value, "alarmPlace");
            return (Criteria) this;
        }

        public Criteria andAlarmPlaceLike(String value) {
            addCriterion("alarmPlace like", value, "alarmPlace");
            return (Criteria) this;
        }

        public Criteria andAlarmPlaceNotLike(String value) {
            addCriterion("alarmPlace not like", value, "alarmPlace");
            return (Criteria) this;
        }

        public Criteria andAlarmPlaceIn(List<String> values) {
            addCriterion("alarmPlace in", values, "alarmPlace");
            return (Criteria) this;
        }

        public Criteria andAlarmPlaceNotIn(List<String> values) {
            addCriterion("alarmPlace not in", values, "alarmPlace");
            return (Criteria) this;
        }

        public Criteria andAlarmPlaceBetween(String value1, String value2) {
            addCriterion("alarmPlace between", value1, value2, "alarmPlace");
            return (Criteria) this;
        }

        public Criteria andAlarmPlaceNotBetween(String value1, String value2) {
            addCriterion("alarmPlace not between", value1, value2, "alarmPlace");
            return (Criteria) this;
        }

        public Criteria andAlarmLongitudeIsNull() {
            addCriterion("alarmLongitude is null");
            return (Criteria) this;
        }

        public Criteria andAlarmLongitudeIsNotNull() {
            addCriterion("alarmLongitude is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmLongitudeEqualTo(String value) {
            addCriterion("alarmLongitude =", value, "alarmLongitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLongitudeNotEqualTo(String value) {
            addCriterion("alarmLongitude <>", value, "alarmLongitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLongitudeGreaterThan(String value) {
            addCriterion("alarmLongitude >", value, "alarmLongitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("alarmLongitude >=", value, "alarmLongitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLongitudeLessThan(String value) {
            addCriterion("alarmLongitude <", value, "alarmLongitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLongitudeLessThanOrEqualTo(String value) {
            addCriterion("alarmLongitude <=", value, "alarmLongitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLongitudeLike(String value) {
            addCriterion("alarmLongitude like", value, "alarmLongitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLongitudeNotLike(String value) {
            addCriterion("alarmLongitude not like", value, "alarmLongitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLongitudeIn(List<String> values) {
            addCriterion("alarmLongitude in", values, "alarmLongitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLongitudeNotIn(List<String> values) {
            addCriterion("alarmLongitude not in", values, "alarmLongitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLongitudeBetween(String value1, String value2) {
            addCriterion("alarmLongitude between", value1, value2, "alarmLongitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLongitudeNotBetween(String value1, String value2) {
            addCriterion("alarmLongitude not between", value1, value2, "alarmLongitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLatitudeIsNull() {
            addCriterion("alarmLatitude is null");
            return (Criteria) this;
        }

        public Criteria andAlarmLatitudeIsNotNull() {
            addCriterion("alarmLatitude is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmLatitudeEqualTo(String value) {
            addCriterion("alarmLatitude =", value, "alarmLatitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLatitudeNotEqualTo(String value) {
            addCriterion("alarmLatitude <>", value, "alarmLatitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLatitudeGreaterThan(String value) {
            addCriterion("alarmLatitude >", value, "alarmLatitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("alarmLatitude >=", value, "alarmLatitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLatitudeLessThan(String value) {
            addCriterion("alarmLatitude <", value, "alarmLatitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLatitudeLessThanOrEqualTo(String value) {
            addCriterion("alarmLatitude <=", value, "alarmLatitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLatitudeLike(String value) {
            addCriterion("alarmLatitude like", value, "alarmLatitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLatitudeNotLike(String value) {
            addCriterion("alarmLatitude not like", value, "alarmLatitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLatitudeIn(List<String> values) {
            addCriterion("alarmLatitude in", values, "alarmLatitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLatitudeNotIn(List<String> values) {
            addCriterion("alarmLatitude not in", values, "alarmLatitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLatitudeBetween(String value1, String value2) {
            addCriterion("alarmLatitude between", value1, value2, "alarmLatitude");
            return (Criteria) this;
        }

        public Criteria andAlarmLatitudeNotBetween(String value1, String value2) {
            addCriterion("alarmLatitude not between", value1, value2, "alarmLatitude");
            return (Criteria) this;
        }

        public Criteria andContactNumberIsNull() {
            addCriterion("contactNumber is null");
            return (Criteria) this;
        }

        public Criteria andContactNumberIsNotNull() {
            addCriterion("contactNumber is not null");
            return (Criteria) this;
        }

        public Criteria andContactNumberEqualTo(String value) {
            addCriterion("contactNumber =", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotEqualTo(String value) {
            addCriterion("contactNumber <>", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThan(String value) {
            addCriterion("contactNumber >", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberGreaterThanOrEqualTo(String value) {
            addCriterion("contactNumber >=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThan(String value) {
            addCriterion("contactNumber <", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLessThanOrEqualTo(String value) {
            addCriterion("contactNumber <=", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberLike(String value) {
            addCriterion("contactNumber like", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotLike(String value) {
            addCriterion("contactNumber not like", value, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberIn(List<String> values) {
            addCriterion("contactNumber in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotIn(List<String> values) {
            addCriterion("contactNumber not in", values, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberBetween(String value1, String value2) {
            addCriterion("contactNumber between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andContactNumberNotBetween(String value1, String value2) {
            addCriterion("contactNumber not between", value1, value2, "contactNumber");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusIsNull() {
            addCriterion("alarmStatus is null");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusIsNotNull() {
            addCriterion("alarmStatus is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusEqualTo(Integer value) {
            addCriterion("alarmStatus =", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusNotEqualTo(Integer value) {
            addCriterion("alarmStatus <>", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusGreaterThan(Integer value) {
            addCriterion("alarmStatus >", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarmStatus >=", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusLessThan(Integer value) {
            addCriterion("alarmStatus <", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusLessThanOrEqualTo(Integer value) {
            addCriterion("alarmStatus <=", value, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusIn(List<Integer> values) {
            addCriterion("alarmStatus in", values, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusNotIn(List<Integer> values) {
            addCriterion("alarmStatus not in", values, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusBetween(Integer value1, Integer value2) {
            addCriterion("alarmStatus between", value1, value2, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("alarmStatus not between", value1, value2, "alarmStatus");
            return (Criteria) this;
        }

        public Criteria andAlarmPassIsNull() {
            addCriterion("alarmPass is null");
            return (Criteria) this;
        }

        public Criteria andAlarmPassIsNotNull() {
            addCriterion("alarmPass is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmPassEqualTo(String value) {
            addCriterion("alarmPass =", value, "alarmPass");
            return (Criteria) this;
        }

        public Criteria andAlarmPassNotEqualTo(String value) {
            addCriterion("alarmPass <>", value, "alarmPass");
            return (Criteria) this;
        }

        public Criteria andAlarmPassGreaterThan(String value) {
            addCriterion("alarmPass >", value, "alarmPass");
            return (Criteria) this;
        }

        public Criteria andAlarmPassGreaterThanOrEqualTo(String value) {
            addCriterion("alarmPass >=", value, "alarmPass");
            return (Criteria) this;
        }

        public Criteria andAlarmPassLessThan(String value) {
            addCriterion("alarmPass <", value, "alarmPass");
            return (Criteria) this;
        }

        public Criteria andAlarmPassLessThanOrEqualTo(String value) {
            addCriterion("alarmPass <=", value, "alarmPass");
            return (Criteria) this;
        }

        public Criteria andAlarmPassLike(String value) {
            addCriterion("alarmPass like", value, "alarmPass");
            return (Criteria) this;
        }

        public Criteria andAlarmPassNotLike(String value) {
            addCriterion("alarmPass not like", value, "alarmPass");
            return (Criteria) this;
        }

        public Criteria andAlarmPassIn(List<String> values) {
            addCriterion("alarmPass in", values, "alarmPass");
            return (Criteria) this;
        }

        public Criteria andAlarmPassNotIn(List<String> values) {
            addCriterion("alarmPass not in", values, "alarmPass");
            return (Criteria) this;
        }

        public Criteria andAlarmPassBetween(String value1, String value2) {
            addCriterion("alarmPass between", value1, value2, "alarmPass");
            return (Criteria) this;
        }

        public Criteria andAlarmPassNotBetween(String value1, String value2) {
            addCriterion("alarmPass not between", value1, value2, "alarmPass");
            return (Criteria) this;
        }

        public Criteria andAlarmChannelIsNull() {
            addCriterion("alarmChannel is null");
            return (Criteria) this;
        }

        public Criteria andAlarmChannelIsNotNull() {
            addCriterion("alarmChannel is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmChannelEqualTo(Integer value) {
            addCriterion("alarmChannel =", value, "alarmChannel");
            return (Criteria) this;
        }

        public Criteria andAlarmChannelNotEqualTo(Integer value) {
            addCriterion("alarmChannel <>", value, "alarmChannel");
            return (Criteria) this;
        }

        public Criteria andAlarmChannelGreaterThan(Integer value) {
            addCriterion("alarmChannel >", value, "alarmChannel");
            return (Criteria) this;
        }

        public Criteria andAlarmChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("alarmChannel >=", value, "alarmChannel");
            return (Criteria) this;
        }

        public Criteria andAlarmChannelLessThan(Integer value) {
            addCriterion("alarmChannel <", value, "alarmChannel");
            return (Criteria) this;
        }

        public Criteria andAlarmChannelLessThanOrEqualTo(Integer value) {
            addCriterion("alarmChannel <=", value, "alarmChannel");
            return (Criteria) this;
        }

        public Criteria andAlarmChannelIn(List<Integer> values) {
            addCriterion("alarmChannel in", values, "alarmChannel");
            return (Criteria) this;
        }

        public Criteria andAlarmChannelNotIn(List<Integer> values) {
            addCriterion("alarmChannel not in", values, "alarmChannel");
            return (Criteria) this;
        }

        public Criteria andAlarmChannelBetween(Integer value1, Integer value2) {
            addCriterion("alarmChannel between", value1, value2, "alarmChannel");
            return (Criteria) this;
        }

        public Criteria andAlarmChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("alarmChannel not between", value1, value2, "alarmChannel");
            return (Criteria) this;
        }

        public Criteria andExtractStatusIsNull() {
            addCriterion("extractStatus is null");
            return (Criteria) this;
        }

        public Criteria andExtractStatusIsNotNull() {
            addCriterion("extractStatus is not null");
            return (Criteria) this;
        }

        public Criteria andExtractStatusEqualTo(Integer value) {
            addCriterion("extractStatus =", value, "extractStatus");
            return (Criteria) this;
        }

        public Criteria andExtractStatusNotEqualTo(Integer value) {
            addCriterion("extractStatus <>", value, "extractStatus");
            return (Criteria) this;
        }

        public Criteria andExtractStatusGreaterThan(Integer value) {
            addCriterion("extractStatus >", value, "extractStatus");
            return (Criteria) this;
        }

        public Criteria andExtractStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("extractStatus >=", value, "extractStatus");
            return (Criteria) this;
        }

        public Criteria andExtractStatusLessThan(Integer value) {
            addCriterion("extractStatus <", value, "extractStatus");
            return (Criteria) this;
        }

        public Criteria andExtractStatusLessThanOrEqualTo(Integer value) {
            addCriterion("extractStatus <=", value, "extractStatus");
            return (Criteria) this;
        }

        public Criteria andExtractStatusIn(List<Integer> values) {
            addCriterion("extractStatus in", values, "extractStatus");
            return (Criteria) this;
        }

        public Criteria andExtractStatusNotIn(List<Integer> values) {
            addCriterion("extractStatus not in", values, "extractStatus");
            return (Criteria) this;
        }

        public Criteria andExtractStatusBetween(Integer value1, Integer value2) {
            addCriterion("extractStatus between", value1, value2, "extractStatus");
            return (Criteria) this;
        }

        public Criteria andExtractStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("extractStatus not between", value1, value2, "extractStatus");
            return (Criteria) this;
        }

        public Criteria andIsLostIsNull() {
            addCriterion("isLost is null");
            return (Criteria) this;
        }

        public Criteria andIsLostIsNotNull() {
            addCriterion("isLost is not null");
            return (Criteria) this;
        }

        public Criteria andIsLostEqualTo(String value) {
            addCriterion("isLost =", value, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostNotEqualTo(String value) {
            addCriterion("isLost <>", value, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostGreaterThan(String value) {
            addCriterion("isLost >", value, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostGreaterThanOrEqualTo(String value) {
            addCriterion("isLost >=", value, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostLessThan(String value) {
            addCriterion("isLost <", value, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostLessThanOrEqualTo(String value) {
            addCriterion("isLost <=", value, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostLike(String value) {
            addCriterion("isLost like", value, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostNotLike(String value) {
            addCriterion("isLost not like", value, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostIn(List<String> values) {
            addCriterion("isLost in", values, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostNotIn(List<String> values) {
            addCriterion("isLost not in", values, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostBetween(String value1, String value2) {
            addCriterion("isLost between", value1, value2, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsLostNotBetween(String value1, String value2) {
            addCriterion("isLost not between", value1, value2, "isLost");
            return (Criteria) this;
        }

        public Criteria andIsAgreeIsNull() {
            addCriterion("isAgree is null");
            return (Criteria) this;
        }

        public Criteria andIsAgreeIsNotNull() {
            addCriterion("isAgree is not null");
            return (Criteria) this;
        }

        public Criteria andIsAgreeEqualTo(String value) {
            addCriterion("isAgree =", value, "isAgree");
            return (Criteria) this;
        }

        public Criteria andIsAgreeNotEqualTo(String value) {
            addCriterion("isAgree <>", value, "isAgree");
            return (Criteria) this;
        }

        public Criteria andIsAgreeGreaterThan(String value) {
            addCriterion("isAgree >", value, "isAgree");
            return (Criteria) this;
        }

        public Criteria andIsAgreeGreaterThanOrEqualTo(String value) {
            addCriterion("isAgree >=", value, "isAgree");
            return (Criteria) this;
        }

        public Criteria andIsAgreeLessThan(String value) {
            addCriterion("isAgree <", value, "isAgree");
            return (Criteria) this;
        }

        public Criteria andIsAgreeLessThanOrEqualTo(String value) {
            addCriterion("isAgree <=", value, "isAgree");
            return (Criteria) this;
        }

        public Criteria andIsAgreeLike(String value) {
            addCriterion("isAgree like", value, "isAgree");
            return (Criteria) this;
        }

        public Criteria andIsAgreeNotLike(String value) {
            addCriterion("isAgree not like", value, "isAgree");
            return (Criteria) this;
        }

        public Criteria andIsAgreeIn(List<String> values) {
            addCriterion("isAgree in", values, "isAgree");
            return (Criteria) this;
        }

        public Criteria andIsAgreeNotIn(List<String> values) {
            addCriterion("isAgree not in", values, "isAgree");
            return (Criteria) this;
        }

        public Criteria andIsAgreeBetween(String value1, String value2) {
            addCriterion("isAgree between", value1, value2, "isAgree");
            return (Criteria) this;
        }

        public Criteria andIsAgreeNotBetween(String value1, String value2) {
            addCriterion("isAgree not between", value1, value2, "isAgree");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}