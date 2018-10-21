package com.entity;

import java.util.ArrayList;
import java.util.List;

public class InnodbCmpResetExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INNODB_CMP_RESET
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INNODB_CMP_RESET
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INNODB_CMP_RESET
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP_RESET
     *
     * @mbg.generated
     */
    public InnodbCmpResetExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP_RESET
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP_RESET
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP_RESET
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP_RESET
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP_RESET
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP_RESET
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP_RESET
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
     * This method corresponds to the database table INNODB_CMP_RESET
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
     * This method corresponds to the database table INNODB_CMP_RESET
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP_RESET
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
     * This class corresponds to the database table INNODB_CMP_RESET
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

        public Criteria andPage_sizeIsNull() {
            addCriterion("page_size is null");
            return (Criteria) this;
        }

        public Criteria andPage_sizeIsNotNull() {
            addCriterion("page_size is not null");
            return (Criteria) this;
        }

        public Criteria andPage_sizeEqualTo(Integer value) {
            addCriterion("page_size =", value, "page_size");
            return (Criteria) this;
        }

        public Criteria andPage_sizeNotEqualTo(Integer value) {
            addCriterion("page_size <>", value, "page_size");
            return (Criteria) this;
        }

        public Criteria andPage_sizeGreaterThan(Integer value) {
            addCriterion("page_size >", value, "page_size");
            return (Criteria) this;
        }

        public Criteria andPage_sizeGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_size >=", value, "page_size");
            return (Criteria) this;
        }

        public Criteria andPage_sizeLessThan(Integer value) {
            addCriterion("page_size <", value, "page_size");
            return (Criteria) this;
        }

        public Criteria andPage_sizeLessThanOrEqualTo(Integer value) {
            addCriterion("page_size <=", value, "page_size");
            return (Criteria) this;
        }

        public Criteria andPage_sizeIn(List<Integer> values) {
            addCriterion("page_size in", values, "page_size");
            return (Criteria) this;
        }

        public Criteria andPage_sizeNotIn(List<Integer> values) {
            addCriterion("page_size not in", values, "page_size");
            return (Criteria) this;
        }

        public Criteria andPage_sizeBetween(Integer value1, Integer value2) {
            addCriterion("page_size between", value1, value2, "page_size");
            return (Criteria) this;
        }

        public Criteria andPage_sizeNotBetween(Integer value1, Integer value2) {
            addCriterion("page_size not between", value1, value2, "page_size");
            return (Criteria) this;
        }

        public Criteria andCompress_opsIsNull() {
            addCriterion("compress_ops is null");
            return (Criteria) this;
        }

        public Criteria andCompress_opsIsNotNull() {
            addCriterion("compress_ops is not null");
            return (Criteria) this;
        }

        public Criteria andCompress_opsEqualTo(Integer value) {
            addCriterion("compress_ops =", value, "compress_ops");
            return (Criteria) this;
        }

        public Criteria andCompress_opsNotEqualTo(Integer value) {
            addCriterion("compress_ops <>", value, "compress_ops");
            return (Criteria) this;
        }

        public Criteria andCompress_opsGreaterThan(Integer value) {
            addCriterion("compress_ops >", value, "compress_ops");
            return (Criteria) this;
        }

        public Criteria andCompress_opsGreaterThanOrEqualTo(Integer value) {
            addCriterion("compress_ops >=", value, "compress_ops");
            return (Criteria) this;
        }

        public Criteria andCompress_opsLessThan(Integer value) {
            addCriterion("compress_ops <", value, "compress_ops");
            return (Criteria) this;
        }

        public Criteria andCompress_opsLessThanOrEqualTo(Integer value) {
            addCriterion("compress_ops <=", value, "compress_ops");
            return (Criteria) this;
        }

        public Criteria andCompress_opsIn(List<Integer> values) {
            addCriterion("compress_ops in", values, "compress_ops");
            return (Criteria) this;
        }

        public Criteria andCompress_opsNotIn(List<Integer> values) {
            addCriterion("compress_ops not in", values, "compress_ops");
            return (Criteria) this;
        }

        public Criteria andCompress_opsBetween(Integer value1, Integer value2) {
            addCriterion("compress_ops between", value1, value2, "compress_ops");
            return (Criteria) this;
        }

        public Criteria andCompress_opsNotBetween(Integer value1, Integer value2) {
            addCriterion("compress_ops not between", value1, value2, "compress_ops");
            return (Criteria) this;
        }

        public Criteria andCompress_ops_okIsNull() {
            addCriterion("compress_ops_ok is null");
            return (Criteria) this;
        }

        public Criteria andCompress_ops_okIsNotNull() {
            addCriterion("compress_ops_ok is not null");
            return (Criteria) this;
        }

        public Criteria andCompress_ops_okEqualTo(Integer value) {
            addCriterion("compress_ops_ok =", value, "compress_ops_ok");
            return (Criteria) this;
        }

        public Criteria andCompress_ops_okNotEqualTo(Integer value) {
            addCriterion("compress_ops_ok <>", value, "compress_ops_ok");
            return (Criteria) this;
        }

        public Criteria andCompress_ops_okGreaterThan(Integer value) {
            addCriterion("compress_ops_ok >", value, "compress_ops_ok");
            return (Criteria) this;
        }

        public Criteria andCompress_ops_okGreaterThanOrEqualTo(Integer value) {
            addCriterion("compress_ops_ok >=", value, "compress_ops_ok");
            return (Criteria) this;
        }

        public Criteria andCompress_ops_okLessThan(Integer value) {
            addCriterion("compress_ops_ok <", value, "compress_ops_ok");
            return (Criteria) this;
        }

        public Criteria andCompress_ops_okLessThanOrEqualTo(Integer value) {
            addCriterion("compress_ops_ok <=", value, "compress_ops_ok");
            return (Criteria) this;
        }

        public Criteria andCompress_ops_okIn(List<Integer> values) {
            addCriterion("compress_ops_ok in", values, "compress_ops_ok");
            return (Criteria) this;
        }

        public Criteria andCompress_ops_okNotIn(List<Integer> values) {
            addCriterion("compress_ops_ok not in", values, "compress_ops_ok");
            return (Criteria) this;
        }

        public Criteria andCompress_ops_okBetween(Integer value1, Integer value2) {
            addCriterion("compress_ops_ok between", value1, value2, "compress_ops_ok");
            return (Criteria) this;
        }

        public Criteria andCompress_ops_okNotBetween(Integer value1, Integer value2) {
            addCriterion("compress_ops_ok not between", value1, value2, "compress_ops_ok");
            return (Criteria) this;
        }

        public Criteria andCompress_timeIsNull() {
            addCriterion("compress_time is null");
            return (Criteria) this;
        }

        public Criteria andCompress_timeIsNotNull() {
            addCriterion("compress_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompress_timeEqualTo(Integer value) {
            addCriterion("compress_time =", value, "compress_time");
            return (Criteria) this;
        }

        public Criteria andCompress_timeNotEqualTo(Integer value) {
            addCriterion("compress_time <>", value, "compress_time");
            return (Criteria) this;
        }

        public Criteria andCompress_timeGreaterThan(Integer value) {
            addCriterion("compress_time >", value, "compress_time");
            return (Criteria) this;
        }

        public Criteria andCompress_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("compress_time >=", value, "compress_time");
            return (Criteria) this;
        }

        public Criteria andCompress_timeLessThan(Integer value) {
            addCriterion("compress_time <", value, "compress_time");
            return (Criteria) this;
        }

        public Criteria andCompress_timeLessThanOrEqualTo(Integer value) {
            addCriterion("compress_time <=", value, "compress_time");
            return (Criteria) this;
        }

        public Criteria andCompress_timeIn(List<Integer> values) {
            addCriterion("compress_time in", values, "compress_time");
            return (Criteria) this;
        }

        public Criteria andCompress_timeNotIn(List<Integer> values) {
            addCriterion("compress_time not in", values, "compress_time");
            return (Criteria) this;
        }

        public Criteria andCompress_timeBetween(Integer value1, Integer value2) {
            addCriterion("compress_time between", value1, value2, "compress_time");
            return (Criteria) this;
        }

        public Criteria andCompress_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("compress_time not between", value1, value2, "compress_time");
            return (Criteria) this;
        }

        public Criteria andUncompress_opsIsNull() {
            addCriterion("uncompress_ops is null");
            return (Criteria) this;
        }

        public Criteria andUncompress_opsIsNotNull() {
            addCriterion("uncompress_ops is not null");
            return (Criteria) this;
        }

        public Criteria andUncompress_opsEqualTo(Integer value) {
            addCriterion("uncompress_ops =", value, "uncompress_ops");
            return (Criteria) this;
        }

        public Criteria andUncompress_opsNotEqualTo(Integer value) {
            addCriterion("uncompress_ops <>", value, "uncompress_ops");
            return (Criteria) this;
        }

        public Criteria andUncompress_opsGreaterThan(Integer value) {
            addCriterion("uncompress_ops >", value, "uncompress_ops");
            return (Criteria) this;
        }

        public Criteria andUncompress_opsGreaterThanOrEqualTo(Integer value) {
            addCriterion("uncompress_ops >=", value, "uncompress_ops");
            return (Criteria) this;
        }

        public Criteria andUncompress_opsLessThan(Integer value) {
            addCriterion("uncompress_ops <", value, "uncompress_ops");
            return (Criteria) this;
        }

        public Criteria andUncompress_opsLessThanOrEqualTo(Integer value) {
            addCriterion("uncompress_ops <=", value, "uncompress_ops");
            return (Criteria) this;
        }

        public Criteria andUncompress_opsIn(List<Integer> values) {
            addCriterion("uncompress_ops in", values, "uncompress_ops");
            return (Criteria) this;
        }

        public Criteria andUncompress_opsNotIn(List<Integer> values) {
            addCriterion("uncompress_ops not in", values, "uncompress_ops");
            return (Criteria) this;
        }

        public Criteria andUncompress_opsBetween(Integer value1, Integer value2) {
            addCriterion("uncompress_ops between", value1, value2, "uncompress_ops");
            return (Criteria) this;
        }

        public Criteria andUncompress_opsNotBetween(Integer value1, Integer value2) {
            addCriterion("uncompress_ops not between", value1, value2, "uncompress_ops");
            return (Criteria) this;
        }

        public Criteria andUncompress_timeIsNull() {
            addCriterion("uncompress_time is null");
            return (Criteria) this;
        }

        public Criteria andUncompress_timeIsNotNull() {
            addCriterion("uncompress_time is not null");
            return (Criteria) this;
        }

        public Criteria andUncompress_timeEqualTo(Integer value) {
            addCriterion("uncompress_time =", value, "uncompress_time");
            return (Criteria) this;
        }

        public Criteria andUncompress_timeNotEqualTo(Integer value) {
            addCriterion("uncompress_time <>", value, "uncompress_time");
            return (Criteria) this;
        }

        public Criteria andUncompress_timeGreaterThan(Integer value) {
            addCriterion("uncompress_time >", value, "uncompress_time");
            return (Criteria) this;
        }

        public Criteria andUncompress_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("uncompress_time >=", value, "uncompress_time");
            return (Criteria) this;
        }

        public Criteria andUncompress_timeLessThan(Integer value) {
            addCriterion("uncompress_time <", value, "uncompress_time");
            return (Criteria) this;
        }

        public Criteria andUncompress_timeLessThanOrEqualTo(Integer value) {
            addCriterion("uncompress_time <=", value, "uncompress_time");
            return (Criteria) this;
        }

        public Criteria andUncompress_timeIn(List<Integer> values) {
            addCriterion("uncompress_time in", values, "uncompress_time");
            return (Criteria) this;
        }

        public Criteria andUncompress_timeNotIn(List<Integer> values) {
            addCriterion("uncompress_time not in", values, "uncompress_time");
            return (Criteria) this;
        }

        public Criteria andUncompress_timeBetween(Integer value1, Integer value2) {
            addCriterion("uncompress_time between", value1, value2, "uncompress_time");
            return (Criteria) this;
        }

        public Criteria andUncompress_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("uncompress_time not between", value1, value2, "uncompress_time");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table INNODB_CMP_RESET
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
     * This class corresponds to the database table INNODB_CMP_RESET
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