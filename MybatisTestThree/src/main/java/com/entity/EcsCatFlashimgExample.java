package com.entity;

import java.util.ArrayList;
import java.util.List;

public class EcsCatFlashimgExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_cat_flashimg
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_cat_flashimg
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_cat_flashimg
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_cat_flashimg
     *
     * @mbg.generated
     */
    public EcsCatFlashimgExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_cat_flashimg
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_cat_flashimg
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_cat_flashimg
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_cat_flashimg
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_cat_flashimg
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_cat_flashimg
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_cat_flashimg
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
     * This method corresponds to the database table ecs_cat_flashimg
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
     * This method corresponds to the database table ecs_cat_flashimg
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_cat_flashimg
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
     * This class corresponds to the database table ecs_cat_flashimg
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

        public Criteria andImg_idIsNull() {
            addCriterion("img_id is null");
            return (Criteria) this;
        }

        public Criteria andImg_idIsNotNull() {
            addCriterion("img_id is not null");
            return (Criteria) this;
        }

        public Criteria andImg_idEqualTo(Short value) {
            addCriterion("img_id =", value, "img_id");
            return (Criteria) this;
        }

        public Criteria andImg_idNotEqualTo(Short value) {
            addCriterion("img_id <>", value, "img_id");
            return (Criteria) this;
        }

        public Criteria andImg_idGreaterThan(Short value) {
            addCriterion("img_id >", value, "img_id");
            return (Criteria) this;
        }

        public Criteria andImg_idGreaterThanOrEqualTo(Short value) {
            addCriterion("img_id >=", value, "img_id");
            return (Criteria) this;
        }

        public Criteria andImg_idLessThan(Short value) {
            addCriterion("img_id <", value, "img_id");
            return (Criteria) this;
        }

        public Criteria andImg_idLessThanOrEqualTo(Short value) {
            addCriterion("img_id <=", value, "img_id");
            return (Criteria) this;
        }

        public Criteria andImg_idIn(List<Short> values) {
            addCriterion("img_id in", values, "img_id");
            return (Criteria) this;
        }

        public Criteria andImg_idNotIn(List<Short> values) {
            addCriterion("img_id not in", values, "img_id");
            return (Criteria) this;
        }

        public Criteria andImg_idBetween(Short value1, Short value2) {
            addCriterion("img_id between", value1, value2, "img_id");
            return (Criteria) this;
        }

        public Criteria andImg_idNotBetween(Short value1, Short value2) {
            addCriterion("img_id not between", value1, value2, "img_id");
            return (Criteria) this;
        }

        public Criteria andCat_idIsNull() {
            addCriterion("cat_id is null");
            return (Criteria) this;
        }

        public Criteria andCat_idIsNotNull() {
            addCriterion("cat_id is not null");
            return (Criteria) this;
        }

        public Criteria andCat_idEqualTo(Short value) {
            addCriterion("cat_id =", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idNotEqualTo(Short value) {
            addCriterion("cat_id <>", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idGreaterThan(Short value) {
            addCriterion("cat_id >", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idGreaterThanOrEqualTo(Short value) {
            addCriterion("cat_id >=", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idLessThan(Short value) {
            addCriterion("cat_id <", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idLessThanOrEqualTo(Short value) {
            addCriterion("cat_id <=", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idIn(List<Short> values) {
            addCriterion("cat_id in", values, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idNotIn(List<Short> values) {
            addCriterion("cat_id not in", values, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idBetween(Short value1, Short value2) {
            addCriterion("cat_id between", value1, value2, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idNotBetween(Short value1, Short value2) {
            addCriterion("cat_id not between", value1, value2, "cat_id");
            return (Criteria) this;
        }

        public Criteria andImg_titleIsNull() {
            addCriterion("img_title is null");
            return (Criteria) this;
        }

        public Criteria andImg_titleIsNotNull() {
            addCriterion("img_title is not null");
            return (Criteria) this;
        }

        public Criteria andImg_titleEqualTo(String value) {
            addCriterion("img_title =", value, "img_title");
            return (Criteria) this;
        }

        public Criteria andImg_titleNotEqualTo(String value) {
            addCriterion("img_title <>", value, "img_title");
            return (Criteria) this;
        }

        public Criteria andImg_titleGreaterThan(String value) {
            addCriterion("img_title >", value, "img_title");
            return (Criteria) this;
        }

        public Criteria andImg_titleGreaterThanOrEqualTo(String value) {
            addCriterion("img_title >=", value, "img_title");
            return (Criteria) this;
        }

        public Criteria andImg_titleLessThan(String value) {
            addCriterion("img_title <", value, "img_title");
            return (Criteria) this;
        }

        public Criteria andImg_titleLessThanOrEqualTo(String value) {
            addCriterion("img_title <=", value, "img_title");
            return (Criteria) this;
        }

        public Criteria andImg_titleLike(String value) {
            addCriterion("img_title like", value, "img_title");
            return (Criteria) this;
        }

        public Criteria andImg_titleNotLike(String value) {
            addCriterion("img_title not like", value, "img_title");
            return (Criteria) this;
        }

        public Criteria andImg_titleIn(List<String> values) {
            addCriterion("img_title in", values, "img_title");
            return (Criteria) this;
        }

        public Criteria andImg_titleNotIn(List<String> values) {
            addCriterion("img_title not in", values, "img_title");
            return (Criteria) this;
        }

        public Criteria andImg_titleBetween(String value1, String value2) {
            addCriterion("img_title between", value1, value2, "img_title");
            return (Criteria) this;
        }

        public Criteria andImg_titleNotBetween(String value1, String value2) {
            addCriterion("img_title not between", value1, value2, "img_title");
            return (Criteria) this;
        }

        public Criteria andImg_descIsNull() {
            addCriterion("img_desc is null");
            return (Criteria) this;
        }

        public Criteria andImg_descIsNotNull() {
            addCriterion("img_desc is not null");
            return (Criteria) this;
        }

        public Criteria andImg_descEqualTo(String value) {
            addCriterion("img_desc =", value, "img_desc");
            return (Criteria) this;
        }

        public Criteria andImg_descNotEqualTo(String value) {
            addCriterion("img_desc <>", value, "img_desc");
            return (Criteria) this;
        }

        public Criteria andImg_descGreaterThan(String value) {
            addCriterion("img_desc >", value, "img_desc");
            return (Criteria) this;
        }

        public Criteria andImg_descGreaterThanOrEqualTo(String value) {
            addCriterion("img_desc >=", value, "img_desc");
            return (Criteria) this;
        }

        public Criteria andImg_descLessThan(String value) {
            addCriterion("img_desc <", value, "img_desc");
            return (Criteria) this;
        }

        public Criteria andImg_descLessThanOrEqualTo(String value) {
            addCriterion("img_desc <=", value, "img_desc");
            return (Criteria) this;
        }

        public Criteria andImg_descLike(String value) {
            addCriterion("img_desc like", value, "img_desc");
            return (Criteria) this;
        }

        public Criteria andImg_descNotLike(String value) {
            addCriterion("img_desc not like", value, "img_desc");
            return (Criteria) this;
        }

        public Criteria andImg_descIn(List<String> values) {
            addCriterion("img_desc in", values, "img_desc");
            return (Criteria) this;
        }

        public Criteria andImg_descNotIn(List<String> values) {
            addCriterion("img_desc not in", values, "img_desc");
            return (Criteria) this;
        }

        public Criteria andImg_descBetween(String value1, String value2) {
            addCriterion("img_desc between", value1, value2, "img_desc");
            return (Criteria) this;
        }

        public Criteria andImg_descNotBetween(String value1, String value2) {
            addCriterion("img_desc not between", value1, value2, "img_desc");
            return (Criteria) this;
        }

        public Criteria andImg_urlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImg_urlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImg_urlEqualTo(String value) {
            addCriterion("img_url =", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlGreaterThan(String value) {
            addCriterion("img_url >", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlLessThan(String value) {
            addCriterion("img_url <", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlLike(String value) {
            addCriterion("img_url like", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlNotLike(String value) {
            addCriterion("img_url not like", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlIn(List<String> values) {
            addCriterion("img_url in", values, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "img_url");
            return (Criteria) this;
        }

        public Criteria andHref_urlIsNull() {
            addCriterion("href_url is null");
            return (Criteria) this;
        }

        public Criteria andHref_urlIsNotNull() {
            addCriterion("href_url is not null");
            return (Criteria) this;
        }

        public Criteria andHref_urlEqualTo(String value) {
            addCriterion("href_url =", value, "href_url");
            return (Criteria) this;
        }

        public Criteria andHref_urlNotEqualTo(String value) {
            addCriterion("href_url <>", value, "href_url");
            return (Criteria) this;
        }

        public Criteria andHref_urlGreaterThan(String value) {
            addCriterion("href_url >", value, "href_url");
            return (Criteria) this;
        }

        public Criteria andHref_urlGreaterThanOrEqualTo(String value) {
            addCriterion("href_url >=", value, "href_url");
            return (Criteria) this;
        }

        public Criteria andHref_urlLessThan(String value) {
            addCriterion("href_url <", value, "href_url");
            return (Criteria) this;
        }

        public Criteria andHref_urlLessThanOrEqualTo(String value) {
            addCriterion("href_url <=", value, "href_url");
            return (Criteria) this;
        }

        public Criteria andHref_urlLike(String value) {
            addCriterion("href_url like", value, "href_url");
            return (Criteria) this;
        }

        public Criteria andHref_urlNotLike(String value) {
            addCriterion("href_url not like", value, "href_url");
            return (Criteria) this;
        }

        public Criteria andHref_urlIn(List<String> values) {
            addCriterion("href_url in", values, "href_url");
            return (Criteria) this;
        }

        public Criteria andHref_urlNotIn(List<String> values) {
            addCriterion("href_url not in", values, "href_url");
            return (Criteria) this;
        }

        public Criteria andHref_urlBetween(String value1, String value2) {
            addCriterion("href_url between", value1, value2, "href_url");
            return (Criteria) this;
        }

        public Criteria andHref_urlNotBetween(String value1, String value2) {
            addCriterion("href_url not between", value1, value2, "href_url");
            return (Criteria) this;
        }

        public Criteria andSort_orderIsNull() {
            addCriterion("sort_order is null");
            return (Criteria) this;
        }

        public Criteria andSort_orderIsNotNull() {
            addCriterion("sort_order is not null");
            return (Criteria) this;
        }

        public Criteria andSort_orderEqualTo(Byte value) {
            addCriterion("sort_order =", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderNotEqualTo(Byte value) {
            addCriterion("sort_order <>", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderGreaterThan(Byte value) {
            addCriterion("sort_order >", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderGreaterThanOrEqualTo(Byte value) {
            addCriterion("sort_order >=", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderLessThan(Byte value) {
            addCriterion("sort_order <", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderLessThanOrEqualTo(Byte value) {
            addCriterion("sort_order <=", value, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderIn(List<Byte> values) {
            addCriterion("sort_order in", values, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderNotIn(List<Byte> values) {
            addCriterion("sort_order not in", values, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderBetween(Byte value1, Byte value2) {
            addCriterion("sort_order between", value1, value2, "sort_order");
            return (Criteria) this;
        }

        public Criteria andSort_orderNotBetween(Byte value1, Byte value2) {
            addCriterion("sort_order not between", value1, value2, "sort_order");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_cat_flashimg
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
     * This class corresponds to the database table ecs_cat_flashimg
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