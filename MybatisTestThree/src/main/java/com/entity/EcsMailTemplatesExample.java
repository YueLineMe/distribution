package com.entity;

import java.util.ArrayList;
import java.util.List;

public class EcsMailTemplatesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_mail_templates
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_mail_templates
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_mail_templates
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_mail_templates
     *
     * @mbg.generated
     */
    public EcsMailTemplatesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_mail_templates
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_mail_templates
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_mail_templates
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_mail_templates
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_mail_templates
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_mail_templates
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_mail_templates
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
     * This method corresponds to the database table ecs_mail_templates
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
     * This method corresponds to the database table ecs_mail_templates
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_mail_templates
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
     * This class corresponds to the database table ecs_mail_templates
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

        public Criteria andTemplate_idIsNull() {
            addCriterion("template_id is null");
            return (Criteria) this;
        }

        public Criteria andTemplate_idIsNotNull() {
            addCriterion("template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTemplate_idEqualTo(Boolean value) {
            addCriterion("template_id =", value, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_idNotEqualTo(Boolean value) {
            addCriterion("template_id <>", value, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_idGreaterThan(Boolean value) {
            addCriterion("template_id >", value, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_idGreaterThanOrEqualTo(Boolean value) {
            addCriterion("template_id >=", value, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_idLessThan(Boolean value) {
            addCriterion("template_id <", value, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_idLessThanOrEqualTo(Boolean value) {
            addCriterion("template_id <=", value, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_idIn(List<Boolean> values) {
            addCriterion("template_id in", values, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_idNotIn(List<Boolean> values) {
            addCriterion("template_id not in", values, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_idBetween(Boolean value1, Boolean value2) {
            addCriterion("template_id between", value1, value2, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_idNotBetween(Boolean value1, Boolean value2) {
            addCriterion("template_id not between", value1, value2, "template_id");
            return (Criteria) this;
        }

        public Criteria andTemplate_codeIsNull() {
            addCriterion("template_code is null");
            return (Criteria) this;
        }

        public Criteria andTemplate_codeIsNotNull() {
            addCriterion("template_code is not null");
            return (Criteria) this;
        }

        public Criteria andTemplate_codeEqualTo(String value) {
            addCriterion("template_code =", value, "template_code");
            return (Criteria) this;
        }

        public Criteria andTemplate_codeNotEqualTo(String value) {
            addCriterion("template_code <>", value, "template_code");
            return (Criteria) this;
        }

        public Criteria andTemplate_codeGreaterThan(String value) {
            addCriterion("template_code >", value, "template_code");
            return (Criteria) this;
        }

        public Criteria andTemplate_codeGreaterThanOrEqualTo(String value) {
            addCriterion("template_code >=", value, "template_code");
            return (Criteria) this;
        }

        public Criteria andTemplate_codeLessThan(String value) {
            addCriterion("template_code <", value, "template_code");
            return (Criteria) this;
        }

        public Criteria andTemplate_codeLessThanOrEqualTo(String value) {
            addCriterion("template_code <=", value, "template_code");
            return (Criteria) this;
        }

        public Criteria andTemplate_codeLike(String value) {
            addCriterion("template_code like", value, "template_code");
            return (Criteria) this;
        }

        public Criteria andTemplate_codeNotLike(String value) {
            addCriterion("template_code not like", value, "template_code");
            return (Criteria) this;
        }

        public Criteria andTemplate_codeIn(List<String> values) {
            addCriterion("template_code in", values, "template_code");
            return (Criteria) this;
        }

        public Criteria andTemplate_codeNotIn(List<String> values) {
            addCriterion("template_code not in", values, "template_code");
            return (Criteria) this;
        }

        public Criteria andTemplate_codeBetween(String value1, String value2) {
            addCriterion("template_code between", value1, value2, "template_code");
            return (Criteria) this;
        }

        public Criteria andTemplate_codeNotBetween(String value1, String value2) {
            addCriterion("template_code not between", value1, value2, "template_code");
            return (Criteria) this;
        }

        public Criteria andIs_htmlIsNull() {
            addCriterion("is_html is null");
            return (Criteria) this;
        }

        public Criteria andIs_htmlIsNotNull() {
            addCriterion("is_html is not null");
            return (Criteria) this;
        }

        public Criteria andIs_htmlEqualTo(Boolean value) {
            addCriterion("is_html =", value, "is_html");
            return (Criteria) this;
        }

        public Criteria andIs_htmlNotEqualTo(Boolean value) {
            addCriterion("is_html <>", value, "is_html");
            return (Criteria) this;
        }

        public Criteria andIs_htmlGreaterThan(Boolean value) {
            addCriterion("is_html >", value, "is_html");
            return (Criteria) this;
        }

        public Criteria andIs_htmlGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_html >=", value, "is_html");
            return (Criteria) this;
        }

        public Criteria andIs_htmlLessThan(Boolean value) {
            addCriterion("is_html <", value, "is_html");
            return (Criteria) this;
        }

        public Criteria andIs_htmlLessThanOrEqualTo(Boolean value) {
            addCriterion("is_html <=", value, "is_html");
            return (Criteria) this;
        }

        public Criteria andIs_htmlIn(List<Boolean> values) {
            addCriterion("is_html in", values, "is_html");
            return (Criteria) this;
        }

        public Criteria andIs_htmlNotIn(List<Boolean> values) {
            addCriterion("is_html not in", values, "is_html");
            return (Criteria) this;
        }

        public Criteria andIs_htmlBetween(Boolean value1, Boolean value2) {
            addCriterion("is_html between", value1, value2, "is_html");
            return (Criteria) this;
        }

        public Criteria andIs_htmlNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_html not between", value1, value2, "is_html");
            return (Criteria) this;
        }

        public Criteria andTemplate_subjectIsNull() {
            addCriterion("template_subject is null");
            return (Criteria) this;
        }

        public Criteria andTemplate_subjectIsNotNull() {
            addCriterion("template_subject is not null");
            return (Criteria) this;
        }

        public Criteria andTemplate_subjectEqualTo(String value) {
            addCriterion("template_subject =", value, "template_subject");
            return (Criteria) this;
        }

        public Criteria andTemplate_subjectNotEqualTo(String value) {
            addCriterion("template_subject <>", value, "template_subject");
            return (Criteria) this;
        }

        public Criteria andTemplate_subjectGreaterThan(String value) {
            addCriterion("template_subject >", value, "template_subject");
            return (Criteria) this;
        }

        public Criteria andTemplate_subjectGreaterThanOrEqualTo(String value) {
            addCriterion("template_subject >=", value, "template_subject");
            return (Criteria) this;
        }

        public Criteria andTemplate_subjectLessThan(String value) {
            addCriterion("template_subject <", value, "template_subject");
            return (Criteria) this;
        }

        public Criteria andTemplate_subjectLessThanOrEqualTo(String value) {
            addCriterion("template_subject <=", value, "template_subject");
            return (Criteria) this;
        }

        public Criteria andTemplate_subjectLike(String value) {
            addCriterion("template_subject like", value, "template_subject");
            return (Criteria) this;
        }

        public Criteria andTemplate_subjectNotLike(String value) {
            addCriterion("template_subject not like", value, "template_subject");
            return (Criteria) this;
        }

        public Criteria andTemplate_subjectIn(List<String> values) {
            addCriterion("template_subject in", values, "template_subject");
            return (Criteria) this;
        }

        public Criteria andTemplate_subjectNotIn(List<String> values) {
            addCriterion("template_subject not in", values, "template_subject");
            return (Criteria) this;
        }

        public Criteria andTemplate_subjectBetween(String value1, String value2) {
            addCriterion("template_subject between", value1, value2, "template_subject");
            return (Criteria) this;
        }

        public Criteria andTemplate_subjectNotBetween(String value1, String value2) {
            addCriterion("template_subject not between", value1, value2, "template_subject");
            return (Criteria) this;
        }

        public Criteria andLast_modifyIsNull() {
            addCriterion("last_modify is null");
            return (Criteria) this;
        }

        public Criteria andLast_modifyIsNotNull() {
            addCriterion("last_modify is not null");
            return (Criteria) this;
        }

        public Criteria andLast_modifyEqualTo(Integer value) {
            addCriterion("last_modify =", value, "last_modify");
            return (Criteria) this;
        }

        public Criteria andLast_modifyNotEqualTo(Integer value) {
            addCriterion("last_modify <>", value, "last_modify");
            return (Criteria) this;
        }

        public Criteria andLast_modifyGreaterThan(Integer value) {
            addCriterion("last_modify >", value, "last_modify");
            return (Criteria) this;
        }

        public Criteria andLast_modifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_modify >=", value, "last_modify");
            return (Criteria) this;
        }

        public Criteria andLast_modifyLessThan(Integer value) {
            addCriterion("last_modify <", value, "last_modify");
            return (Criteria) this;
        }

        public Criteria andLast_modifyLessThanOrEqualTo(Integer value) {
            addCriterion("last_modify <=", value, "last_modify");
            return (Criteria) this;
        }

        public Criteria andLast_modifyIn(List<Integer> values) {
            addCriterion("last_modify in", values, "last_modify");
            return (Criteria) this;
        }

        public Criteria andLast_modifyNotIn(List<Integer> values) {
            addCriterion("last_modify not in", values, "last_modify");
            return (Criteria) this;
        }

        public Criteria andLast_modifyBetween(Integer value1, Integer value2) {
            addCriterion("last_modify between", value1, value2, "last_modify");
            return (Criteria) this;
        }

        public Criteria andLast_modifyNotBetween(Integer value1, Integer value2) {
            addCriterion("last_modify not between", value1, value2, "last_modify");
            return (Criteria) this;
        }

        public Criteria andLast_sendIsNull() {
            addCriterion("last_send is null");
            return (Criteria) this;
        }

        public Criteria andLast_sendIsNotNull() {
            addCriterion("last_send is not null");
            return (Criteria) this;
        }

        public Criteria andLast_sendEqualTo(Integer value) {
            addCriterion("last_send =", value, "last_send");
            return (Criteria) this;
        }

        public Criteria andLast_sendNotEqualTo(Integer value) {
            addCriterion("last_send <>", value, "last_send");
            return (Criteria) this;
        }

        public Criteria andLast_sendGreaterThan(Integer value) {
            addCriterion("last_send >", value, "last_send");
            return (Criteria) this;
        }

        public Criteria andLast_sendGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_send >=", value, "last_send");
            return (Criteria) this;
        }

        public Criteria andLast_sendLessThan(Integer value) {
            addCriterion("last_send <", value, "last_send");
            return (Criteria) this;
        }

        public Criteria andLast_sendLessThanOrEqualTo(Integer value) {
            addCriterion("last_send <=", value, "last_send");
            return (Criteria) this;
        }

        public Criteria andLast_sendIn(List<Integer> values) {
            addCriterion("last_send in", values, "last_send");
            return (Criteria) this;
        }

        public Criteria andLast_sendNotIn(List<Integer> values) {
            addCriterion("last_send not in", values, "last_send");
            return (Criteria) this;
        }

        public Criteria andLast_sendBetween(Integer value1, Integer value2) {
            addCriterion("last_send between", value1, value2, "last_send");
            return (Criteria) this;
        }

        public Criteria andLast_sendNotBetween(Integer value1, Integer value2) {
            addCriterion("last_send not between", value1, value2, "last_send");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_mail_templates
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
     * This class corresponds to the database table ecs_mail_templates
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