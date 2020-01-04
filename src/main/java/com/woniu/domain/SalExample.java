package com.woniu.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andSalIdIsNull() {
            addCriterion("SAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSalIdIsNotNull() {
            addCriterion("SAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSalIdEqualTo(Integer value) {
            addCriterion("SAL_ID =", value, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdNotEqualTo(Integer value) {
            addCriterion("SAL_ID <>", value, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdGreaterThan(Integer value) {
            addCriterion("SAL_ID >", value, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SAL_ID >=", value, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdLessThan(Integer value) {
            addCriterion("SAL_ID <", value, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdLessThanOrEqualTo(Integer value) {
            addCriterion("SAL_ID <=", value, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdIn(List<Integer> values) {
            addCriterion("SAL_ID in", values, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdNotIn(List<Integer> values) {
            addCriterion("SAL_ID not in", values, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdBetween(Integer value1, Integer value2) {
            addCriterion("SAL_ID between", value1, value2, "salId");
            return (Criteria) this;
        }

        public Criteria andSalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SAL_ID not between", value1, value2, "salId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("EMP_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("EMP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("EMP_ID =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("EMP_ID <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("EMP_ID >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EMP_ID >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("EMP_ID <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("EMP_ID <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("EMP_ID in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("EMP_ID not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("EMP_ID between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EMP_ID not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("YEAR is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("YEAR =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("YEAR <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("YEAR >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("YEAR >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("YEAR <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("YEAR <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("YEAR in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("YEAR not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("YEAR between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("YEAR not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("MONTH is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(Integer value) {
            addCriterion("MONTH =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(Integer value) {
            addCriterion("MONTH <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(Integer value) {
            addCriterion("MONTH >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("MONTH >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(Integer value) {
            addCriterion("MONTH <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(Integer value) {
            addCriterion("MONTH <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<Integer> values) {
            addCriterion("MONTH in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<Integer> values) {
            addCriterion("MONTH not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(Integer value1, Integer value2) {
            addCriterion("MONTH between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("MONTH not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andBasepayIsNull() {
            addCriterion("BASEPAY is null");
            return (Criteria) this;
        }

        public Criteria andBasepayIsNotNull() {
            addCriterion("BASEPAY is not null");
            return (Criteria) this;
        }

        public Criteria andBasepayEqualTo(BigDecimal value) {
            addCriterion("BASEPAY =", value, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayNotEqualTo(BigDecimal value) {
            addCriterion("BASEPAY <>", value, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayGreaterThan(BigDecimal value) {
            addCriterion("BASEPAY >", value, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEPAY >=", value, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayLessThan(BigDecimal value) {
            addCriterion("BASEPAY <", value, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASEPAY <=", value, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayIn(List<BigDecimal> values) {
            addCriterion("BASEPAY in", values, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayNotIn(List<BigDecimal> values) {
            addCriterion("BASEPAY not in", values, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEPAY between", value1, value2, "basepay");
            return (Criteria) this;
        }

        public Criteria andBasepayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASEPAY not between", value1, value2, "basepay");
            return (Criteria) this;
        }

        public Criteria andJobAllowanceIsNull() {
            addCriterion("JOB_ALLOWANCE is null");
            return (Criteria) this;
        }

        public Criteria andJobAllowanceIsNotNull() {
            addCriterion("JOB_ALLOWANCE is not null");
            return (Criteria) this;
        }

        public Criteria andJobAllowanceEqualTo(BigDecimal value) {
            addCriterion("JOB_ALLOWANCE =", value, "jobAllowance");
            return (Criteria) this;
        }

        public Criteria andJobAllowanceNotEqualTo(BigDecimal value) {
            addCriterion("JOB_ALLOWANCE <>", value, "jobAllowance");
            return (Criteria) this;
        }

        public Criteria andJobAllowanceGreaterThan(BigDecimal value) {
            addCriterion("JOB_ALLOWANCE >", value, "jobAllowance");
            return (Criteria) this;
        }

        public Criteria andJobAllowanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JOB_ALLOWANCE >=", value, "jobAllowance");
            return (Criteria) this;
        }

        public Criteria andJobAllowanceLessThan(BigDecimal value) {
            addCriterion("JOB_ALLOWANCE <", value, "jobAllowance");
            return (Criteria) this;
        }

        public Criteria andJobAllowanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JOB_ALLOWANCE <=", value, "jobAllowance");
            return (Criteria) this;
        }

        public Criteria andJobAllowanceIn(List<BigDecimal> values) {
            addCriterion("JOB_ALLOWANCE in", values, "jobAllowance");
            return (Criteria) this;
        }

        public Criteria andJobAllowanceNotIn(List<BigDecimal> values) {
            addCriterion("JOB_ALLOWANCE not in", values, "jobAllowance");
            return (Criteria) this;
        }

        public Criteria andJobAllowanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JOB_ALLOWANCE between", value1, value2, "jobAllowance");
            return (Criteria) this;
        }

        public Criteria andJobAllowanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JOB_ALLOWANCE not between", value1, value2, "jobAllowance");
            return (Criteria) this;
        }

        public Criteria andCommAllowanceIsNull() {
            addCriterion("COMM_ALLOWANCE is null");
            return (Criteria) this;
        }

        public Criteria andCommAllowanceIsNotNull() {
            addCriterion("COMM_ALLOWANCE is not null");
            return (Criteria) this;
        }

        public Criteria andCommAllowanceEqualTo(BigDecimal value) {
            addCriterion("COMM_ALLOWANCE =", value, "commAllowance");
            return (Criteria) this;
        }

        public Criteria andCommAllowanceNotEqualTo(BigDecimal value) {
            addCriterion("COMM_ALLOWANCE <>", value, "commAllowance");
            return (Criteria) this;
        }

        public Criteria andCommAllowanceGreaterThan(BigDecimal value) {
            addCriterion("COMM_ALLOWANCE >", value, "commAllowance");
            return (Criteria) this;
        }

        public Criteria andCommAllowanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMM_ALLOWANCE >=", value, "commAllowance");
            return (Criteria) this;
        }

        public Criteria andCommAllowanceLessThan(BigDecimal value) {
            addCriterion("COMM_ALLOWANCE <", value, "commAllowance");
            return (Criteria) this;
        }

        public Criteria andCommAllowanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMM_ALLOWANCE <=", value, "commAllowance");
            return (Criteria) this;
        }

        public Criteria andCommAllowanceIn(List<BigDecimal> values) {
            addCriterion("COMM_ALLOWANCE in", values, "commAllowance");
            return (Criteria) this;
        }

        public Criteria andCommAllowanceNotIn(List<BigDecimal> values) {
            addCriterion("COMM_ALLOWANCE not in", values, "commAllowance");
            return (Criteria) this;
        }

        public Criteria andCommAllowanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMM_ALLOWANCE between", value1, value2, "commAllowance");
            return (Criteria) this;
        }

        public Criteria andCommAllowanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMM_ALLOWANCE not between", value1, value2, "commAllowance");
            return (Criteria) this;
        }

        public Criteria andDutyAllowanceIsNull() {
            addCriterion("DUTY_ALLOWANCE is null");
            return (Criteria) this;
        }

        public Criteria andDutyAllowanceIsNotNull() {
            addCriterion("DUTY_ALLOWANCE is not null");
            return (Criteria) this;
        }

        public Criteria andDutyAllowanceEqualTo(BigDecimal value) {
            addCriterion("DUTY_ALLOWANCE =", value, "dutyAllowance");
            return (Criteria) this;
        }

        public Criteria andDutyAllowanceNotEqualTo(BigDecimal value) {
            addCriterion("DUTY_ALLOWANCE <>", value, "dutyAllowance");
            return (Criteria) this;
        }

        public Criteria andDutyAllowanceGreaterThan(BigDecimal value) {
            addCriterion("DUTY_ALLOWANCE >", value, "dutyAllowance");
            return (Criteria) this;
        }

        public Criteria andDutyAllowanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DUTY_ALLOWANCE >=", value, "dutyAllowance");
            return (Criteria) this;
        }

        public Criteria andDutyAllowanceLessThan(BigDecimal value) {
            addCriterion("DUTY_ALLOWANCE <", value, "dutyAllowance");
            return (Criteria) this;
        }

        public Criteria andDutyAllowanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DUTY_ALLOWANCE <=", value, "dutyAllowance");
            return (Criteria) this;
        }

        public Criteria andDutyAllowanceIn(List<BigDecimal> values) {
            addCriterion("DUTY_ALLOWANCE in", values, "dutyAllowance");
            return (Criteria) this;
        }

        public Criteria andDutyAllowanceNotIn(List<BigDecimal> values) {
            addCriterion("DUTY_ALLOWANCE not in", values, "dutyAllowance");
            return (Criteria) this;
        }

        public Criteria andDutyAllowanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DUTY_ALLOWANCE between", value1, value2, "dutyAllowance");
            return (Criteria) this;
        }

        public Criteria andDutyAllowanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DUTY_ALLOWANCE not between", value1, value2, "dutyAllowance");
            return (Criteria) this;
        }

        public Criteria andHealthAllowanceIsNull() {
            addCriterion("HEALTH_ALLOWANCE is null");
            return (Criteria) this;
        }

        public Criteria andHealthAllowanceIsNotNull() {
            addCriterion("HEALTH_ALLOWANCE is not null");
            return (Criteria) this;
        }

        public Criteria andHealthAllowanceEqualTo(BigDecimal value) {
            addCriterion("HEALTH_ALLOWANCE =", value, "healthAllowance");
            return (Criteria) this;
        }

        public Criteria andHealthAllowanceNotEqualTo(BigDecimal value) {
            addCriterion("HEALTH_ALLOWANCE <>", value, "healthAllowance");
            return (Criteria) this;
        }

        public Criteria andHealthAllowanceGreaterThan(BigDecimal value) {
            addCriterion("HEALTH_ALLOWANCE >", value, "healthAllowance");
            return (Criteria) this;
        }

        public Criteria andHealthAllowanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEALTH_ALLOWANCE >=", value, "healthAllowance");
            return (Criteria) this;
        }

        public Criteria andHealthAllowanceLessThan(BigDecimal value) {
            addCriterion("HEALTH_ALLOWANCE <", value, "healthAllowance");
            return (Criteria) this;
        }

        public Criteria andHealthAllowanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEALTH_ALLOWANCE <=", value, "healthAllowance");
            return (Criteria) this;
        }

        public Criteria andHealthAllowanceIn(List<BigDecimal> values) {
            addCriterion("HEALTH_ALLOWANCE in", values, "healthAllowance");
            return (Criteria) this;
        }

        public Criteria andHealthAllowanceNotIn(List<BigDecimal> values) {
            addCriterion("HEALTH_ALLOWANCE not in", values, "healthAllowance");
            return (Criteria) this;
        }

        public Criteria andHealthAllowanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEALTH_ALLOWANCE between", value1, value2, "healthAllowance");
            return (Criteria) this;
        }

        public Criteria andHealthAllowanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEALTH_ALLOWANCE not between", value1, value2, "healthAllowance");
            return (Criteria) this;
        }

        public Criteria andPublicHousingFundIsNull() {
            addCriterion("PUBLIC_HOUSING_FUND is null");
            return (Criteria) this;
        }

        public Criteria andPublicHousingFundIsNotNull() {
            addCriterion("PUBLIC_HOUSING_FUND is not null");
            return (Criteria) this;
        }

        public Criteria andPublicHousingFundEqualTo(BigDecimal value) {
            addCriterion("PUBLIC_HOUSING_FUND =", value, "publicHousingFund");
            return (Criteria) this;
        }

        public Criteria andPublicHousingFundNotEqualTo(BigDecimal value) {
            addCriterion("PUBLIC_HOUSING_FUND <>", value, "publicHousingFund");
            return (Criteria) this;
        }

        public Criteria andPublicHousingFundGreaterThan(BigDecimal value) {
            addCriterion("PUBLIC_HOUSING_FUND >", value, "publicHousingFund");
            return (Criteria) this;
        }

        public Criteria andPublicHousingFundGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PUBLIC_HOUSING_FUND >=", value, "publicHousingFund");
            return (Criteria) this;
        }

        public Criteria andPublicHousingFundLessThan(BigDecimal value) {
            addCriterion("PUBLIC_HOUSING_FUND <", value, "publicHousingFund");
            return (Criteria) this;
        }

        public Criteria andPublicHousingFundLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PUBLIC_HOUSING_FUND <=", value, "publicHousingFund");
            return (Criteria) this;
        }

        public Criteria andPublicHousingFundIn(List<BigDecimal> values) {
            addCriterion("PUBLIC_HOUSING_FUND in", values, "publicHousingFund");
            return (Criteria) this;
        }

        public Criteria andPublicHousingFundNotIn(List<BigDecimal> values) {
            addCriterion("PUBLIC_HOUSING_FUND not in", values, "publicHousingFund");
            return (Criteria) this;
        }

        public Criteria andPublicHousingFundBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PUBLIC_HOUSING_FUND between", value1, value2, "publicHousingFund");
            return (Criteria) this;
        }

        public Criteria andPublicHousingFundNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PUBLIC_HOUSING_FUND not between", value1, value2, "publicHousingFund");
            return (Criteria) this;
        }

        public Criteria andExtraIncomeIdIsNull() {
            addCriterion("EXTRA_INCOME_ID is null");
            return (Criteria) this;
        }

        public Criteria andExtraIncomeIdIsNotNull() {
            addCriterion("EXTRA_INCOME_ID is not null");
            return (Criteria) this;
        }

        public Criteria andExtraIncomeIdEqualTo(BigDecimal value) {
            addCriterion("EXTRA_INCOME_ID =", value, "extraIncomeId");
            return (Criteria) this;
        }

        public Criteria andExtraIncomeIdNotEqualTo(BigDecimal value) {
            addCriterion("EXTRA_INCOME_ID <>", value, "extraIncomeId");
            return (Criteria) this;
        }

        public Criteria andExtraIncomeIdGreaterThan(BigDecimal value) {
            addCriterion("EXTRA_INCOME_ID >", value, "extraIncomeId");
            return (Criteria) this;
        }

        public Criteria andExtraIncomeIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRA_INCOME_ID >=", value, "extraIncomeId");
            return (Criteria) this;
        }

        public Criteria andExtraIncomeIdLessThan(BigDecimal value) {
            addCriterion("EXTRA_INCOME_ID <", value, "extraIncomeId");
            return (Criteria) this;
        }

        public Criteria andExtraIncomeIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRA_INCOME_ID <=", value, "extraIncomeId");
            return (Criteria) this;
        }

        public Criteria andExtraIncomeIdIn(List<BigDecimal> values) {
            addCriterion("EXTRA_INCOME_ID in", values, "extraIncomeId");
            return (Criteria) this;
        }

        public Criteria andExtraIncomeIdNotIn(List<BigDecimal> values) {
            addCriterion("EXTRA_INCOME_ID not in", values, "extraIncomeId");
            return (Criteria) this;
        }

        public Criteria andExtraIncomeIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRA_INCOME_ID between", value1, value2, "extraIncomeId");
            return (Criteria) this;
        }

        public Criteria andExtraIncomeIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRA_INCOME_ID not between", value1, value2, "extraIncomeId");
            return (Criteria) this;
        }

        public Criteria andWithholdingTaxIsNull() {
            addCriterion("WITHHOLDING_TAX is null");
            return (Criteria) this;
        }

        public Criteria andWithholdingTaxIsNotNull() {
            addCriterion("WITHHOLDING_TAX is not null");
            return (Criteria) this;
        }

        public Criteria andWithholdingTaxEqualTo(BigDecimal value) {
            addCriterion("WITHHOLDING_TAX =", value, "withholdingTax");
            return (Criteria) this;
        }

        public Criteria andWithholdingTaxNotEqualTo(BigDecimal value) {
            addCriterion("WITHHOLDING_TAX <>", value, "withholdingTax");
            return (Criteria) this;
        }

        public Criteria andWithholdingTaxGreaterThan(BigDecimal value) {
            addCriterion("WITHHOLDING_TAX >", value, "withholdingTax");
            return (Criteria) this;
        }

        public Criteria andWithholdingTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WITHHOLDING_TAX >=", value, "withholdingTax");
            return (Criteria) this;
        }

        public Criteria andWithholdingTaxLessThan(BigDecimal value) {
            addCriterion("WITHHOLDING_TAX <", value, "withholdingTax");
            return (Criteria) this;
        }

        public Criteria andWithholdingTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WITHHOLDING_TAX <=", value, "withholdingTax");
            return (Criteria) this;
        }

        public Criteria andWithholdingTaxIn(List<BigDecimal> values) {
            addCriterion("WITHHOLDING_TAX in", values, "withholdingTax");
            return (Criteria) this;
        }

        public Criteria andWithholdingTaxNotIn(List<BigDecimal> values) {
            addCriterion("WITHHOLDING_TAX not in", values, "withholdingTax");
            return (Criteria) this;
        }

        public Criteria andWithholdingTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WITHHOLDING_TAX between", value1, value2, "withholdingTax");
            return (Criteria) this;
        }

        public Criteria andWithholdingTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WITHHOLDING_TAX not between", value1, value2, "withholdingTax");
            return (Criteria) this;
        }

        public Criteria andWithholdingTotleIsNull() {
            addCriterion("WITHHOLDING_TOTLE is null");
            return (Criteria) this;
        }

        public Criteria andWithholdingTotleIsNotNull() {
            addCriterion("WITHHOLDING_TOTLE is not null");
            return (Criteria) this;
        }

        public Criteria andWithholdingTotleEqualTo(BigDecimal value) {
            addCriterion("WITHHOLDING_TOTLE =", value, "withholdingTotle");
            return (Criteria) this;
        }

        public Criteria andWithholdingTotleNotEqualTo(BigDecimal value) {
            addCriterion("WITHHOLDING_TOTLE <>", value, "withholdingTotle");
            return (Criteria) this;
        }

        public Criteria andWithholdingTotleGreaterThan(BigDecimal value) {
            addCriterion("WITHHOLDING_TOTLE >", value, "withholdingTotle");
            return (Criteria) this;
        }

        public Criteria andWithholdingTotleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WITHHOLDING_TOTLE >=", value, "withholdingTotle");
            return (Criteria) this;
        }

        public Criteria andWithholdingTotleLessThan(BigDecimal value) {
            addCriterion("WITHHOLDING_TOTLE <", value, "withholdingTotle");
            return (Criteria) this;
        }

        public Criteria andWithholdingTotleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WITHHOLDING_TOTLE <=", value, "withholdingTotle");
            return (Criteria) this;
        }

        public Criteria andWithholdingTotleIn(List<BigDecimal> values) {
            addCriterion("WITHHOLDING_TOTLE in", values, "withholdingTotle");
            return (Criteria) this;
        }

        public Criteria andWithholdingTotleNotIn(List<BigDecimal> values) {
            addCriterion("WITHHOLDING_TOTLE not in", values, "withholdingTotle");
            return (Criteria) this;
        }

        public Criteria andWithholdingTotleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WITHHOLDING_TOTLE between", value1, value2, "withholdingTotle");
            return (Criteria) this;
        }

        public Criteria andWithholdingTotleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WITHHOLDING_TOTLE not between", value1, value2, "withholdingTotle");
            return (Criteria) this;
        }

        public Criteria andPayableSalIsNull() {
            addCriterion("PAYABLE_SAL is null");
            return (Criteria) this;
        }

        public Criteria andPayableSalIsNotNull() {
            addCriterion("PAYABLE_SAL is not null");
            return (Criteria) this;
        }

        public Criteria andPayableSalEqualTo(BigDecimal value) {
            addCriterion("PAYABLE_SAL =", value, "payableSal");
            return (Criteria) this;
        }

        public Criteria andPayableSalNotEqualTo(BigDecimal value) {
            addCriterion("PAYABLE_SAL <>", value, "payableSal");
            return (Criteria) this;
        }

        public Criteria andPayableSalGreaterThan(BigDecimal value) {
            addCriterion("PAYABLE_SAL >", value, "payableSal");
            return (Criteria) this;
        }

        public Criteria andPayableSalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYABLE_SAL >=", value, "payableSal");
            return (Criteria) this;
        }

        public Criteria andPayableSalLessThan(BigDecimal value) {
            addCriterion("PAYABLE_SAL <", value, "payableSal");
            return (Criteria) this;
        }

        public Criteria andPayableSalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYABLE_SAL <=", value, "payableSal");
            return (Criteria) this;
        }

        public Criteria andPayableSalIn(List<BigDecimal> values) {
            addCriterion("PAYABLE_SAL in", values, "payableSal");
            return (Criteria) this;
        }

        public Criteria andPayableSalNotIn(List<BigDecimal> values) {
            addCriterion("PAYABLE_SAL not in", values, "payableSal");
            return (Criteria) this;
        }

        public Criteria andPayableSalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYABLE_SAL between", value1, value2, "payableSal");
            return (Criteria) this;
        }

        public Criteria andPayableSalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYABLE_SAL not between", value1, value2, "payableSal");
            return (Criteria) this;
        }

        public Criteria andActualSalIsNull() {
            addCriterion("ACTUAL_SAL is null");
            return (Criteria) this;
        }

        public Criteria andActualSalIsNotNull() {
            addCriterion("ACTUAL_SAL is not null");
            return (Criteria) this;
        }

        public Criteria andActualSalEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_SAL =", value, "actualSal");
            return (Criteria) this;
        }

        public Criteria andActualSalNotEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_SAL <>", value, "actualSal");
            return (Criteria) this;
        }

        public Criteria andActualSalGreaterThan(BigDecimal value) {
            addCriterion("ACTUAL_SAL >", value, "actualSal");
            return (Criteria) this;
        }

        public Criteria andActualSalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_SAL >=", value, "actualSal");
            return (Criteria) this;
        }

        public Criteria andActualSalLessThan(BigDecimal value) {
            addCriterion("ACTUAL_SAL <", value, "actualSal");
            return (Criteria) this;
        }

        public Criteria andActualSalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTUAL_SAL <=", value, "actualSal");
            return (Criteria) this;
        }

        public Criteria andActualSalIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_SAL in", values, "actualSal");
            return (Criteria) this;
        }

        public Criteria andActualSalNotIn(List<BigDecimal> values) {
            addCriterion("ACTUAL_SAL not in", values, "actualSal");
            return (Criteria) this;
        }

        public Criteria andActualSalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_SAL between", value1, value2, "actualSal");
            return (Criteria) this;
        }

        public Criteria andActualSalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTUAL_SAL not between", value1, value2, "actualSal");
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