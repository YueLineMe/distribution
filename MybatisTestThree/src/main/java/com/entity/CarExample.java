package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table car
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table car
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table car
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public CarExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
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
     * This method corresponds to the database table car
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
     * This method corresponds to the database table car
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table car
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
     * This class corresponds to the database table car
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

        public Criteria andCarIDIsNull() {
            addCriterion("carID is null");
            return (Criteria) this;
        }

        public Criteria andCarIDIsNotNull() {
            addCriterion("carID is not null");
            return (Criteria) this;
        }

        public Criteria andCarIDEqualTo(String value) {
            addCriterion("carID =", value, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDNotEqualTo(String value) {
            addCriterion("carID <>", value, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDGreaterThan(String value) {
            addCriterion("carID >", value, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDGreaterThanOrEqualTo(String value) {
            addCriterion("carID >=", value, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDLessThan(String value) {
            addCriterion("carID <", value, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDLessThanOrEqualTo(String value) {
            addCriterion("carID <=", value, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDLike(String value) {
            addCriterion("carID like", value, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDNotLike(String value) {
            addCriterion("carID not like", value, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDIn(List<String> values) {
            addCriterion("carID in", values, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDNotIn(List<String> values) {
            addCriterion("carID not in", values, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDBetween(String value1, String value2) {
            addCriterion("carID between", value1, value2, "carID");
            return (Criteria) this;
        }

        public Criteria andCarIDNotBetween(String value1, String value2) {
            addCriterion("carID not between", value1, value2, "carID");
            return (Criteria) this;
        }

        public Criteria andRouteIDIsNull() {
            addCriterion("routeID is null");
            return (Criteria) this;
        }

        public Criteria andRouteIDIsNotNull() {
            addCriterion("routeID is not null");
            return (Criteria) this;
        }

        public Criteria andRouteIDEqualTo(String value) {
            addCriterion("routeID =", value, "routeID");
            return (Criteria) this;
        }

        public Criteria andRouteIDNotEqualTo(String value) {
            addCriterion("routeID <>", value, "routeID");
            return (Criteria) this;
        }

        public Criteria andRouteIDGreaterThan(String value) {
            addCriterion("routeID >", value, "routeID");
            return (Criteria) this;
        }

        public Criteria andRouteIDGreaterThanOrEqualTo(String value) {
            addCriterion("routeID >=", value, "routeID");
            return (Criteria) this;
        }

        public Criteria andRouteIDLessThan(String value) {
            addCriterion("routeID <", value, "routeID");
            return (Criteria) this;
        }

        public Criteria andRouteIDLessThanOrEqualTo(String value) {
            addCriterion("routeID <=", value, "routeID");
            return (Criteria) this;
        }

        public Criteria andRouteIDLike(String value) {
            addCriterion("routeID like", value, "routeID");
            return (Criteria) this;
        }

        public Criteria andRouteIDNotLike(String value) {
            addCriterion("routeID not like", value, "routeID");
            return (Criteria) this;
        }

        public Criteria andRouteIDIn(List<String> values) {
            addCriterion("routeID in", values, "routeID");
            return (Criteria) this;
        }

        public Criteria andRouteIDNotIn(List<String> values) {
            addCriterion("routeID not in", values, "routeID");
            return (Criteria) this;
        }

        public Criteria andRouteIDBetween(String value1, String value2) {
            addCriterion("routeID between", value1, value2, "routeID");
            return (Criteria) this;
        }

        public Criteria andRouteIDNotBetween(String value1, String value2) {
            addCriterion("routeID not between", value1, value2, "routeID");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("carType is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("carType is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(String value) {
            addCriterion("carType =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(String value) {
            addCriterion("carType <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(String value) {
            addCriterion("carType >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("carType >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(String value) {
            addCriterion("carType <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(String value) {
            addCriterion("carType <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(String value) {
            addCriterion("carType like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(String value) {
            addCriterion("carType not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<String> values) {
            addCriterion("carType in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<String> values) {
            addCriterion("carType not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(String value1, String value2) {
            addCriterion("carType between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(String value1, String value2) {
            addCriterion("carType not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarOrginIsNull() {
            addCriterion("carOrgin is null");
            return (Criteria) this;
        }

        public Criteria andCarOrginIsNotNull() {
            addCriterion("carOrgin is not null");
            return (Criteria) this;
        }

        public Criteria andCarOrginEqualTo(String value) {
            addCriterion("carOrgin =", value, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginNotEqualTo(String value) {
            addCriterion("carOrgin <>", value, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginGreaterThan(String value) {
            addCriterion("carOrgin >", value, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginGreaterThanOrEqualTo(String value) {
            addCriterion("carOrgin >=", value, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginLessThan(String value) {
            addCriterion("carOrgin <", value, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginLessThanOrEqualTo(String value) {
            addCriterion("carOrgin <=", value, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginLike(String value) {
            addCriterion("carOrgin like", value, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginNotLike(String value) {
            addCriterion("carOrgin not like", value, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginIn(List<String> values) {
            addCriterion("carOrgin in", values, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginNotIn(List<String> values) {
            addCriterion("carOrgin not in", values, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginBetween(String value1, String value2) {
            addCriterion("carOrgin between", value1, value2, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarOrginNotBetween(String value1, String value2) {
            addCriterion("carOrgin not between", value1, value2, "carOrgin");
            return (Criteria) this;
        }

        public Criteria andCarProDateIsNull() {
            addCriterion("carProDate is null");
            return (Criteria) this;
        }

        public Criteria andCarProDateIsNotNull() {
            addCriterion("carProDate is not null");
            return (Criteria) this;
        }

        public Criteria andCarProDateEqualTo(Date value) {
            addCriterion("carProDate =", value, "carProDate");
            return (Criteria) this;
        }

        public Criteria andCarProDateNotEqualTo(Date value) {
            addCriterion("carProDate <>", value, "carProDate");
            return (Criteria) this;
        }

        public Criteria andCarProDateGreaterThan(Date value) {
            addCriterion("carProDate >", value, "carProDate");
            return (Criteria) this;
        }

        public Criteria andCarProDateGreaterThanOrEqualTo(Date value) {
            addCriterion("carProDate >=", value, "carProDate");
            return (Criteria) this;
        }

        public Criteria andCarProDateLessThan(Date value) {
            addCriterion("carProDate <", value, "carProDate");
            return (Criteria) this;
        }

        public Criteria andCarProDateLessThanOrEqualTo(Date value) {
            addCriterion("carProDate <=", value, "carProDate");
            return (Criteria) this;
        }

        public Criteria andCarProDateIn(List<Date> values) {
            addCriterion("carProDate in", values, "carProDate");
            return (Criteria) this;
        }

        public Criteria andCarProDateNotIn(List<Date> values) {
            addCriterion("carProDate not in", values, "carProDate");
            return (Criteria) this;
        }

        public Criteria andCarProDateBetween(Date value1, Date value2) {
            addCriterion("carProDate between", value1, value2, "carProDate");
            return (Criteria) this;
        }

        public Criteria andCarProDateNotBetween(Date value1, Date value2) {
            addCriterion("carProDate not between", value1, value2, "carProDate");
            return (Criteria) this;
        }

        public Criteria andCarBuyDateIsNull() {
            addCriterion("carBuyDate is null");
            return (Criteria) this;
        }

        public Criteria andCarBuyDateIsNotNull() {
            addCriterion("carBuyDate is not null");
            return (Criteria) this;
        }

        public Criteria andCarBuyDateEqualTo(Date value) {
            addCriterion("carBuyDate =", value, "carBuyDate");
            return (Criteria) this;
        }

        public Criteria andCarBuyDateNotEqualTo(Date value) {
            addCriterion("carBuyDate <>", value, "carBuyDate");
            return (Criteria) this;
        }

        public Criteria andCarBuyDateGreaterThan(Date value) {
            addCriterion("carBuyDate >", value, "carBuyDate");
            return (Criteria) this;
        }

        public Criteria andCarBuyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("carBuyDate >=", value, "carBuyDate");
            return (Criteria) this;
        }

        public Criteria andCarBuyDateLessThan(Date value) {
            addCriterion("carBuyDate <", value, "carBuyDate");
            return (Criteria) this;
        }

        public Criteria andCarBuyDateLessThanOrEqualTo(Date value) {
            addCriterion("carBuyDate <=", value, "carBuyDate");
            return (Criteria) this;
        }

        public Criteria andCarBuyDateIn(List<Date> values) {
            addCriterion("carBuyDate in", values, "carBuyDate");
            return (Criteria) this;
        }

        public Criteria andCarBuyDateNotIn(List<Date> values) {
            addCriterion("carBuyDate not in", values, "carBuyDate");
            return (Criteria) this;
        }

        public Criteria andCarBuyDateBetween(Date value1, Date value2) {
            addCriterion("carBuyDate between", value1, value2, "carBuyDate");
            return (Criteria) this;
        }

        public Criteria andCarBuyDateNotBetween(Date value1, Date value2) {
            addCriterion("carBuyDate not between", value1, value2, "carBuyDate");
            return (Criteria) this;
        }

        public Criteria andCarCapacityIsNull() {
            addCriterion("carCapacity is null");
            return (Criteria) this;
        }

        public Criteria andCarCapacityIsNotNull() {
            addCriterion("carCapacity is not null");
            return (Criteria) this;
        }

        public Criteria andCarCapacityEqualTo(Integer value) {
            addCriterion("carCapacity =", value, "carCapacity");
            return (Criteria) this;
        }

        public Criteria andCarCapacityNotEqualTo(Integer value) {
            addCriterion("carCapacity <>", value, "carCapacity");
            return (Criteria) this;
        }

        public Criteria andCarCapacityGreaterThan(Integer value) {
            addCriterion("carCapacity >", value, "carCapacity");
            return (Criteria) this;
        }

        public Criteria andCarCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("carCapacity >=", value, "carCapacity");
            return (Criteria) this;
        }

        public Criteria andCarCapacityLessThan(Integer value) {
            addCriterion("carCapacity <", value, "carCapacity");
            return (Criteria) this;
        }

        public Criteria andCarCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("carCapacity <=", value, "carCapacity");
            return (Criteria) this;
        }

        public Criteria andCarCapacityIn(List<Integer> values) {
            addCriterion("carCapacity in", values, "carCapacity");
            return (Criteria) this;
        }

        public Criteria andCarCapacityNotIn(List<Integer> values) {
            addCriterion("carCapacity not in", values, "carCapacity");
            return (Criteria) this;
        }

        public Criteria andCarCapacityBetween(Integer value1, Integer value2) {
            addCriterion("carCapacity between", value1, value2, "carCapacity");
            return (Criteria) this;
        }

        public Criteria andCarCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("carCapacity not between", value1, value2, "carCapacity");
            return (Criteria) this;
        }

        public Criteria andCarstateIsNull() {
            addCriterion("carstate is null");
            return (Criteria) this;
        }

        public Criteria andCarstateIsNotNull() {
            addCriterion("carstate is not null");
            return (Criteria) this;
        }

        public Criteria andCarstateEqualTo(Boolean value) {
            addCriterion("carstate =", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateNotEqualTo(Boolean value) {
            addCriterion("carstate <>", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateGreaterThan(Boolean value) {
            addCriterion("carstate >", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("carstate >=", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateLessThan(Boolean value) {
            addCriterion("carstate <", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateLessThanOrEqualTo(Boolean value) {
            addCriterion("carstate <=", value, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateIn(List<Boolean> values) {
            addCriterion("carstate in", values, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateNotIn(List<Boolean> values) {
            addCriterion("carstate not in", values, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateBetween(Boolean value1, Boolean value2) {
            addCriterion("carstate between", value1, value2, "carstate");
            return (Criteria) this;
        }

        public Criteria andCarstateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("carstate not between", value1, value2, "carstate");
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
     * This class corresponds to the database table car
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
     * This class corresponds to the database table car
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