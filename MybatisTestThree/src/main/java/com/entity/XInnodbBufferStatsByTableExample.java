package com.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class XInnodbBufferStatsByTableExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table x$innodb_buffer_stats_by_table
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table x$innodb_buffer_stats_by_table
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table x$innodb_buffer_stats_by_table
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$innodb_buffer_stats_by_table
     *
     * @mbg.generated
     */
    public XInnodbBufferStatsByTableExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$innodb_buffer_stats_by_table
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$innodb_buffer_stats_by_table
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$innodb_buffer_stats_by_table
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$innodb_buffer_stats_by_table
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$innodb_buffer_stats_by_table
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$innodb_buffer_stats_by_table
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$innodb_buffer_stats_by_table
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
     * This method corresponds to the database table x$innodb_buffer_stats_by_table
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
     * This method corresponds to the database table x$innodb_buffer_stats_by_table
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$innodb_buffer_stats_by_table
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
     * This class corresponds to the database table x$innodb_buffer_stats_by_table
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

        public Criteria andAllocatedIsNull() {
            addCriterion("allocated is null");
            return (Criteria) this;
        }

        public Criteria andAllocatedIsNotNull() {
            addCriterion("allocated is not null");
            return (Criteria) this;
        }

        public Criteria andAllocatedEqualTo(BigDecimal value) {
            addCriterion("allocated =", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedNotEqualTo(BigDecimal value) {
            addCriterion("allocated <>", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedGreaterThan(BigDecimal value) {
            addCriterion("allocated >", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("allocated >=", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedLessThan(BigDecimal value) {
            addCriterion("allocated <", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("allocated <=", value, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedIn(List<BigDecimal> values) {
            addCriterion("allocated in", values, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedNotIn(List<BigDecimal> values) {
            addCriterion("allocated not in", values, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("allocated between", value1, value2, "allocated");
            return (Criteria) this;
        }

        public Criteria andAllocatedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("allocated not between", value1, value2, "allocated");
            return (Criteria) this;
        }

        public Criteria andDataIsNull() {
            addCriterion("data is null");
            return (Criteria) this;
        }

        public Criteria andDataIsNotNull() {
            addCriterion("data is not null");
            return (Criteria) this;
        }

        public Criteria andDataEqualTo(BigDecimal value) {
            addCriterion("data =", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotEqualTo(BigDecimal value) {
            addCriterion("data <>", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThan(BigDecimal value) {
            addCriterion("data >", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("data >=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThan(BigDecimal value) {
            addCriterion("data <", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataLessThanOrEqualTo(BigDecimal value) {
            addCriterion("data <=", value, "data");
            return (Criteria) this;
        }

        public Criteria andDataIn(List<BigDecimal> values) {
            addCriterion("data in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotIn(List<BigDecimal> values) {
            addCriterion("data not in", values, "data");
            return (Criteria) this;
        }

        public Criteria andDataBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("data between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andDataNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("data not between", value1, value2, "data");
            return (Criteria) this;
        }

        public Criteria andPagesIsNull() {
            addCriterion("pages is null");
            return (Criteria) this;
        }

        public Criteria andPagesIsNotNull() {
            addCriterion("pages is not null");
            return (Criteria) this;
        }

        public Criteria andPagesEqualTo(Long value) {
            addCriterion("pages =", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotEqualTo(Long value) {
            addCriterion("pages <>", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThan(Long value) {
            addCriterion("pages >", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesGreaterThanOrEqualTo(Long value) {
            addCriterion("pages >=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThan(Long value) {
            addCriterion("pages <", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesLessThanOrEqualTo(Long value) {
            addCriterion("pages <=", value, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesIn(List<Long> values) {
            addCriterion("pages in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotIn(List<Long> values) {
            addCriterion("pages not in", values, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesBetween(Long value1, Long value2) {
            addCriterion("pages between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andPagesNotBetween(Long value1, Long value2) {
            addCriterion("pages not between", value1, value2, "pages");
            return (Criteria) this;
        }

        public Criteria andPages_hashedIsNull() {
            addCriterion("pages_hashed is null");
            return (Criteria) this;
        }

        public Criteria andPages_hashedIsNotNull() {
            addCriterion("pages_hashed is not null");
            return (Criteria) this;
        }

        public Criteria andPages_hashedEqualTo(Long value) {
            addCriterion("pages_hashed =", value, "pages_hashed");
            return (Criteria) this;
        }

        public Criteria andPages_hashedNotEqualTo(Long value) {
            addCriterion("pages_hashed <>", value, "pages_hashed");
            return (Criteria) this;
        }

        public Criteria andPages_hashedGreaterThan(Long value) {
            addCriterion("pages_hashed >", value, "pages_hashed");
            return (Criteria) this;
        }

        public Criteria andPages_hashedGreaterThanOrEqualTo(Long value) {
            addCriterion("pages_hashed >=", value, "pages_hashed");
            return (Criteria) this;
        }

        public Criteria andPages_hashedLessThan(Long value) {
            addCriterion("pages_hashed <", value, "pages_hashed");
            return (Criteria) this;
        }

        public Criteria andPages_hashedLessThanOrEqualTo(Long value) {
            addCriterion("pages_hashed <=", value, "pages_hashed");
            return (Criteria) this;
        }

        public Criteria andPages_hashedIn(List<Long> values) {
            addCriterion("pages_hashed in", values, "pages_hashed");
            return (Criteria) this;
        }

        public Criteria andPages_hashedNotIn(List<Long> values) {
            addCriterion("pages_hashed not in", values, "pages_hashed");
            return (Criteria) this;
        }

        public Criteria andPages_hashedBetween(Long value1, Long value2) {
            addCriterion("pages_hashed between", value1, value2, "pages_hashed");
            return (Criteria) this;
        }

        public Criteria andPages_hashedNotBetween(Long value1, Long value2) {
            addCriterion("pages_hashed not between", value1, value2, "pages_hashed");
            return (Criteria) this;
        }

        public Criteria andPages_oldIsNull() {
            addCriterion("pages_old is null");
            return (Criteria) this;
        }

        public Criteria andPages_oldIsNotNull() {
            addCriterion("pages_old is not null");
            return (Criteria) this;
        }

        public Criteria andPages_oldEqualTo(Long value) {
            addCriterion("pages_old =", value, "pages_old");
            return (Criteria) this;
        }

        public Criteria andPages_oldNotEqualTo(Long value) {
            addCriterion("pages_old <>", value, "pages_old");
            return (Criteria) this;
        }

        public Criteria andPages_oldGreaterThan(Long value) {
            addCriterion("pages_old >", value, "pages_old");
            return (Criteria) this;
        }

        public Criteria andPages_oldGreaterThanOrEqualTo(Long value) {
            addCriterion("pages_old >=", value, "pages_old");
            return (Criteria) this;
        }

        public Criteria andPages_oldLessThan(Long value) {
            addCriterion("pages_old <", value, "pages_old");
            return (Criteria) this;
        }

        public Criteria andPages_oldLessThanOrEqualTo(Long value) {
            addCriterion("pages_old <=", value, "pages_old");
            return (Criteria) this;
        }

        public Criteria andPages_oldIn(List<Long> values) {
            addCriterion("pages_old in", values, "pages_old");
            return (Criteria) this;
        }

        public Criteria andPages_oldNotIn(List<Long> values) {
            addCriterion("pages_old not in", values, "pages_old");
            return (Criteria) this;
        }

        public Criteria andPages_oldBetween(Long value1, Long value2) {
            addCriterion("pages_old between", value1, value2, "pages_old");
            return (Criteria) this;
        }

        public Criteria andPages_oldNotBetween(Long value1, Long value2) {
            addCriterion("pages_old not between", value1, value2, "pages_old");
            return (Criteria) this;
        }

        public Criteria andRows_cachedIsNull() {
            addCriterion("rows_cached is null");
            return (Criteria) this;
        }

        public Criteria andRows_cachedIsNotNull() {
            addCriterion("rows_cached is not null");
            return (Criteria) this;
        }

        public Criteria andRows_cachedEqualTo(BigDecimal value) {
            addCriterion("rows_cached =", value, "rows_cached");
            return (Criteria) this;
        }

        public Criteria andRows_cachedNotEqualTo(BigDecimal value) {
            addCriterion("rows_cached <>", value, "rows_cached");
            return (Criteria) this;
        }

        public Criteria andRows_cachedGreaterThan(BigDecimal value) {
            addCriterion("rows_cached >", value, "rows_cached");
            return (Criteria) this;
        }

        public Criteria andRows_cachedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_cached >=", value, "rows_cached");
            return (Criteria) this;
        }

        public Criteria andRows_cachedLessThan(BigDecimal value) {
            addCriterion("rows_cached <", value, "rows_cached");
            return (Criteria) this;
        }

        public Criteria andRows_cachedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rows_cached <=", value, "rows_cached");
            return (Criteria) this;
        }

        public Criteria andRows_cachedIn(List<BigDecimal> values) {
            addCriterion("rows_cached in", values, "rows_cached");
            return (Criteria) this;
        }

        public Criteria andRows_cachedNotIn(List<BigDecimal> values) {
            addCriterion("rows_cached not in", values, "rows_cached");
            return (Criteria) this;
        }

        public Criteria andRows_cachedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_cached between", value1, value2, "rows_cached");
            return (Criteria) this;
        }

        public Criteria andRows_cachedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rows_cached not between", value1, value2, "rows_cached");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table x$innodb_buffer_stats_by_table
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
     * This class corresponds to the database table x$innodb_buffer_stats_by_table
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