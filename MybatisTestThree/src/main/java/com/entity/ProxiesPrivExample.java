package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProxiesPrivExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table proxies_priv
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table proxies_priv
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table proxies_priv
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table proxies_priv
     *
     * @mbg.generated
     */
    public ProxiesPrivExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table proxies_priv
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table proxies_priv
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table proxies_priv
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table proxies_priv
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table proxies_priv
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table proxies_priv
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table proxies_priv
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
     * This method corresponds to the database table proxies_priv
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
     * This method corresponds to the database table proxies_priv
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table proxies_priv
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
     * This class corresponds to the database table proxies_priv
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

        public Criteria andHostIsNull() {
            addCriterion("Host is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("Host is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("Host =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("Host <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("Host >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("Host >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("Host <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("Host <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("Host like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("Host not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("Host in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("Host not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("Host between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("Host not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andUserIsNull() {
            addCriterion("User is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("User is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("User =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("User <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("User >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("User >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("User <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("User <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("User like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("User not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("User in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("User not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("User between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("User not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andProxied_hostIsNull() {
            addCriterion("Proxied_host is null");
            return (Criteria) this;
        }

        public Criteria andProxied_hostIsNotNull() {
            addCriterion("Proxied_host is not null");
            return (Criteria) this;
        }

        public Criteria andProxied_hostEqualTo(String value) {
            addCriterion("Proxied_host =", value, "proxied_host");
            return (Criteria) this;
        }

        public Criteria andProxied_hostNotEqualTo(String value) {
            addCriterion("Proxied_host <>", value, "proxied_host");
            return (Criteria) this;
        }

        public Criteria andProxied_hostGreaterThan(String value) {
            addCriterion("Proxied_host >", value, "proxied_host");
            return (Criteria) this;
        }

        public Criteria andProxied_hostGreaterThanOrEqualTo(String value) {
            addCriterion("Proxied_host >=", value, "proxied_host");
            return (Criteria) this;
        }

        public Criteria andProxied_hostLessThan(String value) {
            addCriterion("Proxied_host <", value, "proxied_host");
            return (Criteria) this;
        }

        public Criteria andProxied_hostLessThanOrEqualTo(String value) {
            addCriterion("Proxied_host <=", value, "proxied_host");
            return (Criteria) this;
        }

        public Criteria andProxied_hostLike(String value) {
            addCriterion("Proxied_host like", value, "proxied_host");
            return (Criteria) this;
        }

        public Criteria andProxied_hostNotLike(String value) {
            addCriterion("Proxied_host not like", value, "proxied_host");
            return (Criteria) this;
        }

        public Criteria andProxied_hostIn(List<String> values) {
            addCriterion("Proxied_host in", values, "proxied_host");
            return (Criteria) this;
        }

        public Criteria andProxied_hostNotIn(List<String> values) {
            addCriterion("Proxied_host not in", values, "proxied_host");
            return (Criteria) this;
        }

        public Criteria andProxied_hostBetween(String value1, String value2) {
            addCriterion("Proxied_host between", value1, value2, "proxied_host");
            return (Criteria) this;
        }

        public Criteria andProxied_hostNotBetween(String value1, String value2) {
            addCriterion("Proxied_host not between", value1, value2, "proxied_host");
            return (Criteria) this;
        }

        public Criteria andProxied_userIsNull() {
            addCriterion("Proxied_user is null");
            return (Criteria) this;
        }

        public Criteria andProxied_userIsNotNull() {
            addCriterion("Proxied_user is not null");
            return (Criteria) this;
        }

        public Criteria andProxied_userEqualTo(String value) {
            addCriterion("Proxied_user =", value, "proxied_user");
            return (Criteria) this;
        }

        public Criteria andProxied_userNotEqualTo(String value) {
            addCriterion("Proxied_user <>", value, "proxied_user");
            return (Criteria) this;
        }

        public Criteria andProxied_userGreaterThan(String value) {
            addCriterion("Proxied_user >", value, "proxied_user");
            return (Criteria) this;
        }

        public Criteria andProxied_userGreaterThanOrEqualTo(String value) {
            addCriterion("Proxied_user >=", value, "proxied_user");
            return (Criteria) this;
        }

        public Criteria andProxied_userLessThan(String value) {
            addCriterion("Proxied_user <", value, "proxied_user");
            return (Criteria) this;
        }

        public Criteria andProxied_userLessThanOrEqualTo(String value) {
            addCriterion("Proxied_user <=", value, "proxied_user");
            return (Criteria) this;
        }

        public Criteria andProxied_userLike(String value) {
            addCriterion("Proxied_user like", value, "proxied_user");
            return (Criteria) this;
        }

        public Criteria andProxied_userNotLike(String value) {
            addCriterion("Proxied_user not like", value, "proxied_user");
            return (Criteria) this;
        }

        public Criteria andProxied_userIn(List<String> values) {
            addCriterion("Proxied_user in", values, "proxied_user");
            return (Criteria) this;
        }

        public Criteria andProxied_userNotIn(List<String> values) {
            addCriterion("Proxied_user not in", values, "proxied_user");
            return (Criteria) this;
        }

        public Criteria andProxied_userBetween(String value1, String value2) {
            addCriterion("Proxied_user between", value1, value2, "proxied_user");
            return (Criteria) this;
        }

        public Criteria andProxied_userNotBetween(String value1, String value2) {
            addCriterion("Proxied_user not between", value1, value2, "proxied_user");
            return (Criteria) this;
        }

        public Criteria andWith_grantIsNull() {
            addCriterion("With_grant is null");
            return (Criteria) this;
        }

        public Criteria andWith_grantIsNotNull() {
            addCriterion("With_grant is not null");
            return (Criteria) this;
        }

        public Criteria andWith_grantEqualTo(Boolean value) {
            addCriterion("With_grant =", value, "with_grant");
            return (Criteria) this;
        }

        public Criteria andWith_grantNotEqualTo(Boolean value) {
            addCriterion("With_grant <>", value, "with_grant");
            return (Criteria) this;
        }

        public Criteria andWith_grantGreaterThan(Boolean value) {
            addCriterion("With_grant >", value, "with_grant");
            return (Criteria) this;
        }

        public Criteria andWith_grantGreaterThanOrEqualTo(Boolean value) {
            addCriterion("With_grant >=", value, "with_grant");
            return (Criteria) this;
        }

        public Criteria andWith_grantLessThan(Boolean value) {
            addCriterion("With_grant <", value, "with_grant");
            return (Criteria) this;
        }

        public Criteria andWith_grantLessThanOrEqualTo(Boolean value) {
            addCriterion("With_grant <=", value, "with_grant");
            return (Criteria) this;
        }

        public Criteria andWith_grantIn(List<Boolean> values) {
            addCriterion("With_grant in", values, "with_grant");
            return (Criteria) this;
        }

        public Criteria andWith_grantNotIn(List<Boolean> values) {
            addCriterion("With_grant not in", values, "with_grant");
            return (Criteria) this;
        }

        public Criteria andWith_grantBetween(Boolean value1, Boolean value2) {
            addCriterion("With_grant between", value1, value2, "with_grant");
            return (Criteria) this;
        }

        public Criteria andWith_grantNotBetween(Boolean value1, Boolean value2) {
            addCriterion("With_grant not between", value1, value2, "with_grant");
            return (Criteria) this;
        }

        public Criteria andGrantorIsNull() {
            addCriterion("Grantor is null");
            return (Criteria) this;
        }

        public Criteria andGrantorIsNotNull() {
            addCriterion("Grantor is not null");
            return (Criteria) this;
        }

        public Criteria andGrantorEqualTo(String value) {
            addCriterion("Grantor =", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorNotEqualTo(String value) {
            addCriterion("Grantor <>", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorGreaterThan(String value) {
            addCriterion("Grantor >", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorGreaterThanOrEqualTo(String value) {
            addCriterion("Grantor >=", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorLessThan(String value) {
            addCriterion("Grantor <", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorLessThanOrEqualTo(String value) {
            addCriterion("Grantor <=", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorLike(String value) {
            addCriterion("Grantor like", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorNotLike(String value) {
            addCriterion("Grantor not like", value, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorIn(List<String> values) {
            addCriterion("Grantor in", values, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorNotIn(List<String> values) {
            addCriterion("Grantor not in", values, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorBetween(String value1, String value2) {
            addCriterion("Grantor between", value1, value2, "grantor");
            return (Criteria) this;
        }

        public Criteria andGrantorNotBetween(String value1, String value2) {
            addCriterion("Grantor not between", value1, value2, "grantor");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("Timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("Timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(Date value) {
            addCriterion("Timestamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(Date value) {
            addCriterion("Timestamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(Date value) {
            addCriterion("Timestamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("Timestamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(Date value) {
            addCriterion("Timestamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(Date value) {
            addCriterion("Timestamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<Date> values) {
            addCriterion("Timestamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<Date> values) {
            addCriterion("Timestamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(Date value1, Date value2) {
            addCriterion("Timestamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(Date value1, Date value2) {
            addCriterion("Timestamp not between", value1, value2, "timestamp");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table proxies_priv
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
     * This class corresponds to the database table proxies_priv
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