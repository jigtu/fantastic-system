package com.anti.theft.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaseBackoutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaseBackoutExample() {
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

        public Criteria andCase_idIsNull() {
            addCriterion("case_id is null");
            return (Criteria) this;
        }

        public Criteria andCase_idIsNotNull() {
            addCriterion("case_id is not null");
            return (Criteria) this;
        }

        public Criteria andCase_idEqualTo(Integer value) {
            addCriterion("case_id =", value, "case_id");
            return (Criteria) this;
        }

        public Criteria andCase_idNotEqualTo(Integer value) {
            addCriterion("case_id <>", value, "case_id");
            return (Criteria) this;
        }

        public Criteria andCase_idGreaterThan(Integer value) {
            addCriterion("case_id >", value, "case_id");
            return (Criteria) this;
        }

        public Criteria andCase_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("case_id >=", value, "case_id");
            return (Criteria) this;
        }

        public Criteria andCase_idLessThan(Integer value) {
            addCriterion("case_id <", value, "case_id");
            return (Criteria) this;
        }

        public Criteria andCase_idLessThanOrEqualTo(Integer value) {
            addCriterion("case_id <=", value, "case_id");
            return (Criteria) this;
        }

        public Criteria andCase_idIn(List<Integer> values) {
            addCriterion("case_id in", values, "case_id");
            return (Criteria) this;
        }

        public Criteria andCase_idNotIn(List<Integer> values) {
            addCriterion("case_id not in", values, "case_id");
            return (Criteria) this;
        }

        public Criteria andCase_idBetween(Integer value1, Integer value2) {
            addCriterion("case_id between", value1, value2, "case_id");
            return (Criteria) this;
        }

        public Criteria andCase_idNotBetween(Integer value1, Integer value2) {
            addCriterion("case_id not between", value1, value2, "case_id");
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

        public Criteria andBackoutPhoneIsNull() {
            addCriterion("backoutPhone is null");
            return (Criteria) this;
        }

        public Criteria andBackoutPhoneIsNotNull() {
            addCriterion("backoutPhone is not null");
            return (Criteria) this;
        }

        public Criteria andBackoutPhoneEqualTo(String value) {
            addCriterion("backoutPhone =", value, "backoutPhone");
            return (Criteria) this;
        }

        public Criteria andBackoutPhoneNotEqualTo(String value) {
            addCriterion("backoutPhone <>", value, "backoutPhone");
            return (Criteria) this;
        }

        public Criteria andBackoutPhoneGreaterThan(String value) {
            addCriterion("backoutPhone >", value, "backoutPhone");
            return (Criteria) this;
        }

        public Criteria andBackoutPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("backoutPhone >=", value, "backoutPhone");
            return (Criteria) this;
        }

        public Criteria andBackoutPhoneLessThan(String value) {
            addCriterion("backoutPhone <", value, "backoutPhone");
            return (Criteria) this;
        }

        public Criteria andBackoutPhoneLessThanOrEqualTo(String value) {
            addCriterion("backoutPhone <=", value, "backoutPhone");
            return (Criteria) this;
        }

        public Criteria andBackoutPhoneLike(String value) {
            addCriterion("backoutPhone like", value, "backoutPhone");
            return (Criteria) this;
        }

        public Criteria andBackoutPhoneNotLike(String value) {
            addCriterion("backoutPhone not like", value, "backoutPhone");
            return (Criteria) this;
        }

        public Criteria andBackoutPhoneIn(List<String> values) {
            addCriterion("backoutPhone in", values, "backoutPhone");
            return (Criteria) this;
        }

        public Criteria andBackoutPhoneNotIn(List<String> values) {
            addCriterion("backoutPhone not in", values, "backoutPhone");
            return (Criteria) this;
        }

        public Criteria andBackoutPhoneBetween(String value1, String value2) {
            addCriterion("backoutPhone between", value1, value2, "backoutPhone");
            return (Criteria) this;
        }

        public Criteria andBackoutPhoneNotBetween(String value1, String value2) {
            addCriterion("backoutPhone not between", value1, value2, "backoutPhone");
            return (Criteria) this;
        }

        public Criteria andBackoutNameIsNull() {
            addCriterion("backoutName is null");
            return (Criteria) this;
        }

        public Criteria andBackoutNameIsNotNull() {
            addCriterion("backoutName is not null");
            return (Criteria) this;
        }

        public Criteria andBackoutNameEqualTo(String value) {
            addCriterion("backoutName =", value, "backoutName");
            return (Criteria) this;
        }

        public Criteria andBackoutNameNotEqualTo(String value) {
            addCriterion("backoutName <>", value, "backoutName");
            return (Criteria) this;
        }

        public Criteria andBackoutNameGreaterThan(String value) {
            addCriterion("backoutName >", value, "backoutName");
            return (Criteria) this;
        }

        public Criteria andBackoutNameGreaterThanOrEqualTo(String value) {
            addCriterion("backoutName >=", value, "backoutName");
            return (Criteria) this;
        }

        public Criteria andBackoutNameLessThan(String value) {
            addCriterion("backoutName <", value, "backoutName");
            return (Criteria) this;
        }

        public Criteria andBackoutNameLessThanOrEqualTo(String value) {
            addCriterion("backoutName <=", value, "backoutName");
            return (Criteria) this;
        }

        public Criteria andBackoutNameLike(String value) {
            addCriterion("backoutName like", value, "backoutName");
            return (Criteria) this;
        }

        public Criteria andBackoutNameNotLike(String value) {
            addCriterion("backoutName not like", value, "backoutName");
            return (Criteria) this;
        }

        public Criteria andBackoutNameIn(List<String> values) {
            addCriterion("backoutName in", values, "backoutName");
            return (Criteria) this;
        }

        public Criteria andBackoutNameNotIn(List<String> values) {
            addCriterion("backoutName not in", values, "backoutName");
            return (Criteria) this;
        }

        public Criteria andBackoutNameBetween(String value1, String value2) {
            addCriterion("backoutName between", value1, value2, "backoutName");
            return (Criteria) this;
        }

        public Criteria andBackoutNameNotBetween(String value1, String value2) {
            addCriterion("backoutName not between", value1, value2, "backoutName");
            return (Criteria) this;
        }

        public Criteria andBackoutIdCardIsNull() {
            addCriterion("backoutIdCard is null");
            return (Criteria) this;
        }

        public Criteria andBackoutIdCardIsNotNull() {
            addCriterion("backoutIdCard is not null");
            return (Criteria) this;
        }

        public Criteria andBackoutIdCardEqualTo(String value) {
            addCriterion("backoutIdCard =", value, "backoutIdCard");
            return (Criteria) this;
        }

        public Criteria andBackoutIdCardNotEqualTo(String value) {
            addCriterion("backoutIdCard <>", value, "backoutIdCard");
            return (Criteria) this;
        }

        public Criteria andBackoutIdCardGreaterThan(String value) {
            addCriterion("backoutIdCard >", value, "backoutIdCard");
            return (Criteria) this;
        }

        public Criteria andBackoutIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("backoutIdCard >=", value, "backoutIdCard");
            return (Criteria) this;
        }

        public Criteria andBackoutIdCardLessThan(String value) {
            addCriterion("backoutIdCard <", value, "backoutIdCard");
            return (Criteria) this;
        }

        public Criteria andBackoutIdCardLessThanOrEqualTo(String value) {
            addCriterion("backoutIdCard <=", value, "backoutIdCard");
            return (Criteria) this;
        }

        public Criteria andBackoutIdCardLike(String value) {
            addCriterion("backoutIdCard like", value, "backoutIdCard");
            return (Criteria) this;
        }

        public Criteria andBackoutIdCardNotLike(String value) {
            addCriterion("backoutIdCard not like", value, "backoutIdCard");
            return (Criteria) this;
        }

        public Criteria andBackoutIdCardIn(List<String> values) {
            addCriterion("backoutIdCard in", values, "backoutIdCard");
            return (Criteria) this;
        }

        public Criteria andBackoutIdCardNotIn(List<String> values) {
            addCriterion("backoutIdCard not in", values, "backoutIdCard");
            return (Criteria) this;
        }

        public Criteria andBackoutIdCardBetween(String value1, String value2) {
            addCriterion("backoutIdCard between", value1, value2, "backoutIdCard");
            return (Criteria) this;
        }

        public Criteria andBackoutIdCardNotBetween(String value1, String value2) {
            addCriterion("backoutIdCard not between", value1, value2, "backoutIdCard");
            return (Criteria) this;
        }

        public Criteria andBackoutPhotoIsNull() {
            addCriterion("backoutPhoto is null");
            return (Criteria) this;
        }

        public Criteria andBackoutPhotoIsNotNull() {
            addCriterion("backoutPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andBackoutPhotoEqualTo(String value) {
            addCriterion("backoutPhoto =", value, "backoutPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutPhotoNotEqualTo(String value) {
            addCriterion("backoutPhoto <>", value, "backoutPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutPhotoGreaterThan(String value) {
            addCriterion("backoutPhoto >", value, "backoutPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("backoutPhoto >=", value, "backoutPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutPhotoLessThan(String value) {
            addCriterion("backoutPhoto <", value, "backoutPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutPhotoLessThanOrEqualTo(String value) {
            addCriterion("backoutPhoto <=", value, "backoutPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutPhotoLike(String value) {
            addCriterion("backoutPhoto like", value, "backoutPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutPhotoNotLike(String value) {
            addCriterion("backoutPhoto not like", value, "backoutPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutPhotoIn(List<String> values) {
            addCriterion("backoutPhoto in", values, "backoutPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutPhotoNotIn(List<String> values) {
            addCriterion("backoutPhoto not in", values, "backoutPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutPhotoBetween(String value1, String value2) {
            addCriterion("backoutPhoto between", value1, value2, "backoutPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutPhotoNotBetween(String value1, String value2) {
            addCriterion("backoutPhoto not between", value1, value2, "backoutPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutFrontPhotoIsNull() {
            addCriterion("backoutFrontPhoto is null");
            return (Criteria) this;
        }

        public Criteria andBackoutFrontPhotoIsNotNull() {
            addCriterion("backoutFrontPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andBackoutFrontPhotoEqualTo(String value) {
            addCriterion("backoutFrontPhoto =", value, "backoutFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutFrontPhotoNotEqualTo(String value) {
            addCriterion("backoutFrontPhoto <>", value, "backoutFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutFrontPhotoGreaterThan(String value) {
            addCriterion("backoutFrontPhoto >", value, "backoutFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutFrontPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("backoutFrontPhoto >=", value, "backoutFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutFrontPhotoLessThan(String value) {
            addCriterion("backoutFrontPhoto <", value, "backoutFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutFrontPhotoLessThanOrEqualTo(String value) {
            addCriterion("backoutFrontPhoto <=", value, "backoutFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutFrontPhotoLike(String value) {
            addCriterion("backoutFrontPhoto like", value, "backoutFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutFrontPhotoNotLike(String value) {
            addCriterion("backoutFrontPhoto not like", value, "backoutFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutFrontPhotoIn(List<String> values) {
            addCriterion("backoutFrontPhoto in", values, "backoutFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutFrontPhotoNotIn(List<String> values) {
            addCriterion("backoutFrontPhoto not in", values, "backoutFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutFrontPhotoBetween(String value1, String value2) {
            addCriterion("backoutFrontPhoto between", value1, value2, "backoutFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutFrontPhotoNotBetween(String value1, String value2) {
            addCriterion("backoutFrontPhoto not between", value1, value2, "backoutFrontPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutBackPhotoIsNull() {
            addCriterion("backoutBackPhoto is null");
            return (Criteria) this;
        }

        public Criteria andBackoutBackPhotoIsNotNull() {
            addCriterion("backoutBackPhoto is not null");
            return (Criteria) this;
        }

        public Criteria andBackoutBackPhotoEqualTo(String value) {
            addCriterion("backoutBackPhoto =", value, "backoutBackPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutBackPhotoNotEqualTo(String value) {
            addCriterion("backoutBackPhoto <>", value, "backoutBackPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutBackPhotoGreaterThan(String value) {
            addCriterion("backoutBackPhoto >", value, "backoutBackPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutBackPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("backoutBackPhoto >=", value, "backoutBackPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutBackPhotoLessThan(String value) {
            addCriterion("backoutBackPhoto <", value, "backoutBackPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutBackPhotoLessThanOrEqualTo(String value) {
            addCriterion("backoutBackPhoto <=", value, "backoutBackPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutBackPhotoLike(String value) {
            addCriterion("backoutBackPhoto like", value, "backoutBackPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutBackPhotoNotLike(String value) {
            addCriterion("backoutBackPhoto not like", value, "backoutBackPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutBackPhotoIn(List<String> values) {
            addCriterion("backoutBackPhoto in", values, "backoutBackPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutBackPhotoNotIn(List<String> values) {
            addCriterion("backoutBackPhoto not in", values, "backoutBackPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutBackPhotoBetween(String value1, String value2) {
            addCriterion("backoutBackPhoto between", value1, value2, "backoutBackPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutBackPhotoNotBetween(String value1, String value2) {
            addCriterion("backoutBackPhoto not between", value1, value2, "backoutBackPhoto");
            return (Criteria) this;
        }

        public Criteria andBackoutResonIsNull() {
            addCriterion("backoutReson is null");
            return (Criteria) this;
        }

        public Criteria andBackoutResonIsNotNull() {
            addCriterion("backoutReson is not null");
            return (Criteria) this;
        }

        public Criteria andBackoutResonEqualTo(String value) {
            addCriterion("backoutReson =", value, "backoutReson");
            return (Criteria) this;
        }

        public Criteria andBackoutResonNotEqualTo(String value) {
            addCriterion("backoutReson <>", value, "backoutReson");
            return (Criteria) this;
        }

        public Criteria andBackoutResonGreaterThan(String value) {
            addCriterion("backoutReson >", value, "backoutReson");
            return (Criteria) this;
        }

        public Criteria andBackoutResonGreaterThanOrEqualTo(String value) {
            addCriterion("backoutReson >=", value, "backoutReson");
            return (Criteria) this;
        }

        public Criteria andBackoutResonLessThan(String value) {
            addCriterion("backoutReson <", value, "backoutReson");
            return (Criteria) this;
        }

        public Criteria andBackoutResonLessThanOrEqualTo(String value) {
            addCriterion("backoutReson <=", value, "backoutReson");
            return (Criteria) this;
        }

        public Criteria andBackoutResonLike(String value) {
            addCriterion("backoutReson like", value, "backoutReson");
            return (Criteria) this;
        }

        public Criteria andBackoutResonNotLike(String value) {
            addCriterion("backoutReson not like", value, "backoutReson");
            return (Criteria) this;
        }

        public Criteria andBackoutResonIn(List<String> values) {
            addCriterion("backoutReson in", values, "backoutReson");
            return (Criteria) this;
        }

        public Criteria andBackoutResonNotIn(List<String> values) {
            addCriterion("backoutReson not in", values, "backoutReson");
            return (Criteria) this;
        }

        public Criteria andBackoutResonBetween(String value1, String value2) {
            addCriterion("backoutReson between", value1, value2, "backoutReson");
            return (Criteria) this;
        }

        public Criteria andBackoutResonNotBetween(String value1, String value2) {
            addCriterion("backoutReson not between", value1, value2, "backoutReson");
            return (Criteria) this;
        }

        public Criteria andBackoutTimeIsNull() {
            addCriterion("backoutTime is null");
            return (Criteria) this;
        }

        public Criteria andBackoutTimeIsNotNull() {
            addCriterion("backoutTime is not null");
            return (Criteria) this;
        }

        public Criteria andBackoutTimeEqualTo(Date value) {
            addCriterion("backoutTime =", value, "backoutTime");
            return (Criteria) this;
        }

        public Criteria andBackoutTimeNotEqualTo(Date value) {
            addCriterion("backoutTime <>", value, "backoutTime");
            return (Criteria) this;
        }

        public Criteria andBackoutTimeGreaterThan(Date value) {
            addCriterion("backoutTime >", value, "backoutTime");
            return (Criteria) this;
        }

        public Criteria andBackoutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("backoutTime >=", value, "backoutTime");
            return (Criteria) this;
        }

        public Criteria andBackoutTimeLessThan(Date value) {
            addCriterion("backoutTime <", value, "backoutTime");
            return (Criteria) this;
        }

        public Criteria andBackoutTimeLessThanOrEqualTo(Date value) {
            addCriterion("backoutTime <=", value, "backoutTime");
            return (Criteria) this;
        }

        public Criteria andBackoutTimeIn(List<Date> values) {
            addCriterion("backoutTime in", values, "backoutTime");
            return (Criteria) this;
        }

        public Criteria andBackoutTimeNotIn(List<Date> values) {
            addCriterion("backoutTime not in", values, "backoutTime");
            return (Criteria) this;
        }

        public Criteria andBackoutTimeBetween(Date value1, Date value2) {
            addCriterion("backoutTime between", value1, value2, "backoutTime");
            return (Criteria) this;
        }

        public Criteria andBackoutTimeNotBetween(Date value1, Date value2) {
            addCriterion("backoutTime not between", value1, value2, "backoutTime");
            return (Criteria) this;
        }

        public Criteria andBackoutStatusIsNull() {
            addCriterion("backoutStatus is null");
            return (Criteria) this;
        }

        public Criteria andBackoutStatusIsNotNull() {
            addCriterion("backoutStatus is not null");
            return (Criteria) this;
        }

        public Criteria andBackoutStatusEqualTo(String value) {
            addCriterion("backoutStatus =", value, "backoutStatus");
            return (Criteria) this;
        }

        public Criteria andBackoutStatusNotEqualTo(String value) {
            addCriterion("backoutStatus <>", value, "backoutStatus");
            return (Criteria) this;
        }

        public Criteria andBackoutStatusGreaterThan(String value) {
            addCriterion("backoutStatus >", value, "backoutStatus");
            return (Criteria) this;
        }

        public Criteria andBackoutStatusGreaterThanOrEqualTo(String value) {
            addCriterion("backoutStatus >=", value, "backoutStatus");
            return (Criteria) this;
        }

        public Criteria andBackoutStatusLessThan(String value) {
            addCriterion("backoutStatus <", value, "backoutStatus");
            return (Criteria) this;
        }

        public Criteria andBackoutStatusLessThanOrEqualTo(String value) {
            addCriterion("backoutStatus <=", value, "backoutStatus");
            return (Criteria) this;
        }

        public Criteria andBackoutStatusLike(String value) {
            addCriterion("backoutStatus like", value, "backoutStatus");
            return (Criteria) this;
        }

        public Criteria andBackoutStatusNotLike(String value) {
            addCriterion("backoutStatus not like", value, "backoutStatus");
            return (Criteria) this;
        }

        public Criteria andBackoutStatusIn(List<String> values) {
            addCriterion("backoutStatus in", values, "backoutStatus");
            return (Criteria) this;
        }

        public Criteria andBackoutStatusNotIn(List<String> values) {
            addCriterion("backoutStatus not in", values, "backoutStatus");
            return (Criteria) this;
        }

        public Criteria andBackoutStatusBetween(String value1, String value2) {
            addCriterion("backoutStatus between", value1, value2, "backoutStatus");
            return (Criteria) this;
        }

        public Criteria andBackoutStatusNotBetween(String value1, String value2) {
            addCriterion("backoutStatus not between", value1, value2, "backoutStatus");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceIsNull() {
            addCriterion("backoutPlace is null");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceIsNotNull() {
            addCriterion("backoutPlace is not null");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceEqualTo(String value) {
            addCriterion("backoutPlace =", value, "backoutPlace");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceNotEqualTo(String value) {
            addCriterion("backoutPlace <>", value, "backoutPlace");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceGreaterThan(String value) {
            addCriterion("backoutPlace >", value, "backoutPlace");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("backoutPlace >=", value, "backoutPlace");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLessThan(String value) {
            addCriterion("backoutPlace <", value, "backoutPlace");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLessThanOrEqualTo(String value) {
            addCriterion("backoutPlace <=", value, "backoutPlace");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLike(String value) {
            addCriterion("backoutPlace like", value, "backoutPlace");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceNotLike(String value) {
            addCriterion("backoutPlace not like", value, "backoutPlace");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceIn(List<String> values) {
            addCriterion("backoutPlace in", values, "backoutPlace");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceNotIn(List<String> values) {
            addCriterion("backoutPlace not in", values, "backoutPlace");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceBetween(String value1, String value2) {
            addCriterion("backoutPlace between", value1, value2, "backoutPlace");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceNotBetween(String value1, String value2) {
            addCriterion("backoutPlace not between", value1, value2, "backoutPlace");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLongitudeIsNull() {
            addCriterion("backoutPlaceLongitude is null");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLongitudeIsNotNull() {
            addCriterion("backoutPlaceLongitude is not null");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLongitudeEqualTo(String value) {
            addCriterion("backoutPlaceLongitude =", value, "backoutPlaceLongitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLongitudeNotEqualTo(String value) {
            addCriterion("backoutPlaceLongitude <>", value, "backoutPlaceLongitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLongitudeGreaterThan(String value) {
            addCriterion("backoutPlaceLongitude >", value, "backoutPlaceLongitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("backoutPlaceLongitude >=", value, "backoutPlaceLongitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLongitudeLessThan(String value) {
            addCriterion("backoutPlaceLongitude <", value, "backoutPlaceLongitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLongitudeLessThanOrEqualTo(String value) {
            addCriterion("backoutPlaceLongitude <=", value, "backoutPlaceLongitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLongitudeLike(String value) {
            addCriterion("backoutPlaceLongitude like", value, "backoutPlaceLongitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLongitudeNotLike(String value) {
            addCriterion("backoutPlaceLongitude not like", value, "backoutPlaceLongitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLongitudeIn(List<String> values) {
            addCriterion("backoutPlaceLongitude in", values, "backoutPlaceLongitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLongitudeNotIn(List<String> values) {
            addCriterion("backoutPlaceLongitude not in", values, "backoutPlaceLongitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLongitudeBetween(String value1, String value2) {
            addCriterion("backoutPlaceLongitude between", value1, value2, "backoutPlaceLongitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLongitudeNotBetween(String value1, String value2) {
            addCriterion("backoutPlaceLongitude not between", value1, value2, "backoutPlaceLongitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLatitudeIsNull() {
            addCriterion("backoutPlaceLatitude is null");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLatitudeIsNotNull() {
            addCriterion("backoutPlaceLatitude is not null");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLatitudeEqualTo(String value) {
            addCriterion("backoutPlaceLatitude =", value, "backoutPlaceLatitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLatitudeNotEqualTo(String value) {
            addCriterion("backoutPlaceLatitude <>", value, "backoutPlaceLatitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLatitudeGreaterThan(String value) {
            addCriterion("backoutPlaceLatitude >", value, "backoutPlaceLatitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("backoutPlaceLatitude >=", value, "backoutPlaceLatitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLatitudeLessThan(String value) {
            addCriterion("backoutPlaceLatitude <", value, "backoutPlaceLatitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLatitudeLessThanOrEqualTo(String value) {
            addCriterion("backoutPlaceLatitude <=", value, "backoutPlaceLatitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLatitudeLike(String value) {
            addCriterion("backoutPlaceLatitude like", value, "backoutPlaceLatitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLatitudeNotLike(String value) {
            addCriterion("backoutPlaceLatitude not like", value, "backoutPlaceLatitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLatitudeIn(List<String> values) {
            addCriterion("backoutPlaceLatitude in", values, "backoutPlaceLatitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLatitudeNotIn(List<String> values) {
            addCriterion("backoutPlaceLatitude not in", values, "backoutPlaceLatitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLatitudeBetween(String value1, String value2) {
            addCriterion("backoutPlaceLatitude between", value1, value2, "backoutPlaceLatitude");
            return (Criteria) this;
        }

        public Criteria andBackoutPlaceLatitudeNotBetween(String value1, String value2) {
            addCriterion("backoutPlaceLatitude not between", value1, value2, "backoutPlaceLatitude");
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