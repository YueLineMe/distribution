package com.entity;

import java.util.ArrayList;
import java.util.List;

public class EcsStatsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_stats
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_stats
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ecs_stats
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_stats
     *
     * @mbg.generated
     */
    public EcsStatsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_stats
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_stats
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_stats
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_stats
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_stats
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_stats
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_stats
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
     * This method corresponds to the database table ecs_stats
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
     * This method corresponds to the database table ecs_stats
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_stats
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
     * This class corresponds to the database table ecs_stats
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

        public Criteria andAccess_timeIsNull() {
            addCriterion("access_time is null");
            return (Criteria) this;
        }

        public Criteria andAccess_timeIsNotNull() {
            addCriterion("access_time is not null");
            return (Criteria) this;
        }

        public Criteria andAccess_timeEqualTo(Integer value) {
            addCriterion("access_time =", value, "access_time");
            return (Criteria) this;
        }

        public Criteria andAccess_timeNotEqualTo(Integer value) {
            addCriterion("access_time <>", value, "access_time");
            return (Criteria) this;
        }

        public Criteria andAccess_timeGreaterThan(Integer value) {
            addCriterion("access_time >", value, "access_time");
            return (Criteria) this;
        }

        public Criteria andAccess_timeGreaterThanOrEqualTo(Integer value) {
            addCriterion("access_time >=", value, "access_time");
            return (Criteria) this;
        }

        public Criteria andAccess_timeLessThan(Integer value) {
            addCriterion("access_time <", value, "access_time");
            return (Criteria) this;
        }

        public Criteria andAccess_timeLessThanOrEqualTo(Integer value) {
            addCriterion("access_time <=", value, "access_time");
            return (Criteria) this;
        }

        public Criteria andAccess_timeIn(List<Integer> values) {
            addCriterion("access_time in", values, "access_time");
            return (Criteria) this;
        }

        public Criteria andAccess_timeNotIn(List<Integer> values) {
            addCriterion("access_time not in", values, "access_time");
            return (Criteria) this;
        }

        public Criteria andAccess_timeBetween(Integer value1, Integer value2) {
            addCriterion("access_time between", value1, value2, "access_time");
            return (Criteria) this;
        }

        public Criteria andAccess_timeNotBetween(Integer value1, Integer value2) {
            addCriterion("access_time not between", value1, value2, "access_time");
            return (Criteria) this;
        }

        public Criteria andIp_addressIsNull() {
            addCriterion("ip_address is null");
            return (Criteria) this;
        }

        public Criteria andIp_addressIsNotNull() {
            addCriterion("ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andIp_addressEqualTo(String value) {
            addCriterion("ip_address =", value, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressNotEqualTo(String value) {
            addCriterion("ip_address <>", value, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressGreaterThan(String value) {
            addCriterion("ip_address >", value, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressGreaterThanOrEqualTo(String value) {
            addCriterion("ip_address >=", value, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressLessThan(String value) {
            addCriterion("ip_address <", value, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressLessThanOrEqualTo(String value) {
            addCriterion("ip_address <=", value, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressLike(String value) {
            addCriterion("ip_address like", value, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressNotLike(String value) {
            addCriterion("ip_address not like", value, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressIn(List<String> values) {
            addCriterion("ip_address in", values, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressNotIn(List<String> values) {
            addCriterion("ip_address not in", values, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressBetween(String value1, String value2) {
            addCriterion("ip_address between", value1, value2, "ip_address");
            return (Criteria) this;
        }

        public Criteria andIp_addressNotBetween(String value1, String value2) {
            addCriterion("ip_address not between", value1, value2, "ip_address");
            return (Criteria) this;
        }

        public Criteria andVisit_timesIsNull() {
            addCriterion("visit_times is null");
            return (Criteria) this;
        }

        public Criteria andVisit_timesIsNotNull() {
            addCriterion("visit_times is not null");
            return (Criteria) this;
        }

        public Criteria andVisit_timesEqualTo(Short value) {
            addCriterion("visit_times =", value, "visit_times");
            return (Criteria) this;
        }

        public Criteria andVisit_timesNotEqualTo(Short value) {
            addCriterion("visit_times <>", value, "visit_times");
            return (Criteria) this;
        }

        public Criteria andVisit_timesGreaterThan(Short value) {
            addCriterion("visit_times >", value, "visit_times");
            return (Criteria) this;
        }

        public Criteria andVisit_timesGreaterThanOrEqualTo(Short value) {
            addCriterion("visit_times >=", value, "visit_times");
            return (Criteria) this;
        }

        public Criteria andVisit_timesLessThan(Short value) {
            addCriterion("visit_times <", value, "visit_times");
            return (Criteria) this;
        }

        public Criteria andVisit_timesLessThanOrEqualTo(Short value) {
            addCriterion("visit_times <=", value, "visit_times");
            return (Criteria) this;
        }

        public Criteria andVisit_timesIn(List<Short> values) {
            addCriterion("visit_times in", values, "visit_times");
            return (Criteria) this;
        }

        public Criteria andVisit_timesNotIn(List<Short> values) {
            addCriterion("visit_times not in", values, "visit_times");
            return (Criteria) this;
        }

        public Criteria andVisit_timesBetween(Short value1, Short value2) {
            addCriterion("visit_times between", value1, value2, "visit_times");
            return (Criteria) this;
        }

        public Criteria andVisit_timesNotBetween(Short value1, Short value2) {
            addCriterion("visit_times not between", value1, value2, "visit_times");
            return (Criteria) this;
        }

        public Criteria andBrowserIsNull() {
            addCriterion("browser is null");
            return (Criteria) this;
        }

        public Criteria andBrowserIsNotNull() {
            addCriterion("browser is not null");
            return (Criteria) this;
        }

        public Criteria andBrowserEqualTo(String value) {
            addCriterion("browser =", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotEqualTo(String value) {
            addCriterion("browser <>", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThan(String value) {
            addCriterion("browser >", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserGreaterThanOrEqualTo(String value) {
            addCriterion("browser >=", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLessThan(String value) {
            addCriterion("browser <", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLessThanOrEqualTo(String value) {
            addCriterion("browser <=", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserLike(String value) {
            addCriterion("browser like", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotLike(String value) {
            addCriterion("browser not like", value, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserIn(List<String> values) {
            addCriterion("browser in", values, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotIn(List<String> values) {
            addCriterion("browser not in", values, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserBetween(String value1, String value2) {
            addCriterion("browser between", value1, value2, "browser");
            return (Criteria) this;
        }

        public Criteria andBrowserNotBetween(String value1, String value2) {
            addCriterion("browser not between", value1, value2, "browser");
            return (Criteria) this;
        }

        public Criteria andSystemIsNull() {
            addCriterion("system is null");
            return (Criteria) this;
        }

        public Criteria andSystemIsNotNull() {
            addCriterion("system is not null");
            return (Criteria) this;
        }

        public Criteria andSystemEqualTo(String value) {
            addCriterion("system =", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotEqualTo(String value) {
            addCriterion("system <>", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemGreaterThan(String value) {
            addCriterion("system >", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemGreaterThanOrEqualTo(String value) {
            addCriterion("system >=", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLessThan(String value) {
            addCriterion("system <", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLessThanOrEqualTo(String value) {
            addCriterion("system <=", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLike(String value) {
            addCriterion("system like", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotLike(String value) {
            addCriterion("system not like", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemIn(List<String> values) {
            addCriterion("system in", values, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotIn(List<String> values) {
            addCriterion("system not in", values, "system");
            return (Criteria) this;
        }

        public Criteria andSystemBetween(String value1, String value2) {
            addCriterion("system between", value1, value2, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotBetween(String value1, String value2) {
            addCriterion("system not between", value1, value2, "system");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andReferer_domainIsNull() {
            addCriterion("referer_domain is null");
            return (Criteria) this;
        }

        public Criteria andReferer_domainIsNotNull() {
            addCriterion("referer_domain is not null");
            return (Criteria) this;
        }

        public Criteria andReferer_domainEqualTo(String value) {
            addCriterion("referer_domain =", value, "referer_domain");
            return (Criteria) this;
        }

        public Criteria andReferer_domainNotEqualTo(String value) {
            addCriterion("referer_domain <>", value, "referer_domain");
            return (Criteria) this;
        }

        public Criteria andReferer_domainGreaterThan(String value) {
            addCriterion("referer_domain >", value, "referer_domain");
            return (Criteria) this;
        }

        public Criteria andReferer_domainGreaterThanOrEqualTo(String value) {
            addCriterion("referer_domain >=", value, "referer_domain");
            return (Criteria) this;
        }

        public Criteria andReferer_domainLessThan(String value) {
            addCriterion("referer_domain <", value, "referer_domain");
            return (Criteria) this;
        }

        public Criteria andReferer_domainLessThanOrEqualTo(String value) {
            addCriterion("referer_domain <=", value, "referer_domain");
            return (Criteria) this;
        }

        public Criteria andReferer_domainLike(String value) {
            addCriterion("referer_domain like", value, "referer_domain");
            return (Criteria) this;
        }

        public Criteria andReferer_domainNotLike(String value) {
            addCriterion("referer_domain not like", value, "referer_domain");
            return (Criteria) this;
        }

        public Criteria andReferer_domainIn(List<String> values) {
            addCriterion("referer_domain in", values, "referer_domain");
            return (Criteria) this;
        }

        public Criteria andReferer_domainNotIn(List<String> values) {
            addCriterion("referer_domain not in", values, "referer_domain");
            return (Criteria) this;
        }

        public Criteria andReferer_domainBetween(String value1, String value2) {
            addCriterion("referer_domain between", value1, value2, "referer_domain");
            return (Criteria) this;
        }

        public Criteria andReferer_domainNotBetween(String value1, String value2) {
            addCriterion("referer_domain not between", value1, value2, "referer_domain");
            return (Criteria) this;
        }

        public Criteria andReferer_pathIsNull() {
            addCriterion("referer_path is null");
            return (Criteria) this;
        }

        public Criteria andReferer_pathIsNotNull() {
            addCriterion("referer_path is not null");
            return (Criteria) this;
        }

        public Criteria andReferer_pathEqualTo(String value) {
            addCriterion("referer_path =", value, "referer_path");
            return (Criteria) this;
        }

        public Criteria andReferer_pathNotEqualTo(String value) {
            addCriterion("referer_path <>", value, "referer_path");
            return (Criteria) this;
        }

        public Criteria andReferer_pathGreaterThan(String value) {
            addCriterion("referer_path >", value, "referer_path");
            return (Criteria) this;
        }

        public Criteria andReferer_pathGreaterThanOrEqualTo(String value) {
            addCriterion("referer_path >=", value, "referer_path");
            return (Criteria) this;
        }

        public Criteria andReferer_pathLessThan(String value) {
            addCriterion("referer_path <", value, "referer_path");
            return (Criteria) this;
        }

        public Criteria andReferer_pathLessThanOrEqualTo(String value) {
            addCriterion("referer_path <=", value, "referer_path");
            return (Criteria) this;
        }

        public Criteria andReferer_pathLike(String value) {
            addCriterion("referer_path like", value, "referer_path");
            return (Criteria) this;
        }

        public Criteria andReferer_pathNotLike(String value) {
            addCriterion("referer_path not like", value, "referer_path");
            return (Criteria) this;
        }

        public Criteria andReferer_pathIn(List<String> values) {
            addCriterion("referer_path in", values, "referer_path");
            return (Criteria) this;
        }

        public Criteria andReferer_pathNotIn(List<String> values) {
            addCriterion("referer_path not in", values, "referer_path");
            return (Criteria) this;
        }

        public Criteria andReferer_pathBetween(String value1, String value2) {
            addCriterion("referer_path between", value1, value2, "referer_path");
            return (Criteria) this;
        }

        public Criteria andReferer_pathNotBetween(String value1, String value2) {
            addCriterion("referer_path not between", value1, value2, "referer_path");
            return (Criteria) this;
        }

        public Criteria andAccess_urlIsNull() {
            addCriterion("access_url is null");
            return (Criteria) this;
        }

        public Criteria andAccess_urlIsNotNull() {
            addCriterion("access_url is not null");
            return (Criteria) this;
        }

        public Criteria andAccess_urlEqualTo(String value) {
            addCriterion("access_url =", value, "access_url");
            return (Criteria) this;
        }

        public Criteria andAccess_urlNotEqualTo(String value) {
            addCriterion("access_url <>", value, "access_url");
            return (Criteria) this;
        }

        public Criteria andAccess_urlGreaterThan(String value) {
            addCriterion("access_url >", value, "access_url");
            return (Criteria) this;
        }

        public Criteria andAccess_urlGreaterThanOrEqualTo(String value) {
            addCriterion("access_url >=", value, "access_url");
            return (Criteria) this;
        }

        public Criteria andAccess_urlLessThan(String value) {
            addCriterion("access_url <", value, "access_url");
            return (Criteria) this;
        }

        public Criteria andAccess_urlLessThanOrEqualTo(String value) {
            addCriterion("access_url <=", value, "access_url");
            return (Criteria) this;
        }

        public Criteria andAccess_urlLike(String value) {
            addCriterion("access_url like", value, "access_url");
            return (Criteria) this;
        }

        public Criteria andAccess_urlNotLike(String value) {
            addCriterion("access_url not like", value, "access_url");
            return (Criteria) this;
        }

        public Criteria andAccess_urlIn(List<String> values) {
            addCriterion("access_url in", values, "access_url");
            return (Criteria) this;
        }

        public Criteria andAccess_urlNotIn(List<String> values) {
            addCriterion("access_url not in", values, "access_url");
            return (Criteria) this;
        }

        public Criteria andAccess_urlBetween(String value1, String value2) {
            addCriterion("access_url between", value1, value2, "access_url");
            return (Criteria) this;
        }

        public Criteria andAccess_urlNotBetween(String value1, String value2) {
            addCriterion("access_url not between", value1, value2, "access_url");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ecs_stats
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
     * This class corresponds to the database table ecs_stats
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