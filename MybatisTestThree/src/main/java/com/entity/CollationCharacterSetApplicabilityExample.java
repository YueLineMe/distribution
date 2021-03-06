package com.entity;

import java.util.ArrayList;
import java.util.List;

public class CollationCharacterSetApplicabilityExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table COLLATION_CHARACTER_SET_APPLICABILITY
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table COLLATION_CHARACTER_SET_APPLICABILITY
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table COLLATION_CHARACTER_SET_APPLICABILITY
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLLATION_CHARACTER_SET_APPLICABILITY
     *
     * @mbg.generated
     */
    public CollationCharacterSetApplicabilityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLLATION_CHARACTER_SET_APPLICABILITY
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLLATION_CHARACTER_SET_APPLICABILITY
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLLATION_CHARACTER_SET_APPLICABILITY
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLLATION_CHARACTER_SET_APPLICABILITY
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLLATION_CHARACTER_SET_APPLICABILITY
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLLATION_CHARACTER_SET_APPLICABILITY
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLLATION_CHARACTER_SET_APPLICABILITY
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
     * This method corresponds to the database table COLLATION_CHARACTER_SET_APPLICABILITY
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
     * This method corresponds to the database table COLLATION_CHARACTER_SET_APPLICABILITY
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLLATION_CHARACTER_SET_APPLICABILITY
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
     * This class corresponds to the database table COLLATION_CHARACTER_SET_APPLICABILITY
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

        public Criteria andCOLLATION_NAMEIsNull() {
            addCriterion("COLLATION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCOLLATION_NAMEIsNotNull() {
            addCriterion("COLLATION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCOLLATION_NAMEEqualTo(String value) {
            addCriterion("COLLATION_NAME =", value, "COLLATION_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLLATION_NAMENotEqualTo(String value) {
            addCriterion("COLLATION_NAME <>", value, "COLLATION_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLLATION_NAMEGreaterThan(String value) {
            addCriterion("COLLATION_NAME >", value, "COLLATION_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLLATION_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("COLLATION_NAME >=", value, "COLLATION_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLLATION_NAMELessThan(String value) {
            addCriterion("COLLATION_NAME <", value, "COLLATION_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLLATION_NAMELessThanOrEqualTo(String value) {
            addCriterion("COLLATION_NAME <=", value, "COLLATION_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLLATION_NAMELike(String value) {
            addCriterion("COLLATION_NAME like", value, "COLLATION_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLLATION_NAMENotLike(String value) {
            addCriterion("COLLATION_NAME not like", value, "COLLATION_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLLATION_NAMEIn(List<String> values) {
            addCriterion("COLLATION_NAME in", values, "COLLATION_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLLATION_NAMENotIn(List<String> values) {
            addCriterion("COLLATION_NAME not in", values, "COLLATION_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLLATION_NAMEBetween(String value1, String value2) {
            addCriterion("COLLATION_NAME between", value1, value2, "COLLATION_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLLATION_NAMENotBetween(String value1, String value2) {
            addCriterion("COLLATION_NAME not between", value1, value2, "COLLATION_NAME");
            return (Criteria) this;
        }

        public Criteria andCHARACTER_SET_NAMEIsNull() {
            addCriterion("CHARACTER_SET_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCHARACTER_SET_NAMEIsNotNull() {
            addCriterion("CHARACTER_SET_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCHARACTER_SET_NAMEEqualTo(String value) {
            addCriterion("CHARACTER_SET_NAME =", value, "CHARACTER_SET_NAME");
            return (Criteria) this;
        }

        public Criteria andCHARACTER_SET_NAMENotEqualTo(String value) {
            addCriterion("CHARACTER_SET_NAME <>", value, "CHARACTER_SET_NAME");
            return (Criteria) this;
        }

        public Criteria andCHARACTER_SET_NAMEGreaterThan(String value) {
            addCriterion("CHARACTER_SET_NAME >", value, "CHARACTER_SET_NAME");
            return (Criteria) this;
        }

        public Criteria andCHARACTER_SET_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("CHARACTER_SET_NAME >=", value, "CHARACTER_SET_NAME");
            return (Criteria) this;
        }

        public Criteria andCHARACTER_SET_NAMELessThan(String value) {
            addCriterion("CHARACTER_SET_NAME <", value, "CHARACTER_SET_NAME");
            return (Criteria) this;
        }

        public Criteria andCHARACTER_SET_NAMELessThanOrEqualTo(String value) {
            addCriterion("CHARACTER_SET_NAME <=", value, "CHARACTER_SET_NAME");
            return (Criteria) this;
        }

        public Criteria andCHARACTER_SET_NAMELike(String value) {
            addCriterion("CHARACTER_SET_NAME like", value, "CHARACTER_SET_NAME");
            return (Criteria) this;
        }

        public Criteria andCHARACTER_SET_NAMENotLike(String value) {
            addCriterion("CHARACTER_SET_NAME not like", value, "CHARACTER_SET_NAME");
            return (Criteria) this;
        }

        public Criteria andCHARACTER_SET_NAMEIn(List<String> values) {
            addCriterion("CHARACTER_SET_NAME in", values, "CHARACTER_SET_NAME");
            return (Criteria) this;
        }

        public Criteria andCHARACTER_SET_NAMENotIn(List<String> values) {
            addCriterion("CHARACTER_SET_NAME not in", values, "CHARACTER_SET_NAME");
            return (Criteria) this;
        }

        public Criteria andCHARACTER_SET_NAMEBetween(String value1, String value2) {
            addCriterion("CHARACTER_SET_NAME between", value1, value2, "CHARACTER_SET_NAME");
            return (Criteria) this;
        }

        public Criteria andCHARACTER_SET_NAMENotBetween(String value1, String value2) {
            addCriterion("CHARACTER_SET_NAME not between", value1, value2, "CHARACTER_SET_NAME");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table COLLATION_CHARACTER_SET_APPLICABILITY
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
     * This class corresponds to the database table COLLATION_CHARACTER_SET_APPLICABILITY
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