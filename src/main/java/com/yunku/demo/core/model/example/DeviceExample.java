package com.yunku.demo.core.model.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceExample() {
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

        public Criteria andDeviceCodeIsNull() {
            addCriterion("device_code is null");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeIsNotNull() {
            addCriterion("device_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeEqualTo(String value) {
            addCriterion("device_code =", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeNotEqualTo(String value) {
            addCriterion("device_code <>", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeGreaterThan(String value) {
            addCriterion("device_code >", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("device_code >=", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeLessThan(String value) {
            addCriterion("device_code <", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeLessThanOrEqualTo(String value) {
            addCriterion("device_code <=", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeLike(String value) {
            addCriterion("device_code like", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeNotLike(String value) {
            addCriterion("device_code not like", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeIn(List<String> values) {
            addCriterion("device_code in", values, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeNotIn(List<String> values) {
            addCriterion("device_code not in", values, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeBetween(String value1, String value2) {
            addCriterion("device_code between", value1, value2, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeNotBetween(String value1, String value2) {
            addCriterion("device_code not between", value1, value2, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNull() {
            addCriterion("areaname is null");
            return (Criteria) this;
        }

        public Criteria andAreanameIsNotNull() {
            addCriterion("areaname is not null");
            return (Criteria) this;
        }

        public Criteria andAreanameEqualTo(String value) {
            addCriterion("areaname =", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotEqualTo(String value) {
            addCriterion("areaname <>", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThan(String value) {
            addCriterion("areaname >", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameGreaterThanOrEqualTo(String value) {
            addCriterion("areaname >=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThan(String value) {
            addCriterion("areaname <", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLessThanOrEqualTo(String value) {
            addCriterion("areaname <=", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameLike(String value) {
            addCriterion("areaname like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotLike(String value) {
            addCriterion("areaname not like", value, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameIn(List<String> values) {
            addCriterion("areaname in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotIn(List<String> values) {
            addCriterion("areaname not in", values, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameBetween(String value1, String value2) {
            addCriterion("areaname between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andAreanameNotBetween(String value1, String value2) {
            addCriterion("areaname not between", value1, value2, "areaname");
            return (Criteria) this;
        }

        public Criteria andMaintainerIsNull() {
            addCriterion("maintainer is null");
            return (Criteria) this;
        }

        public Criteria andMaintainerIsNotNull() {
            addCriterion("maintainer is not null");
            return (Criteria) this;
        }

        public Criteria andMaintainerEqualTo(String value) {
            addCriterion("maintainer =", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotEqualTo(String value) {
            addCriterion("maintainer <>", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerGreaterThan(String value) {
            addCriterion("maintainer >", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerGreaterThanOrEqualTo(String value) {
            addCriterion("maintainer >=", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerLessThan(String value) {
            addCriterion("maintainer <", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerLessThanOrEqualTo(String value) {
            addCriterion("maintainer <=", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerLike(String value) {
            addCriterion("maintainer like", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotLike(String value) {
            addCriterion("maintainer not like", value, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerIn(List<String> values) {
            addCriterion("maintainer in", values, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotIn(List<String> values) {
            addCriterion("maintainer not in", values, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerBetween(String value1, String value2) {
            addCriterion("maintainer between", value1, value2, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMaintainerNotBetween(String value1, String value2) {
            addCriterion("maintainer not between", value1, value2, "maintainer");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusIsNull() {
            addCriterion("online_status is null");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusIsNotNull() {
            addCriterion("online_status is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusEqualTo(Integer value) {
            addCriterion("online_status =", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotEqualTo(Integer value) {
            addCriterion("online_status <>", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusGreaterThan(Integer value) {
            addCriterion("online_status >", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("online_status >=", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusLessThan(Integer value) {
            addCriterion("online_status <", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusLessThanOrEqualTo(Integer value) {
            addCriterion("online_status <=", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusIn(List<Integer> values) {
            addCriterion("online_status in", values, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotIn(List<Integer> values) {
            addCriterion("online_status not in", values, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusBetween(Integer value1, Integer value2) {
            addCriterion("online_status between", value1, value2, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("online_status not between", value1, value2, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPayStrategyIdIsNull() {
            addCriterion("pay_strategy_id is null");
            return (Criteria) this;
        }

        public Criteria andPayStrategyIdIsNotNull() {
            addCriterion("pay_strategy_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayStrategyIdEqualTo(Long value) {
            addCriterion("pay_strategy_id =", value, "payStrategyId");
            return (Criteria) this;
        }

        public Criteria andPayStrategyIdNotEqualTo(Long value) {
            addCriterion("pay_strategy_id <>", value, "payStrategyId");
            return (Criteria) this;
        }

        public Criteria andPayStrategyIdGreaterThan(Long value) {
            addCriterion("pay_strategy_id >", value, "payStrategyId");
            return (Criteria) this;
        }

        public Criteria andPayStrategyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_strategy_id >=", value, "payStrategyId");
            return (Criteria) this;
        }

        public Criteria andPayStrategyIdLessThan(Long value) {
            addCriterion("pay_strategy_id <", value, "payStrategyId");
            return (Criteria) this;
        }

        public Criteria andPayStrategyIdLessThanOrEqualTo(Long value) {
            addCriterion("pay_strategy_id <=", value, "payStrategyId");
            return (Criteria) this;
        }

        public Criteria andPayStrategyIdIn(List<Long> values) {
            addCriterion("pay_strategy_id in", values, "payStrategyId");
            return (Criteria) this;
        }

        public Criteria andPayStrategyIdNotIn(List<Long> values) {
            addCriterion("pay_strategy_id not in", values, "payStrategyId");
            return (Criteria) this;
        }

        public Criteria andPayStrategyIdBetween(Long value1, Long value2) {
            addCriterion("pay_strategy_id between", value1, value2, "payStrategyId");
            return (Criteria) this;
        }

        public Criteria andPayStrategyIdNotBetween(Long value1, Long value2) {
            addCriterion("pay_strategy_id not between", value1, value2, "payStrategyId");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIdIsNull() {
            addCriterion("charge_time_id is null");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIdIsNotNull() {
            addCriterion("charge_time_id is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIdEqualTo(Integer value) {
            addCriterion("charge_time_id =", value, "chargeTimeId");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIdNotEqualTo(Integer value) {
            addCriterion("charge_time_id <>", value, "chargeTimeId");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIdGreaterThan(Integer value) {
            addCriterion("charge_time_id >", value, "chargeTimeId");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("charge_time_id >=", value, "chargeTimeId");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIdLessThan(Integer value) {
            addCriterion("charge_time_id <", value, "chargeTimeId");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIdLessThanOrEqualTo(Integer value) {
            addCriterion("charge_time_id <=", value, "chargeTimeId");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIdIn(List<Integer> values) {
            addCriterion("charge_time_id in", values, "chargeTimeId");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIdNotIn(List<Integer> values) {
            addCriterion("charge_time_id not in", values, "chargeTimeId");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIdBetween(Integer value1, Integer value2) {
            addCriterion("charge_time_id between", value1, value2, "chargeTimeId");
            return (Criteria) this;
        }

        public Criteria andChargeTimeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("charge_time_id not between", value1, value2, "chargeTimeId");
            return (Criteria) this;
        }

        public Criteria andEncryptionIsNull() {
            addCriterion("encryption is null");
            return (Criteria) this;
        }

        public Criteria andEncryptionIsNotNull() {
            addCriterion("encryption is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptionEqualTo(Integer value) {
            addCriterion("encryption =", value, "encryption");
            return (Criteria) this;
        }

        public Criteria andEncryptionNotEqualTo(Integer value) {
            addCriterion("encryption <>", value, "encryption");
            return (Criteria) this;
        }

        public Criteria andEncryptionGreaterThan(Integer value) {
            addCriterion("encryption >", value, "encryption");
            return (Criteria) this;
        }

        public Criteria andEncryptionGreaterThanOrEqualTo(Integer value) {
            addCriterion("encryption >=", value, "encryption");
            return (Criteria) this;
        }

        public Criteria andEncryptionLessThan(Integer value) {
            addCriterion("encryption <", value, "encryption");
            return (Criteria) this;
        }

        public Criteria andEncryptionLessThanOrEqualTo(Integer value) {
            addCriterion("encryption <=", value, "encryption");
            return (Criteria) this;
        }

        public Criteria andEncryptionIn(List<Integer> values) {
            addCriterion("encryption in", values, "encryption");
            return (Criteria) this;
        }

        public Criteria andEncryptionNotIn(List<Integer> values) {
            addCriterion("encryption not in", values, "encryption");
            return (Criteria) this;
        }

        public Criteria andEncryptionBetween(Integer value1, Integer value2) {
            addCriterion("encryption between", value1, value2, "encryption");
            return (Criteria) this;
        }

        public Criteria andEncryptionNotBetween(Integer value1, Integer value2) {
            addCriterion("encryption not between", value1, value2, "encryption");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyIsNull() {
            addCriterion("private_key is null");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyIsNotNull() {
            addCriterion("private_key is not null");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyEqualTo(String value) {
            addCriterion("private_key =", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyNotEqualTo(String value) {
            addCriterion("private_key <>", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyGreaterThan(String value) {
            addCriterion("private_key >", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyGreaterThanOrEqualTo(String value) {
            addCriterion("private_key >=", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyLessThan(String value) {
            addCriterion("private_key <", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyLessThanOrEqualTo(String value) {
            addCriterion("private_key <=", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyLike(String value) {
            addCriterion("private_key like", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyNotLike(String value) {
            addCriterion("private_key not like", value, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyIn(List<String> values) {
            addCriterion("private_key in", values, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyNotIn(List<String> values) {
            addCriterion("private_key not in", values, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyBetween(String value1, String value2) {
            addCriterion("private_key between", value1, value2, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPrivateKeyNotBetween(String value1, String value2) {
            addCriterion("private_key not between", value1, value2, "privateKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyIsNull() {
            addCriterion("public_key is null");
            return (Criteria) this;
        }

        public Criteria andPublicKeyIsNotNull() {
            addCriterion("public_key is not null");
            return (Criteria) this;
        }

        public Criteria andPublicKeyEqualTo(String value) {
            addCriterion("public_key =", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotEqualTo(String value) {
            addCriterion("public_key <>", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyGreaterThan(String value) {
            addCriterion("public_key >", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyGreaterThanOrEqualTo(String value) {
            addCriterion("public_key >=", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyLessThan(String value) {
            addCriterion("public_key <", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyLessThanOrEqualTo(String value) {
            addCriterion("public_key <=", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyLike(String value) {
            addCriterion("public_key like", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotLike(String value) {
            addCriterion("public_key not like", value, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyIn(List<String> values) {
            addCriterion("public_key in", values, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotIn(List<String> values) {
            addCriterion("public_key not in", values, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyBetween(String value1, String value2) {
            addCriterion("public_key between", value1, value2, "publicKey");
            return (Criteria) this;
        }

        public Criteria andPublicKeyNotBetween(String value1, String value2) {
            addCriterion("public_key not between", value1, value2, "publicKey");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeIsNull() {
            addCriterion("bind_time is null");
            return (Criteria) this;
        }

        public Criteria andBindTimeIsNotNull() {
            addCriterion("bind_time is not null");
            return (Criteria) this;
        }

        public Criteria andBindTimeEqualTo(Date value) {
            addCriterion("bind_time =", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeNotEqualTo(Date value) {
            addCriterion("bind_time <>", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeGreaterThan(Date value) {
            addCriterion("bind_time >", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bind_time >=", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeLessThan(Date value) {
            addCriterion("bind_time <", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeLessThanOrEqualTo(Date value) {
            addCriterion("bind_time <=", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeIn(List<Date> values) {
            addCriterion("bind_time in", values, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeNotIn(List<Date> values) {
            addCriterion("bind_time not in", values, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeBetween(Date value1, Date value2) {
            addCriterion("bind_time between", value1, value2, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeNotBetween(Date value1, Date value2) {
            addCriterion("bind_time not between", value1, value2, "bindTime");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeIsNull() {
            addCriterion("unbind_time is null");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeIsNotNull() {
            addCriterion("unbind_time is not null");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeEqualTo(Date value) {
            addCriterion("unbind_time =", value, "unbindTime");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeNotEqualTo(Date value) {
            addCriterion("unbind_time <>", value, "unbindTime");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeGreaterThan(Date value) {
            addCriterion("unbind_time >", value, "unbindTime");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("unbind_time >=", value, "unbindTime");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeLessThan(Date value) {
            addCriterion("unbind_time <", value, "unbindTime");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeLessThanOrEqualTo(Date value) {
            addCriterion("unbind_time <=", value, "unbindTime");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeIn(List<Date> values) {
            addCriterion("unbind_time in", values, "unbindTime");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeNotIn(List<Date> values) {
            addCriterion("unbind_time not in", values, "unbindTime");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeBetween(Date value1, Date value2) {
            addCriterion("unbind_time between", value1, value2, "unbindTime");
            return (Criteria) this;
        }

        public Criteria andUnbindTimeNotBetween(Date value1, Date value2) {
            addCriterion("unbind_time not between", value1, value2, "unbindTime");
            return (Criteria) this;
        }

        public Criteria andOvertimeIsNull() {
            addCriterion("overtime is null");
            return (Criteria) this;
        }

        public Criteria andOvertimeIsNotNull() {
            addCriterion("overtime is not null");
            return (Criteria) this;
        }

        public Criteria andOvertimeEqualTo(Integer value) {
            addCriterion("overtime =", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotEqualTo(Integer value) {
            addCriterion("overtime <>", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeGreaterThan(Integer value) {
            addCriterion("overtime >", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("overtime >=", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeLessThan(Integer value) {
            addCriterion("overtime <", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeLessThanOrEqualTo(Integer value) {
            addCriterion("overtime <=", value, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeIn(List<Integer> values) {
            addCriterion("overtime in", values, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotIn(List<Integer> values) {
            addCriterion("overtime not in", values, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeBetween(Integer value1, Integer value2) {
            addCriterion("overtime between", value1, value2, "overtime");
            return (Criteria) this;
        }

        public Criteria andOvertimeNotBetween(Integer value1, Integer value2) {
            addCriterion("overtime not between", value1, value2, "overtime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeIsNull() {
            addCriterion("alipay_code is null");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeIsNotNull() {
            addCriterion("alipay_code is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeEqualTo(String value) {
            addCriterion("alipay_code =", value, "alipayCode");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeNotEqualTo(String value) {
            addCriterion("alipay_code <>", value, "alipayCode");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeGreaterThan(String value) {
            addCriterion("alipay_code >", value, "alipayCode");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeGreaterThanOrEqualTo(String value) {
            addCriterion("alipay_code >=", value, "alipayCode");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeLessThan(String value) {
            addCriterion("alipay_code <", value, "alipayCode");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeLessThanOrEqualTo(String value) {
            addCriterion("alipay_code <=", value, "alipayCode");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeLike(String value) {
            addCriterion("alipay_code like", value, "alipayCode");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeNotLike(String value) {
            addCriterion("alipay_code not like", value, "alipayCode");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeIn(List<String> values) {
            addCriterion("alipay_code in", values, "alipayCode");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeNotIn(List<String> values) {
            addCriterion("alipay_code not in", values, "alipayCode");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeBetween(String value1, String value2) {
            addCriterion("alipay_code between", value1, value2, "alipayCode");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeNotBetween(String value1, String value2) {
            addCriterion("alipay_code not between", value1, value2, "alipayCode");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdIsNull() {
            addCriterion("device_type_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdIsNotNull() {
            addCriterion("device_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdEqualTo(Integer value) {
            addCriterion("device_type_id =", value, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdNotEqualTo(Integer value) {
            addCriterion("device_type_id <>", value, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdGreaterThan(Integer value) {
            addCriterion("device_type_id >", value, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_type_id >=", value, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdLessThan(Integer value) {
            addCriterion("device_type_id <", value, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_type_id <=", value, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdIn(List<Integer> values) {
            addCriterion("device_type_id in", values, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdNotIn(List<Integer> values) {
            addCriterion("device_type_id not in", values, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("device_type_id between", value1, value2, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_type_id not between", value1, value2, "deviceTypeId");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIdIsNull() {
            addCriterion("settle_type_id is null");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIdIsNotNull() {
            addCriterion("settle_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIdEqualTo(Long value) {
            addCriterion("settle_type_id =", value, "settleTypeId");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIdNotEqualTo(Long value) {
            addCriterion("settle_type_id <>", value, "settleTypeId");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIdGreaterThan(Long value) {
            addCriterion("settle_type_id >", value, "settleTypeId");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("settle_type_id >=", value, "settleTypeId");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIdLessThan(Long value) {
            addCriterion("settle_type_id <", value, "settleTypeId");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("settle_type_id <=", value, "settleTypeId");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIdIn(List<Long> values) {
            addCriterion("settle_type_id in", values, "settleTypeId");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIdNotIn(List<Long> values) {
            addCriterion("settle_type_id not in", values, "settleTypeId");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIdBetween(Long value1, Long value2) {
            addCriterion("settle_type_id between", value1, value2, "settleTypeId");
            return (Criteria) this;
        }

        public Criteria andSettleTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("settle_type_id not between", value1, value2, "settleTypeId");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeFlagIsNull() {
            addCriterion("alipay_code_flag is null");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeFlagIsNotNull() {
            addCriterion("alipay_code_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeFlagEqualTo(Integer value) {
            addCriterion("alipay_code_flag =", value, "alipayCodeFlag");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeFlagNotEqualTo(Integer value) {
            addCriterion("alipay_code_flag <>", value, "alipayCodeFlag");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeFlagGreaterThan(Integer value) {
            addCriterion("alipay_code_flag >", value, "alipayCodeFlag");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("alipay_code_flag >=", value, "alipayCodeFlag");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeFlagLessThan(Integer value) {
            addCriterion("alipay_code_flag <", value, "alipayCodeFlag");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeFlagLessThanOrEqualTo(Integer value) {
            addCriterion("alipay_code_flag <=", value, "alipayCodeFlag");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeFlagIn(List<Integer> values) {
            addCriterion("alipay_code_flag in", values, "alipayCodeFlag");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeFlagNotIn(List<Integer> values) {
            addCriterion("alipay_code_flag not in", values, "alipayCodeFlag");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeFlagBetween(Integer value1, Integer value2) {
            addCriterion("alipay_code_flag between", value1, value2, "alipayCodeFlag");
            return (Criteria) this;
        }

        public Criteria andAlipayCodeFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("alipay_code_flag not between", value1, value2, "alipayCodeFlag");
            return (Criteria) this;
        }

        public Criteria andDebugFlagIsNull() {
            addCriterion("debug_flag is null");
            return (Criteria) this;
        }

        public Criteria andDebugFlagIsNotNull() {
            addCriterion("debug_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDebugFlagEqualTo(Integer value) {
            addCriterion("debug_flag =", value, "debugFlag");
            return (Criteria) this;
        }

        public Criteria andDebugFlagNotEqualTo(Integer value) {
            addCriterion("debug_flag <>", value, "debugFlag");
            return (Criteria) this;
        }

        public Criteria andDebugFlagGreaterThan(Integer value) {
            addCriterion("debug_flag >", value, "debugFlag");
            return (Criteria) this;
        }

        public Criteria andDebugFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("debug_flag >=", value, "debugFlag");
            return (Criteria) this;
        }

        public Criteria andDebugFlagLessThan(Integer value) {
            addCriterion("debug_flag <", value, "debugFlag");
            return (Criteria) this;
        }

        public Criteria andDebugFlagLessThanOrEqualTo(Integer value) {
            addCriterion("debug_flag <=", value, "debugFlag");
            return (Criteria) this;
        }

        public Criteria andDebugFlagIn(List<Integer> values) {
            addCriterion("debug_flag in", values, "debugFlag");
            return (Criteria) this;
        }

        public Criteria andDebugFlagNotIn(List<Integer> values) {
            addCriterion("debug_flag not in", values, "debugFlag");
            return (Criteria) this;
        }

        public Criteria andDebugFlagBetween(Integer value1, Integer value2) {
            addCriterion("debug_flag between", value1, value2, "debugFlag");
            return (Criteria) this;
        }

        public Criteria andDebugFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("debug_flag not between", value1, value2, "debugFlag");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andHardwareIsNull() {
            addCriterion("hardware is null");
            return (Criteria) this;
        }

        public Criteria andHardwareIsNotNull() {
            addCriterion("hardware is not null");
            return (Criteria) this;
        }

        public Criteria andHardwareEqualTo(Integer value) {
            addCriterion("hardware =", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareNotEqualTo(Integer value) {
            addCriterion("hardware <>", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareGreaterThan(Integer value) {
            addCriterion("hardware >", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareGreaterThanOrEqualTo(Integer value) {
            addCriterion("hardware >=", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareLessThan(Integer value) {
            addCriterion("hardware <", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareLessThanOrEqualTo(Integer value) {
            addCriterion("hardware <=", value, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareIn(List<Integer> values) {
            addCriterion("hardware in", values, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareNotIn(List<Integer> values) {
            addCriterion("hardware not in", values, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareBetween(Integer value1, Integer value2) {
            addCriterion("hardware between", value1, value2, "hardware");
            return (Criteria) this;
        }

        public Criteria andHardwareNotBetween(Integer value1, Integer value2) {
            addCriterion("hardware not between", value1, value2, "hardware");
            return (Criteria) this;
        }

        public Criteria andStartRunTimeIsNull() {
            addCriterion("start_run_time is null");
            return (Criteria) this;
        }

        public Criteria andStartRunTimeIsNotNull() {
            addCriterion("start_run_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartRunTimeEqualTo(Date value) {
            addCriterion("start_run_time =", value, "startRunTime");
            return (Criteria) this;
        }

        public Criteria andStartRunTimeNotEqualTo(Date value) {
            addCriterion("start_run_time <>", value, "startRunTime");
            return (Criteria) this;
        }

        public Criteria andStartRunTimeGreaterThan(Date value) {
            addCriterion("start_run_time >", value, "startRunTime");
            return (Criteria) this;
        }

        public Criteria andStartRunTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_run_time >=", value, "startRunTime");
            return (Criteria) this;
        }

        public Criteria andStartRunTimeLessThan(Date value) {
            addCriterion("start_run_time <", value, "startRunTime");
            return (Criteria) this;
        }

        public Criteria andStartRunTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_run_time <=", value, "startRunTime");
            return (Criteria) this;
        }

        public Criteria andStartRunTimeIn(List<Date> values) {
            addCriterion("start_run_time in", values, "startRunTime");
            return (Criteria) this;
        }

        public Criteria andStartRunTimeNotIn(List<Date> values) {
            addCriterion("start_run_time not in", values, "startRunTime");
            return (Criteria) this;
        }

        public Criteria andStartRunTimeBetween(Date value1, Date value2) {
            addCriterion("start_run_time between", value1, value2, "startRunTime");
            return (Criteria) this;
        }

        public Criteria andStartRunTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_run_time not between", value1, value2, "startRunTime");
            return (Criteria) this;
        }

        public Criteria andMonthlyChargeIsNull() {
            addCriterion("monthly_charge is null");
            return (Criteria) this;
        }

        public Criteria andMonthlyChargeIsNotNull() {
            addCriterion("monthly_charge is not null");
            return (Criteria) this;
        }

        public Criteria andMonthlyChargeEqualTo(Integer value) {
            addCriterion("monthly_charge =", value, "monthlyCharge");
            return (Criteria) this;
        }

        public Criteria andMonthlyChargeNotEqualTo(Integer value) {
            addCriterion("monthly_charge <>", value, "monthlyCharge");
            return (Criteria) this;
        }

        public Criteria andMonthlyChargeGreaterThan(Integer value) {
            addCriterion("monthly_charge >", value, "monthlyCharge");
            return (Criteria) this;
        }

        public Criteria andMonthlyChargeGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthly_charge >=", value, "monthlyCharge");
            return (Criteria) this;
        }

        public Criteria andMonthlyChargeLessThan(Integer value) {
            addCriterion("monthly_charge <", value, "monthlyCharge");
            return (Criteria) this;
        }

        public Criteria andMonthlyChargeLessThanOrEqualTo(Integer value) {
            addCriterion("monthly_charge <=", value, "monthlyCharge");
            return (Criteria) this;
        }

        public Criteria andMonthlyChargeIn(List<Integer> values) {
            addCriterion("monthly_charge in", values, "monthlyCharge");
            return (Criteria) this;
        }

        public Criteria andMonthlyChargeNotIn(List<Integer> values) {
            addCriterion("monthly_charge not in", values, "monthlyCharge");
            return (Criteria) this;
        }

        public Criteria andMonthlyChargeBetween(Integer value1, Integer value2) {
            addCriterion("monthly_charge between", value1, value2, "monthlyCharge");
            return (Criteria) this;
        }

        public Criteria andMonthlyChargeNotBetween(Integer value1, Integer value2) {
            addCriterion("monthly_charge not between", value1, value2, "monthlyCharge");
            return (Criteria) this;
        }

        public Criteria andIcOrderFlagIsNull() {
            addCriterion("ic_order_flag is null");
            return (Criteria) this;
        }

        public Criteria andIcOrderFlagIsNotNull() {
            addCriterion("ic_order_flag is not null");
            return (Criteria) this;
        }

        public Criteria andIcOrderFlagEqualTo(Integer value) {
            addCriterion("ic_order_flag =", value, "icOrderFlag");
            return (Criteria) this;
        }

        public Criteria andIcOrderFlagNotEqualTo(Integer value) {
            addCriterion("ic_order_flag <>", value, "icOrderFlag");
            return (Criteria) this;
        }

        public Criteria andIcOrderFlagGreaterThan(Integer value) {
            addCriterion("ic_order_flag >", value, "icOrderFlag");
            return (Criteria) this;
        }

        public Criteria andIcOrderFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("ic_order_flag >=", value, "icOrderFlag");
            return (Criteria) this;
        }

        public Criteria andIcOrderFlagLessThan(Integer value) {
            addCriterion("ic_order_flag <", value, "icOrderFlag");
            return (Criteria) this;
        }

        public Criteria andIcOrderFlagLessThanOrEqualTo(Integer value) {
            addCriterion("ic_order_flag <=", value, "icOrderFlag");
            return (Criteria) this;
        }

        public Criteria andIcOrderFlagIn(List<Integer> values) {
            addCriterion("ic_order_flag in", values, "icOrderFlag");
            return (Criteria) this;
        }

        public Criteria andIcOrderFlagNotIn(List<Integer> values) {
            addCriterion("ic_order_flag not in", values, "icOrderFlag");
            return (Criteria) this;
        }

        public Criteria andIcOrderFlagBetween(Integer value1, Integer value2) {
            addCriterion("ic_order_flag between", value1, value2, "icOrderFlag");
            return (Criteria) this;
        }

        public Criteria andIcOrderFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("ic_order_flag not between", value1, value2, "icOrderFlag");
            return (Criteria) this;
        }

        public Criteria andProduceUserIdIsNull() {
            addCriterion("produce_user_id is null");
            return (Criteria) this;
        }

        public Criteria andProduceUserIdIsNotNull() {
            addCriterion("produce_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andProduceUserIdEqualTo(Long value) {
            addCriterion("produce_user_id =", value, "produceUserId");
            return (Criteria) this;
        }

        public Criteria andProduceUserIdNotEqualTo(Long value) {
            addCriterion("produce_user_id <>", value, "produceUserId");
            return (Criteria) this;
        }

        public Criteria andProduceUserIdGreaterThan(Long value) {
            addCriterion("produce_user_id >", value, "produceUserId");
            return (Criteria) this;
        }

        public Criteria andProduceUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("produce_user_id >=", value, "produceUserId");
            return (Criteria) this;
        }

        public Criteria andProduceUserIdLessThan(Long value) {
            addCriterion("produce_user_id <", value, "produceUserId");
            return (Criteria) this;
        }

        public Criteria andProduceUserIdLessThanOrEqualTo(Long value) {
            addCriterion("produce_user_id <=", value, "produceUserId");
            return (Criteria) this;
        }

        public Criteria andProduceUserIdIn(List<Long> values) {
            addCriterion("produce_user_id in", values, "produceUserId");
            return (Criteria) this;
        }

        public Criteria andProduceUserIdNotIn(List<Long> values) {
            addCriterion("produce_user_id not in", values, "produceUserId");
            return (Criteria) this;
        }

        public Criteria andProduceUserIdBetween(Long value1, Long value2) {
            addCriterion("produce_user_id between", value1, value2, "produceUserId");
            return (Criteria) this;
        }

        public Criteria andProduceUserIdNotBetween(Long value1, Long value2) {
            addCriterion("produce_user_id not between", value1, value2, "produceUserId");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineFlagIsNull() {
            addCriterion("notify_offline_flag is null");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineFlagIsNotNull() {
            addCriterion("notify_offline_flag is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineFlagEqualTo(Integer value) {
            addCriterion("notify_offline_flag =", value, "notifyOfflineFlag");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineFlagNotEqualTo(Integer value) {
            addCriterion("notify_offline_flag <>", value, "notifyOfflineFlag");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineFlagGreaterThan(Integer value) {
            addCriterion("notify_offline_flag >", value, "notifyOfflineFlag");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("notify_offline_flag >=", value, "notifyOfflineFlag");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineFlagLessThan(Integer value) {
            addCriterion("notify_offline_flag <", value, "notifyOfflineFlag");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineFlagLessThanOrEqualTo(Integer value) {
            addCriterion("notify_offline_flag <=", value, "notifyOfflineFlag");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineFlagIn(List<Integer> values) {
            addCriterion("notify_offline_flag in", values, "notifyOfflineFlag");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineFlagNotIn(List<Integer> values) {
            addCriterion("notify_offline_flag not in", values, "notifyOfflineFlag");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineFlagBetween(Integer value1, Integer value2) {
            addCriterion("notify_offline_flag between", value1, value2, "notifyOfflineFlag");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("notify_offline_flag not between", value1, value2, "notifyOfflineFlag");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineTimeIsNull() {
            addCriterion("notify_offline_time is null");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineTimeIsNotNull() {
            addCriterion("notify_offline_time is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineTimeEqualTo(Date value) {
            addCriterion("notify_offline_time =", value, "notifyOfflineTime");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineTimeNotEqualTo(Date value) {
            addCriterion("notify_offline_time <>", value, "notifyOfflineTime");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineTimeGreaterThan(Date value) {
            addCriterion("notify_offline_time >", value, "notifyOfflineTime");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("notify_offline_time >=", value, "notifyOfflineTime");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineTimeLessThan(Date value) {
            addCriterion("notify_offline_time <", value, "notifyOfflineTime");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineTimeLessThanOrEqualTo(Date value) {
            addCriterion("notify_offline_time <=", value, "notifyOfflineTime");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineTimeIn(List<Date> values) {
            addCriterion("notify_offline_time in", values, "notifyOfflineTime");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineTimeNotIn(List<Date> values) {
            addCriterion("notify_offline_time not in", values, "notifyOfflineTime");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineTimeBetween(Date value1, Date value2) {
            addCriterion("notify_offline_time between", value1, value2, "notifyOfflineTime");
            return (Criteria) this;
        }

        public Criteria andNotifyOfflineTimeNotBetween(Date value1, Date value2) {
            addCriterion("notify_offline_time not between", value1, value2, "notifyOfflineTime");
            return (Criteria) this;
        }

        public Criteria andAliyunIsNull() {
            addCriterion("aliyun is null");
            return (Criteria) this;
        }

        public Criteria andAliyunIsNotNull() {
            addCriterion("aliyun is not null");
            return (Criteria) this;
        }

        public Criteria andAliyunEqualTo(String value) {
            addCriterion("aliyun =", value, "aliyun");
            return (Criteria) this;
        }

        public Criteria andAliyunNotEqualTo(String value) {
            addCriterion("aliyun <>", value, "aliyun");
            return (Criteria) this;
        }

        public Criteria andAliyunGreaterThan(String value) {
            addCriterion("aliyun >", value, "aliyun");
            return (Criteria) this;
        }

        public Criteria andAliyunGreaterThanOrEqualTo(String value) {
            addCriterion("aliyun >=", value, "aliyun");
            return (Criteria) this;
        }

        public Criteria andAliyunLessThan(String value) {
            addCriterion("aliyun <", value, "aliyun");
            return (Criteria) this;
        }

        public Criteria andAliyunLessThanOrEqualTo(String value) {
            addCriterion("aliyun <=", value, "aliyun");
            return (Criteria) this;
        }

        public Criteria andAliyunLike(String value) {
            addCriterion("aliyun like", value, "aliyun");
            return (Criteria) this;
        }

        public Criteria andAliyunNotLike(String value) {
            addCriterion("aliyun not like", value, "aliyun");
            return (Criteria) this;
        }

        public Criteria andAliyunIn(List<String> values) {
            addCriterion("aliyun in", values, "aliyun");
            return (Criteria) this;
        }

        public Criteria andAliyunNotIn(List<String> values) {
            addCriterion("aliyun not in", values, "aliyun");
            return (Criteria) this;
        }

        public Criteria andAliyunBetween(String value1, String value2) {
            addCriterion("aliyun between", value1, value2, "aliyun");
            return (Criteria) this;
        }

        public Criteria andAliyunNotBetween(String value1, String value2) {
            addCriterion("aliyun not between", value1, value2, "aliyun");
            return (Criteria) this;
        }

        public Criteria andCcidIsNull() {
            addCriterion("ccid is null");
            return (Criteria) this;
        }

        public Criteria andCcidIsNotNull() {
            addCriterion("ccid is not null");
            return (Criteria) this;
        }

        public Criteria andCcidEqualTo(String value) {
            addCriterion("ccid =", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotEqualTo(String value) {
            addCriterion("ccid <>", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidGreaterThan(String value) {
            addCriterion("ccid >", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidGreaterThanOrEqualTo(String value) {
            addCriterion("ccid >=", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidLessThan(String value) {
            addCriterion("ccid <", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidLessThanOrEqualTo(String value) {
            addCriterion("ccid <=", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidLike(String value) {
            addCriterion("ccid like", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotLike(String value) {
            addCriterion("ccid not like", value, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidIn(List<String> values) {
            addCriterion("ccid in", values, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotIn(List<String> values) {
            addCriterion("ccid not in", values, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidBetween(String value1, String value2) {
            addCriterion("ccid between", value1, value2, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidNotBetween(String value1, String value2) {
            addCriterion("ccid not between", value1, value2, "ccid");
            return (Criteria) this;
        }

        public Criteria andCcidFlagIsNull() {
            addCriterion("ccid_flag is null");
            return (Criteria) this;
        }

        public Criteria andCcidFlagIsNotNull() {
            addCriterion("ccid_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCcidFlagEqualTo(Integer value) {
            addCriterion("ccid_flag =", value, "ccidFlag");
            return (Criteria) this;
        }

        public Criteria andCcidFlagNotEqualTo(Integer value) {
            addCriterion("ccid_flag <>", value, "ccidFlag");
            return (Criteria) this;
        }

        public Criteria andCcidFlagGreaterThan(Integer value) {
            addCriterion("ccid_flag >", value, "ccidFlag");
            return (Criteria) this;
        }

        public Criteria andCcidFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("ccid_flag >=", value, "ccidFlag");
            return (Criteria) this;
        }

        public Criteria andCcidFlagLessThan(Integer value) {
            addCriterion("ccid_flag <", value, "ccidFlag");
            return (Criteria) this;
        }

        public Criteria andCcidFlagLessThanOrEqualTo(Integer value) {
            addCriterion("ccid_flag <=", value, "ccidFlag");
            return (Criteria) this;
        }

        public Criteria andCcidFlagIn(List<Integer> values) {
            addCriterion("ccid_flag in", values, "ccidFlag");
            return (Criteria) this;
        }

        public Criteria andCcidFlagNotIn(List<Integer> values) {
            addCriterion("ccid_flag not in", values, "ccidFlag");
            return (Criteria) this;
        }

        public Criteria andCcidFlagBetween(Integer value1, Integer value2) {
            addCriterion("ccid_flag between", value1, value2, "ccidFlag");
            return (Criteria) this;
        }

        public Criteria andCcidFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("ccid_flag not between", value1, value2, "ccidFlag");
            return (Criteria) this;
        }

        public Criteria andMinPowerIsNull() {
            addCriterion("min_power is null");
            return (Criteria) this;
        }

        public Criteria andMinPowerIsNotNull() {
            addCriterion("min_power is not null");
            return (Criteria) this;
        }

        public Criteria andMinPowerEqualTo(Integer value) {
            addCriterion("min_power =", value, "minPower");
            return (Criteria) this;
        }

        public Criteria andMinPowerNotEqualTo(Integer value) {
            addCriterion("min_power <>", value, "minPower");
            return (Criteria) this;
        }

        public Criteria andMinPowerGreaterThan(Integer value) {
            addCriterion("min_power >", value, "minPower");
            return (Criteria) this;
        }

        public Criteria andMinPowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_power >=", value, "minPower");
            return (Criteria) this;
        }

        public Criteria andMinPowerLessThan(Integer value) {
            addCriterion("min_power <", value, "minPower");
            return (Criteria) this;
        }

        public Criteria andMinPowerLessThanOrEqualTo(Integer value) {
            addCriterion("min_power <=", value, "minPower");
            return (Criteria) this;
        }

        public Criteria andMinPowerIn(List<Integer> values) {
            addCriterion("min_power in", values, "minPower");
            return (Criteria) this;
        }

        public Criteria andMinPowerNotIn(List<Integer> values) {
            addCriterion("min_power not in", values, "minPower");
            return (Criteria) this;
        }

        public Criteria andMinPowerBetween(Integer value1, Integer value2) {
            addCriterion("min_power between", value1, value2, "minPower");
            return (Criteria) this;
        }

        public Criteria andMinPowerNotBetween(Integer value1, Integer value2) {
            addCriterion("min_power not between", value1, value2, "minPower");
            return (Criteria) this;
        }

        public Criteria andMaxPowerIsNull() {
            addCriterion("max_power is null");
            return (Criteria) this;
        }

        public Criteria andMaxPowerIsNotNull() {
            addCriterion("max_power is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPowerEqualTo(Integer value) {
            addCriterion("max_power =", value, "maxPower");
            return (Criteria) this;
        }

        public Criteria andMaxPowerNotEqualTo(Integer value) {
            addCriterion("max_power <>", value, "maxPower");
            return (Criteria) this;
        }

        public Criteria andMaxPowerGreaterThan(Integer value) {
            addCriterion("max_power >", value, "maxPower");
            return (Criteria) this;
        }

        public Criteria andMaxPowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_power >=", value, "maxPower");
            return (Criteria) this;
        }

        public Criteria andMaxPowerLessThan(Integer value) {
            addCriterion("max_power <", value, "maxPower");
            return (Criteria) this;
        }

        public Criteria andMaxPowerLessThanOrEqualTo(Integer value) {
            addCriterion("max_power <=", value, "maxPower");
            return (Criteria) this;
        }

        public Criteria andMaxPowerIn(List<Integer> values) {
            addCriterion("max_power in", values, "maxPower");
            return (Criteria) this;
        }

        public Criteria andMaxPowerNotIn(List<Integer> values) {
            addCriterion("max_power not in", values, "maxPower");
            return (Criteria) this;
        }

        public Criteria andMaxPowerBetween(Integer value1, Integer value2) {
            addCriterion("max_power between", value1, value2, "maxPower");
            return (Criteria) this;
        }

        public Criteria andMaxPowerNotBetween(Integer value1, Integer value2) {
            addCriterion("max_power not between", value1, value2, "maxPower");
            return (Criteria) this;
        }

        public Criteria andMinPowerTimeIsNull() {
            addCriterion("min_power_time is null");
            return (Criteria) this;
        }

        public Criteria andMinPowerTimeIsNotNull() {
            addCriterion("min_power_time is not null");
            return (Criteria) this;
        }

        public Criteria andMinPowerTimeEqualTo(Integer value) {
            addCriterion("min_power_time =", value, "minPowerTime");
            return (Criteria) this;
        }

        public Criteria andMinPowerTimeNotEqualTo(Integer value) {
            addCriterion("min_power_time <>", value, "minPowerTime");
            return (Criteria) this;
        }

        public Criteria andMinPowerTimeGreaterThan(Integer value) {
            addCriterion("min_power_time >", value, "minPowerTime");
            return (Criteria) this;
        }

        public Criteria andMinPowerTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_power_time >=", value, "minPowerTime");
            return (Criteria) this;
        }

        public Criteria andMinPowerTimeLessThan(Integer value) {
            addCriterion("min_power_time <", value, "minPowerTime");
            return (Criteria) this;
        }

        public Criteria andMinPowerTimeLessThanOrEqualTo(Integer value) {
            addCriterion("min_power_time <=", value, "minPowerTime");
            return (Criteria) this;
        }

        public Criteria andMinPowerTimeIn(List<Integer> values) {
            addCriterion("min_power_time in", values, "minPowerTime");
            return (Criteria) this;
        }

        public Criteria andMinPowerTimeNotIn(List<Integer> values) {
            addCriterion("min_power_time not in", values, "minPowerTime");
            return (Criteria) this;
        }

        public Criteria andMinPowerTimeBetween(Integer value1, Integer value2) {
            addCriterion("min_power_time between", value1, value2, "minPowerTime");
            return (Criteria) this;
        }

        public Criteria andMinPowerTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("min_power_time not between", value1, value2, "minPowerTime");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andLockStatusIsNull() {
            addCriterion("lock_status is null");
            return (Criteria) this;
        }

        public Criteria andLockStatusIsNotNull() {
            addCriterion("lock_status is not null");
            return (Criteria) this;
        }

        public Criteria andLockStatusEqualTo(Byte value) {
            addCriterion("lock_status =", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotEqualTo(Byte value) {
            addCriterion("lock_status <>", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusGreaterThan(Byte value) {
            addCriterion("lock_status >", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("lock_status >=", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLessThan(Byte value) {
            addCriterion("lock_status <", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusLessThanOrEqualTo(Byte value) {
            addCriterion("lock_status <=", value, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusIn(List<Byte> values) {
            addCriterion("lock_status in", values, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotIn(List<Byte> values) {
            addCriterion("lock_status not in", values, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusBetween(Byte value1, Byte value2) {
            addCriterion("lock_status between", value1, value2, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andLockStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("lock_status not between", value1, value2, "lockStatus");
            return (Criteria) this;
        }

        public Criteria andManuIdIsNull() {
            addCriterion("manu_id is null");
            return (Criteria) this;
        }

        public Criteria andManuIdIsNotNull() {
            addCriterion("manu_id is not null");
            return (Criteria) this;
        }

        public Criteria andManuIdEqualTo(Integer value) {
            addCriterion("manu_id =", value, "manuId");
            return (Criteria) this;
        }

        public Criteria andManuIdNotEqualTo(Integer value) {
            addCriterion("manu_id <>", value, "manuId");
            return (Criteria) this;
        }

        public Criteria andManuIdGreaterThan(Integer value) {
            addCriterion("manu_id >", value, "manuId");
            return (Criteria) this;
        }

        public Criteria andManuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("manu_id >=", value, "manuId");
            return (Criteria) this;
        }

        public Criteria andManuIdLessThan(Integer value) {
            addCriterion("manu_id <", value, "manuId");
            return (Criteria) this;
        }

        public Criteria andManuIdLessThanOrEqualTo(Integer value) {
            addCriterion("manu_id <=", value, "manuId");
            return (Criteria) this;
        }

        public Criteria andManuIdIn(List<Integer> values) {
            addCriterion("manu_id in", values, "manuId");
            return (Criteria) this;
        }

        public Criteria andManuIdNotIn(List<Integer> values) {
            addCriterion("manu_id not in", values, "manuId");
            return (Criteria) this;
        }

        public Criteria andManuIdBetween(Integer value1, Integer value2) {
            addCriterion("manu_id between", value1, value2, "manuId");
            return (Criteria) this;
        }

        public Criteria andManuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("manu_id not between", value1, value2, "manuId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(Integer value) {
            addCriterion("agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(Integer value) {
            addCriterion("agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(Integer value) {
            addCriterion("agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(Integer value) {
            addCriterion("agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(Integer value) {
            addCriterion("agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<Integer> values) {
            addCriterion("agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<Integer> values) {
            addCriterion("agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(Integer value1, Integer value2) {
            addCriterion("agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agent_id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andSalerIdIsNull() {
            addCriterion("saler_id is null");
            return (Criteria) this;
        }

        public Criteria andSalerIdIsNotNull() {
            addCriterion("saler_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalerIdEqualTo(Integer value) {
            addCriterion("saler_id =", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdNotEqualTo(Integer value) {
            addCriterion("saler_id <>", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdGreaterThan(Integer value) {
            addCriterion("saler_id >", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("saler_id >=", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdLessThan(Integer value) {
            addCriterion("saler_id <", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdLessThanOrEqualTo(Integer value) {
            addCriterion("saler_id <=", value, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdIn(List<Integer> values) {
            addCriterion("saler_id in", values, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdNotIn(List<Integer> values) {
            addCriterion("saler_id not in", values, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdBetween(Integer value1, Integer value2) {
            addCriterion("saler_id between", value1, value2, "salerId");
            return (Criteria) this;
        }

        public Criteria andSalerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("saler_id not between", value1, value2, "salerId");
            return (Criteria) this;
        }
    }

    /**
     */
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