package com.entity;

import java.util.ArrayList;
import java.util.List;

public class EventsStagesHistoryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table events_stages_history
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table events_stages_history
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table events_stages_history
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_history
     *
     * @mbg.generated
     */
    public EventsStagesHistoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_history
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_history
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_history
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_history
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_history
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_history
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_history
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
     * This method corresponds to the database table events_stages_history
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
     * This method corresponds to the database table events_stages_history
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_history
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
     * This class corresponds to the database table events_stages_history
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

        public Criteria andTHREAD_IDIsNull() {
            addCriterion("THREAD_ID is null");
            return (Criteria) this;
        }

        public Criteria andTHREAD_IDIsNotNull() {
            addCriterion("THREAD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTHREAD_IDEqualTo(Long value) {
            addCriterion("THREAD_ID =", value, "THREAD_ID");
            return (Criteria) this;
        }

        public Criteria andTHREAD_IDNotEqualTo(Long value) {
            addCriterion("THREAD_ID <>", value, "THREAD_ID");
            return (Criteria) this;
        }

        public Criteria andTHREAD_IDGreaterThan(Long value) {
            addCriterion("THREAD_ID >", value, "THREAD_ID");
            return (Criteria) this;
        }

        public Criteria andTHREAD_IDGreaterThanOrEqualTo(Long value) {
            addCriterion("THREAD_ID >=", value, "THREAD_ID");
            return (Criteria) this;
        }

        public Criteria andTHREAD_IDLessThan(Long value) {
            addCriterion("THREAD_ID <", value, "THREAD_ID");
            return (Criteria) this;
        }

        public Criteria andTHREAD_IDLessThanOrEqualTo(Long value) {
            addCriterion("THREAD_ID <=", value, "THREAD_ID");
            return (Criteria) this;
        }

        public Criteria andTHREAD_IDIn(List<Long> values) {
            addCriterion("THREAD_ID in", values, "THREAD_ID");
            return (Criteria) this;
        }

        public Criteria andTHREAD_IDNotIn(List<Long> values) {
            addCriterion("THREAD_ID not in", values, "THREAD_ID");
            return (Criteria) this;
        }

        public Criteria andTHREAD_IDBetween(Long value1, Long value2) {
            addCriterion("THREAD_ID between", value1, value2, "THREAD_ID");
            return (Criteria) this;
        }

        public Criteria andTHREAD_IDNotBetween(Long value1, Long value2) {
            addCriterion("THREAD_ID not between", value1, value2, "THREAD_ID");
            return (Criteria) this;
        }

        public Criteria andEVENT_IDIsNull() {
            addCriterion("EVENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andEVENT_IDIsNotNull() {
            addCriterion("EVENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEVENT_IDEqualTo(Long value) {
            addCriterion("EVENT_ID =", value, "EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andEVENT_IDNotEqualTo(Long value) {
            addCriterion("EVENT_ID <>", value, "EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andEVENT_IDGreaterThan(Long value) {
            addCriterion("EVENT_ID >", value, "EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andEVENT_IDGreaterThanOrEqualTo(Long value) {
            addCriterion("EVENT_ID >=", value, "EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andEVENT_IDLessThan(Long value) {
            addCriterion("EVENT_ID <", value, "EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andEVENT_IDLessThanOrEqualTo(Long value) {
            addCriterion("EVENT_ID <=", value, "EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andEVENT_IDIn(List<Long> values) {
            addCriterion("EVENT_ID in", values, "EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andEVENT_IDNotIn(List<Long> values) {
            addCriterion("EVENT_ID not in", values, "EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andEVENT_IDBetween(Long value1, Long value2) {
            addCriterion("EVENT_ID between", value1, value2, "EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andEVENT_IDNotBetween(Long value1, Long value2) {
            addCriterion("EVENT_ID not between", value1, value2, "EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andEND_EVENT_IDIsNull() {
            addCriterion("END_EVENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andEND_EVENT_IDIsNotNull() {
            addCriterion("END_EVENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEND_EVENT_IDEqualTo(Long value) {
            addCriterion("END_EVENT_ID =", value, "END_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andEND_EVENT_IDNotEqualTo(Long value) {
            addCriterion("END_EVENT_ID <>", value, "END_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andEND_EVENT_IDGreaterThan(Long value) {
            addCriterion("END_EVENT_ID >", value, "END_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andEND_EVENT_IDGreaterThanOrEqualTo(Long value) {
            addCriterion("END_EVENT_ID >=", value, "END_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andEND_EVENT_IDLessThan(Long value) {
            addCriterion("END_EVENT_ID <", value, "END_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andEND_EVENT_IDLessThanOrEqualTo(Long value) {
            addCriterion("END_EVENT_ID <=", value, "END_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andEND_EVENT_IDIn(List<Long> values) {
            addCriterion("END_EVENT_ID in", values, "END_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andEND_EVENT_IDNotIn(List<Long> values) {
            addCriterion("END_EVENT_ID not in", values, "END_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andEND_EVENT_IDBetween(Long value1, Long value2) {
            addCriterion("END_EVENT_ID between", value1, value2, "END_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andEND_EVENT_IDNotBetween(Long value1, Long value2) {
            addCriterion("END_EVENT_ID not between", value1, value2, "END_EVENT_ID");
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

        public Criteria andSOURCEIsNull() {
            addCriterion("SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSOURCEIsNotNull() {
            addCriterion("SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSOURCEEqualTo(String value) {
            addCriterion("SOURCE =", value, "SOURCE");
            return (Criteria) this;
        }

        public Criteria andSOURCENotEqualTo(String value) {
            addCriterion("SOURCE <>", value, "SOURCE");
            return (Criteria) this;
        }

        public Criteria andSOURCEGreaterThan(String value) {
            addCriterion("SOURCE >", value, "SOURCE");
            return (Criteria) this;
        }

        public Criteria andSOURCEGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE >=", value, "SOURCE");
            return (Criteria) this;
        }

        public Criteria andSOURCELessThan(String value) {
            addCriterion("SOURCE <", value, "SOURCE");
            return (Criteria) this;
        }

        public Criteria andSOURCELessThanOrEqualTo(String value) {
            addCriterion("SOURCE <=", value, "SOURCE");
            return (Criteria) this;
        }

        public Criteria andSOURCELike(String value) {
            addCriterion("SOURCE like", value, "SOURCE");
            return (Criteria) this;
        }

        public Criteria andSOURCENotLike(String value) {
            addCriterion("SOURCE not like", value, "SOURCE");
            return (Criteria) this;
        }

        public Criteria andSOURCEIn(List<String> values) {
            addCriterion("SOURCE in", values, "SOURCE");
            return (Criteria) this;
        }

        public Criteria andSOURCENotIn(List<String> values) {
            addCriterion("SOURCE not in", values, "SOURCE");
            return (Criteria) this;
        }

        public Criteria andSOURCEBetween(String value1, String value2) {
            addCriterion("SOURCE between", value1, value2, "SOURCE");
            return (Criteria) this;
        }

        public Criteria andSOURCENotBetween(String value1, String value2) {
            addCriterion("SOURCE not between", value1, value2, "SOURCE");
            return (Criteria) this;
        }

        public Criteria andTIMER_STARTIsNull() {
            addCriterion("TIMER_START is null");
            return (Criteria) this;
        }

        public Criteria andTIMER_STARTIsNotNull() {
            addCriterion("TIMER_START is not null");
            return (Criteria) this;
        }

        public Criteria andTIMER_STARTEqualTo(Long value) {
            addCriterion("TIMER_START =", value, "TIMER_START");
            return (Criteria) this;
        }

        public Criteria andTIMER_STARTNotEqualTo(Long value) {
            addCriterion("TIMER_START <>", value, "TIMER_START");
            return (Criteria) this;
        }

        public Criteria andTIMER_STARTGreaterThan(Long value) {
            addCriterion("TIMER_START >", value, "TIMER_START");
            return (Criteria) this;
        }

        public Criteria andTIMER_STARTGreaterThanOrEqualTo(Long value) {
            addCriterion("TIMER_START >=", value, "TIMER_START");
            return (Criteria) this;
        }

        public Criteria andTIMER_STARTLessThan(Long value) {
            addCriterion("TIMER_START <", value, "TIMER_START");
            return (Criteria) this;
        }

        public Criteria andTIMER_STARTLessThanOrEqualTo(Long value) {
            addCriterion("TIMER_START <=", value, "TIMER_START");
            return (Criteria) this;
        }

        public Criteria andTIMER_STARTIn(List<Long> values) {
            addCriterion("TIMER_START in", values, "TIMER_START");
            return (Criteria) this;
        }

        public Criteria andTIMER_STARTNotIn(List<Long> values) {
            addCriterion("TIMER_START not in", values, "TIMER_START");
            return (Criteria) this;
        }

        public Criteria andTIMER_STARTBetween(Long value1, Long value2) {
            addCriterion("TIMER_START between", value1, value2, "TIMER_START");
            return (Criteria) this;
        }

        public Criteria andTIMER_STARTNotBetween(Long value1, Long value2) {
            addCriterion("TIMER_START not between", value1, value2, "TIMER_START");
            return (Criteria) this;
        }

        public Criteria andTIMER_ENDIsNull() {
            addCriterion("TIMER_END is null");
            return (Criteria) this;
        }

        public Criteria andTIMER_ENDIsNotNull() {
            addCriterion("TIMER_END is not null");
            return (Criteria) this;
        }

        public Criteria andTIMER_ENDEqualTo(Long value) {
            addCriterion("TIMER_END =", value, "TIMER_END");
            return (Criteria) this;
        }

        public Criteria andTIMER_ENDNotEqualTo(Long value) {
            addCriterion("TIMER_END <>", value, "TIMER_END");
            return (Criteria) this;
        }

        public Criteria andTIMER_ENDGreaterThan(Long value) {
            addCriterion("TIMER_END >", value, "TIMER_END");
            return (Criteria) this;
        }

        public Criteria andTIMER_ENDGreaterThanOrEqualTo(Long value) {
            addCriterion("TIMER_END >=", value, "TIMER_END");
            return (Criteria) this;
        }

        public Criteria andTIMER_ENDLessThan(Long value) {
            addCriterion("TIMER_END <", value, "TIMER_END");
            return (Criteria) this;
        }

        public Criteria andTIMER_ENDLessThanOrEqualTo(Long value) {
            addCriterion("TIMER_END <=", value, "TIMER_END");
            return (Criteria) this;
        }

        public Criteria andTIMER_ENDIn(List<Long> values) {
            addCriterion("TIMER_END in", values, "TIMER_END");
            return (Criteria) this;
        }

        public Criteria andTIMER_ENDNotIn(List<Long> values) {
            addCriterion("TIMER_END not in", values, "TIMER_END");
            return (Criteria) this;
        }

        public Criteria andTIMER_ENDBetween(Long value1, Long value2) {
            addCriterion("TIMER_END between", value1, value2, "TIMER_END");
            return (Criteria) this;
        }

        public Criteria andTIMER_ENDNotBetween(Long value1, Long value2) {
            addCriterion("TIMER_END not between", value1, value2, "TIMER_END");
            return (Criteria) this;
        }

        public Criteria andTIMER_WAITIsNull() {
            addCriterion("TIMER_WAIT is null");
            return (Criteria) this;
        }

        public Criteria andTIMER_WAITIsNotNull() {
            addCriterion("TIMER_WAIT is not null");
            return (Criteria) this;
        }

        public Criteria andTIMER_WAITEqualTo(Long value) {
            addCriterion("TIMER_WAIT =", value, "TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andTIMER_WAITNotEqualTo(Long value) {
            addCriterion("TIMER_WAIT <>", value, "TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andTIMER_WAITGreaterThan(Long value) {
            addCriterion("TIMER_WAIT >", value, "TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andTIMER_WAITGreaterThanOrEqualTo(Long value) {
            addCriterion("TIMER_WAIT >=", value, "TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andTIMER_WAITLessThan(Long value) {
            addCriterion("TIMER_WAIT <", value, "TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andTIMER_WAITLessThanOrEqualTo(Long value) {
            addCriterion("TIMER_WAIT <=", value, "TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andTIMER_WAITIn(List<Long> values) {
            addCriterion("TIMER_WAIT in", values, "TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andTIMER_WAITNotIn(List<Long> values) {
            addCriterion("TIMER_WAIT not in", values, "TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andTIMER_WAITBetween(Long value1, Long value2) {
            addCriterion("TIMER_WAIT between", value1, value2, "TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andTIMER_WAITNotBetween(Long value1, Long value2) {
            addCriterion("TIMER_WAIT not between", value1, value2, "TIMER_WAIT");
            return (Criteria) this;
        }

        public Criteria andWORK_COMPLETEDIsNull() {
            addCriterion("WORK_COMPLETED is null");
            return (Criteria) this;
        }

        public Criteria andWORK_COMPLETEDIsNotNull() {
            addCriterion("WORK_COMPLETED is not null");
            return (Criteria) this;
        }

        public Criteria andWORK_COMPLETEDEqualTo(Long value) {
            addCriterion("WORK_COMPLETED =", value, "WORK_COMPLETED");
            return (Criteria) this;
        }

        public Criteria andWORK_COMPLETEDNotEqualTo(Long value) {
            addCriterion("WORK_COMPLETED <>", value, "WORK_COMPLETED");
            return (Criteria) this;
        }

        public Criteria andWORK_COMPLETEDGreaterThan(Long value) {
            addCriterion("WORK_COMPLETED >", value, "WORK_COMPLETED");
            return (Criteria) this;
        }

        public Criteria andWORK_COMPLETEDGreaterThanOrEqualTo(Long value) {
            addCriterion("WORK_COMPLETED >=", value, "WORK_COMPLETED");
            return (Criteria) this;
        }

        public Criteria andWORK_COMPLETEDLessThan(Long value) {
            addCriterion("WORK_COMPLETED <", value, "WORK_COMPLETED");
            return (Criteria) this;
        }

        public Criteria andWORK_COMPLETEDLessThanOrEqualTo(Long value) {
            addCriterion("WORK_COMPLETED <=", value, "WORK_COMPLETED");
            return (Criteria) this;
        }

        public Criteria andWORK_COMPLETEDIn(List<Long> values) {
            addCriterion("WORK_COMPLETED in", values, "WORK_COMPLETED");
            return (Criteria) this;
        }

        public Criteria andWORK_COMPLETEDNotIn(List<Long> values) {
            addCriterion("WORK_COMPLETED not in", values, "WORK_COMPLETED");
            return (Criteria) this;
        }

        public Criteria andWORK_COMPLETEDBetween(Long value1, Long value2) {
            addCriterion("WORK_COMPLETED between", value1, value2, "WORK_COMPLETED");
            return (Criteria) this;
        }

        public Criteria andWORK_COMPLETEDNotBetween(Long value1, Long value2) {
            addCriterion("WORK_COMPLETED not between", value1, value2, "WORK_COMPLETED");
            return (Criteria) this;
        }

        public Criteria andWORK_ESTIMATEDIsNull() {
            addCriterion("WORK_ESTIMATED is null");
            return (Criteria) this;
        }

        public Criteria andWORK_ESTIMATEDIsNotNull() {
            addCriterion("WORK_ESTIMATED is not null");
            return (Criteria) this;
        }

        public Criteria andWORK_ESTIMATEDEqualTo(Long value) {
            addCriterion("WORK_ESTIMATED =", value, "WORK_ESTIMATED");
            return (Criteria) this;
        }

        public Criteria andWORK_ESTIMATEDNotEqualTo(Long value) {
            addCriterion("WORK_ESTIMATED <>", value, "WORK_ESTIMATED");
            return (Criteria) this;
        }

        public Criteria andWORK_ESTIMATEDGreaterThan(Long value) {
            addCriterion("WORK_ESTIMATED >", value, "WORK_ESTIMATED");
            return (Criteria) this;
        }

        public Criteria andWORK_ESTIMATEDGreaterThanOrEqualTo(Long value) {
            addCriterion("WORK_ESTIMATED >=", value, "WORK_ESTIMATED");
            return (Criteria) this;
        }

        public Criteria andWORK_ESTIMATEDLessThan(Long value) {
            addCriterion("WORK_ESTIMATED <", value, "WORK_ESTIMATED");
            return (Criteria) this;
        }

        public Criteria andWORK_ESTIMATEDLessThanOrEqualTo(Long value) {
            addCriterion("WORK_ESTIMATED <=", value, "WORK_ESTIMATED");
            return (Criteria) this;
        }

        public Criteria andWORK_ESTIMATEDIn(List<Long> values) {
            addCriterion("WORK_ESTIMATED in", values, "WORK_ESTIMATED");
            return (Criteria) this;
        }

        public Criteria andWORK_ESTIMATEDNotIn(List<Long> values) {
            addCriterion("WORK_ESTIMATED not in", values, "WORK_ESTIMATED");
            return (Criteria) this;
        }

        public Criteria andWORK_ESTIMATEDBetween(Long value1, Long value2) {
            addCriterion("WORK_ESTIMATED between", value1, value2, "WORK_ESTIMATED");
            return (Criteria) this;
        }

        public Criteria andWORK_ESTIMATEDNotBetween(Long value1, Long value2) {
            addCriterion("WORK_ESTIMATED not between", value1, value2, "WORK_ESTIMATED");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_IDIsNull() {
            addCriterion("NESTING_EVENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_IDIsNotNull() {
            addCriterion("NESTING_EVENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_IDEqualTo(Long value) {
            addCriterion("NESTING_EVENT_ID =", value, "NESTING_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_IDNotEqualTo(Long value) {
            addCriterion("NESTING_EVENT_ID <>", value, "NESTING_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_IDGreaterThan(Long value) {
            addCriterion("NESTING_EVENT_ID >", value, "NESTING_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_IDGreaterThanOrEqualTo(Long value) {
            addCriterion("NESTING_EVENT_ID >=", value, "NESTING_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_IDLessThan(Long value) {
            addCriterion("NESTING_EVENT_ID <", value, "NESTING_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_IDLessThanOrEqualTo(Long value) {
            addCriterion("NESTING_EVENT_ID <=", value, "NESTING_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_IDIn(List<Long> values) {
            addCriterion("NESTING_EVENT_ID in", values, "NESTING_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_IDNotIn(List<Long> values) {
            addCriterion("NESTING_EVENT_ID not in", values, "NESTING_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_IDBetween(Long value1, Long value2) {
            addCriterion("NESTING_EVENT_ID between", value1, value2, "NESTING_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_IDNotBetween(Long value1, Long value2) {
            addCriterion("NESTING_EVENT_ID not between", value1, value2, "NESTING_EVENT_ID");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_TYPEIsNull() {
            addCriterion("NESTING_EVENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_TYPEIsNotNull() {
            addCriterion("NESTING_EVENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_TYPEEqualTo(String value) {
            addCriterion("NESTING_EVENT_TYPE =", value, "NESTING_EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_TYPENotEqualTo(String value) {
            addCriterion("NESTING_EVENT_TYPE <>", value, "NESTING_EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_TYPEGreaterThan(String value) {
            addCriterion("NESTING_EVENT_TYPE >", value, "NESTING_EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("NESTING_EVENT_TYPE >=", value, "NESTING_EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_TYPELessThan(String value) {
            addCriterion("NESTING_EVENT_TYPE <", value, "NESTING_EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_TYPELessThanOrEqualTo(String value) {
            addCriterion("NESTING_EVENT_TYPE <=", value, "NESTING_EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_TYPELike(String value) {
            addCriterion("NESTING_EVENT_TYPE like", value, "NESTING_EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_TYPENotLike(String value) {
            addCriterion("NESTING_EVENT_TYPE not like", value, "NESTING_EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_TYPEIn(List<String> values) {
            addCriterion("NESTING_EVENT_TYPE in", values, "NESTING_EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_TYPENotIn(List<String> values) {
            addCriterion("NESTING_EVENT_TYPE not in", values, "NESTING_EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_TYPEBetween(String value1, String value2) {
            addCriterion("NESTING_EVENT_TYPE between", value1, value2, "NESTING_EVENT_TYPE");
            return (Criteria) this;
        }

        public Criteria andNESTING_EVENT_TYPENotBetween(String value1, String value2) {
            addCriterion("NESTING_EVENT_TYPE not between", value1, value2, "NESTING_EVENT_TYPE");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table events_stages_history
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
     * This class corresponds to the database table events_stages_history
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