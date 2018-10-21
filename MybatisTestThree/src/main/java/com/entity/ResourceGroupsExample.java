package com.entity;

import java.util.ArrayList;
import java.util.List;

public class ResourceGroupsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table RESOURCE_GROUPS
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table RESOURCE_GROUPS
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table RESOURCE_GROUPS
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCE_GROUPS
     *
     * @mbg.generated
     */
    public ResourceGroupsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCE_GROUPS
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCE_GROUPS
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCE_GROUPS
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCE_GROUPS
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCE_GROUPS
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCE_GROUPS
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCE_GROUPS
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
     * This method corresponds to the database table RESOURCE_GROUPS
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
     * This method corresponds to the database table RESOURCE_GROUPS
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCE_GROUPS
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
     * This class corresponds to the database table RESOURCE_GROUPS
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

        public Criteria andRESOURCE_GROUP_NAMEIsNull() {
            addCriterion("RESOURCE_GROUP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_NAMEIsNotNull() {
            addCriterion("RESOURCE_GROUP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_NAMEEqualTo(String value) {
            addCriterion("RESOURCE_GROUP_NAME =", value, "RESOURCE_GROUP_NAME");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_NAMENotEqualTo(String value) {
            addCriterion("RESOURCE_GROUP_NAME <>", value, "RESOURCE_GROUP_NAME");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_NAMEGreaterThan(String value) {
            addCriterion("RESOURCE_GROUP_NAME >", value, "RESOURCE_GROUP_NAME");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_GROUP_NAME >=", value, "RESOURCE_GROUP_NAME");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_NAMELessThan(String value) {
            addCriterion("RESOURCE_GROUP_NAME <", value, "RESOURCE_GROUP_NAME");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_NAMELessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_GROUP_NAME <=", value, "RESOURCE_GROUP_NAME");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_NAMELike(String value) {
            addCriterion("RESOURCE_GROUP_NAME like", value, "RESOURCE_GROUP_NAME");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_NAMENotLike(String value) {
            addCriterion("RESOURCE_GROUP_NAME not like", value, "RESOURCE_GROUP_NAME");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_NAMEIn(List<String> values) {
            addCriterion("RESOURCE_GROUP_NAME in", values, "RESOURCE_GROUP_NAME");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_NAMENotIn(List<String> values) {
            addCriterion("RESOURCE_GROUP_NAME not in", values, "RESOURCE_GROUP_NAME");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_NAMEBetween(String value1, String value2) {
            addCriterion("RESOURCE_GROUP_NAME between", value1, value2, "RESOURCE_GROUP_NAME");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_NAMENotBetween(String value1, String value2) {
            addCriterion("RESOURCE_GROUP_NAME not between", value1, value2, "RESOURCE_GROUP_NAME");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_TYPEIsNull() {
            addCriterion("RESOURCE_GROUP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_TYPEIsNotNull() {
            addCriterion("RESOURCE_GROUP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_TYPEEqualTo(String value) {
            addCriterion("RESOURCE_GROUP_TYPE =", value, "RESOURCE_GROUP_TYPE");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_TYPENotEqualTo(String value) {
            addCriterion("RESOURCE_GROUP_TYPE <>", value, "RESOURCE_GROUP_TYPE");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_TYPEGreaterThan(String value) {
            addCriterion("RESOURCE_GROUP_TYPE >", value, "RESOURCE_GROUP_TYPE");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_GROUP_TYPE >=", value, "RESOURCE_GROUP_TYPE");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_TYPELessThan(String value) {
            addCriterion("RESOURCE_GROUP_TYPE <", value, "RESOURCE_GROUP_TYPE");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_TYPELessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_GROUP_TYPE <=", value, "RESOURCE_GROUP_TYPE");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_TYPELike(String value) {
            addCriterion("RESOURCE_GROUP_TYPE like", value, "RESOURCE_GROUP_TYPE");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_TYPENotLike(String value) {
            addCriterion("RESOURCE_GROUP_TYPE not like", value, "RESOURCE_GROUP_TYPE");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_TYPEIn(List<String> values) {
            addCriterion("RESOURCE_GROUP_TYPE in", values, "RESOURCE_GROUP_TYPE");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_TYPENotIn(List<String> values) {
            addCriterion("RESOURCE_GROUP_TYPE not in", values, "RESOURCE_GROUP_TYPE");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_TYPEBetween(String value1, String value2) {
            addCriterion("RESOURCE_GROUP_TYPE between", value1, value2, "RESOURCE_GROUP_TYPE");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_TYPENotBetween(String value1, String value2) {
            addCriterion("RESOURCE_GROUP_TYPE not between", value1, value2, "RESOURCE_GROUP_TYPE");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_ENABLEDIsNull() {
            addCriterion("RESOURCE_GROUP_ENABLED is null");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_ENABLEDIsNotNull() {
            addCriterion("RESOURCE_GROUP_ENABLED is not null");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_ENABLEDEqualTo(Boolean value) {
            addCriterion("RESOURCE_GROUP_ENABLED =", value, "RESOURCE_GROUP_ENABLED");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_ENABLEDNotEqualTo(Boolean value) {
            addCriterion("RESOURCE_GROUP_ENABLED <>", value, "RESOURCE_GROUP_ENABLED");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_ENABLEDGreaterThan(Boolean value) {
            addCriterion("RESOURCE_GROUP_ENABLED >", value, "RESOURCE_GROUP_ENABLED");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_ENABLEDGreaterThanOrEqualTo(Boolean value) {
            addCriterion("RESOURCE_GROUP_ENABLED >=", value, "RESOURCE_GROUP_ENABLED");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_ENABLEDLessThan(Boolean value) {
            addCriterion("RESOURCE_GROUP_ENABLED <", value, "RESOURCE_GROUP_ENABLED");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_ENABLEDLessThanOrEqualTo(Boolean value) {
            addCriterion("RESOURCE_GROUP_ENABLED <=", value, "RESOURCE_GROUP_ENABLED");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_ENABLEDIn(List<Boolean> values) {
            addCriterion("RESOURCE_GROUP_ENABLED in", values, "RESOURCE_GROUP_ENABLED");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_ENABLEDNotIn(List<Boolean> values) {
            addCriterion("RESOURCE_GROUP_ENABLED not in", values, "RESOURCE_GROUP_ENABLED");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_ENABLEDBetween(Boolean value1, Boolean value2) {
            addCriterion("RESOURCE_GROUP_ENABLED between", value1, value2, "RESOURCE_GROUP_ENABLED");
            return (Criteria) this;
        }

        public Criteria andRESOURCE_GROUP_ENABLEDNotBetween(Boolean value1, Boolean value2) {
            addCriterion("RESOURCE_GROUP_ENABLED not between", value1, value2, "RESOURCE_GROUP_ENABLED");
            return (Criteria) this;
        }

        public Criteria andTHREAD_PRIORITYIsNull() {
            addCriterion("THREAD_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andTHREAD_PRIORITYIsNotNull() {
            addCriterion("THREAD_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andTHREAD_PRIORITYEqualTo(Integer value) {
            addCriterion("THREAD_PRIORITY =", value, "THREAD_PRIORITY");
            return (Criteria) this;
        }

        public Criteria andTHREAD_PRIORITYNotEqualTo(Integer value) {
            addCriterion("THREAD_PRIORITY <>", value, "THREAD_PRIORITY");
            return (Criteria) this;
        }

        public Criteria andTHREAD_PRIORITYGreaterThan(Integer value) {
            addCriterion("THREAD_PRIORITY >", value, "THREAD_PRIORITY");
            return (Criteria) this;
        }

        public Criteria andTHREAD_PRIORITYGreaterThanOrEqualTo(Integer value) {
            addCriterion("THREAD_PRIORITY >=", value, "THREAD_PRIORITY");
            return (Criteria) this;
        }

        public Criteria andTHREAD_PRIORITYLessThan(Integer value) {
            addCriterion("THREAD_PRIORITY <", value, "THREAD_PRIORITY");
            return (Criteria) this;
        }

        public Criteria andTHREAD_PRIORITYLessThanOrEqualTo(Integer value) {
            addCriterion("THREAD_PRIORITY <=", value, "THREAD_PRIORITY");
            return (Criteria) this;
        }

        public Criteria andTHREAD_PRIORITYIn(List<Integer> values) {
            addCriterion("THREAD_PRIORITY in", values, "THREAD_PRIORITY");
            return (Criteria) this;
        }

        public Criteria andTHREAD_PRIORITYNotIn(List<Integer> values) {
            addCriterion("THREAD_PRIORITY not in", values, "THREAD_PRIORITY");
            return (Criteria) this;
        }

        public Criteria andTHREAD_PRIORITYBetween(Integer value1, Integer value2) {
            addCriterion("THREAD_PRIORITY between", value1, value2, "THREAD_PRIORITY");
            return (Criteria) this;
        }

        public Criteria andTHREAD_PRIORITYNotBetween(Integer value1, Integer value2) {
            addCriterion("THREAD_PRIORITY not between", value1, value2, "THREAD_PRIORITY");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table RESOURCE_GROUPS
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
     * This class corresponds to the database table RESOURCE_GROUPS
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