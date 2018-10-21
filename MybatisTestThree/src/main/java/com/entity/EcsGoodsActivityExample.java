package com.entity;

import java.util.ArrayList;
import java.util.List;

public class EcsGoodsActivityExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_goods_activity
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_goods_activity
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_goods_activity
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_activity
     *
     * @mbg.generated
     */
    public EcsGoodsActivityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_activity
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_activity
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_activity
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_activity
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_activity
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_activity
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_activity
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
     * This method corresponds to the database table ecs_goods_activity
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
     * This method corresponds to the database table ecs_goods_activity
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_activity
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
     * This class corresponds to the database table ecs_goods_activity
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

        public Criteria andAct_idIsNull() {
            addCriterion("act_id is null");
            return (Criteria) this;
        }

        public Criteria andAct_idIsNotNull() {
            addCriterion("act_id is not null");
            return (Criteria) this;
        }

        public Criteria andAct_idEqualTo(Integer value) {
            addCriterion("act_id =", value, "act_id");
            return (Criteria) this;
        }

        public Criteria andAct_idNotEqualTo(Integer value) {
            addCriterion("act_id <>", value, "act_id");
            return (Criteria) this;
        }

        public Criteria andAct_idGreaterThan(Integer value) {
            addCriterion("act_id >", value, "act_id");
            return (Criteria) this;
        }

        public Criteria andAct_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("act_id >=", value, "act_id");
            return (Criteria) this;
        }

        public Criteria andAct_idLessThan(Integer value) {
            addCriterion("act_id <", value, "act_id");
            return (Criteria) this;
        }

        public Criteria andAct_idLessThanOrEqualTo(Integer value) {
            addCriterion("act_id <=", value, "act_id");
            return (Criteria) this;
        }

        public Criteria andAct_idIn(List<Integer> values) {
            addCriterion("act_id in", values, "act_id");
            return (Criteria) this;
        }

        public Criteria andAct_idNotIn(List<Integer> values) {
            addCriterion("act_id not in", values, "act_id");
            return (Criteria) this;
        }

        public Criteria andAct_idBetween(Integer value1, Integer value2) {
            addCriterion("act_id between", value1, value2, "act_id");
            return (Criteria) this;
        }

        public Criteria andAct_idNotBetween(Integer value1, Integer value2) {
            addCriterion("act_id not between", value1, value2, "act_id");
            return (Criteria) this;
        }

        public Criteria andAct_nameIsNull() {
            addCriterion("act_name is null");
            return (Criteria) this;
        }

        public Criteria andAct_nameIsNotNull() {
            addCriterion("act_name is not null");
            return (Criteria) this;
        }

        public Criteria andAct_nameEqualTo(String value) {
            addCriterion("act_name =", value, "act_name");
            return (Criteria) this;
        }

        public Criteria andAct_nameNotEqualTo(String value) {
            addCriterion("act_name <>", value, "act_name");
            return (Criteria) this;
        }

        public Criteria andAct_nameGreaterThan(String value) {
            addCriterion("act_name >", value, "act_name");
            return (Criteria) this;
        }

        public Criteria andAct_nameGreaterThanOrEqualTo(String value) {
            addCriterion("act_name >=", value, "act_name");
            return (Criteria) this;
        }

        public Criteria andAct_nameLessThan(String value) {
            addCriterion("act_name <", value, "act_name");
            return (Criteria) this;
        }

        public Criteria andAct_nameLessThanOrEqualTo(String value) {
            addCriterion("act_name <=", value, "act_name");
            return (Criteria) this;
        }

        public Criteria andAct_nameLike(String value) {
            addCriterion("act_name like", value, "act_name");
            return (Criteria) this;
        }

        public Criteria andAct_nameNotLike(String value) {
            addCriterion("act_name not like", value, "act_name");
            return (Criteria) this;
        }

        public Criteria andAct_nameIn(List<String> values) {
            addCriterion("act_name in", values, "act_name");
            return (Criteria) this;
        }

        public Criteria andAct_nameNotIn(List<String> values) {
            addCriterion("act_name not in", values, "act_name");
            return (Criteria) this;
        }

        public Criteria andAct_nameBetween(String value1, String value2) {
            addCriterion("act_name between", value1, value2, "act_name");
            return (Criteria) this;
        }

        public Criteria andAct_nameNotBetween(String value1, String value2) {
            addCriterion("act_name not between", value1, value2, "act_name");
            return (Criteria) this;
        }

        public Criteria andAct_typeIsNull() {
            addCriterion("act_type is null");
            return (Criteria) this;
        }

        public Criteria andAct_typeIsNotNull() {
            addCriterion("act_type is not null");
            return (Criteria) this;
        }

        public Criteria andAct_typeEqualTo(Byte value) {
            addCriterion("act_type =", value, "act_type");
            return (Criteria) this;
        }

        public Criteria andAct_typeNotEqualTo(Byte value) {
            addCriterion("act_type <>", value, "act_type");
            return (Criteria) this;
        }

        public Criteria andAct_typeGreaterThan(Byte value) {
            addCriterion("act_type >", value, "act_type");
            return (Criteria) this;
        }

        public Criteria andAct_typeGreaterThanOrEqualTo(Byte value) {
            addCriterion("act_type >=", value, "act_type");
            return (Criteria) this;
        }

        public Criteria andAct_typeLessThan(Byte value) {
            addCriterion("act_type <", value, "act_type");
            return (Criteria) this;
        }

        public Criteria andAct_typeLessThanOrEqualTo(Byte value) {
            addCriterion("act_type <=", value, "act_type");
            return (Criteria) this;
        }

        public Criteria andAct_typeIn(List<Byte> values) {
            addCriterion("act_type in", values, "act_type");
            return (Criteria) this;
        }

        public Criteria andAct_typeNotIn(List<Byte> values) {
            addCriterion("act_type not in", values, "act_type");
            return (Criteria) this;
        }

        public Criteria andAct_typeBetween(Byte value1, Byte value2) {
            addCriterion("act_type between", value1, value2, "act_type");
            return (Criteria) this;
        }

        public Criteria andAct_typeNotBetween(Byte value1, Byte value2) {
            addCriterion("act_type not between", value1, value2, "act_type");
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

        public Criteria andIs_finishedIsNull() {
            addCriterion("is_finished is null");
            return (Criteria) this;
        }

        public Criteria andIs_finishedIsNotNull() {
            addCriterion("is_finished is not null");
            return (Criteria) this;
        }

        public Criteria andIs_finishedEqualTo(Byte value) {
            addCriterion("is_finished =", value, "is_finished");
            return (Criteria) this;
        }

        public Criteria andIs_finishedNotEqualTo(Byte value) {
            addCriterion("is_finished <>", value, "is_finished");
            return (Criteria) this;
        }

        public Criteria andIs_finishedGreaterThan(Byte value) {
            addCriterion("is_finished >", value, "is_finished");
            return (Criteria) this;
        }

        public Criteria andIs_finishedGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_finished >=", value, "is_finished");
            return (Criteria) this;
        }

        public Criteria andIs_finishedLessThan(Byte value) {
            addCriterion("is_finished <", value, "is_finished");
            return (Criteria) this;
        }

        public Criteria andIs_finishedLessThanOrEqualTo(Byte value) {
            addCriterion("is_finished <=", value, "is_finished");
            return (Criteria) this;
        }

        public Criteria andIs_finishedIn(List<Byte> values) {
            addCriterion("is_finished in", values, "is_finished");
            return (Criteria) this;
        }

        public Criteria andIs_finishedNotIn(List<Byte> values) {
            addCriterion("is_finished not in", values, "is_finished");
            return (Criteria) this;
        }

        public Criteria andIs_finishedBetween(Byte value1, Byte value2) {
            addCriterion("is_finished between", value1, value2, "is_finished");
            return (Criteria) this;
        }

        public Criteria andIs_finishedNotBetween(Byte value1, Byte value2) {
            addCriterion("is_finished not between", value1, value2, "is_finished");
            return (Criteria) this;
        }

        public Criteria andSupplier_idIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplier_idIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplier_idEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplier_id");
            return (Criteria) this;
        }

        public Criteria andSupplier_idNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplier_id");
            return (Criteria) this;
        }

        public Criteria andSupplier_idGreaterThan(Integer value) {
            addCriterion("supplier_id >", value, "supplier_id");
            return (Criteria) this;
        }

        public Criteria andSupplier_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplier_id");
            return (Criteria) this;
        }

        public Criteria andSupplier_idLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplier_id");
            return (Criteria) this;
        }

        public Criteria andSupplier_idLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplier_id");
            return (Criteria) this;
        }

        public Criteria andSupplier_idIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplier_id");
            return (Criteria) this;
        }

        public Criteria andSupplier_idNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplier_id");
            return (Criteria) this;
        }

        public Criteria andSupplier_idBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplier_id");
            return (Criteria) this;
        }

        public Criteria andSupplier_idNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplier_id");
            return (Criteria) this;
        }

        public Criteria andAct_countIsNull() {
            addCriterion("act_count is null");
            return (Criteria) this;
        }

        public Criteria andAct_countIsNotNull() {
            addCriterion("act_count is not null");
            return (Criteria) this;
        }

        public Criteria andAct_countEqualTo(Integer value) {
            addCriterion("act_count =", value, "act_count");
            return (Criteria) this;
        }

        public Criteria andAct_countNotEqualTo(Integer value) {
            addCriterion("act_count <>", value, "act_count");
            return (Criteria) this;
        }

        public Criteria andAct_countGreaterThan(Integer value) {
            addCriterion("act_count >", value, "act_count");
            return (Criteria) this;
        }

        public Criteria andAct_countGreaterThanOrEqualTo(Integer value) {
            addCriterion("act_count >=", value, "act_count");
            return (Criteria) this;
        }

        public Criteria andAct_countLessThan(Integer value) {
            addCriterion("act_count <", value, "act_count");
            return (Criteria) this;
        }

        public Criteria andAct_countLessThanOrEqualTo(Integer value) {
            addCriterion("act_count <=", value, "act_count");
            return (Criteria) this;
        }

        public Criteria andAct_countIn(List<Integer> values) {
            addCriterion("act_count in", values, "act_count");
            return (Criteria) this;
        }

        public Criteria andAct_countNotIn(List<Integer> values) {
            addCriterion("act_count not in", values, "act_count");
            return (Criteria) this;
        }

        public Criteria andAct_countBetween(Integer value1, Integer value2) {
            addCriterion("act_count between", value1, value2, "act_count");
            return (Criteria) this;
        }

        public Criteria andAct_countNotBetween(Integer value1, Integer value2) {
            addCriterion("act_count not between", value1, value2, "act_count");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_goods_activity
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
     * This class corresponds to the database table ecs_goods_activity
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