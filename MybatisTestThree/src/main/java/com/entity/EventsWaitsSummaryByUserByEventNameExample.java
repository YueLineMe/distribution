package com.entity;

import java.util.ArrayList;
import java.util.List;

public class EventsWaitsSummaryByUserByEventNameExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table events_waits_summary_by_user_by_event_name
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table events_waits_summary_by_user_by_event_name
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table events_waits_summary_by_user_by_event_name
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_user_by_event_name
     *
     * @mbg.generated
     */
    public EventsWaitsSummaryByUserByEventNameExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_user_by_event_name
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_user_by_event_name
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_user_by_event_name
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_user_by_event_name
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_user_by_event_name
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_user_by_event_name
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_user_by_event_name
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
     * This method corresponds to the database table events_waits_summary_by_user_by_event_name
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
     * This method corresponds to the database table events_waits_summary_by_user_by_event_name
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_user_by_event_name
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
     * This class corresponds to the database table events_waits_summary_by_user_by_event_name
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

        public Criteria andEVENT_NAMEIsNull() {
            addCriterion("EVENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEVENT_NAMEIsNotNull() {
            addCriterion("EVENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEVENT_NAMEEqualTo(String value) {
            addCriterion("EVENT_NAME =", value, "EVENT_NAME");
            return (Criteria) this;
        }

        public Criteria andEVENT_NAMENotEqualTo(String value) {
            addCriterion("EVENT_NAME <>", value, "EVENT_NAME");
            return (Criteria) this;
        }

        public Criteria andEVENT_NAMEGreaterThan(String value) {
            addCriterion("EVENT_NAME >", value, "EVENT_NAME");
            return (Criteria) this;
        }

        public Criteria andEVENT_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_NAME >=", value, "EVENT_NAME");
            return (Criteria) this;
        }

        public Criteria andEVENT_NAMELessThan(String value) {
            addCriterion("EVENT_NAME <", value, "EVENT_NAME");
            return (Criteria) this;
        }

        public Criteria andEVENT_NAMELessThanOrEqualTo(String value) {
            addCriterion("EVENT_NAME <=", value, "EVENT_NAME");
            return (Criteria) this;
        }

        public Criteria andEVENT_NAMELike(String value) {
            addCriterion("EVENT_NAME like", value, "EVENT_NAME");
            return (Criteria) this;
        }

        public Criteria andEVENT_NAMENotLike(String value) {
            addCriterion("EVENT_NAME not like", value, "EVENT_NAME");
            return (Criteria) this;
        }

        public Criteria andEVENT_NAMEIn(List<String> values) {
            addCriterion("EVENT_NAME in", values, "EVENT_NAME");
            return (Criteria) this;
        }

        public Criteria andEVENT_NAMENotIn(List<String> values) {
            addCriterion("EVENT_NAME not in", values, "EVENT_NAME");
            return (Criteria) this;
        }

        public Criteria andEVENT_NAMEBetween(String value1, String value2) {
            addCriterion("EVENT_NAME between", value1, value2, "EVENT_NAME");
            return (Criteria) this;
        }

        public Criteria andEVENT_NAMENotBetween(String value1, String value2) {
            addCriterion("EVENT_NAME not between", value1, value2, "EVENT_NAME");
            return (Criteria) this;
        }

        public Criteria andCOUNT_STARIsNull() {
            addCriterion("COUNT_STAR is null");
            return (Criteria) this;
        }

        public Criteria andCOUNT_STARIsNotNull() {
            addCriterion("COUNT_STAR is not null");
            return (Criteria) this;
        }

        public Criteria andCOUNT_STAREqualTo(Long value) {
            addCriterion("COUNT_STAR =", value, "COUNT_STAR");
            return (Criteria) this;
        }

        public Criteria andCOUNT_STARNotEqualTo(Long value) {
            addCriterion("COUNT_STAR <>", value, "COUNT_STAR");
            return (Criteria) this;
        }

        public Criteria andCOUNT_STARGreaterThan(Long value) {
            addCriterion("COUNT_STAR >", value, "COUNT_STAR");
            return (Criteria) this;
        }

        public Criteria andCOUNT_STARGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_STAR >=", value, "COUNT_STAR");
            return (Criteria) this;
        }

        public Criteria andCOUNT_STARLessThan(Long value) {
            addCriterion("COUNT_STAR <", value, "COUNT_STAR");
            return (Criteria) this;
        }

        public Criteria andCOUNT_STARLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_STAR <=", value, "COUNT_STAR");
            return (Criteria) this;
        }

        public Criteria andCOUNT_STARIn(List<Long> values) {
            addCriterion("COUNT_STAR in", values, "COUNT_STAR");
            return (Criteria) this;
        }

        public Criteria andCOUNT_STARNotIn(List<Long> values) {
            addCriterion("COUNT_STAR not in", values, "COUNT_STAR");
            return (Criteria) this;
        }

        public Criteria andCOUNT_STARBetween(Long value1, Long value2) {
            addCriterion("COUNT_STAR between", value1, value2, "COUNT_STAR");
            return (Criteria) this;
        }

        public Criteria andCOUNT_STARNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_STAR not between", value1, value2, "COUNT_STAR");
            return (Criteria) this;
        }

        public Criteria andSUM_TIMER_WAITIsNull() {
            addCriterion("SUM_TIMER_WAIT is null");
            return (Criteria) this;
        }

        public Criteria andSUM_TIMER_WAITIsNotNull() {
            addCriterion("SUM_TIMER_WAIT is not null");
            return (Criteria) this;
        }

        public Criteria andSUM_TIMER_WAITEqualTo(Long value) {
            addCriterion("SUM_TIMER_WAIT =", value, "SUM_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andSUM_TIMER_WAITNotEqualTo(Long value) {
            addCriterion("SUM_TIMER_WAIT <>", value, "SUM_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andSUM_TIMER_WAITGreaterThan(Long value) {
            addCriterion("SUM_TIMER_WAIT >", value, "SUM_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andSUM_TIMER_WAITGreaterThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_WAIT >=", value, "SUM_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andSUM_TIMER_WAITLessThan(Long value) {
            addCriterion("SUM_TIMER_WAIT <", value, "SUM_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andSUM_TIMER_WAITLessThanOrEqualTo(Long value) {
            addCriterion("SUM_TIMER_WAIT <=", value, "SUM_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andSUM_TIMER_WAITIn(List<Long> values) {
            addCriterion("SUM_TIMER_WAIT in", values, "SUM_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andSUM_TIMER_WAITNotIn(List<Long> values) {
            addCriterion("SUM_TIMER_WAIT not in", values, "SUM_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andSUM_TIMER_WAITBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_WAIT between", value1, value2, "SUM_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andSUM_TIMER_WAITNotBetween(Long value1, Long value2) {
            addCriterion("SUM_TIMER_WAIT not between", value1, value2, "SUM_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andMIN_TIMER_WAITIsNull() {
            addCriterion("MIN_TIMER_WAIT is null");
            return (Criteria) this;
        }

        public Criteria andMIN_TIMER_WAITIsNotNull() {
            addCriterion("MIN_TIMER_WAIT is not null");
            return (Criteria) this;
        }

        public Criteria andMIN_TIMER_WAITEqualTo(Long value) {
            addCriterion("MIN_TIMER_WAIT =", value, "MIN_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andMIN_TIMER_WAITNotEqualTo(Long value) {
            addCriterion("MIN_TIMER_WAIT <>", value, "MIN_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andMIN_TIMER_WAITGreaterThan(Long value) {
            addCriterion("MIN_TIMER_WAIT >", value, "MIN_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andMIN_TIMER_WAITGreaterThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_WAIT >=", value, "MIN_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andMIN_TIMER_WAITLessThan(Long value) {
            addCriterion("MIN_TIMER_WAIT <", value, "MIN_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andMIN_TIMER_WAITLessThanOrEqualTo(Long value) {
            addCriterion("MIN_TIMER_WAIT <=", value, "MIN_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andMIN_TIMER_WAITIn(List<Long> values) {
            addCriterion("MIN_TIMER_WAIT in", values, "MIN_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andMIN_TIMER_WAITNotIn(List<Long> values) {
            addCriterion("MIN_TIMER_WAIT not in", values, "MIN_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andMIN_TIMER_WAITBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_WAIT between", value1, value2, "MIN_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andMIN_TIMER_WAITNotBetween(Long value1, Long value2) {
            addCriterion("MIN_TIMER_WAIT not between", value1, value2, "MIN_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andAVG_TIMER_WAITIsNull() {
            addCriterion("AVG_TIMER_WAIT is null");
            return (Criteria) this;
        }

        public Criteria andAVG_TIMER_WAITIsNotNull() {
            addCriterion("AVG_TIMER_WAIT is not null");
            return (Criteria) this;
        }

        public Criteria andAVG_TIMER_WAITEqualTo(Long value) {
            addCriterion("AVG_TIMER_WAIT =", value, "AVG_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andAVG_TIMER_WAITNotEqualTo(Long value) {
            addCriterion("AVG_TIMER_WAIT <>", value, "AVG_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andAVG_TIMER_WAITGreaterThan(Long value) {
            addCriterion("AVG_TIMER_WAIT >", value, "AVG_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andAVG_TIMER_WAITGreaterThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_WAIT >=", value, "AVG_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andAVG_TIMER_WAITLessThan(Long value) {
            addCriterion("AVG_TIMER_WAIT <", value, "AVG_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andAVG_TIMER_WAITLessThanOrEqualTo(Long value) {
            addCriterion("AVG_TIMER_WAIT <=", value, "AVG_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andAVG_TIMER_WAITIn(List<Long> values) {
            addCriterion("AVG_TIMER_WAIT in", values, "AVG_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andAVG_TIMER_WAITNotIn(List<Long> values) {
            addCriterion("AVG_TIMER_WAIT not in", values, "AVG_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andAVG_TIMER_WAITBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_WAIT between", value1, value2, "AVG_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andAVG_TIMER_WAITNotBetween(Long value1, Long value2) {
            addCriterion("AVG_TIMER_WAIT not between", value1, value2, "AVG_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMER_WAITIsNull() {
            addCriterion("MAX_TIMER_WAIT is null");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMER_WAITIsNotNull() {
            addCriterion("MAX_TIMER_WAIT is not null");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMER_WAITEqualTo(Long value) {
            addCriterion("MAX_TIMER_WAIT =", value, "MAX_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMER_WAITNotEqualTo(Long value) {
            addCriterion("MAX_TIMER_WAIT <>", value, "MAX_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMER_WAITGreaterThan(Long value) {
            addCriterion("MAX_TIMER_WAIT >", value, "MAX_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMER_WAITGreaterThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_WAIT >=", value, "MAX_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMER_WAITLessThan(Long value) {
            addCriterion("MAX_TIMER_WAIT <", value, "MAX_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMER_WAITLessThanOrEqualTo(Long value) {
            addCriterion("MAX_TIMER_WAIT <=", value, "MAX_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMER_WAITIn(List<Long> values) {
            addCriterion("MAX_TIMER_WAIT in", values, "MAX_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMER_WAITNotIn(List<Long> values) {
            addCriterion("MAX_TIMER_WAIT not in", values, "MAX_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMER_WAITBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_WAIT between", value1, value2, "MAX_TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andMAX_TIMER_WAITNotBetween(Long value1, Long value2) {
            addCriterion("MAX_TIMER_WAIT not between", value1, value2, "MAX_TIMER_WAIT");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table events_waits_summary_by_user_by_event_name
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
     * This class corresponds to the database table events_waits_summary_by_user_by_event_name
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