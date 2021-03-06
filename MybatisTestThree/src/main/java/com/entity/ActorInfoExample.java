package com.entity;

import java.util.ArrayList;
import java.util.List;

public class ActorInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table actor_info
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table actor_info
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table actor_info
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_info
     *
     * @mbg.generated
     */
    public ActorInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_info
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_info
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_info
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_info
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_info
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_info
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_info
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
     * This method corresponds to the database table actor_info
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
     * This method corresponds to the database table actor_info
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_info
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
     * This class corresponds to the database table actor_info
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

        public Criteria andActor_idIsNull() {
            addCriterion("actor_id is null");
            return (Criteria) this;
        }

        public Criteria andActor_idIsNotNull() {
            addCriterion("actor_id is not null");
            return (Criteria) this;
        }

        public Criteria andActor_idEqualTo(Short value) {
            addCriterion("actor_id =", value, "actor_id");
            return (Criteria) this;
        }

        public Criteria andActor_idNotEqualTo(Short value) {
            addCriterion("actor_id <>", value, "actor_id");
            return (Criteria) this;
        }

        public Criteria andActor_idGreaterThan(Short value) {
            addCriterion("actor_id >", value, "actor_id");
            return (Criteria) this;
        }

        public Criteria andActor_idGreaterThanOrEqualTo(Short value) {
            addCriterion("actor_id >=", value, "actor_id");
            return (Criteria) this;
        }

        public Criteria andActor_idLessThan(Short value) {
            addCriterion("actor_id <", value, "actor_id");
            return (Criteria) this;
        }

        public Criteria andActor_idLessThanOrEqualTo(Short value) {
            addCriterion("actor_id <=", value, "actor_id");
            return (Criteria) this;
        }

        public Criteria andActor_idIn(List<Short> values) {
            addCriterion("actor_id in", values, "actor_id");
            return (Criteria) this;
        }

        public Criteria andActor_idNotIn(List<Short> values) {
            addCriterion("actor_id not in", values, "actor_id");
            return (Criteria) this;
        }

        public Criteria andActor_idBetween(Short value1, Short value2) {
            addCriterion("actor_id between", value1, value2, "actor_id");
            return (Criteria) this;
        }

        public Criteria andActor_idNotBetween(Short value1, Short value2) {
            addCriterion("actor_id not between", value1, value2, "actor_id");
            return (Criteria) this;
        }

        public Criteria andFirst_nameIsNull() {
            addCriterion("first_name is null");
            return (Criteria) this;
        }

        public Criteria andFirst_nameIsNotNull() {
            addCriterion("first_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirst_nameEqualTo(String value) {
            addCriterion("first_name =", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameNotEqualTo(String value) {
            addCriterion("first_name <>", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameGreaterThan(String value) {
            addCriterion("first_name >", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameGreaterThanOrEqualTo(String value) {
            addCriterion("first_name >=", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameLessThan(String value) {
            addCriterion("first_name <", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameLessThanOrEqualTo(String value) {
            addCriterion("first_name <=", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameLike(String value) {
            addCriterion("first_name like", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameNotLike(String value) {
            addCriterion("first_name not like", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameIn(List<String> values) {
            addCriterion("first_name in", values, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameNotIn(List<String> values) {
            addCriterion("first_name not in", values, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameBetween(String value1, String value2) {
            addCriterion("first_name between", value1, value2, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameNotBetween(String value1, String value2) {
            addCriterion("first_name not between", value1, value2, "first_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameIsNull() {
            addCriterion("last_name is null");
            return (Criteria) this;
        }

        public Criteria andLast_nameIsNotNull() {
            addCriterion("last_name is not null");
            return (Criteria) this;
        }

        public Criteria andLast_nameEqualTo(String value) {
            addCriterion("last_name =", value, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameNotEqualTo(String value) {
            addCriterion("last_name <>", value, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameGreaterThan(String value) {
            addCriterion("last_name >", value, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameGreaterThanOrEqualTo(String value) {
            addCriterion("last_name >=", value, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameLessThan(String value) {
            addCriterion("last_name <", value, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameLessThanOrEqualTo(String value) {
            addCriterion("last_name <=", value, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameLike(String value) {
            addCriterion("last_name like", value, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameNotLike(String value) {
            addCriterion("last_name not like", value, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameIn(List<String> values) {
            addCriterion("last_name in", values, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameNotIn(List<String> values) {
            addCriterion("last_name not in", values, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameBetween(String value1, String value2) {
            addCriterion("last_name between", value1, value2, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameNotBetween(String value1, String value2) {
            addCriterion("last_name not between", value1, value2, "last_name");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table actor_info
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
     * This class corresponds to the database table actor_info
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