package com.entity;

import java.util.ArrayList;
import java.util.List;

public class ManagerExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table manager
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table manager
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table manager
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated
     */
    public ManagerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
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
     * This method corresponds to the database table manager
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
     * This method corresponds to the database table manager
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table manager
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
     * This class corresponds to the database table manager
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

        public Criteria andMqIDIsNull() {
            addCriterion("mqID is null");
            return (Criteria) this;
        }

        public Criteria andMqIDIsNotNull() {
            addCriterion("mqID is not null");
            return (Criteria) this;
        }

        public Criteria andMqIDEqualTo(String value) {
            addCriterion("mqID =", value, "mqID");
            return (Criteria) this;
        }

        public Criteria andMqIDNotEqualTo(String value) {
            addCriterion("mqID <>", value, "mqID");
            return (Criteria) this;
        }

        public Criteria andMqIDGreaterThan(String value) {
            addCriterion("mqID >", value, "mqID");
            return (Criteria) this;
        }

        public Criteria andMqIDGreaterThanOrEqualTo(String value) {
            addCriterion("mqID >=", value, "mqID");
            return (Criteria) this;
        }

        public Criteria andMqIDLessThan(String value) {
            addCriterion("mqID <", value, "mqID");
            return (Criteria) this;
        }

        public Criteria andMqIDLessThanOrEqualTo(String value) {
            addCriterion("mqID <=", value, "mqID");
            return (Criteria) this;
        }

        public Criteria andMqIDLike(String value) {
            addCriterion("mqID like", value, "mqID");
            return (Criteria) this;
        }

        public Criteria andMqIDNotLike(String value) {
            addCriterion("mqID not like", value, "mqID");
            return (Criteria) this;
        }

        public Criteria andMqIDIn(List<String> values) {
            addCriterion("mqID in", values, "mqID");
            return (Criteria) this;
        }

        public Criteria andMqIDNotIn(List<String> values) {
            addCriterion("mqID not in", values, "mqID");
            return (Criteria) this;
        }

        public Criteria andMqIDBetween(String value1, String value2) {
            addCriterion("mqID between", value1, value2, "mqID");
            return (Criteria) this;
        }

        public Criteria andMqIDNotBetween(String value1, String value2) {
            addCriterion("mqID not between", value1, value2, "mqID");
            return (Criteria) this;
        }

        public Criteria andRoleIDIsNull() {
            addCriterion("roleID is null");
            return (Criteria) this;
        }

        public Criteria andRoleIDIsNotNull() {
            addCriterion("roleID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIDEqualTo(String value) {
            addCriterion("roleID =", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDNotEqualTo(String value) {
            addCriterion("roleID <>", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDGreaterThan(String value) {
            addCriterion("roleID >", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDGreaterThanOrEqualTo(String value) {
            addCriterion("roleID >=", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDLessThan(String value) {
            addCriterion("roleID <", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDLessThanOrEqualTo(String value) {
            addCriterion("roleID <=", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDLike(String value) {
            addCriterion("roleID like", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDNotLike(String value) {
            addCriterion("roleID not like", value, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDIn(List<String> values) {
            addCriterion("roleID in", values, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDNotIn(List<String> values) {
            addCriterion("roleID not in", values, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDBetween(String value1, String value2) {
            addCriterion("roleID between", value1, value2, "roleID");
            return (Criteria) this;
        }

        public Criteria andRoleIDNotBetween(String value1, String value2) {
            addCriterion("roleID not between", value1, value2, "roleID");
            return (Criteria) this;
        }

        public Criteria andManagerNameIsNull() {
            addCriterion("managerName is null");
            return (Criteria) this;
        }

        public Criteria andManagerNameIsNotNull() {
            addCriterion("managerName is not null");
            return (Criteria) this;
        }

        public Criteria andManagerNameEqualTo(String value) {
            addCriterion("managerName =", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotEqualTo(String value) {
            addCriterion("managerName <>", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameGreaterThan(String value) {
            addCriterion("managerName >", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameGreaterThanOrEqualTo(String value) {
            addCriterion("managerName >=", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLessThan(String value) {
            addCriterion("managerName <", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLessThanOrEqualTo(String value) {
            addCriterion("managerName <=", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameLike(String value) {
            addCriterion("managerName like", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotLike(String value) {
            addCriterion("managerName not like", value, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameIn(List<String> values) {
            addCriterion("managerName in", values, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotIn(List<String> values) {
            addCriterion("managerName not in", values, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameBetween(String value1, String value2) {
            addCriterion("managerName between", value1, value2, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerNameNotBetween(String value1, String value2) {
            addCriterion("managerName not between", value1, value2, "managerName");
            return (Criteria) this;
        }

        public Criteria andManagerPsdIsNull() {
            addCriterion("managerPsd is null");
            return (Criteria) this;
        }

        public Criteria andManagerPsdIsNotNull() {
            addCriterion("managerPsd is not null");
            return (Criteria) this;
        }

        public Criteria andManagerPsdEqualTo(String value) {
            addCriterion("managerPsd =", value, "managerPsd");
            return (Criteria) this;
        }

        public Criteria andManagerPsdNotEqualTo(String value) {
            addCriterion("managerPsd <>", value, "managerPsd");
            return (Criteria) this;
        }

        public Criteria andManagerPsdGreaterThan(String value) {
            addCriterion("managerPsd >", value, "managerPsd");
            return (Criteria) this;
        }

        public Criteria andManagerPsdGreaterThanOrEqualTo(String value) {
            addCriterion("managerPsd >=", value, "managerPsd");
            return (Criteria) this;
        }

        public Criteria andManagerPsdLessThan(String value) {
            addCriterion("managerPsd <", value, "managerPsd");
            return (Criteria) this;
        }

        public Criteria andManagerPsdLessThanOrEqualTo(String value) {
            addCriterion("managerPsd <=", value, "managerPsd");
            return (Criteria) this;
        }

        public Criteria andManagerPsdLike(String value) {
            addCriterion("managerPsd like", value, "managerPsd");
            return (Criteria) this;
        }

        public Criteria andManagerPsdNotLike(String value) {
            addCriterion("managerPsd not like", value, "managerPsd");
            return (Criteria) this;
        }

        public Criteria andManagerPsdIn(List<String> values) {
            addCriterion("managerPsd in", values, "managerPsd");
            return (Criteria) this;
        }

        public Criteria andManagerPsdNotIn(List<String> values) {
            addCriterion("managerPsd not in", values, "managerPsd");
            return (Criteria) this;
        }

        public Criteria andManagerPsdBetween(String value1, String value2) {
            addCriterion("managerPsd between", value1, value2, "managerPsd");
            return (Criteria) this;
        }

        public Criteria andManagerPsdNotBetween(String value1, String value2) {
            addCriterion("managerPsd not between", value1, value2, "managerPsd");
            return (Criteria) this;
        }

        public Criteria andManagerSexIsNull() {
            addCriterion("managerSex is null");
            return (Criteria) this;
        }

        public Criteria andManagerSexIsNotNull() {
            addCriterion("managerSex is not null");
            return (Criteria) this;
        }

        public Criteria andManagerSexEqualTo(String value) {
            addCriterion("managerSex =", value, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexNotEqualTo(String value) {
            addCriterion("managerSex <>", value, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexGreaterThan(String value) {
            addCriterion("managerSex >", value, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexGreaterThanOrEqualTo(String value) {
            addCriterion("managerSex >=", value, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexLessThan(String value) {
            addCriterion("managerSex <", value, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexLessThanOrEqualTo(String value) {
            addCriterion("managerSex <=", value, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexLike(String value) {
            addCriterion("managerSex like", value, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexNotLike(String value) {
            addCriterion("managerSex not like", value, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexIn(List<String> values) {
            addCriterion("managerSex in", values, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexNotIn(List<String> values) {
            addCriterion("managerSex not in", values, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexBetween(String value1, String value2) {
            addCriterion("managerSex between", value1, value2, "managerSex");
            return (Criteria) this;
        }

        public Criteria andManagerSexNotBetween(String value1, String value2) {
            addCriterion("managerSex not between", value1, value2, "managerSex");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("Tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("Tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("Tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("Tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("Tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("Tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("Tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("Tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("Tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("Tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("Tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("Tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("Tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("Tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
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
     * This class corresponds to the database table manager
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
     * This class corresponds to the database table manager
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