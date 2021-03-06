package com.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EcsEcsmartDistribGoodsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_ecsmart_distrib_goods
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_ecsmart_distrib_goods
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_ecsmart_distrib_goods
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_distrib_goods
     *
     * @mbg.generated
     */
    public EcsEcsmartDistribGoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_distrib_goods
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_distrib_goods
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_distrib_goods
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_distrib_goods
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_distrib_goods
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_distrib_goods
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_distrib_goods
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
     * This method corresponds to the database table ecs_ecsmart_distrib_goods
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
     * This method corresponds to the database table ecs_ecsmart_distrib_goods
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_distrib_goods
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
     * This class corresponds to the database table ecs_ecsmart_distrib_goods
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDistrib_timeIsNull() {
            addCriterion("distrib_time is null");
            return (Criteria) this;
        }

        public Criteria andDistrib_timeIsNotNull() {
            addCriterion("distrib_time is not null");
            return (Criteria) this;
        }

        public Criteria andDistrib_timeEqualTo(Integer value) {
            addCriterion("distrib_time =", value, "distrib_time");
            return (Criteria) this;
        }

        public Criteria andDistrib_timeNotEqualTo(Integer value) {
            addCriterion("distrib_time <>", value, "distrib_time");
            return (Criteria) this;
        }

        public Criteria andDistrib_timeGreaterThan(Integer value) {
            addCriterion("distrib_time >", value, "distrib_time");
            return (Criteria) this;
        }

        public Criteria andDistrib_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("distrib_time >=", value, "distrib_time");
            return (Criteria) this;
        }

        public Criteria andDistrib_timeLessThan(Integer value) {
            addCriterion("distrib_time <", value, "distrib_time");
            return (Criteria) this;
        }

        public Criteria andDistrib_timeLessThanOrEqualTo(Integer value) {
            addCriterion("distrib_time <=", value, "distrib_time");
            return (Criteria) this;
        }

        public Criteria andDistrib_timeIn(List<Integer> values) {
            addCriterion("distrib_time in", values, "distrib_time");
            return (Criteria) this;
        }

        public Criteria andDistrib_timeNotIn(List<Integer> values) {
            addCriterion("distrib_time not in", values, "distrib_time");
            return (Criteria) this;
        }

        public Criteria andDistrib_timeBetween(Integer value1, Integer value2) {
            addCriterion("distrib_time between", value1, value2, "distrib_time");
            return (Criteria) this;
        }

        public Criteria andDistrib_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("distrib_time not between", value1, value2, "distrib_time");
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

        public Criteria andDistrib_moneyIsNull() {
            addCriterion("distrib_money is null");
            return (Criteria) this;
        }

        public Criteria andDistrib_moneyIsNotNull() {
            addCriterion("distrib_money is not null");
            return (Criteria) this;
        }

        public Criteria andDistrib_moneyEqualTo(BigDecimal value) {
            addCriterion("distrib_money =", value, "distrib_money");
            return (Criteria) this;
        }

        public Criteria andDistrib_moneyNotEqualTo(BigDecimal value) {
            addCriterion("distrib_money <>", value, "distrib_money");
            return (Criteria) this;
        }

        public Criteria andDistrib_moneyGreaterThan(BigDecimal value) {
            addCriterion("distrib_money >", value, "distrib_money");
            return (Criteria) this;
        }

        public Criteria andDistrib_moneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("distrib_money >=", value, "distrib_money");
            return (Criteria) this;
        }

        public Criteria andDistrib_moneyLessThan(BigDecimal value) {
            addCriterion("distrib_money <", value, "distrib_money");
            return (Criteria) this;
        }

        public Criteria andDistrib_moneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("distrib_money <=", value, "distrib_money");
            return (Criteria) this;
        }

        public Criteria andDistrib_moneyIn(List<BigDecimal> values) {
            addCriterion("distrib_money in", values, "distrib_money");
            return (Criteria) this;
        }

        public Criteria andDistrib_moneyNotIn(List<BigDecimal> values) {
            addCriterion("distrib_money not in", values, "distrib_money");
            return (Criteria) this;
        }

        public Criteria andDistrib_moneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distrib_money between", value1, value2, "distrib_money");
            return (Criteria) this;
        }

        public Criteria andDistrib_moneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distrib_money not between", value1, value2, "distrib_money");
            return (Criteria) this;
        }

        public Criteria andDistrib_typeIsNull() {
            addCriterion("distrib_type is null");
            return (Criteria) this;
        }

        public Criteria andDistrib_typeIsNotNull() {
            addCriterion("distrib_type is not null");
            return (Criteria) this;
        }

        public Criteria andDistrib_typeEqualTo(Integer value) {
            addCriterion("distrib_type =", value, "distrib_type");
            return (Criteria) this;
        }

        public Criteria andDistrib_typeNotEqualTo(Integer value) {
            addCriterion("distrib_type <>", value, "distrib_type");
            return (Criteria) this;
        }

        public Criteria andDistrib_typeGreaterThan(Integer value) {
            addCriterion("distrib_type >", value, "distrib_type");
            return (Criteria) this;
        }

        public Criteria andDistrib_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("distrib_type >=", value, "distrib_type");
            return (Criteria) this;
        }

        public Criteria andDistrib_typeLessThan(Integer value) {
            addCriterion("distrib_type <", value, "distrib_type");
            return (Criteria) this;
        }

        public Criteria andDistrib_typeLessThanOrEqualTo(Integer value) {
            addCriterion("distrib_type <=", value, "distrib_type");
            return (Criteria) this;
        }

        public Criteria andDistrib_typeIn(List<Integer> values) {
            addCriterion("distrib_type in", values, "distrib_type");
            return (Criteria) this;
        }

        public Criteria andDistrib_typeNotIn(List<Integer> values) {
            addCriterion("distrib_type not in", values, "distrib_type");
            return (Criteria) this;
        }

        public Criteria andDistrib_typeBetween(Integer value1, Integer value2) {
            addCriterion("distrib_type between", value1, value2, "distrib_type");
            return (Criteria) this;
        }

        public Criteria andDistrib_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("distrib_type not between", value1, value2, "distrib_type");
            return (Criteria) this;
        }

        public Criteria andGoods_idIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoods_idIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_idEqualTo(Integer value) {
            addCriterion("goods_id =", value, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idNotEqualTo(Integer value) {
            addCriterion("goods_id <>", value, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idGreaterThan(Integer value) {
            addCriterion("goods_id >", value, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_id >=", value, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idLessThan(Integer value) {
            addCriterion("goods_id <", value, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idLessThanOrEqualTo(Integer value) {
            addCriterion("goods_id <=", value, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idIn(List<Integer> values) {
            addCriterion("goods_id in", values, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idNotIn(List<Integer> values) {
            addCriterion("goods_id not in", values, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idBetween(Integer value1, Integer value2) {
            addCriterion("goods_id between", value1, value2, "goods_id");
            return (Criteria) this;
        }

        public Criteria andGoods_idNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_id not between", value1, value2, "goods_id");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_ecsmart_distrib_goods
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
     * This class corresponds to the database table ecs_ecsmart_distrib_goods
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