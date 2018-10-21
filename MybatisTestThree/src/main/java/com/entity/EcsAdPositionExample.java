package com.entity;

import java.util.ArrayList;
import java.util.List;

public class EcsAdPositionExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    public EcsAdPositionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
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
     * This method corresponds to the database table ecs_ad_position
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
     * This method corresponds to the database table ecs_ad_position
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ad_position
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
     * This class corresponds to the database table ecs_ad_position
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

        public Criteria andPosition_idIsNull() {
            addCriterion("position_id is null");
            return (Criteria) this;
        }

        public Criteria andPosition_idIsNotNull() {
            addCriterion("position_id is not null");
            return (Criteria) this;
        }

        public Criteria andPosition_idEqualTo(Byte value) {
            addCriterion("position_id =", value, "position_id");
            return (Criteria) this;
        }

        public Criteria andPosition_idNotEqualTo(Byte value) {
            addCriterion("position_id <>", value, "position_id");
            return (Criteria) this;
        }

        public Criteria andPosition_idGreaterThan(Byte value) {
            addCriterion("position_id >", value, "position_id");
            return (Criteria) this;
        }

        public Criteria andPosition_idGreaterThanOrEqualTo(Byte value) {
            addCriterion("position_id >=", value, "position_id");
            return (Criteria) this;
        }

        public Criteria andPosition_idLessThan(Byte value) {
            addCriterion("position_id <", value, "position_id");
            return (Criteria) this;
        }

        public Criteria andPosition_idLessThanOrEqualTo(Byte value) {
            addCriterion("position_id <=", value, "position_id");
            return (Criteria) this;
        }

        public Criteria andPosition_idIn(List<Byte> values) {
            addCriterion("position_id in", values, "position_id");
            return (Criteria) this;
        }

        public Criteria andPosition_idNotIn(List<Byte> values) {
            addCriterion("position_id not in", values, "position_id");
            return (Criteria) this;
        }

        public Criteria andPosition_idBetween(Byte value1, Byte value2) {
            addCriterion("position_id between", value1, value2, "position_id");
            return (Criteria) this;
        }

        public Criteria andPosition_idNotBetween(Byte value1, Byte value2) {
            addCriterion("position_id not between", value1, value2, "position_id");
            return (Criteria) this;
        }

        public Criteria andPosition_nameIsNull() {
            addCriterion("position_name is null");
            return (Criteria) this;
        }

        public Criteria andPosition_nameIsNotNull() {
            addCriterion("position_name is not null");
            return (Criteria) this;
        }

        public Criteria andPosition_nameEqualTo(String value) {
            addCriterion("position_name =", value, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameNotEqualTo(String value) {
            addCriterion("position_name <>", value, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameGreaterThan(String value) {
            addCriterion("position_name >", value, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameGreaterThanOrEqualTo(String value) {
            addCriterion("position_name >=", value, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameLessThan(String value) {
            addCriterion("position_name <", value, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameLessThanOrEqualTo(String value) {
            addCriterion("position_name <=", value, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameLike(String value) {
            addCriterion("position_name like", value, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameNotLike(String value) {
            addCriterion("position_name not like", value, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameIn(List<String> values) {
            addCriterion("position_name in", values, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameNotIn(List<String> values) {
            addCriterion("position_name not in", values, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameBetween(String value1, String value2) {
            addCriterion("position_name between", value1, value2, "position_name");
            return (Criteria) this;
        }

        public Criteria andPosition_nameNotBetween(String value1, String value2) {
            addCriterion("position_name not between", value1, value2, "position_name");
            return (Criteria) this;
        }

        public Criteria andAd_widthIsNull() {
            addCriterion("ad_width is null");
            return (Criteria) this;
        }

        public Criteria andAd_widthIsNotNull() {
            addCriterion("ad_width is not null");
            return (Criteria) this;
        }

        public Criteria andAd_widthEqualTo(Short value) {
            addCriterion("ad_width =", value, "ad_width");
            return (Criteria) this;
        }

        public Criteria andAd_widthNotEqualTo(Short value) {
            addCriterion("ad_width <>", value, "ad_width");
            return (Criteria) this;
        }

        public Criteria andAd_widthGreaterThan(Short value) {
            addCriterion("ad_width >", value, "ad_width");
            return (Criteria) this;
        }

        public Criteria andAd_widthGreaterThanOrEqualTo(Short value) {
            addCriterion("ad_width >=", value, "ad_width");
            return (Criteria) this;
        }

        public Criteria andAd_widthLessThan(Short value) {
            addCriterion("ad_width <", value, "ad_width");
            return (Criteria) this;
        }

        public Criteria andAd_widthLessThanOrEqualTo(Short value) {
            addCriterion("ad_width <=", value, "ad_width");
            return (Criteria) this;
        }

        public Criteria andAd_widthIn(List<Short> values) {
            addCriterion("ad_width in", values, "ad_width");
            return (Criteria) this;
        }

        public Criteria andAd_widthNotIn(List<Short> values) {
            addCriterion("ad_width not in", values, "ad_width");
            return (Criteria) this;
        }

        public Criteria andAd_widthBetween(Short value1, Short value2) {
            addCriterion("ad_width between", value1, value2, "ad_width");
            return (Criteria) this;
        }

        public Criteria andAd_widthNotBetween(Short value1, Short value2) {
            addCriterion("ad_width not between", value1, value2, "ad_width");
            return (Criteria) this;
        }

        public Criteria andAd_heightIsNull() {
            addCriterion("ad_height is null");
            return (Criteria) this;
        }

        public Criteria andAd_heightIsNotNull() {
            addCriterion("ad_height is not null");
            return (Criteria) this;
        }

        public Criteria andAd_heightEqualTo(Short value) {
            addCriterion("ad_height =", value, "ad_height");
            return (Criteria) this;
        }

        public Criteria andAd_heightNotEqualTo(Short value) {
            addCriterion("ad_height <>", value, "ad_height");
            return (Criteria) this;
        }

        public Criteria andAd_heightGreaterThan(Short value) {
            addCriterion("ad_height >", value, "ad_height");
            return (Criteria) this;
        }

        public Criteria andAd_heightGreaterThanOrEqualTo(Short value) {
            addCriterion("ad_height >=", value, "ad_height");
            return (Criteria) this;
        }

        public Criteria andAd_heightLessThan(Short value) {
            addCriterion("ad_height <", value, "ad_height");
            return (Criteria) this;
        }

        public Criteria andAd_heightLessThanOrEqualTo(Short value) {
            addCriterion("ad_height <=", value, "ad_height");
            return (Criteria) this;
        }

        public Criteria andAd_heightIn(List<Short> values) {
            addCriterion("ad_height in", values, "ad_height");
            return (Criteria) this;
        }

        public Criteria andAd_heightNotIn(List<Short> values) {
            addCriterion("ad_height not in", values, "ad_height");
            return (Criteria) this;
        }

        public Criteria andAd_heightBetween(Short value1, Short value2) {
            addCriterion("ad_height between", value1, value2, "ad_height");
            return (Criteria) this;
        }

        public Criteria andAd_heightNotBetween(Short value1, Short value2) {
            addCriterion("ad_height not between", value1, value2, "ad_height");
            return (Criteria) this;
        }

        public Criteria andPosition_descIsNull() {
            addCriterion("position_desc is null");
            return (Criteria) this;
        }

        public Criteria andPosition_descIsNotNull() {
            addCriterion("position_desc is not null");
            return (Criteria) this;
        }

        public Criteria andPosition_descEqualTo(String value) {
            addCriterion("position_desc =", value, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descNotEqualTo(String value) {
            addCriterion("position_desc <>", value, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descGreaterThan(String value) {
            addCriterion("position_desc >", value, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descGreaterThanOrEqualTo(String value) {
            addCriterion("position_desc >=", value, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descLessThan(String value) {
            addCriterion("position_desc <", value, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descLessThanOrEqualTo(String value) {
            addCriterion("position_desc <=", value, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descLike(String value) {
            addCriterion("position_desc like", value, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descNotLike(String value) {
            addCriterion("position_desc not like", value, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descIn(List<String> values) {
            addCriterion("position_desc in", values, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descNotIn(List<String> values) {
            addCriterion("position_desc not in", values, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descBetween(String value1, String value2) {
            addCriterion("position_desc between", value1, value2, "position_desc");
            return (Criteria) this;
        }

        public Criteria andPosition_descNotBetween(String value1, String value2) {
            addCriterion("position_desc not between", value1, value2, "position_desc");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_ad_position
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
     * This class corresponds to the database table ecs_ad_position
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