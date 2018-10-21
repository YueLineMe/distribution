package com.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class XPsSchemaTableStatisticsIoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table x$ps_schema_table_statistics_io
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table x$ps_schema_table_statistics_io
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table x$ps_schema_table_statistics_io
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$ps_schema_table_statistics_io
     *
     * @mbg.generated
     */
    public XPsSchemaTableStatisticsIoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$ps_schema_table_statistics_io
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$ps_schema_table_statistics_io
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$ps_schema_table_statistics_io
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$ps_schema_table_statistics_io
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$ps_schema_table_statistics_io
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$ps_schema_table_statistics_io
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$ps_schema_table_statistics_io
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
     * This method corresponds to the database table x$ps_schema_table_statistics_io
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
     * This method corresponds to the database table x$ps_schema_table_statistics_io
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$ps_schema_table_statistics_io
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
     * This class corresponds to the database table x$ps_schema_table_statistics_io
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

        public Criteria andCount_readIsNull() {
            addCriterion("count_read is null");
            return (Criteria) this;
        }

        public Criteria andCount_readIsNotNull() {
            addCriterion("count_read is not null");
            return (Criteria) this;
        }

        public Criteria andCount_readEqualTo(BigDecimal value) {
            addCriterion("count_read =", value, "count_read");
            return (Criteria) this;
        }

        public Criteria andCount_readNotEqualTo(BigDecimal value) {
            addCriterion("count_read <>", value, "count_read");
            return (Criteria) this;
        }

        public Criteria andCount_readGreaterThan(BigDecimal value) {
            addCriterion("count_read >", value, "count_read");
            return (Criteria) this;
        }

        public Criteria andCount_readGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_read >=", value, "count_read");
            return (Criteria) this;
        }

        public Criteria andCount_readLessThan(BigDecimal value) {
            addCriterion("count_read <", value, "count_read");
            return (Criteria) this;
        }

        public Criteria andCount_readLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_read <=", value, "count_read");
            return (Criteria) this;
        }

        public Criteria andCount_readIn(List<BigDecimal> values) {
            addCriterion("count_read in", values, "count_read");
            return (Criteria) this;
        }

        public Criteria andCount_readNotIn(List<BigDecimal> values) {
            addCriterion("count_read not in", values, "count_read");
            return (Criteria) this;
        }

        public Criteria andCount_readBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_read between", value1, value2, "count_read");
            return (Criteria) this;
        }

        public Criteria andCount_readNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_read not between", value1, value2, "count_read");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_readIsNull() {
            addCriterion("sum_number_of_bytes_read is null");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_readIsNotNull() {
            addCriterion("sum_number_of_bytes_read is not null");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_readEqualTo(BigDecimal value) {
            addCriterion("sum_number_of_bytes_read =", value, "sum_number_of_bytes_read");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_readNotEqualTo(BigDecimal value) {
            addCriterion("sum_number_of_bytes_read <>", value, "sum_number_of_bytes_read");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_readGreaterThan(BigDecimal value) {
            addCriterion("sum_number_of_bytes_read >", value, "sum_number_of_bytes_read");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_readGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_number_of_bytes_read >=", value, "sum_number_of_bytes_read");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_readLessThan(BigDecimal value) {
            addCriterion("sum_number_of_bytes_read <", value, "sum_number_of_bytes_read");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_readLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_number_of_bytes_read <=", value, "sum_number_of_bytes_read");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_readIn(List<BigDecimal> values) {
            addCriterion("sum_number_of_bytes_read in", values, "sum_number_of_bytes_read");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_readNotIn(List<BigDecimal> values) {
            addCriterion("sum_number_of_bytes_read not in", values, "sum_number_of_bytes_read");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_readBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_number_of_bytes_read between", value1, value2, "sum_number_of_bytes_read");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_readNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_number_of_bytes_read not between", value1, value2, "sum_number_of_bytes_read");
            return (Criteria) this;
        }

        public Criteria andSum_timer_readIsNull() {
            addCriterion("sum_timer_read is null");
            return (Criteria) this;
        }

        public Criteria andSum_timer_readIsNotNull() {
            addCriterion("sum_timer_read is not null");
            return (Criteria) this;
        }

        public Criteria andSum_timer_readEqualTo(BigDecimal value) {
            addCriterion("sum_timer_read =", value, "sum_timer_read");
            return (Criteria) this;
        }

        public Criteria andSum_timer_readNotEqualTo(BigDecimal value) {
            addCriterion("sum_timer_read <>", value, "sum_timer_read");
            return (Criteria) this;
        }

        public Criteria andSum_timer_readGreaterThan(BigDecimal value) {
            addCriterion("sum_timer_read >", value, "sum_timer_read");
            return (Criteria) this;
        }

        public Criteria andSum_timer_readGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_timer_read >=", value, "sum_timer_read");
            return (Criteria) this;
        }

        public Criteria andSum_timer_readLessThan(BigDecimal value) {
            addCriterion("sum_timer_read <", value, "sum_timer_read");
            return (Criteria) this;
        }

        public Criteria andSum_timer_readLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_timer_read <=", value, "sum_timer_read");
            return (Criteria) this;
        }

        public Criteria andSum_timer_readIn(List<BigDecimal> values) {
            addCriterion("sum_timer_read in", values, "sum_timer_read");
            return (Criteria) this;
        }

        public Criteria andSum_timer_readNotIn(List<BigDecimal> values) {
            addCriterion("sum_timer_read not in", values, "sum_timer_read");
            return (Criteria) this;
        }

        public Criteria andSum_timer_readBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_timer_read between", value1, value2, "sum_timer_read");
            return (Criteria) this;
        }

        public Criteria andSum_timer_readNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_timer_read not between", value1, value2, "sum_timer_read");
            return (Criteria) this;
        }

        public Criteria andCount_writeIsNull() {
            addCriterion("count_write is null");
            return (Criteria) this;
        }

        public Criteria andCount_writeIsNotNull() {
            addCriterion("count_write is not null");
            return (Criteria) this;
        }

        public Criteria andCount_writeEqualTo(BigDecimal value) {
            addCriterion("count_write =", value, "count_write");
            return (Criteria) this;
        }

        public Criteria andCount_writeNotEqualTo(BigDecimal value) {
            addCriterion("count_write <>", value, "count_write");
            return (Criteria) this;
        }

        public Criteria andCount_writeGreaterThan(BigDecimal value) {
            addCriterion("count_write >", value, "count_write");
            return (Criteria) this;
        }

        public Criteria andCount_writeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_write >=", value, "count_write");
            return (Criteria) this;
        }

        public Criteria andCount_writeLessThan(BigDecimal value) {
            addCriterion("count_write <", value, "count_write");
            return (Criteria) this;
        }

        public Criteria andCount_writeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_write <=", value, "count_write");
            return (Criteria) this;
        }

        public Criteria andCount_writeIn(List<BigDecimal> values) {
            addCriterion("count_write in", values, "count_write");
            return (Criteria) this;
        }

        public Criteria andCount_writeNotIn(List<BigDecimal> values) {
            addCriterion("count_write not in", values, "count_write");
            return (Criteria) this;
        }

        public Criteria andCount_writeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_write between", value1, value2, "count_write");
            return (Criteria) this;
        }

        public Criteria andCount_writeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_write not between", value1, value2, "count_write");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_writeIsNull() {
            addCriterion("sum_number_of_bytes_write is null");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_writeIsNotNull() {
            addCriterion("sum_number_of_bytes_write is not null");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_writeEqualTo(BigDecimal value) {
            addCriterion("sum_number_of_bytes_write =", value, "sum_number_of_bytes_write");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_writeNotEqualTo(BigDecimal value) {
            addCriterion("sum_number_of_bytes_write <>", value, "sum_number_of_bytes_write");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_writeGreaterThan(BigDecimal value) {
            addCriterion("sum_number_of_bytes_write >", value, "sum_number_of_bytes_write");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_writeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_number_of_bytes_write >=", value, "sum_number_of_bytes_write");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_writeLessThan(BigDecimal value) {
            addCriterion("sum_number_of_bytes_write <", value, "sum_number_of_bytes_write");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_writeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_number_of_bytes_write <=", value, "sum_number_of_bytes_write");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_writeIn(List<BigDecimal> values) {
            addCriterion("sum_number_of_bytes_write in", values, "sum_number_of_bytes_write");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_writeNotIn(List<BigDecimal> values) {
            addCriterion("sum_number_of_bytes_write not in", values, "sum_number_of_bytes_write");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_writeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_number_of_bytes_write between", value1, value2, "sum_number_of_bytes_write");
            return (Criteria) this;
        }

        public Criteria andSum_number_of_bytes_writeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_number_of_bytes_write not between", value1, value2, "sum_number_of_bytes_write");
            return (Criteria) this;
        }

        public Criteria andSum_timer_writeIsNull() {
            addCriterion("sum_timer_write is null");
            return (Criteria) this;
        }

        public Criteria andSum_timer_writeIsNotNull() {
            addCriterion("sum_timer_write is not null");
            return (Criteria) this;
        }

        public Criteria andSum_timer_writeEqualTo(BigDecimal value) {
            addCriterion("sum_timer_write =", value, "sum_timer_write");
            return (Criteria) this;
        }

        public Criteria andSum_timer_writeNotEqualTo(BigDecimal value) {
            addCriterion("sum_timer_write <>", value, "sum_timer_write");
            return (Criteria) this;
        }

        public Criteria andSum_timer_writeGreaterThan(BigDecimal value) {
            addCriterion("sum_timer_write >", value, "sum_timer_write");
            return (Criteria) this;
        }

        public Criteria andSum_timer_writeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_timer_write >=", value, "sum_timer_write");
            return (Criteria) this;
        }

        public Criteria andSum_timer_writeLessThan(BigDecimal value) {
            addCriterion("sum_timer_write <", value, "sum_timer_write");
            return (Criteria) this;
        }

        public Criteria andSum_timer_writeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_timer_write <=", value, "sum_timer_write");
            return (Criteria) this;
        }

        public Criteria andSum_timer_writeIn(List<BigDecimal> values) {
            addCriterion("sum_timer_write in", values, "sum_timer_write");
            return (Criteria) this;
        }

        public Criteria andSum_timer_writeNotIn(List<BigDecimal> values) {
            addCriterion("sum_timer_write not in", values, "sum_timer_write");
            return (Criteria) this;
        }

        public Criteria andSum_timer_writeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_timer_write between", value1, value2, "sum_timer_write");
            return (Criteria) this;
        }

        public Criteria andSum_timer_writeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_timer_write not between", value1, value2, "sum_timer_write");
            return (Criteria) this;
        }

        public Criteria andCount_miscIsNull() {
            addCriterion("count_misc is null");
            return (Criteria) this;
        }

        public Criteria andCount_miscIsNotNull() {
            addCriterion("count_misc is not null");
            return (Criteria) this;
        }

        public Criteria andCount_miscEqualTo(BigDecimal value) {
            addCriterion("count_misc =", value, "count_misc");
            return (Criteria) this;
        }

        public Criteria andCount_miscNotEqualTo(BigDecimal value) {
            addCriterion("count_misc <>", value, "count_misc");
            return (Criteria) this;
        }

        public Criteria andCount_miscGreaterThan(BigDecimal value) {
            addCriterion("count_misc >", value, "count_misc");
            return (Criteria) this;
        }

        public Criteria andCount_miscGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("count_misc >=", value, "count_misc");
            return (Criteria) this;
        }

        public Criteria andCount_miscLessThan(BigDecimal value) {
            addCriterion("count_misc <", value, "count_misc");
            return (Criteria) this;
        }

        public Criteria andCount_miscLessThanOrEqualTo(BigDecimal value) {
            addCriterion("count_misc <=", value, "count_misc");
            return (Criteria) this;
        }

        public Criteria andCount_miscIn(List<BigDecimal> values) {
            addCriterion("count_misc in", values, "count_misc");
            return (Criteria) this;
        }

        public Criteria andCount_miscNotIn(List<BigDecimal> values) {
            addCriterion("count_misc not in", values, "count_misc");
            return (Criteria) this;
        }

        public Criteria andCount_miscBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_misc between", value1, value2, "count_misc");
            return (Criteria) this;
        }

        public Criteria andCount_miscNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("count_misc not between", value1, value2, "count_misc");
            return (Criteria) this;
        }

        public Criteria andSum_timer_miscIsNull() {
            addCriterion("sum_timer_misc is null");
            return (Criteria) this;
        }

        public Criteria andSum_timer_miscIsNotNull() {
            addCriterion("sum_timer_misc is not null");
            return (Criteria) this;
        }

        public Criteria andSum_timer_miscEqualTo(BigDecimal value) {
            addCriterion("sum_timer_misc =", value, "sum_timer_misc");
            return (Criteria) this;
        }

        public Criteria andSum_timer_miscNotEqualTo(BigDecimal value) {
            addCriterion("sum_timer_misc <>", value, "sum_timer_misc");
            return (Criteria) this;
        }

        public Criteria andSum_timer_miscGreaterThan(BigDecimal value) {
            addCriterion("sum_timer_misc >", value, "sum_timer_misc");
            return (Criteria) this;
        }

        public Criteria andSum_timer_miscGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_timer_misc >=", value, "sum_timer_misc");
            return (Criteria) this;
        }

        public Criteria andSum_timer_miscLessThan(BigDecimal value) {
            addCriterion("sum_timer_misc <", value, "sum_timer_misc");
            return (Criteria) this;
        }

        public Criteria andSum_timer_miscLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sum_timer_misc <=", value, "sum_timer_misc");
            return (Criteria) this;
        }

        public Criteria andSum_timer_miscIn(List<BigDecimal> values) {
            addCriterion("sum_timer_misc in", values, "sum_timer_misc");
            return (Criteria) this;
        }

        public Criteria andSum_timer_miscNotIn(List<BigDecimal> values) {
            addCriterion("sum_timer_misc not in", values, "sum_timer_misc");
            return (Criteria) this;
        }

        public Criteria andSum_timer_miscBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_timer_misc between", value1, value2, "sum_timer_misc");
            return (Criteria) this;
        }

        public Criteria andSum_timer_miscNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sum_timer_misc not between", value1, value2, "sum_timer_misc");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table x$ps_schema_table_statistics_io
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
     * This class corresponds to the database table x$ps_schema_table_statistics_io
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