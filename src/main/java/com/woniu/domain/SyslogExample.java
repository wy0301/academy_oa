package com.woniu.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SyslogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SyslogExample() {
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

        public Criteria andLogIdIsNull() {
            addCriterion("LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andLogIdIsNotNull() {
            addCriterion("LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLogIdEqualTo(Integer value) {
            addCriterion("LOG_ID =", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotEqualTo(Integer value) {
            addCriterion("LOG_ID <>", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThan(Integer value) {
            addCriterion("LOG_ID >", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOG_ID >=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThan(Integer value) {
            addCriterion("LOG_ID <", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("LOG_ID <=", value, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdIn(List<Integer> values) {
            addCriterion("LOG_ID in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotIn(List<Integer> values) {
            addCriterion("LOG_ID not in", values, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdBetween(Integer value1, Integer value2) {
            addCriterion("LOG_ID between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LOG_ID not between", value1, value2, "logId");
            return (Criteria) this;
        }

        public Criteria andOpTimeIsNull() {
            addCriterion("OP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOpTimeIsNotNull() {
            addCriterion("OP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOpTimeEqualTo(Date value) {
            addCriterion("OP_TIME =", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotEqualTo(Date value) {
            addCriterion("OP_TIME <>", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeGreaterThan(Date value) {
            addCriterion("OP_TIME >", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OP_TIME >=", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeLessThan(Date value) {
            addCriterion("OP_TIME <", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeLessThanOrEqualTo(Date value) {
            addCriterion("OP_TIME <=", value, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeIn(List<Date> values) {
            addCriterion("OP_TIME in", values, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotIn(List<Date> values) {
            addCriterion("OP_TIME not in", values, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeBetween(Date value1, Date value2) {
            addCriterion("OP_TIME between", value1, value2, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpTimeNotBetween(Date value1, Date value2) {
            addCriterion("OP_TIME not between", value1, value2, "opTime");
            return (Criteria) this;
        }

        public Criteria andOpEmpIsNull() {
            addCriterion("OP_EMP is null");
            return (Criteria) this;
        }

        public Criteria andOpEmpIsNotNull() {
            addCriterion("OP_EMP is not null");
            return (Criteria) this;
        }

        public Criteria andOpEmpEqualTo(Integer value) {
            addCriterion("OP_EMP =", value, "opEmp");
            return (Criteria) this;
        }

        public Criteria andOpEmpNotEqualTo(Integer value) {
            addCriterion("OP_EMP <>", value, "opEmp");
            return (Criteria) this;
        }

        public Criteria andOpEmpGreaterThan(Integer value) {
            addCriterion("OP_EMP >", value, "opEmp");
            return (Criteria) this;
        }

        public Criteria andOpEmpGreaterThanOrEqualTo(Integer value) {
            addCriterion("OP_EMP >=", value, "opEmp");
            return (Criteria) this;
        }

        public Criteria andOpEmpLessThan(Integer value) {
            addCriterion("OP_EMP <", value, "opEmp");
            return (Criteria) this;
        }

        public Criteria andOpEmpLessThanOrEqualTo(Integer value) {
            addCriterion("OP_EMP <=", value, "opEmp");
            return (Criteria) this;
        }

        public Criteria andOpEmpIn(List<Integer> values) {
            addCriterion("OP_EMP in", values, "opEmp");
            return (Criteria) this;
        }

        public Criteria andOpEmpNotIn(List<Integer> values) {
            addCriterion("OP_EMP not in", values, "opEmp");
            return (Criteria) this;
        }

        public Criteria andOpEmpBetween(Integer value1, Integer value2) {
            addCriterion("OP_EMP between", value1, value2, "opEmp");
            return (Criteria) this;
        }

        public Criteria andOpEmpNotBetween(Integer value1, Integer value2) {
            addCriterion("OP_EMP not between", value1, value2, "opEmp");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andOpModuleIsNull() {
            addCriterion("OP_MODULE is null");
            return (Criteria) this;
        }

        public Criteria andOpModuleIsNotNull() {
            addCriterion("OP_MODULE is not null");
            return (Criteria) this;
        }

        public Criteria andOpModuleEqualTo(String value) {
            addCriterion("OP_MODULE =", value, "opModule");
            return (Criteria) this;
        }

        public Criteria andOpModuleNotEqualTo(String value) {
            addCriterion("OP_MODULE <>", value, "opModule");
            return (Criteria) this;
        }

        public Criteria andOpModuleGreaterThan(String value) {
            addCriterion("OP_MODULE >", value, "opModule");
            return (Criteria) this;
        }

        public Criteria andOpModuleGreaterThanOrEqualTo(String value) {
            addCriterion("OP_MODULE >=", value, "opModule");
            return (Criteria) this;
        }

        public Criteria andOpModuleLessThan(String value) {
            addCriterion("OP_MODULE <", value, "opModule");
            return (Criteria) this;
        }

        public Criteria andOpModuleLessThanOrEqualTo(String value) {
            addCriterion("OP_MODULE <=", value, "opModule");
            return (Criteria) this;
        }

        public Criteria andOpModuleLike(String value) {
            addCriterion("OP_MODULE like", value, "opModule");
            return (Criteria) this;
        }

        public Criteria andOpModuleNotLike(String value) {
            addCriterion("OP_MODULE not like", value, "opModule");
            return (Criteria) this;
        }

        public Criteria andOpModuleIn(List<String> values) {
            addCriterion("OP_MODULE in", values, "opModule");
            return (Criteria) this;
        }

        public Criteria andOpModuleNotIn(List<String> values) {
            addCriterion("OP_MODULE not in", values, "opModule");
            return (Criteria) this;
        }

        public Criteria andOpModuleBetween(String value1, String value2) {
            addCriterion("OP_MODULE between", value1, value2, "opModule");
            return (Criteria) this;
        }

        public Criteria andOpModuleNotBetween(String value1, String value2) {
            addCriterion("OP_MODULE not between", value1, value2, "opModule");
            return (Criteria) this;
        }

        public Criteria andOpTypeIsNull() {
            addCriterion("OP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOpTypeIsNotNull() {
            addCriterion("OP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpTypeEqualTo(String value) {
            addCriterion("OP_TYPE =", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotEqualTo(String value) {
            addCriterion("OP_TYPE <>", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeGreaterThan(String value) {
            addCriterion("OP_TYPE >", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OP_TYPE >=", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLessThan(String value) {
            addCriterion("OP_TYPE <", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLessThanOrEqualTo(String value) {
            addCriterion("OP_TYPE <=", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLike(String value) {
            addCriterion("OP_TYPE like", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotLike(String value) {
            addCriterion("OP_TYPE not like", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeIn(List<String> values) {
            addCriterion("OP_TYPE in", values, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotIn(List<String> values) {
            addCriterion("OP_TYPE not in", values, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeBetween(String value1, String value2) {
            addCriterion("OP_TYPE between", value1, value2, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotBetween(String value1, String value2) {
            addCriterion("OP_TYPE not between", value1, value2, "opType");
            return (Criteria) this;
        }

        public Criteria andOpContentIsNull() {
            addCriterion("OP_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andOpContentIsNotNull() {
            addCriterion("OP_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andOpContentEqualTo(String value) {
            addCriterion("OP_CONTENT =", value, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentNotEqualTo(String value) {
            addCriterion("OP_CONTENT <>", value, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentGreaterThan(String value) {
            addCriterion("OP_CONTENT >", value, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentGreaterThanOrEqualTo(String value) {
            addCriterion("OP_CONTENT >=", value, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentLessThan(String value) {
            addCriterion("OP_CONTENT <", value, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentLessThanOrEqualTo(String value) {
            addCriterion("OP_CONTENT <=", value, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentLike(String value) {
            addCriterion("OP_CONTENT like", value, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentNotLike(String value) {
            addCriterion("OP_CONTENT not like", value, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentIn(List<String> values) {
            addCriterion("OP_CONTENT in", values, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentNotIn(List<String> values) {
            addCriterion("OP_CONTENT not in", values, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentBetween(String value1, String value2) {
            addCriterion("OP_CONTENT between", value1, value2, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpContentNotBetween(String value1, String value2) {
            addCriterion("OP_CONTENT not between", value1, value2, "opContent");
            return (Criteria) this;
        }

        public Criteria andOpDurationIsNull() {
            addCriterion("OP_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andOpDurationIsNotNull() {
            addCriterion("OP_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andOpDurationEqualTo(BigDecimal value) {
            addCriterion("OP_DURATION =", value, "opDuration");
            return (Criteria) this;
        }

        public Criteria andOpDurationNotEqualTo(BigDecimal value) {
            addCriterion("OP_DURATION <>", value, "opDuration");
            return (Criteria) this;
        }

        public Criteria andOpDurationGreaterThan(BigDecimal value) {
            addCriterion("OP_DURATION >", value, "opDuration");
            return (Criteria) this;
        }

        public Criteria andOpDurationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OP_DURATION >=", value, "opDuration");
            return (Criteria) this;
        }

        public Criteria andOpDurationLessThan(BigDecimal value) {
            addCriterion("OP_DURATION <", value, "opDuration");
            return (Criteria) this;
        }

        public Criteria andOpDurationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OP_DURATION <=", value, "opDuration");
            return (Criteria) this;
        }

        public Criteria andOpDurationIn(List<BigDecimal> values) {
            addCriterion("OP_DURATION in", values, "opDuration");
            return (Criteria) this;
        }

        public Criteria andOpDurationNotIn(List<BigDecimal> values) {
            addCriterion("OP_DURATION not in", values, "opDuration");
            return (Criteria) this;
        }

        public Criteria andOpDurationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OP_DURATION between", value1, value2, "opDuration");
            return (Criteria) this;
        }

        public Criteria andOpDurationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OP_DURATION not between", value1, value2, "opDuration");
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