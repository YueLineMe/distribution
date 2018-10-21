package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventsErrorsSummaryByUserByErrorExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table events_errors_summary_by_user_by_error
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table events_errors_summary_by_user_by_error
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table events_errors_summary_by_user_by_error
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_errors_summary_by_user_by_error
     *
     * @mbg.generated
     */
    public EventsErrorsSummaryByUserByErrorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_errors_summary_by_user_by_error
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_errors_summary_by_user_by_error
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_errors_summary_by_user_by_error
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_errors_summary_by_user_by_error
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_errors_summary_by_user_by_error
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_errors_summary_by_user_by_error
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_errors_summary_by_user_by_error
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
     * This method corresponds to the database table events_errors_summary_by_user_by_error
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
     * This method corresponds to the database table events_errors_summary_by_user_by_error
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_errors_summary_by_user_by_error
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
     * This class corresponds to the database table events_errors_summary_by_user_by_error
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

        public Criteria andUSERIsNull() {
            addCriterion("USER is null");
            return (Criteria) this;
        }

        public Criteria andUSERIsNotNull() {
            addCriterion("USER is not null");
            return (Criteria) this;
        }

        public Criteria andUSEREqualTo(String value) {
            addCriterion("USER =", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERNotEqualTo(String value) {
            addCriterion("USER <>", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERGreaterThan(String value) {
            addCriterion("USER >", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERGreaterThanOrEqualTo(String value) {
            addCriterion("USER >=", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERLessThan(String value) {
            addCriterion("USER <", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERLessThanOrEqualTo(String value) {
            addCriterion("USER <=", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERLike(String value) {
            addCriterion("USER like", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERNotLike(String value) {
            addCriterion("USER not like", value, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERIn(List<String> values) {
            addCriterion("USER in", values, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERNotIn(List<String> values) {
            addCriterion("USER not in", values, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERBetween(String value1, String value2) {
            addCriterion("USER between", value1, value2, "USER");
            return (Criteria) this;
        }

        public Criteria andUSERNotBetween(String value1, String value2) {
            addCriterion("USER not between", value1, value2, "USER");
            return (Criteria) this;
        }

        public Criteria andERROR_NUMBERIsNull() {
            addCriterion("ERROR_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andERROR_NUMBERIsNotNull() {
            addCriterion("ERROR_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andERROR_NUMBEREqualTo(Integer value) {
            addCriterion("ERROR_NUMBER =", value, "ERROR_NUMBER");
            return (Criteria) this;
        }

        public Criteria andERROR_NUMBERNotEqualTo(Integer value) {
            addCriterion("ERROR_NUMBER <>", value, "ERROR_NUMBER");
            return (Criteria) this;
        }

        public Criteria andERROR_NUMBERGreaterThan(Integer value) {
            addCriterion("ERROR_NUMBER >", value, "ERROR_NUMBER");
            return (Criteria) this;
        }

        public Criteria andERROR_NUMBERGreaterThanOrEqualTo(Integer value) {
            addCriterion("ERROR_NUMBER >=", value, "ERROR_NUMBER");
            return (Criteria) this;
        }

        public Criteria andERROR_NUMBERLessThan(Integer value) {
            addCriterion("ERROR_NUMBER <", value, "ERROR_NUMBER");
            return (Criteria) this;
        }

        public Criteria andERROR_NUMBERLessThanOrEqualTo(Integer value) {
            addCriterion("ERROR_NUMBER <=", value, "ERROR_NUMBER");
            return (Criteria) this;
        }

        public Criteria andERROR_NUMBERIn(List<Integer> values) {
            addCriterion("ERROR_NUMBER in", values, "ERROR_NUMBER");
            return (Criteria) this;
        }

        public Criteria andERROR_NUMBERNotIn(List<Integer> values) {
            addCriterion("ERROR_NUMBER not in", values, "ERROR_NUMBER");
            return (Criteria) this;
        }

        public Criteria andERROR_NUMBERBetween(Integer value1, Integer value2) {
            addCriterion("ERROR_NUMBER between", value1, value2, "ERROR_NUMBER");
            return (Criteria) this;
        }

        public Criteria andERROR_NUMBERNotBetween(Integer value1, Integer value2) {
            addCriterion("ERROR_NUMBER not between", value1, value2, "ERROR_NUMBER");
            return (Criteria) this;
        }

        public Criteria andERROR_NAMEIsNull() {
            addCriterion("ERROR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andERROR_NAMEIsNotNull() {
            addCriterion("ERROR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andERROR_NAMEEqualTo(String value) {
            addCriterion("ERROR_NAME =", value, "ERROR_NAME");
            return (Criteria) this;
        }

        public Criteria andERROR_NAMENotEqualTo(String value) {
            addCriterion("ERROR_NAME <>", value, "ERROR_NAME");
            return (Criteria) this;
        }

        public Criteria andERROR_NAMEGreaterThan(String value) {
            addCriterion("ERROR_NAME >", value, "ERROR_NAME");
            return (Criteria) this;
        }

        public Criteria andERROR_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("ERROR_NAME >=", value, "ERROR_NAME");
            return (Criteria) this;
        }

        public Criteria andERROR_NAMELessThan(String value) {
            addCriterion("ERROR_NAME <", value, "ERROR_NAME");
            return (Criteria) this;
        }

        public Criteria andERROR_NAMELessThanOrEqualTo(String value) {
            addCriterion("ERROR_NAME <=", value, "ERROR_NAME");
            return (Criteria) this;
        }

        public Criteria andERROR_NAMELike(String value) {
            addCriterion("ERROR_NAME like", value, "ERROR_NAME");
            return (Criteria) this;
        }

        public Criteria andERROR_NAMENotLike(String value) {
            addCriterion("ERROR_NAME not like", value, "ERROR_NAME");
            return (Criteria) this;
        }

        public Criteria andERROR_NAMEIn(List<String> values) {
            addCriterion("ERROR_NAME in", values, "ERROR_NAME");
            return (Criteria) this;
        }

        public Criteria andERROR_NAMENotIn(List<String> values) {
            addCriterion("ERROR_NAME not in", values, "ERROR_NAME");
            return (Criteria) this;
        }

        public Criteria andERROR_NAMEBetween(String value1, String value2) {
            addCriterion("ERROR_NAME between", value1, value2, "ERROR_NAME");
            return (Criteria) this;
        }

        public Criteria andERROR_NAMENotBetween(String value1, String value2) {
            addCriterion("ERROR_NAME not between", value1, value2, "ERROR_NAME");
            return (Criteria) this;
        }

        public Criteria andSQL_STATEIsNull() {
            addCriterion("SQL_STATE is null");
            return (Criteria) this;
        }

        public Criteria andSQL_STATEIsNotNull() {
            addCriterion("SQL_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andSQL_STATEEqualTo(String value) {
            addCriterion("SQL_STATE =", value, "SQL_STATE");
            return (Criteria) this;
        }

        public Criteria andSQL_STATENotEqualTo(String value) {
            addCriterion("SQL_STATE <>", value, "SQL_STATE");
            return (Criteria) this;
        }

        public Criteria andSQL_STATEGreaterThan(String value) {
            addCriterion("SQL_STATE >", value, "SQL_STATE");
            return (Criteria) this;
        }

        public Criteria andSQL_STATEGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_STATE >=", value, "SQL_STATE");
            return (Criteria) this;
        }

        public Criteria andSQL_STATELessThan(String value) {
            addCriterion("SQL_STATE <", value, "SQL_STATE");
            return (Criteria) this;
        }

        public Criteria andSQL_STATELessThanOrEqualTo(String value) {
            addCriterion("SQL_STATE <=", value, "SQL_STATE");
            return (Criteria) this;
        }

        public Criteria andSQL_STATELike(String value) {
            addCriterion("SQL_STATE like", value, "SQL_STATE");
            return (Criteria) this;
        }

        public Criteria andSQL_STATENotLike(String value) {
            addCriterion("SQL_STATE not like", value, "SQL_STATE");
            return (Criteria) this;
        }

        public Criteria andSQL_STATEIn(List<String> values) {
            addCriterion("SQL_STATE in", values, "SQL_STATE");
            return (Criteria) this;
        }

        public Criteria andSQL_STATENotIn(List<String> values) {
            addCriterion("SQL_STATE not in", values, "SQL_STATE");
            return (Criteria) this;
        }

        public Criteria andSQL_STATEBetween(String value1, String value2) {
            addCriterion("SQL_STATE between", value1, value2, "SQL_STATE");
            return (Criteria) this;
        }

        public Criteria andSQL_STATENotBetween(String value1, String value2) {
            addCriterion("SQL_STATE not between", value1, value2, "SQL_STATE");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_RAISEDIsNull() {
            addCriterion("SUM_ERROR_RAISED is null");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_RAISEDIsNotNull() {
            addCriterion("SUM_ERROR_RAISED is not null");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_RAISEDEqualTo(Long value) {
            addCriterion("SUM_ERROR_RAISED =", value, "SUM_ERROR_RAISED");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_RAISEDNotEqualTo(Long value) {
            addCriterion("SUM_ERROR_RAISED <>", value, "SUM_ERROR_RAISED");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_RAISEDGreaterThan(Long value) {
            addCriterion("SUM_ERROR_RAISED >", value, "SUM_ERROR_RAISED");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_RAISEDGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_ERROR_RAISED >=", value, "SUM_ERROR_RAISED");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_RAISEDLessThan(Long value) {
            addCriterion("SUM_ERROR_RAISED <", value, "SUM_ERROR_RAISED");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_RAISEDLessThanOrEqualTo(Long value) {
            addCriterion("SUM_ERROR_RAISED <=", value, "SUM_ERROR_RAISED");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_RAISEDIn(List<Long> values) {
            addCriterion("SUM_ERROR_RAISED in", values, "SUM_ERROR_RAISED");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_RAISEDNotIn(List<Long> values) {
            addCriterion("SUM_ERROR_RAISED not in", values, "SUM_ERROR_RAISED");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_RAISEDBetween(Long value1, Long value2) {
            addCriterion("SUM_ERROR_RAISED between", value1, value2, "SUM_ERROR_RAISED");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_RAISEDNotBetween(Long value1, Long value2) {
            addCriterion("SUM_ERROR_RAISED not between", value1, value2, "SUM_ERROR_RAISED");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_HANDLEDIsNull() {
            addCriterion("SUM_ERROR_HANDLED is null");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_HANDLEDIsNotNull() {
            addCriterion("SUM_ERROR_HANDLED is not null");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_HANDLEDEqualTo(Long value) {
            addCriterion("SUM_ERROR_HANDLED =", value, "SUM_ERROR_HANDLED");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_HANDLEDNotEqualTo(Long value) {
            addCriterion("SUM_ERROR_HANDLED <>", value, "SUM_ERROR_HANDLED");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_HANDLEDGreaterThan(Long value) {
            addCriterion("SUM_ERROR_HANDLED >", value, "SUM_ERROR_HANDLED");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_HANDLEDGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_ERROR_HANDLED >=", value, "SUM_ERROR_HANDLED");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_HANDLEDLessThan(Long value) {
            addCriterion("SUM_ERROR_HANDLED <", value, "SUM_ERROR_HANDLED");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_HANDLEDLessThanOrEqualTo(Long value) {
            addCriterion("SUM_ERROR_HANDLED <=", value, "SUM_ERROR_HANDLED");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_HANDLEDIn(List<Long> values) {
            addCriterion("SUM_ERROR_HANDLED in", values, "SUM_ERROR_HANDLED");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_HANDLEDNotIn(List<Long> values) {
            addCriterion("SUM_ERROR_HANDLED not in", values, "SUM_ERROR_HANDLED");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_HANDLEDBetween(Long value1, Long value2) {
            addCriterion("SUM_ERROR_HANDLED between", value1, value2, "SUM_ERROR_HANDLED");
            return (Criteria) this;
        }

        public Criteria andSUM_ERROR_HANDLEDNotBetween(Long value1, Long value2) {
            addCriterion("SUM_ERROR_HANDLED not between", value1, value2, "SUM_ERROR_HANDLED");
            return (Criteria) this;
        }

        public Criteria andFIRST_SEENIsNull() {
            addCriterion("FIRST_SEEN is null");
            return (Criteria) this;
        }

        public Criteria andFIRST_SEENIsNotNull() {
            addCriterion("FIRST_SEEN is not null");
            return (Criteria) this;
        }

        public Criteria andFIRST_SEENEqualTo(Date value) {
            addCriterion("FIRST_SEEN =", value, "FIRST_SEEN");
            return (Criteria) this;
        }

        public Criteria andFIRST_SEENNotEqualTo(Date value) {
            addCriterion("FIRST_SEEN <>", value, "FIRST_SEEN");
            return (Criteria) this;
        }

        public Criteria andFIRST_SEENGreaterThan(Date value) {
            addCriterion("FIRST_SEEN >", value, "FIRST_SEEN");
            return (Criteria) this;
        }

        public Criteria andFIRST_SEENGreaterThanOrEqualTo(Date value) {
            addCriterion("FIRST_SEEN >=", value, "FIRST_SEEN");
            return (Criteria) this;
        }

        public Criteria andFIRST_SEENLessThan(Date value) {
            addCriterion("FIRST_SEEN <", value, "FIRST_SEEN");
            return (Criteria) this;
        }

        public Criteria andFIRST_SEENLessThanOrEqualTo(Date value) {
            addCriterion("FIRST_SEEN <=", value, "FIRST_SEEN");
            return (Criteria) this;
        }

        public Criteria andFIRST_SEENIn(List<Date> values) {
            addCriterion("FIRST_SEEN in", values, "FIRST_SEEN");
            return (Criteria) this;
        }

        public Criteria andFIRST_SEENNotIn(List<Date> values) {
            addCriterion("FIRST_SEEN not in", values, "FIRST_SEEN");
            return (Criteria) this;
        }

        public Criteria andFIRST_SEENBetween(Date value1, Date value2) {
            addCriterion("FIRST_SEEN between", value1, value2, "FIRST_SEEN");
            return (Criteria) this;
        }

        public Criteria andFIRST_SEENNotBetween(Date value1, Date value2) {
            addCriterion("FIRST_SEEN not between", value1, value2, "FIRST_SEEN");
            return (Criteria) this;
        }

        public Criteria andLAST_SEENIsNull() {
            addCriterion("LAST_SEEN is null");
            return (Criteria) this;
        }

        public Criteria andLAST_SEENIsNotNull() {
            addCriterion("LAST_SEEN is not null");
            return (Criteria) this;
        }

        public Criteria andLAST_SEENEqualTo(Date value) {
            addCriterion("LAST_SEEN =", value, "LAST_SEEN");
            return (Criteria) this;
        }

        public Criteria andLAST_SEENNotEqualTo(Date value) {
            addCriterion("LAST_SEEN <>", value, "LAST_SEEN");
            return (Criteria) this;
        }

        public Criteria andLAST_SEENGreaterThan(Date value) {
            addCriterion("LAST_SEEN >", value, "LAST_SEEN");
            return (Criteria) this;
        }

        public Criteria andLAST_SEENGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_SEEN >=", value, "LAST_SEEN");
            return (Criteria) this;
        }

        public Criteria andLAST_SEENLessThan(Date value) {
            addCriterion("LAST_SEEN <", value, "LAST_SEEN");
            return (Criteria) this;
        }

        public Criteria andLAST_SEENLessThanOrEqualTo(Date value) {
            addCriterion("LAST_SEEN <=", value, "LAST_SEEN");
            return (Criteria) this;
        }

        public Criteria andLAST_SEENIn(List<Date> values) {
            addCriterion("LAST_SEEN in", values, "LAST_SEEN");
            return (Criteria) this;
        }

        public Criteria andLAST_SEENNotIn(List<Date> values) {
            addCriterion("LAST_SEEN not in", values, "LAST_SEEN");
            return (Criteria) this;
        }

        public Criteria andLAST_SEENBetween(Date value1, Date value2) {
            addCriterion("LAST_SEEN between", value1, value2, "LAST_SEEN");
            return (Criteria) this;
        }

        public Criteria andLAST_SEENNotBetween(Date value1, Date value2) {
            addCriterion("LAST_SEEN not between", value1, value2, "LAST_SEEN");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table events_errors_summary_by_user_by_error
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
     * This class corresponds to the database table events_errors_summary_by_user_by_error
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