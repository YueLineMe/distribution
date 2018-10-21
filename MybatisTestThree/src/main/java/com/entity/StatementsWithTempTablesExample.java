package com.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StatementsWithTempTablesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table statements_with_temp_tables
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table statements_with_temp_tables
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table statements_with_temp_tables
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statements_with_temp_tables
     *
     * @mbg.generated
     */
    public StatementsWithTempTablesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statements_with_temp_tables
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statements_with_temp_tables
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statements_with_temp_tables
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statements_with_temp_tables
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statements_with_temp_tables
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statements_with_temp_tables
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statements_with_temp_tables
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
     * This method corresponds to the database table statements_with_temp_tables
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
     * This method corresponds to the database table statements_with_temp_tables
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statements_with_temp_tables
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
     * This class corresponds to the database table statements_with_temp_tables
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

        public Criteria andMemory_tmp_tablesIsNull() {
            addCriterion("memory_tmp_tables is null");
            return (Criteria) this;
        }

        public Criteria andMemory_tmp_tablesIsNotNull() {
            addCriterion("memory_tmp_tables is not null");
            return (Criteria) this;
        }

        public Criteria andMemory_tmp_tablesEqualTo(Long value) {
            addCriterion("memory_tmp_tables =", value, "memory_tmp_tables");
            return (Criteria) this;
        }

        public Criteria andMemory_tmp_tablesNotEqualTo(Long value) {
            addCriterion("memory_tmp_tables <>", value, "memory_tmp_tables");
            return (Criteria) this;
        }

        public Criteria andMemory_tmp_tablesGreaterThan(Long value) {
            addCriterion("memory_tmp_tables >", value, "memory_tmp_tables");
            return (Criteria) this;
        }

        public Criteria andMemory_tmp_tablesGreaterThanOrEqualTo(Long value) {
            addCriterion("memory_tmp_tables >=", value, "memory_tmp_tables");
            return (Criteria) this;
        }

        public Criteria andMemory_tmp_tablesLessThan(Long value) {
            addCriterion("memory_tmp_tables <", value, "memory_tmp_tables");
            return (Criteria) this;
        }

        public Criteria andMemory_tmp_tablesLessThanOrEqualTo(Long value) {
            addCriterion("memory_tmp_tables <=", value, "memory_tmp_tables");
            return (Criteria) this;
        }

        public Criteria andMemory_tmp_tablesIn(List<Long> values) {
            addCriterion("memory_tmp_tables in", values, "memory_tmp_tables");
            return (Criteria) this;
        }

        public Criteria andMemory_tmp_tablesNotIn(List<Long> values) {
            addCriterion("memory_tmp_tables not in", values, "memory_tmp_tables");
            return (Criteria) this;
        }

        public Criteria andMemory_tmp_tablesBetween(Long value1, Long value2) {
            addCriterion("memory_tmp_tables between", value1, value2, "memory_tmp_tables");
            return (Criteria) this;
        }

        public Criteria andMemory_tmp_tablesNotBetween(Long value1, Long value2) {
            addCriterion("memory_tmp_tables not between", value1, value2, "memory_tmp_tables");
            return (Criteria) this;
        }

        public Criteria andDisk_tmp_tablesIsNull() {
            addCriterion("disk_tmp_tables is null");
            return (Criteria) this;
        }

        public Criteria andDisk_tmp_tablesIsNotNull() {
            addCriterion("disk_tmp_tables is not null");
            return (Criteria) this;
        }

        public Criteria andDisk_tmp_tablesEqualTo(Long value) {
            addCriterion("disk_tmp_tables =", value, "disk_tmp_tables");
            return (Criteria) this;
        }

        public Criteria andDisk_tmp_tablesNotEqualTo(Long value) {
            addCriterion("disk_tmp_tables <>", value, "disk_tmp_tables");
            return (Criteria) this;
        }

        public Criteria andDisk_tmp_tablesGreaterThan(Long value) {
            addCriterion("disk_tmp_tables >", value, "disk_tmp_tables");
            return (Criteria) this;
        }

        public Criteria andDisk_tmp_tablesGreaterThanOrEqualTo(Long value) {
            addCriterion("disk_tmp_tables >=", value, "disk_tmp_tables");
            return (Criteria) this;
        }

        public Criteria andDisk_tmp_tablesLessThan(Long value) {
            addCriterion("disk_tmp_tables <", value, "disk_tmp_tables");
            return (Criteria) this;
        }

        public Criteria andDisk_tmp_tablesLessThanOrEqualTo(Long value) {
            addCriterion("disk_tmp_tables <=", value, "disk_tmp_tables");
            return (Criteria) this;
        }

        public Criteria andDisk_tmp_tablesIn(List<Long> values) {
            addCriterion("disk_tmp_tables in", values, "disk_tmp_tables");
            return (Criteria) this;
        }

        public Criteria andDisk_tmp_tablesNotIn(List<Long> values) {
            addCriterion("disk_tmp_tables not in", values, "disk_tmp_tables");
            return (Criteria) this;
        }

        public Criteria andDisk_tmp_tablesBetween(Long value1, Long value2) {
            addCriterion("disk_tmp_tables between", value1, value2, "disk_tmp_tables");
            return (Criteria) this;
        }

        public Criteria andDisk_tmp_tablesNotBetween(Long value1, Long value2) {
            addCriterion("disk_tmp_tables not between", value1, value2, "disk_tmp_tables");
            return (Criteria) this;
        }

        public Criteria andAvg_tmp_tables_per_queryIsNull() {
            addCriterion("avg_tmp_tables_per_query is null");
            return (Criteria) this;
        }

        public Criteria andAvg_tmp_tables_per_queryIsNotNull() {
            addCriterion("avg_tmp_tables_per_query is not null");
            return (Criteria) this;
        }

        public Criteria andAvg_tmp_tables_per_queryEqualTo(BigDecimal value) {
            addCriterion("avg_tmp_tables_per_query =", value, "avg_tmp_tables_per_query");
            return (Criteria) this;
        }

        public Criteria andAvg_tmp_tables_per_queryNotEqualTo(BigDecimal value) {
            addCriterion("avg_tmp_tables_per_query <>", value, "avg_tmp_tables_per_query");
            return (Criteria) this;
        }

        public Criteria andAvg_tmp_tables_per_queryGreaterThan(BigDecimal value) {
            addCriterion("avg_tmp_tables_per_query >", value, "avg_tmp_tables_per_query");
            return (Criteria) this;
        }

        public Criteria andAvg_tmp_tables_per_queryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_tmp_tables_per_query >=", value, "avg_tmp_tables_per_query");
            return (Criteria) this;
        }

        public Criteria andAvg_tmp_tables_per_queryLessThan(BigDecimal value) {
            addCriterion("avg_tmp_tables_per_query <", value, "avg_tmp_tables_per_query");
            return (Criteria) this;
        }

        public Criteria andAvg_tmp_tables_per_queryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("avg_tmp_tables_per_query <=", value, "avg_tmp_tables_per_query");
            return (Criteria) this;
        }

        public Criteria andAvg_tmp_tables_per_queryIn(List<BigDecimal> values) {
            addCriterion("avg_tmp_tables_per_query in", values, "avg_tmp_tables_per_query");
            return (Criteria) this;
        }

        public Criteria andAvg_tmp_tables_per_queryNotIn(List<BigDecimal> values) {
            addCriterion("avg_tmp_tables_per_query not in", values, "avg_tmp_tables_per_query");
            return (Criteria) this;
        }

        public Criteria andAvg_tmp_tables_per_queryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_tmp_tables_per_query between", value1, value2, "avg_tmp_tables_per_query");
            return (Criteria) this;
        }

        public Criteria andAvg_tmp_tables_per_queryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("avg_tmp_tables_per_query not between", value1, value2, "avg_tmp_tables_per_query");
            return (Criteria) this;
        }

        public Criteria andTmp_tables_to_disk_pctIsNull() {
            addCriterion("tmp_tables_to_disk_pct is null");
            return (Criteria) this;
        }

        public Criteria andTmp_tables_to_disk_pctIsNotNull() {
            addCriterion("tmp_tables_to_disk_pct is not null");
            return (Criteria) this;
        }

        public Criteria andTmp_tables_to_disk_pctEqualTo(BigDecimal value) {
            addCriterion("tmp_tables_to_disk_pct =", value, "tmp_tables_to_disk_pct");
            return (Criteria) this;
        }

        public Criteria andTmp_tables_to_disk_pctNotEqualTo(BigDecimal value) {
            addCriterion("tmp_tables_to_disk_pct <>", value, "tmp_tables_to_disk_pct");
            return (Criteria) this;
        }

        public Criteria andTmp_tables_to_disk_pctGreaterThan(BigDecimal value) {
            addCriterion("tmp_tables_to_disk_pct >", value, "tmp_tables_to_disk_pct");
            return (Criteria) this;
        }

        public Criteria andTmp_tables_to_disk_pctGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tmp_tables_to_disk_pct >=", value, "tmp_tables_to_disk_pct");
            return (Criteria) this;
        }

        public Criteria andTmp_tables_to_disk_pctLessThan(BigDecimal value) {
            addCriterion("tmp_tables_to_disk_pct <", value, "tmp_tables_to_disk_pct");
            return (Criteria) this;
        }

        public Criteria andTmp_tables_to_disk_pctLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tmp_tables_to_disk_pct <=", value, "tmp_tables_to_disk_pct");
            return (Criteria) this;
        }

        public Criteria andTmp_tables_to_disk_pctIn(List<BigDecimal> values) {
            addCriterion("tmp_tables_to_disk_pct in", values, "tmp_tables_to_disk_pct");
            return (Criteria) this;
        }

        public Criteria andTmp_tables_to_disk_pctNotIn(List<BigDecimal> values) {
            addCriterion("tmp_tables_to_disk_pct not in", values, "tmp_tables_to_disk_pct");
            return (Criteria) this;
        }

        public Criteria andTmp_tables_to_disk_pctBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tmp_tables_to_disk_pct between", value1, value2, "tmp_tables_to_disk_pct");
            return (Criteria) this;
        }

        public Criteria andTmp_tables_to_disk_pctNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tmp_tables_to_disk_pct not between", value1, value2, "tmp_tables_to_disk_pct");
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
     * This class corresponds to the database table statements_with_temp_tables
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
     * This class corresponds to the database table statements_with_temp_tables
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