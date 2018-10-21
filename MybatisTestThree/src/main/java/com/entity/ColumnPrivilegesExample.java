package com.entity;

import java.util.ArrayList;
import java.util.List;

public class ColumnPrivilegesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table COLUMN_PRIVILEGES
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table COLUMN_PRIVILEGES
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table COLUMN_PRIVILEGES
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLUMN_PRIVILEGES
     *
     * @mbg.generated
     */
    public ColumnPrivilegesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLUMN_PRIVILEGES
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLUMN_PRIVILEGES
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLUMN_PRIVILEGES
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLUMN_PRIVILEGES
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLUMN_PRIVILEGES
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLUMN_PRIVILEGES
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLUMN_PRIVILEGES
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
     * This method corresponds to the database table COLUMN_PRIVILEGES
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
     * This method corresponds to the database table COLUMN_PRIVILEGES
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLUMN_PRIVILEGES
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
     * This class corresponds to the database table COLUMN_PRIVILEGES
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

        public Criteria andGRANTEEIsNull() {
            addCriterion("GRANTEE is null");
            return (Criteria) this;
        }

        public Criteria andGRANTEEIsNotNull() {
            addCriterion("GRANTEE is not null");
            return (Criteria) this;
        }

        public Criteria andGRANTEEEqualTo(String value) {
            addCriterion("GRANTEE =", value, "GRANTEE");
            return (Criteria) this;
        }

        public Criteria andGRANTEENotEqualTo(String value) {
            addCriterion("GRANTEE <>", value, "GRANTEE");
            return (Criteria) this;
        }

        public Criteria andGRANTEEGreaterThan(String value) {
            addCriterion("GRANTEE >", value, "GRANTEE");
            return (Criteria) this;
        }

        public Criteria andGRANTEEGreaterThanOrEqualTo(String value) {
            addCriterion("GRANTEE >=", value, "GRANTEE");
            return (Criteria) this;
        }

        public Criteria andGRANTEELessThan(String value) {
            addCriterion("GRANTEE <", value, "GRANTEE");
            return (Criteria) this;
        }

        public Criteria andGRANTEELessThanOrEqualTo(String value) {
            addCriterion("GRANTEE <=", value, "GRANTEE");
            return (Criteria) this;
        }

        public Criteria andGRANTEELike(String value) {
            addCriterion("GRANTEE like", value, "GRANTEE");
            return (Criteria) this;
        }

        public Criteria andGRANTEENotLike(String value) {
            addCriterion("GRANTEE not like", value, "GRANTEE");
            return (Criteria) this;
        }

        public Criteria andGRANTEEIn(List<String> values) {
            addCriterion("GRANTEE in", values, "GRANTEE");
            return (Criteria) this;
        }

        public Criteria andGRANTEENotIn(List<String> values) {
            addCriterion("GRANTEE not in", values, "GRANTEE");
            return (Criteria) this;
        }

        public Criteria andGRANTEEBetween(String value1, String value2) {
            addCriterion("GRANTEE between", value1, value2, "GRANTEE");
            return (Criteria) this;
        }

        public Criteria andGRANTEENotBetween(String value1, String value2) {
            addCriterion("GRANTEE not between", value1, value2, "GRANTEE");
            return (Criteria) this;
        }

        public Criteria andTABLE_CATALOGIsNull() {
            addCriterion("TABLE_CATALOG is null");
            return (Criteria) this;
        }

        public Criteria andTABLE_CATALOGIsNotNull() {
            addCriterion("TABLE_CATALOG is not null");
            return (Criteria) this;
        }

        public Criteria andTABLE_CATALOGEqualTo(String value) {
            addCriterion("TABLE_CATALOG =", value, "TABLE_CATALOG");
            return (Criteria) this;
        }

        public Criteria andTABLE_CATALOGNotEqualTo(String value) {
            addCriterion("TABLE_CATALOG <>", value, "TABLE_CATALOG");
            return (Criteria) this;
        }

        public Criteria andTABLE_CATALOGGreaterThan(String value) {
            addCriterion("TABLE_CATALOG >", value, "TABLE_CATALOG");
            return (Criteria) this;
        }

        public Criteria andTABLE_CATALOGGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_CATALOG >=", value, "TABLE_CATALOG");
            return (Criteria) this;
        }

        public Criteria andTABLE_CATALOGLessThan(String value) {
            addCriterion("TABLE_CATALOG <", value, "TABLE_CATALOG");
            return (Criteria) this;
        }

        public Criteria andTABLE_CATALOGLessThanOrEqualTo(String value) {
            addCriterion("TABLE_CATALOG <=", value, "TABLE_CATALOG");
            return (Criteria) this;
        }

        public Criteria andTABLE_CATALOGLike(String value) {
            addCriterion("TABLE_CATALOG like", value, "TABLE_CATALOG");
            return (Criteria) this;
        }

        public Criteria andTABLE_CATALOGNotLike(String value) {
            addCriterion("TABLE_CATALOG not like", value, "TABLE_CATALOG");
            return (Criteria) this;
        }

        public Criteria andTABLE_CATALOGIn(List<String> values) {
            addCriterion("TABLE_CATALOG in", values, "TABLE_CATALOG");
            return (Criteria) this;
        }

        public Criteria andTABLE_CATALOGNotIn(List<String> values) {
            addCriterion("TABLE_CATALOG not in", values, "TABLE_CATALOG");
            return (Criteria) this;
        }

        public Criteria andTABLE_CATALOGBetween(String value1, String value2) {
            addCriterion("TABLE_CATALOG between", value1, value2, "TABLE_CATALOG");
            return (Criteria) this;
        }

        public Criteria andTABLE_CATALOGNotBetween(String value1, String value2) {
            addCriterion("TABLE_CATALOG not between", value1, value2, "TABLE_CATALOG");
            return (Criteria) this;
        }

        public Criteria andTABLE_SCHEMAIsNull() {
            addCriterion("TABLE_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andTABLE_SCHEMAIsNotNull() {
            addCriterion("TABLE_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andTABLE_SCHEMAEqualTo(String value) {
            addCriterion("TABLE_SCHEMA =", value, "TABLE_SCHEMA");
            return (Criteria) this;
        }

        public Criteria andTABLE_SCHEMANotEqualTo(String value) {
            addCriterion("TABLE_SCHEMA <>", value, "TABLE_SCHEMA");
            return (Criteria) this;
        }

        public Criteria andTABLE_SCHEMAGreaterThan(String value) {
            addCriterion("TABLE_SCHEMA >", value, "TABLE_SCHEMA");
            return (Criteria) this;
        }

        public Criteria andTABLE_SCHEMAGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_SCHEMA >=", value, "TABLE_SCHEMA");
            return (Criteria) this;
        }

        public Criteria andTABLE_SCHEMALessThan(String value) {
            addCriterion("TABLE_SCHEMA <", value, "TABLE_SCHEMA");
            return (Criteria) this;
        }

        public Criteria andTABLE_SCHEMALessThanOrEqualTo(String value) {
            addCriterion("TABLE_SCHEMA <=", value, "TABLE_SCHEMA");
            return (Criteria) this;
        }

        public Criteria andTABLE_SCHEMALike(String value) {
            addCriterion("TABLE_SCHEMA like", value, "TABLE_SCHEMA");
            return (Criteria) this;
        }

        public Criteria andTABLE_SCHEMANotLike(String value) {
            addCriterion("TABLE_SCHEMA not like", value, "TABLE_SCHEMA");
            return (Criteria) this;
        }

        public Criteria andTABLE_SCHEMAIn(List<String> values) {
            addCriterion("TABLE_SCHEMA in", values, "TABLE_SCHEMA");
            return (Criteria) this;
        }

        public Criteria andTABLE_SCHEMANotIn(List<String> values) {
            addCriterion("TABLE_SCHEMA not in", values, "TABLE_SCHEMA");
            return (Criteria) this;
        }

        public Criteria andTABLE_SCHEMABetween(String value1, String value2) {
            addCriterion("TABLE_SCHEMA between", value1, value2, "TABLE_SCHEMA");
            return (Criteria) this;
        }

        public Criteria andTABLE_SCHEMANotBetween(String value1, String value2) {
            addCriterion("TABLE_SCHEMA not between", value1, value2, "TABLE_SCHEMA");
            return (Criteria) this;
        }

        public Criteria andTABLE_NAMEIsNull() {
            addCriterion("TABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTABLE_NAMEIsNotNull() {
            addCriterion("TABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTABLE_NAMEEqualTo(String value) {
            addCriterion("TABLE_NAME =", value, "TABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andTABLE_NAMENotEqualTo(String value) {
            addCriterion("TABLE_NAME <>", value, "TABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andTABLE_NAMEGreaterThan(String value) {
            addCriterion("TABLE_NAME >", value, "TABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andTABLE_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME >=", value, "TABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andTABLE_NAMELessThan(String value) {
            addCriterion("TABLE_NAME <", value, "TABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andTABLE_NAMELessThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME <=", value, "TABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andTABLE_NAMELike(String value) {
            addCriterion("TABLE_NAME like", value, "TABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andTABLE_NAMENotLike(String value) {
            addCriterion("TABLE_NAME not like", value, "TABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andTABLE_NAMEIn(List<String> values) {
            addCriterion("TABLE_NAME in", values, "TABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andTABLE_NAMENotIn(List<String> values) {
            addCriterion("TABLE_NAME not in", values, "TABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andTABLE_NAMEBetween(String value1, String value2) {
            addCriterion("TABLE_NAME between", value1, value2, "TABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andTABLE_NAMENotBetween(String value1, String value2) {
            addCriterion("TABLE_NAME not between", value1, value2, "TABLE_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_NAMEIsNull() {
            addCriterion("COLUMN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_NAMEIsNotNull() {
            addCriterion("COLUMN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_NAMEEqualTo(String value) {
            addCriterion("COLUMN_NAME =", value, "COLUMN_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_NAMENotEqualTo(String value) {
            addCriterion("COLUMN_NAME <>", value, "COLUMN_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_NAMEGreaterThan(String value) {
            addCriterion("COLUMN_NAME >", value, "COLUMN_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("COLUMN_NAME >=", value, "COLUMN_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_NAMELessThan(String value) {
            addCriterion("COLUMN_NAME <", value, "COLUMN_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_NAMELessThanOrEqualTo(String value) {
            addCriterion("COLUMN_NAME <=", value, "COLUMN_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_NAMELike(String value) {
            addCriterion("COLUMN_NAME like", value, "COLUMN_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_NAMENotLike(String value) {
            addCriterion("COLUMN_NAME not like", value, "COLUMN_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_NAMEIn(List<String> values) {
            addCriterion("COLUMN_NAME in", values, "COLUMN_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_NAMENotIn(List<String> values) {
            addCriterion("COLUMN_NAME not in", values, "COLUMN_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_NAMEBetween(String value1, String value2) {
            addCriterion("COLUMN_NAME between", value1, value2, "COLUMN_NAME");
            return (Criteria) this;
        }

        public Criteria andCOLUMN_NAMENotBetween(String value1, String value2) {
            addCriterion("COLUMN_NAME not between", value1, value2, "COLUMN_NAME");
            return (Criteria) this;
        }

        public Criteria andPRIVILEGE_TYPEIsNull() {
            addCriterion("PRIVILEGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPRIVILEGE_TYPEIsNotNull() {
            addCriterion("PRIVILEGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPRIVILEGE_TYPEEqualTo(String value) {
            addCriterion("PRIVILEGE_TYPE =", value, "PRIVILEGE_TYPE");
            return (Criteria) this;
        }

        public Criteria andPRIVILEGE_TYPENotEqualTo(String value) {
            addCriterion("PRIVILEGE_TYPE <>", value, "PRIVILEGE_TYPE");
            return (Criteria) this;
        }

        public Criteria andPRIVILEGE_TYPEGreaterThan(String value) {
            addCriterion("PRIVILEGE_TYPE >", value, "PRIVILEGE_TYPE");
            return (Criteria) this;
        }

        public Criteria andPRIVILEGE_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("PRIVILEGE_TYPE >=", value, "PRIVILEGE_TYPE");
            return (Criteria) this;
        }

        public Criteria andPRIVILEGE_TYPELessThan(String value) {
            addCriterion("PRIVILEGE_TYPE <", value, "PRIVILEGE_TYPE");
            return (Criteria) this;
        }

        public Criteria andPRIVILEGE_TYPELessThanOrEqualTo(String value) {
            addCriterion("PRIVILEGE_TYPE <=", value, "PRIVILEGE_TYPE");
            return (Criteria) this;
        }

        public Criteria andPRIVILEGE_TYPELike(String value) {
            addCriterion("PRIVILEGE_TYPE like", value, "PRIVILEGE_TYPE");
            return (Criteria) this;
        }

        public Criteria andPRIVILEGE_TYPENotLike(String value) {
            addCriterion("PRIVILEGE_TYPE not like", value, "PRIVILEGE_TYPE");
            return (Criteria) this;
        }

        public Criteria andPRIVILEGE_TYPEIn(List<String> values) {
            addCriterion("PRIVILEGE_TYPE in", values, "PRIVILEGE_TYPE");
            return (Criteria) this;
        }

        public Criteria andPRIVILEGE_TYPENotIn(List<String> values) {
            addCriterion("PRIVILEGE_TYPE not in", values, "PRIVILEGE_TYPE");
            return (Criteria) this;
        }

        public Criteria andPRIVILEGE_TYPEBetween(String value1, String value2) {
            addCriterion("PRIVILEGE_TYPE between", value1, value2, "PRIVILEGE_TYPE");
            return (Criteria) this;
        }

        public Criteria andPRIVILEGE_TYPENotBetween(String value1, String value2) {
            addCriterion("PRIVILEGE_TYPE not between", value1, value2, "PRIVILEGE_TYPE");
            return (Criteria) this;
        }

        public Criteria andIS_GRANTABLEIsNull() {
            addCriterion("IS_GRANTABLE is null");
            return (Criteria) this;
        }

        public Criteria andIS_GRANTABLEIsNotNull() {
            addCriterion("IS_GRANTABLE is not null");
            return (Criteria) this;
        }

        public Criteria andIS_GRANTABLEEqualTo(String value) {
            addCriterion("IS_GRANTABLE =", value, "IS_GRANTABLE");
            return (Criteria) this;
        }

        public Criteria andIS_GRANTABLENotEqualTo(String value) {
            addCriterion("IS_GRANTABLE <>", value, "IS_GRANTABLE");
            return (Criteria) this;
        }

        public Criteria andIS_GRANTABLEGreaterThan(String value) {
            addCriterion("IS_GRANTABLE >", value, "IS_GRANTABLE");
            return (Criteria) this;
        }

        public Criteria andIS_GRANTABLEGreaterThanOrEqualTo(String value) {
            addCriterion("IS_GRANTABLE >=", value, "IS_GRANTABLE");
            return (Criteria) this;
        }

        public Criteria andIS_GRANTABLELessThan(String value) {
            addCriterion("IS_GRANTABLE <", value, "IS_GRANTABLE");
            return (Criteria) this;
        }

        public Criteria andIS_GRANTABLELessThanOrEqualTo(String value) {
            addCriterion("IS_GRANTABLE <=", value, "IS_GRANTABLE");
            return (Criteria) this;
        }

        public Criteria andIS_GRANTABLELike(String value) {
            addCriterion("IS_GRANTABLE like", value, "IS_GRANTABLE");
            return (Criteria) this;
        }

        public Criteria andIS_GRANTABLENotLike(String value) {
            addCriterion("IS_GRANTABLE not like", value, "IS_GRANTABLE");
            return (Criteria) this;
        }

        public Criteria andIS_GRANTABLEIn(List<String> values) {
            addCriterion("IS_GRANTABLE in", values, "IS_GRANTABLE");
            return (Criteria) this;
        }

        public Criteria andIS_GRANTABLENotIn(List<String> values) {
            addCriterion("IS_GRANTABLE not in", values, "IS_GRANTABLE");
            return (Criteria) this;
        }

        public Criteria andIS_GRANTABLEBetween(String value1, String value2) {
            addCriterion("IS_GRANTABLE between", value1, value2, "IS_GRANTABLE");
            return (Criteria) this;
        }

        public Criteria andIS_GRANTABLENotBetween(String value1, String value2) {
            addCriterion("IS_GRANTABLE not between", value1, value2, "IS_GRANTABLE");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table COLUMN_PRIVILEGES
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
     * This class corresponds to the database table COLUMN_PRIVILEGES
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