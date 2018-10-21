package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StaffExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table staff
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table staff
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table staff
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbg.generated
     */
    public StaffExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
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
     * This method corresponds to the database table staff
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
     * This method corresponds to the database table staff
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff
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
     * This class corresponds to the database table staff
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

        public Criteria andStaff_idIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaff_idIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaff_idEqualTo(Byte value) {
            addCriterion("staff_id =", value, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idNotEqualTo(Byte value) {
            addCriterion("staff_id <>", value, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idGreaterThan(Byte value) {
            addCriterion("staff_id >", value, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idGreaterThanOrEqualTo(Byte value) {
            addCriterion("staff_id >=", value, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idLessThan(Byte value) {
            addCriterion("staff_id <", value, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idLessThanOrEqualTo(Byte value) {
            addCriterion("staff_id <=", value, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idIn(List<Byte> values) {
            addCriterion("staff_id in", values, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idNotIn(List<Byte> values) {
            addCriterion("staff_id not in", values, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idBetween(Byte value1, Byte value2) {
            addCriterion("staff_id between", value1, value2, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idNotBetween(Byte value1, Byte value2) {
            addCriterion("staff_id not between", value1, value2, "staff_id");
            return (Criteria) this;
        }

        public Criteria andFirst_nameIsNull() {
            addCriterion("first_name is null");
            return (Criteria) this;
        }

        public Criteria andFirst_nameIsNotNull() {
            addCriterion("first_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirst_nameEqualTo(String value) {
            addCriterion("first_name =", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameNotEqualTo(String value) {
            addCriterion("first_name <>", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameGreaterThan(String value) {
            addCriterion("first_name >", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameGreaterThanOrEqualTo(String value) {
            addCriterion("first_name >=", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameLessThan(String value) {
            addCriterion("first_name <", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameLessThanOrEqualTo(String value) {
            addCriterion("first_name <=", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameLike(String value) {
            addCriterion("first_name like", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameNotLike(String value) {
            addCriterion("first_name not like", value, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameIn(List<String> values) {
            addCriterion("first_name in", values, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameNotIn(List<String> values) {
            addCriterion("first_name not in", values, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameBetween(String value1, String value2) {
            addCriterion("first_name between", value1, value2, "first_name");
            return (Criteria) this;
        }

        public Criteria andFirst_nameNotBetween(String value1, String value2) {
            addCriterion("first_name not between", value1, value2, "first_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameIsNull() {
            addCriterion("last_name is null");
            return (Criteria) this;
        }

        public Criteria andLast_nameIsNotNull() {
            addCriterion("last_name is not null");
            return (Criteria) this;
        }

        public Criteria andLast_nameEqualTo(String value) {
            addCriterion("last_name =", value, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameNotEqualTo(String value) {
            addCriterion("last_name <>", value, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameGreaterThan(String value) {
            addCriterion("last_name >", value, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameGreaterThanOrEqualTo(String value) {
            addCriterion("last_name >=", value, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameLessThan(String value) {
            addCriterion("last_name <", value, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameLessThanOrEqualTo(String value) {
            addCriterion("last_name <=", value, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameLike(String value) {
            addCriterion("last_name like", value, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameNotLike(String value) {
            addCriterion("last_name not like", value, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameIn(List<String> values) {
            addCriterion("last_name in", values, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameNotIn(List<String> values) {
            addCriterion("last_name not in", values, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameBetween(String value1, String value2) {
            addCriterion("last_name between", value1, value2, "last_name");
            return (Criteria) this;
        }

        public Criteria andLast_nameNotBetween(String value1, String value2) {
            addCriterion("last_name not between", value1, value2, "last_name");
            return (Criteria) this;
        }

        public Criteria andAddress_idIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddress_idIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddress_idEqualTo(Short value) {
            addCriterion("address_id =", value, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idNotEqualTo(Short value) {
            addCriterion("address_id <>", value, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idGreaterThan(Short value) {
            addCriterion("address_id >", value, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idGreaterThanOrEqualTo(Short value) {
            addCriterion("address_id >=", value, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idLessThan(Short value) {
            addCriterion("address_id <", value, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idLessThanOrEqualTo(Short value) {
            addCriterion("address_id <=", value, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idIn(List<Short> values) {
            addCriterion("address_id in", values, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idNotIn(List<Short> values) {
            addCriterion("address_id not in", values, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idBetween(Short value1, Short value2) {
            addCriterion("address_id between", value1, value2, "address_id");
            return (Criteria) this;
        }

        public Criteria andAddress_idNotBetween(Short value1, Short value2) {
            addCriterion("address_id not between", value1, value2, "address_id");
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

        public Criteria andStore_idIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStore_idIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStore_idEqualTo(Byte value) {
            addCriterion("store_id =", value, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idNotEqualTo(Byte value) {
            addCriterion("store_id <>", value, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idGreaterThan(Byte value) {
            addCriterion("store_id >", value, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idGreaterThanOrEqualTo(Byte value) {
            addCriterion("store_id >=", value, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idLessThan(Byte value) {
            addCriterion("store_id <", value, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idLessThanOrEqualTo(Byte value) {
            addCriterion("store_id <=", value, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idIn(List<Byte> values) {
            addCriterion("store_id in", values, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idNotIn(List<Byte> values) {
            addCriterion("store_id not in", values, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idBetween(Byte value1, Byte value2) {
            addCriterion("store_id between", value1, value2, "store_id");
            return (Criteria) this;
        }

        public Criteria andStore_idNotBetween(Byte value1, Byte value2) {
            addCriterion("store_id not between", value1, value2, "store_id");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Boolean value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Boolean value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Boolean value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Boolean value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Boolean value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Boolean> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Boolean> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Boolean value1, Boolean value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("active not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andLast_updateIsNull() {
            addCriterion("last_update is null");
            return (Criteria) this;
        }

        public Criteria andLast_updateIsNotNull() {
            addCriterion("last_update is not null");
            return (Criteria) this;
        }

        public Criteria andLast_updateEqualTo(Date value) {
            addCriterion("last_update =", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateNotEqualTo(Date value) {
            addCriterion("last_update <>", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateGreaterThan(Date value) {
            addCriterion("last_update >", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update >=", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateLessThan(Date value) {
            addCriterion("last_update <", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateLessThanOrEqualTo(Date value) {
            addCriterion("last_update <=", value, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateIn(List<Date> values) {
            addCriterion("last_update in", values, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateNotIn(List<Date> values) {
            addCriterion("last_update not in", values, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateBetween(Date value1, Date value2) {
            addCriterion("last_update between", value1, value2, "last_update");
            return (Criteria) this;
        }

        public Criteria andLast_updateNotBetween(Date value1, Date value2) {
            addCriterion("last_update not between", value1, value2, "last_update");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table staff
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
     * This class corresponds to the database table staff
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