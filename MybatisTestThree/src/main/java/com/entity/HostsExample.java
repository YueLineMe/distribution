package com.entity;

import java.util.ArrayList;
import java.util.List;

public class HostsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hosts
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hosts
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hosts
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hosts
     *
     * @mbg.generated
     */
    public HostsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hosts
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hosts
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hosts
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hosts
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hosts
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hosts
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hosts
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hosts
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hosts
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hosts
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hosts
     *
     * @mbg.generated
     */
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

        public Criteria andHOSTIsNull() {
            addCriterion("HOST is null");
            return (Criteria) this;
        }

        public Criteria andHOSTIsNotNull() {
            addCriterion("HOST is not null");
            return (Criteria) this;
        }

        public Criteria andHOSTEqualTo(String value) {
            addCriterion("HOST =", value, "HOST");
            return (Criteria) this;
        }

        public Criteria andHOSTNotEqualTo(String value) {
            addCriterion("HOST <>", value, "HOST");
            return (Criteria) this;
        }

        public Criteria andHOSTGreaterThan(String value) {
            addCriterion("HOST >", value, "HOST");
            return (Criteria) this;
        }

        public Criteria andHOSTGreaterThanOrEqualTo(String value) {
            addCriterion("HOST >=", value, "HOST");
            return (Criteria) this;
        }

        public Criteria andHOSTLessThan(String value) {
            addCriterion("HOST <", value, "HOST");
            return (Criteria) this;
        }

        public Criteria andHOSTLessThanOrEqualTo(String value) {
            addCriterion("HOST <=", value, "HOST");
            return (Criteria) this;
        }

        public Criteria andHOSTLike(String value) {
            addCriterion("HOST like", value, "HOST");
            return (Criteria) this;
        }

        public Criteria andHOSTNotLike(String value) {
            addCriterion("HOST not like", value, "HOST");
            return (Criteria) this;
        }

        public Criteria andHOSTIn(List<String> values) {
            addCriterion("HOST in", values, "HOST");
            return (Criteria) this;
        }

        public Criteria andHOSTNotIn(List<String> values) {
            addCriterion("HOST not in", values, "HOST");
            return (Criteria) this;
        }

        public Criteria andHOSTBetween(String value1, String value2) {
            addCriterion("HOST between", value1, value2, "HOST");
            return (Criteria) this;
        }

        public Criteria andHOSTNotBetween(String value1, String value2) {
            addCriterion("HOST not between", value1, value2, "HOST");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSIsNull() {
            addCriterion("CURRENT_CONNECTIONS is null");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSIsNotNull() {
            addCriterion("CURRENT_CONNECTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSEqualTo(Long value) {
            addCriterion("CURRENT_CONNECTIONS =", value, "CURRENT_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSNotEqualTo(Long value) {
            addCriterion("CURRENT_CONNECTIONS <>", value, "CURRENT_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSGreaterThan(Long value) {
            addCriterion("CURRENT_CONNECTIONS >", value, "CURRENT_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSGreaterThanOrEqualTo(Long value) {
            addCriterion("CURRENT_CONNECTIONS >=", value, "CURRENT_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSLessThan(Long value) {
            addCriterion("CURRENT_CONNECTIONS <", value, "CURRENT_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSLessThanOrEqualTo(Long value) {
            addCriterion("CURRENT_CONNECTIONS <=", value, "CURRENT_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSIn(List<Long> values) {
            addCriterion("CURRENT_CONNECTIONS in", values, "CURRENT_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSNotIn(List<Long> values) {
            addCriterion("CURRENT_CONNECTIONS not in", values, "CURRENT_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSBetween(Long value1, Long value2) {
            addCriterion("CURRENT_CONNECTIONS between", value1, value2, "CURRENT_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andCURRENT_CONNECTIONSNotBetween(Long value1, Long value2) {
            addCriterion("CURRENT_CONNECTIONS not between", value1, value2, "CURRENT_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSIsNull() {
            addCriterion("TOTAL_CONNECTIONS is null");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSIsNotNull() {
            addCriterion("TOTAL_CONNECTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSEqualTo(Long value) {
            addCriterion("TOTAL_CONNECTIONS =", value, "TOTAL_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSNotEqualTo(Long value) {
            addCriterion("TOTAL_CONNECTIONS <>", value, "TOTAL_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSGreaterThan(Long value) {
            addCriterion("TOTAL_CONNECTIONS >", value, "TOTAL_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSGreaterThanOrEqualTo(Long value) {
            addCriterion("TOTAL_CONNECTIONS >=", value, "TOTAL_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSLessThan(Long value) {
            addCriterion("TOTAL_CONNECTIONS <", value, "TOTAL_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSLessThanOrEqualTo(Long value) {
            addCriterion("TOTAL_CONNECTIONS <=", value, "TOTAL_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSIn(List<Long> values) {
            addCriterion("TOTAL_CONNECTIONS in", values, "TOTAL_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSNotIn(List<Long> values) {
            addCriterion("TOTAL_CONNECTIONS not in", values, "TOTAL_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSBetween(Long value1, Long value2) {
            addCriterion("TOTAL_CONNECTIONS between", value1, value2, "TOTAL_CONNECTIONS");
            return (Criteria) this;
        }

        public Criteria andTOTAL_CONNECTIONSNotBetween(Long value1, Long value2) {
            addCriterion("TOTAL_CONNECTIONS not between", value1, value2, "TOTAL_CONNECTIONS");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hosts
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hosts
     *
     * @mbg.generated
     */
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