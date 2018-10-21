package com.entity;

import java.util.ArrayList;
import java.util.List;

public class InnodbForeignExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INNODB_FOREIGN
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INNODB_FOREIGN
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INNODB_FOREIGN
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FOREIGN
     *
     * @mbg.generated
     */
    public InnodbForeignExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FOREIGN
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FOREIGN
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FOREIGN
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FOREIGN
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FOREIGN
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FOREIGN
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FOREIGN
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
     * This method corresponds to the database table INNODB_FOREIGN
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
     * This method corresponds to the database table INNODB_FOREIGN
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FOREIGN
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
     * This class corresponds to the database table INNODB_FOREIGN
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

        public Criteria andIDIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(String value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(String value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(String value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(String value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLike(String value) {
            addCriterion("ID like", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotLike(String value) {
            addCriterion("ID not like", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<String> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<String> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andFOR_NAMEIsNull() {
            addCriterion("FOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFOR_NAMEIsNotNull() {
            addCriterion("FOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFOR_NAMEEqualTo(String value) {
            addCriterion("FOR_NAME =", value, "FOR_NAME");
            return (Criteria) this;
        }

        public Criteria andFOR_NAMENotEqualTo(String value) {
            addCriterion("FOR_NAME <>", value, "FOR_NAME");
            return (Criteria) this;
        }

        public Criteria andFOR_NAMEGreaterThan(String value) {
            addCriterion("FOR_NAME >", value, "FOR_NAME");
            return (Criteria) this;
        }

        public Criteria andFOR_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("FOR_NAME >=", value, "FOR_NAME");
            return (Criteria) this;
        }

        public Criteria andFOR_NAMELessThan(String value) {
            addCriterion("FOR_NAME <", value, "FOR_NAME");
            return (Criteria) this;
        }

        public Criteria andFOR_NAMELessThanOrEqualTo(String value) {
            addCriterion("FOR_NAME <=", value, "FOR_NAME");
            return (Criteria) this;
        }

        public Criteria andFOR_NAMELike(String value) {
            addCriterion("FOR_NAME like", value, "FOR_NAME");
            return (Criteria) this;
        }

        public Criteria andFOR_NAMENotLike(String value) {
            addCriterion("FOR_NAME not like", value, "FOR_NAME");
            return (Criteria) this;
        }

        public Criteria andFOR_NAMEIn(List<String> values) {
            addCriterion("FOR_NAME in", values, "FOR_NAME");
            return (Criteria) this;
        }

        public Criteria andFOR_NAMENotIn(List<String> values) {
            addCriterion("FOR_NAME not in", values, "FOR_NAME");
            return (Criteria) this;
        }

        public Criteria andFOR_NAMEBetween(String value1, String value2) {
            addCriterion("FOR_NAME between", value1, value2, "FOR_NAME");
            return (Criteria) this;
        }

        public Criteria andFOR_NAMENotBetween(String value1, String value2) {
            addCriterion("FOR_NAME not between", value1, value2, "FOR_NAME");
            return (Criteria) this;
        }

        public Criteria andREF_NAMEIsNull() {
            addCriterion("REF_NAME is null");
            return (Criteria) this;
        }

        public Criteria andREF_NAMEIsNotNull() {
            addCriterion("REF_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andREF_NAMEEqualTo(String value) {
            addCriterion("REF_NAME =", value, "REF_NAME");
            return (Criteria) this;
        }

        public Criteria andREF_NAMENotEqualTo(String value) {
            addCriterion("REF_NAME <>", value, "REF_NAME");
            return (Criteria) this;
        }

        public Criteria andREF_NAMEGreaterThan(String value) {
            addCriterion("REF_NAME >", value, "REF_NAME");
            return (Criteria) this;
        }

        public Criteria andREF_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("REF_NAME >=", value, "REF_NAME");
            return (Criteria) this;
        }

        public Criteria andREF_NAMELessThan(String value) {
            addCriterion("REF_NAME <", value, "REF_NAME");
            return (Criteria) this;
        }

        public Criteria andREF_NAMELessThanOrEqualTo(String value) {
            addCriterion("REF_NAME <=", value, "REF_NAME");
            return (Criteria) this;
        }

        public Criteria andREF_NAMELike(String value) {
            addCriterion("REF_NAME like", value, "REF_NAME");
            return (Criteria) this;
        }

        public Criteria andREF_NAMENotLike(String value) {
            addCriterion("REF_NAME not like", value, "REF_NAME");
            return (Criteria) this;
        }

        public Criteria andREF_NAMEIn(List<String> values) {
            addCriterion("REF_NAME in", values, "REF_NAME");
            return (Criteria) this;
        }

        public Criteria andREF_NAMENotIn(List<String> values) {
            addCriterion("REF_NAME not in", values, "REF_NAME");
            return (Criteria) this;
        }

        public Criteria andREF_NAMEBetween(String value1, String value2) {
            addCriterion("REF_NAME between", value1, value2, "REF_NAME");
            return (Criteria) this;
        }

        public Criteria andREF_NAMENotBetween(String value1, String value2) {
            addCriterion("REF_NAME not between", value1, value2, "REF_NAME");
            return (Criteria) this;
        }

        public Criteria andN_COLSIsNull() {
            addCriterion("N_COLS is null");
            return (Criteria) this;
        }

        public Criteria andN_COLSIsNotNull() {
            addCriterion("N_COLS is not null");
            return (Criteria) this;
        }

        public Criteria andN_COLSEqualTo(Long value) {
            addCriterion("N_COLS =", value, "n_COLS");
            return (Criteria) this;
        }

        public Criteria andN_COLSNotEqualTo(Long value) {
            addCriterion("N_COLS <>", value, "n_COLS");
            return (Criteria) this;
        }

        public Criteria andN_COLSGreaterThan(Long value) {
            addCriterion("N_COLS >", value, "n_COLS");
            return (Criteria) this;
        }

        public Criteria andN_COLSGreaterThanOrEqualTo(Long value) {
            addCriterion("N_COLS >=", value, "n_COLS");
            return (Criteria) this;
        }

        public Criteria andN_COLSLessThan(Long value) {
            addCriterion("N_COLS <", value, "n_COLS");
            return (Criteria) this;
        }

        public Criteria andN_COLSLessThanOrEqualTo(Long value) {
            addCriterion("N_COLS <=", value, "n_COLS");
            return (Criteria) this;
        }

        public Criteria andN_COLSIn(List<Long> values) {
            addCriterion("N_COLS in", values, "n_COLS");
            return (Criteria) this;
        }

        public Criteria andN_COLSNotIn(List<Long> values) {
            addCriterion("N_COLS not in", values, "n_COLS");
            return (Criteria) this;
        }

        public Criteria andN_COLSBetween(Long value1, Long value2) {
            addCriterion("N_COLS between", value1, value2, "n_COLS");
            return (Criteria) this;
        }

        public Criteria andN_COLSNotBetween(Long value1, Long value2) {
            addCriterion("N_COLS not between", value1, value2, "n_COLS");
            return (Criteria) this;
        }

        public Criteria andTYPEIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTYPEIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTYPEEqualTo(Integer value) {
            addCriterion("TYPE =", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPENotEqualTo(Integer value) {
            addCriterion("TYPE <>", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPEGreaterThan(Integer value) {
            addCriterion("TYPE >", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPEGreaterThanOrEqualTo(Integer value) {
            addCriterion("TYPE >=", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPELessThan(Integer value) {
            addCriterion("TYPE <", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPELessThanOrEqualTo(Integer value) {
            addCriterion("TYPE <=", value, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPEIn(List<Integer> values) {
            addCriterion("TYPE in", values, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPENotIn(List<Integer> values) {
            addCriterion("TYPE not in", values, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPEBetween(Integer value1, Integer value2) {
            addCriterion("TYPE between", value1, value2, "TYPE");
            return (Criteria) this;
        }

        public Criteria andTYPENotBetween(Integer value1, Integer value2) {
            addCriterion("TYPE not between", value1, value2, "TYPE");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table INNODB_FOREIGN
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
     * This class corresponds to the database table INNODB_FOREIGN
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