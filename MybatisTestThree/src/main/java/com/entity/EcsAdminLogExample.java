package com.entity;

import java.util.ArrayList;
import java.util.List;

public class EcsAdminLogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_admin_log
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_admin_log
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_admin_log
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_admin_log
     *
     * @mbg.generated
     */
    public EcsAdminLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_admin_log
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_admin_log
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_admin_log
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_admin_log
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_admin_log
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_admin_log
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_admin_log
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
     * This method corresponds to the database table ecs_admin_log
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
     * This method corresponds to the database table ecs_admin_log
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_admin_log
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
     * This class corresponds to the database table ecs_admin_log
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

        public Criteria andLog_idIsNull() {
            addCriterion("log_id is null");
            return (Criteria) this;
        }

        public Criteria andLog_idIsNotNull() {
            addCriterion("log_id is not null");
            return (Criteria) this;
        }

        public Criteria andLog_idEqualTo(Integer value) {
            addCriterion("log_id =", value, "log_id");
            return (Criteria) this;
        }

        public Criteria andLog_idNotEqualTo(Integer value) {
            addCriterion("log_id <>", value, "log_id");
            return (Criteria) this;
        }

        public Criteria andLog_idGreaterThan(Integer value) {
            addCriterion("log_id >", value, "log_id");
            return (Criteria) this;
        }

        public Criteria andLog_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_id >=", value, "log_id");
            return (Criteria) this;
        }

        public Criteria andLog_idLessThan(Integer value) {
            addCriterion("log_id <", value, "log_id");
            return (Criteria) this;
        }

        public Criteria andLog_idLessThanOrEqualTo(Integer value) {
            addCriterion("log_id <=", value, "log_id");
            return (Criteria) this;
        }

        public Criteria andLog_idIn(List<Integer> values) {
            addCriterion("log_id in", values, "log_id");
            return (Criteria) this;
        }

        public Criteria andLog_idNotIn(List<Integer> values) {
            addCriterion("log_id not in", values, "log_id");
            return (Criteria) this;
        }

        public Criteria andLog_idBetween(Integer value1, Integer value2) {
            addCriterion("log_id between", value1, value2, "log_id");
            return (Criteria) this;
        }

        public Criteria andLog_idNotBetween(Integer value1, Integer value2) {
            addCriterion("log_id not between", value1, value2, "log_id");
            return (Criteria) this;
        }

        public Criteria andLog_timeIsNull() {
            addCriterion("log_time is null");
            return (Criteria) this;
        }

        public Criteria andLog_timeIsNotNull() {
            addCriterion("log_time is not null");
            return (Criteria) this;
        }

        public Criteria andLog_timeEqualTo(Integer value) {
            addCriterion("log_time =", value, "log_time");
            return (Criteria) this;
        }

        public Criteria andLog_timeNotEqualTo(Integer value) {
            addCriterion("log_time <>", value, "log_time");
            return (Criteria) this;
        }

        public Criteria andLog_timeGreaterThan(Integer value) {
            addCriterion("log_time >", value, "log_time");
            return (Criteria) this;
        }

        public Criteria andLog_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_time >=", value, "log_time");
            return (Criteria) this;
        }

        public Criteria andLog_timeLessThan(Integer value) {
            addCriterion("log_time <", value, "log_time");
            return (Criteria) this;
        }

        public Criteria andLog_timeLessThanOrEqualTo(Integer value) {
            addCriterion("log_time <=", value, "log_time");
            return (Criteria) this;
        }

        public Criteria andLog_timeIn(List<Integer> values) {
            addCriterion("log_time in", values, "log_time");
            return (Criteria) this;
        }

        public Criteria andLog_timeNotIn(List<Integer> values) {
            addCriterion("log_time not in", values, "log_time");
            return (Criteria) this;
        }

        public Criteria andLog_timeBetween(Integer value1, Integer value2) {
            addCriterion("log_time between", value1, value2, "log_time");
            return (Criteria) this;
        }

        public Criteria andLog_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("log_time not between", value1, value2, "log_time");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Byte value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Byte value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Byte value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Byte value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Byte value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Byte> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Byte> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Byte value1, Byte value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Byte value1, Byte value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andLog_infoIsNull() {
            addCriterion("log_info is null");
            return (Criteria) this;
        }

        public Criteria andLog_infoIsNotNull() {
            addCriterion("log_info is not null");
            return (Criteria) this;
        }

        public Criteria andLog_infoEqualTo(String value) {
            addCriterion("log_info =", value, "log_info");
            return (Criteria) this;
        }

        public Criteria andLog_infoNotEqualTo(String value) {
            addCriterion("log_info <>", value, "log_info");
            return (Criteria) this;
        }

        public Criteria andLog_infoGreaterThan(String value) {
            addCriterion("log_info >", value, "log_info");
            return (Criteria) this;
        }

        public Criteria andLog_infoGreaterThanOrEqualTo(String value) {
            addCriterion("log_info >=", value, "log_info");
            return (Criteria) this;
        }

        public Criteria andLog_infoLessThan(String value) {
            addCriterion("log_info <", value, "log_info");
            return (Criteria) this;
        }

        public Criteria andLog_infoLessThanOrEqualTo(String value) {
            addCriterion("log_info <=", value, "log_info");
            return (Criteria) this;
        }

        public Criteria andLog_infoLike(String value) {
            addCriterion("log_info like", value, "log_info");
            return (Criteria) this;
        }

        public Criteria andLog_infoNotLike(String value) {
            addCriterion("log_info not like", value, "log_info");
            return (Criteria) this;
        }

        public Criteria andLog_infoIn(List<String> values) {
            addCriterion("log_info in", values, "log_info");
            return (Criteria) this;
        }

        public Criteria andLog_infoNotIn(List<String> values) {
            addCriterion("log_info not in", values, "log_info");
            return (Criteria) this;
        }

        public Criteria andLog_infoBetween(String value1, String value2) {
            addCriterion("log_info between", value1, value2, "log_info");
            return (Criteria) this;
        }

        public Criteria andLog_infoNotBetween(String value1, String value2) {
            addCriterion("log_info not between", value1, value2, "log_info");
            return (Criteria) this;
        }

        public Criteria andIp_addressIsNull() {
            addCriterion("ip_address is null");
            return (Criteria) this;
        }

        public Criteria andIp_addressIsNotNull() {
            addCriterion("ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andIp_addressEqualTo(String value) {
            addCriterion("ip_address =", value, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressNotEqualTo(String value) {
            addCriterion("ip_address <>", value, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressGreaterThan(String value) {
            addCriterion("ip_address >", value, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressGreaterThanOrEqualTo(String value) {
            addCriterion("ip_address >=", value, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressLessThan(String value) {
            addCriterion("ip_address <", value, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressLessThanOrEqualTo(String value) {
            addCriterion("ip_address <=", value, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressLike(String value) {
            addCriterion("ip_address like", value, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressNotLike(String value) {
            addCriterion("ip_address not like", value, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressIn(List<String> values) {
            addCriterion("ip_address in", values, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressNotIn(List<String> values) {
            addCriterion("ip_address not in", values, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressBetween(String value1, String value2) {
            addCriterion("ip_address between", value1, value2, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressNotBetween(String value1, String value2) {
            addCriterion("ip_address not between", value1, value2, "ip_address");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_admin_log
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
     * This class corresponds to the database table ecs_admin_log
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