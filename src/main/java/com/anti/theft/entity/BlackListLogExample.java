package com.anti.theft.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlackListLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlackListLogExample() {
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

        public Criteria andQueryTimeIsNull() {
            addCriterion("queryTime is null");
            return (Criteria) this;
        }

        public Criteria andQueryTimeIsNotNull() {
            addCriterion("queryTime is not null");
            return (Criteria) this;
        }

        public Criteria andQueryTimeEqualTo(Date value) {
            addCriterion("queryTime =", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeNotEqualTo(Date value) {
            addCriterion("queryTime <>", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeGreaterThan(Date value) {
            addCriterion("queryTime >", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("queryTime >=", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeLessThan(Date value) {
            addCriterion("queryTime <", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeLessThanOrEqualTo(Date value) {
            addCriterion("queryTime <=", value, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeIn(List<Date> values) {
            addCriterion("queryTime in", values, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeNotIn(List<Date> values) {
            addCriterion("queryTime not in", values, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeBetween(Date value1, Date value2) {
            addCriterion("queryTime between", value1, value2, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryTimeNotBetween(Date value1, Date value2) {
            addCriterion("queryTime not between", value1, value2, "queryTime");
            return (Criteria) this;
        }

        public Criteria andQueryAddressIsNull() {
            addCriterion("queryAddress is null");
            return (Criteria) this;
        }

        public Criteria andQueryAddressIsNotNull() {
            addCriterion("queryAddress is not null");
            return (Criteria) this;
        }

        public Criteria andQueryAddressEqualTo(String value) {
            addCriterion("queryAddress =", value, "queryAddress");
            return (Criteria) this;
        }

        public Criteria andQueryAddressNotEqualTo(String value) {
            addCriterion("queryAddress <>", value, "queryAddress");
            return (Criteria) this;
        }

        public Criteria andQueryAddressGreaterThan(String value) {
            addCriterion("queryAddress >", value, "queryAddress");
            return (Criteria) this;
        }

        public Criteria andQueryAddressGreaterThanOrEqualTo(String value) {
            addCriterion("queryAddress >=", value, "queryAddress");
            return (Criteria) this;
        }

        public Criteria andQueryAddressLessThan(String value) {
            addCriterion("queryAddress <", value, "queryAddress");
            return (Criteria) this;
        }

        public Criteria andQueryAddressLessThanOrEqualTo(String value) {
            addCriterion("queryAddress <=", value, "queryAddress");
            return (Criteria) this;
        }

        public Criteria andQueryAddressLike(String value) {
            addCriterion("queryAddress like", value, "queryAddress");
            return (Criteria) this;
        }

        public Criteria andQueryAddressNotLike(String value) {
            addCriterion("queryAddress not like", value, "queryAddress");
            return (Criteria) this;
        }

        public Criteria andQueryAddressIn(List<String> values) {
            addCriterion("queryAddress in", values, "queryAddress");
            return (Criteria) this;
        }

        public Criteria andQueryAddressNotIn(List<String> values) {
            addCriterion("queryAddress not in", values, "queryAddress");
            return (Criteria) this;
        }

        public Criteria andQueryAddressBetween(String value1, String value2) {
            addCriterion("queryAddress between", value1, value2, "queryAddress");
            return (Criteria) this;
        }

        public Criteria andQueryAddressNotBetween(String value1, String value2) {
            addCriterion("queryAddress not between", value1, value2, "queryAddress");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(String value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(String value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(String value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(String value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(String value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLike(String value) {
            addCriterion("longitude like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotLike(String value) {
            addCriterion("longitude not like", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<String> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<String> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(String value1, String value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(String value1, String value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(String value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(String value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(String value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(String value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(String value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLike(String value) {
            addCriterion("latitude like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotLike(String value) {
            addCriterion("latitude not like", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<String> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<String> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(String value1, String value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(String value1, String value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andQueryResultIsNull() {
            addCriterion("queryResult is null");
            return (Criteria) this;
        }

        public Criteria andQueryResultIsNotNull() {
            addCriterion("queryResult is not null");
            return (Criteria) this;
        }

        public Criteria andQueryResultEqualTo(Integer value) {
            addCriterion("queryResult =", value, "queryResult");
            return (Criteria) this;
        }

        public Criteria andQueryResultNotEqualTo(Integer value) {
            addCriterion("queryResult <>", value, "queryResult");
            return (Criteria) this;
        }

        public Criteria andQueryResultGreaterThan(Integer value) {
            addCriterion("queryResult >", value, "queryResult");
            return (Criteria) this;
        }

        public Criteria andQueryResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("queryResult >=", value, "queryResult");
            return (Criteria) this;
        }

        public Criteria andQueryResultLessThan(Integer value) {
            addCriterion("queryResult <", value, "queryResult");
            return (Criteria) this;
        }

        public Criteria andQueryResultLessThanOrEqualTo(Integer value) {
            addCriterion("queryResult <=", value, "queryResult");
            return (Criteria) this;
        }

        public Criteria andQueryResultIn(List<Integer> values) {
            addCriterion("queryResult in", values, "queryResult");
            return (Criteria) this;
        }

        public Criteria andQueryResultNotIn(List<Integer> values) {
            addCriterion("queryResult not in", values, "queryResult");
            return (Criteria) this;
        }

        public Criteria andQueryResultBetween(Integer value1, Integer value2) {
            addCriterion("queryResult between", value1, value2, "queryResult");
            return (Criteria) this;
        }

        public Criteria andQueryResultNotBetween(Integer value1, Integer value2) {
            addCriterion("queryResult not between", value1, value2, "queryResult");
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