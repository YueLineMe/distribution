package com.entity;

import java.util.ArrayList;
import java.util.List;

public class InnodbCmpmemResetExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INNODB_CMPMEM_RESET
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INNODB_CMPMEM_RESET
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INNODB_CMPMEM_RESET
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMPMEM_RESET
     *
     * @mbg.generated
     */
    public InnodbCmpmemResetExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMPMEM_RESET
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMPMEM_RESET
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMPMEM_RESET
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMPMEM_RESET
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMPMEM_RESET
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMPMEM_RESET
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMPMEM_RESET
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
     * This method corresponds to the database table INNODB_CMPMEM_RESET
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
     * This method corresponds to the database table INNODB_CMPMEM_RESET
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMPMEM_RESET
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
     * This class corresponds to the database table INNODB_CMPMEM_RESET
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

        public Criteria andBuffer_pool_instanceIsNull() {
            addCriterion("buffer_pool_instance is null");
            return (Criteria) this;
        }

        public Criteria andBuffer_pool_instanceIsNotNull() {
            addCriterion("buffer_pool_instance is not null");
            return (Criteria) this;
        }

        public Criteria andBuffer_pool_instanceEqualTo(Integer value) {
            addCriterion("buffer_pool_instance =", value, "buffer_pool_instance");
            return (Criteria) this;
        }

        public Criteria andBuffer_pool_instanceNotEqualTo(Integer value) {
            addCriterion("buffer_pool_instance <>", value, "buffer_pool_instance");
            return (Criteria) this;
        }

        public Criteria andBuffer_pool_instanceGreaterThan(Integer value) {
            addCriterion("buffer_pool_instance >", value, "buffer_pool_instance");
            return (Criteria) this;
        }

        public Criteria andBuffer_pool_instanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("buffer_pool_instance >=", value, "buffer_pool_instance");
            return (Criteria) this;
        }

        public Criteria andBuffer_pool_instanceLessThan(Integer value) {
            addCriterion("buffer_pool_instance <", value, "buffer_pool_instance");
            return (Criteria) this;
        }

        public Criteria andBuffer_pool_instanceLessThanOrEqualTo(Integer value) {
            addCriterion("buffer_pool_instance <=", value, "buffer_pool_instance");
            return (Criteria) this;
        }

        public Criteria andBuffer_pool_instanceIn(List<Integer> values) {
            addCriterion("buffer_pool_instance in", values, "buffer_pool_instance");
            return (Criteria) this;
        }

        public Criteria andBuffer_pool_instanceNotIn(List<Integer> values) {
            addCriterion("buffer_pool_instance not in", values, "buffer_pool_instance");
            return (Criteria) this;
        }

        public Criteria andBuffer_pool_instanceBetween(Integer value1, Integer value2) {
            addCriterion("buffer_pool_instance between", value1, value2, "buffer_pool_instance");
            return (Criteria) this;
        }

        public Criteria andBuffer_pool_instanceNotBetween(Integer value1, Integer value2) {
            addCriterion("buffer_pool_instance not between", value1, value2, "buffer_pool_instance");
            return (Criteria) this;
        }

        public Criteria andPages_usedIsNull() {
            addCriterion("pages_used is null");
            return (Criteria) this;
        }

        public Criteria andPages_usedIsNotNull() {
            addCriterion("pages_used is not null");
            return (Criteria) this;
        }

        public Criteria andPages_usedEqualTo(Integer value) {
            addCriterion("pages_used =", value, "pages_used");
            return (Criteria) this;
        }

        public Criteria andPages_usedNotEqualTo(Integer value) {
            addCriterion("pages_used <>", value, "pages_used");
            return (Criteria) this;
        }

        public Criteria andPages_usedGreaterThan(Integer value) {
            addCriterion("pages_used >", value, "pages_used");
            return (Criteria) this;
        }

        public Criteria andPages_usedGreaterThanOrEqualTo(Integer value) {
            addCriterion("pages_used >=", value, "pages_used");
            return (Criteria) this;
        }

        public Criteria andPages_usedLessThan(Integer value) {
            addCriterion("pages_used <", value, "pages_used");
            return (Criteria) this;
        }

        public Criteria andPages_usedLessThanOrEqualTo(Integer value) {
            addCriterion("pages_used <=", value, "pages_used");
            return (Criteria) this;
        }

        public Criteria andPages_usedIn(List<Integer> values) {
            addCriterion("pages_used in", values, "pages_used");
            return (Criteria) this;
        }

        public Criteria andPages_usedNotIn(List<Integer> values) {
            addCriterion("pages_used not in", values, "pages_used");
            return (Criteria) this;
        }

        public Criteria andPages_usedBetween(Integer value1, Integer value2) {
            addCriterion("pages_used between", value1, value2, "pages_used");
            return (Criteria) this;
        }

        public Criteria andPages_usedNotBetween(Integer value1, Integer value2) {
            addCriterion("pages_used not between", value1, value2, "pages_used");
            return (Criteria) this;
        }

        public Criteria andPages_freeIsNull() {
            addCriterion("pages_free is null");
            return (Criteria) this;
        }

        public Criteria andPages_freeIsNotNull() {
            addCriterion("pages_free is not null");
            return (Criteria) this;
        }

        public Criteria andPages_freeEqualTo(Integer value) {
            addCriterion("pages_free =", value, "pages_free");
            return (Criteria) this;
        }

        public Criteria andPages_freeNotEqualTo(Integer value) {
            addCriterion("pages_free <>", value, "pages_free");
            return (Criteria) this;
        }

        public Criteria andPages_freeGreaterThan(Integer value) {
            addCriterion("pages_free >", value, "pages_free");
            return (Criteria) this;
        }

        public Criteria andPages_freeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pages_free >=", value, "pages_free");
            return (Criteria) this;
        }

        public Criteria andPages_freeLessThan(Integer value) {
            addCriterion("pages_free <", value, "pages_free");
            return (Criteria) this;
        }

        public Criteria andPages_freeLessThanOrEqualTo(Integer value) {
            addCriterion("pages_free <=", value, "pages_free");
            return (Criteria) this;
        }

        public Criteria andPages_freeIn(List<Integer> values) {
            addCriterion("pages_free in", values, "pages_free");
            return (Criteria) this;
        }

        public Criteria andPages_freeNotIn(List<Integer> values) {
            addCriterion("pages_free not in", values, "pages_free");
            return (Criteria) this;
        }

        public Criteria andPages_freeBetween(Integer value1, Integer value2) {
            addCriterion("pages_free between", value1, value2, "pages_free");
            return (Criteria) this;
        }

        public Criteria andPages_freeNotBetween(Integer value1, Integer value2) {
            addCriterion("pages_free not between", value1, value2, "pages_free");
            return (Criteria) this;
        }

        public Criteria andRelocation_opsIsNull() {
            addCriterion("relocation_ops is null");
            return (Criteria) this;
        }

        public Criteria andRelocation_opsIsNotNull() {
            addCriterion("relocation_ops is not null");
            return (Criteria) this;
        }

        public Criteria andRelocation_opsEqualTo(Long value) {
            addCriterion("relocation_ops =", value, "relocation_ops");
            return (Criteria) this;
        }

        public Criteria andRelocation_opsNotEqualTo(Long value) {
            addCriterion("relocation_ops <>", value, "relocation_ops");
            return (Criteria) this;
        }

        public Criteria andRelocation_opsGreaterThan(Long value) {
            addCriterion("relocation_ops >", value, "relocation_ops");
            return (Criteria) this;
        }

        public Criteria andRelocation_opsGreaterThanOrEqualTo(Long value) {
            addCriterion("relocation_ops >=", value, "relocation_ops");
            return (Criteria) this;
        }

        public Criteria andRelocation_opsLessThan(Long value) {
            addCriterion("relocation_ops <", value, "relocation_ops");
            return (Criteria) this;
        }

        public Criteria andRelocation_opsLessThanOrEqualTo(Long value) {
            addCriterion("relocation_ops <=", value, "relocation_ops");
            return (Criteria) this;
        }

        public Criteria andRelocation_opsIn(List<Long> values) {
            addCriterion("relocation_ops in", values, "relocation_ops");
            return (Criteria) this;
        }

        public Criteria andRelocation_opsNotIn(List<Long> values) {
            addCriterion("relocation_ops not in", values, "relocation_ops");
            return (Criteria) this;
        }

        public Criteria andRelocation_opsBetween(Long value1, Long value2) {
            addCriterion("relocation_ops between", value1, value2, "relocation_ops");
            return (Criteria) this;
        }

        public Criteria andRelocation_opsNotBetween(Long value1, Long value2) {
            addCriterion("relocation_ops not between", value1, value2, "relocation_ops");
            return (Criteria) this;
        }

        public Criteria andRelocation_timeIsNull() {
            addCriterion("relocation_time is null");
            return (Criteria) this;
        }

        public Criteria andRelocation_timeIsNotNull() {
            addCriterion("relocation_time is not null");
            return (Criteria) this;
        }

        public Criteria andRelocation_timeEqualTo(Integer value) {
            addCriterion("relocation_time =", value, "relocation_time");
            return (Criteria) this;
        }

        public Criteria andRelocation_timeNotEqualTo(Integer value) {
            addCriterion("relocation_time <>", value, "relocation_time");
            return (Criteria) this;
        }

        public Criteria andRelocation_timeGreaterThan(Integer value) {
            addCriterion("relocation_time >", value, "relocation_time");
            return (Criteria) this;
        }

        public Criteria andRelocation_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("relocation_time >=", value, "relocation_time");
            return (Criteria) this;
        }

        public Criteria andRelocation_timeLessThan(Integer value) {
            addCriterion("relocation_time <", value, "relocation_time");
            return (Criteria) this;
        }

        public Criteria andRelocation_timeLessThanOrEqualTo(Integer value) {
            addCriterion("relocation_time <=", value, "relocation_time");
            return (Criteria) this;
        }

        public Criteria andRelocation_timeIn(List<Integer> values) {
            addCriterion("relocation_time in", values, "relocation_time");
            return (Criteria) this;
        }

        public Criteria andRelocation_timeNotIn(List<Integer> values) {
            addCriterion("relocation_time not in", values, "relocation_time");
            return (Criteria) this;
        }

        public Criteria andRelocation_timeBetween(Integer value1, Integer value2) {
            addCriterion("relocation_time between", value1, value2, "relocation_time");
            return (Criteria) this;
        }

        public Criteria andRelocation_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("relocation_time not between", value1, value2, "relocation_time");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table INNODB_CMPMEM_RESET
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
     * This class corresponds to the database table INNODB_CMPMEM_RESET
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