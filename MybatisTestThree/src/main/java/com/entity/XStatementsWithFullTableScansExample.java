package com.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XStatementsWithFullTableScansExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table x$statements_with_full_table_scans
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table x$statements_with_full_table_scans
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table x$statements_with_full_table_scans
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$statements_with_full_table_scans
     *
     * @mbg.generated
     */
    public XStatementsWithFullTableScansExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$statements_with_full_table_scans
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$statements_with_full_table_scans
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$statements_with_full_table_scans
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$statements_with_full_table_scans
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$statements_with_full_table_scans
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$statements_with_full_table_scans
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$statements_with_full_table_scans
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
     * This method corresponds to the database table x$statements_with_full_table_scans
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
     * This method corresponds to the database table x$statements_with_full_table_scans
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$statements_with_full_table_scans
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
     * This class corresponds to the database table x$statements_with_full_table_scans
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

        public Criteria andDbIsNull() {
            addCriterion("db is null");
            return (Criteria) this;
        }

        public Criteria andDbIsNotNull() {
            addCriterion("db is not null");
            return (Criteria) this;
        }

        public Criteria andDbEqualTo(String value) {
            addCriterion("db =", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotEqualTo(String value) {
            addCriterion("db <>", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThan(String value) {
            addCriterion("db >", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbGreaterThanOrEqualTo(String value) {
            addCriterion("db >=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThan(String value) {
            addCriterion("db <", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLessThanOrEqualTo(String value) {
            addCriterion("db <=", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbLike(String value) {
            addCriterion("db like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotLike(String value) {
            addCriterion("db not like", value, "db");
            return (Criteria) this;
        }

        public Criteria andDbIn(List<String> values) {
            addCriterion("db in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotIn(List<String> values) {
            addCriterion("db not in", values, "db");
            return (Criteria) this;
        }

        public Criteria andDbBetween(String value1, String value2) {
            addCriterion("db between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andDbNotBetween(String value1, String value2) {
            addCriterion("db not between", value1, value2, "db");
            return (Criteria) this;
        }

        public Criteria andExec_countIsNull() {
            addCriterion("exec_count is null");
            return (Criteria) this;
        }

        public Criteria andExec_countIsNotNull() {
            addCriterion("exec_count is not null");
            return (Criteria) this;
        }

        public Criteria andExec_countEqualTo(Long value) {
            addCriterion("exec_count =", value, "exec_count");
            return (Criteria) this;
        }

        public Criteria andExec_countNotEqualTo(Long value) {
            addCriterion("exec_count <>", value, "exec_count");
            return (Criteria) this;
        }

        public Criteria andExec_countGreaterThan(Long value) {
            addCriterion("exec_count >", value, "exec_count");
            return (Criteria) this;
        }

        public Criteria andExec_countGreaterThanOrEqualTo(Long value) {
            addCriterion("exec_count >=", value, "exec_count");
            return (Criteria) this;
        }

        public Criteria andExec_countLessThan(Long value) {
            addCriterion("exec_count <", value, "exec_count");
            return (Criteria) this;
        }

        public Criteria andExec_countLessThanOrEqualTo(Long value) {
            addCriterion("exec_count <=", value, "exec_count");
            return (Criteria) this;
        }

        public Criteria andExec_countIn(List<Long> values) {
            addCriterion("exec_count in", values, "exec_count");
            return (Criteria) this;
        }

        public Criteria andExec_countNotIn(List<Long> values) {
            addCriterion("exec_count not in", values, "exec_count");
            return (Criteria) this;
        }

        public Criteria andExec_countBetween(Long value1, Long value2) {
            addCriterion("exec_count between", value1, value2, "exec_count");
            return (Criteria) this;
        }

        public Criteria andExec_countNotBetween(Long value1, Long value2) {
            addCriterion("exec_count not between", value1, value2, "exec_count");
            return (Criteria) this;
        }

        public Criteria andTotal_latencyIsNull() {
            addCriterion("total_latency is null");
            return (Criteria) this;
        }

        public Criteria andTotal_latencyIsNotNull() {
            addCriterion("total_latency is not null");
            return (Criteria) this;
        }

        public Criteria andTotal_latencyEqualTo(Long value) {
            addCriterion("total_latency =", value, "total_latency");
            return (Criteria) this;
        }

        public Criteria andTotal_latencyNotEqualTo(Long value) {
            addCriterion("total_latency <>", value, "total_latency");
            return (Criteria) this;
        }

        public Criteria andTotal_latencyGreaterThan(Long value) {
            addCriterion("total_latency >", value, "total_latency");
            return (Criteria) this;
        }

        public Criteria andTotal_latencyGreaterThanOrEqualTo(Long value) {
            addCriterion("total_latency >=", value, "total_latency");
            return (Criteria) this;
        }

        public Criteria andTotal_latencyLessThan(Long value) {
            addCriterion("total_latency <", value, "total_latency");
            return (Criteria) this;
        }

        public Criteria andTotal_latencyLessThanOrEqualTo(Long value) {
            addCriterion("total_latency <=", value, "total_latency");
            return (Criteria) this;
        }

        public Criteria andTotal_latencyIn(List<Long> values) {
            addCriterion("total_latency in", values, "total_latency");
            return (Criteria) this;
        }

        public Criteria andTotal_latencyNotIn(List<Long> values) {
            addCriterion("total_latency not in", values, "total_latency");
            return (Criteria) this;
        }

        public Criteria andTotal_latencyBetween(Long value1, Long value2) {
            addCriterion("total_latency between", value1, value2, "total_latency");
            return (Criteria) this;
        }

        public Criteria andTotal_latencyNotBetween(Long value1, Long value2) {
            addCriterion("total_latency not between", value1, value2, "total_latency");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_countIsNull() {
            addCriterion("no_index_used_count is null");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_countIsNotNull() {
            addCriterion("no_index_used_count is not null");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_countEqualTo(Long value) {
            addCriterion("no_index_used_count =", value, "no_index_used_count");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_countNotEqualTo(Long value) {
            addCriterion("no_index_used_count <>", value, "no_index_used_count");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_countGreaterThan(Long value) {
            addCriterion("no_index_used_count >", value, "no_index_used_count");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_countGreaterThanOrEqualTo(Long value) {
            addCriterion("no_index_used_count >=", value, "no_index_used_count");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_countLessThan(Long value) {
            addCriterion("no_index_used_count <", value, "no_index_used_count");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_countLessThanOrEqualTo(Long value) {
            addCriterion("no_index_used_count <=", value, "no_index_used_count");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_countIn(List<Long> values) {
            addCriterion("no_index_used_count in", values, "no_index_used_count");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_countNotIn(List<Long> values) {
            addCriterion("no_index_used_count not in", values, "no_index_used_count");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_countBetween(Long value1, Long value2) {
            addCriterion("no_index_used_count between", value1, value2, "no_index_used_count");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_countNotBetween(Long value1, Long value2) {
            addCriterion("no_index_used_count not between", value1, value2, "no_index_used_count");
            return (Criteria) this;
        }

        public Criteria andNo_good_index_used_countIsNull() {
            addCriterion("no_good_index_used_count is null");
            return (Criteria) this;
        }

        public Criteria andNo_good_index_used_countIsNotNull() {
            addCriterion("no_good_index_used_count is not null");
            return (Criteria) this;
        }

        public Criteria andNo_good_index_used_countEqualTo(Long value) {
            addCriterion("no_good_index_used_count =", value, "no_good_index_used_count");
            return (Criteria) this;
        }

        public Criteria andNo_good_index_used_countNotEqualTo(Long value) {
            addCriterion("no_good_index_used_count <>", value, "no_good_index_used_count");
            return (Criteria) this;
        }

        public Criteria andNo_good_index_used_countGreaterThan(Long value) {
            addCriterion("no_good_index_used_count >", value, "no_good_index_used_count");
            return (Criteria) this;
        }

        public Criteria andNo_good_index_used_countGreaterThanOrEqualTo(Long value) {
            addCriterion("no_good_index_used_count >=", value, "no_good_index_used_count");
            return (Criteria) this;
        }

        public Criteria andNo_good_index_used_countLessThan(Long value) {
            addCriterion("no_good_index_used_count <", value, "no_good_index_used_count");
            return (Criteria) this;
        }

        public Criteria andNo_good_index_used_countLessThanOrEqualTo(Long value) {
            addCriterion("no_good_index_used_count <=", value, "no_good_index_used_count");
            return (Criteria) this;
        }

        public Criteria andNo_good_index_used_countIn(List<Long> values) {
            addCriterion("no_good_index_used_count in", values, "no_good_index_used_count");
            return (Criteria) this;
        }

        public Criteria andNo_good_index_used_countNotIn(List<Long> values) {
            addCriterion("no_good_index_used_count not in", values, "no_good_index_used_count");
            return (Criteria) this;
        }

        public Criteria andNo_good_index_used_countBetween(Long value1, Long value2) {
            addCriterion("no_good_index_used_count between", value1, value2, "no_good_index_used_count");
            return (Criteria) this;
        }

        public Criteria andNo_good_index_used_countNotBetween(Long value1, Long value2) {
            addCriterion("no_good_index_used_count not between", value1, value2, "no_good_index_used_count");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_pctIsNull() {
            addCriterion("no_index_used_pct is null");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_pctIsNotNull() {
            addCriterion("no_index_used_pct is not null");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_pctEqualTo(BigDecimal value) {
            addCriterion("no_index_used_pct =", value, "no_index_used_pct");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_pctNotEqualTo(BigDecimal value) {
            addCriterion("no_index_used_pct <>", value, "no_index_used_pct");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_pctGreaterThan(BigDecimal value) {
            addCriterion("no_index_used_pct >", value, "no_index_used_pct");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_pctGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("no_index_used_pct >=", value, "no_index_used_pct");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_pctLessThan(BigDecimal value) {
            addCriterion("no_index_used_pct <", value, "no_index_used_pct");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_pctLessThanOrEqualTo(BigDecimal value) {
            addCriterion("no_index_used_pct <=", value, "no_index_used_pct");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_pctIn(List<BigDecimal> values) {
            addCriterion("no_index_used_pct in", values, "no_index_used_pct");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_pctNotIn(List<BigDecimal> values) {
            addCriterion("no_index_used_pct not in", values, "no_index_used_pct");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_pctBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("no_index_used_pct between", value1, value2, "no_index_used_pct");
            return (Criteria) this;
        }

        public Criteria andNo_index_used_pctNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("no_index_used_pct not between", value1, value2, "no_index_used_pct");
            return (Criteria) this;
        }

        public Criteria andRows_sentIsNull() {
            addCriterion("rows_sent is null");
            return (Criteria) this;
        }

        public Criteria andRows_sentIsNotNull() {
            addCriterion("rows_sent is not null");
            return (Criteria) this;
        }

        public Criteria andRows_sentEqualTo(Long value) {
            addCriterion("rows_sent =", value, "rows_sent");
            return (Criteria) this;
        }

        public Criteria andRows_sentNotEqualTo(Long value) {
            addCriterion("rows_sent <>", value, "rows_sent");
            return (Criteria) this;
        }

        public Criteria andRows_sentGreaterThan(Long value) {
            addCriterion("rows_sent >", value, "rows_sent");
            return (Criteria) this;
        }

        public Criteria andRows_sentGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_sent >=", value, "rows_sent");
            return (Criteria) this;
        }

        public Criteria andRows_sentLessThan(Long value) {
            addCriterion("rows_sent <", value, "rows_sent");
            return (Criteria) this;
        }

        public Criteria andRows_sentLessThanOrEqualTo(Long value) {
            addCriterion("rows_sent <=", value, "rows_sent");
            return (Criteria) this;
        }

        public Criteria andRows_sentIn(List<Long> values) {
            addCriterion("rows_sent in", values, "rows_sent");
            return (Criteria) this;
        }

        public Criteria andRows_sentNotIn(List<Long> values) {
            addCriterion("rows_sent not in", values, "rows_sent");
            return (Criteria) this;
        }

        public Criteria andRows_sentBetween(Long value1, Long value2) {
            addCriterion("rows_sent between", value1, value2, "rows_sent");
            return (Criteria) this;
        }

        public Criteria andRows_sentNotBetween(Long value1, Long value2) {
            addCriterion("rows_sent not between", value1, value2, "rows_sent");
            return (Criteria) this;
        }

        public Criteria andRows_examinedIsNull() {
            addCriterion("rows_examined is null");
            return (Criteria) this;
        }

        public Criteria andRows_examinedIsNotNull() {
            addCriterion("rows_examined is not null");
            return (Criteria) this;
        }

        public Criteria andRows_examinedEqualTo(Long value) {
            addCriterion("rows_examined =", value, "rows_examined");
            return (Criteria) this;
        }

        public Criteria andRows_examinedNotEqualTo(Long value) {
            addCriterion("rows_examined <>", value, "rows_examined");
            return (Criteria) this;
        }

        public Criteria andRows_examinedGreaterThan(Long value) {
            addCriterion("rows_examined >", value, "rows_examined");
            return (Criteria) this;
        }

        public Criteria andRows_examinedGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_examined >=", value, "rows_examined");
            return (Criteria) this;
        }

        public Criteria andRows_examinedLessThan(Long value) {
            addCriterion("rows_examined <", value, "rows_examined");
            return (Criteria) this;
        }

        public Criteria andRows_examinedLessThanOrEqualTo(Long value) {
            addCriterion("rows_examined <=", value, "rows_examined");
            return (Criteria) this;
        }

        public Criteria andRows_examinedIn(List<Long> values) {
            addCriterion("rows_examined in", values, "rows_examined");
            return (Criteria) this;
        }

        public Criteria andRows_examinedNotIn(List<Long> values) {
            addCriterion("rows_examined not in", values, "rows_examined");
            return (Criteria) this;
        }

        public Criteria andRows_examinedBetween(Long value1, Long value2) {
            addCriterion("rows_examined between", value1, value2, "rows_examined");
            return (Criteria) this;
        }

        public Criteria andRows_examinedNotBetween(Long value1, Long value2) {
            addCriterion("rows_examined not between", value1, value2, "rows_examined");
            return (Criteria) this;
        }

        public Criteria andRows_sent_avgIsNull() {
            addCriterion("rows_sent_avg is null");
            return (Criteria) this;
        }

        public Criteria andRows_sent_avgIsNotNull() {
            addCriterion("rows_sent_avg is not null");
            return (Criteria) this;
        }

        public Criteria andRows_sent_avgEqualTo(BigDecimal value) {
            addCriterion("rows_sent_avg =", value, "rows_sent_avg");
            return (Criteria) this;
        }

        public Criteria andRows_sent_avgNotEqualTo(BigDecimal value) {
            addCriterion("rows_sent_avg <>", value, "rows_sent_avg");
            return (Criteria) this;
        }

        public Criteria andRows_sent_avgGreaterThan(BigDecimal value) {
            addCriterion("rows_sent_avg >", value, "rows_sent_avg");
            return (Criteria) this;
        }

        public Criteria andRows_sent_avgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_sent_avg >=", value, "rows_sent_avg");
            return (Criteria) this;
        }

        public Criteria andRows_sent_avgLessThan(BigDecimal value) {
            addCriterion("rows_sent_avg <", value, "rows_sent_avg");
            return (Criteria) this;
        }

        public Criteria andRows_sent_avgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_sent_avg <=", value, "rows_sent_avg");
            return (Criteria) this;
        }

        public Criteria andRows_sent_avgIn(List<BigDecimal> values) {
            addCriterion("rows_sent_avg in", values, "rows_sent_avg");
            return (Criteria) this;
        }

        public Criteria andRows_sent_avgNotIn(List<BigDecimal> values) {
            addCriterion("rows_sent_avg not in", values, "rows_sent_avg");
            return (Criteria) this;
        }

        public Criteria andRows_sent_avgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_sent_avg between", value1, value2, "rows_sent_avg");
            return (Criteria) this;
        }

        public Criteria andRows_sent_avgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_sent_avg not between", value1, value2, "rows_sent_avg");
            return (Criteria) this;
        }

        public Criteria andRows_examined_avgIsNull() {
            addCriterion("rows_examined_avg is null");
            return (Criteria) this;
        }

        public Criteria andRows_examined_avgIsNotNull() {
            addCriterion("rows_examined_avg is not null");
            return (Criteria) this;
        }

        public Criteria andRows_examined_avgEqualTo(BigDecimal value) {
            addCriterion("rows_examined_avg =", value, "rows_examined_avg");
            return (Criteria) this;
        }

        public Criteria andRows_examined_avgNotEqualTo(BigDecimal value) {
            addCriterion("rows_examined_avg <>", value, "rows_examined_avg");
            return (Criteria) this;
        }

        public Criteria andRows_examined_avgGreaterThan(BigDecimal value) {
            addCriterion("rows_examined_avg >", value, "rows_examined_avg");
            return (Criteria) this;
        }

        public Criteria andRows_examined_avgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_examined_avg >=", value, "rows_examined_avg");
            return (Criteria) this;
        }

        public Criteria andRows_examined_avgLessThan(BigDecimal value) {
            addCriterion("rows_examined_avg <", value, "rows_examined_avg");
            return (Criteria) this;
        }

        public Criteria andRows_examined_avgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_examined_avg <=", value, "rows_examined_avg");
            return (Criteria) this;
        }

        public Criteria andRows_examined_avgIn(List<BigDecimal> values) {
            addCriterion("rows_examined_avg in", values, "rows_examined_avg");
            return (Criteria) this;
        }

        public Criteria andRows_examined_avgNotIn(List<BigDecimal> values) {
            addCriterion("rows_examined_avg not in", values, "rows_examined_avg");
            return (Criteria) this;
        }

        public Criteria andRows_examined_avgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_examined_avg between", value1, value2, "rows_examined_avg");
            return (Criteria) this;
        }

        public Criteria andRows_examined_avgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_examined_avg not between", value1, value2, "rows_examined_avg");
            return (Criteria) this;
        }

        public Criteria andFirst_seenIsNull() {
            addCriterion("first_seen is null");
            return (Criteria) this;
        }

        public Criteria andFirst_seenIsNotNull() {
            addCriterion("first_seen is not null");
            return (Criteria) this;
        }

        public Criteria andFirst_seenEqualTo(Date value) {
            addCriterion("first_seen =", value, "first_seen");
            return (Criteria) this;
        }

        public Criteria andFirst_seenNotEqualTo(Date value) {
            addCriterion("first_seen <>", value, "first_seen");
            return (Criteria) this;
        }

        public Criteria andFirst_seenGreaterThan(Date value) {
            addCriterion("first_seen >", value, "first_seen");
            return (Criteria) this;
        }

        public Criteria andFirst_seenGreaterThanOrEqualTo(Date value) {
            addCriterion("first_seen >=", value, "first_seen");
            return (Criteria) this;
        }

        public Criteria andFirst_seenLessThan(Date value) {
            addCriterion("first_seen <", value, "first_seen");
            return (Criteria) this;
        }

        public Criteria andFirst_seenLessThanOrEqualTo(Date value) {
            addCriterion("first_seen <=", value, "first_seen");
            return (Criteria) this;
        }

        public Criteria andFirst_seenIn(List<Date> values) {
            addCriterion("first_seen in", values, "first_seen");
            return (Criteria) this;
        }

        public Criteria andFirst_seenNotIn(List<Date> values) {
            addCriterion("first_seen not in", values, "first_seen");
            return (Criteria) this;
        }

        public Criteria andFirst_seenBetween(Date value1, Date value2) {
            addCriterion("first_seen between", value1, value2, "first_seen");
            return (Criteria) this;
        }

        public Criteria andFirst_seenNotBetween(Date value1, Date value2) {
            addCriterion("first_seen not between", value1, value2, "first_seen");
            return (Criteria) this;
        }

        public Criteria andLast_seenIsNull() {
            addCriterion("last_seen is null");
            return (Criteria) this;
        }

        public Criteria andLast_seenIsNotNull() {
            addCriterion("last_seen is not null");
            return (Criteria) this;
        }

        public Criteria andLast_seenEqualTo(Date value) {
            addCriterion("last_seen =", value, "last_seen");
            return (Criteria) this;
        }

        public Criteria andLast_seenNotEqualTo(Date value) {
            addCriterion("last_seen <>", value, "last_seen");
            return (Criteria) this;
        }

        public Criteria andLast_seenGreaterThan(Date value) {
            addCriterion("last_seen >", value, "last_seen");
            return (Criteria) this;
        }

        public Criteria andLast_seenGreaterThanOrEqualTo(Date value) {
            addCriterion("last_seen >=", value, "last_seen");
            return (Criteria) this;
        }

        public Criteria andLast_seenLessThan(Date value) {
            addCriterion("last_seen <", value, "last_seen");
            return (Criteria) this;
        }

        public Criteria andLast_seenLessThanOrEqualTo(Date value) {
            addCriterion("last_seen <=", value, "last_seen");
            return (Criteria) this;
        }

        public Criteria andLast_seenIn(List<Date> values) {
            addCriterion("last_seen in", values, "last_seen");
            return (Criteria) this;
        }

        public Criteria andLast_seenNotIn(List<Date> values) {
            addCriterion("last_seen not in", values, "last_seen");
            return (Criteria) this;
        }

        public Criteria andLast_seenBetween(Date value1, Date value2) {
            addCriterion("last_seen between", value1, value2, "last_seen");
            return (Criteria) this;
        }

        public Criteria andLast_seenNotBetween(Date value1, Date value2) {
            addCriterion("last_seen not between", value1, value2, "last_seen");
            return (Criteria) this;
        }

        public Criteria andDigestIsNull() {
            addCriterion("digest is null");
            return (Criteria) this;
        }

        public Criteria andDigestIsNotNull() {
            addCriterion("digest is not null");
            return (Criteria) this;
        }

        public Criteria andDigestEqualTo(String value) {
            addCriterion("digest =", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotEqualTo(String value) {
            addCriterion("digest <>", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestGreaterThan(String value) {
            addCriterion("digest >", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestGreaterThanOrEqualTo(String value) {
            addCriterion("digest >=", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLessThan(String value) {
            addCriterion("digest <", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLessThanOrEqualTo(String value) {
            addCriterion("digest <=", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestLike(String value) {
            addCriterion("digest like", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotLike(String value) {
            addCriterion("digest not like", value, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestIn(List<String> values) {
            addCriterion("digest in", values, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotIn(List<String> values) {
            addCriterion("digest not in", values, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestBetween(String value1, String value2) {
            addCriterion("digest between", value1, value2, "digest");
            return (Criteria) this;
        }

        public Criteria andDigestNotBetween(String value1, String value2) {
            addCriterion("digest not between", value1, value2, "digest");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table x$statements_with_full_table_scans
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
     * This class corresponds to the database table x$statements_with_full_table_scans
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