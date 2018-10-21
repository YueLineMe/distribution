package com.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HostSummaryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table host_summary
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table host_summary
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table host_summary
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary
     *
     * @mbg.generated
     */
    public HostSummaryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary
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
     * This method corresponds to the database table host_summary
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
     * This method corresponds to the database table host_summary
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary
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
     * This class corresponds to the database table host_summary
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

        public Criteria andStatementsIsNull() {
            addCriterion("statements is null");
            return (Criteria) this;
        }

        public Criteria andStatementsIsNotNull() {
            addCriterion("statements is not null");
            return (Criteria) this;
        }

        public Criteria andStatementsEqualTo(BigDecimal value) {
            addCriterion("statements =", value, "statements");
            return (Criteria) this;
        }

        public Criteria andStatementsNotEqualTo(BigDecimal value) {
            addCriterion("statements <>", value, "statements");
            return (Criteria) this;
        }

        public Criteria andStatementsGreaterThan(BigDecimal value) {
            addCriterion("statements >", value, "statements");
            return (Criteria) this;
        }

        public Criteria andStatementsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("statements >=", value, "statements");
            return (Criteria) this;
        }

        public Criteria andStatementsLessThan(BigDecimal value) {
            addCriterion("statements <", value, "statements");
            return (Criteria) this;
        }

        public Criteria andStatementsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("statements <=", value, "statements");
            return (Criteria) this;
        }

        public Criteria andStatementsIn(List<BigDecimal> values) {
            addCriterion("statements in", values, "statements");
            return (Criteria) this;
        }

        public Criteria andStatementsNotIn(List<BigDecimal> values) {
            addCriterion("statements not in", values, "statements");
            return (Criteria) this;
        }

        public Criteria andStatementsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("statements between", value1, value2, "statements");
            return (Criteria) this;
        }

        public Criteria andStatementsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("statements not between", value1, value2, "statements");
            return (Criteria) this;
        }

        public Criteria andTable_scansIsNull() {
            addCriterion("table_scans is null");
            return (Criteria) this;
        }

        public Criteria andTable_scansIsNotNull() {
            addCriterion("table_scans is not null");
            return (Criteria) this;
        }

        public Criteria andTable_scansEqualTo(BigDecimal value) {
            addCriterion("table_scans =", value, "table_scans");
            return (Criteria) this;
        }

        public Criteria andTable_scansNotEqualTo(BigDecimal value) {
            addCriterion("table_scans <>", value, "table_scans");
            return (Criteria) this;
        }

        public Criteria andTable_scansGreaterThan(BigDecimal value) {
            addCriterion("table_scans >", value, "table_scans");
            return (Criteria) this;
        }

        public Criteria andTable_scansGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("table_scans >=", value, "table_scans");
            return (Criteria) this;
        }

        public Criteria andTable_scansLessThan(BigDecimal value) {
            addCriterion("table_scans <", value, "table_scans");
            return (Criteria) this;
        }

        public Criteria andTable_scansLessThanOrEqualTo(BigDecimal value) {
            addCriterion("table_scans <=", value, "table_scans");
            return (Criteria) this;
        }

        public Criteria andTable_scansIn(List<BigDecimal> values) {
            addCriterion("table_scans in", values, "table_scans");
            return (Criteria) this;
        }

        public Criteria andTable_scansNotIn(List<BigDecimal> values) {
            addCriterion("table_scans not in", values, "table_scans");
            return (Criteria) this;
        }

        public Criteria andTable_scansBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("table_scans between", value1, value2, "table_scans");
            return (Criteria) this;
        }

        public Criteria andTable_scansNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("table_scans not between", value1, value2, "table_scans");
            return (Criteria) this;
        }

        public Criteria andFile_iosIsNull() {
            addCriterion("file_ios is null");
            return (Criteria) this;
        }

        public Criteria andFile_iosIsNotNull() {
            addCriterion("file_ios is not null");
            return (Criteria) this;
        }

        public Criteria andFile_iosEqualTo(BigDecimal value) {
            addCriterion("file_ios =", value, "file_ios");
            return (Criteria) this;
        }

        public Criteria andFile_iosNotEqualTo(BigDecimal value) {
            addCriterion("file_ios <>", value, "file_ios");
            return (Criteria) this;
        }

        public Criteria andFile_iosGreaterThan(BigDecimal value) {
            addCriterion("file_ios >", value, "file_ios");
            return (Criteria) this;
        }

        public Criteria andFile_iosGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("file_ios >=", value, "file_ios");
            return (Criteria) this;
        }

        public Criteria andFile_iosLessThan(BigDecimal value) {
            addCriterion("file_ios <", value, "file_ios");
            return (Criteria) this;
        }

        public Criteria andFile_iosLessThanOrEqualTo(BigDecimal value) {
            addCriterion("file_ios <=", value, "file_ios");
            return (Criteria) this;
        }

        public Criteria andFile_iosIn(List<BigDecimal> values) {
            addCriterion("file_ios in", values, "file_ios");
            return (Criteria) this;
        }

        public Criteria andFile_iosNotIn(List<BigDecimal> values) {
            addCriterion("file_ios not in", values, "file_ios");
            return (Criteria) this;
        }

        public Criteria andFile_iosBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("file_ios between", value1, value2, "file_ios");
            return (Criteria) this;
        }

        public Criteria andFile_iosNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("file_ios not between", value1, value2, "file_ios");
            return (Criteria) this;
        }

        public Criteria andCurrent_connectionsIsNull() {
            addCriterion("current_connections is null");
            return (Criteria) this;
        }

        public Criteria andCurrent_connectionsIsNotNull() {
            addCriterion("current_connections is not null");
            return (Criteria) this;
        }

        public Criteria andCurrent_connectionsEqualTo(BigDecimal value) {
            addCriterion("current_connections =", value, "current_connections");
            return (Criteria) this;
        }

        public Criteria andCurrent_connectionsNotEqualTo(BigDecimal value) {
            addCriterion("current_connections <>", value, "current_connections");
            return (Criteria) this;
        }

        public Criteria andCurrent_connectionsGreaterThan(BigDecimal value) {
            addCriterion("current_connections >", value, "current_connections");
            return (Criteria) this;
        }

        public Criteria andCurrent_connectionsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_connections >=", value, "current_connections");
            return (Criteria) this;
        }

        public Criteria andCurrent_connectionsLessThan(BigDecimal value) {
            addCriterion("current_connections <", value, "current_connections");
            return (Criteria) this;
        }

        public Criteria andCurrent_connectionsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_connections <=", value, "current_connections");
            return (Criteria) this;
        }

        public Criteria andCurrent_connectionsIn(List<BigDecimal> values) {
            addCriterion("current_connections in", values, "current_connections");
            return (Criteria) this;
        }

        public Criteria andCurrent_connectionsNotIn(List<BigDecimal> values) {
            addCriterion("current_connections not in", values, "current_connections");
            return (Criteria) this;
        }

        public Criteria andCurrent_connectionsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_connections between", value1, value2, "current_connections");
            return (Criteria) this;
        }

        public Criteria andCurrent_connectionsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_connections not between", value1, value2, "current_connections");
            return (Criteria) this;
        }

        public Criteria andTotal_connectionsIsNull() {
            addCriterion("total_connections is null");
            return (Criteria) this;
        }

        public Criteria andTotal_connectionsIsNotNull() {
            addCriterion("total_connections is not null");
            return (Criteria) this;
        }

        public Criteria andTotal_connectionsEqualTo(BigDecimal value) {
            addCriterion("total_connections =", value, "total_connections");
            return (Criteria) this;
        }

        public Criteria andTotal_connectionsNotEqualTo(BigDecimal value) {
            addCriterion("total_connections <>", value, "total_connections");
            return (Criteria) this;
        }

        public Criteria andTotal_connectionsGreaterThan(BigDecimal value) {
            addCriterion("total_connections >", value, "total_connections");
            return (Criteria) this;
        }

        public Criteria andTotal_connectionsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_connections >=", value, "total_connections");
            return (Criteria) this;
        }

        public Criteria andTotal_connectionsLessThan(BigDecimal value) {
            addCriterion("total_connections <", value, "total_connections");
            return (Criteria) this;
        }

        public Criteria andTotal_connectionsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_connections <=", value, "total_connections");
            return (Criteria) this;
        }

        public Criteria andTotal_connectionsIn(List<BigDecimal> values) {
            addCriterion("total_connections in", values, "total_connections");
            return (Criteria) this;
        }

        public Criteria andTotal_connectionsNotIn(List<BigDecimal> values) {
            addCriterion("total_connections not in", values, "total_connections");
            return (Criteria) this;
        }

        public Criteria andTotal_connectionsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_connections between", value1, value2, "total_connections");
            return (Criteria) this;
        }

        public Criteria andTotal_connectionsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_connections not between", value1, value2, "total_connections");
            return (Criteria) this;
        }

        public Criteria andUnique_usersIsNull() {
            addCriterion("unique_users is null");
            return (Criteria) this;
        }

        public Criteria andUnique_usersIsNotNull() {
            addCriterion("unique_users is not null");
            return (Criteria) this;
        }

        public Criteria andUnique_usersEqualTo(Long value) {
            addCriterion("unique_users =", value, "unique_users");
            return (Criteria) this;
        }

        public Criteria andUnique_usersNotEqualTo(Long value) {
            addCriterion("unique_users <>", value, "unique_users");
            return (Criteria) this;
        }

        public Criteria andUnique_usersGreaterThan(Long value) {
            addCriterion("unique_users >", value, "unique_users");
            return (Criteria) this;
        }

        public Criteria andUnique_usersGreaterThanOrEqualTo(Long value) {
            addCriterion("unique_users >=", value, "unique_users");
            return (Criteria) this;
        }

        public Criteria andUnique_usersLessThan(Long value) {
            addCriterion("unique_users <", value, "unique_users");
            return (Criteria) this;
        }

        public Criteria andUnique_usersLessThanOrEqualTo(Long value) {
            addCriterion("unique_users <=", value, "unique_users");
            return (Criteria) this;
        }

        public Criteria andUnique_usersIn(List<Long> values) {
            addCriterion("unique_users in", values, "unique_users");
            return (Criteria) this;
        }

        public Criteria andUnique_usersNotIn(List<Long> values) {
            addCriterion("unique_users not in", values, "unique_users");
            return (Criteria) this;
        }

        public Criteria andUnique_usersBetween(Long value1, Long value2) {
            addCriterion("unique_users between", value1, value2, "unique_users");
            return (Criteria) this;
        }

        public Criteria andUnique_usersNotBetween(Long value1, Long value2) {
            addCriterion("unique_users not between", value1, value2, "unique_users");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table host_summary
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
     * This class corresponds to the database table host_summary
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