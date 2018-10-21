package com.entity;

import java.util.ArrayList;
import java.util.List;

public class SchemaRedundantIndexesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table schema_redundant_indexes
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table schema_redundant_indexes
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table schema_redundant_indexes
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_redundant_indexes
     *
     * @mbg.generated
     */
    public SchemaRedundantIndexesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_redundant_indexes
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_redundant_indexes
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_redundant_indexes
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_redundant_indexes
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_redundant_indexes
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_redundant_indexes
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_redundant_indexes
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
     * This method corresponds to the database table schema_redundant_indexes
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
     * This method corresponds to the database table schema_redundant_indexes
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_redundant_indexes
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
     * This class corresponds to the database table schema_redundant_indexes
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

        public Criteria andTable_schemaIsNull() {
            addCriterion("table_schema is null");
            return (Criteria) this;
        }

        public Criteria andTable_schemaIsNotNull() {
            addCriterion("table_schema is not null");
            return (Criteria) this;
        }

        public Criteria andTable_schemaEqualTo(String value) {
            addCriterion("table_schema =", value, "table_schema");
            return (Criteria) this;
        }

        public Criteria andTable_schemaNotEqualTo(String value) {
            addCriterion("table_schema <>", value, "table_schema");
            return (Criteria) this;
        }

        public Criteria andTable_schemaGreaterThan(String value) {
            addCriterion("table_schema >", value, "table_schema");
            return (Criteria) this;
        }

        public Criteria andTable_schemaGreaterThanOrEqualTo(String value) {
            addCriterion("table_schema >=", value, "table_schema");
            return (Criteria) this;
        }

        public Criteria andTable_schemaLessThan(String value) {
            addCriterion("table_schema <", value, "table_schema");
            return (Criteria) this;
        }

        public Criteria andTable_schemaLessThanOrEqualTo(String value) {
            addCriterion("table_schema <=", value, "table_schema");
            return (Criteria) this;
        }

        public Criteria andTable_schemaLike(String value) {
            addCriterion("table_schema like", value, "table_schema");
            return (Criteria) this;
        }

        public Criteria andTable_schemaNotLike(String value) {
            addCriterion("table_schema not like", value, "table_schema");
            return (Criteria) this;
        }

        public Criteria andTable_schemaIn(List<String> values) {
            addCriterion("table_schema in", values, "table_schema");
            return (Criteria) this;
        }

        public Criteria andTable_schemaNotIn(List<String> values) {
            addCriterion("table_schema not in", values, "table_schema");
            return (Criteria) this;
        }

        public Criteria andTable_schemaBetween(String value1, String value2) {
            addCriterion("table_schema between", value1, value2, "table_schema");
            return (Criteria) this;
        }

        public Criteria andTable_schemaNotBetween(String value1, String value2) {
            addCriterion("table_schema not between", value1, value2, "table_schema");
            return (Criteria) this;
        }

        public Criteria andTable_nameIsNull() {
            addCriterion("table_name is null");
            return (Criteria) this;
        }

        public Criteria andTable_nameIsNotNull() {
            addCriterion("table_name is not null");
            return (Criteria) this;
        }

        public Criteria andTable_nameEqualTo(String value) {
            addCriterion("table_name =", value, "table_name");
            return (Criteria) this;
        }

        public Criteria andTable_nameNotEqualTo(String value) {
            addCriterion("table_name <>", value, "table_name");
            return (Criteria) this;
        }

        public Criteria andTable_nameGreaterThan(String value) {
            addCriterion("table_name >", value, "table_name");
            return (Criteria) this;
        }

        public Criteria andTable_nameGreaterThanOrEqualTo(String value) {
            addCriterion("table_name >=", value, "table_name");
            return (Criteria) this;
        }

        public Criteria andTable_nameLessThan(String value) {
            addCriterion("table_name <", value, "table_name");
            return (Criteria) this;
        }

        public Criteria andTable_nameLessThanOrEqualTo(String value) {
            addCriterion("table_name <=", value, "table_name");
            return (Criteria) this;
        }

        public Criteria andTable_nameLike(String value) {
            addCriterion("table_name like", value, "table_name");
            return (Criteria) this;
        }

        public Criteria andTable_nameNotLike(String value) {
            addCriterion("table_name not like", value, "table_name");
            return (Criteria) this;
        }

        public Criteria andTable_nameIn(List<String> values) {
            addCriterion("table_name in", values, "table_name");
            return (Criteria) this;
        }

        public Criteria andTable_nameNotIn(List<String> values) {
            addCriterion("table_name not in", values, "table_name");
            return (Criteria) this;
        }

        public Criteria andTable_nameBetween(String value1, String value2) {
            addCriterion("table_name between", value1, value2, "table_name");
            return (Criteria) this;
        }

        public Criteria andTable_nameNotBetween(String value1, String value2) {
            addCriterion("table_name not between", value1, value2, "table_name");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_nameIsNull() {
            addCriterion("redundant_index_name is null");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_nameIsNotNull() {
            addCriterion("redundant_index_name is not null");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_nameEqualTo(String value) {
            addCriterion("redundant_index_name =", value, "redundant_index_name");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_nameNotEqualTo(String value) {
            addCriterion("redundant_index_name <>", value, "redundant_index_name");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_nameGreaterThan(String value) {
            addCriterion("redundant_index_name >", value, "redundant_index_name");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_nameGreaterThanOrEqualTo(String value) {
            addCriterion("redundant_index_name >=", value, "redundant_index_name");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_nameLessThan(String value) {
            addCriterion("redundant_index_name <", value, "redundant_index_name");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_nameLessThanOrEqualTo(String value) {
            addCriterion("redundant_index_name <=", value, "redundant_index_name");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_nameLike(String value) {
            addCriterion("redundant_index_name like", value, "redundant_index_name");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_nameNotLike(String value) {
            addCriterion("redundant_index_name not like", value, "redundant_index_name");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_nameIn(List<String> values) {
            addCriterion("redundant_index_name in", values, "redundant_index_name");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_nameNotIn(List<String> values) {
            addCriterion("redundant_index_name not in", values, "redundant_index_name");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_nameBetween(String value1, String value2) {
            addCriterion("redundant_index_name between", value1, value2, "redundant_index_name");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_nameNotBetween(String value1, String value2) {
            addCriterion("redundant_index_name not between", value1, value2, "redundant_index_name");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_non_uniqueIsNull() {
            addCriterion("redundant_index_non_unique is null");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_non_uniqueIsNotNull() {
            addCriterion("redundant_index_non_unique is not null");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_non_uniqueEqualTo(Integer value) {
            addCriterion("redundant_index_non_unique =", value, "redundant_index_non_unique");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_non_uniqueNotEqualTo(Integer value) {
            addCriterion("redundant_index_non_unique <>", value, "redundant_index_non_unique");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_non_uniqueGreaterThan(Integer value) {
            addCriterion("redundant_index_non_unique >", value, "redundant_index_non_unique");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_non_uniqueGreaterThanOrEqualTo(Integer value) {
            addCriterion("redundant_index_non_unique >=", value, "redundant_index_non_unique");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_non_uniqueLessThan(Integer value) {
            addCriterion("redundant_index_non_unique <", value, "redundant_index_non_unique");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_non_uniqueLessThanOrEqualTo(Integer value) {
            addCriterion("redundant_index_non_unique <=", value, "redundant_index_non_unique");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_non_uniqueIn(List<Integer> values) {
            addCriterion("redundant_index_non_unique in", values, "redundant_index_non_unique");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_non_uniqueNotIn(List<Integer> values) {
            addCriterion("redundant_index_non_unique not in", values, "redundant_index_non_unique");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_non_uniqueBetween(Integer value1, Integer value2) {
            addCriterion("redundant_index_non_unique between", value1, value2, "redundant_index_non_unique");
            return (Criteria) this;
        }

        public Criteria andRedundant_index_non_uniqueNotBetween(Integer value1, Integer value2) {
            addCriterion("redundant_index_non_unique not between", value1, value2, "redundant_index_non_unique");
            return (Criteria) this;
        }

        public Criteria andDominant_index_nameIsNull() {
            addCriterion("dominant_index_name is null");
            return (Criteria) this;
        }

        public Criteria andDominant_index_nameIsNotNull() {
            addCriterion("dominant_index_name is not null");
            return (Criteria) this;
        }

        public Criteria andDominant_index_nameEqualTo(String value) {
            addCriterion("dominant_index_name =", value, "dominant_index_name");
            return (Criteria) this;
        }

        public Criteria andDominant_index_nameNotEqualTo(String value) {
            addCriterion("dominant_index_name <>", value, "dominant_index_name");
            return (Criteria) this;
        }

        public Criteria andDominant_index_nameGreaterThan(String value) {
            addCriterion("dominant_index_name >", value, "dominant_index_name");
            return (Criteria) this;
        }

        public Criteria andDominant_index_nameGreaterThanOrEqualTo(String value) {
            addCriterion("dominant_index_name >=", value, "dominant_index_name");
            return (Criteria) this;
        }

        public Criteria andDominant_index_nameLessThan(String value) {
            addCriterion("dominant_index_name <", value, "dominant_index_name");
            return (Criteria) this;
        }

        public Criteria andDominant_index_nameLessThanOrEqualTo(String value) {
            addCriterion("dominant_index_name <=", value, "dominant_index_name");
            return (Criteria) this;
        }

        public Criteria andDominant_index_nameLike(String value) {
            addCriterion("dominant_index_name like", value, "dominant_index_name");
            return (Criteria) this;
        }

        public Criteria andDominant_index_nameNotLike(String value) {
            addCriterion("dominant_index_name not like", value, "dominant_index_name");
            return (Criteria) this;
        }

        public Criteria andDominant_index_nameIn(List<String> values) {
            addCriterion("dominant_index_name in", values, "dominant_index_name");
            return (Criteria) this;
        }

        public Criteria andDominant_index_nameNotIn(List<String> values) {
            addCriterion("dominant_index_name not in", values, "dominant_index_name");
            return (Criteria) this;
        }

        public Criteria andDominant_index_nameBetween(String value1, String value2) {
            addCriterion("dominant_index_name between", value1, value2, "dominant_index_name");
            return (Criteria) this;
        }

        public Criteria andDominant_index_nameNotBetween(String value1, String value2) {
            addCriterion("dominant_index_name not between", value1, value2, "dominant_index_name");
            return (Criteria) this;
        }

        public Criteria andDominant_index_non_uniqueIsNull() {
            addCriterion("dominant_index_non_unique is null");
            return (Criteria) this;
        }

        public Criteria andDominant_index_non_uniqueIsNotNull() {
            addCriterion("dominant_index_non_unique is not null");
            return (Criteria) this;
        }

        public Criteria andDominant_index_non_uniqueEqualTo(Integer value) {
            addCriterion("dominant_index_non_unique =", value, "dominant_index_non_unique");
            return (Criteria) this;
        }

        public Criteria andDominant_index_non_uniqueNotEqualTo(Integer value) {
            addCriterion("dominant_index_non_unique <>", value, "dominant_index_non_unique");
            return (Criteria) this;
        }

        public Criteria andDominant_index_non_uniqueGreaterThan(Integer value) {
            addCriterion("dominant_index_non_unique >", value, "dominant_index_non_unique");
            return (Criteria) this;
        }

        public Criteria andDominant_index_non_uniqueGreaterThanOrEqualTo(Integer value) {
            addCriterion("dominant_index_non_unique >=", value, "dominant_index_non_unique");
            return (Criteria) this;
        }

        public Criteria andDominant_index_non_uniqueLessThan(Integer value) {
            addCriterion("dominant_index_non_unique <", value, "dominant_index_non_unique");
            return (Criteria) this;
        }

        public Criteria andDominant_index_non_uniqueLessThanOrEqualTo(Integer value) {
            addCriterion("dominant_index_non_unique <=", value, "dominant_index_non_unique");
            return (Criteria) this;
        }

        public Criteria andDominant_index_non_uniqueIn(List<Integer> values) {
            addCriterion("dominant_index_non_unique in", values, "dominant_index_non_unique");
            return (Criteria) this;
        }

        public Criteria andDominant_index_non_uniqueNotIn(List<Integer> values) {
            addCriterion("dominant_index_non_unique not in", values, "dominant_index_non_unique");
            return (Criteria) this;
        }

        public Criteria andDominant_index_non_uniqueBetween(Integer value1, Integer value2) {
            addCriterion("dominant_index_non_unique between", value1, value2, "dominant_index_non_unique");
            return (Criteria) this;
        }

        public Criteria andDominant_index_non_uniqueNotBetween(Integer value1, Integer value2) {
            addCriterion("dominant_index_non_unique not between", value1, value2, "dominant_index_non_unique");
            return (Criteria) this;
        }

        public Criteria andSubpart_existsIsNull() {
            addCriterion("subpart_exists is null");
            return (Criteria) this;
        }

        public Criteria andSubpart_existsIsNotNull() {
            addCriterion("subpart_exists is not null");
            return (Criteria) this;
        }

        public Criteria andSubpart_existsEqualTo(Integer value) {
            addCriterion("subpart_exists =", value, "subpart_exists");
            return (Criteria) this;
        }

        public Criteria andSubpart_existsNotEqualTo(Integer value) {
            addCriterion("subpart_exists <>", value, "subpart_exists");
            return (Criteria) this;
        }

        public Criteria andSubpart_existsGreaterThan(Integer value) {
            addCriterion("subpart_exists >", value, "subpart_exists");
            return (Criteria) this;
        }

        public Criteria andSubpart_existsGreaterThanOrEqualTo(Integer value) {
            addCriterion("subpart_exists >=", value, "subpart_exists");
            return (Criteria) this;
        }

        public Criteria andSubpart_existsLessThan(Integer value) {
            addCriterion("subpart_exists <", value, "subpart_exists");
            return (Criteria) this;
        }

        public Criteria andSubpart_existsLessThanOrEqualTo(Integer value) {
            addCriterion("subpart_exists <=", value, "subpart_exists");
            return (Criteria) this;
        }

        public Criteria andSubpart_existsIn(List<Integer> values) {
            addCriterion("subpart_exists in", values, "subpart_exists");
            return (Criteria) this;
        }

        public Criteria andSubpart_existsNotIn(List<Integer> values) {
            addCriterion("subpart_exists not in", values, "subpart_exists");
            return (Criteria) this;
        }

        public Criteria andSubpart_existsBetween(Integer value1, Integer value2) {
            addCriterion("subpart_exists between", value1, value2, "subpart_exists");
            return (Criteria) this;
        }

        public Criteria andSubpart_existsNotBetween(Integer value1, Integer value2) {
            addCriterion("subpart_exists not between", value1, value2, "subpart_exists");
            return (Criteria) this;
        }

        public Criteria andSql_drop_indexIsNull() {
            addCriterion("sql_drop_index is null");
            return (Criteria) this;
        }

        public Criteria andSql_drop_indexIsNotNull() {
            addCriterion("sql_drop_index is not null");
            return (Criteria) this;
        }

        public Criteria andSql_drop_indexEqualTo(String value) {
            addCriterion("sql_drop_index =", value, "sql_drop_index");
            return (Criteria) this;
        }

        public Criteria andSql_drop_indexNotEqualTo(String value) {
            addCriterion("sql_drop_index <>", value, "sql_drop_index");
            return (Criteria) this;
        }

        public Criteria andSql_drop_indexGreaterThan(String value) {
            addCriterion("sql_drop_index >", value, "sql_drop_index");
            return (Criteria) this;
        }

        public Criteria andSql_drop_indexGreaterThanOrEqualTo(String value) {
            addCriterion("sql_drop_index >=", value, "sql_drop_index");
            return (Criteria) this;
        }

        public Criteria andSql_drop_indexLessThan(String value) {
            addCriterion("sql_drop_index <", value, "sql_drop_index");
            return (Criteria) this;
        }

        public Criteria andSql_drop_indexLessThanOrEqualTo(String value) {
            addCriterion("sql_drop_index <=", value, "sql_drop_index");
            return (Criteria) this;
        }

        public Criteria andSql_drop_indexLike(String value) {
            addCriterion("sql_drop_index like", value, "sql_drop_index");
            return (Criteria) this;
        }

        public Criteria andSql_drop_indexNotLike(String value) {
            addCriterion("sql_drop_index not like", value, "sql_drop_index");
            return (Criteria) this;
        }

        public Criteria andSql_drop_indexIn(List<String> values) {
            addCriterion("sql_drop_index in", values, "sql_drop_index");
            return (Criteria) this;
        }

        public Criteria andSql_drop_indexNotIn(List<String> values) {
            addCriterion("sql_drop_index not in", values, "sql_drop_index");
            return (Criteria) this;
        }

        public Criteria andSql_drop_indexBetween(String value1, String value2) {
            addCriterion("sql_drop_index between", value1, value2, "sql_drop_index");
            return (Criteria) this;
        }

        public Criteria andSql_drop_indexNotBetween(String value1, String value2) {
            addCriterion("sql_drop_index not between", value1, value2, "sql_drop_index");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table schema_redundant_indexes
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
     * This class corresponds to the database table schema_redundant_indexes
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