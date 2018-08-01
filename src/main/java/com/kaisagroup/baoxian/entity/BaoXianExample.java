package com.kaisagroup.baoxian.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BaoXianExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BaoXianExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIsNull() {
            addCriterion("deptcode is null");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIsNotNull() {
            addCriterion("deptcode is not null");
            return (Criteria) this;
        }

        public Criteria andDeptcodeEqualTo(String value) {
            addCriterion("deptcode =", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotEqualTo(String value) {
            addCriterion("deptcode <>", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeGreaterThan(String value) {
            addCriterion("deptcode >", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeGreaterThanOrEqualTo(String value) {
            addCriterion("deptcode >=", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLessThan(String value) {
            addCriterion("deptcode <", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLessThanOrEqualTo(String value) {
            addCriterion("deptcode <=", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeLike(String value) {
            addCriterion("deptcode like", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotLike(String value) {
            addCriterion("deptcode not like", value, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeIn(List<String> values) {
            addCriterion("deptcode in", values, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotIn(List<String> values) {
            addCriterion("deptcode not in", values, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeBetween(String value1, String value2) {
            addCriterion("deptcode between", value1, value2, "deptcode");
            return (Criteria) this;
        }

        public Criteria andDeptcodeNotBetween(String value1, String value2) {
            addCriterion("deptcode not between", value1, value2, "deptcode");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(Integer value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(Integer value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(Integer value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(Integer value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(Integer value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<Integer> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<Integer> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(Integer value1, Integer value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNull() {
            addCriterion("deptname is null");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNotNull() {
            addCriterion("deptname is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnameEqualTo(String value) {
            addCriterion("deptname =", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotEqualTo(String value) {
            addCriterion("deptname <>", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThan(String value) {
            addCriterion("deptname >", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("deptname >=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThan(String value) {
            addCriterion("deptname <", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThanOrEqualTo(String value) {
            addCriterion("deptname <=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLike(String value) {
            addCriterion("deptname like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotLike(String value) {
            addCriterion("deptname not like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameIn(List<String> values) {
            addCriterion("deptname in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotIn(List<String> values) {
            addCriterion("deptname not in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameBetween(String value1, String value2) {
            addCriterion("deptname between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotBetween(String value1, String value2) {
            addCriterion("deptname not between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplenowIsNull() {
            addCriterion("deptpeoplenow is null");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplenowIsNotNull() {
            addCriterion("deptpeoplenow is not null");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplenowEqualTo(Integer value) {
            addCriterion("deptpeoplenow =", value, "deptpeoplenow");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplenowNotEqualTo(Integer value) {
            addCriterion("deptpeoplenow <>", value, "deptpeoplenow");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplenowGreaterThan(Integer value) {
            addCriterion("deptpeoplenow >", value, "deptpeoplenow");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplenowGreaterThanOrEqualTo(Integer value) {
            addCriterion("deptpeoplenow >=", value, "deptpeoplenow");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplenowLessThan(Integer value) {
            addCriterion("deptpeoplenow <", value, "deptpeoplenow");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplenowLessThanOrEqualTo(Integer value) {
            addCriterion("deptpeoplenow <=", value, "deptpeoplenow");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplenowIn(List<Integer> values) {
            addCriterion("deptpeoplenow in", values, "deptpeoplenow");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplenowNotIn(List<Integer> values) {
            addCriterion("deptpeoplenow not in", values, "deptpeoplenow");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplenowBetween(Integer value1, Integer value2) {
            addCriterion("deptpeoplenow between", value1, value2, "deptpeoplenow");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplenowNotBetween(Integer value1, Integer value2) {
            addCriterion("deptpeoplenow not between", value1, value2, "deptpeoplenow");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplepreIsNull() {
            addCriterion("deptpeoplepre is null");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplepreIsNotNull() {
            addCriterion("deptpeoplepre is not null");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplepreEqualTo(Integer value) {
            addCriterion("deptpeoplepre =", value, "deptpeoplepre");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplepreNotEqualTo(Integer value) {
            addCriterion("deptpeoplepre <>", value, "deptpeoplepre");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplepreGreaterThan(Integer value) {
            addCriterion("deptpeoplepre >", value, "deptpeoplepre");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplepreGreaterThanOrEqualTo(Integer value) {
            addCriterion("deptpeoplepre >=", value, "deptpeoplepre");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplepreLessThan(Integer value) {
            addCriterion("deptpeoplepre <", value, "deptpeoplepre");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplepreLessThanOrEqualTo(Integer value) {
            addCriterion("deptpeoplepre <=", value, "deptpeoplepre");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplepreIn(List<Integer> values) {
            addCriterion("deptpeoplepre in", values, "deptpeoplepre");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplepreNotIn(List<Integer> values) {
            addCriterion("deptpeoplepre not in", values, "deptpeoplepre");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplepreBetween(Integer value1, Integer value2) {
            addCriterion("deptpeoplepre between", value1, value2, "deptpeoplepre");
            return (Criteria) this;
        }

        public Criteria andDeptpeoplepreNotBetween(Integer value1, Integer value2) {
            addCriterion("deptpeoplepre not between", value1, value2, "deptpeoplepre");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplenowIsNull() {
            addCriterion("certificatepeoplenow is null");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplenowIsNotNull() {
            addCriterion("certificatepeoplenow is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplenowEqualTo(Integer value) {
            addCriterion("certificatepeoplenow =", value, "certificatepeoplenow");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplenowNotEqualTo(Integer value) {
            addCriterion("certificatepeoplenow <>", value, "certificatepeoplenow");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplenowGreaterThan(Integer value) {
            addCriterion("certificatepeoplenow >", value, "certificatepeoplenow");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplenowGreaterThanOrEqualTo(Integer value) {
            addCriterion("certificatepeoplenow >=", value, "certificatepeoplenow");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplenowLessThan(Integer value) {
            addCriterion("certificatepeoplenow <", value, "certificatepeoplenow");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplenowLessThanOrEqualTo(Integer value) {
            addCriterion("certificatepeoplenow <=", value, "certificatepeoplenow");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplenowIn(List<Integer> values) {
            addCriterion("certificatepeoplenow in", values, "certificatepeoplenow");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplenowNotIn(List<Integer> values) {
            addCriterion("certificatepeoplenow not in", values, "certificatepeoplenow");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplenowBetween(Integer value1, Integer value2) {
            addCriterion("certificatepeoplenow between", value1, value2, "certificatepeoplenow");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplenowNotBetween(Integer value1, Integer value2) {
            addCriterion("certificatepeoplenow not between", value1, value2, "certificatepeoplenow");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplepreIsNull() {
            addCriterion("certificatepeoplepre is null");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplepreIsNotNull() {
            addCriterion("certificatepeoplepre is not null");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplepreEqualTo(Integer value) {
            addCriterion("certificatepeoplepre =", value, "certificatepeoplepre");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplepreNotEqualTo(Integer value) {
            addCriterion("certificatepeoplepre <>", value, "certificatepeoplepre");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplepreGreaterThan(Integer value) {
            addCriterion("certificatepeoplepre >", value, "certificatepeoplepre");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplepreGreaterThanOrEqualTo(Integer value) {
            addCriterion("certificatepeoplepre >=", value, "certificatepeoplepre");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplepreLessThan(Integer value) {
            addCriterion("certificatepeoplepre <", value, "certificatepeoplepre");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplepreLessThanOrEqualTo(Integer value) {
            addCriterion("certificatepeoplepre <=", value, "certificatepeoplepre");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplepreIn(List<Integer> values) {
            addCriterion("certificatepeoplepre in", values, "certificatepeoplepre");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplepreNotIn(List<Integer> values) {
            addCriterion("certificatepeoplepre not in", values, "certificatepeoplepre");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplepreBetween(Integer value1, Integer value2) {
            addCriterion("certificatepeoplepre between", value1, value2, "certificatepeoplepre");
            return (Criteria) this;
        }

        public Criteria andCertificatepeoplepreNotBetween(Integer value1, Integer value2) {
            addCriterion("certificatepeoplepre not between", value1, value2, "certificatepeoplepre");
            return (Criteria) this;
        }

        public Criteria andPremiumnowIsNull() {
            addCriterion("premiumnow is null");
            return (Criteria) this;
        }

        public Criteria andPremiumnowIsNotNull() {
            addCriterion("premiumnow is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumnowEqualTo(BigDecimal value) {
            addCriterion("premiumnow =", value, "premiumnow");
            return (Criteria) this;
        }

        public Criteria andPremiumnowNotEqualTo(BigDecimal value) {
            addCriterion("premiumnow <>", value, "premiumnow");
            return (Criteria) this;
        }

        public Criteria andPremiumnowGreaterThan(BigDecimal value) {
            addCriterion("premiumnow >", value, "premiumnow");
            return (Criteria) this;
        }

        public Criteria andPremiumnowGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("premiumnow >=", value, "premiumnow");
            return (Criteria) this;
        }

        public Criteria andPremiumnowLessThan(BigDecimal value) {
            addCriterion("premiumnow <", value, "premiumnow");
            return (Criteria) this;
        }

        public Criteria andPremiumnowLessThanOrEqualTo(BigDecimal value) {
            addCriterion("premiumnow <=", value, "premiumnow");
            return (Criteria) this;
        }

        public Criteria andPremiumnowIn(List<BigDecimal> values) {
            addCriterion("premiumnow in", values, "premiumnow");
            return (Criteria) this;
        }

        public Criteria andPremiumnowNotIn(List<BigDecimal> values) {
            addCriterion("premiumnow not in", values, "premiumnow");
            return (Criteria) this;
        }

        public Criteria andPremiumnowBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premiumnow between", value1, value2, "premiumnow");
            return (Criteria) this;
        }

        public Criteria andPremiumnowNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premiumnow not between", value1, value2, "premiumnow");
            return (Criteria) this;
        }

        public Criteria andPremiumpreIsNull() {
            addCriterion("premiumpre is null");
            return (Criteria) this;
        }

        public Criteria andPremiumpreIsNotNull() {
            addCriterion("premiumpre is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumpreEqualTo(BigDecimal value) {
            addCriterion("premiumpre =", value, "premiumpre");
            return (Criteria) this;
        }

        public Criteria andPremiumpreNotEqualTo(BigDecimal value) {
            addCriterion("premiumpre <>", value, "premiumpre");
            return (Criteria) this;
        }

        public Criteria andPremiumpreGreaterThan(BigDecimal value) {
            addCriterion("premiumpre >", value, "premiumpre");
            return (Criteria) this;
        }

        public Criteria andPremiumpreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("premiumpre >=", value, "premiumpre");
            return (Criteria) this;
        }

        public Criteria andPremiumpreLessThan(BigDecimal value) {
            addCriterion("premiumpre <", value, "premiumpre");
            return (Criteria) this;
        }

        public Criteria andPremiumpreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("premiumpre <=", value, "premiumpre");
            return (Criteria) this;
        }

        public Criteria andPremiumpreIn(List<BigDecimal> values) {
            addCriterion("premiumpre in", values, "premiumpre");
            return (Criteria) this;
        }

        public Criteria andPremiumpreNotIn(List<BigDecimal> values) {
            addCriterion("premiumpre not in", values, "premiumpre");
            return (Criteria) this;
        }

        public Criteria andPremiumpreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premiumpre between", value1, value2, "premiumpre");
            return (Criteria) this;
        }

        public Criteria andPremiumpreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premiumpre not between", value1, value2, "premiumpre");
            return (Criteria) this;
        }

        public Criteria andTurnovernowIsNull() {
            addCriterion("turnovernow is null");
            return (Criteria) this;
        }

        public Criteria andTurnovernowIsNotNull() {
            addCriterion("turnovernow is not null");
            return (Criteria) this;
        }

        public Criteria andTurnovernowEqualTo(BigDecimal value) {
            addCriterion("turnovernow =", value, "turnovernow");
            return (Criteria) this;
        }

        public Criteria andTurnovernowNotEqualTo(BigDecimal value) {
            addCriterion("turnovernow <>", value, "turnovernow");
            return (Criteria) this;
        }

        public Criteria andTurnovernowGreaterThan(BigDecimal value) {
            addCriterion("turnovernow >", value, "turnovernow");
            return (Criteria) this;
        }

        public Criteria andTurnovernowGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("turnovernow >=", value, "turnovernow");
            return (Criteria) this;
        }

        public Criteria andTurnovernowLessThan(BigDecimal value) {
            addCriterion("turnovernow <", value, "turnovernow");
            return (Criteria) this;
        }

        public Criteria andTurnovernowLessThanOrEqualTo(BigDecimal value) {
            addCriterion("turnovernow <=", value, "turnovernow");
            return (Criteria) this;
        }

        public Criteria andTurnovernowIn(List<BigDecimal> values) {
            addCriterion("turnovernow in", values, "turnovernow");
            return (Criteria) this;
        }

        public Criteria andTurnovernowNotIn(List<BigDecimal> values) {
            addCriterion("turnovernow not in", values, "turnovernow");
            return (Criteria) this;
        }

        public Criteria andTurnovernowBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("turnovernow between", value1, value2, "turnovernow");
            return (Criteria) this;
        }

        public Criteria andTurnovernowNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("turnovernow not between", value1, value2, "turnovernow");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreIsNull() {
            addCriterion("turnoverpre is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreIsNotNull() {
            addCriterion("turnoverpre is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreEqualTo(BigDecimal value) {
            addCriterion("turnoverpre =", value, "turnoverpre");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreNotEqualTo(BigDecimal value) {
            addCriterion("turnoverpre <>", value, "turnoverpre");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreGreaterThan(BigDecimal value) {
            addCriterion("turnoverpre >", value, "turnoverpre");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("turnoverpre >=", value, "turnoverpre");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreLessThan(BigDecimal value) {
            addCriterion("turnoverpre <", value, "turnoverpre");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("turnoverpre <=", value, "turnoverpre");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreIn(List<BigDecimal> values) {
            addCriterion("turnoverpre in", values, "turnoverpre");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreNotIn(List<BigDecimal> values) {
            addCriterion("turnoverpre not in", values, "turnoverpre");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("turnoverpre between", value1, value2, "turnoverpre");
            return (Criteria) this;
        }

        public Criteria andTurnoverpreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("turnoverpre not between", value1, value2, "turnoverpre");
            return (Criteria) this;
        }

        public Criteria andProfitnowIsNull() {
            addCriterion("profitnow is null");
            return (Criteria) this;
        }

        public Criteria andProfitnowIsNotNull() {
            addCriterion("profitnow is not null");
            return (Criteria) this;
        }

        public Criteria andProfitnowEqualTo(BigDecimal value) {
            addCriterion("profitnow =", value, "profitnow");
            return (Criteria) this;
        }

        public Criteria andProfitnowNotEqualTo(BigDecimal value) {
            addCriterion("profitnow <>", value, "profitnow");
            return (Criteria) this;
        }

        public Criteria andProfitnowGreaterThan(BigDecimal value) {
            addCriterion("profitnow >", value, "profitnow");
            return (Criteria) this;
        }

        public Criteria andProfitnowGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profitnow >=", value, "profitnow");
            return (Criteria) this;
        }

        public Criteria andProfitnowLessThan(BigDecimal value) {
            addCriterion("profitnow <", value, "profitnow");
            return (Criteria) this;
        }

        public Criteria andProfitnowLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profitnow <=", value, "profitnow");
            return (Criteria) this;
        }

        public Criteria andProfitnowIn(List<BigDecimal> values) {
            addCriterion("profitnow in", values, "profitnow");
            return (Criteria) this;
        }

        public Criteria andProfitnowNotIn(List<BigDecimal> values) {
            addCriterion("profitnow not in", values, "profitnow");
            return (Criteria) this;
        }

        public Criteria andProfitnowBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profitnow between", value1, value2, "profitnow");
            return (Criteria) this;
        }

        public Criteria andProfitnowNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profitnow not between", value1, value2, "profitnow");
            return (Criteria) this;
        }

        public Criteria andProfitpreIsNull() {
            addCriterion("profitpre is null");
            return (Criteria) this;
        }

        public Criteria andProfitpreIsNotNull() {
            addCriterion("profitpre is not null");
            return (Criteria) this;
        }

        public Criteria andProfitpreEqualTo(BigDecimal value) {
            addCriterion("profitpre =", value, "profitpre");
            return (Criteria) this;
        }

        public Criteria andProfitpreNotEqualTo(BigDecimal value) {
            addCriterion("profitpre <>", value, "profitpre");
            return (Criteria) this;
        }

        public Criteria andProfitpreGreaterThan(BigDecimal value) {
            addCriterion("profitpre >", value, "profitpre");
            return (Criteria) this;
        }

        public Criteria andProfitpreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("profitpre >=", value, "profitpre");
            return (Criteria) this;
        }

        public Criteria andProfitpreLessThan(BigDecimal value) {
            addCriterion("profitpre <", value, "profitpre");
            return (Criteria) this;
        }

        public Criteria andProfitpreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("profitpre <=", value, "profitpre");
            return (Criteria) this;
        }

        public Criteria andProfitpreIn(List<BigDecimal> values) {
            addCriterion("profitpre in", values, "profitpre");
            return (Criteria) this;
        }

        public Criteria andProfitpreNotIn(List<BigDecimal> values) {
            addCriterion("profitpre not in", values, "profitpre");
            return (Criteria) this;
        }

        public Criteria andProfitpreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profitpre between", value1, value2, "profitpre");
            return (Criteria) this;
        }

        public Criteria andProfitpreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("profitpre not between", value1, value2, "profitpre");
            return (Criteria) this;
        }

        public Criteria andReportplaceIsNull() {
            addCriterion("reportplace is null");
            return (Criteria) this;
        }

        public Criteria andReportplaceIsNotNull() {
            addCriterion("reportplace is not null");
            return (Criteria) this;
        }

        public Criteria andReportplaceEqualTo(String value) {
            addCriterion("reportplace =", value, "reportplace");
            return (Criteria) this;
        }

        public Criteria andReportplaceNotEqualTo(String value) {
            addCriterion("reportplace <>", value, "reportplace");
            return (Criteria) this;
        }

        public Criteria andReportplaceGreaterThan(String value) {
            addCriterion("reportplace >", value, "reportplace");
            return (Criteria) this;
        }

        public Criteria andReportplaceGreaterThanOrEqualTo(String value) {
            addCriterion("reportplace >=", value, "reportplace");
            return (Criteria) this;
        }

        public Criteria andReportplaceLessThan(String value) {
            addCriterion("reportplace <", value, "reportplace");
            return (Criteria) this;
        }

        public Criteria andReportplaceLessThanOrEqualTo(String value) {
            addCriterion("reportplace <=", value, "reportplace");
            return (Criteria) this;
        }

        public Criteria andReportplaceLike(String value) {
            addCriterion("reportplace like", value, "reportplace");
            return (Criteria) this;
        }

        public Criteria andReportplaceNotLike(String value) {
            addCriterion("reportplace not like", value, "reportplace");
            return (Criteria) this;
        }

        public Criteria andReportplaceIn(List<String> values) {
            addCriterion("reportplace in", values, "reportplace");
            return (Criteria) this;
        }

        public Criteria andReportplaceNotIn(List<String> values) {
            addCriterion("reportplace not in", values, "reportplace");
            return (Criteria) this;
        }

        public Criteria andReportplaceBetween(String value1, String value2) {
            addCriterion("reportplace between", value1, value2, "reportplace");
            return (Criteria) this;
        }

        public Criteria andReportplaceNotBetween(String value1, String value2) {
            addCriterion("reportplace not between", value1, value2, "reportplace");
            return (Criteria) this;
        }

        public Criteria andCreatemanIsNull() {
            addCriterion("createman is null");
            return (Criteria) this;
        }

        public Criteria andCreatemanIsNotNull() {
            addCriterion("createman is not null");
            return (Criteria) this;
        }

        public Criteria andCreatemanEqualTo(String value) {
            addCriterion("createman =", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanNotEqualTo(String value) {
            addCriterion("createman <>", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanGreaterThan(String value) {
            addCriterion("createman >", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanGreaterThanOrEqualTo(String value) {
            addCriterion("createman >=", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanLessThan(String value) {
            addCriterion("createman <", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanLessThanOrEqualTo(String value) {
            addCriterion("createman <=", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanLike(String value) {
            addCriterion("createman like", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanNotLike(String value) {
            addCriterion("createman not like", value, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanIn(List<String> values) {
            addCriterion("createman in", values, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanNotIn(List<String> values) {
            addCriterion("createman not in", values, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanBetween(String value1, String value2) {
            addCriterion("createman between", value1, value2, "createman");
            return (Criteria) this;
        }

        public Criteria andCreatemanNotBetween(String value1, String value2) {
            addCriterion("createman not between", value1, value2, "createman");
            return (Criteria) this;
        }

        public Criteria andAuditmanIsNull() {
            addCriterion("auditman is null");
            return (Criteria) this;
        }

        public Criteria andAuditmanIsNotNull() {
            addCriterion("auditman is not null");
            return (Criteria) this;
        }

        public Criteria andAuditmanEqualTo(String value) {
            addCriterion("auditman =", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanNotEqualTo(String value) {
            addCriterion("auditman <>", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanGreaterThan(String value) {
            addCriterion("auditman >", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanGreaterThanOrEqualTo(String value) {
            addCriterion("auditman >=", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanLessThan(String value) {
            addCriterion("auditman <", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanLessThanOrEqualTo(String value) {
            addCriterion("auditman <=", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanLike(String value) {
            addCriterion("auditman like", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanNotLike(String value) {
            addCriterion("auditman not like", value, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanIn(List<String> values) {
            addCriterion("auditman in", values, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanNotIn(List<String> values) {
            addCriterion("auditman not in", values, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanBetween(String value1, String value2) {
            addCriterion("auditman between", value1, value2, "auditman");
            return (Criteria) this;
        }

        public Criteria andAuditmanNotBetween(String value1, String value2) {
            addCriterion("auditman not between", value1, value2, "auditman");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
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