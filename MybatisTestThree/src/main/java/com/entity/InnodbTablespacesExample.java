package com.entity;

import java.util.ArrayList;
import java.util.List;

public class InnodbTablespacesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INNODB_TABLESPACES
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INNODB_TABLESPACES
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table INNODB_TABLESPACES
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TABLESPACES
     *
     * @mbg.generated
     */
    public InnodbTablespacesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TABLESPACES
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TABLESPACES
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TABLESPACES
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TABLESPACES
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TABLESPACES
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TABLESPACES
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TABLESPACES
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
     * This method corresponds to the database table INNODB_TABLESPACES
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
     * This method corresponds to the database table INNODB_TABLESPACES
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_TABLESPACES
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
     * This class corresponds to the database table INNODB_TABLESPACES
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

        public Criteria andSPACEIsNull() {
            addCriterion("SPACE is null");
            return (Criteria) this;
        }

        public Criteria andSPACEIsNotNull() {
            addCriterion("SPACE is not null");
            return (Criteria) this;
        }

        public Criteria andSPACEEqualTo(Integer value) {
            addCriterion("SPACE =", value, "SPACE");
            return (Criteria) this;
        }

        public Criteria andSPACENotEqualTo(Integer value) {
            addCriterion("SPACE <>", value, "SPACE");
            return (Criteria) this;
        }

        public Criteria andSPACEGreaterThan(Integer value) {
            addCriterion("SPACE >", value, "SPACE");
            return (Criteria) this;
        }

        public Criteria andSPACEGreaterThanOrEqualTo(Integer value) {
            addCriterion("SPACE >=", value, "SPACE");
            return (Criteria) this;
        }

        public Criteria andSPACELessThan(Integer value) {
            addCriterion("SPACE <", value, "SPACE");
            return (Criteria) this;
        }

        public Criteria andSPACELessThanOrEqualTo(Integer value) {
            addCriterion("SPACE <=", value, "SPACE");
            return (Criteria) this;
        }

        public Criteria andSPACEIn(List<Integer> values) {
            addCriterion("SPACE in", values, "SPACE");
            return (Criteria) this;
        }

        public Criteria andSPACENotIn(List<Integer> values) {
            addCriterion("SPACE not in", values, "SPACE");
            return (Criteria) this;
        }

        public Criteria andSPACEBetween(Integer value1, Integer value2) {
            addCriterion("SPACE between", value1, value2, "SPACE");
            return (Criteria) this;
        }

        public Criteria andSPACENotBetween(Integer value1, Integer value2) {
            addCriterion("SPACE not between", value1, value2, "SPACE");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNAMEEqualTo(String value) {
            addCriterion("NAME =", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotEqualTo(String value) {
            addCriterion("NAME <>", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThan(String value) {
            addCriterion("NAME >", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThan(String value) {
            addCriterion("NAME <", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELike(String value) {
            addCriterion("NAME like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotLike(String value) {
            addCriterion("NAME not like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEIn(List<String> values) {
            addCriterion("NAME in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotIn(List<String> values) {
            addCriterion("NAME not in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andFLAGIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFLAGIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFLAGEqualTo(Integer value) {
            addCriterion("FLAG =", value, "FLAG");
            return (Criteria) this;
        }

        public Criteria andFLAGNotEqualTo(Integer value) {
            addCriterion("FLAG <>", value, "FLAG");
            return (Criteria) this;
        }

        public Criteria andFLAGGreaterThan(Integer value) {
            addCriterion("FLAG >", value, "FLAG");
            return (Criteria) this;
        }

        public Criteria andFLAGGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLAG >=", value, "FLAG");
            return (Criteria) this;
        }

        public Criteria andFLAGLessThan(Integer value) {
            addCriterion("FLAG <", value, "FLAG");
            return (Criteria) this;
        }

        public Criteria andFLAGLessThanOrEqualTo(Integer value) {
            addCriterion("FLAG <=", value, "FLAG");
            return (Criteria) this;
        }

        public Criteria andFLAGIn(List<Integer> values) {
            addCriterion("FLAG in", values, "FLAG");
            return (Criteria) this;
        }

        public Criteria andFLAGNotIn(List<Integer> values) {
            addCriterion("FLAG not in", values, "FLAG");
            return (Criteria) this;
        }

        public Criteria andFLAGBetween(Integer value1, Integer value2) {
            addCriterion("FLAG between", value1, value2, "FLAG");
            return (Criteria) this;
        }

        public Criteria andFLAGNotBetween(Integer value1, Integer value2) {
            addCriterion("FLAG not between", value1, value2, "FLAG");
            return (Criteria) this;
        }

        public Criteria andROW_FORMATIsNull() {
            addCriterion("ROW_FORMAT is null");
            return (Criteria) this;
        }

        public Criteria andROW_FORMATIsNotNull() {
            addCriterion("ROW_FORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andROW_FORMATEqualTo(String value) {
            addCriterion("ROW_FORMAT =", value, "ROW_FORMAT");
            return (Criteria) this;
        }

        public Criteria andROW_FORMATNotEqualTo(String value) {
            addCriterion("ROW_FORMAT <>", value, "ROW_FORMAT");
            return (Criteria) this;
        }

        public Criteria andROW_FORMATGreaterThan(String value) {
            addCriterion("ROW_FORMAT >", value, "ROW_FORMAT");
            return (Criteria) this;
        }

        public Criteria andROW_FORMATGreaterThanOrEqualTo(String value) {
            addCriterion("ROW_FORMAT >=", value, "ROW_FORMAT");
            return (Criteria) this;
        }

        public Criteria andROW_FORMATLessThan(String value) {
            addCriterion("ROW_FORMAT <", value, "ROW_FORMAT");
            return (Criteria) this;
        }

        public Criteria andROW_FORMATLessThanOrEqualTo(String value) {
            addCriterion("ROW_FORMAT <=", value, "ROW_FORMAT");
            return (Criteria) this;
        }

        public Criteria andROW_FORMATLike(String value) {
            addCriterion("ROW_FORMAT like", value, "ROW_FORMAT");
            return (Criteria) this;
        }

        public Criteria andROW_FORMATNotLike(String value) {
            addCriterion("ROW_FORMAT not like", value, "ROW_FORMAT");
            return (Criteria) this;
        }

        public Criteria andROW_FORMATIn(List<String> values) {
            addCriterion("ROW_FORMAT in", values, "ROW_FORMAT");
            return (Criteria) this;
        }

        public Criteria andROW_FORMATNotIn(List<String> values) {
            addCriterion("ROW_FORMAT not in", values, "ROW_FORMAT");
            return (Criteria) this;
        }

        public Criteria andROW_FORMATBetween(String value1, String value2) {
            addCriterion("ROW_FORMAT between", value1, value2, "ROW_FORMAT");
            return (Criteria) this;
        }

        public Criteria andROW_FORMATNotBetween(String value1, String value2) {
            addCriterion("ROW_FORMAT not between", value1, value2, "ROW_FORMAT");
            return (Criteria) this;
        }

        public Criteria andPAGE_SIZEIsNull() {
            addCriterion("PAGE_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andPAGE_SIZEIsNotNull() {
            addCriterion("PAGE_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andPAGE_SIZEEqualTo(Integer value) {
            addCriterion("PAGE_SIZE =", value, "PAGE_SIZE");
            return (Criteria) this;
        }

        public Criteria andPAGE_SIZENotEqualTo(Integer value) {
            addCriterion("PAGE_SIZE <>", value, "PAGE_SIZE");
            return (Criteria) this;
        }

        public Criteria andPAGE_SIZEGreaterThan(Integer value) {
            addCriterion("PAGE_SIZE >", value, "PAGE_SIZE");
            return (Criteria) this;
        }

        public Criteria andPAGE_SIZEGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAGE_SIZE >=", value, "PAGE_SIZE");
            return (Criteria) this;
        }

        public Criteria andPAGE_SIZELessThan(Integer value) {
            addCriterion("PAGE_SIZE <", value, "PAGE_SIZE");
            return (Criteria) this;
        }

        public Criteria andPAGE_SIZELessThanOrEqualTo(Integer value) {
            addCriterion("PAGE_SIZE <=", value, "PAGE_SIZE");
            return (Criteria) this;
        }

        public Criteria andPAGE_SIZEIn(List<Integer> values) {
            addCriterion("PAGE_SIZE in", values, "PAGE_SIZE");
            return (Criteria) this;
        }

        public Criteria andPAGE_SIZENotIn(List<Integer> values) {
            addCriterion("PAGE_SIZE not in", values, "PAGE_SIZE");
            return (Criteria) this;
        }

        public Criteria andPAGE_SIZEBetween(Integer value1, Integer value2) {
            addCriterion("PAGE_SIZE between", value1, value2, "PAGE_SIZE");
            return (Criteria) this;
        }

        public Criteria andPAGE_SIZENotBetween(Integer value1, Integer value2) {
            addCriterion("PAGE_SIZE not between", value1, value2, "PAGE_SIZE");
            return (Criteria) this;
        }

        public Criteria andZIP_PAGE_SIZEIsNull() {
            addCriterion("ZIP_PAGE_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andZIP_PAGE_SIZEIsNotNull() {
            addCriterion("ZIP_PAGE_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andZIP_PAGE_SIZEEqualTo(Integer value) {
            addCriterion("ZIP_PAGE_SIZE =", value, "ZIP_PAGE_SIZE");
            return (Criteria) this;
        }

        public Criteria andZIP_PAGE_SIZENotEqualTo(Integer value) {
            addCriterion("ZIP_PAGE_SIZE <>", value, "ZIP_PAGE_SIZE");
            return (Criteria) this;
        }

        public Criteria andZIP_PAGE_SIZEGreaterThan(Integer value) {
            addCriterion("ZIP_PAGE_SIZE >", value, "ZIP_PAGE_SIZE");
            return (Criteria) this;
        }

        public Criteria andZIP_PAGE_SIZEGreaterThanOrEqualTo(Integer value) {
            addCriterion("ZIP_PAGE_SIZE >=", value, "ZIP_PAGE_SIZE");
            return (Criteria) this;
        }

        public Criteria andZIP_PAGE_SIZELessThan(Integer value) {
            addCriterion("ZIP_PAGE_SIZE <", value, "ZIP_PAGE_SIZE");
            return (Criteria) this;
        }

        public Criteria andZIP_PAGE_SIZELessThanOrEqualTo(Integer value) {
            addCriterion("ZIP_PAGE_SIZE <=", value, "ZIP_PAGE_SIZE");
            return (Criteria) this;
        }

        public Criteria andZIP_PAGE_SIZEIn(List<Integer> values) {
            addCriterion("ZIP_PAGE_SIZE in", values, "ZIP_PAGE_SIZE");
            return (Criteria) this;
        }

        public Criteria andZIP_PAGE_SIZENotIn(List<Integer> values) {
            addCriterion("ZIP_PAGE_SIZE not in", values, "ZIP_PAGE_SIZE");
            return (Criteria) this;
        }

        public Criteria andZIP_PAGE_SIZEBetween(Integer value1, Integer value2) {
            addCriterion("ZIP_PAGE_SIZE between", value1, value2, "ZIP_PAGE_SIZE");
            return (Criteria) this;
        }

        public Criteria andZIP_PAGE_SIZENotBetween(Integer value1, Integer value2) {
            addCriterion("ZIP_PAGE_SIZE not between", value1, value2, "ZIP_PAGE_SIZE");
            return (Criteria) this;
        }

        public Criteria andSPACE_TYPEIsNull() {
            addCriterion("SPACE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSPACE_TYPEIsNotNull() {
            addCriterion("SPACE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSPACE_TYPEEqualTo(String value) {
            addCriterion("SPACE_TYPE =", value, "SPACE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSPACE_TYPENotEqualTo(String value) {
            addCriterion("SPACE_TYPE <>", value, "SPACE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSPACE_TYPEGreaterThan(String value) {
            addCriterion("SPACE_TYPE >", value, "SPACE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSPACE_TYPEGreaterThanOrEqualTo(String value) {
            addCriterion("SPACE_TYPE >=", value, "SPACE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSPACE_TYPELessThan(String value) {
            addCriterion("SPACE_TYPE <", value, "SPACE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSPACE_TYPELessThanOrEqualTo(String value) {
            addCriterion("SPACE_TYPE <=", value, "SPACE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSPACE_TYPELike(String value) {
            addCriterion("SPACE_TYPE like", value, "SPACE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSPACE_TYPENotLike(String value) {
            addCriterion("SPACE_TYPE not like", value, "SPACE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSPACE_TYPEIn(List<String> values) {
            addCriterion("SPACE_TYPE in", values, "SPACE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSPACE_TYPENotIn(List<String> values) {
            addCriterion("SPACE_TYPE not in", values, "SPACE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSPACE_TYPEBetween(String value1, String value2) {
            addCriterion("SPACE_TYPE between", value1, value2, "SPACE_TYPE");
            return (Criteria) this;
        }

        public Criteria andSPACE_TYPENotBetween(String value1, String value2) {
            addCriterion("SPACE_TYPE not between", value1, value2, "SPACE_TYPE");
            return (Criteria) this;
        }

        public Criteria andFS_BLOCK_SIZEIsNull() {
            addCriterion("FS_BLOCK_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andFS_BLOCK_SIZEIsNotNull() {
            addCriterion("FS_BLOCK_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andFS_BLOCK_SIZEEqualTo(Integer value) {
            addCriterion("FS_BLOCK_SIZE =", value, "FS_BLOCK_SIZE");
            return (Criteria) this;
        }

        public Criteria andFS_BLOCK_SIZENotEqualTo(Integer value) {
            addCriterion("FS_BLOCK_SIZE <>", value, "FS_BLOCK_SIZE");
            return (Criteria) this;
        }

        public Criteria andFS_BLOCK_SIZEGreaterThan(Integer value) {
            addCriterion("FS_BLOCK_SIZE >", value, "FS_BLOCK_SIZE");
            return (Criteria) this;
        }

        public Criteria andFS_BLOCK_SIZEGreaterThanOrEqualTo(Integer value) {
            addCriterion("FS_BLOCK_SIZE >=", value, "FS_BLOCK_SIZE");
            return (Criteria) this;
        }

        public Criteria andFS_BLOCK_SIZELessThan(Integer value) {
            addCriterion("FS_BLOCK_SIZE <", value, "FS_BLOCK_SIZE");
            return (Criteria) this;
        }

        public Criteria andFS_BLOCK_SIZELessThanOrEqualTo(Integer value) {
            addCriterion("FS_BLOCK_SIZE <=", value, "FS_BLOCK_SIZE");
            return (Criteria) this;
        }

        public Criteria andFS_BLOCK_SIZEIn(List<Integer> values) {
            addCriterion("FS_BLOCK_SIZE in", values, "FS_BLOCK_SIZE");
            return (Criteria) this;
        }

        public Criteria andFS_BLOCK_SIZENotIn(List<Integer> values) {
            addCriterion("FS_BLOCK_SIZE not in", values, "FS_BLOCK_SIZE");
            return (Criteria) this;
        }

        public Criteria andFS_BLOCK_SIZEBetween(Integer value1, Integer value2) {
            addCriterion("FS_BLOCK_SIZE between", value1, value2, "FS_BLOCK_SIZE");
            return (Criteria) this;
        }

        public Criteria andFS_BLOCK_SIZENotBetween(Integer value1, Integer value2) {
            addCriterion("FS_BLOCK_SIZE not between", value1, value2, "FS_BLOCK_SIZE");
            return (Criteria) this;
        }

        public Criteria andFILE_SIZEIsNull() {
            addCriterion("FILE_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andFILE_SIZEIsNotNull() {
            addCriterion("FILE_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andFILE_SIZEEqualTo(Long value) {
            addCriterion("FILE_SIZE =", value, "FILE_SIZE");
            return (Criteria) this;
        }

        public Criteria andFILE_SIZENotEqualTo(Long value) {
            addCriterion("FILE_SIZE <>", value, "FILE_SIZE");
            return (Criteria) this;
        }

        public Criteria andFILE_SIZEGreaterThan(Long value) {
            addCriterion("FILE_SIZE >", value, "FILE_SIZE");
            return (Criteria) this;
        }

        public Criteria andFILE_SIZEGreaterThanOrEqualTo(Long value) {
            addCriterion("FILE_SIZE >=", value, "FILE_SIZE");
            return (Criteria) this;
        }

        public Criteria andFILE_SIZELessThan(Long value) {
            addCriterion("FILE_SIZE <", value, "FILE_SIZE");
            return (Criteria) this;
        }

        public Criteria andFILE_SIZELessThanOrEqualTo(Long value) {
            addCriterion("FILE_SIZE <=", value, "FILE_SIZE");
            return (Criteria) this;
        }

        public Criteria andFILE_SIZEIn(List<Long> values) {
            addCriterion("FILE_SIZE in", values, "FILE_SIZE");
            return (Criteria) this;
        }

        public Criteria andFILE_SIZENotIn(List<Long> values) {
            addCriterion("FILE_SIZE not in", values, "FILE_SIZE");
            return (Criteria) this;
        }

        public Criteria andFILE_SIZEBetween(Long value1, Long value2) {
            addCriterion("FILE_SIZE between", value1, value2, "FILE_SIZE");
            return (Criteria) this;
        }

        public Criteria andFILE_SIZENotBetween(Long value1, Long value2) {
            addCriterion("FILE_SIZE not between", value1, value2, "FILE_SIZE");
            return (Criteria) this;
        }

        public Criteria andALLOCATED_SIZEIsNull() {
            addCriterion("ALLOCATED_SIZE is null");
            return (Criteria) this;
        }

        public Criteria andALLOCATED_SIZEIsNotNull() {
            addCriterion("ALLOCATED_SIZE is not null");
            return (Criteria) this;
        }

        public Criteria andALLOCATED_SIZEEqualTo(Long value) {
            addCriterion("ALLOCATED_SIZE =", value, "ALLOCATED_SIZE");
            return (Criteria) this;
        }

        public Criteria andALLOCATED_SIZENotEqualTo(Long value) {
            addCriterion("ALLOCATED_SIZE <>", value, "ALLOCATED_SIZE");
            return (Criteria) this;
        }

        public Criteria andALLOCATED_SIZEGreaterThan(Long value) {
            addCriterion("ALLOCATED_SIZE >", value, "ALLOCATED_SIZE");
            return (Criteria) this;
        }

        public Criteria andALLOCATED_SIZEGreaterThanOrEqualTo(Long value) {
            addCriterion("ALLOCATED_SIZE >=", value, "ALLOCATED_SIZE");
            return (Criteria) this;
        }

        public Criteria andALLOCATED_SIZELessThan(Long value) {
            addCriterion("ALLOCATED_SIZE <", value, "ALLOCATED_SIZE");
            return (Criteria) this;
        }

        public Criteria andALLOCATED_SIZELessThanOrEqualTo(Long value) {
            addCriterion("ALLOCATED_SIZE <=", value, "ALLOCATED_SIZE");
            return (Criteria) this;
        }

        public Criteria andALLOCATED_SIZEIn(List<Long> values) {
            addCriterion("ALLOCATED_SIZE in", values, "ALLOCATED_SIZE");
            return (Criteria) this;
        }

        public Criteria andALLOCATED_SIZENotIn(List<Long> values) {
            addCriterion("ALLOCATED_SIZE not in", values, "ALLOCATED_SIZE");
            return (Criteria) this;
        }

        public Criteria andALLOCATED_SIZEBetween(Long value1, Long value2) {
            addCriterion("ALLOCATED_SIZE between", value1, value2, "ALLOCATED_SIZE");
            return (Criteria) this;
        }

        public Criteria andALLOCATED_SIZENotBetween(Long value1, Long value2) {
            addCriterion("ALLOCATED_SIZE not between", value1, value2, "ALLOCATED_SIZE");
            return (Criteria) this;
        }

        public Criteria andSERVER_VERSIONIsNull() {
            addCriterion("SERVER_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andSERVER_VERSIONIsNotNull() {
            addCriterion("SERVER_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andSERVER_VERSIONEqualTo(String value) {
            addCriterion("SERVER_VERSION =", value, "SERVER_VERSION");
            return (Criteria) this;
        }

        public Criteria andSERVER_VERSIONNotEqualTo(String value) {
            addCriterion("SERVER_VERSION <>", value, "SERVER_VERSION");
            return (Criteria) this;
        }

        public Criteria andSERVER_VERSIONGreaterThan(String value) {
            addCriterion("SERVER_VERSION >", value, "SERVER_VERSION");
            return (Criteria) this;
        }

        public Criteria andSERVER_VERSIONGreaterThanOrEqualTo(String value) {
            addCriterion("SERVER_VERSION >=", value, "SERVER_VERSION");
            return (Criteria) this;
        }

        public Criteria andSERVER_VERSIONLessThan(String value) {
            addCriterion("SERVER_VERSION <", value, "SERVER_VERSION");
            return (Criteria) this;
        }

        public Criteria andSERVER_VERSIONLessThanOrEqualTo(String value) {
            addCriterion("SERVER_VERSION <=", value, "SERVER_VERSION");
            return (Criteria) this;
        }

        public Criteria andSERVER_VERSIONLike(String value) {
            addCriterion("SERVER_VERSION like", value, "SERVER_VERSION");
            return (Criteria) this;
        }

        public Criteria andSERVER_VERSIONNotLike(String value) {
            addCriterion("SERVER_VERSION not like", value, "SERVER_VERSION");
            return (Criteria) this;
        }

        public Criteria andSERVER_VERSIONIn(List<String> values) {
            addCriterion("SERVER_VERSION in", values, "SERVER_VERSION");
            return (Criteria) this;
        }

        public Criteria andSERVER_VERSIONNotIn(List<String> values) {
            addCriterion("SERVER_VERSION not in", values, "SERVER_VERSION");
            return (Criteria) this;
        }

        public Criteria andSERVER_VERSIONBetween(String value1, String value2) {
            addCriterion("SERVER_VERSION between", value1, value2, "SERVER_VERSION");
            return (Criteria) this;
        }

        public Criteria andSERVER_VERSIONNotBetween(String value1, String value2) {
            addCriterion("SERVER_VERSION not between", value1, value2, "SERVER_VERSION");
            return (Criteria) this;
        }

        public Criteria andSPACE_VERSIONIsNull() {
            addCriterion("SPACE_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andSPACE_VERSIONIsNotNull() {
            addCriterion("SPACE_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andSPACE_VERSIONEqualTo(Integer value) {
            addCriterion("SPACE_VERSION =", value, "SPACE_VERSION");
            return (Criteria) this;
        }

        public Criteria andSPACE_VERSIONNotEqualTo(Integer value) {
            addCriterion("SPACE_VERSION <>", value, "SPACE_VERSION");
            return (Criteria) this;
        }

        public Criteria andSPACE_VERSIONGreaterThan(Integer value) {
            addCriterion("SPACE_VERSION >", value, "SPACE_VERSION");
            return (Criteria) this;
        }

        public Criteria andSPACE_VERSIONGreaterThanOrEqualTo(Integer value) {
            addCriterion("SPACE_VERSION >=", value, "SPACE_VERSION");
            return (Criteria) this;
        }

        public Criteria andSPACE_VERSIONLessThan(Integer value) {
            addCriterion("SPACE_VERSION <", value, "SPACE_VERSION");
            return (Criteria) this;
        }

        public Criteria andSPACE_VERSIONLessThanOrEqualTo(Integer value) {
            addCriterion("SPACE_VERSION <=", value, "SPACE_VERSION");
            return (Criteria) this;
        }

        public Criteria andSPACE_VERSIONIn(List<Integer> values) {
            addCriterion("SPACE_VERSION in", values, "SPACE_VERSION");
            return (Criteria) this;
        }

        public Criteria andSPACE_VERSIONNotIn(List<Integer> values) {
            addCriterion("SPACE_VERSION not in", values, "SPACE_VERSION");
            return (Criteria) this;
        }

        public Criteria andSPACE_VERSIONBetween(Integer value1, Integer value2) {
            addCriterion("SPACE_VERSION between", value1, value2, "SPACE_VERSION");
            return (Criteria) this;
        }

        public Criteria andSPACE_VERSIONNotBetween(Integer value1, Integer value2) {
            addCriterion("SPACE_VERSION not between", value1, value2, "SPACE_VERSION");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table INNODB_TABLESPACES
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
     * This class corresponds to the database table INNODB_TABLESPACES
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