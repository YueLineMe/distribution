package com.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class XMemoryByHostByCurrentBytesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table x$memory_by_host_by_current_bytes
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table x$memory_by_host_by_current_bytes
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table x$memory_by_host_by_current_bytes
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_host_by_current_bytes
     *
     * @mbg.generated
     */
    public XMemoryByHostByCurrentBytesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_host_by_current_bytes
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_host_by_current_bytes
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_host_by_current_bytes
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_host_by_current_bytes
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_host_by_current_bytes
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_host_by_current_bytes
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_host_by_current_bytes
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
     * This method corresponds to the database table x$memory_by_host_by_current_bytes
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
     * This method corresponds to the database table x$memory_by_host_by_current_bytes
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_by_host_by_current_bytes
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
     * This class corresponds to the database table x$memory_by_host_by_current_bytes
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

        public Criteria andCurrent_count_usedIsNull() {
            addCriterion("current_count_used is null");
            return (Criteria) this;
        }

        public Criteria andCurrent_count_usedIsNotNull() {
            addCriterion("current_count_used is not null");
            return (Criteria) this;
        }

        public Criteria andCurrent_count_usedEqualTo(BigDecimal value) {
            addCriterion("current_count_used =", value, "current_count_used");
            return (Criteria) this;
        }

        public Criteria andCurrent_count_usedNotEqualTo(BigDecimal value) {
            addCriterion("current_count_used <>", value, "current_count_used");
            return (Criteria) this;
        }

        public Criteria andCurrent_count_usedGreaterThan(BigDecimal value) {
            addCriterion("current_count_used >", value, "current_count_used");
            return (Criteria) this;
        }

        public Criteria andCurrent_count_usedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_count_used >=", value, "current_count_used");
            return (Criteria) this;
        }

        public Criteria andCurrent_count_usedLessThan(BigDecimal value) {
            addCriterion("current_count_used <", value, "current_count_used");
            return (Criteria) this;
        }

        public Criteria andCurrent_count_usedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_count_used <=", value, "current_count_used");
            return (Criteria) this;
        }

        public Criteria andCurrent_count_usedIn(List<BigDecimal> values) {
            addCriterion("current_count_used in", values, "current_count_used");
            return (Criteria) this;
        }

        public Criteria andCurrent_count_usedNotIn(List<BigDecimal> values) {
            addCriterion("current_count_used not in", values, "current_count_used");
            return (Criteria) this;
        }

        public Criteria andCurrent_count_usedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_count_used between", value1, value2, "current_count_used");
            return (Criteria) this;
        }

        public Criteria andCurrent_count_usedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_count_used not between", value1, value2, "current_count_used");
            return (Criteria) this;
        }

        public Criteria andCurrent_allocatedIsNull() {
            addCriterion("current_allocated is null");
            return (Criteria) this;
        }

        public Criteria andCurrent_allocatedIsNotNull() {
            addCriterion("current_allocated is not null");
            return (Criteria) this;
        }

        public Criteria andCurrent_allocatedEqualTo(BigDecimal value) {
            addCriterion("current_allocated =", value, "current_allocated");
            return (Criteria) this;
        }

        public Criteria andCurrent_allocatedNotEqualTo(BigDecimal value) {
            addCriterion("current_allocated <>", value, "current_allocated");
            return (Criteria) this;
        }

        public Criteria andCurrent_allocatedGreaterThan(BigDecimal value) {
            addCriterion("current_allocated >", value, "current_allocated");
            return (Criteria) this;
        }

        public Criteria andCurrent_allocatedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_allocated >=", value, "current_allocated");
            return (Criteria) this;
        }

        public Criteria andCurrent_allocatedLessThan(BigDecimal value) {
            addCriterion("current_allocated <", value, "current_allocated");
            return (Criteria) this;
        }

        public Criteria andCurrent_allocatedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_allocated <=", value, "current_allocated");
            return (Criteria) this;
        }

        public Criteria andCurrent_allocatedIn(List<BigDecimal> values) {
            addCriterion("current_allocated in", values, "current_allocated");
            return (Criteria) this;
        }

        public Criteria andCurrent_allocatedNotIn(List<BigDecimal> values) {
            addCriterion("current_allocated not in", values, "current_allocated");
            return (Criteria) this;
        }

        public Criteria andCurrent_allocatedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_allocated between", value1, value2, "current_allocated");
            return (Criteria) this;
        }

        public Criteria andCurrent_allocatedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_allocated not between", value1, value2, "current_allocated");
            return (Criteria) this;
        }

        public Criteria andCurrent_avg_allocIsNull() {
            addCriterion("current_avg_alloc is null");
            return (Criteria) this;
        }

        public Criteria andCurrent_avg_allocIsNotNull() {
            addCriterion("current_avg_alloc is not null");
            return (Criteria) this;
        }

        public Criteria andCurrent_avg_allocEqualTo(BigDecimal value) {
            addCriterion("current_avg_alloc =", value, "current_avg_alloc");
            return (Criteria) this;
        }

        public Criteria andCurrent_avg_allocNotEqualTo(BigDecimal value) {
            addCriterion("current_avg_alloc <>", value, "current_avg_alloc");
            return (Criteria) this;
        }

        public Criteria andCurrent_avg_allocGreaterThan(BigDecimal value) {
            addCriterion("current_avg_alloc >", value, "current_avg_alloc");
            return (Criteria) this;
        }

        public Criteria andCurrent_avg_allocGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("current_avg_alloc >=", value, "current_avg_alloc");
            return (Criteria) this;
        }

        public Criteria andCurrent_avg_allocLessThan(BigDecimal value) {
            addCriterion("current_avg_alloc <", value, "current_avg_alloc");
            return (Criteria) this;
        }

        public Criteria andCurrent_avg_allocLessThanOrEqualTo(BigDecimal value) {
            addCriterion("current_avg_alloc <=", value, "current_avg_alloc");
            return (Criteria) this;
        }

        public Criteria andCurrent_avg_allocIn(List<BigDecimal> values) {
            addCriterion("current_avg_alloc in", values, "current_avg_alloc");
            return (Criteria) this;
        }

        public Criteria andCurrent_avg_allocNotIn(List<BigDecimal> values) {
            addCriterion("current_avg_alloc not in", values, "current_avg_alloc");
            return (Criteria) this;
        }

        public Criteria andCurrent_avg_allocBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_avg_alloc between", value1, value2, "current_avg_alloc");
            return (Criteria) this;
        }

        public Criteria andCurrent_avg_allocNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("current_avg_alloc not between", value1, value2, "current_avg_alloc");
            return (Criteria) this;
        }

        public Criteria andCurrent_max_allocIsNull() {
            addCriterion("current_max_alloc is null");
            return (Criteria) this;
        }

        public Criteria andCurrent_max_allocIsNotNull() {
            addCriterion("current_max_alloc is not null");
            return (Criteria) this;
        }

        public Criteria andCurrent_max_allocEqualTo(Long value) {
            addCriterion("current_max_alloc =", value, "current_max_alloc");
            return (Criteria) this;
        }

        public Criteria andCurrent_max_allocNotEqualTo(Long value) {
            addCriterion("current_max_alloc <>", value, "current_max_alloc");
            return (Criteria) this;
        }

        public Criteria andCurrent_max_allocGreaterThan(Long value) {
            addCriterion("current_max_alloc >", value, "current_max_alloc");
            return (Criteria) this;
        }

        public Criteria andCurrent_max_allocGreaterThanOrEqualTo(Long value) {
            addCriterion("current_max_alloc >=", value, "current_max_alloc");
            return (Criteria) this;
        }

        public Criteria andCurrent_max_allocLessThan(Long value) {
            addCriterion("current_max_alloc <", value, "current_max_alloc");
            return (Criteria) this;
        }

        public Criteria andCurrent_max_allocLessThanOrEqualTo(Long value) {
            addCriterion("current_max_alloc <=", value, "current_max_alloc");
            return (Criteria) this;
        }

        public Criteria andCurrent_max_allocIn(List<Long> values) {
            addCriterion("current_max_alloc in", values, "current_max_alloc");
            return (Criteria) this;
        }

        public Criteria andCurrent_max_allocNotIn(List<Long> values) {
            addCriterion("current_max_alloc not in", values, "current_max_alloc");
            return (Criteria) this;
        }

        public Criteria andCurrent_max_allocBetween(Long value1, Long value2) {
            addCriterion("current_max_alloc between", value1, value2, "current_max_alloc");
            return (Criteria) this;
        }

        public Criteria andCurrent_max_allocNotBetween(Long value1, Long value2) {
            addCriterion("current_max_alloc not between", value1, value2, "current_max_alloc");
            return (Criteria) this;
        }

        public Criteria andTotal_allocatedIsNull() {
            addCriterion("total_allocated is null");
            return (Criteria) this;
        }

        public Criteria andTotal_allocatedIsNotNull() {
            addCriterion("total_allocated is not null");
            return (Criteria) this;
        }

        public Criteria andTotal_allocatedEqualTo(BigDecimal value) {
            addCriterion("total_allocated =", value, "total_allocated");
            return (Criteria) this;
        }

        public Criteria andTotal_allocatedNotEqualTo(BigDecimal value) {
            addCriterion("total_allocated <>", value, "total_allocated");
            return (Criteria) this;
        }

        public Criteria andTotal_allocatedGreaterThan(BigDecimal value) {
            addCriterion("total_allocated >", value, "total_allocated");
            return (Criteria) this;
        }

        public Criteria andTotal_allocatedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_allocated >=", value, "total_allocated");
            return (Criteria) this;
        }

        public Criteria andTotal_allocatedLessThan(BigDecimal value) {
            addCriterion("total_allocated <", value, "total_allocated");
            return (Criteria) this;
        }

        public Criteria andTotal_allocatedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_allocated <=", value, "total_allocated");
            return (Criteria) this;
        }

        public Criteria andTotal_allocatedIn(List<BigDecimal> values) {
            addCriterion("total_allocated in", values, "total_allocated");
            return (Criteria) this;
        }

        public Criteria andTotal_allocatedNotIn(List<BigDecimal> values) {
            addCriterion("total_allocated not in", values, "total_allocated");
            return (Criteria) this;
        }

        public Criteria andTotal_allocatedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_allocated between", value1, value2, "total_allocated");
            return (Criteria) this;
        }

        public Criteria andTotal_allocatedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_allocated not between", value1, value2, "total_allocated");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table x$memory_by_host_by_current_bytes
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
     * This class corresponds to the database table x$memory_by_host_by_current_bytes
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