package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GeneralLogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table general_log
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table general_log
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table general_log
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table general_log
     *
     * @mbg.generated
     */
    public GeneralLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table general_log
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table general_log
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table general_log
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table general_log
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table general_log
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table general_log
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table general_log
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
     * This method corresponds to the database table general_log
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
     * This method corresponds to the database table general_log
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table general_log
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
     * This class corresponds to the database table general_log
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

        public Criteria andEvent_timeIsNull() {
            addCriterion("event_time is null");
            return (Criteria) this;
        }

        public Criteria andEvent_timeIsNotNull() {
            addCriterion("event_time is not null");
            return (Criteria) this;
        }

        public Criteria andEvent_timeEqualTo(Date value) {
            addCriterion("event_time =", value, "event_time");
            return (Criteria) this;
        }

        public Criteria andEvent_timeNotEqualTo(Date value) {
            addCriterion("event_time <>", value, "event_time");
            return (Criteria) this;
        }

        public Criteria andEvent_timeGreaterThan(Date value) {
            addCriterion("event_time >", value, "event_time");
            return (Criteria) this;
        }

        public Criteria andEvent_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("event_time >=", value, "event_time");
            return (Criteria) this;
        }

        public Criteria andEvent_timeLessThan(Date value) {
            addCriterion("event_time <", value, "event_time");
            return (Criteria) this;
        }

        public Criteria andEvent_timeLessThanOrEqualTo(Date value) {
            addCriterion("event_time <=", value, "event_time");
            return (Criteria) this;
        }

        public Criteria andEvent_timeIn(List<Date> values) {
            addCriterion("event_time in", values, "event_time");
            return (Criteria) this;
        }

        public Criteria andEvent_timeNotIn(List<Date> values) {
            addCriterion("event_time not in", values, "event_time");
            return (Criteria) this;
        }

        public Criteria andEvent_timeBetween(Date value1, Date value2) {
            addCriterion("event_time between", value1, value2, "event_time");
            return (Criteria) this;
        }

        public Criteria andEvent_timeNotBetween(Date value1, Date value2) {
            addCriterion("event_time not between", value1, value2, "event_time");
            return (Criteria) this;
        }

        public Criteria andThread_idIsNull() {
            addCriterion("thread_id is null");
            return (Criteria) this;
        }

        public Criteria andThread_idIsNotNull() {
            addCriterion("thread_id is not null");
            return (Criteria) this;
        }

        public Criteria andThread_idEqualTo(Long value) {
            addCriterion("thread_id =", value, "thread_id");
            return (Criteria) this;
        }

        public Criteria andThread_idNotEqualTo(Long value) {
            addCriterion("thread_id <>", value, "thread_id");
            return (Criteria) this;
        }

        public Criteria andThread_idGreaterThan(Long value) {
            addCriterion("thread_id >", value, "thread_id");
            return (Criteria) this;
        }

        public Criteria andThread_idGreaterThanOrEqualTo(Long value) {
            addCriterion("thread_id >=", value, "thread_id");
            return (Criteria) this;
        }

        public Criteria andThread_idLessThan(Long value) {
            addCriterion("thread_id <", value, "thread_id");
            return (Criteria) this;
        }

        public Criteria andThread_idLessThanOrEqualTo(Long value) {
            addCriterion("thread_id <=", value, "thread_id");
            return (Criteria) this;
        }

        public Criteria andThread_idIn(List<Long> values) {
            addCriterion("thread_id in", values, "thread_id");
            return (Criteria) this;
        }

        public Criteria andThread_idNotIn(List<Long> values) {
            addCriterion("thread_id not in", values, "thread_id");
            return (Criteria) this;
        }

        public Criteria andThread_idBetween(Long value1, Long value2) {
            addCriterion("thread_id between", value1, value2, "thread_id");
            return (Criteria) this;
        }

        public Criteria andThread_idNotBetween(Long value1, Long value2) {
            addCriterion("thread_id not between", value1, value2, "thread_id");
            return (Criteria) this;
        }

        public Criteria andServer_idIsNull() {
            addCriterion("server_id is null");
            return (Criteria) this;
        }

        public Criteria andServer_idIsNotNull() {
            addCriterion("server_id is not null");
            return (Criteria) this;
        }

        public Criteria andServer_idEqualTo(Integer value) {
            addCriterion("server_id =", value, "server_id");
            return (Criteria) this;
        }

        public Criteria andServer_idNotEqualTo(Integer value) {
            addCriterion("server_id <>", value, "server_id");
            return (Criteria) this;
        }

        public Criteria andServer_idGreaterThan(Integer value) {
            addCriterion("server_id >", value, "server_id");
            return (Criteria) this;
        }

        public Criteria andServer_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("server_id >=", value, "server_id");
            return (Criteria) this;
        }

        public Criteria andServer_idLessThan(Integer value) {
            addCriterion("server_id <", value, "server_id");
            return (Criteria) this;
        }

        public Criteria andServer_idLessThanOrEqualTo(Integer value) {
            addCriterion("server_id <=", value, "server_id");
            return (Criteria) this;
        }

        public Criteria andServer_idIn(List<Integer> values) {
            addCriterion("server_id in", values, "server_id");
            return (Criteria) this;
        }

        public Criteria andServer_idNotIn(List<Integer> values) {
            addCriterion("server_id not in", values, "server_id");
            return (Criteria) this;
        }

        public Criteria andServer_idBetween(Integer value1, Integer value2) {
            addCriterion("server_id between", value1, value2, "server_id");
            return (Criteria) this;
        }

        public Criteria andServer_idNotBetween(Integer value1, Integer value2) {
            addCriterion("server_id not between", value1, value2, "server_id");
            return (Criteria) this;
        }

        public Criteria andCommand_typeIsNull() {
            addCriterion("command_type is null");
            return (Criteria) this;
        }

        public Criteria andCommand_typeIsNotNull() {
            addCriterion("command_type is not null");
            return (Criteria) this;
        }

        public Criteria andCommand_typeEqualTo(String value) {
            addCriterion("command_type =", value, "command_type");
            return (Criteria) this;
        }

        public Criteria andCommand_typeNotEqualTo(String value) {
            addCriterion("command_type <>", value, "command_type");
            return (Criteria) this;
        }

        public Criteria andCommand_typeGreaterThan(String value) {
            addCriterion("command_type >", value, "command_type");
            return (Criteria) this;
        }

        public Criteria andCommand_typeGreaterThanOrEqualTo(String value) {
            addCriterion("command_type >=", value, "command_type");
            return (Criteria) this;
        }

        public Criteria andCommand_typeLessThan(String value) {
            addCriterion("command_type <", value, "command_type");
            return (Criteria) this;
        }

        public Criteria andCommand_typeLessThanOrEqualTo(String value) {
            addCriterion("command_type <=", value, "command_type");
            return (Criteria) this;
        }

        public Criteria andCommand_typeLike(String value) {
            addCriterion("command_type like", value, "command_type");
            return (Criteria) this;
        }

        public Criteria andCommand_typeNotLike(String value) {
            addCriterion("command_type not like", value, "command_type");
            return (Criteria) this;
        }

        public Criteria andCommand_typeIn(List<String> values) {
            addCriterion("command_type in", values, "command_type");
            return (Criteria) this;
        }

        public Criteria andCommand_typeNotIn(List<String> values) {
            addCriterion("command_type not in", values, "command_type");
            return (Criteria) this;
        }

        public Criteria andCommand_typeBetween(String value1, String value2) {
            addCriterion("command_type between", value1, value2, "command_type");
            return (Criteria) this;
        }

        public Criteria andCommand_typeNotBetween(String value1, String value2) {
            addCriterion("command_type not between", value1, value2, "command_type");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table general_log
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
     * This class corresponds to the database table general_log
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