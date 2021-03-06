package com.entity;

import java.util.ArrayList;
import java.util.List;

public class SessionConnectAttrsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table session_connect_attrs
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table session_connect_attrs
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table session_connect_attrs
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_connect_attrs
     *
     * @mbg.generated
     */
    public SessionConnectAttrsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_connect_attrs
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_connect_attrs
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_connect_attrs
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_connect_attrs
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_connect_attrs
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_connect_attrs
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_connect_attrs
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
     * This method corresponds to the database table session_connect_attrs
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
     * This method corresponds to the database table session_connect_attrs
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_connect_attrs
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
     * This class corresponds to the database table session_connect_attrs
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

        public Criteria andPROCESSLIST_IDIsNull() {
            addCriterion("PROCESSLIST_ID is null");
            return (Criteria) this;
        }

        public Criteria andPROCESSLIST_IDIsNotNull() {
            addCriterion("PROCESSLIST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPROCESSLIST_IDEqualTo(Long value) {
            addCriterion("PROCESSLIST_ID =", value, "PROCESSLIST_ID");
            return (Criteria) this;
        }

        public Criteria andPROCESSLIST_IDNotEqualTo(Long value) {
            addCriterion("PROCESSLIST_ID <>", value, "PROCESSLIST_ID");
            return (Criteria) this;
        }

        public Criteria andPROCESSLIST_IDGreaterThan(Long value) {
            addCriterion("PROCESSLIST_ID >", value, "PROCESSLIST_ID");
            return (Criteria) this;
        }

        public Criteria andPROCESSLIST_IDGreaterThanOrEqualTo(Long value) {
            addCriterion("PROCESSLIST_ID >=", value, "PROCESSLIST_ID");
            return (Criteria) this;
        }

        public Criteria andPROCESSLIST_IDLessThan(Long value) {
            addCriterion("PROCESSLIST_ID <", value, "PROCESSLIST_ID");
            return (Criteria) this;
        }

        public Criteria andPROCESSLIST_IDLessThanOrEqualTo(Long value) {
            addCriterion("PROCESSLIST_ID <=", value, "PROCESSLIST_ID");
            return (Criteria) this;
        }

        public Criteria andPROCESSLIST_IDIn(List<Long> values) {
            addCriterion("PROCESSLIST_ID in", values, "PROCESSLIST_ID");
            return (Criteria) this;
        }

        public Criteria andPROCESSLIST_IDNotIn(List<Long> values) {
            addCriterion("PROCESSLIST_ID not in", values, "PROCESSLIST_ID");
            return (Criteria) this;
        }

        public Criteria andPROCESSLIST_IDBetween(Long value1, Long value2) {
            addCriterion("PROCESSLIST_ID between", value1, value2, "PROCESSLIST_ID");
            return (Criteria) this;
        }

        public Criteria andPROCESSLIST_IDNotBetween(Long value1, Long value2) {
            addCriterion("PROCESSLIST_ID not between", value1, value2, "PROCESSLIST_ID");
            return (Criteria) this;
        }

        public Criteria andATTR_NAMEIsNull() {
            addCriterion("ATTR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andATTR_NAMEIsNotNull() {
            addCriterion("ATTR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andATTR_NAMEEqualTo(String value) {
            addCriterion("ATTR_NAME =", value, "ATTR_NAME");
            return (Criteria) this;
        }

        public Criteria andATTR_NAMENotEqualTo(String value) {
            addCriterion("ATTR_NAME <>", value, "ATTR_NAME");
            return (Criteria) this;
        }

        public Criteria andATTR_NAMEGreaterThan(String value) {
            addCriterion("ATTR_NAME >", value, "ATTR_NAME");
            return (Criteria) this;
        }

        public Criteria andATTR_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_NAME >=", value, "ATTR_NAME");
            return (Criteria) this;
        }

        public Criteria andATTR_NAMELessThan(String value) {
            addCriterion("ATTR_NAME <", value, "ATTR_NAME");
            return (Criteria) this;
        }

        public Criteria andATTR_NAMELessThanOrEqualTo(String value) {
            addCriterion("ATTR_NAME <=", value, "ATTR_NAME");
            return (Criteria) this;
        }

        public Criteria andATTR_NAMELike(String value) {
            addCriterion("ATTR_NAME like", value, "ATTR_NAME");
            return (Criteria) this;
        }

        public Criteria andATTR_NAMENotLike(String value) {
            addCriterion("ATTR_NAME not like", value, "ATTR_NAME");
            return (Criteria) this;
        }

        public Criteria andATTR_NAMEIn(List<String> values) {
            addCriterion("ATTR_NAME in", values, "ATTR_NAME");
            return (Criteria) this;
        }

        public Criteria andATTR_NAMENotIn(List<String> values) {
            addCriterion("ATTR_NAME not in", values, "ATTR_NAME");
            return (Criteria) this;
        }

        public Criteria andATTR_NAMEBetween(String value1, String value2) {
            addCriterion("ATTR_NAME between", value1, value2, "ATTR_NAME");
            return (Criteria) this;
        }

        public Criteria andATTR_NAMENotBetween(String value1, String value2) {
            addCriterion("ATTR_NAME not between", value1, value2, "ATTR_NAME");
            return (Criteria) this;
        }

        public Criteria andATTR_VALUEIsNull() {
            addCriterion("ATTR_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andATTR_VALUEIsNotNull() {
            addCriterion("ATTR_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andATTR_VALUEEqualTo(String value) {
            addCriterion("ATTR_VALUE =", value, "ATTR_VALUE");
            return (Criteria) this;
        }

        public Criteria andATTR_VALUENotEqualTo(String value) {
            addCriterion("ATTR_VALUE <>", value, "ATTR_VALUE");
            return (Criteria) this;
        }

        public Criteria andATTR_VALUEGreaterThan(String value) {
            addCriterion("ATTR_VALUE >", value, "ATTR_VALUE");
            return (Criteria) this;
        }

        public Criteria andATTR_VALUEGreaterThanOrEqualTo(String value) {
            addCriterion("ATTR_VALUE >=", value, "ATTR_VALUE");
            return (Criteria) this;
        }

        public Criteria andATTR_VALUELessThan(String value) {
            addCriterion("ATTR_VALUE <", value, "ATTR_VALUE");
            return (Criteria) this;
        }

        public Criteria andATTR_VALUELessThanOrEqualTo(String value) {
            addCriterion("ATTR_VALUE <=", value, "ATTR_VALUE");
            return (Criteria) this;
        }

        public Criteria andATTR_VALUELike(String value) {
            addCriterion("ATTR_VALUE like", value, "ATTR_VALUE");
            return (Criteria) this;
        }

        public Criteria andATTR_VALUENotLike(String value) {
            addCriterion("ATTR_VALUE not like", value, "ATTR_VALUE");
            return (Criteria) this;
        }

        public Criteria andATTR_VALUEIn(List<String> values) {
            addCriterion("ATTR_VALUE in", values, "ATTR_VALUE");
            return (Criteria) this;
        }

        public Criteria andATTR_VALUENotIn(List<String> values) {
            addCriterion("ATTR_VALUE not in", values, "ATTR_VALUE");
            return (Criteria) this;
        }

        public Criteria andATTR_VALUEBetween(String value1, String value2) {
            addCriterion("ATTR_VALUE between", value1, value2, "ATTR_VALUE");
            return (Criteria) this;
        }

        public Criteria andATTR_VALUENotBetween(String value1, String value2) {
            addCriterion("ATTR_VALUE not between", value1, value2, "ATTR_VALUE");
            return (Criteria) this;
        }

        public Criteria andORDINAL_POSITIONIsNull() {
            addCriterion("ORDINAL_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andORDINAL_POSITIONIsNotNull() {
            addCriterion("ORDINAL_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andORDINAL_POSITIONEqualTo(Integer value) {
            addCriterion("ORDINAL_POSITION =", value, "ORDINAL_POSITION");
            return (Criteria) this;
        }

        public Criteria andORDINAL_POSITIONNotEqualTo(Integer value) {
            addCriterion("ORDINAL_POSITION <>", value, "ORDINAL_POSITION");
            return (Criteria) this;
        }

        public Criteria andORDINAL_POSITIONGreaterThan(Integer value) {
            addCriterion("ORDINAL_POSITION >", value, "ORDINAL_POSITION");
            return (Criteria) this;
        }

        public Criteria andORDINAL_POSITIONGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDINAL_POSITION >=", value, "ORDINAL_POSITION");
            return (Criteria) this;
        }

        public Criteria andORDINAL_POSITIONLessThan(Integer value) {
            addCriterion("ORDINAL_POSITION <", value, "ORDINAL_POSITION");
            return (Criteria) this;
        }

        public Criteria andORDINAL_POSITIONLessThanOrEqualTo(Integer value) {
            addCriterion("ORDINAL_POSITION <=", value, "ORDINAL_POSITION");
            return (Criteria) this;
        }

        public Criteria andORDINAL_POSITIONIn(List<Integer> values) {
            addCriterion("ORDINAL_POSITION in", values, "ORDINAL_POSITION");
            return (Criteria) this;
        }

        public Criteria andORDINAL_POSITIONNotIn(List<Integer> values) {
            addCriterion("ORDINAL_POSITION not in", values, "ORDINAL_POSITION");
            return (Criteria) this;
        }

        public Criteria andORDINAL_POSITIONBetween(Integer value1, Integer value2) {
            addCriterion("ORDINAL_POSITION between", value1, value2, "ORDINAL_POSITION");
            return (Criteria) this;
        }

        public Criteria andORDINAL_POSITIONNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDINAL_POSITION not between", value1, value2, "ORDINAL_POSITION");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table session_connect_attrs
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
     * This class corresponds to the database table session_connect_attrs
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