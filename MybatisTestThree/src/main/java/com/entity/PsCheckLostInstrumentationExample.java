package com.entity;

import java.util.ArrayList;
import java.util.List;

public class PsCheckLostInstrumentationExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ps_check_lost_instrumentation
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ps_check_lost_instrumentation
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ps_check_lost_instrumentation
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ps_check_lost_instrumentation
     *
     * @mbg.generated
     */
    public PsCheckLostInstrumentationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ps_check_lost_instrumentation
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ps_check_lost_instrumentation
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ps_check_lost_instrumentation
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ps_check_lost_instrumentation
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ps_check_lost_instrumentation
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ps_check_lost_instrumentation
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ps_check_lost_instrumentation
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
     * This method corresponds to the database table ps_check_lost_instrumentation
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
     * This method corresponds to the database table ps_check_lost_instrumentation
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ps_check_lost_instrumentation
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
     * This class corresponds to the database table ps_check_lost_instrumentation
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

        public Criteria andVariable_nameIsNull() {
            addCriterion("variable_name is null");
            return (Criteria) this;
        }

        public Criteria andVariable_nameIsNotNull() {
            addCriterion("variable_name is not null");
            return (Criteria) this;
        }

        public Criteria andVariable_nameEqualTo(String value) {
            addCriterion("variable_name =", value, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameNotEqualTo(String value) {
            addCriterion("variable_name <>", value, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameGreaterThan(String value) {
            addCriterion("variable_name >", value, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameGreaterThanOrEqualTo(String value) {
            addCriterion("variable_name >=", value, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameLessThan(String value) {
            addCriterion("variable_name <", value, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameLessThanOrEqualTo(String value) {
            addCriterion("variable_name <=", value, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameLike(String value) {
            addCriterion("variable_name like", value, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameNotLike(String value) {
            addCriterion("variable_name not like", value, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameIn(List<String> values) {
            addCriterion("variable_name in", values, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameNotIn(List<String> values) {
            addCriterion("variable_name not in", values, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameBetween(String value1, String value2) {
            addCriterion("variable_name between", value1, value2, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameNotBetween(String value1, String value2) {
            addCriterion("variable_name not between", value1, value2, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_valueIsNull() {
            addCriterion("variable_value is null");
            return (Criteria) this;
        }

        public Criteria andVariable_valueIsNotNull() {
            addCriterion("variable_value is not null");
            return (Criteria) this;
        }

        public Criteria andVariable_valueEqualTo(String value) {
            addCriterion("variable_value =", value, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueNotEqualTo(String value) {
            addCriterion("variable_value <>", value, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueGreaterThan(String value) {
            addCriterion("variable_value >", value, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueGreaterThanOrEqualTo(String value) {
            addCriterion("variable_value >=", value, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueLessThan(String value) {
            addCriterion("variable_value <", value, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueLessThanOrEqualTo(String value) {
            addCriterion("variable_value <=", value, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueLike(String value) {
            addCriterion("variable_value like", value, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueNotLike(String value) {
            addCriterion("variable_value not like", value, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueIn(List<String> values) {
            addCriterion("variable_value in", values, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueNotIn(List<String> values) {
            addCriterion("variable_value not in", values, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueBetween(String value1, String value2) {
            addCriterion("variable_value between", value1, value2, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueNotBetween(String value1, String value2) {
            addCriterion("variable_value not between", value1, value2, "variable_value");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ps_check_lost_instrumentation
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
     * This class corresponds to the database table ps_check_lost_instrumentation
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