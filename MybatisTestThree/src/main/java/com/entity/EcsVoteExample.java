package com.entity;

import java.util.ArrayList;
import java.util.List;

public class EcsVoteExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_vote
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_vote
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_vote
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote
     *
     * @mbg.generated
     */
    public EcsVoteExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote
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
     * This method corresponds to the database table ecs_vote
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
     * This method corresponds to the database table ecs_vote
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote
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
     * This class corresponds to the database table ecs_vote
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

        public Criteria andVote_idIsNull() {
            addCriterion("vote_id is null");
            return (Criteria) this;
        }

        public Criteria andVote_idIsNotNull() {
            addCriterion("vote_id is not null");
            return (Criteria) this;
        }

        public Criteria andVote_idEqualTo(Short value) {
            addCriterion("vote_id =", value, "vote_id");
            return (Criteria) this;
        }

        public Criteria andVote_idNotEqualTo(Short value) {
            addCriterion("vote_id <>", value, "vote_id");
            return (Criteria) this;
        }

        public Criteria andVote_idGreaterThan(Short value) {
            addCriterion("vote_id >", value, "vote_id");
            return (Criteria) this;
        }

        public Criteria andVote_idGreaterThanOrEqualTo(Short value) {
            addCriterion("vote_id >=", value, "vote_id");
            return (Criteria) this;
        }

        public Criteria andVote_idLessThan(Short value) {
            addCriterion("vote_id <", value, "vote_id");
            return (Criteria) this;
        }

        public Criteria andVote_idLessThanOrEqualTo(Short value) {
            addCriterion("vote_id <=", value, "vote_id");
            return (Criteria) this;
        }

        public Criteria andVote_idIn(List<Short> values) {
            addCriterion("vote_id in", values, "vote_id");
            return (Criteria) this;
        }

        public Criteria andVote_idNotIn(List<Short> values) {
            addCriterion("vote_id not in", values, "vote_id");
            return (Criteria) this;
        }

        public Criteria andVote_idBetween(Short value1, Short value2) {
            addCriterion("vote_id between", value1, value2, "vote_id");
            return (Criteria) this;
        }

        public Criteria andVote_idNotBetween(Short value1, Short value2) {
            addCriterion("vote_id not between", value1, value2, "vote_id");
            return (Criteria) this;
        }

        public Criteria andVote_nameIsNull() {
            addCriterion("vote_name is null");
            return (Criteria) this;
        }

        public Criteria andVote_nameIsNotNull() {
            addCriterion("vote_name is not null");
            return (Criteria) this;
        }

        public Criteria andVote_nameEqualTo(String value) {
            addCriterion("vote_name =", value, "vote_name");
            return (Criteria) this;
        }

        public Criteria andVote_nameNotEqualTo(String value) {
            addCriterion("vote_name <>", value, "vote_name");
            return (Criteria) this;
        }

        public Criteria andVote_nameGreaterThan(String value) {
            addCriterion("vote_name >", value, "vote_name");
            return (Criteria) this;
        }

        public Criteria andVote_nameGreaterThanOrEqualTo(String value) {
            addCriterion("vote_name >=", value, "vote_name");
            return (Criteria) this;
        }

        public Criteria andVote_nameLessThan(String value) {
            addCriterion("vote_name <", value, "vote_name");
            return (Criteria) this;
        }

        public Criteria andVote_nameLessThanOrEqualTo(String value) {
            addCriterion("vote_name <=", value, "vote_name");
            return (Criteria) this;
        }

        public Criteria andVote_nameLike(String value) {
            addCriterion("vote_name like", value, "vote_name");
            return (Criteria) this;
        }

        public Criteria andVote_nameNotLike(String value) {
            addCriterion("vote_name not like", value, "vote_name");
            return (Criteria) this;
        }

        public Criteria andVote_nameIn(List<String> values) {
            addCriterion("vote_name in", values, "vote_name");
            return (Criteria) this;
        }

        public Criteria andVote_nameNotIn(List<String> values) {
            addCriterion("vote_name not in", values, "vote_name");
            return (Criteria) this;
        }

        public Criteria andVote_nameBetween(String value1, String value2) {
            addCriterion("vote_name between", value1, value2, "vote_name");
            return (Criteria) this;
        }

        public Criteria andVote_nameNotBetween(String value1, String value2) {
            addCriterion("vote_name not between", value1, value2, "vote_name");
            return (Criteria) this;
        }

        public Criteria andStart_timeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStart_timeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStart_timeEqualTo(Integer value) {
            addCriterion("start_time =", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeNotEqualTo(Integer value) {
            addCriterion("start_time <>", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeGreaterThan(Integer value) {
            addCriterion("start_time >", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_time >=", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeLessThan(Integer value) {
            addCriterion("start_time <", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeLessThanOrEqualTo(Integer value) {
            addCriterion("start_time <=", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeIn(List<Integer> values) {
            addCriterion("start_time in", values, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeNotIn(List<Integer> values) {
            addCriterion("start_time not in", values, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeBetween(Integer value1, Integer value2) {
            addCriterion("start_time between", value1, value2, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("start_time not between", value1, value2, "start_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnd_timeEqualTo(Integer value) {
            addCriterion("end_time =", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotEqualTo(Integer value) {
            addCriterion("end_time <>", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeGreaterThan(Integer value) {
            addCriterion("end_time >", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_time >=", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeLessThan(Integer value) {
            addCriterion("end_time <", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeLessThanOrEqualTo(Integer value) {
            addCriterion("end_time <=", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIn(List<Integer> values) {
            addCriterion("end_time in", values, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotIn(List<Integer> values) {
            addCriterion("end_time not in", values, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeBetween(Integer value1, Integer value2) {
            addCriterion("end_time between", value1, value2, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("end_time not between", value1, value2, "end_time");
            return (Criteria) this;
        }

        public Criteria andCan_multiIsNull() {
            addCriterion("can_multi is null");
            return (Criteria) this;
        }

        public Criteria andCan_multiIsNotNull() {
            addCriterion("can_multi is not null");
            return (Criteria) this;
        }

        public Criteria andCan_multiEqualTo(Boolean value) {
            addCriterion("can_multi =", value, "can_multi");
            return (Criteria) this;
        }

        public Criteria andCan_multiNotEqualTo(Boolean value) {
            addCriterion("can_multi <>", value, "can_multi");
            return (Criteria) this;
        }

        public Criteria andCan_multiGreaterThan(Boolean value) {
            addCriterion("can_multi >", value, "can_multi");
            return (Criteria) this;
        }

        public Criteria andCan_multiGreaterThanOrEqualTo(Boolean value) {
            addCriterion("can_multi >=", value, "can_multi");
            return (Criteria) this;
        }

        public Criteria andCan_multiLessThan(Boolean value) {
            addCriterion("can_multi <", value, "can_multi");
            return (Criteria) this;
        }

        public Criteria andCan_multiLessThanOrEqualTo(Boolean value) {
            addCriterion("can_multi <=", value, "can_multi");
            return (Criteria) this;
        }

        public Criteria andCan_multiIn(List<Boolean> values) {
            addCriterion("can_multi in", values, "can_multi");
            return (Criteria) this;
        }

        public Criteria andCan_multiNotIn(List<Boolean> values) {
            addCriterion("can_multi not in", values, "can_multi");
            return (Criteria) this;
        }

        public Criteria andCan_multiBetween(Boolean value1, Boolean value2) {
            addCriterion("can_multi between", value1, value2, "can_multi");
            return (Criteria) this;
        }

        public Criteria andCan_multiNotBetween(Boolean value1, Boolean value2) {
            addCriterion("can_multi not between", value1, value2, "can_multi");
            return (Criteria) this;
        }

        public Criteria andVote_countIsNull() {
            addCriterion("vote_count is null");
            return (Criteria) this;
        }

        public Criteria andVote_countIsNotNull() {
            addCriterion("vote_count is not null");
            return (Criteria) this;
        }

        public Criteria andVote_countEqualTo(Integer value) {
            addCriterion("vote_count =", value, "vote_count");
            return (Criteria) this;
        }

        public Criteria andVote_countNotEqualTo(Integer value) {
            addCriterion("vote_count <>", value, "vote_count");
            return (Criteria) this;
        }

        public Criteria andVote_countGreaterThan(Integer value) {
            addCriterion("vote_count >", value, "vote_count");
            return (Criteria) this;
        }

        public Criteria andVote_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("vote_count >=", value, "vote_count");
            return (Criteria) this;
        }

        public Criteria andVote_countLessThan(Integer value) {
            addCriterion("vote_count <", value, "vote_count");
            return (Criteria) this;
        }

        public Criteria andVote_countLessThanOrEqualTo(Integer value) {
            addCriterion("vote_count <=", value, "vote_count");
            return (Criteria) this;
        }

        public Criteria andVote_countIn(List<Integer> values) {
            addCriterion("vote_count in", values, "vote_count");
            return (Criteria) this;
        }

        public Criteria andVote_countNotIn(List<Integer> values) {
            addCriterion("vote_count not in", values, "vote_count");
            return (Criteria) this;
        }

        public Criteria andVote_countBetween(Integer value1, Integer value2) {
            addCriterion("vote_count between", value1, value2, "vote_count");
            return (Criteria) this;
        }

        public Criteria andVote_countNotBetween(Integer value1, Integer value2) {
            addCriterion("vote_count not between", value1, value2, "vote_count");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_vote
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
     * This class corresponds to the database table ecs_vote
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