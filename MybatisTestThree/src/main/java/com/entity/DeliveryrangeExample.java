package com.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DeliveryrangeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    public DeliveryrangeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
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
     * This method corresponds to the database table deliveryrange
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
     * This method corresponds to the database table deliveryrange
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryrange
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
     * This class corresponds to the database table deliveryrange
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

        public Criteria andRangeIDIsNull() {
            addCriterion("rangeID is null");
            return (Criteria) this;
        }

        public Criteria andRangeIDIsNotNull() {
            addCriterion("rangeID is not null");
            return (Criteria) this;
        }

        public Criteria andRangeIDEqualTo(String value) {
            addCriterion("rangeID =", value, "rangeID");
            return (Criteria) this;
        }

        public Criteria andRangeIDNotEqualTo(String value) {
            addCriterion("rangeID <>", value, "rangeID");
            return (Criteria) this;
        }

        public Criteria andRangeIDGreaterThan(String value) {
            addCriterion("rangeID >", value, "rangeID");
            return (Criteria) this;
        }

        public Criteria andRangeIDGreaterThanOrEqualTo(String value) {
            addCriterion("rangeID >=", value, "rangeID");
            return (Criteria) this;
        }

        public Criteria andRangeIDLessThan(String value) {
            addCriterion("rangeID <", value, "rangeID");
            return (Criteria) this;
        }

        public Criteria andRangeIDLessThanOrEqualTo(String value) {
            addCriterion("rangeID <=", value, "rangeID");
            return (Criteria) this;
        }

        public Criteria andRangeIDLike(String value) {
            addCriterion("rangeID like", value, "rangeID");
            return (Criteria) this;
        }

        public Criteria andRangeIDNotLike(String value) {
            addCriterion("rangeID not like", value, "rangeID");
            return (Criteria) this;
        }

        public Criteria andRangeIDIn(List<String> values) {
            addCriterion("rangeID in", values, "rangeID");
            return (Criteria) this;
        }

        public Criteria andRangeIDNotIn(List<String> values) {
            addCriterion("rangeID not in", values, "rangeID");
            return (Criteria) this;
        }

        public Criteria andRangeIDBetween(String value1, String value2) {
            addCriterion("rangeID between", value1, value2, "rangeID");
            return (Criteria) this;
        }

        public Criteria andRangeIDNotBetween(String value1, String value2) {
            addCriterion("rangeID not between", value1, value2, "rangeID");
            return (Criteria) this;
        }

        public Criteria andDePIDIsNull() {
            addCriterion("dePID is null");
            return (Criteria) this;
        }

        public Criteria andDePIDIsNotNull() {
            addCriterion("dePID is not null");
            return (Criteria) this;
        }

        public Criteria andDePIDEqualTo(String value) {
            addCriterion("dePID =", value, "dePID");
            return (Criteria) this;
        }

        public Criteria andDePIDNotEqualTo(String value) {
            addCriterion("dePID <>", value, "dePID");
            return (Criteria) this;
        }

        public Criteria andDePIDGreaterThan(String value) {
            addCriterion("dePID >", value, "dePID");
            return (Criteria) this;
        }

        public Criteria andDePIDGreaterThanOrEqualTo(String value) {
            addCriterion("dePID >=", value, "dePID");
            return (Criteria) this;
        }

        public Criteria andDePIDLessThan(String value) {
            addCriterion("dePID <", value, "dePID");
            return (Criteria) this;
        }

        public Criteria andDePIDLessThanOrEqualTo(String value) {
            addCriterion("dePID <=", value, "dePID");
            return (Criteria) this;
        }

        public Criteria andDePIDLike(String value) {
            addCriterion("dePID like", value, "dePID");
            return (Criteria) this;
        }

        public Criteria andDePIDNotLike(String value) {
            addCriterion("dePID not like", value, "dePID");
            return (Criteria) this;
        }

        public Criteria andDePIDIn(List<String> values) {
            addCriterion("dePID in", values, "dePID");
            return (Criteria) this;
        }

        public Criteria andDePIDNotIn(List<String> values) {
            addCriterion("dePID not in", values, "dePID");
            return (Criteria) this;
        }

        public Criteria andDePIDBetween(String value1, String value2) {
            addCriterion("dePID between", value1, value2, "dePID");
            return (Criteria) this;
        }

        public Criteria andDePIDNotBetween(String value1, String value2) {
            addCriterion("dePID not between", value1, value2, "dePID");
            return (Criteria) this;
        }

        public Criteria andAreaIDIsNull() {
            addCriterion("areaID is null");
            return (Criteria) this;
        }

        public Criteria andAreaIDIsNotNull() {
            addCriterion("areaID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIDEqualTo(String value) {
            addCriterion("areaID =", value, "areaID");
            return (Criteria) this;
        }

        public Criteria andAreaIDNotEqualTo(String value) {
            addCriterion("areaID <>", value, "areaID");
            return (Criteria) this;
        }

        public Criteria andAreaIDGreaterThan(String value) {
            addCriterion("areaID >", value, "areaID");
            return (Criteria) this;
        }

        public Criteria andAreaIDGreaterThanOrEqualTo(String value) {
            addCriterion("areaID >=", value, "areaID");
            return (Criteria) this;
        }

        public Criteria andAreaIDLessThan(String value) {
            addCriterion("areaID <", value, "areaID");
            return (Criteria) this;
        }

        public Criteria andAreaIDLessThanOrEqualTo(String value) {
            addCriterion("areaID <=", value, "areaID");
            return (Criteria) this;
        }

        public Criteria andAreaIDLike(String value) {
            addCriterion("areaID like", value, "areaID");
            return (Criteria) this;
        }

        public Criteria andAreaIDNotLike(String value) {
            addCriterion("areaID not like", value, "areaID");
            return (Criteria) this;
        }

        public Criteria andAreaIDIn(List<String> values) {
            addCriterion("areaID in", values, "areaID");
            return (Criteria) this;
        }

        public Criteria andAreaIDNotIn(List<String> values) {
            addCriterion("areaID not in", values, "areaID");
            return (Criteria) this;
        }

        public Criteria andAreaIDBetween(String value1, String value2) {
            addCriterion("areaID between", value1, value2, "areaID");
            return (Criteria) this;
        }

        public Criteria andAreaIDNotBetween(String value1, String value2) {
            addCriterion("areaID not between", value1, value2, "areaID");
            return (Criteria) this;
        }

        public Criteria andRangeNameIsNull() {
            addCriterion("rangeName is null");
            return (Criteria) this;
        }

        public Criteria andRangeNameIsNotNull() {
            addCriterion("rangeName is not null");
            return (Criteria) this;
        }

        public Criteria andRangeNameEqualTo(String value) {
            addCriterion("rangeName =", value, "rangeName");
            return (Criteria) this;
        }

        public Criteria andRangeNameNotEqualTo(String value) {
            addCriterion("rangeName <>", value, "rangeName");
            return (Criteria) this;
        }

        public Criteria andRangeNameGreaterThan(String value) {
            addCriterion("rangeName >", value, "rangeName");
            return (Criteria) this;
        }

        public Criteria andRangeNameGreaterThanOrEqualTo(String value) {
            addCriterion("rangeName >=", value, "rangeName");
            return (Criteria) this;
        }

        public Criteria andRangeNameLessThan(String value) {
            addCriterion("rangeName <", value, "rangeName");
            return (Criteria) this;
        }

        public Criteria andRangeNameLessThanOrEqualTo(String value) {
            addCriterion("rangeName <=", value, "rangeName");
            return (Criteria) this;
        }

        public Criteria andRangeNameLike(String value) {
            addCriterion("rangeName like", value, "rangeName");
            return (Criteria) this;
        }

        public Criteria andRangeNameNotLike(String value) {
            addCriterion("rangeName not like", value, "rangeName");
            return (Criteria) this;
        }

        public Criteria andRangeNameIn(List<String> values) {
            addCriterion("rangeName in", values, "rangeName");
            return (Criteria) this;
        }

        public Criteria andRangeNameNotIn(List<String> values) {
            addCriterion("rangeName not in", values, "rangeName");
            return (Criteria) this;
        }

        public Criteria andRangeNameBetween(String value1, String value2) {
            addCriterion("rangeName between", value1, value2, "rangeName");
            return (Criteria) this;
        }

        public Criteria andRangeNameNotBetween(String value1, String value2) {
            addCriterion("rangeName not between", value1, value2, "rangeName");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceIsNull() {
            addCriterion("deliveryPrice is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceIsNotNull() {
            addCriterion("deliveryPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceEqualTo(BigDecimal value) {
            addCriterion("deliveryPrice =", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceNotEqualTo(BigDecimal value) {
            addCriterion("deliveryPrice <>", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceGreaterThan(BigDecimal value) {
            addCriterion("deliveryPrice >", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deliveryPrice >=", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceLessThan(BigDecimal value) {
            addCriterion("deliveryPrice <", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deliveryPrice <=", value, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceIn(List<BigDecimal> values) {
            addCriterion("deliveryPrice in", values, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceNotIn(List<BigDecimal> values) {
            addCriterion("deliveryPrice not in", values, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deliveryPrice between", value1, value2, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andDeliveryPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deliveryPrice not between", value1, value2, "deliveryPrice");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("Comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("Comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("Comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("Comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("Comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("Comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("Comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("Comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("Comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("Comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("Comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("Comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("Comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("Comment not between", value1, value2, "comment");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table deliveryrange
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
     * This class corresponds to the database table deliveryrange
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