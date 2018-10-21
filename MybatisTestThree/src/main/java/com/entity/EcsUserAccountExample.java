package com.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class EcsUserAccountExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    public EcsUserAccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_account
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
     * This method corresponds to the database table ecs_user_account
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
     * This method corresponds to the database table ecs_user_account
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_account
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
     * This class corresponds to the database table ecs_user_account
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

        public Criteria andAdmin_userIsNull() {
            addCriterion("admin_user is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_userIsNotNull() {
            addCriterion("admin_user is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_userEqualTo(String value) {
            addCriterion("admin_user =", value, "admin_user");
            return (Criteria) this;
        }

        public Criteria andAdmin_userNotEqualTo(String value) {
            addCriterion("admin_user <>", value, "admin_user");
            return (Criteria) this;
        }

        public Criteria andAdmin_userGreaterThan(String value) {
            addCriterion("admin_user >", value, "admin_user");
            return (Criteria) this;
        }

        public Criteria andAdmin_userGreaterThanOrEqualTo(String value) {
            addCriterion("admin_user >=", value, "admin_user");
            return (Criteria) this;
        }

        public Criteria andAdmin_userLessThan(String value) {
            addCriterion("admin_user <", value, "admin_user");
            return (Criteria) this;
        }

        public Criteria andAdmin_userLessThanOrEqualTo(String value) {
            addCriterion("admin_user <=", value, "admin_user");
            return (Criteria) this;
        }

        public Criteria andAdmin_userLike(String value) {
            addCriterion("admin_user like", value, "admin_user");
            return (Criteria) this;
        }

        public Criteria andAdmin_userNotLike(String value) {
            addCriterion("admin_user not like", value, "admin_user");
            return (Criteria) this;
        }

        public Criteria andAdmin_userIn(List<String> values) {
            addCriterion("admin_user in", values, "admin_user");
            return (Criteria) this;
        }

        public Criteria andAdmin_userNotIn(List<String> values) {
            addCriterion("admin_user not in", values, "admin_user");
            return (Criteria) this;
        }

        public Criteria andAdmin_userBetween(String value1, String value2) {
            addCriterion("admin_user between", value1, value2, "admin_user");
            return (Criteria) this;
        }

        public Criteria andAdmin_userNotBetween(String value1, String value2) {
            addCriterion("admin_user not between", value1, value2, "admin_user");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAdd_timeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAdd_timeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdd_timeEqualTo(Integer value) {
            addCriterion("add_time =", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeLessThan(Integer value) {
            addCriterion("add_time <", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeIn(List<Integer> values) {
            addCriterion("add_time in", values, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "add_time");
            return (Criteria) this;
        }

        public Criteria andPaid_timeIsNull() {
            addCriterion("paid_time is null");
            return (Criteria) this;
        }

        public Criteria andPaid_timeIsNotNull() {
            addCriterion("paid_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaid_timeEqualTo(Integer value) {
            addCriterion("paid_time =", value, "paid_time");
            return (Criteria) this;
        }

        public Criteria andPaid_timeNotEqualTo(Integer value) {
            addCriterion("paid_time <>", value, "paid_time");
            return (Criteria) this;
        }

        public Criteria andPaid_timeGreaterThan(Integer value) {
            addCriterion("paid_time >", value, "paid_time");
            return (Criteria) this;
        }

        public Criteria andPaid_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("paid_time >=", value, "paid_time");
            return (Criteria) this;
        }

        public Criteria andPaid_timeLessThan(Integer value) {
            addCriterion("paid_time <", value, "paid_time");
            return (Criteria) this;
        }

        public Criteria andPaid_timeLessThanOrEqualTo(Integer value) {
            addCriterion("paid_time <=", value, "paid_time");
            return (Criteria) this;
        }

        public Criteria andPaid_timeIn(List<Integer> values) {
            addCriterion("paid_time in", values, "paid_time");
            return (Criteria) this;
        }

        public Criteria andPaid_timeNotIn(List<Integer> values) {
            addCriterion("paid_time not in", values, "paid_time");
            return (Criteria) this;
        }

        public Criteria andPaid_timeBetween(Integer value1, Integer value2) {
            addCriterion("paid_time between", value1, value2, "paid_time");
            return (Criteria) this;
        }

        public Criteria andPaid_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("paid_time not between", value1, value2, "paid_time");
            return (Criteria) this;
        }

        public Criteria andAdmin_noteIsNull() {
            addCriterion("admin_note is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_noteIsNotNull() {
            addCriterion("admin_note is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_noteEqualTo(String value) {
            addCriterion("admin_note =", value, "admin_note");
            return (Criteria) this;
        }

        public Criteria andAdmin_noteNotEqualTo(String value) {
            addCriterion("admin_note <>", value, "admin_note");
            return (Criteria) this;
        }

        public Criteria andAdmin_noteGreaterThan(String value) {
            addCriterion("admin_note >", value, "admin_note");
            return (Criteria) this;
        }

        public Criteria andAdmin_noteGreaterThanOrEqualTo(String value) {
            addCriterion("admin_note >=", value, "admin_note");
            return (Criteria) this;
        }

        public Criteria andAdmin_noteLessThan(String value) {
            addCriterion("admin_note <", value, "admin_note");
            return (Criteria) this;
        }

        public Criteria andAdmin_noteLessThanOrEqualTo(String value) {
            addCriterion("admin_note <=", value, "admin_note");
            return (Criteria) this;
        }

        public Criteria andAdmin_noteLike(String value) {
            addCriterion("admin_note like", value, "admin_note");
            return (Criteria) this;
        }

        public Criteria andAdmin_noteNotLike(String value) {
            addCriterion("admin_note not like", value, "admin_note");
            return (Criteria) this;
        }

        public Criteria andAdmin_noteIn(List<String> values) {
            addCriterion("admin_note in", values, "admin_note");
            return (Criteria) this;
        }

        public Criteria andAdmin_noteNotIn(List<String> values) {
            addCriterion("admin_note not in", values, "admin_note");
            return (Criteria) this;
        }

        public Criteria andAdmin_noteBetween(String value1, String value2) {
            addCriterion("admin_note between", value1, value2, "admin_note");
            return (Criteria) this;
        }

        public Criteria andAdmin_noteNotBetween(String value1, String value2) {
            addCriterion("admin_note not between", value1, value2, "admin_note");
            return (Criteria) this;
        }

        public Criteria andUser_noteIsNull() {
            addCriterion("user_note is null");
            return (Criteria) this;
        }

        public Criteria andUser_noteIsNotNull() {
            addCriterion("user_note is not null");
            return (Criteria) this;
        }

        public Criteria andUser_noteEqualTo(String value) {
            addCriterion("user_note =", value, "user_note");
            return (Criteria) this;
        }

        public Criteria andUser_noteNotEqualTo(String value) {
            addCriterion("user_note <>", value, "user_note");
            return (Criteria) this;
        }

        public Criteria andUser_noteGreaterThan(String value) {
            addCriterion("user_note >", value, "user_note");
            return (Criteria) this;
        }

        public Criteria andUser_noteGreaterThanOrEqualTo(String value) {
            addCriterion("user_note >=", value, "user_note");
            return (Criteria) this;
        }

        public Criteria andUser_noteLessThan(String value) {
            addCriterion("user_note <", value, "user_note");
            return (Criteria) this;
        }

        public Criteria andUser_noteLessThanOrEqualTo(String value) {
            addCriterion("user_note <=", value, "user_note");
            return (Criteria) this;
        }

        public Criteria andUser_noteLike(String value) {
            addCriterion("user_note like", value, "user_note");
            return (Criteria) this;
        }

        public Criteria andUser_noteNotLike(String value) {
            addCriterion("user_note not like", value, "user_note");
            return (Criteria) this;
        }

        public Criteria andUser_noteIn(List<String> values) {
            addCriterion("user_note in", values, "user_note");
            return (Criteria) this;
        }

        public Criteria andUser_noteNotIn(List<String> values) {
            addCriterion("user_note not in", values, "user_note");
            return (Criteria) this;
        }

        public Criteria andUser_noteBetween(String value1, String value2) {
            addCriterion("user_note between", value1, value2, "user_note");
            return (Criteria) this;
        }

        public Criteria andUser_noteNotBetween(String value1, String value2) {
            addCriterion("user_note not between", value1, value2, "user_note");
            return (Criteria) this;
        }

        public Criteria andProcess_typeIsNull() {
            addCriterion("process_type is null");
            return (Criteria) this;
        }

        public Criteria andProcess_typeIsNotNull() {
            addCriterion("process_type is not null");
            return (Criteria) this;
        }

        public Criteria andProcess_typeEqualTo(Boolean value) {
            addCriterion("process_type =", value, "process_type");
            return (Criteria) this;
        }

        public Criteria andProcess_typeNotEqualTo(Boolean value) {
            addCriterion("process_type <>", value, "process_type");
            return (Criteria) this;
        }

        public Criteria andProcess_typeGreaterThan(Boolean value) {
            addCriterion("process_type >", value, "process_type");
            return (Criteria) this;
        }

        public Criteria andProcess_typeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("process_type >=", value, "process_type");
            return (Criteria) this;
        }

        public Criteria andProcess_typeLessThan(Boolean value) {
            addCriterion("process_type <", value, "process_type");
            return (Criteria) this;
        }

        public Criteria andProcess_typeLessThanOrEqualTo(Boolean value) {
            addCriterion("process_type <=", value, "process_type");
            return (Criteria) this;
        }

        public Criteria andProcess_typeIn(List<Boolean> values) {
            addCriterion("process_type in", values, "process_type");
            return (Criteria) this;
        }

        public Criteria andProcess_typeNotIn(List<Boolean> values) {
            addCriterion("process_type not in", values, "process_type");
            return (Criteria) this;
        }

        public Criteria andProcess_typeBetween(Boolean value1, Boolean value2) {
            addCriterion("process_type between", value1, value2, "process_type");
            return (Criteria) this;
        }

        public Criteria andProcess_typeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("process_type not between", value1, value2, "process_type");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(String value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(String value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(String value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(String value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(String value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLike(String value) {
            addCriterion("payment like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotLike(String value) {
            addCriterion("payment not like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<String> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<String> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(String value1, String value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(String value1, String value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andIs_paidIsNull() {
            addCriterion("is_paid is null");
            return (Criteria) this;
        }

        public Criteria andIs_paidIsNotNull() {
            addCriterion("is_paid is not null");
            return (Criteria) this;
        }

        public Criteria andIs_paidEqualTo(Boolean value) {
            addCriterion("is_paid =", value, "is_paid");
            return (Criteria) this;
        }

        public Criteria andIs_paidNotEqualTo(Boolean value) {
            addCriterion("is_paid <>", value, "is_paid");
            return (Criteria) this;
        }

        public Criteria andIs_paidGreaterThan(Boolean value) {
            addCriterion("is_paid >", value, "is_paid");
            return (Criteria) this;
        }

        public Criteria andIs_paidGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_paid >=", value, "is_paid");
            return (Criteria) this;
        }

        public Criteria andIs_paidLessThan(Boolean value) {
            addCriterion("is_paid <", value, "is_paid");
            return (Criteria) this;
        }

        public Criteria andIs_paidLessThanOrEqualTo(Boolean value) {
            addCriterion("is_paid <=", value, "is_paid");
            return (Criteria) this;
        }

        public Criteria andIs_paidIn(List<Boolean> values) {
            addCriterion("is_paid in", values, "is_paid");
            return (Criteria) this;
        }

        public Criteria andIs_paidNotIn(List<Boolean> values) {
            addCriterion("is_paid not in", values, "is_paid");
            return (Criteria) this;
        }

        public Criteria andIs_paidBetween(Boolean value1, Boolean value2) {
            addCriterion("is_paid between", value1, value2, "is_paid");
            return (Criteria) this;
        }

        public Criteria andIs_paidNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_paid not between", value1, value2, "is_paid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_user_account
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
     * This class corresponds to the database table ecs_user_account
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