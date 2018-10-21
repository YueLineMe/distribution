package com.entity;

import java.util.ArrayList;
import java.util.List;

public class ReplicationGroupMembersExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table replication_group_members
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table replication_group_members
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table replication_group_members
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_group_members
     *
     * @mbg.generated
     */
    public ReplicationGroupMembersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_group_members
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_group_members
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_group_members
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_group_members
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_group_members
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_group_members
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_group_members
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
     * This method corresponds to the database table replication_group_members
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
     * This method corresponds to the database table replication_group_members
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_group_members
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
     * This class corresponds to the database table replication_group_members
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

        public Criteria andCHANNEL_NAMEIsNull() {
            addCriterion("CHANNEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMEIsNotNull() {
            addCriterion("CHANNEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMEEqualTo(String value) {
            addCriterion("CHANNEL_NAME =", value, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMENotEqualTo(String value) {
            addCriterion("CHANNEL_NAME <>", value, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMEGreaterThan(String value) {
            addCriterion("CHANNEL_NAME >", value, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_NAME >=", value, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMELessThan(String value) {
            addCriterion("CHANNEL_NAME <", value, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMELessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_NAME <=", value, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMELike(String value) {
            addCriterion("CHANNEL_NAME like", value, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMENotLike(String value) {
            addCriterion("CHANNEL_NAME not like", value, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMEIn(List<String> values) {
            addCriterion("CHANNEL_NAME in", values, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMENotIn(List<String> values) {
            addCriterion("CHANNEL_NAME not in", values, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMEBetween(String value1, String value2) {
            addCriterion("CHANNEL_NAME between", value1, value2, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMENotBetween(String value1, String value2) {
            addCriterion("CHANNEL_NAME not between", value1, value2, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDIsNull() {
            addCriterion("MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDIsNotNull() {
            addCriterion("MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDEqualTo(String value) {
            addCriterion("MEMBER_ID =", value, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDNotEqualTo(String value) {
            addCriterion("MEMBER_ID <>", value, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDGreaterThan(String value) {
            addCriterion("MEMBER_ID >", value, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID >=", value, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDLessThan(String value) {
            addCriterion("MEMBER_ID <", value, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID <=", value, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDLike(String value) {
            addCriterion("MEMBER_ID like", value, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDNotLike(String value) {
            addCriterion("MEMBER_ID not like", value, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDIn(List<String> values) {
            addCriterion("MEMBER_ID in", values, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDNotIn(List<String> values) {
            addCriterion("MEMBER_ID not in", values, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDBetween(String value1, String value2) {
            addCriterion("MEMBER_ID between", value1, value2, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDNotBetween(String value1, String value2) {
            addCriterion("MEMBER_ID not between", value1, value2, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_HOSTIsNull() {
            addCriterion("MEMBER_HOST is null");
            return (Criteria) this;
        }

        public Criteria andMEMBER_HOSTIsNotNull() {
            addCriterion("MEMBER_HOST is not null");
            return (Criteria) this;
        }

        public Criteria andMEMBER_HOSTEqualTo(String value) {
            addCriterion("MEMBER_HOST =", value, "MEMBER_HOST");
            return (Criteria) this;
        }

        public Criteria andMEMBER_HOSTNotEqualTo(String value) {
            addCriterion("MEMBER_HOST <>", value, "MEMBER_HOST");
            return (Criteria) this;
        }

        public Criteria andMEMBER_HOSTGreaterThan(String value) {
            addCriterion("MEMBER_HOST >", value, "MEMBER_HOST");
            return (Criteria) this;
        }

        public Criteria andMEMBER_HOSTGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_HOST >=", value, "MEMBER_HOST");
            return (Criteria) this;
        }

        public Criteria andMEMBER_HOSTLessThan(String value) {
            addCriterion("MEMBER_HOST <", value, "MEMBER_HOST");
            return (Criteria) this;
        }

        public Criteria andMEMBER_HOSTLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_HOST <=", value, "MEMBER_HOST");
            return (Criteria) this;
        }

        public Criteria andMEMBER_HOSTLike(String value) {
            addCriterion("MEMBER_HOST like", value, "MEMBER_HOST");
            return (Criteria) this;
        }

        public Criteria andMEMBER_HOSTNotLike(String value) {
            addCriterion("MEMBER_HOST not like", value, "MEMBER_HOST");
            return (Criteria) this;
        }

        public Criteria andMEMBER_HOSTIn(List<String> values) {
            addCriterion("MEMBER_HOST in", values, "MEMBER_HOST");
            return (Criteria) this;
        }

        public Criteria andMEMBER_HOSTNotIn(List<String> values) {
            addCriterion("MEMBER_HOST not in", values, "MEMBER_HOST");
            return (Criteria) this;
        }

        public Criteria andMEMBER_HOSTBetween(String value1, String value2) {
            addCriterion("MEMBER_HOST between", value1, value2, "MEMBER_HOST");
            return (Criteria) this;
        }

        public Criteria andMEMBER_HOSTNotBetween(String value1, String value2) {
            addCriterion("MEMBER_HOST not between", value1, value2, "MEMBER_HOST");
            return (Criteria) this;
        }

        public Criteria andMEMBER_PORTIsNull() {
            addCriterion("MEMBER_PORT is null");
            return (Criteria) this;
        }

        public Criteria andMEMBER_PORTIsNotNull() {
            addCriterion("MEMBER_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andMEMBER_PORTEqualTo(Integer value) {
            addCriterion("MEMBER_PORT =", value, "MEMBER_PORT");
            return (Criteria) this;
        }

        public Criteria andMEMBER_PORTNotEqualTo(Integer value) {
            addCriterion("MEMBER_PORT <>", value, "MEMBER_PORT");
            return (Criteria) this;
        }

        public Criteria andMEMBER_PORTGreaterThan(Integer value) {
            addCriterion("MEMBER_PORT >", value, "MEMBER_PORT");
            return (Criteria) this;
        }

        public Criteria andMEMBER_PORTGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMBER_PORT >=", value, "MEMBER_PORT");
            return (Criteria) this;
        }

        public Criteria andMEMBER_PORTLessThan(Integer value) {
            addCriterion("MEMBER_PORT <", value, "MEMBER_PORT");
            return (Criteria) this;
        }

        public Criteria andMEMBER_PORTLessThanOrEqualTo(Integer value) {
            addCriterion("MEMBER_PORT <=", value, "MEMBER_PORT");
            return (Criteria) this;
        }

        public Criteria andMEMBER_PORTIn(List<Integer> values) {
            addCriterion("MEMBER_PORT in", values, "MEMBER_PORT");
            return (Criteria) this;
        }

        public Criteria andMEMBER_PORTNotIn(List<Integer> values) {
            addCriterion("MEMBER_PORT not in", values, "MEMBER_PORT");
            return (Criteria) this;
        }

        public Criteria andMEMBER_PORTBetween(Integer value1, Integer value2) {
            addCriterion("MEMBER_PORT between", value1, value2, "MEMBER_PORT");
            return (Criteria) this;
        }

        public Criteria andMEMBER_PORTNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMBER_PORT not between", value1, value2, "MEMBER_PORT");
            return (Criteria) this;
        }

        public Criteria andMEMBER_STATEIsNull() {
            addCriterion("MEMBER_STATE is null");
            return (Criteria) this;
        }

        public Criteria andMEMBER_STATEIsNotNull() {
            addCriterion("MEMBER_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andMEMBER_STATEEqualTo(String value) {
            addCriterion("MEMBER_STATE =", value, "MEMBER_STATE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_STATENotEqualTo(String value) {
            addCriterion("MEMBER_STATE <>", value, "MEMBER_STATE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_STATEGreaterThan(String value) {
            addCriterion("MEMBER_STATE >", value, "MEMBER_STATE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_STATEGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_STATE >=", value, "MEMBER_STATE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_STATELessThan(String value) {
            addCriterion("MEMBER_STATE <", value, "MEMBER_STATE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_STATELessThanOrEqualTo(String value) {
            addCriterion("MEMBER_STATE <=", value, "MEMBER_STATE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_STATELike(String value) {
            addCriterion("MEMBER_STATE like", value, "MEMBER_STATE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_STATENotLike(String value) {
            addCriterion("MEMBER_STATE not like", value, "MEMBER_STATE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_STATEIn(List<String> values) {
            addCriterion("MEMBER_STATE in", values, "MEMBER_STATE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_STATENotIn(List<String> values) {
            addCriterion("MEMBER_STATE not in", values, "MEMBER_STATE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_STATEBetween(String value1, String value2) {
            addCriterion("MEMBER_STATE between", value1, value2, "MEMBER_STATE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_STATENotBetween(String value1, String value2) {
            addCriterion("MEMBER_STATE not between", value1, value2, "MEMBER_STATE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_ROLEIsNull() {
            addCriterion("MEMBER_ROLE is null");
            return (Criteria) this;
        }

        public Criteria andMEMBER_ROLEIsNotNull() {
            addCriterion("MEMBER_ROLE is not null");
            return (Criteria) this;
        }

        public Criteria andMEMBER_ROLEEqualTo(String value) {
            addCriterion("MEMBER_ROLE =", value, "MEMBER_ROLE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_ROLENotEqualTo(String value) {
            addCriterion("MEMBER_ROLE <>", value, "MEMBER_ROLE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_ROLEGreaterThan(String value) {
            addCriterion("MEMBER_ROLE >", value, "MEMBER_ROLE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_ROLEGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_ROLE >=", value, "MEMBER_ROLE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_ROLELessThan(String value) {
            addCriterion("MEMBER_ROLE <", value, "MEMBER_ROLE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_ROLELessThanOrEqualTo(String value) {
            addCriterion("MEMBER_ROLE <=", value, "MEMBER_ROLE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_ROLELike(String value) {
            addCriterion("MEMBER_ROLE like", value, "MEMBER_ROLE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_ROLENotLike(String value) {
            addCriterion("MEMBER_ROLE not like", value, "MEMBER_ROLE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_ROLEIn(List<String> values) {
            addCriterion("MEMBER_ROLE in", values, "MEMBER_ROLE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_ROLENotIn(List<String> values) {
            addCriterion("MEMBER_ROLE not in", values, "MEMBER_ROLE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_ROLEBetween(String value1, String value2) {
            addCriterion("MEMBER_ROLE between", value1, value2, "MEMBER_ROLE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_ROLENotBetween(String value1, String value2) {
            addCriterion("MEMBER_ROLE not between", value1, value2, "MEMBER_ROLE");
            return (Criteria) this;
        }

        public Criteria andMEMBER_VERSIONIsNull() {
            addCriterion("MEMBER_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andMEMBER_VERSIONIsNotNull() {
            addCriterion("MEMBER_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andMEMBER_VERSIONEqualTo(String value) {
            addCriterion("MEMBER_VERSION =", value, "MEMBER_VERSION");
            return (Criteria) this;
        }

        public Criteria andMEMBER_VERSIONNotEqualTo(String value) {
            addCriterion("MEMBER_VERSION <>", value, "MEMBER_VERSION");
            return (Criteria) this;
        }

        public Criteria andMEMBER_VERSIONGreaterThan(String value) {
            addCriterion("MEMBER_VERSION >", value, "MEMBER_VERSION");
            return (Criteria) this;
        }

        public Criteria andMEMBER_VERSIONGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_VERSION >=", value, "MEMBER_VERSION");
            return (Criteria) this;
        }

        public Criteria andMEMBER_VERSIONLessThan(String value) {
            addCriterion("MEMBER_VERSION <", value, "MEMBER_VERSION");
            return (Criteria) this;
        }

        public Criteria andMEMBER_VERSIONLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_VERSION <=", value, "MEMBER_VERSION");
            return (Criteria) this;
        }

        public Criteria andMEMBER_VERSIONLike(String value) {
            addCriterion("MEMBER_VERSION like", value, "MEMBER_VERSION");
            return (Criteria) this;
        }

        public Criteria andMEMBER_VERSIONNotLike(String value) {
            addCriterion("MEMBER_VERSION not like", value, "MEMBER_VERSION");
            return (Criteria) this;
        }

        public Criteria andMEMBER_VERSIONIn(List<String> values) {
            addCriterion("MEMBER_VERSION in", values, "MEMBER_VERSION");
            return (Criteria) this;
        }

        public Criteria andMEMBER_VERSIONNotIn(List<String> values) {
            addCriterion("MEMBER_VERSION not in", values, "MEMBER_VERSION");
            return (Criteria) this;
        }

        public Criteria andMEMBER_VERSIONBetween(String value1, String value2) {
            addCriterion("MEMBER_VERSION between", value1, value2, "MEMBER_VERSION");
            return (Criteria) this;
        }

        public Criteria andMEMBER_VERSIONNotBetween(String value1, String value2) {
            addCriterion("MEMBER_VERSION not between", value1, value2, "MEMBER_VERSION");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table replication_group_members
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
     * This class corresponds to the database table replication_group_members
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