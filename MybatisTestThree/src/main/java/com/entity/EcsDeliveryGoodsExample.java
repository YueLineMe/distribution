package com.entity;

import java.util.ArrayList;
import java.util.List;

public class EcsDeliveryGoodsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    public EcsDeliveryGoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
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
     * This method corresponds to the database table ecs_delivery_goods
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
     * This method corresponds to the database table ecs_delivery_goods
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_delivery_goods
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
     * This class corresponds to the database table ecs_delivery_goods
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

        public Criteria andRec_idEqualTo(Integer value) {
            addCriterion("rec_id =", value, "rec_id");
            return (Criteria) this;
        }

        public Criteria andRec_idNotEqualTo(Integer value) {
            addCriterion("rec_id <>", value, "rec_id");
            return (Criteria) this;
        }

        public Criteria andRec_idGreaterThan(Integer value) {
            addCriterion("rec_id >", value, "rec_id");
            return (Criteria) this;
        }

        public Criteria andRec_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("rec_id >=", value, "rec_id");
            return (Criteria) this;
        }

        public Criteria andRec_idLessThan(Integer value) {
            addCriterion("rec_id <", value, "rec_id");
            return (Criteria) this;
        }

        public Criteria andRec_idLessThanOrEqualTo(Integer value) {
            addCriterion("rec_id <=", value, "rec_id");
            return (Criteria) this;
        }

        public Criteria andRec_idIn(List<Integer> values) {
            addCriterion("rec_id in", values, "rec_id");
            return (Criteria) this;
        }

        public Criteria andRec_idNotIn(List<Integer> values) {
            addCriterion("rec_id not in", values, "rec_id");
            return (Criteria) this;
        }

        public Criteria andRec_idBetween(Integer value1, Integer value2) {
            addCriterion("rec_id between", value1, value2, "rec_id");
            return (Criteria) this;
        }

        public Criteria andRec_idNotBetween(Integer value1, Integer value2) {
            addCriterion("rec_id not between", value1, value2, "rec_id");
            return (Criteria) this;
        }

        public Criteria andDelivery_idIsNull() {
            addCriterion("delivery_id is null");
            return (Criteria) this;
        }

        public Criteria andDelivery_idIsNotNull() {
            addCriterion("delivery_id is not null");
            return (Criteria) this;
        }

        public Criteria andDelivery_idEqualTo(Integer value) {
            addCriterion("delivery_id =", value, "delivery_id");
            return (Criteria) this;
        }

        public Criteria andDelivery_idNotEqualTo(Integer value) {
            addCriterion("delivery_id <>", value, "delivery_id");
            return (Criteria) this;
        }

        public Criteria andDelivery_idGreaterThan(Integer value) {
            addCriterion("delivery_id >", value, "delivery_id");
            return (Criteria) this;
        }

        public Criteria andDelivery_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("delivery_id >=", value, "delivery_id");
            return (Criteria) this;
        }

        public Criteria andDelivery_idLessThan(Integer value) {
            addCriterion("delivery_id <", value, "delivery_id");
            return (Criteria) this;
        }

        public Criteria andDelivery_idLessThanOrEqualTo(Integer value) {
            addCriterion("delivery_id <=", value, "delivery_id");
            return (Criteria) this;
        }

        public Criteria andDelivery_idIn(List<Integer> values) {
            addCriterion("delivery_id in", values, "delivery_id");
            return (Criteria) this;
        }

        public Criteria andDelivery_idNotIn(List<Integer> values) {
            addCriterion("delivery_id not in", values, "delivery_id");
            return (Criteria) this;
        }

        public Criteria andDelivery_idBetween(Integer value1, Integer value2) {
            addCriterion("delivery_id between", value1, value2, "delivery_id");
            return (Criteria) this;
        }

        public Criteria andDelivery_idNotBetween(Integer value1, Integer value2) {
            addCriterion("delivery_id not between", value1, value2, "delivery_id");
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

        public Criteria andProduct_idIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProduct_idIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_idEqualTo(Integer value) {
            addCriterion("product_id =", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idGreaterThan(Integer value) {
            addCriterion("product_id >", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idLessThan(Integer value) {
            addCriterion("product_id <", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idIn(List<Integer> values) {
            addCriterion("product_id in", values, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_idNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "product_id");
            return (Criteria) this;
        }

        public Criteria andProduct_snIsNull() {
            addCriterion("product_sn is null");
            return (Criteria) this;
        }

        public Criteria andProduct_snIsNotNull() {
            addCriterion("product_sn is not null");
            return (Criteria) this;
        }

        public Criteria andProduct_snEqualTo(String value) {
            addCriterion("product_sn =", value, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snNotEqualTo(String value) {
            addCriterion("product_sn <>", value, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snGreaterThan(String value) {
            addCriterion("product_sn >", value, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snGreaterThanOrEqualTo(String value) {
            addCriterion("product_sn >=", value, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snLessThan(String value) {
            addCriterion("product_sn <", value, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snLessThanOrEqualTo(String value) {
            addCriterion("product_sn <=", value, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snLike(String value) {
            addCriterion("product_sn like", value, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snNotLike(String value) {
            addCriterion("product_sn not like", value, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snIn(List<String> values) {
            addCriterion("product_sn in", values, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snNotIn(List<String> values) {
            addCriterion("product_sn not in", values, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snBetween(String value1, String value2) {
            addCriterion("product_sn between", value1, value2, "product_sn");
            return (Criteria) this;
        }

        public Criteria andProduct_snNotBetween(String value1, String value2) {
            addCriterion("product_sn not between", value1, value2, "product_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_nameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoods_nameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_nameEqualTo(String value) {
            addCriterion("goods_name =", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameLessThan(String value) {
            addCriterion("goods_name <", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameLike(String value) {
            addCriterion("goods_name like", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameNotLike(String value) {
            addCriterion("goods_name not like", value, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameIn(List<String> values) {
            addCriterion("goods_name in", values, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goods_name");
            return (Criteria) this;
        }

        public Criteria andGoods_nameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goods_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrand_nameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrand_nameEqualTo(String value) {
            addCriterion("brand_name =", value, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameLessThan(String value) {
            addCriterion("brand_name <", value, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameLike(String value) {
            addCriterion("brand_name like", value, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameNotLike(String value) {
            addCriterion("brand_name not like", value, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameIn(List<String> values) {
            addCriterion("brand_name in", values, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brand_name");
            return (Criteria) this;
        }

        public Criteria andBrand_nameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brand_name");
            return (Criteria) this;
        }

        public Criteria andGoods_snIsNull() {
            addCriterion("goods_sn is null");
            return (Criteria) this;
        }

        public Criteria andGoods_snIsNotNull() {
            addCriterion("goods_sn is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_snEqualTo(String value) {
            addCriterion("goods_sn =", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snNotEqualTo(String value) {
            addCriterion("goods_sn <>", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snGreaterThan(String value) {
            addCriterion("goods_sn >", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snGreaterThanOrEqualTo(String value) {
            addCriterion("goods_sn >=", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snLessThan(String value) {
            addCriterion("goods_sn <", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snLessThanOrEqualTo(String value) {
            addCriterion("goods_sn <=", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snLike(String value) {
            addCriterion("goods_sn like", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snNotLike(String value) {
            addCriterion("goods_sn not like", value, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snIn(List<String> values) {
            addCriterion("goods_sn in", values, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snNotIn(List<String> values) {
            addCriterion("goods_sn not in", values, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snBetween(String value1, String value2) {
            addCriterion("goods_sn between", value1, value2, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andGoods_snNotBetween(String value1, String value2) {
            addCriterion("goods_sn not between", value1, value2, "goods_sn");
            return (Criteria) this;
        }

        public Criteria andIs_realIsNull() {
            addCriterion("is_real is null");
            return (Criteria) this;
        }

        public Criteria andIs_realIsNotNull() {
            addCriterion("is_real is not null");
            return (Criteria) this;
        }

        public Criteria andIs_realEqualTo(Boolean value) {
            addCriterion("is_real =", value, "is_real");
            return (Criteria) this;
        }

        public Criteria andIs_realNotEqualTo(Boolean value) {
            addCriterion("is_real <>", value, "is_real");
            return (Criteria) this;
        }

        public Criteria andIs_realGreaterThan(Boolean value) {
            addCriterion("is_real >", value, "is_real");
            return (Criteria) this;
        }

        public Criteria andIs_realGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_real >=", value, "is_real");
            return (Criteria) this;
        }

        public Criteria andIs_realLessThan(Boolean value) {
            addCriterion("is_real <", value, "is_real");
            return (Criteria) this;
        }

        public Criteria andIs_realLessThanOrEqualTo(Boolean value) {
            addCriterion("is_real <=", value, "is_real");
            return (Criteria) this;
        }

        public Criteria andIs_realIn(List<Boolean> values) {
            addCriterion("is_real in", values, "is_real");
            return (Criteria) this;
        }

        public Criteria andIs_realNotIn(List<Boolean> values) {
            addCriterion("is_real not in", values, "is_real");
            return (Criteria) this;
        }

        public Criteria andIs_realBetween(Boolean value1, Boolean value2) {
            addCriterion("is_real between", value1, value2, "is_real");
            return (Criteria) this;
        }

        public Criteria andIs_realNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_real not between", value1, value2, "is_real");
            return (Criteria) this;
        }

        public Criteria andExtension_codeIsNull() {
            addCriterion("extension_code is null");
            return (Criteria) this;
        }

        public Criteria andExtension_codeIsNotNull() {
            addCriterion("extension_code is not null");
            return (Criteria) this;
        }

        public Criteria andExtension_codeEqualTo(String value) {
            addCriterion("extension_code =", value, "extension_code");
            return (Criteria) this;
        }

        public Criteria andExtension_codeNotEqualTo(String value) {
            addCriterion("extension_code <>", value, "extension_code");
            return (Criteria) this;
        }

        public Criteria andExtension_codeGreaterThan(String value) {
            addCriterion("extension_code >", value, "extension_code");
            return (Criteria) this;
        }

        public Criteria andExtension_codeGreaterThanOrEqualTo(String value) {
            addCriterion("extension_code >=", value, "extension_code");
            return (Criteria) this;
        }

        public Criteria andExtension_codeLessThan(String value) {
            addCriterion("extension_code <", value, "extension_code");
            return (Criteria) this;
        }

        public Criteria andExtension_codeLessThanOrEqualTo(String value) {
            addCriterion("extension_code <=", value, "extension_code");
            return (Criteria) this;
        }

        public Criteria andExtension_codeLike(String value) {
            addCriterion("extension_code like", value, "extension_code");
            return (Criteria) this;
        }

        public Criteria andExtension_codeNotLike(String value) {
            addCriterion("extension_code not like", value, "extension_code");
            return (Criteria) this;
        }

        public Criteria andExtension_codeIn(List<String> values) {
            addCriterion("extension_code in", values, "extension_code");
            return (Criteria) this;
        }

        public Criteria andExtension_codeNotIn(List<String> values) {
            addCriterion("extension_code not in", values, "extension_code");
            return (Criteria) this;
        }

        public Criteria andExtension_codeBetween(String value1, String value2) {
            addCriterion("extension_code between", value1, value2, "extension_code");
            return (Criteria) this;
        }

        public Criteria andExtension_codeNotBetween(String value1, String value2) {
            addCriterion("extension_code not between", value1, value2, "extension_code");
            return (Criteria) this;
        }

        public Criteria andParent_idIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParent_idIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParent_idEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idLessThan(Integer value) {
            addCriterion("parent_id <", value, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parent_id");
            return (Criteria) this;
        }

        public Criteria andParent_idNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parent_id");
            return (Criteria) this;
        }

        public Criteria andSend_numberIsNull() {
            addCriterion("send_number is null");
            return (Criteria) this;
        }

        public Criteria andSend_numberIsNotNull() {
            addCriterion("send_number is not null");
            return (Criteria) this;
        }

        public Criteria andSend_numberEqualTo(Short value) {
            addCriterion("send_number =", value, "send_number");
            return (Criteria) this;
        }

        public Criteria andSend_numberNotEqualTo(Short value) {
            addCriterion("send_number <>", value, "send_number");
            return (Criteria) this;
        }

        public Criteria andSend_numberGreaterThan(Short value) {
            addCriterion("send_number >", value, "send_number");
            return (Criteria) this;
        }

        public Criteria andSend_numberGreaterThanOrEqualTo(Short value) {
            addCriterion("send_number >=", value, "send_number");
            return (Criteria) this;
        }

        public Criteria andSend_numberLessThan(Short value) {
            addCriterion("send_number <", value, "send_number");
            return (Criteria) this;
        }

        public Criteria andSend_numberLessThanOrEqualTo(Short value) {
            addCriterion("send_number <=", value, "send_number");
            return (Criteria) this;
        }

        public Criteria andSend_numberIn(List<Short> values) {
            addCriterion("send_number in", values, "send_number");
            return (Criteria) this;
        }

        public Criteria andSend_numberNotIn(List<Short> values) {
            addCriterion("send_number not in", values, "send_number");
            return (Criteria) this;
        }

        public Criteria andSend_numberBetween(Short value1, Short value2) {
            addCriterion("send_number between", value1, value2, "send_number");
            return (Criteria) this;
        }

        public Criteria andSend_numberNotBetween(Short value1, Short value2) {
            addCriterion("send_number not between", value1, value2, "send_number");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_delivery_goods
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
     * This class corresponds to the database table ecs_delivery_goods
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