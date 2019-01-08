package com.anti.theft.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppealInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppealInformationExample() {
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

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("idCard is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("idCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("idCard =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("idCard <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("idCard >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("idCard >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("idCard <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("idCard <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("idCard like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("idCard not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("idCard in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("idCard not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("idCard between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("idCard not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoIsNull() {
            addCriterion("frontPhoto is null");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoIsNotNull() {
            addCriterion("frontPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoEqualTo(String value) {
            addCriterion("frontPhoto =", value, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoNotEqualTo(String value) {
            addCriterion("frontPhoto <>", value, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoGreaterThan(String value) {
            addCriterion("frontPhoto >", value, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("frontPhoto >=", value, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoLessThan(String value) {
            addCriterion("frontPhoto <", value, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoLessThanOrEqualTo(String value) {
            addCriterion("frontPhoto <=", value, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoLike(String value) {
            addCriterion("frontPhoto like", value, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoNotLike(String value) {
            addCriterion("frontPhoto not like", value, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoIn(List<String> values) {
            addCriterion("frontPhoto in", values, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoNotIn(List<String> values) {
            addCriterion("frontPhoto not in", values, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoBetween(String value1, String value2) {
            addCriterion("frontPhoto between", value1, value2, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andFrontPhotoNotBetween(String value1, String value2) {
            addCriterion("frontPhoto not between", value1, value2, "frontPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoIsNull() {
            addCriterion("backPhoto is null");
            return (Criteria) this;
        }

        public Criteria andBackPhotoIsNotNull() {
            addCriterion("backPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andBackPhotoEqualTo(String value) {
            addCriterion("backPhoto =", value, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoNotEqualTo(String value) {
            addCriterion("backPhoto <>", value, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoGreaterThan(String value) {
            addCriterion("backPhoto >", value, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("backPhoto >=", value, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoLessThan(String value) {
            addCriterion("backPhoto <", value, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoLessThanOrEqualTo(String value) {
            addCriterion("backPhoto <=", value, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoLike(String value) {
            addCriterion("backPhoto like", value, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoNotLike(String value) {
            addCriterion("backPhoto not like", value, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoIn(List<String> values) {
            addCriterion("backPhoto in", values, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoNotIn(List<String> values) {
            addCriterion("backPhoto not in", values, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoBetween(String value1, String value2) {
            addCriterion("backPhoto between", value1, value2, "backPhoto");
            return (Criteria) this;
        }

        public Criteria andBackPhotoNotBetween(String value1, String value2) {
            addCriterion("backPhoto not between", value1, value2, "backPhoto");
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

        public Criteria andAppealCauseIsNull() {
            addCriterion("appealCause is null");
            return (Criteria) this;
        }

        public Criteria andAppealCauseIsNotNull() {
            addCriterion("appealCause is not null");
            return (Criteria) this;
        }

        public Criteria andAppealCauseEqualTo(String value) {
            addCriterion("appealCause =", value, "appealCause");
            return (Criteria) this;
        }

        public Criteria andAppealCauseNotEqualTo(String value) {
            addCriterion("appealCause <>", value, "appealCause");
            return (Criteria) this;
        }

        public Criteria andAppealCauseGreaterThan(String value) {
            addCriterion("appealCause >", value, "appealCause");
            return (Criteria) this;
        }

        public Criteria andAppealCauseGreaterThanOrEqualTo(String value) {
            addCriterion("appealCause >=", value, "appealCause");
            return (Criteria) this;
        }

        public Criteria andAppealCauseLessThan(String value) {
            addCriterion("appealCause <", value, "appealCause");
            return (Criteria) this;
        }

        public Criteria andAppealCauseLessThanOrEqualTo(String value) {
            addCriterion("appealCause <=", value, "appealCause");
            return (Criteria) this;
        }

        public Criteria andAppealCauseLike(String value) {
            addCriterion("appealCause like", value, "appealCause");
            return (Criteria) this;
        }

        public Criteria andAppealCauseNotLike(String value) {
            addCriterion("appealCause not like", value, "appealCause");
            return (Criteria) this;
        }

        public Criteria andAppealCauseIn(List<String> values) {
            addCriterion("appealCause in", values, "appealCause");
            return (Criteria) this;
        }

        public Criteria andAppealCauseNotIn(List<String> values) {
            addCriterion("appealCause not in", values, "appealCause");
            return (Criteria) this;
        }

        public Criteria andAppealCauseBetween(String value1, String value2) {
            addCriterion("appealCause between", value1, value2, "appealCause");
            return (Criteria) this;
        }

        public Criteria andAppealCauseNotBetween(String value1, String value2) {
            addCriterion("appealCause not between", value1, value2, "appealCause");
            return (Criteria) this;
        }

        public Criteria andOtherAppealCauseIsNull() {
            addCriterion("otherAppealCause is null");
            return (Criteria) this;
        }

        public Criteria andOtherAppealCauseIsNotNull() {
            addCriterion("otherAppealCause is not null");
            return (Criteria) this;
        }

        public Criteria andOtherAppealCauseEqualTo(String value) {
            addCriterion("otherAppealCause =", value, "otherAppealCause");
            return (Criteria) this;
        }

        public Criteria andOtherAppealCauseNotEqualTo(String value) {
            addCriterion("otherAppealCause <>", value, "otherAppealCause");
            return (Criteria) this;
        }

        public Criteria andOtherAppealCauseGreaterThan(String value) {
            addCriterion("otherAppealCause >", value, "otherAppealCause");
            return (Criteria) this;
        }

        public Criteria andOtherAppealCauseGreaterThanOrEqualTo(String value) {
            addCriterion("otherAppealCause >=", value, "otherAppealCause");
            return (Criteria) this;
        }

        public Criteria andOtherAppealCauseLessThan(String value) {
            addCriterion("otherAppealCause <", value, "otherAppealCause");
            return (Criteria) this;
        }

        public Criteria andOtherAppealCauseLessThanOrEqualTo(String value) {
            addCriterion("otherAppealCause <=", value, "otherAppealCause");
            return (Criteria) this;
        }

        public Criteria andOtherAppealCauseLike(String value) {
            addCriterion("otherAppealCause like", value, "otherAppealCause");
            return (Criteria) this;
        }

        public Criteria andOtherAppealCauseNotLike(String value) {
            addCriterion("otherAppealCause not like", value, "otherAppealCause");
            return (Criteria) this;
        }

        public Criteria andOtherAppealCauseIn(List<String> values) {
            addCriterion("otherAppealCause in", values, "otherAppealCause");
            return (Criteria) this;
        }

        public Criteria andOtherAppealCauseNotIn(List<String> values) {
            addCriterion("otherAppealCause not in", values, "otherAppealCause");
            return (Criteria) this;
        }

        public Criteria andOtherAppealCauseBetween(String value1, String value2) {
            addCriterion("otherAppealCause between", value1, value2, "otherAppealCause");
            return (Criteria) this;
        }

        public Criteria andOtherAppealCauseNotBetween(String value1, String value2) {
            addCriterion("otherAppealCause not between", value1, value2, "otherAppealCause");
            return (Criteria) this;
        }

        public Criteria andBuyingTimeIsNull() {
            addCriterion("buyingTime is null");
            return (Criteria) this;
        }

        public Criteria andBuyingTimeIsNotNull() {
            addCriterion("buyingTime is not null");
            return (Criteria) this;
        }

        public Criteria andBuyingTimeEqualTo(Date value) {
            addCriterion("buyingTime =", value, "buyingTime");
            return (Criteria) this;
        }

        public Criteria andBuyingTimeNotEqualTo(Date value) {
            addCriterion("buyingTime <>", value, "buyingTime");
            return (Criteria) this;
        }

        public Criteria andBuyingTimeGreaterThan(Date value) {
            addCriterion("buyingTime >", value, "buyingTime");
            return (Criteria) this;
        }

        public Criteria andBuyingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("buyingTime >=", value, "buyingTime");
            return (Criteria) this;
        }

        public Criteria andBuyingTimeLessThan(Date value) {
            addCriterion("buyingTime <", value, "buyingTime");
            return (Criteria) this;
        }

        public Criteria andBuyingTimeLessThanOrEqualTo(Date value) {
            addCriterion("buyingTime <=", value, "buyingTime");
            return (Criteria) this;
        }

        public Criteria andBuyingTimeIn(List<Date> values) {
            addCriterion("buyingTime in", values, "buyingTime");
            return (Criteria) this;
        }

        public Criteria andBuyingTimeNotIn(List<Date> values) {
            addCriterion("buyingTime not in", values, "buyingTime");
            return (Criteria) this;
        }

        public Criteria andBuyingTimeBetween(Date value1, Date value2) {
            addCriterion("buyingTime between", value1, value2, "buyingTime");
            return (Criteria) this;
        }

        public Criteria andBuyingTimeNotBetween(Date value1, Date value2) {
            addCriterion("buyingTime not between", value1, value2, "buyingTime");
            return (Criteria) this;
        }

        public Criteria andImeiIsNull() {
            addCriterion("imei is null");
            return (Criteria) this;
        }

        public Criteria andImeiIsNotNull() {
            addCriterion("imei is not null");
            return (Criteria) this;
        }

        public Criteria andImeiEqualTo(String value) {
            addCriterion("imei =", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotEqualTo(String value) {
            addCriterion("imei <>", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThan(String value) {
            addCriterion("imei >", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiGreaterThanOrEqualTo(String value) {
            addCriterion("imei >=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThan(String value) {
            addCriterion("imei <", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLessThanOrEqualTo(String value) {
            addCriterion("imei <=", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiLike(String value) {
            addCriterion("imei like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotLike(String value) {
            addCriterion("imei not like", value, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiIn(List<String> values) {
            addCriterion("imei in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotIn(List<String> values) {
            addCriterion("imei not in", values, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiBetween(String value1, String value2) {
            addCriterion("imei between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andImeiNotBetween(String value1, String value2) {
            addCriterion("imei not between", value1, value2, "imei");
            return (Criteria) this;
        }

        public Criteria andEcidenceIsNull() {
            addCriterion("ecidence is null");
            return (Criteria) this;
        }

        public Criteria andEcidenceIsNotNull() {
            addCriterion("ecidence is not null");
            return (Criteria) this;
        }

        public Criteria andEcidenceEqualTo(String value) {
            addCriterion("ecidence =", value, "ecidence");
            return (Criteria) this;
        }

        public Criteria andEcidenceNotEqualTo(String value) {
            addCriterion("ecidence <>", value, "ecidence");
            return (Criteria) this;
        }

        public Criteria andEcidenceGreaterThan(String value) {
            addCriterion("ecidence >", value, "ecidence");
            return (Criteria) this;
        }

        public Criteria andEcidenceGreaterThanOrEqualTo(String value) {
            addCriterion("ecidence >=", value, "ecidence");
            return (Criteria) this;
        }

        public Criteria andEcidenceLessThan(String value) {
            addCriterion("ecidence <", value, "ecidence");
            return (Criteria) this;
        }

        public Criteria andEcidenceLessThanOrEqualTo(String value) {
            addCriterion("ecidence <=", value, "ecidence");
            return (Criteria) this;
        }

        public Criteria andEcidenceLike(String value) {
            addCriterion("ecidence like", value, "ecidence");
            return (Criteria) this;
        }

        public Criteria andEcidenceNotLike(String value) {
            addCriterion("ecidence not like", value, "ecidence");
            return (Criteria) this;
        }

        public Criteria andEcidenceIn(List<String> values) {
            addCriterion("ecidence in", values, "ecidence");
            return (Criteria) this;
        }

        public Criteria andEcidenceNotIn(List<String> values) {
            addCriterion("ecidence not in", values, "ecidence");
            return (Criteria) this;
        }

        public Criteria andEcidenceBetween(String value1, String value2) {
            addCriterion("ecidence between", value1, value2, "ecidence");
            return (Criteria) this;
        }

        public Criteria andEcidenceNotBetween(String value1, String value2) {
            addCriterion("ecidence not between", value1, value2, "ecidence");
            return (Criteria) this;
        }

        public Criteria andCellPhoneFeaturesIsNull() {
            addCriterion("cellPhoneFeatures is null");
            return (Criteria) this;
        }

        public Criteria andCellPhoneFeaturesIsNotNull() {
            addCriterion("cellPhoneFeatures is not null");
            return (Criteria) this;
        }

        public Criteria andCellPhoneFeaturesEqualTo(String value) {
            addCriterion("cellPhoneFeatures =", value, "cellPhoneFeatures");
            return (Criteria) this;
        }

        public Criteria andCellPhoneFeaturesNotEqualTo(String value) {
            addCriterion("cellPhoneFeatures <>", value, "cellPhoneFeatures");
            return (Criteria) this;
        }

        public Criteria andCellPhoneFeaturesGreaterThan(String value) {
            addCriterion("cellPhoneFeatures >", value, "cellPhoneFeatures");
            return (Criteria) this;
        }

        public Criteria andCellPhoneFeaturesGreaterThanOrEqualTo(String value) {
            addCriterion("cellPhoneFeatures >=", value, "cellPhoneFeatures");
            return (Criteria) this;
        }

        public Criteria andCellPhoneFeaturesLessThan(String value) {
            addCriterion("cellPhoneFeatures <", value, "cellPhoneFeatures");
            return (Criteria) this;
        }

        public Criteria andCellPhoneFeaturesLessThanOrEqualTo(String value) {
            addCriterion("cellPhoneFeatures <=", value, "cellPhoneFeatures");
            return (Criteria) this;
        }

        public Criteria andCellPhoneFeaturesLike(String value) {
            addCriterion("cellPhoneFeatures like", value, "cellPhoneFeatures");
            return (Criteria) this;
        }

        public Criteria andCellPhoneFeaturesNotLike(String value) {
            addCriterion("cellPhoneFeatures not like", value, "cellPhoneFeatures");
            return (Criteria) this;
        }

        public Criteria andCellPhoneFeaturesIn(List<String> values) {
            addCriterion("cellPhoneFeatures in", values, "cellPhoneFeatures");
            return (Criteria) this;
        }

        public Criteria andCellPhoneFeaturesNotIn(List<String> values) {
            addCriterion("cellPhoneFeatures not in", values, "cellPhoneFeatures");
            return (Criteria) this;
        }

        public Criteria andCellPhoneFeaturesBetween(String value1, String value2) {
            addCriterion("cellPhoneFeatures between", value1, value2, "cellPhoneFeatures");
            return (Criteria) this;
        }

        public Criteria andCellPhoneFeaturesNotBetween(String value1, String value2) {
            addCriterion("cellPhoneFeatures not between", value1, value2, "cellPhoneFeatures");
            return (Criteria) this;
        }

        public Criteria andAppealTimeIsNull() {
            addCriterion("appealTime is null");
            return (Criteria) this;
        }

        public Criteria andAppealTimeIsNotNull() {
            addCriterion("appealTime is not null");
            return (Criteria) this;
        }

        public Criteria andAppealTimeEqualTo(Date value) {
            addCriterion("appealTime =", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeNotEqualTo(Date value) {
            addCriterion("appealTime <>", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeGreaterThan(Date value) {
            addCriterion("appealTime >", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("appealTime >=", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeLessThan(Date value) {
            addCriterion("appealTime <", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeLessThanOrEqualTo(Date value) {
            addCriterion("appealTime <=", value, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeIn(List<Date> values) {
            addCriterion("appealTime in", values, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeNotIn(List<Date> values) {
            addCriterion("appealTime not in", values, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeBetween(Date value1, Date value2) {
            addCriterion("appealTime between", value1, value2, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealTimeNotBetween(Date value1, Date value2) {
            addCriterion("appealTime not between", value1, value2, "appealTime");
            return (Criteria) this;
        }

        public Criteria andAppealUsualAddrIsNull() {
            addCriterion("appealUsualAddr is null");
            return (Criteria) this;
        }

        public Criteria andAppealUsualAddrIsNotNull() {
            addCriterion("appealUsualAddr is not null");
            return (Criteria) this;
        }

        public Criteria andAppealUsualAddrEqualTo(String value) {
            addCriterion("appealUsualAddr =", value, "appealUsualAddr");
            return (Criteria) this;
        }

        public Criteria andAppealUsualAddrNotEqualTo(String value) {
            addCriterion("appealUsualAddr <>", value, "appealUsualAddr");
            return (Criteria) this;
        }

        public Criteria andAppealUsualAddrGreaterThan(String value) {
            addCriterion("appealUsualAddr >", value, "appealUsualAddr");
            return (Criteria) this;
        }

        public Criteria andAppealUsualAddrGreaterThanOrEqualTo(String value) {
            addCriterion("appealUsualAddr >=", value, "appealUsualAddr");
            return (Criteria) this;
        }

        public Criteria andAppealUsualAddrLessThan(String value) {
            addCriterion("appealUsualAddr <", value, "appealUsualAddr");
            return (Criteria) this;
        }

        public Criteria andAppealUsualAddrLessThanOrEqualTo(String value) {
            addCriterion("appealUsualAddr <=", value, "appealUsualAddr");
            return (Criteria) this;
        }

        public Criteria andAppealUsualAddrLike(String value) {
            addCriterion("appealUsualAddr like", value, "appealUsualAddr");
            return (Criteria) this;
        }

        public Criteria andAppealUsualAddrNotLike(String value) {
            addCriterion("appealUsualAddr not like", value, "appealUsualAddr");
            return (Criteria) this;
        }

        public Criteria andAppealUsualAddrIn(List<String> values) {
            addCriterion("appealUsualAddr in", values, "appealUsualAddr");
            return (Criteria) this;
        }

        public Criteria andAppealUsualAddrNotIn(List<String> values) {
            addCriterion("appealUsualAddr not in", values, "appealUsualAddr");
            return (Criteria) this;
        }

        public Criteria andAppealUsualAddrBetween(String value1, String value2) {
            addCriterion("appealUsualAddr between", value1, value2, "appealUsualAddr");
            return (Criteria) this;
        }

        public Criteria andAppealUsualAddrNotBetween(String value1, String value2) {
            addCriterion("appealUsualAddr not between", value1, value2, "appealUsualAddr");
            return (Criteria) this;
        }

        public Criteria andComplainTimeIsNull() {
            addCriterion("complainTime is null");
            return (Criteria) this;
        }

        public Criteria andComplainTimeIsNotNull() {
            addCriterion("complainTime is not null");
            return (Criteria) this;
        }

        public Criteria andComplainTimeEqualTo(Date value) {
            addCriterion("complainTime =", value, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeNotEqualTo(Date value) {
            addCriterion("complainTime <>", value, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeGreaterThan(Date value) {
            addCriterion("complainTime >", value, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("complainTime >=", value, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeLessThan(Date value) {
            addCriterion("complainTime <", value, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeLessThanOrEqualTo(Date value) {
            addCriterion("complainTime <=", value, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeIn(List<Date> values) {
            addCriterion("complainTime in", values, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeNotIn(List<Date> values) {
            addCriterion("complainTime not in", values, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeBetween(Date value1, Date value2) {
            addCriterion("complainTime between", value1, value2, "complainTime");
            return (Criteria) this;
        }

        public Criteria andComplainTimeNotBetween(Date value1, Date value2) {
            addCriterion("complainTime not between", value1, value2, "complainTime");
            return (Criteria) this;
        }

        public Criteria andAppealAddrIsNull() {
            addCriterion("appealAddr is null");
            return (Criteria) this;
        }

        public Criteria andAppealAddrIsNotNull() {
            addCriterion("appealAddr is not null");
            return (Criteria) this;
        }

        public Criteria andAppealAddrEqualTo(String value) {
            addCriterion("appealAddr =", value, "appealAddr");
            return (Criteria) this;
        }

        public Criteria andAppealAddrNotEqualTo(String value) {
            addCriterion("appealAddr <>", value, "appealAddr");
            return (Criteria) this;
        }

        public Criteria andAppealAddrGreaterThan(String value) {
            addCriterion("appealAddr >", value, "appealAddr");
            return (Criteria) this;
        }

        public Criteria andAppealAddrGreaterThanOrEqualTo(String value) {
            addCriterion("appealAddr >=", value, "appealAddr");
            return (Criteria) this;
        }

        public Criteria andAppealAddrLessThan(String value) {
            addCriterion("appealAddr <", value, "appealAddr");
            return (Criteria) this;
        }

        public Criteria andAppealAddrLessThanOrEqualTo(String value) {
            addCriterion("appealAddr <=", value, "appealAddr");
            return (Criteria) this;
        }

        public Criteria andAppealAddrLike(String value) {
            addCriterion("appealAddr like", value, "appealAddr");
            return (Criteria) this;
        }

        public Criteria andAppealAddrNotLike(String value) {
            addCriterion("appealAddr not like", value, "appealAddr");
            return (Criteria) this;
        }

        public Criteria andAppealAddrIn(List<String> values) {
            addCriterion("appealAddr in", values, "appealAddr");
            return (Criteria) this;
        }

        public Criteria andAppealAddrNotIn(List<String> values) {
            addCriterion("appealAddr not in", values, "appealAddr");
            return (Criteria) this;
        }

        public Criteria andAppealAddrBetween(String value1, String value2) {
            addCriterion("appealAddr between", value1, value2, "appealAddr");
            return (Criteria) this;
        }

        public Criteria andAppealAddrNotBetween(String value1, String value2) {
            addCriterion("appealAddr not between", value1, value2, "appealAddr");
            return (Criteria) this;
        }

        public Criteria andAppealLongitudeIsNull() {
            addCriterion("appealLongitude is null");
            return (Criteria) this;
        }

        public Criteria andAppealLongitudeIsNotNull() {
            addCriterion("appealLongitude is not null");
            return (Criteria) this;
        }

        public Criteria andAppealLongitudeEqualTo(String value) {
            addCriterion("appealLongitude =", value, "appealLongitude");
            return (Criteria) this;
        }

        public Criteria andAppealLongitudeNotEqualTo(String value) {
            addCriterion("appealLongitude <>", value, "appealLongitude");
            return (Criteria) this;
        }

        public Criteria andAppealLongitudeGreaterThan(String value) {
            addCriterion("appealLongitude >", value, "appealLongitude");
            return (Criteria) this;
        }

        public Criteria andAppealLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("appealLongitude >=", value, "appealLongitude");
            return (Criteria) this;
        }

        public Criteria andAppealLongitudeLessThan(String value) {
            addCriterion("appealLongitude <", value, "appealLongitude");
            return (Criteria) this;
        }

        public Criteria andAppealLongitudeLessThanOrEqualTo(String value) {
            addCriterion("appealLongitude <=", value, "appealLongitude");
            return (Criteria) this;
        }

        public Criteria andAppealLongitudeLike(String value) {
            addCriterion("appealLongitude like", value, "appealLongitude");
            return (Criteria) this;
        }

        public Criteria andAppealLongitudeNotLike(String value) {
            addCriterion("appealLongitude not like", value, "appealLongitude");
            return (Criteria) this;
        }

        public Criteria andAppealLongitudeIn(List<String> values) {
            addCriterion("appealLongitude in", values, "appealLongitude");
            return (Criteria) this;
        }

        public Criteria andAppealLongitudeNotIn(List<String> values) {
            addCriterion("appealLongitude not in", values, "appealLongitude");
            return (Criteria) this;
        }

        public Criteria andAppealLongitudeBetween(String value1, String value2) {
            addCriterion("appealLongitude between", value1, value2, "appealLongitude");
            return (Criteria) this;
        }

        public Criteria andAppealLongitudeNotBetween(String value1, String value2) {
            addCriterion("appealLongitude not between", value1, value2, "appealLongitude");
            return (Criteria) this;
        }

        public Criteria andAppealLatitudeIsNull() {
            addCriterion("appealLatitude is null");
            return (Criteria) this;
        }

        public Criteria andAppealLatitudeIsNotNull() {
            addCriterion("appealLatitude is not null");
            return (Criteria) this;
        }

        public Criteria andAppealLatitudeEqualTo(String value) {
            addCriterion("appealLatitude =", value, "appealLatitude");
            return (Criteria) this;
        }

        public Criteria andAppealLatitudeNotEqualTo(String value) {
            addCriterion("appealLatitude <>", value, "appealLatitude");
            return (Criteria) this;
        }

        public Criteria andAppealLatitudeGreaterThan(String value) {
            addCriterion("appealLatitude >", value, "appealLatitude");
            return (Criteria) this;
        }

        public Criteria andAppealLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("appealLatitude >=", value, "appealLatitude");
            return (Criteria) this;
        }

        public Criteria andAppealLatitudeLessThan(String value) {
            addCriterion("appealLatitude <", value, "appealLatitude");
            return (Criteria) this;
        }

        public Criteria andAppealLatitudeLessThanOrEqualTo(String value) {
            addCriterion("appealLatitude <=", value, "appealLatitude");
            return (Criteria) this;
        }

        public Criteria andAppealLatitudeLike(String value) {
            addCriterion("appealLatitude like", value, "appealLatitude");
            return (Criteria) this;
        }

        public Criteria andAppealLatitudeNotLike(String value) {
            addCriterion("appealLatitude not like", value, "appealLatitude");
            return (Criteria) this;
        }

        public Criteria andAppealLatitudeIn(List<String> values) {
            addCriterion("appealLatitude in", values, "appealLatitude");
            return (Criteria) this;
        }

        public Criteria andAppealLatitudeNotIn(List<String> values) {
            addCriterion("appealLatitude not in", values, "appealLatitude");
            return (Criteria) this;
        }

        public Criteria andAppealLatitudeBetween(String value1, String value2) {
            addCriterion("appealLatitude between", value1, value2, "appealLatitude");
            return (Criteria) this;
        }

        public Criteria andAppealLatitudeNotBetween(String value1, String value2) {
            addCriterion("appealLatitude not between", value1, value2, "appealLatitude");
            return (Criteria) this;
        }

        public Criteria andBuyingAddrIsNull() {
            addCriterion("buyingAddr is null");
            return (Criteria) this;
        }

        public Criteria andBuyingAddrIsNotNull() {
            addCriterion("buyingAddr is not null");
            return (Criteria) this;
        }

        public Criteria andBuyingAddrEqualTo(String value) {
            addCriterion("buyingAddr =", value, "buyingAddr");
            return (Criteria) this;
        }

        public Criteria andBuyingAddrNotEqualTo(String value) {
            addCriterion("buyingAddr <>", value, "buyingAddr");
            return (Criteria) this;
        }

        public Criteria andBuyingAddrGreaterThan(String value) {
            addCriterion("buyingAddr >", value, "buyingAddr");
            return (Criteria) this;
        }

        public Criteria andBuyingAddrGreaterThanOrEqualTo(String value) {
            addCriterion("buyingAddr >=", value, "buyingAddr");
            return (Criteria) this;
        }

        public Criteria andBuyingAddrLessThan(String value) {
            addCriterion("buyingAddr <", value, "buyingAddr");
            return (Criteria) this;
        }

        public Criteria andBuyingAddrLessThanOrEqualTo(String value) {
            addCriterion("buyingAddr <=", value, "buyingAddr");
            return (Criteria) this;
        }

        public Criteria andBuyingAddrLike(String value) {
            addCriterion("buyingAddr like", value, "buyingAddr");
            return (Criteria) this;
        }

        public Criteria andBuyingAddrNotLike(String value) {
            addCriterion("buyingAddr not like", value, "buyingAddr");
            return (Criteria) this;
        }

        public Criteria andBuyingAddrIn(List<String> values) {
            addCriterion("buyingAddr in", values, "buyingAddr");
            return (Criteria) this;
        }

        public Criteria andBuyingAddrNotIn(List<String> values) {
            addCriterion("buyingAddr not in", values, "buyingAddr");
            return (Criteria) this;
        }

        public Criteria andBuyingAddrBetween(String value1, String value2) {
            addCriterion("buyingAddr between", value1, value2, "buyingAddr");
            return (Criteria) this;
        }

        public Criteria andBuyingAddrNotBetween(String value1, String value2) {
            addCriterion("buyingAddr not between", value1, value2, "buyingAddr");
            return (Criteria) this;
        }

        public Criteria andAppealStateIsNull() {
            addCriterion("appealState is null");
            return (Criteria) this;
        }

        public Criteria andAppealStateIsNotNull() {
            addCriterion("appealState is not null");
            return (Criteria) this;
        }

        public Criteria andAppealStateEqualTo(String value) {
            addCriterion("appealState =", value, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateNotEqualTo(String value) {
            addCriterion("appealState <>", value, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateGreaterThan(String value) {
            addCriterion("appealState >", value, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateGreaterThanOrEqualTo(String value) {
            addCriterion("appealState >=", value, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateLessThan(String value) {
            addCriterion("appealState <", value, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateLessThanOrEqualTo(String value) {
            addCriterion("appealState <=", value, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateLike(String value) {
            addCriterion("appealState like", value, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateNotLike(String value) {
            addCriterion("appealState not like", value, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateIn(List<String> values) {
            addCriterion("appealState in", values, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateNotIn(List<String> values) {
            addCriterion("appealState not in", values, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateBetween(String value1, String value2) {
            addCriterion("appealState between", value1, value2, "appealState");
            return (Criteria) this;
        }

        public Criteria andAppealStateNotBetween(String value1, String value2) {
            addCriterion("appealState not between", value1, value2, "appealState");
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