package com.kaisagroup.baoxian.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShouXianExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShouXianExample() {
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

        public Criteria andBxIdIsNull() {
            addCriterion("bx_id is null");
            return (Criteria) this;
        }

        public Criteria andBxIdIsNotNull() {
            addCriterion("bx_id is not null");
            return (Criteria) this;
        }

        public Criteria andBxIdEqualTo(String value) {
            addCriterion("bx_id =", value, "bxId");
            return (Criteria) this;
        }

        public Criteria andBxIdNotEqualTo(String value) {
            addCriterion("bx_id <>", value, "bxId");
            return (Criteria) this;
        }

        public Criteria andBxIdGreaterThan(String value) {
            addCriterion("bx_id >", value, "bxId");
            return (Criteria) this;
        }

        public Criteria andBxIdGreaterThanOrEqualTo(String value) {
            addCriterion("bx_id >=", value, "bxId");
            return (Criteria) this;
        }

        public Criteria andBxIdLessThan(String value) {
            addCriterion("bx_id <", value, "bxId");
            return (Criteria) this;
        }

        public Criteria andBxIdLessThanOrEqualTo(String value) {
            addCriterion("bx_id <=", value, "bxId");
            return (Criteria) this;
        }

        public Criteria andBxIdLike(String value) {
            addCriterion("bx_id like", value, "bxId");
            return (Criteria) this;
        }

        public Criteria andBxIdNotLike(String value) {
            addCriterion("bx_id not like", value, "bxId");
            return (Criteria) this;
        }

        public Criteria andBxIdIn(List<String> values) {
            addCriterion("bx_id in", values, "bxId");
            return (Criteria) this;
        }

        public Criteria andBxIdNotIn(List<String> values) {
            addCriterion("bx_id not in", values, "bxId");
            return (Criteria) this;
        }

        public Criteria andBxIdBetween(String value1, String value2) {
            addCriterion("bx_id between", value1, value2, "bxId");
            return (Criteria) this;
        }

        public Criteria andBxIdNotBetween(String value1, String value2) {
            addCriterion("bx_id not between", value1, value2, "bxId");
            return (Criteria) this;
        }

        public Criteria andArearangeIsNull() {
            addCriterion("arearange is null");
            return (Criteria) this;
        }

        public Criteria andArearangeIsNotNull() {
            addCriterion("arearange is not null");
            return (Criteria) this;
        }

        public Criteria andArearangeEqualTo(String value) {
            addCriterion("arearange =", value, "arearange");
            return (Criteria) this;
        }

        public Criteria andArearangeNotEqualTo(String value) {
            addCriterion("arearange <>", value, "arearange");
            return (Criteria) this;
        }

        public Criteria andArearangeGreaterThan(String value) {
            addCriterion("arearange >", value, "arearange");
            return (Criteria) this;
        }

        public Criteria andArearangeGreaterThanOrEqualTo(String value) {
            addCriterion("arearange >=", value, "arearange");
            return (Criteria) this;
        }

        public Criteria andArearangeLessThan(String value) {
            addCriterion("arearange <", value, "arearange");
            return (Criteria) this;
        }

        public Criteria andArearangeLessThanOrEqualTo(String value) {
            addCriterion("arearange <=", value, "arearange");
            return (Criteria) this;
        }

        public Criteria andArearangeLike(String value) {
            addCriterion("arearange like", value, "arearange");
            return (Criteria) this;
        }

        public Criteria andArearangeNotLike(String value) {
            addCriterion("arearange not like", value, "arearange");
            return (Criteria) this;
        }

        public Criteria andArearangeIn(List<String> values) {
            addCriterion("arearange in", values, "arearange");
            return (Criteria) this;
        }

        public Criteria andArearangeNotIn(List<String> values) {
            addCriterion("arearange not in", values, "arearange");
            return (Criteria) this;
        }

        public Criteria andArearangeBetween(String value1, String value2) {
            addCriterion("arearange between", value1, value2, "arearange");
            return (Criteria) this;
        }

        public Criteria andArearangeNotBetween(String value1, String value2) {
            addCriterion("arearange not between", value1, value2, "arearange");
            return (Criteria) this;
        }

        public Criteria andInsnameIsNull() {
            addCriterion("insname is null");
            return (Criteria) this;
        }

        public Criteria andInsnameIsNotNull() {
            addCriterion("insname is not null");
            return (Criteria) this;
        }

        public Criteria andInsnameEqualTo(String value) {
            addCriterion("insname =", value, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameNotEqualTo(String value) {
            addCriterion("insname <>", value, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameGreaterThan(String value) {
            addCriterion("insname >", value, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameGreaterThanOrEqualTo(String value) {
            addCriterion("insname >=", value, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameLessThan(String value) {
            addCriterion("insname <", value, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameLessThanOrEqualTo(String value) {
            addCriterion("insname <=", value, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameLike(String value) {
            addCriterion("insname like", value, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameNotLike(String value) {
            addCriterion("insname not like", value, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameIn(List<String> values) {
            addCriterion("insname in", values, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameNotIn(List<String> values) {
            addCriterion("insname not in", values, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameBetween(String value1, String value2) {
            addCriterion("insname between", value1, value2, "insname");
            return (Criteria) this;
        }

        public Criteria andInsnameNotBetween(String value1, String value2) {
            addCriterion("insname not between", value1, value2, "insname");
            return (Criteria) this;
        }

        public Criteria andInsurancenameIsNull() {
            addCriterion("insurancename is null");
            return (Criteria) this;
        }

        public Criteria andInsurancenameIsNotNull() {
            addCriterion("insurancename is not null");
            return (Criteria) this;
        }

        public Criteria andInsurancenameEqualTo(String value) {
            addCriterion("insurancename =", value, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameNotEqualTo(String value) {
            addCriterion("insurancename <>", value, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameGreaterThan(String value) {
            addCriterion("insurancename >", value, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameGreaterThanOrEqualTo(String value) {
            addCriterion("insurancename >=", value, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameLessThan(String value) {
            addCriterion("insurancename <", value, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameLessThanOrEqualTo(String value) {
            addCriterion("insurancename <=", value, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameLike(String value) {
            addCriterion("insurancename like", value, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameNotLike(String value) {
            addCriterion("insurancename not like", value, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameIn(List<String> values) {
            addCriterion("insurancename in", values, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameNotIn(List<String> values) {
            addCriterion("insurancename not in", values, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameBetween(String value1, String value2) {
            addCriterion("insurancename between", value1, value2, "insurancename");
            return (Criteria) this;
        }

        public Criteria andInsurancenameNotBetween(String value1, String value2) {
            addCriterion("insurancename not between", value1, value2, "insurancename");
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

        public Criteria andPremiumrenewalnowIsNull() {
            addCriterion("premiumrenewalnow is null");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalnowIsNotNull() {
            addCriterion("premiumrenewalnow is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalnowEqualTo(BigDecimal value) {
            addCriterion("premiumrenewalnow =", value, "premiumrenewalnow");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalnowNotEqualTo(BigDecimal value) {
            addCriterion("premiumrenewalnow <>", value, "premiumrenewalnow");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalnowGreaterThan(BigDecimal value) {
            addCriterion("premiumrenewalnow >", value, "premiumrenewalnow");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalnowGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("premiumrenewalnow >=", value, "premiumrenewalnow");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalnowLessThan(BigDecimal value) {
            addCriterion("premiumrenewalnow <", value, "premiumrenewalnow");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalnowLessThanOrEqualTo(BigDecimal value) {
            addCriterion("premiumrenewalnow <=", value, "premiumrenewalnow");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalnowIn(List<BigDecimal> values) {
            addCriterion("premiumrenewalnow in", values, "premiumrenewalnow");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalnowNotIn(List<BigDecimal> values) {
            addCriterion("premiumrenewalnow not in", values, "premiumrenewalnow");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalnowBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premiumrenewalnow between", value1, value2, "premiumrenewalnow");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalnowNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premiumrenewalnow not between", value1, value2, "premiumrenewalnow");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalpreIsNull() {
            addCriterion("premiumrenewalpre is null");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalpreIsNotNull() {
            addCriterion("premiumrenewalpre is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalpreEqualTo(BigDecimal value) {
            addCriterion("premiumrenewalpre =", value, "premiumrenewalpre");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalpreNotEqualTo(BigDecimal value) {
            addCriterion("premiumrenewalpre <>", value, "premiumrenewalpre");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalpreGreaterThan(BigDecimal value) {
            addCriterion("premiumrenewalpre >", value, "premiumrenewalpre");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalpreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("premiumrenewalpre >=", value, "premiumrenewalpre");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalpreLessThan(BigDecimal value) {
            addCriterion("premiumrenewalpre <", value, "premiumrenewalpre");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalpreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("premiumrenewalpre <=", value, "premiumrenewalpre");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalpreIn(List<BigDecimal> values) {
            addCriterion("premiumrenewalpre in", values, "premiumrenewalpre");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalpreNotIn(List<BigDecimal> values) {
            addCriterion("premiumrenewalpre not in", values, "premiumrenewalpre");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalpreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premiumrenewalpre between", value1, value2, "premiumrenewalpre");
            return (Criteria) this;
        }

        public Criteria andPremiumrenewalpreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premiumrenewalpre not between", value1, value2, "premiumrenewalpre");
            return (Criteria) this;
        }

        public Criteria andCommissionnowIsNull() {
            addCriterion("commissionnow is null");
            return (Criteria) this;
        }

        public Criteria andCommissionnowIsNotNull() {
            addCriterion("commissionnow is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionnowEqualTo(BigDecimal value) {
            addCriterion("commissionnow =", value, "commissionnow");
            return (Criteria) this;
        }

        public Criteria andCommissionnowNotEqualTo(BigDecimal value) {
            addCriterion("commissionnow <>", value, "commissionnow");
            return (Criteria) this;
        }

        public Criteria andCommissionnowGreaterThan(BigDecimal value) {
            addCriterion("commissionnow >", value, "commissionnow");
            return (Criteria) this;
        }

        public Criteria andCommissionnowGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commissionnow >=", value, "commissionnow");
            return (Criteria) this;
        }

        public Criteria andCommissionnowLessThan(BigDecimal value) {
            addCriterion("commissionnow <", value, "commissionnow");
            return (Criteria) this;
        }

        public Criteria andCommissionnowLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commissionnow <=", value, "commissionnow");
            return (Criteria) this;
        }

        public Criteria andCommissionnowIn(List<BigDecimal> values) {
            addCriterion("commissionnow in", values, "commissionnow");
            return (Criteria) this;
        }

        public Criteria andCommissionnowNotIn(List<BigDecimal> values) {
            addCriterion("commissionnow not in", values, "commissionnow");
            return (Criteria) this;
        }

        public Criteria andCommissionnowBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commissionnow between", value1, value2, "commissionnow");
            return (Criteria) this;
        }

        public Criteria andCommissionnowNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commissionnow not between", value1, value2, "commissionnow");
            return (Criteria) this;
        }

        public Criteria andCommissionpreIsNull() {
            addCriterion("commissionpre is null");
            return (Criteria) this;
        }

        public Criteria andCommissionpreIsNotNull() {
            addCriterion("commissionpre is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionpreEqualTo(BigDecimal value) {
            addCriterion("commissionpre =", value, "commissionpre");
            return (Criteria) this;
        }

        public Criteria andCommissionpreNotEqualTo(BigDecimal value) {
            addCriterion("commissionpre <>", value, "commissionpre");
            return (Criteria) this;
        }

        public Criteria andCommissionpreGreaterThan(BigDecimal value) {
            addCriterion("commissionpre >", value, "commissionpre");
            return (Criteria) this;
        }

        public Criteria andCommissionpreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commissionpre >=", value, "commissionpre");
            return (Criteria) this;
        }

        public Criteria andCommissionpreLessThan(BigDecimal value) {
            addCriterion("commissionpre <", value, "commissionpre");
            return (Criteria) this;
        }

        public Criteria andCommissionpreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commissionpre <=", value, "commissionpre");
            return (Criteria) this;
        }

        public Criteria andCommissionpreIn(List<BigDecimal> values) {
            addCriterion("commissionpre in", values, "commissionpre");
            return (Criteria) this;
        }

        public Criteria andCommissionpreNotIn(List<BigDecimal> values) {
            addCriterion("commissionpre not in", values, "commissionpre");
            return (Criteria) this;
        }

        public Criteria andCommissionpreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commissionpre between", value1, value2, "commissionpre");
            return (Criteria) this;
        }

        public Criteria andCommissionpreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commissionpre not between", value1, value2, "commissionpre");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalnowIsNull() {
            addCriterion("commissionrenewalnow is null");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalnowIsNotNull() {
            addCriterion("commissionrenewalnow is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalnowEqualTo(BigDecimal value) {
            addCriterion("commissionrenewalnow =", value, "commissionrenewalnow");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalnowNotEqualTo(BigDecimal value) {
            addCriterion("commissionrenewalnow <>", value, "commissionrenewalnow");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalnowGreaterThan(BigDecimal value) {
            addCriterion("commissionrenewalnow >", value, "commissionrenewalnow");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalnowGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commissionrenewalnow >=", value, "commissionrenewalnow");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalnowLessThan(BigDecimal value) {
            addCriterion("commissionrenewalnow <", value, "commissionrenewalnow");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalnowLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commissionrenewalnow <=", value, "commissionrenewalnow");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalnowIn(List<BigDecimal> values) {
            addCriterion("commissionrenewalnow in", values, "commissionrenewalnow");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalnowNotIn(List<BigDecimal> values) {
            addCriterion("commissionrenewalnow not in", values, "commissionrenewalnow");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalnowBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commissionrenewalnow between", value1, value2, "commissionrenewalnow");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalnowNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commissionrenewalnow not between", value1, value2, "commissionrenewalnow");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalpreIsNull() {
            addCriterion("commissionrenewalpre is null");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalpreIsNotNull() {
            addCriterion("commissionrenewalpre is not null");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalpreEqualTo(BigDecimal value) {
            addCriterion("commissionrenewalpre =", value, "commissionrenewalpre");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalpreNotEqualTo(BigDecimal value) {
            addCriterion("commissionrenewalpre <>", value, "commissionrenewalpre");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalpreGreaterThan(BigDecimal value) {
            addCriterion("commissionrenewalpre >", value, "commissionrenewalpre");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalpreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("commissionrenewalpre >=", value, "commissionrenewalpre");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalpreLessThan(BigDecimal value) {
            addCriterion("commissionrenewalpre <", value, "commissionrenewalpre");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalpreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("commissionrenewalpre <=", value, "commissionrenewalpre");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalpreIn(List<BigDecimal> values) {
            addCriterion("commissionrenewalpre in", values, "commissionrenewalpre");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalpreNotIn(List<BigDecimal> values) {
            addCriterion("commissionrenewalpre not in", values, "commissionrenewalpre");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalpreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commissionrenewalpre between", value1, value2, "commissionrenewalpre");
            return (Criteria) this;
        }

        public Criteria andCommissionrenewalpreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("commissionrenewalpre not between", value1, value2, "commissionrenewalpre");
            return (Criteria) this;
        }

        public Criteria andPremiumnetIsNull() {
            addCriterion("premiumnet is null");
            return (Criteria) this;
        }

        public Criteria andPremiumnetIsNotNull() {
            addCriterion("premiumnet is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumnetEqualTo(BigDecimal value) {
            addCriterion("premiumnet =", value, "premiumnet");
            return (Criteria) this;
        }

        public Criteria andPremiumnetNotEqualTo(BigDecimal value) {
            addCriterion("premiumnet <>", value, "premiumnet");
            return (Criteria) this;
        }

        public Criteria andPremiumnetGreaterThan(BigDecimal value) {
            addCriterion("premiumnet >", value, "premiumnet");
            return (Criteria) this;
        }

        public Criteria andPremiumnetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("premiumnet >=", value, "premiumnet");
            return (Criteria) this;
        }

        public Criteria andPremiumnetLessThan(BigDecimal value) {
            addCriterion("premiumnet <", value, "premiumnet");
            return (Criteria) this;
        }

        public Criteria andPremiumnetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("premiumnet <=", value, "premiumnet");
            return (Criteria) this;
        }

        public Criteria andPremiumnetIn(List<BigDecimal> values) {
            addCriterion("premiumnet in", values, "premiumnet");
            return (Criteria) this;
        }

        public Criteria andPremiumnetNotIn(List<BigDecimal> values) {
            addCriterion("premiumnet not in", values, "premiumnet");
            return (Criteria) this;
        }

        public Criteria andPremiumnetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premiumnet between", value1, value2, "premiumnet");
            return (Criteria) this;
        }

        public Criteria andPremiumnetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premiumnet not between", value1, value2, "premiumnet");
            return (Criteria) this;
        }

        public Criteria andPremiumtelIsNull() {
            addCriterion("premiumtel is null");
            return (Criteria) this;
        }

        public Criteria andPremiumtelIsNotNull() {
            addCriterion("premiumtel is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumtelEqualTo(BigDecimal value) {
            addCriterion("premiumtel =", value, "premiumtel");
            return (Criteria) this;
        }

        public Criteria andPremiumtelNotEqualTo(BigDecimal value) {
            addCriterion("premiumtel <>", value, "premiumtel");
            return (Criteria) this;
        }

        public Criteria andPremiumtelGreaterThan(BigDecimal value) {
            addCriterion("premiumtel >", value, "premiumtel");
            return (Criteria) this;
        }

        public Criteria andPremiumtelGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("premiumtel >=", value, "premiumtel");
            return (Criteria) this;
        }

        public Criteria andPremiumtelLessThan(BigDecimal value) {
            addCriterion("premiumtel <", value, "premiumtel");
            return (Criteria) this;
        }

        public Criteria andPremiumtelLessThanOrEqualTo(BigDecimal value) {
            addCriterion("premiumtel <=", value, "premiumtel");
            return (Criteria) this;
        }

        public Criteria andPremiumtelIn(List<BigDecimal> values) {
            addCriterion("premiumtel in", values, "premiumtel");
            return (Criteria) this;
        }

        public Criteria andPremiumtelNotIn(List<BigDecimal> values) {
            addCriterion("premiumtel not in", values, "premiumtel");
            return (Criteria) this;
        }

        public Criteria andPremiumtelBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premiumtel between", value1, value2, "premiumtel");
            return (Criteria) this;
        }

        public Criteria andPremiumtelNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("premiumtel not between", value1, value2, "premiumtel");
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