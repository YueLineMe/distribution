package com.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SchemaTableStatisticsWithBufferExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table schema_table_statistics_with_buffer
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table schema_table_statistics_with_buffer
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table schema_table_statistics_with_buffer
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_table_statistics_with_buffer
     *
     * @mbg.generated
     */
    public SchemaTableStatisticsWithBufferExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_table_statistics_with_buffer
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_table_statistics_with_buffer
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_table_statistics_with_buffer
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_table_statistics_with_buffer
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_table_statistics_with_buffer
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_table_statistics_with_buffer
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_table_statistics_with_buffer
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
     * This method corresponds to the database table schema_table_statistics_with_buffer
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
     * This method corresponds to the database table schema_table_statistics_with_buffer
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_table_statistics_with_buffer
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
     * This class corresponds to the database table schema_table_statistics_with_buffer
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

        public Criteria andRows_fetchedIsNull() {
            addCriterion("rows_fetched is null");
            return (Criteria) this;
        }

        public Criteria andRows_fetchedIsNotNull() {
            addCriterion("rows_fetched is not null");
            return (Criteria) this;
        }

        public Criteria andRows_fetchedEqualTo(Long value) {
            addCriterion("rows_fetched =", value, "rows_fetched");
            return (Criteria) this;
        }

        public Criteria andRows_fetchedNotEqualTo(Long value) {
            addCriterion("rows_fetched <>", value, "rows_fetched");
            return (Criteria) this;
        }

        public Criteria andRows_fetchedGreaterThan(Long value) {
            addCriterion("rows_fetched >", value, "rows_fetched");
            return (Criteria) this;
        }

        public Criteria andRows_fetchedGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_fetched >=", value, "rows_fetched");
            return (Criteria) this;
        }

        public Criteria andRows_fetchedLessThan(Long value) {
            addCriterion("rows_fetched <", value, "rows_fetched");
            return (Criteria) this;
        }

        public Criteria andRows_fetchedLessThanOrEqualTo(Long value) {
            addCriterion("rows_fetched <=", value, "rows_fetched");
            return (Criteria) this;
        }

        public Criteria andRows_fetchedIn(List<Long> values) {
            addCriterion("rows_fetched in", values, "rows_fetched");
            return (Criteria) this;
        }

        public Criteria andRows_fetchedNotIn(List<Long> values) {
            addCriterion("rows_fetched not in", values, "rows_fetched");
            return (Criteria) this;
        }

        public Criteria andRows_fetchedBetween(Long value1, Long value2) {
            addCriterion("rows_fetched between", value1, value2, "rows_fetched");
            return (Criteria) this;
        }

        public Criteria andRows_fetchedNotBetween(Long value1, Long value2) {
            addCriterion("rows_fetched not between", value1, value2, "rows_fetched");
            return (Criteria) this;
        }

        public Criteria andRows_insertedIsNull() {
            addCriterion("rows_inserted is null");
            return (Criteria) this;
        }

        public Criteria andRows_insertedIsNotNull() {
            addCriterion("rows_inserted is not null");
            return (Criteria) this;
        }

        public Criteria andRows_insertedEqualTo(Long value) {
            addCriterion("rows_inserted =", value, "rows_inserted");
            return (Criteria) this;
        }

        public Criteria andRows_insertedNotEqualTo(Long value) {
            addCriterion("rows_inserted <>", value, "rows_inserted");
            return (Criteria) this;
        }

        public Criteria andRows_insertedGreaterThan(Long value) {
            addCriterion("rows_inserted >", value, "rows_inserted");
            return (Criteria) this;
        }

        public Criteria andRows_insertedGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_inserted >=", value, "rows_inserted");
            return (Criteria) this;
        }

        public Criteria andRows_insertedLessThan(Long value) {
            addCriterion("rows_inserted <", value, "rows_inserted");
            return (Criteria) this;
        }

        public Criteria andRows_insertedLessThanOrEqualTo(Long value) {
            addCriterion("rows_inserted <=", value, "rows_inserted");
            return (Criteria) this;
        }

        public Criteria andRows_insertedIn(List<Long> values) {
            addCriterion("rows_inserted in", values, "rows_inserted");
            return (Criteria) this;
        }

        public Criteria andRows_insertedNotIn(List<Long> values) {
            addCriterion("rows_inserted not in", values, "rows_inserted");
            return (Criteria) this;
        }

        public Criteria andRows_insertedBetween(Long value1, Long value2) {
            addCriterion("rows_inserted between", value1, value2, "rows_inserted");
            return (Criteria) this;
        }

        public Criteria andRows_insertedNotBetween(Long value1, Long value2) {
            addCriterion("rows_inserted not between", value1, value2, "rows_inserted");
            return (Criteria) this;
        }

        public Criteria andRows_updatedIsNull() {
            addCriterion("rows_updated is null");
            return (Criteria) this;
        }

        public Criteria andRows_updatedIsNotNull() {
            addCriterion("rows_updated is not null");
            return (Criteria) this;
        }

        public Criteria andRows_updatedEqualTo(Long value) {
            addCriterion("rows_updated =", value, "rows_updated");
            return (Criteria) this;
        }

        public Criteria andRows_updatedNotEqualTo(Long value) {
            addCriterion("rows_updated <>", value, "rows_updated");
            return (Criteria) this;
        }

        public Criteria andRows_updatedGreaterThan(Long value) {
            addCriterion("rows_updated >", value, "rows_updated");
            return (Criteria) this;
        }

        public Criteria andRows_updatedGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_updated >=", value, "rows_updated");
            return (Criteria) this;
        }

        public Criteria andRows_updatedLessThan(Long value) {
            addCriterion("rows_updated <", value, "rows_updated");
            return (Criteria) this;
        }

        public Criteria andRows_updatedLessThanOrEqualTo(Long value) {
            addCriterion("rows_updated <=", value, "rows_updated");
            return (Criteria) this;
        }

        public Criteria andRows_updatedIn(List<Long> values) {
            addCriterion("rows_updated in", values, "rows_updated");
            return (Criteria) this;
        }

        public Criteria andRows_updatedNotIn(List<Long> values) {
            addCriterion("rows_updated not in", values, "rows_updated");
            return (Criteria) this;
        }

        public Criteria andRows_updatedBetween(Long value1, Long value2) {
            addCriterion("rows_updated between", value1, value2, "rows_updated");
            return (Criteria) this;
        }

        public Criteria andRows_updatedNotBetween(Long value1, Long value2) {
            addCriterion("rows_updated not between", value1, value2, "rows_updated");
            return (Criteria) this;
        }

        public Criteria andRows_deletedIsNull() {
            addCriterion("rows_deleted is null");
            return (Criteria) this;
        }

        public Criteria andRows_deletedIsNotNull() {
            addCriterion("rows_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andRows_deletedEqualTo(Long value) {
            addCriterion("rows_deleted =", value, "rows_deleted");
            return (Criteria) this;
        }

        public Criteria andRows_deletedNotEqualTo(Long value) {
            addCriterion("rows_deleted <>", value, "rows_deleted");
            return (Criteria) this;
        }

        public Criteria andRows_deletedGreaterThan(Long value) {
            addCriterion("rows_deleted >", value, "rows_deleted");
            return (Criteria) this;
        }

        public Criteria andRows_deletedGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_deleted >=", value, "rows_deleted");
            return (Criteria) this;
        }

        public Criteria andRows_deletedLessThan(Long value) {
            addCriterion("rows_deleted <", value, "rows_deleted");
            return (Criteria) this;
        }

        public Criteria andRows_deletedLessThanOrEqualTo(Long value) {
            addCriterion("rows_deleted <=", value, "rows_deleted");
            return (Criteria) this;
        }

        public Criteria andRows_deletedIn(List<Long> values) {
            addCriterion("rows_deleted in", values, "rows_deleted");
            return (Criteria) this;
        }

        public Criteria andRows_deletedNotIn(List<Long> values) {
            addCriterion("rows_deleted not in", values, "rows_deleted");
            return (Criteria) this;
        }

        public Criteria andRows_deletedBetween(Long value1, Long value2) {
            addCriterion("rows_deleted between", value1, value2, "rows_deleted");
            return (Criteria) this;
        }

        public Criteria andRows_deletedNotBetween(Long value1, Long value2) {
            addCriterion("rows_deleted not between", value1, value2, "rows_deleted");
            return (Criteria) this;
        }

        public Criteria andIo_read_requestsIsNull() {
            addCriterion("io_read_requests is null");
            return (Criteria) this;
        }

        public Criteria andIo_read_requestsIsNotNull() {
            addCriterion("io_read_requests is not null");
            return (Criteria) this;
        }

        public Criteria andIo_read_requestsEqualTo(BigDecimal value) {
            addCriterion("io_read_requests =", value, "io_read_requests");
            return (Criteria) this;
        }

        public Criteria andIo_read_requestsNotEqualTo(BigDecimal value) {
            addCriterion("io_read_requests <>", value, "io_read_requests");
            return (Criteria) this;
        }

        public Criteria andIo_read_requestsGreaterThan(BigDecimal value) {
            addCriterion("io_read_requests >", value, "io_read_requests");
            return (Criteria) this;
        }

        public Criteria andIo_read_requestsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("io_read_requests >=", value, "io_read_requests");
            return (Criteria) this;
        }

        public Criteria andIo_read_requestsLessThan(BigDecimal value) {
            addCriterion("io_read_requests <", value, "io_read_requests");
            return (Criteria) this;
        }

        public Criteria andIo_read_requestsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("io_read_requests <=", value, "io_read_requests");
            return (Criteria) this;
        }

        public Criteria andIo_read_requestsIn(List<BigDecimal> values) {
            addCriterion("io_read_requests in", values, "io_read_requests");
            return (Criteria) this;
        }

        public Criteria andIo_read_requestsNotIn(List<BigDecimal> values) {
            addCriterion("io_read_requests not in", values, "io_read_requests");
            return (Criteria) this;
        }

        public Criteria andIo_read_requestsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_read_requests between", value1, value2, "io_read_requests");
            return (Criteria) this;
        }

        public Criteria andIo_read_requestsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_read_requests not between", value1, value2, "io_read_requests");
            return (Criteria) this;
        }

        public Criteria andIo_write_requestsIsNull() {
            addCriterion("io_write_requests is null");
            return (Criteria) this;
        }

        public Criteria andIo_write_requestsIsNotNull() {
            addCriterion("io_write_requests is not null");
            return (Criteria) this;
        }

        public Criteria andIo_write_requestsEqualTo(BigDecimal value) {
            addCriterion("io_write_requests =", value, "io_write_requests");
            return (Criteria) this;
        }

        public Criteria andIo_write_requestsNotEqualTo(BigDecimal value) {
            addCriterion("io_write_requests <>", value, "io_write_requests");
            return (Criteria) this;
        }

        public Criteria andIo_write_requestsGreaterThan(BigDecimal value) {
            addCriterion("io_write_requests >", value, "io_write_requests");
            return (Criteria) this;
        }

        public Criteria andIo_write_requestsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("io_write_requests >=", value, "io_write_requests");
            return (Criteria) this;
        }

        public Criteria andIo_write_requestsLessThan(BigDecimal value) {
            addCriterion("io_write_requests <", value, "io_write_requests");
            return (Criteria) this;
        }

        public Criteria andIo_write_requestsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("io_write_requests <=", value, "io_write_requests");
            return (Criteria) this;
        }

        public Criteria andIo_write_requestsIn(List<BigDecimal> values) {
            addCriterion("io_write_requests in", values, "io_write_requests");
            return (Criteria) this;
        }

        public Criteria andIo_write_requestsNotIn(List<BigDecimal> values) {
            addCriterion("io_write_requests not in", values, "io_write_requests");
            return (Criteria) this;
        }

        public Criteria andIo_write_requestsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_write_requests between", value1, value2, "io_write_requests");
            return (Criteria) this;
        }

        public Criteria andIo_write_requestsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_write_requests not between", value1, value2, "io_write_requests");
            return (Criteria) this;
        }

        public Criteria andIo_misc_requestsIsNull() {
            addCriterion("io_misc_requests is null");
            return (Criteria) this;
        }

        public Criteria andIo_misc_requestsIsNotNull() {
            addCriterion("io_misc_requests is not null");
            return (Criteria) this;
        }

        public Criteria andIo_misc_requestsEqualTo(BigDecimal value) {
            addCriterion("io_misc_requests =", value, "io_misc_requests");
            return (Criteria) this;
        }

        public Criteria andIo_misc_requestsNotEqualTo(BigDecimal value) {
            addCriterion("io_misc_requests <>", value, "io_misc_requests");
            return (Criteria) this;
        }

        public Criteria andIo_misc_requestsGreaterThan(BigDecimal value) {
            addCriterion("io_misc_requests >", value, "io_misc_requests");
            return (Criteria) this;
        }

        public Criteria andIo_misc_requestsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("io_misc_requests >=", value, "io_misc_requests");
            return (Criteria) this;
        }

        public Criteria andIo_misc_requestsLessThan(BigDecimal value) {
            addCriterion("io_misc_requests <", value, "io_misc_requests");
            return (Criteria) this;
        }

        public Criteria andIo_misc_requestsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("io_misc_requests <=", value, "io_misc_requests");
            return (Criteria) this;
        }

        public Criteria andIo_misc_requestsIn(List<BigDecimal> values) {
            addCriterion("io_misc_requests in", values, "io_misc_requests");
            return (Criteria) this;
        }

        public Criteria andIo_misc_requestsNotIn(List<BigDecimal> values) {
            addCriterion("io_misc_requests not in", values, "io_misc_requests");
            return (Criteria) this;
        }

        public Criteria andIo_misc_requestsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_misc_requests between", value1, value2, "io_misc_requests");
            return (Criteria) this;
        }

        public Criteria andIo_misc_requestsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("io_misc_requests not between", value1, value2, "io_misc_requests");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pagesIsNull() {
            addCriterion("innodb_buffer_pages is null");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pagesIsNotNull() {
            addCriterion("innodb_buffer_pages is not null");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pagesEqualTo(Long value) {
            addCriterion("innodb_buffer_pages =", value, "innodb_buffer_pages");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pagesNotEqualTo(Long value) {
            addCriterion("innodb_buffer_pages <>", value, "innodb_buffer_pages");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pagesGreaterThan(Long value) {
            addCriterion("innodb_buffer_pages >", value, "innodb_buffer_pages");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pagesGreaterThanOrEqualTo(Long value) {
            addCriterion("innodb_buffer_pages >=", value, "innodb_buffer_pages");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pagesLessThan(Long value) {
            addCriterion("innodb_buffer_pages <", value, "innodb_buffer_pages");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pagesLessThanOrEqualTo(Long value) {
            addCriterion("innodb_buffer_pages <=", value, "innodb_buffer_pages");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pagesIn(List<Long> values) {
            addCriterion("innodb_buffer_pages in", values, "innodb_buffer_pages");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pagesNotIn(List<Long> values) {
            addCriterion("innodb_buffer_pages not in", values, "innodb_buffer_pages");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pagesBetween(Long value1, Long value2) {
            addCriterion("innodb_buffer_pages between", value1, value2, "innodb_buffer_pages");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pagesNotBetween(Long value1, Long value2) {
            addCriterion("innodb_buffer_pages not between", value1, value2, "innodb_buffer_pages");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_hashedIsNull() {
            addCriterion("innodb_buffer_pages_hashed is null");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_hashedIsNotNull() {
            addCriterion("innodb_buffer_pages_hashed is not null");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_hashedEqualTo(Long value) {
            addCriterion("innodb_buffer_pages_hashed =", value, "innodb_buffer_pages_hashed");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_hashedNotEqualTo(Long value) {
            addCriterion("innodb_buffer_pages_hashed <>", value, "innodb_buffer_pages_hashed");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_hashedGreaterThan(Long value) {
            addCriterion("innodb_buffer_pages_hashed >", value, "innodb_buffer_pages_hashed");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_hashedGreaterThanOrEqualTo(Long value) {
            addCriterion("innodb_buffer_pages_hashed >=", value, "innodb_buffer_pages_hashed");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_hashedLessThan(Long value) {
            addCriterion("innodb_buffer_pages_hashed <", value, "innodb_buffer_pages_hashed");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_hashedLessThanOrEqualTo(Long value) {
            addCriterion("innodb_buffer_pages_hashed <=", value, "innodb_buffer_pages_hashed");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_hashedIn(List<Long> values) {
            addCriterion("innodb_buffer_pages_hashed in", values, "innodb_buffer_pages_hashed");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_hashedNotIn(List<Long> values) {
            addCriterion("innodb_buffer_pages_hashed not in", values, "innodb_buffer_pages_hashed");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_hashedBetween(Long value1, Long value2) {
            addCriterion("innodb_buffer_pages_hashed between", value1, value2, "innodb_buffer_pages_hashed");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_hashedNotBetween(Long value1, Long value2) {
            addCriterion("innodb_buffer_pages_hashed not between", value1, value2, "innodb_buffer_pages_hashed");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_oldIsNull() {
            addCriterion("innodb_buffer_pages_old is null");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_oldIsNotNull() {
            addCriterion("innodb_buffer_pages_old is not null");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_oldEqualTo(Long value) {
            addCriterion("innodb_buffer_pages_old =", value, "innodb_buffer_pages_old");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_oldNotEqualTo(Long value) {
            addCriterion("innodb_buffer_pages_old <>", value, "innodb_buffer_pages_old");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_oldGreaterThan(Long value) {
            addCriterion("innodb_buffer_pages_old >", value, "innodb_buffer_pages_old");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_oldGreaterThanOrEqualTo(Long value) {
            addCriterion("innodb_buffer_pages_old >=", value, "innodb_buffer_pages_old");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_oldLessThan(Long value) {
            addCriterion("innodb_buffer_pages_old <", value, "innodb_buffer_pages_old");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_oldLessThanOrEqualTo(Long value) {
            addCriterion("innodb_buffer_pages_old <=", value, "innodb_buffer_pages_old");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_oldIn(List<Long> values) {
            addCriterion("innodb_buffer_pages_old in", values, "innodb_buffer_pages_old");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_oldNotIn(List<Long> values) {
            addCriterion("innodb_buffer_pages_old not in", values, "innodb_buffer_pages_old");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_oldBetween(Long value1, Long value2) {
            addCriterion("innodb_buffer_pages_old between", value1, value2, "innodb_buffer_pages_old");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_pages_oldNotBetween(Long value1, Long value2) {
            addCriterion("innodb_buffer_pages_old not between", value1, value2, "innodb_buffer_pages_old");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_rows_cachedIsNull() {
            addCriterion("innodb_buffer_rows_cached is null");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_rows_cachedIsNotNull() {
            addCriterion("innodb_buffer_rows_cached is not null");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_rows_cachedEqualTo(BigDecimal value) {
            addCriterion("innodb_buffer_rows_cached =", value, "innodb_buffer_rows_cached");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_rows_cachedNotEqualTo(BigDecimal value) {
            addCriterion("innodb_buffer_rows_cached <>", value, "innodb_buffer_rows_cached");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_rows_cachedGreaterThan(BigDecimal value) {
            addCriterion("innodb_buffer_rows_cached >", value, "innodb_buffer_rows_cached");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_rows_cachedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("innodb_buffer_rows_cached >=", value, "innodb_buffer_rows_cached");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_rows_cachedLessThan(BigDecimal value) {
            addCriterion("innodb_buffer_rows_cached <", value, "innodb_buffer_rows_cached");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_rows_cachedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("innodb_buffer_rows_cached <=", value, "innodb_buffer_rows_cached");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_rows_cachedIn(List<BigDecimal> values) {
            addCriterion("innodb_buffer_rows_cached in", values, "innodb_buffer_rows_cached");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_rows_cachedNotIn(List<BigDecimal> values) {
            addCriterion("innodb_buffer_rows_cached not in", values, "innodb_buffer_rows_cached");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_rows_cachedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("innodb_buffer_rows_cached between", value1, value2, "innodb_buffer_rows_cached");
            return (Criteria) this;
        }

        public Criteria andInnodb_buffer_rows_cachedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("innodb_buffer_rows_cached not between", value1, value2, "innodb_buffer_rows_cached");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table schema_table_statistics_with_buffer
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
     * This class corresponds to the database table schema_table_statistics_with_buffer
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