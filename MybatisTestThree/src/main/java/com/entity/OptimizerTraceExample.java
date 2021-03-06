package com.entity;

import java.util.ArrayList;
import java.util.List;

public class OptimizerTraceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table OPTIMIZER_TRACE
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table OPTIMIZER_TRACE
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table OPTIMIZER_TRACE
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OPTIMIZER_TRACE
     *
     * @mbg.generated
     */
    public OptimizerTraceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OPTIMIZER_TRACE
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OPTIMIZER_TRACE
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OPTIMIZER_TRACE
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OPTIMIZER_TRACE
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OPTIMIZER_TRACE
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OPTIMIZER_TRACE
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OPTIMIZER_TRACE
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
     * This method corresponds to the database table OPTIMIZER_TRACE
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
     * This method corresponds to the database table OPTIMIZER_TRACE
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OPTIMIZER_TRACE
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
     * This class corresponds to the database table OPTIMIZER_TRACE
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

        public Criteria andQUERYIsNull() {
            addCriterion("QUERY is null");
            return (Criteria) this;
        }

        public Criteria andQUERYIsNotNull() {
            addCriterion("QUERY is not null");
            return (Criteria) this;
        }

        public Criteria andQUERYEqualTo(String value) {
            addCriterion("QUERY =", value, "QUERY");
            return (Criteria) this;
        }

        public Criteria andQUERYNotEqualTo(String value) {
            addCriterion("QUERY <>", value, "QUERY");
            return (Criteria) this;
        }

        public Criteria andQUERYGreaterThan(String value) {
            addCriterion("QUERY >", value, "QUERY");
            return (Criteria) this;
        }

        public Criteria andQUERYGreaterThanOrEqualTo(String value) {
            addCriterion("QUERY >=", value, "QUERY");
            return (Criteria) this;
        }

        public Criteria andQUERYLessThan(String value) {
            addCriterion("QUERY <", value, "QUERY");
            return (Criteria) this;
        }

        public Criteria andQUERYLessThanOrEqualTo(String value) {
            addCriterion("QUERY <=", value, "QUERY");
            return (Criteria) this;
        }

        public Criteria andQUERYLike(String value) {
            addCriterion("QUERY like", value, "QUERY");
            return (Criteria) this;
        }

        public Criteria andQUERYNotLike(String value) {
            addCriterion("QUERY not like", value, "QUERY");
            return (Criteria) this;
        }

        public Criteria andQUERYIn(List<String> values) {
            addCriterion("QUERY in", values, "QUERY");
            return (Criteria) this;
        }

        public Criteria andQUERYNotIn(List<String> values) {
            addCriterion("QUERY not in", values, "QUERY");
            return (Criteria) this;
        }

        public Criteria andQUERYBetween(String value1, String value2) {
            addCriterion("QUERY between", value1, value2, "QUERY");
            return (Criteria) this;
        }

        public Criteria andQUERYNotBetween(String value1, String value2) {
            addCriterion("QUERY not between", value1, value2, "QUERY");
            return (Criteria) this;
        }

        public Criteria andTRACEIsNull() {
            addCriterion("TRACE is null");
            return (Criteria) this;
        }

        public Criteria andTRACEIsNotNull() {
            addCriterion("TRACE is not null");
            return (Criteria) this;
        }

        public Criteria andTRACEEqualTo(String value) {
            addCriterion("TRACE =", value, "TRACE");
            return (Criteria) this;
        }

        public Criteria andTRACENotEqualTo(String value) {
            addCriterion("TRACE <>", value, "TRACE");
            return (Criteria) this;
        }

        public Criteria andTRACEGreaterThan(String value) {
            addCriterion("TRACE >", value, "TRACE");
            return (Criteria) this;
        }

        public Criteria andTRACEGreaterThanOrEqualTo(String value) {
            addCriterion("TRACE >=", value, "TRACE");
            return (Criteria) this;
        }

        public Criteria andTRACELessThan(String value) {
            addCriterion("TRACE <", value, "TRACE");
            return (Criteria) this;
        }

        public Criteria andTRACELessThanOrEqualTo(String value) {
            addCriterion("TRACE <=", value, "TRACE");
            return (Criteria) this;
        }

        public Criteria andTRACELike(String value) {
            addCriterion("TRACE like", value, "TRACE");
            return (Criteria) this;
        }

        public Criteria andTRACENotLike(String value) {
            addCriterion("TRACE not like", value, "TRACE");
            return (Criteria) this;
        }

        public Criteria andTRACEIn(List<String> values) {
            addCriterion("TRACE in", values, "TRACE");
            return (Criteria) this;
        }

        public Criteria andTRACENotIn(List<String> values) {
            addCriterion("TRACE not in", values, "TRACE");
            return (Criteria) this;
        }

        public Criteria andTRACEBetween(String value1, String value2) {
            addCriterion("TRACE between", value1, value2, "TRACE");
            return (Criteria) this;
        }

        public Criteria andTRACENotBetween(String value1, String value2) {
            addCriterion("TRACE not between", value1, value2, "TRACE");
            return (Criteria) this;
        }

        public Criteria andMISSING_BYTES_BEYOND_MAX_MEM_SIZEIsNull() {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andMISSING_BYTES_BEYOND_MAX_MEM_SIZEIsNotNull() {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andMISSING_BYTES_BEYOND_MAX_MEM_SIZEEqualTo(Integer value) {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE =", value, "MISSING_BYTES_BEYOND_MAX_MEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andMISSING_BYTES_BEYOND_MAX_MEM_SIZENotEqualTo(Integer value) {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE <>", value, "MISSING_BYTES_BEYOND_MAX_MEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andMISSING_BYTES_BEYOND_MAX_MEM_SIZEGreaterThan(Integer value) {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE >", value, "MISSING_BYTES_BEYOND_MAX_MEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andMISSING_BYTES_BEYOND_MAX_MEM_SIZEGreaterThanOrEqualTo(Integer value) {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE >=", value, "MISSING_BYTES_BEYOND_MAX_MEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andMISSING_BYTES_BEYOND_MAX_MEM_SIZELessThan(Integer value) {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE <", value, "MISSING_BYTES_BEYOND_MAX_MEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andMISSING_BYTES_BEYOND_MAX_MEM_SIZELessThanOrEqualTo(Integer value) {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE <=", value, "MISSING_BYTES_BEYOND_MAX_MEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andMISSING_BYTES_BEYOND_MAX_MEM_SIZEIn(List<Integer> values) {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE in", values, "MISSING_BYTES_BEYOND_MAX_MEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andMISSING_BYTES_BEYOND_MAX_MEM_SIZENotIn(List<Integer> values) {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE not in", values, "MISSING_BYTES_BEYOND_MAX_MEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andMISSING_BYTES_BEYOND_MAX_MEM_SIZEBetween(Integer value1, Integer value2) {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE between", value1, value2, "MISSING_BYTES_BEYOND_MAX_MEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andMISSING_BYTES_BEYOND_MAX_MEM_SIZENotBetween(Integer value1, Integer value2) {
            addCriterion("MISSING_BYTES_BEYOND_MAX_MEM_SIZE not between", value1, value2, "MISSING_BYTES_BEYOND_MAX_MEM_SIZE");
            return (Criteria) this;
        }

        public Criteria andINSUFFICIENT_PRIVILEGESIsNull() {
            addCriterion("INSUFFICIENT_PRIVILEGES is null");
            return (Criteria) this;
        }

        public Criteria andINSUFFICIENT_PRIVILEGESIsNotNull() {
            addCriterion("INSUFFICIENT_PRIVILEGES is not null");
            return (Criteria) this;
        }

        public Criteria andINSUFFICIENT_PRIVILEGESEqualTo(Boolean value) {
            addCriterion("INSUFFICIENT_PRIVILEGES =", value, "INSUFFICIENT_PRIVILEGES");
            return (Criteria) this;
        }

        public Criteria andINSUFFICIENT_PRIVILEGESNotEqualTo(Boolean value) {
            addCriterion("INSUFFICIENT_PRIVILEGES <>", value, "INSUFFICIENT_PRIVILEGES");
            return (Criteria) this;
        }

        public Criteria andINSUFFICIENT_PRIVILEGESGreaterThan(Boolean value) {
            addCriterion("INSUFFICIENT_PRIVILEGES >", value, "INSUFFICIENT_PRIVILEGES");
            return (Criteria) this;
        }

        public Criteria andINSUFFICIENT_PRIVILEGESGreaterThanOrEqualTo(Boolean value) {
            addCriterion("INSUFFICIENT_PRIVILEGES >=", value, "INSUFFICIENT_PRIVILEGES");
            return (Criteria) this;
        }

        public Criteria andINSUFFICIENT_PRIVILEGESLessThan(Boolean value) {
            addCriterion("INSUFFICIENT_PRIVILEGES <", value, "INSUFFICIENT_PRIVILEGES");
            return (Criteria) this;
        }

        public Criteria andINSUFFICIENT_PRIVILEGESLessThanOrEqualTo(Boolean value) {
            addCriterion("INSUFFICIENT_PRIVILEGES <=", value, "INSUFFICIENT_PRIVILEGES");
            return (Criteria) this;
        }

        public Criteria andINSUFFICIENT_PRIVILEGESIn(List<Boolean> values) {
            addCriterion("INSUFFICIENT_PRIVILEGES in", values, "INSUFFICIENT_PRIVILEGES");
            return (Criteria) this;
        }

        public Criteria andINSUFFICIENT_PRIVILEGESNotIn(List<Boolean> values) {
            addCriterion("INSUFFICIENT_PRIVILEGES not in", values, "INSUFFICIENT_PRIVILEGES");
            return (Criteria) this;
        }

        public Criteria andINSUFFICIENT_PRIVILEGESBetween(Boolean value1, Boolean value2) {
            addCriterion("INSUFFICIENT_PRIVILEGES between", value1, value2, "INSUFFICIENT_PRIVILEGES");
            return (Criteria) this;
        }

        public Criteria andINSUFFICIENT_PRIVILEGESNotBetween(Boolean value1, Boolean value2) {
            addCriterion("INSUFFICIENT_PRIVILEGES not between", value1, value2, "INSUFFICIENT_PRIVILEGES");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table OPTIMIZER_TRACE
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
     * This class corresponds to the database table OPTIMIZER_TRACE
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