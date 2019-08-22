package com.yunku.demo.core.model.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andIdEqualTo(Short value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Short value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Short value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Short value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Short value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Short value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Short> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Short> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Short value1, Short value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Short value1, Short value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNull() {
            addCriterion("loginname is null");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNotNull() {
            addCriterion("loginname is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnameEqualTo(String value) {
            addCriterion("loginname =", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotEqualTo(String value) {
            addCriterion("loginname <>", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThan(String value) {
            addCriterion("loginname >", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("loginname >=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThan(String value) {
            addCriterion("loginname <", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThanOrEqualTo(String value) {
            addCriterion("loginname <=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLike(String value) {
            addCriterion("loginname like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotLike(String value) {
            addCriterion("loginname not like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameIn(List<String> values) {
            addCriterion("loginname in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotIn(List<String> values) {
            addCriterion("loginname not in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameBetween(String value1, String value2) {
            addCriterion("loginname between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotBetween(String value1, String value2) {
            addCriterion("loginname not between", value1, value2, "loginname");
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

        public Criteria andPasswordIsNull() {
            addCriterion("`password` is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("`password` is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("`password` =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("`password` <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("`password` >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("`password` >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("`password` <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("`password` <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("`password` like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("`password` not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("`password` in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("`password` not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("`password` between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("`password` not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andEncryptIsNull() {
            addCriterion("encrypt is null");
            return (Criteria) this;
        }

        public Criteria andEncryptIsNotNull() {
            addCriterion("encrypt is not null");
            return (Criteria) this;
        }

        public Criteria andEncryptEqualTo(String value) {
            addCriterion("encrypt =", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptNotEqualTo(String value) {
            addCriterion("encrypt <>", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptGreaterThan(String value) {
            addCriterion("encrypt >", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptGreaterThanOrEqualTo(String value) {
            addCriterion("encrypt >=", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptLessThan(String value) {
            addCriterion("encrypt <", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptLessThanOrEqualTo(String value) {
            addCriterion("encrypt <=", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptLike(String value) {
            addCriterion("encrypt like", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptNotLike(String value) {
            addCriterion("encrypt not like", value, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptIn(List<String> values) {
            addCriterion("encrypt in", values, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptNotIn(List<String> values) {
            addCriterion("encrypt not in", values, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptBetween(String value1, String value2) {
            addCriterion("encrypt between", value1, value2, "encrypt");
            return (Criteria) this;
        }

        public Criteria andEncryptNotBetween(String value1, String value2) {
            addCriterion("encrypt not between", value1, value2, "encrypt");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Byte value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Byte value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Byte value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Byte value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Byte value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Byte value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Byte> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Byte> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Byte value1, Byte value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Byte value1, Byte value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Byte value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Byte value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Byte value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Byte value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Byte value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Byte value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Byte> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Byte> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Byte value1, Byte value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Byte value1, Byte value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("usertype is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("usertype is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(Byte value) {
            addCriterion("usertype =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(Byte value) {
            addCriterion("usertype <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(Byte value) {
            addCriterion("usertype >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("usertype >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(Byte value) {
            addCriterion("usertype <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(Byte value) {
            addCriterion("usertype <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<Byte> values) {
            addCriterion("usertype in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<Byte> values) {
            addCriterion("usertype not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(Byte value1, Byte value2) {
            addCriterion("usertype between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(Byte value1, Byte value2) {
            addCriterion("usertype not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNull() {
            addCriterion("isdefault is null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIsNotNull() {
            addCriterion("isdefault is not null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultEqualTo(Byte value) {
            addCriterion("isdefault =", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotEqualTo(Byte value) {
            addCriterion("isdefault <>", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThan(Byte value) {
            addCriterion("isdefault >", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultGreaterThanOrEqualTo(Byte value) {
            addCriterion("isdefault >=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThan(Byte value) {
            addCriterion("isdefault <", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultLessThanOrEqualTo(Byte value) {
            addCriterion("isdefault <=", value, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultIn(List<Byte> values) {
            addCriterion("isdefault in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotIn(List<Byte> values) {
            addCriterion("isdefault not in", values, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultBetween(Byte value1, Byte value2) {
            addCriterion("isdefault between", value1, value2, "isdefault");
            return (Criteria) this;
        }

        public Criteria andIsdefaultNotBetween(Byte value1, Byte value2) {
            addCriterion("isdefault not between", value1, value2, "isdefault");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("`state` is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("`state` is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("`state` =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("`state` <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("`state` >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("`state` >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("`state` <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("`state` <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("`state` in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("`state` not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("`state` between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("`state` not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCreatedatetimeIsNull() {
            addCriterion("createdatetime is null");
            return (Criteria) this;
        }

        public Criteria andCreatedatetimeIsNotNull() {
            addCriterion("createdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedatetimeEqualTo(Date value) {
            addCriterion("createdatetime =", value, "createdatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedatetimeNotEqualTo(Date value) {
            addCriterion("createdatetime <>", value, "createdatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedatetimeGreaterThan(Date value) {
            addCriterion("createdatetime >", value, "createdatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createdatetime >=", value, "createdatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedatetimeLessThan(Date value) {
            addCriterion("createdatetime <", value, "createdatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createdatetime <=", value, "createdatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedatetimeIn(List<Date> values) {
            addCriterion("createdatetime in", values, "createdatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedatetimeNotIn(List<Date> values) {
            addCriterion("createdatetime not in", values, "createdatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedatetimeBetween(Date value1, Date value2) {
            addCriterion("createdatetime between", value1, value2, "createdatetime");
            return (Criteria) this;
        }

        public Criteria andCreatedatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createdatetime not between", value1, value2, "createdatetime");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNull() {
            addCriterion("server_id is null");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNotNull() {
            addCriterion("server_id is not null");
            return (Criteria) this;
        }

        public Criteria andServerIdEqualTo(Long value) {
            addCriterion("server_id =", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotEqualTo(Long value) {
            addCriterion("server_id <>", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThan(Long value) {
            addCriterion("server_id >", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("server_id >=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThan(Long value) {
            addCriterion("server_id <", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThanOrEqualTo(Long value) {
            addCriterion("server_id <=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdIn(List<Long> values) {
            addCriterion("server_id in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotIn(List<Long> values) {
            addCriterion("server_id not in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdBetween(Long value1, Long value2) {
            addCriterion("server_id between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotBetween(Long value1, Long value2) {
            addCriterion("server_id not between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdH5IsNull() {
            addCriterion("server_id_h5 is null");
            return (Criteria) this;
        }

        public Criteria andServerIdH5IsNotNull() {
            addCriterion("server_id_h5 is not null");
            return (Criteria) this;
        }

        public Criteria andServerIdH5EqualTo(Long value) {
            addCriterion("server_id_h5 =", value, "serverIdH5");
            return (Criteria) this;
        }

        public Criteria andServerIdH5NotEqualTo(Long value) {
            addCriterion("server_id_h5 <>", value, "serverIdH5");
            return (Criteria) this;
        }

        public Criteria andServerIdH5GreaterThan(Long value) {
            addCriterion("server_id_h5 >", value, "serverIdH5");
            return (Criteria) this;
        }

        public Criteria andServerIdH5GreaterThanOrEqualTo(Long value) {
            addCriterion("server_id_h5 >=", value, "serverIdH5");
            return (Criteria) this;
        }

        public Criteria andServerIdH5LessThan(Long value) {
            addCriterion("server_id_h5 <", value, "serverIdH5");
            return (Criteria) this;
        }

        public Criteria andServerIdH5LessThanOrEqualTo(Long value) {
            addCriterion("server_id_h5 <=", value, "serverIdH5");
            return (Criteria) this;
        }

        public Criteria andServerIdH5In(List<Long> values) {
            addCriterion("server_id_h5 in", values, "serverIdH5");
            return (Criteria) this;
        }

        public Criteria andServerIdH5NotIn(List<Long> values) {
            addCriterion("server_id_h5 not in", values, "serverIdH5");
            return (Criteria) this;
        }

        public Criteria andServerIdH5Between(Long value1, Long value2) {
            addCriterion("server_id_h5 between", value1, value2, "serverIdH5");
            return (Criteria) this;
        }

        public Criteria andServerIdH5NotBetween(Long value1, Long value2) {
            addCriterion("server_id_h5 not between", value1, value2, "serverIdH5");
            return (Criteria) this;
        }

        public Criteria andAlipayServerIdIsNull() {
            addCriterion("alipay_server_id is null");
            return (Criteria) this;
        }

        public Criteria andAlipayServerIdIsNotNull() {
            addCriterion("alipay_server_id is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayServerIdEqualTo(Long value) {
            addCriterion("alipay_server_id =", value, "alipayServerId");
            return (Criteria) this;
        }

        public Criteria andAlipayServerIdNotEqualTo(Long value) {
            addCriterion("alipay_server_id <>", value, "alipayServerId");
            return (Criteria) this;
        }

        public Criteria andAlipayServerIdGreaterThan(Long value) {
            addCriterion("alipay_server_id >", value, "alipayServerId");
            return (Criteria) this;
        }

        public Criteria andAlipayServerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("alipay_server_id >=", value, "alipayServerId");
            return (Criteria) this;
        }

        public Criteria andAlipayServerIdLessThan(Long value) {
            addCriterion("alipay_server_id <", value, "alipayServerId");
            return (Criteria) this;
        }

        public Criteria andAlipayServerIdLessThanOrEqualTo(Long value) {
            addCriterion("alipay_server_id <=", value, "alipayServerId");
            return (Criteria) this;
        }

        public Criteria andAlipayServerIdIn(List<Long> values) {
            addCriterion("alipay_server_id in", values, "alipayServerId");
            return (Criteria) this;
        }

        public Criteria andAlipayServerIdNotIn(List<Long> values) {
            addCriterion("alipay_server_id not in", values, "alipayServerId");
            return (Criteria) this;
        }

        public Criteria andAlipayServerIdBetween(Long value1, Long value2) {
            addCriterion("alipay_server_id between", value1, value2, "alipayServerId");
            return (Criteria) this;
        }

        public Criteria andAlipayServerIdNotBetween(Long value1, Long value2) {
            addCriterion("alipay_server_id not between", value1, value2, "alipayServerId");
            return (Criteria) this;
        }

        public Criteria andClientFansIdIsNull() {
            addCriterion("client_fans_id is null");
            return (Criteria) this;
        }

        public Criteria andClientFansIdIsNotNull() {
            addCriterion("client_fans_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientFansIdEqualTo(String value) {
            addCriterion("client_fans_id =", value, "clientFansId");
            return (Criteria) this;
        }

        public Criteria andClientFansIdNotEqualTo(String value) {
            addCriterion("client_fans_id <>", value, "clientFansId");
            return (Criteria) this;
        }

        public Criteria andClientFansIdGreaterThan(String value) {
            addCriterion("client_fans_id >", value, "clientFansId");
            return (Criteria) this;
        }

        public Criteria andClientFansIdGreaterThanOrEqualTo(String value) {
            addCriterion("client_fans_id >=", value, "clientFansId");
            return (Criteria) this;
        }

        public Criteria andClientFansIdLessThan(String value) {
            addCriterion("client_fans_id <", value, "clientFansId");
            return (Criteria) this;
        }

        public Criteria andClientFansIdLessThanOrEqualTo(String value) {
            addCriterion("client_fans_id <=", value, "clientFansId");
            return (Criteria) this;
        }

        public Criteria andClientFansIdLike(String value) {
            addCriterion("client_fans_id like", value, "clientFansId");
            return (Criteria) this;
        }

        public Criteria andClientFansIdNotLike(String value) {
            addCriterion("client_fans_id not like", value, "clientFansId");
            return (Criteria) this;
        }

        public Criteria andClientFansIdIn(List<String> values) {
            addCriterion("client_fans_id in", values, "clientFansId");
            return (Criteria) this;
        }

        public Criteria andClientFansIdNotIn(List<String> values) {
            addCriterion("client_fans_id not in", values, "clientFansId");
            return (Criteria) this;
        }

        public Criteria andClientFansIdBetween(String value1, String value2) {
            addCriterion("client_fans_id between", value1, value2, "clientFansId");
            return (Criteria) this;
        }

        public Criteria andClientFansIdNotBetween(String value1, String value2) {
            addCriterion("client_fans_id not between", value1, value2, "clientFansId");
            return (Criteria) this;
        }

        public Criteria andUserFansIdIsNull() {
            addCriterion("user_fans_id is null");
            return (Criteria) this;
        }

        public Criteria andUserFansIdIsNotNull() {
            addCriterion("user_fans_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserFansIdEqualTo(Long value) {
            addCriterion("user_fans_id =", value, "userFansId");
            return (Criteria) this;
        }

        public Criteria andUserFansIdNotEqualTo(Long value) {
            addCriterion("user_fans_id <>", value, "userFansId");
            return (Criteria) this;
        }

        public Criteria andUserFansIdGreaterThan(Long value) {
            addCriterion("user_fans_id >", value, "userFansId");
            return (Criteria) this;
        }

        public Criteria andUserFansIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_fans_id >=", value, "userFansId");
            return (Criteria) this;
        }

        public Criteria andUserFansIdLessThan(Long value) {
            addCriterion("user_fans_id <", value, "userFansId");
            return (Criteria) this;
        }

        public Criteria andUserFansIdLessThanOrEqualTo(Long value) {
            addCriterion("user_fans_id <=", value, "userFansId");
            return (Criteria) this;
        }

        public Criteria andUserFansIdIn(List<Long> values) {
            addCriterion("user_fans_id in", values, "userFansId");
            return (Criteria) this;
        }

        public Criteria andUserFansIdNotIn(List<Long> values) {
            addCriterion("user_fans_id not in", values, "userFansId");
            return (Criteria) this;
        }

        public Criteria andUserFansIdBetween(Long value1, Long value2) {
            addCriterion("user_fans_id between", value1, value2, "userFansId");
            return (Criteria) this;
        }

        public Criteria andUserFansIdNotBetween(Long value1, Long value2) {
            addCriterion("user_fans_id not between", value1, value2, "userFansId");
            return (Criteria) this;
        }

        public Criteria andIsBindingIsNull() {
            addCriterion("is_binding is null");
            return (Criteria) this;
        }

        public Criteria andIsBindingIsNotNull() {
            addCriterion("is_binding is not null");
            return (Criteria) this;
        }

        public Criteria andIsBindingEqualTo(Integer value) {
            addCriterion("is_binding =", value, "isBinding");
            return (Criteria) this;
        }

        public Criteria andIsBindingNotEqualTo(Integer value) {
            addCriterion("is_binding <>", value, "isBinding");
            return (Criteria) this;
        }

        public Criteria andIsBindingGreaterThan(Integer value) {
            addCriterion("is_binding >", value, "isBinding");
            return (Criteria) this;
        }

        public Criteria andIsBindingGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_binding >=", value, "isBinding");
            return (Criteria) this;
        }

        public Criteria andIsBindingLessThan(Integer value) {
            addCriterion("is_binding <", value, "isBinding");
            return (Criteria) this;
        }

        public Criteria andIsBindingLessThanOrEqualTo(Integer value) {
            addCriterion("is_binding <=", value, "isBinding");
            return (Criteria) this;
        }

        public Criteria andIsBindingIn(List<Integer> values) {
            addCriterion("is_binding in", values, "isBinding");
            return (Criteria) this;
        }

        public Criteria andIsBindingNotIn(List<Integer> values) {
            addCriterion("is_binding not in", values, "isBinding");
            return (Criteria) this;
        }

        public Criteria andIsBindingBetween(Integer value1, Integer value2) {
            addCriterion("is_binding between", value1, value2, "isBinding");
            return (Criteria) this;
        }

        public Criteria andIsBindingNotBetween(Integer value1, Integer value2) {
            addCriterion("is_binding not between", value1, value2, "isBinding");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Long value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Long value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Long value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Long value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Long value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Long> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Long> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Long value1, Long value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Long value1, Long value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountIsNull() {
            addCriterion("withdrawal_amount is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountIsNotNull() {
            addCriterion("withdrawal_amount is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountEqualTo(Long value) {
            addCriterion("withdrawal_amount =", value, "withdrawalAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountNotEqualTo(Long value) {
            addCriterion("withdrawal_amount <>", value, "withdrawalAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountGreaterThan(Long value) {
            addCriterion("withdrawal_amount >", value, "withdrawalAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("withdrawal_amount >=", value, "withdrawalAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountLessThan(Long value) {
            addCriterion("withdrawal_amount <", value, "withdrawalAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountLessThanOrEqualTo(Long value) {
            addCriterion("withdrawal_amount <=", value, "withdrawalAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountIn(List<Long> values) {
            addCriterion("withdrawal_amount in", values, "withdrawalAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountNotIn(List<Long> values) {
            addCriterion("withdrawal_amount not in", values, "withdrawalAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountBetween(Long value1, Long value2) {
            addCriterion("withdrawal_amount between", value1, value2, "withdrawalAmount");
            return (Criteria) this;
        }

        public Criteria andWithdrawalAmountNotBetween(Long value1, Long value2) {
            addCriterion("withdrawal_amount not between", value1, value2, "withdrawalAmount");
            return (Criteria) this;
        }

        public Criteria andIsContentUserIsNull() {
            addCriterion("is_content_user is null");
            return (Criteria) this;
        }

        public Criteria andIsContentUserIsNotNull() {
            addCriterion("is_content_user is not null");
            return (Criteria) this;
        }

        public Criteria andIsContentUserEqualTo(Integer value) {
            addCriterion("is_content_user =", value, "isContentUser");
            return (Criteria) this;
        }

        public Criteria andIsContentUserNotEqualTo(Integer value) {
            addCriterion("is_content_user <>", value, "isContentUser");
            return (Criteria) this;
        }

        public Criteria andIsContentUserGreaterThan(Integer value) {
            addCriterion("is_content_user >", value, "isContentUser");
            return (Criteria) this;
        }

        public Criteria andIsContentUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_content_user >=", value, "isContentUser");
            return (Criteria) this;
        }

        public Criteria andIsContentUserLessThan(Integer value) {
            addCriterion("is_content_user <", value, "isContentUser");
            return (Criteria) this;
        }

        public Criteria andIsContentUserLessThanOrEqualTo(Integer value) {
            addCriterion("is_content_user <=", value, "isContentUser");
            return (Criteria) this;
        }

        public Criteria andIsContentUserIn(List<Integer> values) {
            addCriterion("is_content_user in", values, "isContentUser");
            return (Criteria) this;
        }

        public Criteria andIsContentUserNotIn(List<Integer> values) {
            addCriterion("is_content_user not in", values, "isContentUser");
            return (Criteria) this;
        }

        public Criteria andIsContentUserBetween(Integer value1, Integer value2) {
            addCriterion("is_content_user between", value1, value2, "isContentUser");
            return (Criteria) this;
        }

        public Criteria andIsContentUserNotBetween(Integer value1, Integer value2) {
            addCriterion("is_content_user not between", value1, value2, "isContentUser");
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

        public Criteria andIsAgentAdminIsNull() {
            addCriterion("is_agent_admin is null");
            return (Criteria) this;
        }

        public Criteria andIsAgentAdminIsNotNull() {
            addCriterion("is_agent_admin is not null");
            return (Criteria) this;
        }

        public Criteria andIsAgentAdminEqualTo(Integer value) {
            addCriterion("is_agent_admin =", value, "isAgentAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAgentAdminNotEqualTo(Integer value) {
            addCriterion("is_agent_admin <>", value, "isAgentAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAgentAdminGreaterThan(Integer value) {
            addCriterion("is_agent_admin >", value, "isAgentAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAgentAdminGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_agent_admin >=", value, "isAgentAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAgentAdminLessThan(Integer value) {
            addCriterion("is_agent_admin <", value, "isAgentAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAgentAdminLessThanOrEqualTo(Integer value) {
            addCriterion("is_agent_admin <=", value, "isAgentAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAgentAdminIn(List<Integer> values) {
            addCriterion("is_agent_admin in", values, "isAgentAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAgentAdminNotIn(List<Integer> values) {
            addCriterion("is_agent_admin not in", values, "isAgentAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAgentAdminBetween(Integer value1, Integer value2) {
            addCriterion("is_agent_admin between", value1, value2, "isAgentAdmin");
            return (Criteria) this;
        }

        public Criteria andIsAgentAdminNotBetween(Integer value1, Integer value2) {
            addCriterion("is_agent_admin not between", value1, value2, "isAgentAdmin");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(Integer value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(Integer value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(Integer value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(Integer value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(Integer value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<Integer> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<Integer> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(Integer value1, Integer value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankNumIsNull() {
            addCriterion("bank_num is null");
            return (Criteria) this;
        }

        public Criteria andBankNumIsNotNull() {
            addCriterion("bank_num is not null");
            return (Criteria) this;
        }

        public Criteria andBankNumEqualTo(String value) {
            addCriterion("bank_num =", value, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumNotEqualTo(String value) {
            addCriterion("bank_num <>", value, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumGreaterThan(String value) {
            addCriterion("bank_num >", value, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumGreaterThanOrEqualTo(String value) {
            addCriterion("bank_num >=", value, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumLessThan(String value) {
            addCriterion("bank_num <", value, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumLessThanOrEqualTo(String value) {
            addCriterion("bank_num <=", value, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumLike(String value) {
            addCriterion("bank_num like", value, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumNotLike(String value) {
            addCriterion("bank_num not like", value, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumIn(List<String> values) {
            addCriterion("bank_num in", values, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumNotIn(List<String> values) {
            addCriterion("bank_num not in", values, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumBetween(String value1, String value2) {
            addCriterion("bank_num between", value1, value2, "bankNum");
            return (Criteria) this;
        }

        public Criteria andBankNumNotBetween(String value1, String value2) {
            addCriterion("bank_num not between", value1, value2, "bankNum");
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

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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