package com.entity;

import java.util.ArrayList;
import java.util.List;

public class EcsKuaidiOrderStatusExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_kuaidi_order_status
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_kuaidi_order_status
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_kuaidi_order_status
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_kuaidi_order_status
     *
     * @mbg.generated
     */
    public EcsKuaidiOrderStatusExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_kuaidi_order_status
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_kuaidi_order_status
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_kuaidi_order_status
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_kuaidi_order_status
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_kuaidi_order_status
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_kuaidi_order_status
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_kuaidi_order_status
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
     * This method corresponds to the database table ecs_kuaidi_order_status
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
     * This method corresponds to the database table ecs_kuaidi_order_status
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_kuaidi_order_status
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
     * This class corresponds to the database table ecs_kuaidi_order_status
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

        public Criteria andRec_idIsNull() {
            addCriterion("rec_id is null");
            return (Criteria) this;
        }

        public Criteria andRec_idIsNotNull() {
            addCriterion("rec_id is not null");
            return (Criteria) this;
        }

        public Criteria andRec_idEqualTo(Short value) {
            addCriterion("rec_id =", value, "rec_id");
            return (Criteria) this;
        }

        public Criteria andRec_idNotEqualTo(Short value) {
            addCriterion("rec_id <>", value, "rec_id");
            return (Criteria) this;
        }

        public Criteria andRec_idGreaterThan(Short value) {
            addCriterion("rec_id >", value, "rec_id");
            return (Criteria) this;
        }

        public Criteria andRec_idGreaterThanOrEqualTo(Short value) {
            addCriterion("rec_id >=", value, "rec_id");
            return (Criteria) this;
        }

        public Criteria andRec_idLessThan(Short value) {
            addCriterion("rec_id <", value, "rec_id");
            return (Criteria) this;
        }

        public Criteria andRec_idLessThanOrEqualTo(Short value) {
            addCriterion("rec_id <=", value, "rec_id");
            return (Criteria) this;
        }

        public Criteria andRec_idIn(List<Short> values) {
            addCriterion("rec_id in", values, "rec_id");
            return (Criteria) this;
        }

        public Criteria andRec_idNotIn(List<Short> values) {
            addCriterion("rec_id not in", values, "rec_id");
            return (Criteria) this;
        }

        public Criteria andRec_idBetween(Short value1, Short value2) {
            addCriterion("rec_id between", value1, value2, "rec_id");
            return (Criteria) this;
        }

        public Criteria andRec_idNotBetween(Short value1, Short value2) {
            addCriterion("rec_id not between", value1, value2, "rec_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrder_idIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_idEqualTo(Integer value) {
            addCriterion("order_id =", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThan(Integer value) {
            addCriterion("order_id >", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThan(Integer value) {
            addCriterion("order_id <", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idIn(List<Integer> values) {
            addCriterion("order_id in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andStatus_idIsNull() {
            addCriterion("status_id is null");
            return (Criteria) this;
        }

        public Criteria andStatus_idIsNotNull() {
            addCriterion("status_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatus_idEqualTo(Boolean value) {
            addCriterion("status_id =", value, "status_id");
            return (Criteria) this;
        }

        public Criteria andStatus_idNotEqualTo(Boolean value) {
            addCriterion("status_id <>", value, "status_id");
            return (Criteria) this;
        }

        public Criteria andStatus_idGreaterThan(Boolean value) {
            addCriterion("status_id >", value, "status_id");
            return (Criteria) this;
        }

        public Criteria andStatus_idGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status_id >=", value, "status_id");
            return (Criteria) this;
        }

        public Criteria andStatus_idLessThan(Boolean value) {
            addCriterion("status_id <", value, "status_id");
            return (Criteria) this;
        }

        public Criteria andStatus_idLessThanOrEqualTo(Boolean value) {
            addCriterion("status_id <=", value, "status_id");
            return (Criteria) this;
        }

        public Criteria andStatus_idIn(List<Boolean> values) {
            addCriterion("status_id in", values, "status_id");
            return (Criteria) this;
        }

        public Criteria andStatus_idNotIn(List<Boolean> values) {
            addCriterion("status_id not in", values, "status_id");
            return (Criteria) this;
        }

        public Criteria andStatus_idBetween(Boolean value1, Boolean value2) {
            addCriterion("status_id between", value1, value2, "status_id");
            return (Criteria) this;
        }

        public Criteria andStatus_idNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status_id not between", value1, value2, "status_id");
            return (Criteria) this;
        }

        public Criteria andStatus_nameIsNull() {
            addCriterion("status_name is null");
            return (Criteria) this;
        }

        public Criteria andStatus_nameIsNotNull() {
            addCriterion("status_name is not null");
            return (Criteria) this;
        }

        public Criteria andStatus_nameEqualTo(String value) {
            addCriterion("status_name =", value, "status_name");
            return (Criteria) this;
        }

        public Criteria andStatus_nameNotEqualTo(String value) {
            addCriterion("status_name <>", value, "status_name");
            return (Criteria) this;
        }

        public Criteria andStatus_nameGreaterThan(String value) {
            addCriterion("status_name >", value, "status_name");
            return (Criteria) this;
        }

        public Criteria andStatus_nameGreaterThanOrEqualTo(String value) {
            addCriterion("status_name >=", value, "status_name");
            return (Criteria) this;
        }

        public Criteria andStatus_nameLessThan(String value) {
            addCriterion("status_name <", value, "status_name");
            return (Criteria) this;
        }

        public Criteria andStatus_nameLessThanOrEqualTo(String value) {
            addCriterion("status_name <=", value, "status_name");
            return (Criteria) this;
        }

        public Criteria andStatus_nameLike(String value) {
            addCriterion("status_name like", value, "status_name");
            return (Criteria) this;
        }

        public Criteria andStatus_nameNotLike(String value) {
            addCriterion("status_name not like", value, "status_name");
            return (Criteria) this;
        }

        public Criteria andStatus_nameIn(List<String> values) {
            addCriterion("status_name in", values, "status_name");
            return (Criteria) this;
        }

        public Criteria andStatus_nameNotIn(List<String> values) {
            addCriterion("status_name not in", values, "status_name");
            return (Criteria) this;
        }

        public Criteria andStatus_nameBetween(String value1, String value2) {
            addCriterion("status_name between", value1, value2, "status_name");
            return (Criteria) this;
        }

        public Criteria andStatus_nameNotBetween(String value1, String value2) {
            addCriterion("status_name not between", value1, value2, "status_name");
            return (Criteria) this;
        }

        public Criteria andStatus_typeIsNull() {
            addCriterion("status_type is null");
            return (Criteria) this;
        }

        public Criteria andStatus_typeIsNotNull() {
            addCriterion("status_type is not null");
            return (Criteria) this;
        }

        public Criteria andStatus_typeEqualTo(Boolean value) {
            addCriterion("status_type =", value, "status_type");
            return (Criteria) this;
        }

        public Criteria andStatus_typeNotEqualTo(Boolean value) {
            addCriterion("status_type <>", value, "status_type");
            return (Criteria) this;
        }

        public Criteria andStatus_typeGreaterThan(Boolean value) {
            addCriterion("status_type >", value, "status_type");
            return (Criteria) this;
        }

        public Criteria andStatus_typeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status_type >=", value, "status_type");
            return (Criteria) this;
        }

        public Criteria andStatus_typeLessThan(Boolean value) {
            addCriterion("status_type <", value, "status_type");
            return (Criteria) this;
        }

        public Criteria andStatus_typeLessThanOrEqualTo(Boolean value) {
            addCriterion("status_type <=", value, "status_type");
            return (Criteria) this;
        }

        public Criteria andStatus_typeIn(List<Boolean> values) {
            addCriterion("status_type in", values, "status_type");
            return (Criteria) this;
        }

        public Criteria andStatus_typeNotIn(List<Boolean> values) {
            addCriterion("status_type not in", values, "status_type");
            return (Criteria) this;
        }

        public Criteria andStatus_typeBetween(Boolean value1, Boolean value2) {
            addCriterion("status_type between", value1, value2, "status_type");
            return (Criteria) this;
        }

        public Criteria andStatus_typeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status_type not between", value1, value2, "status_type");
            return (Criteria) this;
        }

        public Criteria andStatus_displayIsNull() {
            addCriterion("status_display is null");
            return (Criteria) this;
        }

        public Criteria andStatus_displayIsNotNull() {
            addCriterion("status_display is not null");
            return (Criteria) this;
        }

        public Criteria andStatus_displayEqualTo(Boolean value) {
            addCriterion("status_display =", value, "status_display");
            return (Criteria) this;
        }

        public Criteria andStatus_displayNotEqualTo(Boolean value) {
            addCriterion("status_display <>", value, "status_display");
            return (Criteria) this;
        }

        public Criteria andStatus_displayGreaterThan(Boolean value) {
            addCriterion("status_display >", value, "status_display");
            return (Criteria) this;
        }

        public Criteria andStatus_displayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status_display >=", value, "status_display");
            return (Criteria) this;
        }

        public Criteria andStatus_displayLessThan(Boolean value) {
            addCriterion("status_display <", value, "status_display");
            return (Criteria) this;
        }

        public Criteria andStatus_displayLessThanOrEqualTo(Boolean value) {
            addCriterion("status_display <=", value, "status_display");
            return (Criteria) this;
        }

        public Criteria andStatus_displayIn(List<Boolean> values) {
            addCriterion("status_display in", values, "status_display");
            return (Criteria) this;
        }

        public Criteria andStatus_displayNotIn(List<Boolean> values) {
            addCriterion("status_display not in", values, "status_display");
            return (Criteria) this;
        }

        public Criteria andStatus_displayBetween(Boolean value1, Boolean value2) {
            addCriterion("status_display between", value1, value2, "status_display");
            return (Criteria) this;
        }

        public Criteria andStatus_displayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status_display not between", value1, value2, "status_display");
            return (Criteria) this;
        }

        public Criteria andStatus_timeIsNull() {
            addCriterion("status_time is null");
            return (Criteria) this;
        }

        public Criteria andStatus_timeIsNotNull() {
            addCriterion("status_time is not null");
            return (Criteria) this;
        }

        public Criteria andStatus_timeEqualTo(Integer value) {
            addCriterion("status_time =", value, "status_time");
            return (Criteria) this;
        }

        public Criteria andStatus_timeNotEqualTo(Integer value) {
            addCriterion("status_time <>", value, "status_time");
            return (Criteria) this;
        }

        public Criteria andStatus_timeGreaterThan(Integer value) {
            addCriterion("status_time >", value, "status_time");
            return (Criteria) this;
        }

        public Criteria andStatus_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("status_time >=", value, "status_time");
            return (Criteria) this;
        }

        public Criteria andStatus_timeLessThan(Integer value) {
            addCriterion("status_time <", value, "status_time");
            return (Criteria) this;
        }

        public Criteria andStatus_timeLessThanOrEqualTo(Integer value) {
            addCriterion("status_time <=", value, "status_time");
            return (Criteria) this;
        }

        public Criteria andStatus_timeIn(List<Integer> values) {
            addCriterion("status_time in", values, "status_time");
            return (Criteria) this;
        }

        public Criteria andStatus_timeNotIn(List<Integer> values) {
            addCriterion("status_time not in", values, "status_time");
            return (Criteria) this;
        }

        public Criteria andStatus_timeBetween(Integer value1, Integer value2) {
            addCriterion("status_time between", value1, value2, "status_time");
            return (Criteria) this;
        }

        public Criteria andStatus_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("status_time not between", value1, value2, "status_time");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_kuaidi_order_status
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
     * This class corresponds to the database table ecs_kuaidi_order_status
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