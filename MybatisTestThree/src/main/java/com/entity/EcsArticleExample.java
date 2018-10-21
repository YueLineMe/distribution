package com.entity;

import java.util.ArrayList;
import java.util.List;

public class EcsArticleExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_article
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_article
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_article
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_article
     *
     * @mbg.generated
     */
    public EcsArticleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_article
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_article
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_article
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_article
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_article
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_article
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_article
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
     * This method corresponds to the database table ecs_article
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
     * This method corresponds to the database table ecs_article
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_article
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
     * This class corresponds to the database table ecs_article
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

        public Criteria andArticle_idIsNull() {
            addCriterion("article_id is null");
            return (Criteria) this;
        }

        public Criteria andArticle_idIsNotNull() {
            addCriterion("article_id is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_idEqualTo(Integer value) {
            addCriterion("article_id =", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idNotEqualTo(Integer value) {
            addCriterion("article_id <>", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idGreaterThan(Integer value) {
            addCriterion("article_id >", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("article_id >=", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idLessThan(Integer value) {
            addCriterion("article_id <", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idLessThanOrEqualTo(Integer value) {
            addCriterion("article_id <=", value, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idIn(List<Integer> values) {
            addCriterion("article_id in", values, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idNotIn(List<Integer> values) {
            addCriterion("article_id not in", values, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idBetween(Integer value1, Integer value2) {
            addCriterion("article_id between", value1, value2, "article_id");
            return (Criteria) this;
        }

        public Criteria andArticle_idNotBetween(Integer value1, Integer value2) {
            addCriterion("article_id not between", value1, value2, "article_id");
            return (Criteria) this;
        }

        public Criteria andCat_idIsNull() {
            addCriterion("cat_id is null");
            return (Criteria) this;
        }

        public Criteria andCat_idIsNotNull() {
            addCriterion("cat_id is not null");
            return (Criteria) this;
        }

        public Criteria andCat_idEqualTo(Short value) {
            addCriterion("cat_id =", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idNotEqualTo(Short value) {
            addCriterion("cat_id <>", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idGreaterThan(Short value) {
            addCriterion("cat_id >", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idGreaterThanOrEqualTo(Short value) {
            addCriterion("cat_id >=", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idLessThan(Short value) {
            addCriterion("cat_id <", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idLessThanOrEqualTo(Short value) {
            addCriterion("cat_id <=", value, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idIn(List<Short> values) {
            addCriterion("cat_id in", values, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idNotIn(List<Short> values) {
            addCriterion("cat_id not in", values, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idBetween(Short value1, Short value2) {
            addCriterion("cat_id between", value1, value2, "cat_id");
            return (Criteria) this;
        }

        public Criteria andCat_idNotBetween(Short value1, Short value2) {
            addCriterion("cat_id not between", value1, value2, "cat_id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthor_emailIsNull() {
            addCriterion("author_email is null");
            return (Criteria) this;
        }

        public Criteria andAuthor_emailIsNotNull() {
            addCriterion("author_email is not null");
            return (Criteria) this;
        }

        public Criteria andAuthor_emailEqualTo(String value) {
            addCriterion("author_email =", value, "author_email");
            return (Criteria) this;
        }

        public Criteria andAuthor_emailNotEqualTo(String value) {
            addCriterion("author_email <>", value, "author_email");
            return (Criteria) this;
        }

        public Criteria andAuthor_emailGreaterThan(String value) {
            addCriterion("author_email >", value, "author_email");
            return (Criteria) this;
        }

        public Criteria andAuthor_emailGreaterThanOrEqualTo(String value) {
            addCriterion("author_email >=", value, "author_email");
            return (Criteria) this;
        }

        public Criteria andAuthor_emailLessThan(String value) {
            addCriterion("author_email <", value, "author_email");
            return (Criteria) this;
        }

        public Criteria andAuthor_emailLessThanOrEqualTo(String value) {
            addCriterion("author_email <=", value, "author_email");
            return (Criteria) this;
        }

        public Criteria andAuthor_emailLike(String value) {
            addCriterion("author_email like", value, "author_email");
            return (Criteria) this;
        }

        public Criteria andAuthor_emailNotLike(String value) {
            addCriterion("author_email not like", value, "author_email");
            return (Criteria) this;
        }

        public Criteria andAuthor_emailIn(List<String> values) {
            addCriterion("author_email in", values, "author_email");
            return (Criteria) this;
        }

        public Criteria andAuthor_emailNotIn(List<String> values) {
            addCriterion("author_email not in", values, "author_email");
            return (Criteria) this;
        }

        public Criteria andAuthor_emailBetween(String value1, String value2) {
            addCriterion("author_email between", value1, value2, "author_email");
            return (Criteria) this;
        }

        public Criteria andAuthor_emailNotBetween(String value1, String value2) {
            addCriterion("author_email not between", value1, value2, "author_email");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andArticle_typeIsNull() {
            addCriterion("article_type is null");
            return (Criteria) this;
        }

        public Criteria andArticle_typeIsNotNull() {
            addCriterion("article_type is not null");
            return (Criteria) this;
        }

        public Criteria andArticle_typeEqualTo(Boolean value) {
            addCriterion("article_type =", value, "article_type");
            return (Criteria) this;
        }

        public Criteria andArticle_typeNotEqualTo(Boolean value) {
            addCriterion("article_type <>", value, "article_type");
            return (Criteria) this;
        }

        public Criteria andArticle_typeGreaterThan(Boolean value) {
            addCriterion("article_type >", value, "article_type");
            return (Criteria) this;
        }

        public Criteria andArticle_typeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("article_type >=", value, "article_type");
            return (Criteria) this;
        }

        public Criteria andArticle_typeLessThan(Boolean value) {
            addCriterion("article_type <", value, "article_type");
            return (Criteria) this;
        }

        public Criteria andArticle_typeLessThanOrEqualTo(Boolean value) {
            addCriterion("article_type <=", value, "article_type");
            return (Criteria) this;
        }

        public Criteria andArticle_typeIn(List<Boolean> values) {
            addCriterion("article_type in", values, "article_type");
            return (Criteria) this;
        }

        public Criteria andArticle_typeNotIn(List<Boolean> values) {
            addCriterion("article_type not in", values, "article_type");
            return (Criteria) this;
        }

        public Criteria andArticle_typeBetween(Boolean value1, Boolean value2) {
            addCriterion("article_type between", value1, value2, "article_type");
            return (Criteria) this;
        }

        public Criteria andArticle_typeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("article_type not between", value1, value2, "article_type");
            return (Criteria) this;
        }

        public Criteria andIs_openIsNull() {
            addCriterion("is_open is null");
            return (Criteria) this;
        }

        public Criteria andIs_openIsNotNull() {
            addCriterion("is_open is not null");
            return (Criteria) this;
        }

        public Criteria andIs_openEqualTo(Boolean value) {
            addCriterion("is_open =", value, "is_open");
            return (Criteria) this;
        }

        public Criteria andIs_openNotEqualTo(Boolean value) {
            addCriterion("is_open <>", value, "is_open");
            return (Criteria) this;
        }

        public Criteria andIs_openGreaterThan(Boolean value) {
            addCriterion("is_open >", value, "is_open");
            return (Criteria) this;
        }

        public Criteria andIs_openGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_open >=", value, "is_open");
            return (Criteria) this;
        }

        public Criteria andIs_openLessThan(Boolean value) {
            addCriterion("is_open <", value, "is_open");
            return (Criteria) this;
        }

        public Criteria andIs_openLessThanOrEqualTo(Boolean value) {
            addCriterion("is_open <=", value, "is_open");
            return (Criteria) this;
        }

        public Criteria andIs_openIn(List<Boolean> values) {
            addCriterion("is_open in", values, "is_open");
            return (Criteria) this;
        }

        public Criteria andIs_openNotIn(List<Boolean> values) {
            addCriterion("is_open not in", values, "is_open");
            return (Criteria) this;
        }

        public Criteria andIs_openBetween(Boolean value1, Boolean value2) {
            addCriterion("is_open between", value1, value2, "is_open");
            return (Criteria) this;
        }

        public Criteria andIs_openNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_open not between", value1, value2, "is_open");
            return (Criteria) this;
        }

        public Criteria andAdd_timeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAdd_timeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdd_timeEqualTo(Integer value) {
            addCriterion("add_time =", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeLessThan(Integer value) {
            addCriterion("add_time <", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeIn(List<Integer> values) {
            addCriterion("add_time in", values, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "add_time");
            return (Criteria) this;
        }

        public Criteria andAdd_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "add_time");
            return (Criteria) this;
        }

        public Criteria andFile_urlIsNull() {
            addCriterion("file_url is null");
            return (Criteria) this;
        }

        public Criteria andFile_urlIsNotNull() {
            addCriterion("file_url is not null");
            return (Criteria) this;
        }

        public Criteria andFile_urlEqualTo(String value) {
            addCriterion("file_url =", value, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlNotEqualTo(String value) {
            addCriterion("file_url <>", value, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlGreaterThan(String value) {
            addCriterion("file_url >", value, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlGreaterThanOrEqualTo(String value) {
            addCriterion("file_url >=", value, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlLessThan(String value) {
            addCriterion("file_url <", value, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlLessThanOrEqualTo(String value) {
            addCriterion("file_url <=", value, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlLike(String value) {
            addCriterion("file_url like", value, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlNotLike(String value) {
            addCriterion("file_url not like", value, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlIn(List<String> values) {
            addCriterion("file_url in", values, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlNotIn(List<String> values) {
            addCriterion("file_url not in", values, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlBetween(String value1, String value2) {
            addCriterion("file_url between", value1, value2, "file_url");
            return (Criteria) this;
        }

        public Criteria andFile_urlNotBetween(String value1, String value2) {
            addCriterion("file_url not between", value1, value2, "file_url");
            return (Criteria) this;
        }

        public Criteria andOpen_typeIsNull() {
            addCriterion("open_type is null");
            return (Criteria) this;
        }

        public Criteria andOpen_typeIsNotNull() {
            addCriterion("open_type is not null");
            return (Criteria) this;
        }

        public Criteria andOpen_typeEqualTo(Boolean value) {
            addCriterion("open_type =", value, "open_type");
            return (Criteria) this;
        }

        public Criteria andOpen_typeNotEqualTo(Boolean value) {
            addCriterion("open_type <>", value, "open_type");
            return (Criteria) this;
        }

        public Criteria andOpen_typeGreaterThan(Boolean value) {
            addCriterion("open_type >", value, "open_type");
            return (Criteria) this;
        }

        public Criteria andOpen_typeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("open_type >=", value, "open_type");
            return (Criteria) this;
        }

        public Criteria andOpen_typeLessThan(Boolean value) {
            addCriterion("open_type <", value, "open_type");
            return (Criteria) this;
        }

        public Criteria andOpen_typeLessThanOrEqualTo(Boolean value) {
            addCriterion("open_type <=", value, "open_type");
            return (Criteria) this;
        }

        public Criteria andOpen_typeIn(List<Boolean> values) {
            addCriterion("open_type in", values, "open_type");
            return (Criteria) this;
        }

        public Criteria andOpen_typeNotIn(List<Boolean> values) {
            addCriterion("open_type not in", values, "open_type");
            return (Criteria) this;
        }

        public Criteria andOpen_typeBetween(Boolean value1, Boolean value2) {
            addCriterion("open_type between", value1, value2, "open_type");
            return (Criteria) this;
        }

        public Criteria andOpen_typeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("open_type not between", value1, value2, "open_type");
            return (Criteria) this;
        }

        public Criteria andLinkIsNull() {
            addCriterion("link is null");
            return (Criteria) this;
        }

        public Criteria andLinkIsNotNull() {
            addCriterion("link is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEqualTo(String value) {
            addCriterion("link =", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotEqualTo(String value) {
            addCriterion("link <>", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThan(String value) {
            addCriterion("link >", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThanOrEqualTo(String value) {
            addCriterion("link >=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThan(String value) {
            addCriterion("link <", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThanOrEqualTo(String value) {
            addCriterion("link <=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLike(String value) {
            addCriterion("link like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotLike(String value) {
            addCriterion("link not like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkIn(List<String> values) {
            addCriterion("link in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotIn(List<String> values) {
            addCriterion("link not in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkBetween(String value1, String value2) {
            addCriterion("link between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotBetween(String value1, String value2) {
            addCriterion("link not between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_article
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
     * This class corresponds to the database table ecs_article
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