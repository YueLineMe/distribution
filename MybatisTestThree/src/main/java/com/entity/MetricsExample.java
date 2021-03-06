package com.entity;

import java.util.ArrayList;
import java.util.List;

public class MetricsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table metrics
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table metrics
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table metrics
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metrics
     *
     * @mbg.generated
     */
    public MetricsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metrics
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metrics
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metrics
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metrics
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metrics
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metrics
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metrics
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
     * This method corresponds to the database table metrics
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
     * This method corresponds to the database table metrics
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metrics
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
     * This class corresponds to the database table metrics
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
            addCriterion("Variable_name is null");
            return (Criteria) this;
        }

        public Criteria andVariable_nameIsNotNull() {
            addCriterion("Variable_name is not null");
            return (Criteria) this;
        }

        public Criteria andVariable_nameEqualTo(String value) {
            addCriterion("Variable_name =", value, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameNotEqualTo(String value) {
            addCriterion("Variable_name <>", value, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameGreaterThan(String value) {
            addCriterion("Variable_name >", value, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameGreaterThanOrEqualTo(String value) {
            addCriterion("Variable_name >=", value, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameLessThan(String value) {
            addCriterion("Variable_name <", value, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameLessThanOrEqualTo(String value) {
            addCriterion("Variable_name <=", value, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameLike(String value) {
            addCriterion("Variable_name like", value, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameNotLike(String value) {
            addCriterion("Variable_name not like", value, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameIn(List<String> values) {
            addCriterion("Variable_name in", values, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameNotIn(List<String> values) {
            addCriterion("Variable_name not in", values, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameBetween(String value1, String value2) {
            addCriterion("Variable_name between", value1, value2, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_nameNotBetween(String value1, String value2) {
            addCriterion("Variable_name not between", value1, value2, "variable_name");
            return (Criteria) this;
        }

        public Criteria andVariable_valueIsNull() {
            addCriterion("Variable_value is null");
            return (Criteria) this;
        }

        public Criteria andVariable_valueIsNotNull() {
            addCriterion("Variable_value is not null");
            return (Criteria) this;
        }

        public Criteria andVariable_valueEqualTo(String value) {
            addCriterion("Variable_value =", value, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueNotEqualTo(String value) {
            addCriterion("Variable_value <>", value, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueGreaterThan(String value) {
            addCriterion("Variable_value >", value, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueGreaterThanOrEqualTo(String value) {
            addCriterion("Variable_value >=", value, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueLessThan(String value) {
            addCriterion("Variable_value <", value, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueLessThanOrEqualTo(String value) {
            addCriterion("Variable_value <=", value, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueLike(String value) {
            addCriterion("Variable_value like", value, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueNotLike(String value) {
            addCriterion("Variable_value not like", value, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueIn(List<String> values) {
            addCriterion("Variable_value in", values, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueNotIn(List<String> values) {
            addCriterion("Variable_value not in", values, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueBetween(String value1, String value2) {
            addCriterion("Variable_value between", value1, value2, "variable_value");
            return (Criteria) this;
        }

        public Criteria andVariable_valueNotBetween(String value1, String value2) {
            addCriterion("Variable_value not between", value1, value2, "variable_value");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("Type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("Type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNull() {
            addCriterion("Enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("Enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(String value) {
            addCriterion("Enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(String value) {
            addCriterion("Enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(String value) {
            addCriterion("Enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(String value) {
            addCriterion("Enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(String value) {
            addCriterion("Enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(String value) {
            addCriterion("Enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLike(String value) {
            addCriterion("Enabled like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotLike(String value) {
            addCriterion("Enabled not like", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<String> values) {
            addCriterion("Enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<String> values) {
            addCriterion("Enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(String value1, String value2) {
            addCriterion("Enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(String value1, String value2) {
            addCriterion("Enabled not between", value1, value2, "enabled");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table metrics
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
     * This class corresponds to the database table metrics
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