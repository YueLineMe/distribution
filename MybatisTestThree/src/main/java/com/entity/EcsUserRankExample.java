package com.entity;

import java.util.ArrayList;
import java.util.List;

public class EcsUserRankExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_user_rank
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_user_rank
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_user_rank
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_rank
     *
     * @mbg.generated
     */
    public EcsUserRankExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_rank
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_rank
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_rank
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_rank
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_rank
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_rank
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_rank
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
     * This method corresponds to the database table ecs_user_rank
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
     * This method corresponds to the database table ecs_user_rank
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_rank
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
     * This class corresponds to the database table ecs_user_rank
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

        public Criteria andRank_idIsNull() {
            addCriterion("rank_id is null");
            return (Criteria) this;
        }

        public Criteria andRank_idIsNotNull() {
            addCriterion("rank_id is not null");
            return (Criteria) this;
        }

        public Criteria andRank_idEqualTo(Byte value) {
            addCriterion("rank_id =", value, "rank_id");
            return (Criteria) this;
        }

        public Criteria andRank_idNotEqualTo(Byte value) {
            addCriterion("rank_id <>", value, "rank_id");
            return (Criteria) this;
        }

        public Criteria andRank_idGreaterThan(Byte value) {
            addCriterion("rank_id >", value, "rank_id");
            return (Criteria) this;
        }

        public Criteria andRank_idGreaterThanOrEqualTo(Byte value) {
            addCriterion("rank_id >=", value, "rank_id");
            return (Criteria) this;
        }

        public Criteria andRank_idLessThan(Byte value) {
            addCriterion("rank_id <", value, "rank_id");
            return (Criteria) this;
        }

        public Criteria andRank_idLessThanOrEqualTo(Byte value) {
            addCriterion("rank_id <=", value, "rank_id");
            return (Criteria) this;
        }

        public Criteria andRank_idIn(List<Byte> values) {
            addCriterion("rank_id in", values, "rank_id");
            return (Criteria) this;
        }

        public Criteria andRank_idNotIn(List<Byte> values) {
            addCriterion("rank_id not in", values, "rank_id");
            return (Criteria) this;
        }

        public Criteria andRank_idBetween(Byte value1, Byte value2) {
            addCriterion("rank_id between", value1, value2, "rank_id");
            return (Criteria) this;
        }

        public Criteria andRank_idNotBetween(Byte value1, Byte value2) {
            addCriterion("rank_id not between", value1, value2, "rank_id");
            return (Criteria) this;
        }

        public Criteria andRank_nameIsNull() {
            addCriterion("rank_name is null");
            return (Criteria) this;
        }

        public Criteria andRank_nameIsNotNull() {
            addCriterion("rank_name is not null");
            return (Criteria) this;
        }

        public Criteria andRank_nameEqualTo(String value) {
            addCriterion("rank_name =", value, "rank_name");
            return (Criteria) this;
        }

        public Criteria andRank_nameNotEqualTo(String value) {
            addCriterion("rank_name <>", value, "rank_name");
            return (Criteria) this;
        }

        public Criteria andRank_nameGreaterThan(String value) {
            addCriterion("rank_name >", value, "rank_name");
            return (Criteria) this;
        }

        public Criteria andRank_nameGreaterThanOrEqualTo(String value) {
            addCriterion("rank_name >=", value, "rank_name");
            return (Criteria) this;
        }

        public Criteria andRank_nameLessThan(String value) {
            addCriterion("rank_name <", value, "rank_name");
            return (Criteria) this;
        }

        public Criteria andRank_nameLessThanOrEqualTo(String value) {
            addCriterion("rank_name <=", value, "rank_name");
            return (Criteria) this;
        }

        public Criteria andRank_nameLike(String value) {
            addCriterion("rank_name like", value, "rank_name");
            return (Criteria) this;
        }

        public Criteria andRank_nameNotLike(String value) {
            addCriterion("rank_name not like", value, "rank_name");
            return (Criteria) this;
        }

        public Criteria andRank_nameIn(List<String> values) {
            addCriterion("rank_name in", values, "rank_name");
            return (Criteria) this;
        }

        public Criteria andRank_nameNotIn(List<String> values) {
            addCriterion("rank_name not in", values, "rank_name");
            return (Criteria) this;
        }

        public Criteria andRank_nameBetween(String value1, String value2) {
            addCriterion("rank_name between", value1, value2, "rank_name");
            return (Criteria) this;
        }

        public Criteria andRank_nameNotBetween(String value1, String value2) {
            addCriterion("rank_name not between", value1, value2, "rank_name");
            return (Criteria) this;
        }

        public Criteria andMin_pointsIsNull() {
            addCriterion("min_points is null");
            return (Criteria) this;
        }

        public Criteria andMin_pointsIsNotNull() {
            addCriterion("min_points is not null");
            return (Criteria) this;
        }

        public Criteria andMin_pointsEqualTo(Integer value) {
            addCriterion("min_points =", value, "min_points");
            return (Criteria) this;
        }

        public Criteria andMin_pointsNotEqualTo(Integer value) {
            addCriterion("min_points <>", value, "min_points");
            return (Criteria) this;
        }

        public Criteria andMin_pointsGreaterThan(Integer value) {
            addCriterion("min_points >", value, "min_points");
            return (Criteria) this;
        }

        public Criteria andMin_pointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_points >=", value, "min_points");
            return (Criteria) this;
        }

        public Criteria andMin_pointsLessThan(Integer value) {
            addCriterion("min_points <", value, "min_points");
            return (Criteria) this;
        }

        public Criteria andMin_pointsLessThanOrEqualTo(Integer value) {
            addCriterion("min_points <=", value, "min_points");
            return (Criteria) this;
        }

        public Criteria andMin_pointsIn(List<Integer> values) {
            addCriterion("min_points in", values, "min_points");
            return (Criteria) this;
        }

        public Criteria andMin_pointsNotIn(List<Integer> values) {
            addCriterion("min_points not in", values, "min_points");
            return (Criteria) this;
        }

        public Criteria andMin_pointsBetween(Integer value1, Integer value2) {
            addCriterion("min_points between", value1, value2, "min_points");
            return (Criteria) this;
        }

        public Criteria andMin_pointsNotBetween(Integer value1, Integer value2) {
            addCriterion("min_points not between", value1, value2, "min_points");
            return (Criteria) this;
        }

        public Criteria andMax_pointsIsNull() {
            addCriterion("max_points is null");
            return (Criteria) this;
        }

        public Criteria andMax_pointsIsNotNull() {
            addCriterion("max_points is not null");
            return (Criteria) this;
        }

        public Criteria andMax_pointsEqualTo(Integer value) {
            addCriterion("max_points =", value, "max_points");
            return (Criteria) this;
        }

        public Criteria andMax_pointsNotEqualTo(Integer value) {
            addCriterion("max_points <>", value, "max_points");
            return (Criteria) this;
        }

        public Criteria andMax_pointsGreaterThan(Integer value) {
            addCriterion("max_points >", value, "max_points");
            return (Criteria) this;
        }

        public Criteria andMax_pointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_points >=", value, "max_points");
            return (Criteria) this;
        }

        public Criteria andMax_pointsLessThan(Integer value) {
            addCriterion("max_points <", value, "max_points");
            return (Criteria) this;
        }

        public Criteria andMax_pointsLessThanOrEqualTo(Integer value) {
            addCriterion("max_points <=", value, "max_points");
            return (Criteria) this;
        }

        public Criteria andMax_pointsIn(List<Integer> values) {
            addCriterion("max_points in", values, "max_points");
            return (Criteria) this;
        }

        public Criteria andMax_pointsNotIn(List<Integer> values) {
            addCriterion("max_points not in", values, "max_points");
            return (Criteria) this;
        }

        public Criteria andMax_pointsBetween(Integer value1, Integer value2) {
            addCriterion("max_points between", value1, value2, "max_points");
            return (Criteria) this;
        }

        public Criteria andMax_pointsNotBetween(Integer value1, Integer value2) {
            addCriterion("max_points not between", value1, value2, "max_points");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Byte value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Byte value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Byte value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Byte value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Byte value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Byte value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Byte> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Byte> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Byte value1, Byte value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Byte value1, Byte value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andShow_priceIsNull() {
            addCriterion("show_price is null");
            return (Criteria) this;
        }

        public Criteria andShow_priceIsNotNull() {
            addCriterion("show_price is not null");
            return (Criteria) this;
        }

        public Criteria andShow_priceEqualTo(Boolean value) {
            addCriterion("show_price =", value, "show_price");
            return (Criteria) this;
        }

        public Criteria andShow_priceNotEqualTo(Boolean value) {
            addCriterion("show_price <>", value, "show_price");
            return (Criteria) this;
        }

        public Criteria andShow_priceGreaterThan(Boolean value) {
            addCriterion("show_price >", value, "show_price");
            return (Criteria) this;
        }

        public Criteria andShow_priceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("show_price >=", value, "show_price");
            return (Criteria) this;
        }

        public Criteria andShow_priceLessThan(Boolean value) {
            addCriterion("show_price <", value, "show_price");
            return (Criteria) this;
        }

        public Criteria andShow_priceLessThanOrEqualTo(Boolean value) {
            addCriterion("show_price <=", value, "show_price");
            return (Criteria) this;
        }

        public Criteria andShow_priceIn(List<Boolean> values) {
            addCriterion("show_price in", values, "show_price");
            return (Criteria) this;
        }

        public Criteria andShow_priceNotIn(List<Boolean> values) {
            addCriterion("show_price not in", values, "show_price");
            return (Criteria) this;
        }

        public Criteria andShow_priceBetween(Boolean value1, Boolean value2) {
            addCriterion("show_price between", value1, value2, "show_price");
            return (Criteria) this;
        }

        public Criteria andShow_priceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("show_price not between", value1, value2, "show_price");
            return (Criteria) this;
        }

        public Criteria andSpecial_rankIsNull() {
            addCriterion("special_rank is null");
            return (Criteria) this;
        }

        public Criteria andSpecial_rankIsNotNull() {
            addCriterion("special_rank is not null");
            return (Criteria) this;
        }

        public Criteria andSpecial_rankEqualTo(Boolean value) {
            addCriterion("special_rank =", value, "special_rank");
            return (Criteria) this;
        }

        public Criteria andSpecial_rankNotEqualTo(Boolean value) {
            addCriterion("special_rank <>", value, "special_rank");
            return (Criteria) this;
        }

        public Criteria andSpecial_rankGreaterThan(Boolean value) {
            addCriterion("special_rank >", value, "special_rank");
            return (Criteria) this;
        }

        public Criteria andSpecial_rankGreaterThanOrEqualTo(Boolean value) {
            addCriterion("special_rank >=", value, "special_rank");
            return (Criteria) this;
        }

        public Criteria andSpecial_rankLessThan(Boolean value) {
            addCriterion("special_rank <", value, "special_rank");
            return (Criteria) this;
        }

        public Criteria andSpecial_rankLessThanOrEqualTo(Boolean value) {
            addCriterion("special_rank <=", value, "special_rank");
            return (Criteria) this;
        }

        public Criteria andSpecial_rankIn(List<Boolean> values) {
            addCriterion("special_rank in", values, "special_rank");
            return (Criteria) this;
        }

        public Criteria andSpecial_rankNotIn(List<Boolean> values) {
            addCriterion("special_rank not in", values, "special_rank");
            return (Criteria) this;
        }

        public Criteria andSpecial_rankBetween(Boolean value1, Boolean value2) {
            addCriterion("special_rank between", value1, value2, "special_rank");
            return (Criteria) this;
        }

        public Criteria andSpecial_rankNotBetween(Boolean value1, Boolean value2) {
            addCriterion("special_rank not between", value1, value2, "special_rank");
            return (Criteria) this;
        }

        public Criteria andIs_recommIsNull() {
            addCriterion("is_recomm is null");
            return (Criteria) this;
        }

        public Criteria andIs_recommIsNotNull() {
            addCriterion("is_recomm is not null");
            return (Criteria) this;
        }

        public Criteria andIs_recommEqualTo(Boolean value) {
            addCriterion("is_recomm =", value, "is_recomm");
            return (Criteria) this;
        }

        public Criteria andIs_recommNotEqualTo(Boolean value) {
            addCriterion("is_recomm <>", value, "is_recomm");
            return (Criteria) this;
        }

        public Criteria andIs_recommGreaterThan(Boolean value) {
            addCriterion("is_recomm >", value, "is_recomm");
            return (Criteria) this;
        }

        public Criteria andIs_recommGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_recomm >=", value, "is_recomm");
            return (Criteria) this;
        }

        public Criteria andIs_recommLessThan(Boolean value) {
            addCriterion("is_recomm <", value, "is_recomm");
            return (Criteria) this;
        }

        public Criteria andIs_recommLessThanOrEqualTo(Boolean value) {
            addCriterion("is_recomm <=", value, "is_recomm");
            return (Criteria) this;
        }

        public Criteria andIs_recommIn(List<Boolean> values) {
            addCriterion("is_recomm in", values, "is_recomm");
            return (Criteria) this;
        }

        public Criteria andIs_recommNotIn(List<Boolean> values) {
            addCriterion("is_recomm not in", values, "is_recomm");
            return (Criteria) this;
        }

        public Criteria andIs_recommBetween(Boolean value1, Boolean value2) {
            addCriterion("is_recomm between", value1, value2, "is_recomm");
            return (Criteria) this;
        }

        public Criteria andIs_recommNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_recomm not between", value1, value2, "is_recomm");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_user_rank
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
     * This class corresponds to the database table ecs_user_rank
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