package com.entity;

import java.util.ArrayList;
import java.util.List;

public class IoGlobalByFileByLatencyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table io_global_by_file_by_latency
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table io_global_by_file_by_latency
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table io_global_by_file_by_latency
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table io_global_by_file_by_latency
     *
     * @mbg.generated
     */
    public IoGlobalByFileByLatencyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table io_global_by_file_by_latency
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table io_global_by_file_by_latency
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table io_global_by_file_by_latency
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table io_global_by_file_by_latency
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table io_global_by_file_by_latency
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table io_global_by_file_by_latency
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table io_global_by_file_by_latency
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
     * This method corresponds to the database table io_global_by_file_by_latency
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
     * This method corresponds to the database table io_global_by_file_by_latency
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table io_global_by_file_by_latency
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
     * This class corresponds to the database table io_global_by_file_by_latency
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

        public Criteria andFileIsNull() {
            addCriterion("file is null");
            return (Criteria) this;
        }

        public Criteria andFileIsNotNull() {
            addCriterion("file is not null");
            return (Criteria) this;
        }

        public Criteria andFileEqualTo(String value) {
            addCriterion("file =", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotEqualTo(String value) {
            addCriterion("file <>", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileGreaterThan(String value) {
            addCriterion("file >", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileGreaterThanOrEqualTo(String value) {
            addCriterion("file >=", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileLessThan(String value) {
            addCriterion("file <", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileLessThanOrEqualTo(String value) {
            addCriterion("file <=", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileLike(String value) {
            addCriterion("file like", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotLike(String value) {
            addCriterion("file not like", value, "file");
            return (Criteria) this;
        }

        public Criteria andFileIn(List<String> values) {
            addCriterion("file in", values, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotIn(List<String> values) {
            addCriterion("file not in", values, "file");
            return (Criteria) this;
        }

        public Criteria andFileBetween(String value1, String value2) {
            addCriterion("file between", value1, value2, "file");
            return (Criteria) this;
        }

        public Criteria andFileNotBetween(String value1, String value2) {
            addCriterion("file not between", value1, value2, "file");
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

        public Criteria andCount_readIsNull() {
            addCriterion("count_read is null");
            return (Criteria) this;
        }

        public Criteria andCount_readIsNotNull() {
            addCriterion("count_read is not null");
            return (Criteria) this;
        }

        public Criteria andCount_readEqualTo(Long value) {
            addCriterion("count_read =", value, "count_read");
            return (Criteria) this;
        }

        public Criteria andCount_readNotEqualTo(Long value) {
            addCriterion("count_read <>", value, "count_read");
            return (Criteria) this;
        }

        public Criteria andCount_readGreaterThan(Long value) {
            addCriterion("count_read >", value, "count_read");
            return (Criteria) this;
        }

        public Criteria andCount_readGreaterThanOrEqualTo(Long value) {
            addCriterion("count_read >=", value, "count_read");
            return (Criteria) this;
        }

        public Criteria andCount_readLessThan(Long value) {
            addCriterion("count_read <", value, "count_read");
            return (Criteria) this;
        }

        public Criteria andCount_readLessThanOrEqualTo(Long value) {
            addCriterion("count_read <=", value, "count_read");
            return (Criteria) this;
        }

        public Criteria andCount_readIn(List<Long> values) {
            addCriterion("count_read in", values, "count_read");
            return (Criteria) this;
        }

        public Criteria andCount_readNotIn(List<Long> values) {
            addCriterion("count_read not in", values, "count_read");
            return (Criteria) this;
        }

        public Criteria andCount_readBetween(Long value1, Long value2) {
            addCriterion("count_read between", value1, value2, "count_read");
            return (Criteria) this;
        }

        public Criteria andCount_readNotBetween(Long value1, Long value2) {
            addCriterion("count_read not between", value1, value2, "count_read");
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

        public Criteria andCount_writeEqualTo(Long value) {
            addCriterion("count_write =", value, "count_write");
            return (Criteria) this;
        }

        public Criteria andCount_writeNotEqualTo(Long value) {
            addCriterion("count_write <>", value, "count_write");
            return (Criteria) this;
        }

        public Criteria andCount_writeGreaterThan(Long value) {
            addCriterion("count_write >", value, "count_write");
            return (Criteria) this;
        }

        public Criteria andCount_writeGreaterThanOrEqualTo(Long value) {
            addCriterion("count_write >=", value, "count_write");
            return (Criteria) this;
        }

        public Criteria andCount_writeLessThan(Long value) {
            addCriterion("count_write <", value, "count_write");
            return (Criteria) this;
        }

        public Criteria andCount_writeLessThanOrEqualTo(Long value) {
            addCriterion("count_write <=", value, "count_write");
            return (Criteria) this;
        }

        public Criteria andCount_writeIn(List<Long> values) {
            addCriterion("count_write in", values, "count_write");
            return (Criteria) this;
        }

        public Criteria andCount_writeNotIn(List<Long> values) {
            addCriterion("count_write not in", values, "count_write");
            return (Criteria) this;
        }

        public Criteria andCount_writeBetween(Long value1, Long value2) {
            addCriterion("count_write between", value1, value2, "count_write");
            return (Criteria) this;
        }

        public Criteria andCount_writeNotBetween(Long value1, Long value2) {
            addCriterion("count_write not between", value1, value2, "count_write");
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

        public Criteria andCount_miscEqualTo(Long value) {
            addCriterion("count_misc =", value, "count_misc");
            return (Criteria) this;
        }

        public Criteria andCount_miscNotEqualTo(Long value) {
            addCriterion("count_misc <>", value, "count_misc");
            return (Criteria) this;
        }

        public Criteria andCount_miscGreaterThan(Long value) {
            addCriterion("count_misc >", value, "count_misc");
            return (Criteria) this;
        }

        public Criteria andCount_miscGreaterThanOrEqualTo(Long value) {
            addCriterion("count_misc >=", value, "count_misc");
            return (Criteria) this;
        }

        public Criteria andCount_miscLessThan(Long value) {
            addCriterion("count_misc <", value, "count_misc");
            return (Criteria) this;
        }

        public Criteria andCount_miscLessThanOrEqualTo(Long value) {
            addCriterion("count_misc <=", value, "count_misc");
            return (Criteria) this;
        }

        public Criteria andCount_miscIn(List<Long> values) {
            addCriterion("count_misc in", values, "count_misc");
            return (Criteria) this;
        }

        public Criteria andCount_miscNotIn(List<Long> values) {
            addCriterion("count_misc not in", values, "count_misc");
            return (Criteria) this;
        }

        public Criteria andCount_miscBetween(Long value1, Long value2) {
            addCriterion("count_misc between", value1, value2, "count_misc");
            return (Criteria) this;
        }

        public Criteria andCount_miscNotBetween(Long value1, Long value2) {
            addCriterion("count_misc not between", value1, value2, "count_misc");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table io_global_by_file_by_latency
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
     * This class corresponds to the database table io_global_by_file_by_latency
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