package com.entity;

import java.util.ArrayList;
import java.util.List;

public class XHostSummaryByStatementTypeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table x$host_summary_by_statement_type
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table x$host_summary_by_statement_type
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table x$host_summary_by_statement_type
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$host_summary_by_statement_type
     *
     * @mbg.generated
     */
    public XHostSummaryByStatementTypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$host_summary_by_statement_type
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$host_summary_by_statement_type
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$host_summary_by_statement_type
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$host_summary_by_statement_type
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$host_summary_by_statement_type
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$host_summary_by_statement_type
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$host_summary_by_statement_type
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
     * This method corresponds to the database table x$host_summary_by_statement_type
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
     * This method corresponds to the database table x$host_summary_by_statement_type
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$host_summary_by_statement_type
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
     * This class corresponds to the database table x$host_summary_by_statement_type
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

        public Criteria andHostIsNull() {
            addCriterion("host is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("host is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("host =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("host <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("host >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("host >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("host <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("host <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("host like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("host not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("host in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("host not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("host between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("host not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andStatementIsNull() {
            addCriterion("statement is null");
            return (Criteria) this;
        }

        public Criteria andStatementIsNotNull() {
            addCriterion("statement is not null");
            return (Criteria) this;
        }

        public Criteria andStatementEqualTo(String value) {
            addCriterion("statement =", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementNotEqualTo(String value) {
            addCriterion("statement <>", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementGreaterThan(String value) {
            addCriterion("statement >", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementGreaterThanOrEqualTo(String value) {
            addCriterion("statement >=", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementLessThan(String value) {
            addCriterion("statement <", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementLessThanOrEqualTo(String value) {
            addCriterion("statement <=", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementLike(String value) {
            addCriterion("statement like", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementNotLike(String value) {
            addCriterion("statement not like", value, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementIn(List<String> values) {
            addCriterion("statement in", values, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementNotIn(List<String> values) {
            addCriterion("statement not in", values, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementBetween(String value1, String value2) {
            addCriterion("statement between", value1, value2, "statement");
            return (Criteria) this;
        }

        public Criteria andStatementNotBetween(String value1, String value2) {
            addCriterion("statement not between", value1, value2, "statement");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Long value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Long value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Long value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Long value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Long value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Long> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Long> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Long value1, Long value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Long value1, Long value2) {
            addCriterion("total not between", value1, value2, "total");
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

        public Criteria andMax_latencyIsNull() {
            addCriterion("max_latency is null");
            return (Criteria) this;
        }

        public Criteria andMax_latencyIsNotNull() {
            addCriterion("max_latency is not null");
            return (Criteria) this;
        }

        public Criteria andMax_latencyEqualTo(Long value) {
            addCriterion("max_latency =", value, "max_latency");
            return (Criteria) this;
        }

        public Criteria andMax_latencyNotEqualTo(Long value) {
            addCriterion("max_latency <>", value, "max_latency");
            return (Criteria) this;
        }

        public Criteria andMax_latencyGreaterThan(Long value) {
            addCriterion("max_latency >", value, "max_latency");
            return (Criteria) this;
        }

        public Criteria andMax_latencyGreaterThanOrEqualTo(Long value) {
            addCriterion("max_latency >=", value, "max_latency");
            return (Criteria) this;
        }

        public Criteria andMax_latencyLessThan(Long value) {
            addCriterion("max_latency <", value, "max_latency");
            return (Criteria) this;
        }

        public Criteria andMax_latencyLessThanOrEqualTo(Long value) {
            addCriterion("max_latency <=", value, "max_latency");
            return (Criteria) this;
        }

        public Criteria andMax_latencyIn(List<Long> values) {
            addCriterion("max_latency in", values, "max_latency");
            return (Criteria) this;
        }

        public Criteria andMax_latencyNotIn(List<Long> values) {
            addCriterion("max_latency not in", values, "max_latency");
            return (Criteria) this;
        }

        public Criteria andMax_latencyBetween(Long value1, Long value2) {
            addCriterion("max_latency between", value1, value2, "max_latency");
            return (Criteria) this;
        }

        public Criteria andMax_latencyNotBetween(Long value1, Long value2) {
            addCriterion("max_latency not between", value1, value2, "max_latency");
            return (Criteria) this;
        }

        public Criteria andLock_latencyIsNull() {
            addCriterion("lock_latency is null");
            return (Criteria) this;
        }

        public Criteria andLock_latencyIsNotNull() {
            addCriterion("lock_latency is not null");
            return (Criteria) this;
        }

        public Criteria andLock_latencyEqualTo(Long value) {
            addCriterion("lock_latency =", value, "lock_latency");
            return (Criteria) this;
        }

        public Criteria andLock_latencyNotEqualTo(Long value) {
            addCriterion("lock_latency <>", value, "lock_latency");
            return (Criteria) this;
        }

        public Criteria andLock_latencyGreaterThan(Long value) {
            addCriterion("lock_latency >", value, "lock_latency");
            return (Criteria) this;
        }

        public Criteria andLock_latencyGreaterThanOrEqualTo(Long value) {
            addCriterion("lock_latency >=", value, "lock_latency");
            return (Criteria) this;
        }

        public Criteria andLock_latencyLessThan(Long value) {
            addCriterion("lock_latency <", value, "lock_latency");
            return (Criteria) this;
        }

        public Criteria andLock_latencyLessThanOrEqualTo(Long value) {
            addCriterion("lock_latency <=", value, "lock_latency");
            return (Criteria) this;
        }

        public Criteria andLock_latencyIn(List<Long> values) {
            addCriterion("lock_latency in", values, "lock_latency");
            return (Criteria) this;
        }

        public Criteria andLock_latencyNotIn(List<Long> values) {
            addCriterion("lock_latency not in", values, "lock_latency");
            return (Criteria) this;
        }

        public Criteria andLock_latencyBetween(Long value1, Long value2) {
            addCriterion("lock_latency between", value1, value2, "lock_latency");
            return (Criteria) this;
        }

        public Criteria andLock_latencyNotBetween(Long value1, Long value2) {
            addCriterion("lock_latency not between", value1, value2, "lock_latency");
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

        public Criteria andRows_affectedIsNull() {
            addCriterion("rows_affected is null");
            return (Criteria) this;
        }

        public Criteria andRows_affectedIsNotNull() {
            addCriterion("rows_affected is not null");
            return (Criteria) this;
        }

        public Criteria andRows_affectedEqualTo(Long value) {
            addCriterion("rows_affected =", value, "rows_affected");
            return (Criteria) this;
        }

        public Criteria andRows_affectedNotEqualTo(Long value) {
            addCriterion("rows_affected <>", value, "rows_affected");
            return (Criteria) this;
        }

        public Criteria andRows_affectedGreaterThan(Long value) {
            addCriterion("rows_affected >", value, "rows_affected");
            return (Criteria) this;
        }

        public Criteria andRows_affectedGreaterThanOrEqualTo(Long value) {
            addCriterion("rows_affected >=", value, "rows_affected");
            return (Criteria) this;
        }

        public Criteria andRows_affectedLessThan(Long value) {
            addCriterion("rows_affected <", value, "rows_affected");
            return (Criteria) this;
        }

        public Criteria andRows_affectedLessThanOrEqualTo(Long value) {
            addCriterion("rows_affected <=", value, "rows_affected");
            return (Criteria) this;
        }

        public Criteria andRows_affectedIn(List<Long> values) {
            addCriterion("rows_affected in", values, "rows_affected");
            return (Criteria) this;
        }

        public Criteria andRows_affectedNotIn(List<Long> values) {
            addCriterion("rows_affected not in", values, "rows_affected");
            return (Criteria) this;
        }

        public Criteria andRows_affectedBetween(Long value1, Long value2) {
            addCriterion("rows_affected between", value1, value2, "rows_affected");
            return (Criteria) this;
        }

        public Criteria andRows_affectedNotBetween(Long value1, Long value2) {
            addCriterion("rows_affected not between", value1, value2, "rows_affected");
            return (Criteria) this;
        }

        public Criteria andFull_scansIsNull() {
            addCriterion("full_scans is null");
            return (Criteria) this;
        }

        public Criteria andFull_scansIsNotNull() {
            addCriterion("full_scans is not null");
            return (Criteria) this;
        }

        public Criteria andFull_scansEqualTo(Long value) {
            addCriterion("full_scans =", value, "full_scans");
            return (Criteria) this;
        }

        public Criteria andFull_scansNotEqualTo(Long value) {
            addCriterion("full_scans <>", value, "full_scans");
            return (Criteria) this;
        }

        public Criteria andFull_scansGreaterThan(Long value) {
            addCriterion("full_scans >", value, "full_scans");
            return (Criteria) this;
        }

        public Criteria andFull_scansGreaterThanOrEqualTo(Long value) {
            addCriterion("full_scans >=", value, "full_scans");
            return (Criteria) this;
        }

        public Criteria andFull_scansLessThan(Long value) {
            addCriterion("full_scans <", value, "full_scans");
            return (Criteria) this;
        }

        public Criteria andFull_scansLessThanOrEqualTo(Long value) {
            addCriterion("full_scans <=", value, "full_scans");
            return (Criteria) this;
        }

        public Criteria andFull_scansIn(List<Long> values) {
            addCriterion("full_scans in", values, "full_scans");
            return (Criteria) this;
        }

        public Criteria andFull_scansNotIn(List<Long> values) {
            addCriterion("full_scans not in", values, "full_scans");
            return (Criteria) this;
        }

        public Criteria andFull_scansBetween(Long value1, Long value2) {
            addCriterion("full_scans between", value1, value2, "full_scans");
            return (Criteria) this;
        }

        public Criteria andFull_scansNotBetween(Long value1, Long value2) {
            addCriterion("full_scans not between", value1, value2, "full_scans");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table x$host_summary_by_statement_type
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
     * This class corresponds to the database table x$host_summary_by_statement_type
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