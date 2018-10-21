package com.entity;

import java.util.ArrayList;
import java.util.List;

public class CountrylanguageExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table countrylanguage
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table countrylanguage
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table countrylanguage
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbg.generated
     */
    public CountrylanguageExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
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
     * This method corresponds to the database table countrylanguage
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
     * This method corresponds to the database table countrylanguage
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table countrylanguage
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
     * This class corresponds to the database table countrylanguage
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

        public Criteria andCountryCodeIsNull() {
            addCriterion("CountryCode is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("CountryCode is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("CountryCode =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("CountryCode <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("CountryCode >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CountryCode >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("CountryCode <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("CountryCode <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("CountryCode like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("CountryCode not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("CountryCode in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("CountryCode not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("CountryCode between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("CountryCode not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("Language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("Language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("Language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("Language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("Language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("Language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("Language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("Language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("Language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("Language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("Language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("Language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("Language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("Language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andIsOfficialIsNull() {
            addCriterion("IsOfficial is null");
            return (Criteria) this;
        }

        public Criteria andIsOfficialIsNotNull() {
            addCriterion("IsOfficial is not null");
            return (Criteria) this;
        }

        public Criteria andIsOfficialEqualTo(String value) {
            addCriterion("IsOfficial =", value, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andIsOfficialNotEqualTo(String value) {
            addCriterion("IsOfficial <>", value, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andIsOfficialGreaterThan(String value) {
            addCriterion("IsOfficial >", value, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andIsOfficialGreaterThanOrEqualTo(String value) {
            addCriterion("IsOfficial >=", value, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andIsOfficialLessThan(String value) {
            addCriterion("IsOfficial <", value, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andIsOfficialLessThanOrEqualTo(String value) {
            addCriterion("IsOfficial <=", value, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andIsOfficialLike(String value) {
            addCriterion("IsOfficial like", value, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andIsOfficialNotLike(String value) {
            addCriterion("IsOfficial not like", value, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andIsOfficialIn(List<String> values) {
            addCriterion("IsOfficial in", values, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andIsOfficialNotIn(List<String> values) {
            addCriterion("IsOfficial not in", values, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andIsOfficialBetween(String value1, String value2) {
            addCriterion("IsOfficial between", value1, value2, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andIsOfficialNotBetween(String value1, String value2) {
            addCriterion("IsOfficial not between", value1, value2, "isOfficial");
            return (Criteria) this;
        }

        public Criteria andPercentageIsNull() {
            addCriterion("Percentage is null");
            return (Criteria) this;
        }

        public Criteria andPercentageIsNotNull() {
            addCriterion("Percentage is not null");
            return (Criteria) this;
        }

        public Criteria andPercentageEqualTo(Float value) {
            addCriterion("Percentage =", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageNotEqualTo(Float value) {
            addCriterion("Percentage <>", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageGreaterThan(Float value) {
            addCriterion("Percentage >", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageGreaterThanOrEqualTo(Float value) {
            addCriterion("Percentage >=", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageLessThan(Float value) {
            addCriterion("Percentage <", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageLessThanOrEqualTo(Float value) {
            addCriterion("Percentage <=", value, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageIn(List<Float> values) {
            addCriterion("Percentage in", values, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageNotIn(List<Float> values) {
            addCriterion("Percentage not in", values, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageBetween(Float value1, Float value2) {
            addCriterion("Percentage between", value1, value2, "percentage");
            return (Criteria) this;
        }

        public Criteria andPercentageNotBetween(Float value1, Float value2) {
            addCriterion("Percentage not between", value1, value2, "percentage");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table countrylanguage
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
     * This class corresponds to the database table countrylanguage
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