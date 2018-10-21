package com.entity;

import java.util.ArrayList;
import java.util.List;

public class SlaveRelayLogInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table slave_relay_log_info
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table slave_relay_log_info
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table slave_relay_log_info
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_relay_log_info
     *
     * @mbg.generated
     */
    public SlaveRelayLogInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_relay_log_info
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_relay_log_info
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_relay_log_info
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_relay_log_info
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_relay_log_info
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_relay_log_info
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_relay_log_info
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
     * This method corresponds to the database table slave_relay_log_info
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
     * This method corresponds to the database table slave_relay_log_info
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_relay_log_info
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
     * This class corresponds to the database table slave_relay_log_info
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

        public Criteria andChannel_nameIsNull() {
            addCriterion("Channel_name is null");
            return (Criteria) this;
        }

        public Criteria andChannel_nameIsNotNull() {
            addCriterion("Channel_name is not null");
            return (Criteria) this;
        }

        public Criteria andChannel_nameEqualTo(String value) {
            addCriterion("Channel_name =", value, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameNotEqualTo(String value) {
            addCriterion("Channel_name <>", value, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameGreaterThan(String value) {
            addCriterion("Channel_name >", value, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameGreaterThanOrEqualTo(String value) {
            addCriterion("Channel_name >=", value, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameLessThan(String value) {
            addCriterion("Channel_name <", value, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameLessThanOrEqualTo(String value) {
            addCriterion("Channel_name <=", value, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameLike(String value) {
            addCriterion("Channel_name like", value, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameNotLike(String value) {
            addCriterion("Channel_name not like", value, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameIn(List<String> values) {
            addCriterion("Channel_name in", values, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameNotIn(List<String> values) {
            addCriterion("Channel_name not in", values, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameBetween(String value1, String value2) {
            addCriterion("Channel_name between", value1, value2, "channel_name");
            return (Criteria) this;
        }

        public Criteria andChannel_nameNotBetween(String value1, String value2) {
            addCriterion("Channel_name not between", value1, value2, "channel_name");
            return (Criteria) this;
        }

        public Criteria andNumber_of_linesIsNull() {
            addCriterion("Number_of_lines is null");
            return (Criteria) this;
        }

        public Criteria andNumber_of_linesIsNotNull() {
            addCriterion("Number_of_lines is not null");
            return (Criteria) this;
        }

        public Criteria andNumber_of_linesEqualTo(Integer value) {
            addCriterion("Number_of_lines =", value, "number_of_lines");
            return (Criteria) this;
        }

        public Criteria andNumber_of_linesNotEqualTo(Integer value) {
            addCriterion("Number_of_lines <>", value, "number_of_lines");
            return (Criteria) this;
        }

        public Criteria andNumber_of_linesGreaterThan(Integer value) {
            addCriterion("Number_of_lines >", value, "number_of_lines");
            return (Criteria) this;
        }

        public Criteria andNumber_of_linesGreaterThanOrEqualTo(Integer value) {
            addCriterion("Number_of_lines >=", value, "number_of_lines");
            return (Criteria) this;
        }

        public Criteria andNumber_of_linesLessThan(Integer value) {
            addCriterion("Number_of_lines <", value, "number_of_lines");
            return (Criteria) this;
        }

        public Criteria andNumber_of_linesLessThanOrEqualTo(Integer value) {
            addCriterion("Number_of_lines <=", value, "number_of_lines");
            return (Criteria) this;
        }

        public Criteria andNumber_of_linesIn(List<Integer> values) {
            addCriterion("Number_of_lines in", values, "number_of_lines");
            return (Criteria) this;
        }

        public Criteria andNumber_of_linesNotIn(List<Integer> values) {
            addCriterion("Number_of_lines not in", values, "number_of_lines");
            return (Criteria) this;
        }

        public Criteria andNumber_of_linesBetween(Integer value1, Integer value2) {
            addCriterion("Number_of_lines between", value1, value2, "number_of_lines");
            return (Criteria) this;
        }

        public Criteria andNumber_of_linesNotBetween(Integer value1, Integer value2) {
            addCriterion("Number_of_lines not between", value1, value2, "number_of_lines");
            return (Criteria) this;
        }

        public Criteria andRelay_log_posIsNull() {
            addCriterion("Relay_log_pos is null");
            return (Criteria) this;
        }

        public Criteria andRelay_log_posIsNotNull() {
            addCriterion("Relay_log_pos is not null");
            return (Criteria) this;
        }

        public Criteria andRelay_log_posEqualTo(Long value) {
            addCriterion("Relay_log_pos =", value, "relay_log_pos");
            return (Criteria) this;
        }

        public Criteria andRelay_log_posNotEqualTo(Long value) {
            addCriterion("Relay_log_pos <>", value, "relay_log_pos");
            return (Criteria) this;
        }

        public Criteria andRelay_log_posGreaterThan(Long value) {
            addCriterion("Relay_log_pos >", value, "relay_log_pos");
            return (Criteria) this;
        }

        public Criteria andRelay_log_posGreaterThanOrEqualTo(Long value) {
            addCriterion("Relay_log_pos >=", value, "relay_log_pos");
            return (Criteria) this;
        }

        public Criteria andRelay_log_posLessThan(Long value) {
            addCriterion("Relay_log_pos <", value, "relay_log_pos");
            return (Criteria) this;
        }

        public Criteria andRelay_log_posLessThanOrEqualTo(Long value) {
            addCriterion("Relay_log_pos <=", value, "relay_log_pos");
            return (Criteria) this;
        }

        public Criteria andRelay_log_posIn(List<Long> values) {
            addCriterion("Relay_log_pos in", values, "relay_log_pos");
            return (Criteria) this;
        }

        public Criteria andRelay_log_posNotIn(List<Long> values) {
            addCriterion("Relay_log_pos not in", values, "relay_log_pos");
            return (Criteria) this;
        }

        public Criteria andRelay_log_posBetween(Long value1, Long value2) {
            addCriterion("Relay_log_pos between", value1, value2, "relay_log_pos");
            return (Criteria) this;
        }

        public Criteria andRelay_log_posNotBetween(Long value1, Long value2) {
            addCriterion("Relay_log_pos not between", value1, value2, "relay_log_pos");
            return (Criteria) this;
        }

        public Criteria andMaster_log_posIsNull() {
            addCriterion("Master_log_pos is null");
            return (Criteria) this;
        }

        public Criteria andMaster_log_posIsNotNull() {
            addCriterion("Master_log_pos is not null");
            return (Criteria) this;
        }

        public Criteria andMaster_log_posEqualTo(Long value) {
            addCriterion("Master_log_pos =", value, "master_log_pos");
            return (Criteria) this;
        }

        public Criteria andMaster_log_posNotEqualTo(Long value) {
            addCriterion("Master_log_pos <>", value, "master_log_pos");
            return (Criteria) this;
        }

        public Criteria andMaster_log_posGreaterThan(Long value) {
            addCriterion("Master_log_pos >", value, "master_log_pos");
            return (Criteria) this;
        }

        public Criteria andMaster_log_posGreaterThanOrEqualTo(Long value) {
            addCriterion("Master_log_pos >=", value, "master_log_pos");
            return (Criteria) this;
        }

        public Criteria andMaster_log_posLessThan(Long value) {
            addCriterion("Master_log_pos <", value, "master_log_pos");
            return (Criteria) this;
        }

        public Criteria andMaster_log_posLessThanOrEqualTo(Long value) {
            addCriterion("Master_log_pos <=", value, "master_log_pos");
            return (Criteria) this;
        }

        public Criteria andMaster_log_posIn(List<Long> values) {
            addCriterion("Master_log_pos in", values, "master_log_pos");
            return (Criteria) this;
        }

        public Criteria andMaster_log_posNotIn(List<Long> values) {
            addCriterion("Master_log_pos not in", values, "master_log_pos");
            return (Criteria) this;
        }

        public Criteria andMaster_log_posBetween(Long value1, Long value2) {
            addCriterion("Master_log_pos between", value1, value2, "master_log_pos");
            return (Criteria) this;
        }

        public Criteria andMaster_log_posNotBetween(Long value1, Long value2) {
            addCriterion("Master_log_pos not between", value1, value2, "master_log_pos");
            return (Criteria) this;
        }

        public Criteria andSql_delayIsNull() {
            addCriterion("Sql_delay is null");
            return (Criteria) this;
        }

        public Criteria andSql_delayIsNotNull() {
            addCriterion("Sql_delay is not null");
            return (Criteria) this;
        }

        public Criteria andSql_delayEqualTo(Integer value) {
            addCriterion("Sql_delay =", value, "sql_delay");
            return (Criteria) this;
        }

        public Criteria andSql_delayNotEqualTo(Integer value) {
            addCriterion("Sql_delay <>", value, "sql_delay");
            return (Criteria) this;
        }

        public Criteria andSql_delayGreaterThan(Integer value) {
            addCriterion("Sql_delay >", value, "sql_delay");
            return (Criteria) this;
        }

        public Criteria andSql_delayGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sql_delay >=", value, "sql_delay");
            return (Criteria) this;
        }

        public Criteria andSql_delayLessThan(Integer value) {
            addCriterion("Sql_delay <", value, "sql_delay");
            return (Criteria) this;
        }

        public Criteria andSql_delayLessThanOrEqualTo(Integer value) {
            addCriterion("Sql_delay <=", value, "sql_delay");
            return (Criteria) this;
        }

        public Criteria andSql_delayIn(List<Integer> values) {
            addCriterion("Sql_delay in", values, "sql_delay");
            return (Criteria) this;
        }

        public Criteria andSql_delayNotIn(List<Integer> values) {
            addCriterion("Sql_delay not in", values, "sql_delay");
            return (Criteria) this;
        }

        public Criteria andSql_delayBetween(Integer value1, Integer value2) {
            addCriterion("Sql_delay between", value1, value2, "sql_delay");
            return (Criteria) this;
        }

        public Criteria andSql_delayNotBetween(Integer value1, Integer value2) {
            addCriterion("Sql_delay not between", value1, value2, "sql_delay");
            return (Criteria) this;
        }

        public Criteria andNumber_of_workersIsNull() {
            addCriterion("Number_of_workers is null");
            return (Criteria) this;
        }

        public Criteria andNumber_of_workersIsNotNull() {
            addCriterion("Number_of_workers is not null");
            return (Criteria) this;
        }

        public Criteria andNumber_of_workersEqualTo(Integer value) {
            addCriterion("Number_of_workers =", value, "number_of_workers");
            return (Criteria) this;
        }

        public Criteria andNumber_of_workersNotEqualTo(Integer value) {
            addCriterion("Number_of_workers <>", value, "number_of_workers");
            return (Criteria) this;
        }

        public Criteria andNumber_of_workersGreaterThan(Integer value) {
            addCriterion("Number_of_workers >", value, "number_of_workers");
            return (Criteria) this;
        }

        public Criteria andNumber_of_workersGreaterThanOrEqualTo(Integer value) {
            addCriterion("Number_of_workers >=", value, "number_of_workers");
            return (Criteria) this;
        }

        public Criteria andNumber_of_workersLessThan(Integer value) {
            addCriterion("Number_of_workers <", value, "number_of_workers");
            return (Criteria) this;
        }

        public Criteria andNumber_of_workersLessThanOrEqualTo(Integer value) {
            addCriterion("Number_of_workers <=", value, "number_of_workers");
            return (Criteria) this;
        }

        public Criteria andNumber_of_workersIn(List<Integer> values) {
            addCriterion("Number_of_workers in", values, "number_of_workers");
            return (Criteria) this;
        }

        public Criteria andNumber_of_workersNotIn(List<Integer> values) {
            addCriterion("Number_of_workers not in", values, "number_of_workers");
            return (Criteria) this;
        }

        public Criteria andNumber_of_workersBetween(Integer value1, Integer value2) {
            addCriterion("Number_of_workers between", value1, value2, "number_of_workers");
            return (Criteria) this;
        }

        public Criteria andNumber_of_workersNotBetween(Integer value1, Integer value2) {
            addCriterion("Number_of_workers not between", value1, value2, "number_of_workers");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table slave_relay_log_info
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
     * This class corresponds to the database table slave_relay_log_info
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