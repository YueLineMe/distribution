package com.entity;

import java.util.ArrayList;
import java.util.List;

public class DeliveryplaceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table deliveryplace
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table deliveryplace
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table deliveryplace
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryplace
     *
     * @mbg.generated
     */
    public DeliveryplaceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryplace
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryplace
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryplace
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryplace
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryplace
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryplace
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryplace
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
     * This method corresponds to the database table deliveryplace
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
     * This method corresponds to the database table deliveryplace
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deliveryplace
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
     * This class corresponds to the database table deliveryplace
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

        public Criteria andMgIDIsNull() {
            addCriterion("mgID is null");
            return (Criteria) this;
        }

        public Criteria andMgIDIsNotNull() {
            addCriterion("mgID is not null");
            return (Criteria) this;
        }

        public Criteria andMgIDEqualTo(String value) {
            addCriterion("mgID =", value, "mgID");
            return (Criteria) this;
        }

        public Criteria andMgIDNotEqualTo(String value) {
            addCriterion("mgID <>", value, "mgID");
            return (Criteria) this;
        }

        public Criteria andMgIDGreaterThan(String value) {
            addCriterion("mgID >", value, "mgID");
            return (Criteria) this;
        }

        public Criteria andMgIDGreaterThanOrEqualTo(String value) {
            addCriterion("mgID >=", value, "mgID");
            return (Criteria) this;
        }

        public Criteria andMgIDLessThan(String value) {
            addCriterion("mgID <", value, "mgID");
            return (Criteria) this;
        }

        public Criteria andMgIDLessThanOrEqualTo(String value) {
            addCriterion("mgID <=", value, "mgID");
            return (Criteria) this;
        }

        public Criteria andMgIDLike(String value) {
            addCriterion("mgID like", value, "mgID");
            return (Criteria) this;
        }

        public Criteria andMgIDNotLike(String value) {
            addCriterion("mgID not like", value, "mgID");
            return (Criteria) this;
        }

        public Criteria andMgIDIn(List<String> values) {
            addCriterion("mgID in", values, "mgID");
            return (Criteria) this;
        }

        public Criteria andMgIDNotIn(List<String> values) {
            addCriterion("mgID not in", values, "mgID");
            return (Criteria) this;
        }

        public Criteria andMgIDBetween(String value1, String value2) {
            addCriterion("mgID between", value1, value2, "mgID");
            return (Criteria) this;
        }

        public Criteria andMgIDNotBetween(String value1, String value2) {
            addCriterion("mgID not between", value1, value2, "mgID");
            return (Criteria) this;
        }

        public Criteria andDePNameIsNull() {
            addCriterion("dePName is null");
            return (Criteria) this;
        }

        public Criteria andDePNameIsNotNull() {
            addCriterion("dePName is not null");
            return (Criteria) this;
        }

        public Criteria andDePNameEqualTo(String value) {
            addCriterion("dePName =", value, "dePName");
            return (Criteria) this;
        }

        public Criteria andDePNameNotEqualTo(String value) {
            addCriterion("dePName <>", value, "dePName");
            return (Criteria) this;
        }

        public Criteria andDePNameGreaterThan(String value) {
            addCriterion("dePName >", value, "dePName");
            return (Criteria) this;
        }

        public Criteria andDePNameGreaterThanOrEqualTo(String value) {
            addCriterion("dePName >=", value, "dePName");
            return (Criteria) this;
        }

        public Criteria andDePNameLessThan(String value) {
            addCriterion("dePName <", value, "dePName");
            return (Criteria) this;
        }

        public Criteria andDePNameLessThanOrEqualTo(String value) {
            addCriterion("dePName <=", value, "dePName");
            return (Criteria) this;
        }

        public Criteria andDePNameLike(String value) {
            addCriterion("dePName like", value, "dePName");
            return (Criteria) this;
        }

        public Criteria andDePNameNotLike(String value) {
            addCriterion("dePName not like", value, "dePName");
            return (Criteria) this;
        }

        public Criteria andDePNameIn(List<String> values) {
            addCriterion("dePName in", values, "dePName");
            return (Criteria) this;
        }

        public Criteria andDePNameNotIn(List<String> values) {
            addCriterion("dePName not in", values, "dePName");
            return (Criteria) this;
        }

        public Criteria andDePNameBetween(String value1, String value2) {
            addCriterion("dePName between", value1, value2, "dePName");
            return (Criteria) this;
        }

        public Criteria andDePNameNotBetween(String value1, String value2) {
            addCriterion("dePName not between", value1, value2, "dePName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("provinceName is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("provinceName is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("provinceName =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("provinceName <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("provinceName >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("provinceName >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("provinceName <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("provinceName <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("provinceName like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("provinceName not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("provinceName in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("provinceName not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("provinceName between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("provinceName not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNull() {
            addCriterion("cityName is null");
            return (Criteria) this;
        }

        public Criteria andCityNameIsNotNull() {
            addCriterion("cityName is not null");
            return (Criteria) this;
        }

        public Criteria andCityNameEqualTo(String value) {
            addCriterion("cityName =", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotEqualTo(String value) {
            addCriterion("cityName <>", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThan(String value) {
            addCriterion("cityName >", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("cityName >=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThan(String value) {
            addCriterion("cityName <", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLessThanOrEqualTo(String value) {
            addCriterion("cityName <=", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameLike(String value) {
            addCriterion("cityName like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotLike(String value) {
            addCriterion("cityName not like", value, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameIn(List<String> values) {
            addCriterion("cityName in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotIn(List<String> values) {
            addCriterion("cityName not in", values, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameBetween(String value1, String value2) {
            addCriterion("cityName between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andCityNameNotBetween(String value1, String value2) {
            addCriterion("cityName not between", value1, value2, "cityName");
            return (Criteria) this;
        }

        public Criteria andMgNameIsNull() {
            addCriterion("mgName is null");
            return (Criteria) this;
        }

        public Criteria andMgNameIsNotNull() {
            addCriterion("mgName is not null");
            return (Criteria) this;
        }

        public Criteria andMgNameEqualTo(String value) {
            addCriterion("mgName =", value, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameNotEqualTo(String value) {
            addCriterion("mgName <>", value, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameGreaterThan(String value) {
            addCriterion("mgName >", value, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameGreaterThanOrEqualTo(String value) {
            addCriterion("mgName >=", value, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameLessThan(String value) {
            addCriterion("mgName <", value, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameLessThanOrEqualTo(String value) {
            addCriterion("mgName <=", value, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameLike(String value) {
            addCriterion("mgName like", value, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameNotLike(String value) {
            addCriterion("mgName not like", value, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameIn(List<String> values) {
            addCriterion("mgName in", values, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameNotIn(List<String> values) {
            addCriterion("mgName not in", values, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameBetween(String value1, String value2) {
            addCriterion("mgName between", value1, value2, "mgName");
            return (Criteria) this;
        }

        public Criteria andMgNameNotBetween(String value1, String value2) {
            addCriterion("mgName not between", value1, value2, "mgName");
            return (Criteria) this;
        }

        public Criteria andDePTelIsNull() {
            addCriterion("dePTel is null");
            return (Criteria) this;
        }

        public Criteria andDePTelIsNotNull() {
            addCriterion("dePTel is not null");
            return (Criteria) this;
        }

        public Criteria andDePTelEqualTo(String value) {
            addCriterion("dePTel =", value, "dePTel");
            return (Criteria) this;
        }

        public Criteria andDePTelNotEqualTo(String value) {
            addCriterion("dePTel <>", value, "dePTel");
            return (Criteria) this;
        }

        public Criteria andDePTelGreaterThan(String value) {
            addCriterion("dePTel >", value, "dePTel");
            return (Criteria) this;
        }

        public Criteria andDePTelGreaterThanOrEqualTo(String value) {
            addCriterion("dePTel >=", value, "dePTel");
            return (Criteria) this;
        }

        public Criteria andDePTelLessThan(String value) {
            addCriterion("dePTel <", value, "dePTel");
            return (Criteria) this;
        }

        public Criteria andDePTelLessThanOrEqualTo(String value) {
            addCriterion("dePTel <=", value, "dePTel");
            return (Criteria) this;
        }

        public Criteria andDePTelLike(String value) {
            addCriterion("dePTel like", value, "dePTel");
            return (Criteria) this;
        }

        public Criteria andDePTelNotLike(String value) {
            addCriterion("dePTel not like", value, "dePTel");
            return (Criteria) this;
        }

        public Criteria andDePTelIn(List<String> values) {
            addCriterion("dePTel in", values, "dePTel");
            return (Criteria) this;
        }

        public Criteria andDePTelNotIn(List<String> values) {
            addCriterion("dePTel not in", values, "dePTel");
            return (Criteria) this;
        }

        public Criteria andDePTelBetween(String value1, String value2) {
            addCriterion("dePTel between", value1, value2, "dePTel");
            return (Criteria) this;
        }

        public Criteria andDePTelNotBetween(String value1, String value2) {
            addCriterion("dePTel not between", value1, value2, "dePTel");
            return (Criteria) this;
        }

        public Criteria andDePAddrIsNull() {
            addCriterion("dePAddr is null");
            return (Criteria) this;
        }

        public Criteria andDePAddrIsNotNull() {
            addCriterion("dePAddr is not null");
            return (Criteria) this;
        }

        public Criteria andDePAddrEqualTo(String value) {
            addCriterion("dePAddr =", value, "dePAddr");
            return (Criteria) this;
        }

        public Criteria andDePAddrNotEqualTo(String value) {
            addCriterion("dePAddr <>", value, "dePAddr");
            return (Criteria) this;
        }

        public Criteria andDePAddrGreaterThan(String value) {
            addCriterion("dePAddr >", value, "dePAddr");
            return (Criteria) this;
        }

        public Criteria andDePAddrGreaterThanOrEqualTo(String value) {
            addCriterion("dePAddr >=", value, "dePAddr");
            return (Criteria) this;
        }

        public Criteria andDePAddrLessThan(String value) {
            addCriterion("dePAddr <", value, "dePAddr");
            return (Criteria) this;
        }

        public Criteria andDePAddrLessThanOrEqualTo(String value) {
            addCriterion("dePAddr <=", value, "dePAddr");
            return (Criteria) this;
        }

        public Criteria andDePAddrLike(String value) {
            addCriterion("dePAddr like", value, "dePAddr");
            return (Criteria) this;
        }

        public Criteria andDePAddrNotLike(String value) {
            addCriterion("dePAddr not like", value, "dePAddr");
            return (Criteria) this;
        }

        public Criteria andDePAddrIn(List<String> values) {
            addCriterion("dePAddr in", values, "dePAddr");
            return (Criteria) this;
        }

        public Criteria andDePAddrNotIn(List<String> values) {
            addCriterion("dePAddr not in", values, "dePAddr");
            return (Criteria) this;
        }

        public Criteria andDePAddrBetween(String value1, String value2) {
            addCriterion("dePAddr between", value1, value2, "dePAddr");
            return (Criteria) this;
        }

        public Criteria andDePAddrNotBetween(String value1, String value2) {
            addCriterion("dePAddr not between", value1, value2, "dePAddr");
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
     * This class corresponds to the database table deliveryplace
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
     * This class corresponds to the database table deliveryplace
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