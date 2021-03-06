package com.entity;

import java.util.ArrayList;
import java.util.List;

public class SchemaUnusedIndexesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table schema_unused_indexes
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table schema_unused_indexes
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table schema_unused_indexes
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_unused_indexes
     *
     * @mbg.generated
     */
    public SchemaUnusedIndexesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_unused_indexes
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_unused_indexes
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_unused_indexes
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_unused_indexes
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_unused_indexes
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_unused_indexes
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_unused_indexes
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
     * This method corresponds to the database table schema_unused_indexes
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
     * This method corresponds to the database table schema_unused_indexes
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_unused_indexes
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
     * This class corresponds to the database table schema_unused_indexes
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

        public Criteria andObject_schemaIsNull() {
            addCriterion("object_schema is null");
            return (Criteria) this;
        }

        public Criteria andObject_schemaIsNotNull() {
            addCriterion("object_schema is not null");
            return (Criteria) this;
        }

        public Criteria andObject_schemaEqualTo(String value) {
            addCriterion("object_schema =", value, "object_schema");
            return (Criteria) this;
        }

        public Criteria andObject_schemaNotEqualTo(String value) {
            addCriterion("object_schema <>", value, "object_schema");
            return (Criteria) this;
        }

        public Criteria andObject_schemaGreaterThan(String value) {
            addCriterion("object_schema >", value, "object_schema");
            return (Criteria) this;
        }

        public Criteria andObject_schemaGreaterThanOrEqualTo(String value) {
            addCriterion("object_schema >=", value, "object_schema");
            return (Criteria) this;
        }

        public Criteria andObject_schemaLessThan(String value) {
            addCriterion("object_schema <", value, "object_schema");
            return (Criteria) this;
        }

        public Criteria andObject_schemaLessThanOrEqualTo(String value) {
            addCriterion("object_schema <=", value, "object_schema");
            return (Criteria) this;
        }

        public Criteria andObject_schemaLike(String value) {
            addCriterion("object_schema like", value, "object_schema");
            return (Criteria) this;
        }

        public Criteria andObject_schemaNotLike(String value) {
            addCriterion("object_schema not like", value, "object_schema");
            return (Criteria) this;
        }

        public Criteria andObject_schemaIn(List<String> values) {
            addCriterion("object_schema in", values, "object_schema");
            return (Criteria) this;
        }

        public Criteria andObject_schemaNotIn(List<String> values) {
            addCriterion("object_schema not in", values, "object_schema");
            return (Criteria) this;
        }

        public Criteria andObject_schemaBetween(String value1, String value2) {
            addCriterion("object_schema between", value1, value2, "object_schema");
            return (Criteria) this;
        }

        public Criteria andObject_schemaNotBetween(String value1, String value2) {
            addCriterion("object_schema not between", value1, value2, "object_schema");
            return (Criteria) this;
        }

        public Criteria andObject_nameIsNull() {
            addCriterion("object_name is null");
            return (Criteria) this;
        }

        public Criteria andObject_nameIsNotNull() {
            addCriterion("object_name is not null");
            return (Criteria) this;
        }

        public Criteria andObject_nameEqualTo(String value) {
            addCriterion("object_name =", value, "object_name");
            return (Criteria) this;
        }

        public Criteria andObject_nameNotEqualTo(String value) {
            addCriterion("object_name <>", value, "object_name");
            return (Criteria) this;
        }

        public Criteria andObject_nameGreaterThan(String value) {
            addCriterion("object_name >", value, "object_name");
            return (Criteria) this;
        }

        public Criteria andObject_nameGreaterThanOrEqualTo(String value) {
            addCriterion("object_name >=", value, "object_name");
            return (Criteria) this;
        }

        public Criteria andObject_nameLessThan(String value) {
            addCriterion("object_name <", value, "object_name");
            return (Criteria) this;
        }

        public Criteria andObject_nameLessThanOrEqualTo(String value) {
            addCriterion("object_name <=", value, "object_name");
            return (Criteria) this;
        }

        public Criteria andObject_nameLike(String value) {
            addCriterion("object_name like", value, "object_name");
            return (Criteria) this;
        }

        public Criteria andObject_nameNotLike(String value) {
            addCriterion("object_name not like", value, "object_name");
            return (Criteria) this;
        }

        public Criteria andObject_nameIn(List<String> values) {
            addCriterion("object_name in", values, "object_name");
            return (Criteria) this;
        }

        public Criteria andObject_nameNotIn(List<String> values) {
            addCriterion("object_name not in", values, "object_name");
            return (Criteria) this;
        }

        public Criteria andObject_nameBetween(String value1, String value2) {
            addCriterion("object_name between", value1, value2, "object_name");
            return (Criteria) this;
        }

        public Criteria andObject_nameNotBetween(String value1, String value2) {
            addCriterion("object_name not between", value1, value2, "object_name");
            return (Criteria) this;
        }

        public Criteria andIndex_nameIsNull() {
            addCriterion("index_name is null");
            return (Criteria) this;
        }

        public Criteria andIndex_nameIsNotNull() {
            addCriterion("index_name is not null");
            return (Criteria) this;
        }

        public Criteria andIndex_nameEqualTo(String value) {
            addCriterion("index_name =", value, "index_name");
            return (Criteria) this;
        }

        public Criteria andIndex_nameNotEqualTo(String value) {
            addCriterion("index_name <>", value, "index_name");
            return (Criteria) this;
        }

        public Criteria andIndex_nameGreaterThan(String value) {
            addCriterion("index_name >", value, "index_name");
            return (Criteria) this;
        }

        public Criteria andIndex_nameGreaterThanOrEqualTo(String value) {
            addCriterion("index_name >=", value, "index_name");
            return (Criteria) this;
        }

        public Criteria andIndex_nameLessThan(String value) {
            addCriterion("index_name <", value, "index_name");
            return (Criteria) this;
        }

        public Criteria andIndex_nameLessThanOrEqualTo(String value) {
            addCriterion("index_name <=", value, "index_name");
            return (Criteria) this;
        }

        public Criteria andIndex_nameLike(String value) {
            addCriterion("index_name like", value, "index_name");
            return (Criteria) this;
        }

        public Criteria andIndex_nameNotLike(String value) {
            addCriterion("index_name not like", value, "index_name");
            return (Criteria) this;
        }

        public Criteria andIndex_nameIn(List<String> values) {
            addCriterion("index_name in", values, "index_name");
            return (Criteria) this;
        }

        public Criteria andIndex_nameNotIn(List<String> values) {
            addCriterion("index_name not in", values, "index_name");
            return (Criteria) this;
        }

        public Criteria andIndex_nameBetween(String value1, String value2) {
            addCriterion("index_name between", value1, value2, "index_name");
            return (Criteria) this;
        }

        public Criteria andIndex_nameNotBetween(String value1, String value2) {
            addCriterion("index_name not between", value1, value2, "index_name");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table schema_unused_indexes
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
     * This class corresponds to the database table schema_unused_indexes
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