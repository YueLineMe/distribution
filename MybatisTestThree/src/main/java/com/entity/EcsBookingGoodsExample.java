package com.entity;

import java.util.ArrayList;
import java.util.List;

public class EcsBookingGoodsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    public EcsBookingGoodsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
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
     * This method corresponds to the database table ecs_booking_goods
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
     * This method corresponds to the database table ecs_booking_goods
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_booking_goods
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
     * This class corresponds to the database table ecs_booking_goods
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

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLink_manIsNull() {
            addCriterion("link_man is null");
            return (Criteria) this;
        }

        public Criteria andLink_manIsNotNull() {
            addCriterion("link_man is not null");
            return (Criteria) this;
        }

        public Criteria andLink_manEqualTo(String value) {
            addCriterion("link_man =", value, "link_man");
            return (Criteria) this;
        }

        public Criteria andLink_manNotEqualTo(String value) {
            addCriterion("link_man <>", value, "link_man");
            return (Criteria) this;
        }

        public Criteria andLink_manGreaterThan(String value) {
            addCriterion("link_man >", value, "link_man");
            return (Criteria) this;
        }

        public Criteria andLink_manGreaterThanOrEqualTo(String value) {
            addCriterion("link_man >=", value, "link_man");
            return (Criteria) this;
        }

        public Criteria andLink_manLessThan(String value) {
            addCriterion("link_man <", value, "link_man");
            return (Criteria) this;
        }

        public Criteria andLink_manLessThanOrEqualTo(String value) {
            addCriterion("link_man <=", value, "link_man");
            return (Criteria) this;
        }

        public Criteria andLink_manLike(String value) {
            addCriterion("link_man like", value, "link_man");
            return (Criteria) this;
        }

        public Criteria andLink_manNotLike(String value) {
            addCriterion("link_man not like", value, "link_man");
            return (Criteria) this;
        }

        public Criteria andLink_manIn(List<String> values) {
            addCriterion("link_man in", values, "link_man");
            return (Criteria) this;
        }

        public Criteria andLink_manNotIn(List<String> values) {
            addCriterion("link_man not in", values, "link_man");
            return (Criteria) this;
        }

        public Criteria andLink_manBetween(String value1, String value2) {
            addCriterion("link_man between", value1, value2, "link_man");
            return (Criteria) this;
        }

        public Criteria andLink_manNotBetween(String value1, String value2) {
            addCriterion("link_man not between", value1, value2, "link_man");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
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

        public Criteria andGoods_descIsNull() {
            addCriterion("goods_desc is null");
            return (Criteria) this;
        }

        public Criteria andGoods_descIsNotNull() {
            addCriterion("goods_desc is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_descEqualTo(String value) {
            addCriterion("goods_desc =", value, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descNotEqualTo(String value) {
            addCriterion("goods_desc <>", value, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descGreaterThan(String value) {
            addCriterion("goods_desc >", value, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descGreaterThanOrEqualTo(String value) {
            addCriterion("goods_desc >=", value, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descLessThan(String value) {
            addCriterion("goods_desc <", value, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descLessThanOrEqualTo(String value) {
            addCriterion("goods_desc <=", value, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descLike(String value) {
            addCriterion("goods_desc like", value, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descNotLike(String value) {
            addCriterion("goods_desc not like", value, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descIn(List<String> values) {
            addCriterion("goods_desc in", values, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descNotIn(List<String> values) {
            addCriterion("goods_desc not in", values, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descBetween(String value1, String value2) {
            addCriterion("goods_desc between", value1, value2, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_descNotBetween(String value1, String value2) {
            addCriterion("goods_desc not between", value1, value2, "goods_desc");
            return (Criteria) this;
        }

        public Criteria andGoods_numberIsNull() {
            addCriterion("goods_number is null");
            return (Criteria) this;
        }

        public Criteria andGoods_numberIsNotNull() {
            addCriterion("goods_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_numberEqualTo(Short value) {
            addCriterion("goods_number =", value, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberNotEqualTo(Short value) {
            addCriterion("goods_number <>", value, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberGreaterThan(Short value) {
            addCriterion("goods_number >", value, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberGreaterThanOrEqualTo(Short value) {
            addCriterion("goods_number >=", value, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberLessThan(Short value) {
            addCriterion("goods_number <", value, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberLessThanOrEqualTo(Short value) {
            addCriterion("goods_number <=", value, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberIn(List<Short> values) {
            addCriterion("goods_number in", values, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberNotIn(List<Short> values) {
            addCriterion("goods_number not in", values, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberBetween(Short value1, Short value2) {
            addCriterion("goods_number between", value1, value2, "goods_number");
            return (Criteria) this;
        }

        public Criteria andGoods_numberNotBetween(Short value1, Short value2) {
            addCriterion("goods_number not between", value1, value2, "goods_number");
            return (Criteria) this;
        }

        public Criteria andBooking_timeIsNull() {
            addCriterion("booking_time is null");
            return (Criteria) this;
        }

        public Criteria andBooking_timeIsNotNull() {
            addCriterion("booking_time is not null");
            return (Criteria) this;
        }

        public Criteria andBooking_timeEqualTo(Integer value) {
            addCriterion("booking_time =", value, "booking_time");
            return (Criteria) this;
        }

        public Criteria andBooking_timeNotEqualTo(Integer value) {
            addCriterion("booking_time <>", value, "booking_time");
            return (Criteria) this;
        }

        public Criteria andBooking_timeGreaterThan(Integer value) {
            addCriterion("booking_time >", value, "booking_time");
            return (Criteria) this;
        }

        public Criteria andBooking_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("booking_time >=", value, "booking_time");
            return (Criteria) this;
        }

        public Criteria andBooking_timeLessThan(Integer value) {
            addCriterion("booking_time <", value, "booking_time");
            return (Criteria) this;
        }

        public Criteria andBooking_timeLessThanOrEqualTo(Integer value) {
            addCriterion("booking_time <=", value, "booking_time");
            return (Criteria) this;
        }

        public Criteria andBooking_timeIn(List<Integer> values) {
            addCriterion("booking_time in", values, "booking_time");
            return (Criteria) this;
        }

        public Criteria andBooking_timeNotIn(List<Integer> values) {
            addCriterion("booking_time not in", values, "booking_time");
            return (Criteria) this;
        }

        public Criteria andBooking_timeBetween(Integer value1, Integer value2) {
            addCriterion("booking_time between", value1, value2, "booking_time");
            return (Criteria) this;
        }

        public Criteria andBooking_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("booking_time not between", value1, value2, "booking_time");
            return (Criteria) this;
        }

        public Criteria andIs_disposeIsNull() {
            addCriterion("is_dispose is null");
            return (Criteria) this;
        }

        public Criteria andIs_disposeIsNotNull() {
            addCriterion("is_dispose is not null");
            return (Criteria) this;
        }

        public Criteria andIs_disposeEqualTo(Boolean value) {
            addCriterion("is_dispose =", value, "is_dispose");
            return (Criteria) this;
        }

        public Criteria andIs_disposeNotEqualTo(Boolean value) {
            addCriterion("is_dispose <>", value, "is_dispose");
            return (Criteria) this;
        }

        public Criteria andIs_disposeGreaterThan(Boolean value) {
            addCriterion("is_dispose >", value, "is_dispose");
            return (Criteria) this;
        }

        public Criteria andIs_disposeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_dispose >=", value, "is_dispose");
            return (Criteria) this;
        }

        public Criteria andIs_disposeLessThan(Boolean value) {
            addCriterion("is_dispose <", value, "is_dispose");
            return (Criteria) this;
        }

        public Criteria andIs_disposeLessThanOrEqualTo(Boolean value) {
            addCriterion("is_dispose <=", value, "is_dispose");
            return (Criteria) this;
        }

        public Criteria andIs_disposeIn(List<Boolean> values) {
            addCriterion("is_dispose in", values, "is_dispose");
            return (Criteria) this;
        }

        public Criteria andIs_disposeNotIn(List<Boolean> values) {
            addCriterion("is_dispose not in", values, "is_dispose");
            return (Criteria) this;
        }

        public Criteria andIs_disposeBetween(Boolean value1, Boolean value2) {
            addCriterion("is_dispose between", value1, value2, "is_dispose");
            return (Criteria) this;
        }

        public Criteria andIs_disposeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_dispose not between", value1, value2, "is_dispose");
            return (Criteria) this;
        }

        public Criteria andDispose_userIsNull() {
            addCriterion("dispose_user is null");
            return (Criteria) this;
        }

        public Criteria andDispose_userIsNotNull() {
            addCriterion("dispose_user is not null");
            return (Criteria) this;
        }

        public Criteria andDispose_userEqualTo(String value) {
            addCriterion("dispose_user =", value, "dispose_user");
            return (Criteria) this;
        }

        public Criteria andDispose_userNotEqualTo(String value) {
            addCriterion("dispose_user <>", value, "dispose_user");
            return (Criteria) this;
        }

        public Criteria andDispose_userGreaterThan(String value) {
            addCriterion("dispose_user >", value, "dispose_user");
            return (Criteria) this;
        }

        public Criteria andDispose_userGreaterThanOrEqualTo(String value) {
            addCriterion("dispose_user >=", value, "dispose_user");
            return (Criteria) this;
        }

        public Criteria andDispose_userLessThan(String value) {
            addCriterion("dispose_user <", value, "dispose_user");
            return (Criteria) this;
        }

        public Criteria andDispose_userLessThanOrEqualTo(String value) {
            addCriterion("dispose_user <=", value, "dispose_user");
            return (Criteria) this;
        }

        public Criteria andDispose_userLike(String value) {
            addCriterion("dispose_user like", value, "dispose_user");
            return (Criteria) this;
        }

        public Criteria andDispose_userNotLike(String value) {
            addCriterion("dispose_user not like", value, "dispose_user");
            return (Criteria) this;
        }

        public Criteria andDispose_userIn(List<String> values) {
            addCriterion("dispose_user in", values, "dispose_user");
            return (Criteria) this;
        }

        public Criteria andDispose_userNotIn(List<String> values) {
            addCriterion("dispose_user not in", values, "dispose_user");
            return (Criteria) this;
        }

        public Criteria andDispose_userBetween(String value1, String value2) {
            addCriterion("dispose_user between", value1, value2, "dispose_user");
            return (Criteria) this;
        }

        public Criteria andDispose_userNotBetween(String value1, String value2) {
            addCriterion("dispose_user not between", value1, value2, "dispose_user");
            return (Criteria) this;
        }

        public Criteria andDispose_timeIsNull() {
            addCriterion("dispose_time is null");
            return (Criteria) this;
        }

        public Criteria andDispose_timeIsNotNull() {
            addCriterion("dispose_time is not null");
            return (Criteria) this;
        }

        public Criteria andDispose_timeEqualTo(Integer value) {
            addCriterion("dispose_time =", value, "dispose_time");
            return (Criteria) this;
        }

        public Criteria andDispose_timeNotEqualTo(Integer value) {
            addCriterion("dispose_time <>", value, "dispose_time");
            return (Criteria) this;
        }

        public Criteria andDispose_timeGreaterThan(Integer value) {
            addCriterion("dispose_time >", value, "dispose_time");
            return (Criteria) this;
        }

        public Criteria andDispose_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dispose_time >=", value, "dispose_time");
            return (Criteria) this;
        }

        public Criteria andDispose_timeLessThan(Integer value) {
            addCriterion("dispose_time <", value, "dispose_time");
            return (Criteria) this;
        }

        public Criteria andDispose_timeLessThanOrEqualTo(Integer value) {
            addCriterion("dispose_time <=", value, "dispose_time");
            return (Criteria) this;
        }

        public Criteria andDispose_timeIn(List<Integer> values) {
            addCriterion("dispose_time in", values, "dispose_time");
            return (Criteria) this;
        }

        public Criteria andDispose_timeNotIn(List<Integer> values) {
            addCriterion("dispose_time not in", values, "dispose_time");
            return (Criteria) this;
        }

        public Criteria andDispose_timeBetween(Integer value1, Integer value2) {
            addCriterion("dispose_time between", value1, value2, "dispose_time");
            return (Criteria) this;
        }

        public Criteria andDispose_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("dispose_time not between", value1, value2, "dispose_time");
            return (Criteria) this;
        }

        public Criteria andDispose_noteIsNull() {
            addCriterion("dispose_note is null");
            return (Criteria) this;
        }

        public Criteria andDispose_noteIsNotNull() {
            addCriterion("dispose_note is not null");
            return (Criteria) this;
        }

        public Criteria andDispose_noteEqualTo(String value) {
            addCriterion("dispose_note =", value, "dispose_note");
            return (Criteria) this;
        }

        public Criteria andDispose_noteNotEqualTo(String value) {
            addCriterion("dispose_note <>", value, "dispose_note");
            return (Criteria) this;
        }

        public Criteria andDispose_noteGreaterThan(String value) {
            addCriterion("dispose_note >", value, "dispose_note");
            return (Criteria) this;
        }

        public Criteria andDispose_noteGreaterThanOrEqualTo(String value) {
            addCriterion("dispose_note >=", value, "dispose_note");
            return (Criteria) this;
        }

        public Criteria andDispose_noteLessThan(String value) {
            addCriterion("dispose_note <", value, "dispose_note");
            return (Criteria) this;
        }

        public Criteria andDispose_noteLessThanOrEqualTo(String value) {
            addCriterion("dispose_note <=", value, "dispose_note");
            return (Criteria) this;
        }

        public Criteria andDispose_noteLike(String value) {
            addCriterion("dispose_note like", value, "dispose_note");
            return (Criteria) this;
        }

        public Criteria andDispose_noteNotLike(String value) {
            addCriterion("dispose_note not like", value, "dispose_note");
            return (Criteria) this;
        }

        public Criteria andDispose_noteIn(List<String> values) {
            addCriterion("dispose_note in", values, "dispose_note");
            return (Criteria) this;
        }

        public Criteria andDispose_noteNotIn(List<String> values) {
            addCriterion("dispose_note not in", values, "dispose_note");
            return (Criteria) this;
        }

        public Criteria andDispose_noteBetween(String value1, String value2) {
            addCriterion("dispose_note between", value1, value2, "dispose_note");
            return (Criteria) this;
        }

        public Criteria andDispose_noteNotBetween(String value1, String value2) {
            addCriterion("dispose_note not between", value1, value2, "dispose_note");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_booking_goods
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
     * This class corresponds to the database table ecs_booking_goods
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