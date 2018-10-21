package com.entity;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table company
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table company
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table company
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbg.generated
     */
    public CompanyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
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
     * This method corresponds to the database table company
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
     * This method corresponds to the database table company
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company
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
     * This class corresponds to the database table company
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andShor_nameIsNull() {
            addCriterion("shor_name is null");
            return (Criteria) this;
        }

        public Criteria andShor_nameIsNotNull() {
            addCriterion("shor_name is not null");
            return (Criteria) this;
        }

        public Criteria andShor_nameEqualTo(String value) {
            addCriterion("shor_name =", value, "shor_name");
            return (Criteria) this;
        }

        public Criteria andShor_nameNotEqualTo(String value) {
            addCriterion("shor_name <>", value, "shor_name");
            return (Criteria) this;
        }

        public Criteria andShor_nameGreaterThan(String value) {
            addCriterion("shor_name >", value, "shor_name");
            return (Criteria) this;
        }

        public Criteria andShor_nameGreaterThanOrEqualTo(String value) {
            addCriterion("shor_name >=", value, "shor_name");
            return (Criteria) this;
        }

        public Criteria andShor_nameLessThan(String value) {
            addCriterion("shor_name <", value, "shor_name");
            return (Criteria) this;
        }

        public Criteria andShor_nameLessThanOrEqualTo(String value) {
            addCriterion("shor_name <=", value, "shor_name");
            return (Criteria) this;
        }

        public Criteria andShor_nameLike(String value) {
            addCriterion("shor_name like", value, "shor_name");
            return (Criteria) this;
        }

        public Criteria andShor_nameNotLike(String value) {
            addCriterion("shor_name not like", value, "shor_name");
            return (Criteria) this;
        }

        public Criteria andShor_nameIn(List<String> values) {
            addCriterion("shor_name in", values, "shor_name");
            return (Criteria) this;
        }

        public Criteria andShor_nameNotIn(List<String> values) {
            addCriterion("shor_name not in", values, "shor_name");
            return (Criteria) this;
        }

        public Criteria andShor_nameBetween(String value1, String value2) {
            addCriterion("shor_name between", value1, value2, "shor_name");
            return (Criteria) this;
        }

        public Criteria andShor_nameNotBetween(String value1, String value2) {
            addCriterion("shor_name not between", value1, value2, "shor_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameIsNull() {
            addCriterion("full_name is null");
            return (Criteria) this;
        }

        public Criteria andFull_nameIsNotNull() {
            addCriterion("full_name is not null");
            return (Criteria) this;
        }

        public Criteria andFull_nameEqualTo(String value) {
            addCriterion("full_name =", value, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameNotEqualTo(String value) {
            addCriterion("full_name <>", value, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameGreaterThan(String value) {
            addCriterion("full_name >", value, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameGreaterThanOrEqualTo(String value) {
            addCriterion("full_name >=", value, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameLessThan(String value) {
            addCriterion("full_name <", value, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameLessThanOrEqualTo(String value) {
            addCriterion("full_name <=", value, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameLike(String value) {
            addCriterion("full_name like", value, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameNotLike(String value) {
            addCriterion("full_name not like", value, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameIn(List<String> values) {
            addCriterion("full_name in", values, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameNotIn(List<String> values) {
            addCriterion("full_name not in", values, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameBetween(String value1, String value2) {
            addCriterion("full_name between", value1, value2, "full_name");
            return (Criteria) this;
        }

        public Criteria andFull_nameNotBetween(String value1, String value2) {
            addCriterion("full_name not between", value1, value2, "full_name");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andFinancestageIsNull() {
            addCriterion("financestage is null");
            return (Criteria) this;
        }

        public Criteria andFinancestageIsNotNull() {
            addCriterion("financestage is not null");
            return (Criteria) this;
        }

        public Criteria andFinancestageEqualTo(String value) {
            addCriterion("financestage =", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageNotEqualTo(String value) {
            addCriterion("financestage <>", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageGreaterThan(String value) {
            addCriterion("financestage >", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageGreaterThanOrEqualTo(String value) {
            addCriterion("financestage >=", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageLessThan(String value) {
            addCriterion("financestage <", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageLessThanOrEqualTo(String value) {
            addCriterion("financestage <=", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageLike(String value) {
            addCriterion("financestage like", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageNotLike(String value) {
            addCriterion("financestage not like", value, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageIn(List<String> values) {
            addCriterion("financestage in", values, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageNotIn(List<String> values) {
            addCriterion("financestage not in", values, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageBetween(String value1, String value2) {
            addCriterion("financestage between", value1, value2, "financestage");
            return (Criteria) this;
        }

        public Criteria andFinancestageNotBetween(String value1, String value2) {
            addCriterion("financestage not between", value1, value2, "financestage");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table company
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
     * This class corresponds to the database table company
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