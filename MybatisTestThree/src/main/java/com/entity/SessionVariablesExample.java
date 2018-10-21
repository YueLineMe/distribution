package com.entity;

import java.util.ArrayList;
import java.util.List;

public class SessionVariablesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table session_variables
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table session_variables
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table session_variables
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_variables
     *
     * @mbg.generated
     */
    public SessionVariablesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_variables
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_variables
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_variables
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_variables
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_variables
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_variables
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_variables
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
     * This method corresponds to the database table session_variables
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
     * This method corresponds to the database table session_variables
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_variables
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
     * This class corresponds to the database table session_variables
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

        public Criteria andVARIABLE_NAMEIsNull() {
            addCriterion("VARIABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_NAMEIsNotNull() {
            addCriterion("VARIABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_NAMEEqualTo(String value) {
            addCriterion("VARIABLE_NAME =", value, "VARIABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_NAMENotEqualTo(String value) {
            addCriterion("VARIABLE_NAME <>", value, "VARIABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_NAMEGreaterThan(String value) {
            addCriterion("VARIABLE_NAME >", value, "VARIABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("VARIABLE_NAME >=", value, "VARIABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_NAMELessThan(String value) {
            addCriterion("VARIABLE_NAME <", value, "VARIABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_NAMELessThanOrEqualTo(String value) {
            addCriterion("VARIABLE_NAME <=", value, "VARIABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_NAMELike(String value) {
            addCriterion("VARIABLE_NAME like", value, "VARIABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_NAMENotLike(String value) {
            addCriterion("VARIABLE_NAME not like", value, "VARIABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_NAMEIn(List<String> values) {
            addCriterion("VARIABLE_NAME in", values, "VARIABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_NAMENotIn(List<String> values) {
            addCriterion("VARIABLE_NAME not in", values, "VARIABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_NAMEBetween(String value1, String value2) {
            addCriterion("VARIABLE_NAME between", value1, value2, "VARIABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_NAMENotBetween(String value1, String value2) {
            addCriterion("VARIABLE_NAME not between", value1, value2, "VARIABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_VALUEIsNull() {
            addCriterion("VARIABLE_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_VALUEIsNotNull() {
            addCriterion("VARIABLE_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_VALUEEqualTo(String value) {
            addCriterion("VARIABLE_VALUE =", value, "VARIABLE_VALUE");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_VALUENotEqualTo(String value) {
            addCriterion("VARIABLE_VALUE <>", value, "VARIABLE_VALUE");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_VALUEGreaterThan(String value) {
            addCriterion("VARIABLE_VALUE >", value, "VARIABLE_VALUE");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_VALUEGreaterThanOrEqualTo(String value) {
            addCriterion("VARIABLE_VALUE >=", value, "VARIABLE_VALUE");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_VALUELessThan(String value) {
            addCriterion("VARIABLE_VALUE <", value, "VARIABLE_VALUE");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_VALUELessThanOrEqualTo(String value) {
            addCriterion("VARIABLE_VALUE <=", value, "VARIABLE_VALUE");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_VALUELike(String value) {
            addCriterion("VARIABLE_VALUE like", value, "VARIABLE_VALUE");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_VALUENotLike(String value) {
            addCriterion("VARIABLE_VALUE not like", value, "VARIABLE_VALUE");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_VALUEIn(List<String> values) {
            addCriterion("VARIABLE_VALUE in", values, "VARIABLE_VALUE");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_VALUENotIn(List<String> values) {
            addCriterion("VARIABLE_VALUE not in", values, "VARIABLE_VALUE");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_VALUEBetween(String value1, String value2) {
            addCriterion("VARIABLE_VALUE between", value1, value2, "VARIABLE_VALUE");
            return (Criteria) this;
        }

        public Criteria andVARIABLE_VALUENotBetween(String value1, String value2) {
            addCriterion("VARIABLE_VALUE not between", value1, value2, "VARIABLE_VALUE");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table session_variables
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
     * This class corresponds to the database table session_variables
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