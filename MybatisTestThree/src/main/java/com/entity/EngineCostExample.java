package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EngineCostExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table engine_cost
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table engine_cost
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table engine_cost
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table engine_cost
     *
     * @mbg.generated
     */
    public EngineCostExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table engine_cost
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table engine_cost
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table engine_cost
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table engine_cost
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table engine_cost
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table engine_cost
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table engine_cost
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
     * This method corresponds to the database table engine_cost
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
     * This method corresponds to the database table engine_cost
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table engine_cost
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
     * This class corresponds to the database table engine_cost
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

        public Criteria andCost_nameIsNull() {
            addCriterion("cost_name is null");
            return (Criteria) this;
        }

        public Criteria andCost_nameIsNotNull() {
            addCriterion("cost_name is not null");
            return (Criteria) this;
        }

        public Criteria andCost_nameEqualTo(String value) {
            addCriterion("cost_name =", value, "cost_name");
            return (Criteria) this;
        }

        public Criteria andCost_nameNotEqualTo(String value) {
            addCriterion("cost_name <>", value, "cost_name");
            return (Criteria) this;
        }

        public Criteria andCost_nameGreaterThan(String value) {
            addCriterion("cost_name >", value, "cost_name");
            return (Criteria) this;
        }

        public Criteria andCost_nameGreaterThanOrEqualTo(String value) {
            addCriterion("cost_name >=", value, "cost_name");
            return (Criteria) this;
        }

        public Criteria andCost_nameLessThan(String value) {
            addCriterion("cost_name <", value, "cost_name");
            return (Criteria) this;
        }

        public Criteria andCost_nameLessThanOrEqualTo(String value) {
            addCriterion("cost_name <=", value, "cost_name");
            return (Criteria) this;
        }

        public Criteria andCost_nameLike(String value) {
            addCriterion("cost_name like", value, "cost_name");
            return (Criteria) this;
        }

        public Criteria andCost_nameNotLike(String value) {
            addCriterion("cost_name not like", value, "cost_name");
            return (Criteria) this;
        }

        public Criteria andCost_nameIn(List<String> values) {
            addCriterion("cost_name in", values, "cost_name");
            return (Criteria) this;
        }

        public Criteria andCost_nameNotIn(List<String> values) {
            addCriterion("cost_name not in", values, "cost_name");
            return (Criteria) this;
        }

        public Criteria andCost_nameBetween(String value1, String value2) {
            addCriterion("cost_name between", value1, value2, "cost_name");
            return (Criteria) this;
        }

        public Criteria andCost_nameNotBetween(String value1, String value2) {
            addCriterion("cost_name not between", value1, value2, "cost_name");
            return (Criteria) this;
        }

        public Criteria andEngine_nameIsNull() {
            addCriterion("engine_name is null");
            return (Criteria) this;
        }

        public Criteria andEngine_nameIsNotNull() {
            addCriterion("engine_name is not null");
            return (Criteria) this;
        }

        public Criteria andEngine_nameEqualTo(String value) {
            addCriterion("engine_name =", value, "engine_name");
            return (Criteria) this;
        }

        public Criteria andEngine_nameNotEqualTo(String value) {
            addCriterion("engine_name <>", value, "engine_name");
            return (Criteria) this;
        }

        public Criteria andEngine_nameGreaterThan(String value) {
            addCriterion("engine_name >", value, "engine_name");
            return (Criteria) this;
        }

        public Criteria andEngine_nameGreaterThanOrEqualTo(String value) {
            addCriterion("engine_name >=", value, "engine_name");
            return (Criteria) this;
        }

        public Criteria andEngine_nameLessThan(String value) {
            addCriterion("engine_name <", value, "engine_name");
            return (Criteria) this;
        }

        public Criteria andEngine_nameLessThanOrEqualTo(String value) {
            addCriterion("engine_name <=", value, "engine_name");
            return (Criteria) this;
        }

        public Criteria andEngine_nameLike(String value) {
            addCriterion("engine_name like", value, "engine_name");
            return (Criteria) this;
        }

        public Criteria andEngine_nameNotLike(String value) {
            addCriterion("engine_name not like", value, "engine_name");
            return (Criteria) this;
        }

        public Criteria andEngine_nameIn(List<String> values) {
            addCriterion("engine_name in", values, "engine_name");
            return (Criteria) this;
        }

        public Criteria andEngine_nameNotIn(List<String> values) {
            addCriterion("engine_name not in", values, "engine_name");
            return (Criteria) this;
        }

        public Criteria andEngine_nameBetween(String value1, String value2) {
            addCriterion("engine_name between", value1, value2, "engine_name");
            return (Criteria) this;
        }

        public Criteria andEngine_nameNotBetween(String value1, String value2) {
            addCriterion("engine_name not between", value1, value2, "engine_name");
            return (Criteria) this;
        }

        public Criteria andDevice_typeIsNull() {
            addCriterion("device_type is null");
            return (Criteria) this;
        }

        public Criteria andDevice_typeIsNotNull() {
            addCriterion("device_type is not null");
            return (Criteria) this;
        }

        public Criteria andDevice_typeEqualTo(Integer value) {
            addCriterion("device_type =", value, "device_type");
            return (Criteria) this;
        }

        public Criteria andDevice_typeNotEqualTo(Integer value) {
            addCriterion("device_type <>", value, "device_type");
            return (Criteria) this;
        }

        public Criteria andDevice_typeGreaterThan(Integer value) {
            addCriterion("device_type >", value, "device_type");
            return (Criteria) this;
        }

        public Criteria andDevice_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_type >=", value, "device_type");
            return (Criteria) this;
        }

        public Criteria andDevice_typeLessThan(Integer value) {
            addCriterion("device_type <", value, "device_type");
            return (Criteria) this;
        }

        public Criteria andDevice_typeLessThanOrEqualTo(Integer value) {
            addCriterion("device_type <=", value, "device_type");
            return (Criteria) this;
        }

        public Criteria andDevice_typeIn(List<Integer> values) {
            addCriterion("device_type in", values, "device_type");
            return (Criteria) this;
        }

        public Criteria andDevice_typeNotIn(List<Integer> values) {
            addCriterion("device_type not in", values, "device_type");
            return (Criteria) this;
        }

        public Criteria andDevice_typeBetween(Integer value1, Integer value2) {
            addCriterion("device_type between", value1, value2, "device_type");
            return (Criteria) this;
        }

        public Criteria andDevice_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("device_type not between", value1, value2, "device_type");
            return (Criteria) this;
        }

        public Criteria andCost_valueIsNull() {
            addCriterion("cost_value is null");
            return (Criteria) this;
        }

        public Criteria andCost_valueIsNotNull() {
            addCriterion("cost_value is not null");
            return (Criteria) this;
        }

        public Criteria andCost_valueEqualTo(Float value) {
            addCriterion("cost_value =", value, "cost_value");
            return (Criteria) this;
        }

        public Criteria andCost_valueNotEqualTo(Float value) {
            addCriterion("cost_value <>", value, "cost_value");
            return (Criteria) this;
        }

        public Criteria andCost_valueGreaterThan(Float value) {
            addCriterion("cost_value >", value, "cost_value");
            return (Criteria) this;
        }

        public Criteria andCost_valueGreaterThanOrEqualTo(Float value) {
            addCriterion("cost_value >=", value, "cost_value");
            return (Criteria) this;
        }

        public Criteria andCost_valueLessThan(Float value) {
            addCriterion("cost_value <", value, "cost_value");
            return (Criteria) this;
        }

        public Criteria andCost_valueLessThanOrEqualTo(Float value) {
            addCriterion("cost_value <=", value, "cost_value");
            return (Criteria) this;
        }

        public Criteria andCost_valueIn(List<Float> values) {
            addCriterion("cost_value in", values, "cost_value");
            return (Criteria) this;
        }

        public Criteria andCost_valueNotIn(List<Float> values) {
            addCriterion("cost_value not in", values, "cost_value");
            return (Criteria) this;
        }

        public Criteria andCost_valueBetween(Float value1, Float value2) {
            addCriterion("cost_value between", value1, value2, "cost_value");
            return (Criteria) this;
        }

        public Criteria andCost_valueNotBetween(Float value1, Float value2) {
            addCriterion("cost_value not between", value1, value2, "cost_value");
            return (Criteria) this;
        }

        public Criteria andLast_updateIsNull() {
            addCriterion("last_update is null");
            return (Criteria) this;
        }

        public Criteria andLast_updateIsNotNull() {
            addCriterion("last_update is not null");
            return (Criteria) this;
        }

        public Criteria andLast_updateEqualTo(Date value) {
            addCriterion("last_update =", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateNotEqualTo(Date value) {
            addCriterion("last_update <>", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateGreaterThan(Date value) {
            addCriterion("last_update >", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update >=", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateLessThan(Date value) {
            addCriterion("last_update <", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateLessThanOrEqualTo(Date value) {
            addCriterion("last_update <=", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateIn(List<Date> values) {
            addCriterion("last_update in", values, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateNotIn(List<Date> values) {
            addCriterion("last_update not in", values, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateBetween(Date value1, Date value2) {
            addCriterion("last_update between", value1, value2, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateNotBetween(Date value1, Date value2) {
            addCriterion("last_update not between", value1, value2, "last_update");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andDefault_valueIsNull() {
            addCriterion("default_value is null");
            return (Criteria) this;
        }

        public Criteria andDefault_valueIsNotNull() {
            addCriterion("default_value is not null");
            return (Criteria) this;
        }

        public Criteria andDefault_valueEqualTo(Float value) {
            addCriterion("default_value =", value, "default_value");
            return (Criteria) this;
        }

        public Criteria andDefault_valueNotEqualTo(Float value) {
            addCriterion("default_value <>", value, "default_value");
            return (Criteria) this;
        }

        public Criteria andDefault_valueGreaterThan(Float value) {
            addCriterion("default_value >", value, "default_value");
            return (Criteria) this;
        }

        public Criteria andDefault_valueGreaterThanOrEqualTo(Float value) {
            addCriterion("default_value >=", value, "default_value");
            return (Criteria) this;
        }

        public Criteria andDefault_valueLessThan(Float value) {
            addCriterion("default_value <", value, "default_value");
            return (Criteria) this;
        }

        public Criteria andDefault_valueLessThanOrEqualTo(Float value) {
            addCriterion("default_value <=", value, "default_value");
            return (Criteria) this;
        }

        public Criteria andDefault_valueIn(List<Float> values) {
            addCriterion("default_value in", values, "default_value");
            return (Criteria) this;
        }

        public Criteria andDefault_valueNotIn(List<Float> values) {
            addCriterion("default_value not in", values, "default_value");
            return (Criteria) this;
        }

        public Criteria andDefault_valueBetween(Float value1, Float value2) {
            addCriterion("default_value between", value1, value2, "default_value");
            return (Criteria) this;
        }

        public Criteria andDefault_valueNotBetween(Float value1, Float value2) {
            addCriterion("default_value not between", value1, value2, "default_value");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table engine_cost
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
     * This class corresponds to the database table engine_cost
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