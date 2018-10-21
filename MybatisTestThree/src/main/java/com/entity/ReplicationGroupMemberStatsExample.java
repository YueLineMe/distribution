package com.entity;

import java.util.ArrayList;
import java.util.List;

public class ReplicationGroupMemberStatsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table replication_group_member_stats
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table replication_group_member_stats
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table replication_group_member_stats
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_group_member_stats
     *
     * @mbg.generated
     */
    public ReplicationGroupMemberStatsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_group_member_stats
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_group_member_stats
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_group_member_stats
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_group_member_stats
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_group_member_stats
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_group_member_stats
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_group_member_stats
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
     * This method corresponds to the database table replication_group_member_stats
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
     * This method corresponds to the database table replication_group_member_stats
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_group_member_stats
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
     * This class corresponds to the database table replication_group_member_stats
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

        public Criteria andCHANNEL_NAMEIsNull() {
            addCriterion("CHANNEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMEIsNotNull() {
            addCriterion("CHANNEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMEEqualTo(String value) {
            addCriterion("CHANNEL_NAME =", value, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMENotEqualTo(String value) {
            addCriterion("CHANNEL_NAME <>", value, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMEGreaterThan(String value) {
            addCriterion("CHANNEL_NAME >", value, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMEGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_NAME >=", value, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMELessThan(String value) {
            addCriterion("CHANNEL_NAME <", value, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMELessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_NAME <=", value, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMELike(String value) {
            addCriterion("CHANNEL_NAME like", value, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMENotLike(String value) {
            addCriterion("CHANNEL_NAME not like", value, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMEIn(List<String> values) {
            addCriterion("CHANNEL_NAME in", values, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMENotIn(List<String> values) {
            addCriterion("CHANNEL_NAME not in", values, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMEBetween(String value1, String value2) {
            addCriterion("CHANNEL_NAME between", value1, value2, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andCHANNEL_NAMENotBetween(String value1, String value2) {
            addCriterion("CHANNEL_NAME not between", value1, value2, "CHANNEL_NAME");
            return (Criteria) this;
        }

        public Criteria andVIEW_IDIsNull() {
            addCriterion("VIEW_ID is null");
            return (Criteria) this;
        }

        public Criteria andVIEW_IDIsNotNull() {
            addCriterion("VIEW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVIEW_IDEqualTo(String value) {
            addCriterion("VIEW_ID =", value, "VIEW_ID");
            return (Criteria) this;
        }

        public Criteria andVIEW_IDNotEqualTo(String value) {
            addCriterion("VIEW_ID <>", value, "VIEW_ID");
            return (Criteria) this;
        }

        public Criteria andVIEW_IDGreaterThan(String value) {
            addCriterion("VIEW_ID >", value, "VIEW_ID");
            return (Criteria) this;
        }

        public Criteria andVIEW_IDGreaterThanOrEqualTo(String value) {
            addCriterion("VIEW_ID >=", value, "VIEW_ID");
            return (Criteria) this;
        }

        public Criteria andVIEW_IDLessThan(String value) {
            addCriterion("VIEW_ID <", value, "VIEW_ID");
            return (Criteria) this;
        }

        public Criteria andVIEW_IDLessThanOrEqualTo(String value) {
            addCriterion("VIEW_ID <=", value, "VIEW_ID");
            return (Criteria) this;
        }

        public Criteria andVIEW_IDLike(String value) {
            addCriterion("VIEW_ID like", value, "VIEW_ID");
            return (Criteria) this;
        }

        public Criteria andVIEW_IDNotLike(String value) {
            addCriterion("VIEW_ID not like", value, "VIEW_ID");
            return (Criteria) this;
        }

        public Criteria andVIEW_IDIn(List<String> values) {
            addCriterion("VIEW_ID in", values, "VIEW_ID");
            return (Criteria) this;
        }

        public Criteria andVIEW_IDNotIn(List<String> values) {
            addCriterion("VIEW_ID not in", values, "VIEW_ID");
            return (Criteria) this;
        }

        public Criteria andVIEW_IDBetween(String value1, String value2) {
            addCriterion("VIEW_ID between", value1, value2, "VIEW_ID");
            return (Criteria) this;
        }

        public Criteria andVIEW_IDNotBetween(String value1, String value2) {
            addCriterion("VIEW_ID not between", value1, value2, "VIEW_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDIsNull() {
            addCriterion("MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDIsNotNull() {
            addCriterion("MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDEqualTo(String value) {
            addCriterion("MEMBER_ID =", value, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDNotEqualTo(String value) {
            addCriterion("MEMBER_ID <>", value, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDGreaterThan(String value) {
            addCriterion("MEMBER_ID >", value, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDGreaterThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID >=", value, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDLessThan(String value) {
            addCriterion("MEMBER_ID <", value, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDLessThanOrEqualTo(String value) {
            addCriterion("MEMBER_ID <=", value, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDLike(String value) {
            addCriterion("MEMBER_ID like", value, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDNotLike(String value) {
            addCriterion("MEMBER_ID not like", value, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDIn(List<String> values) {
            addCriterion("MEMBER_ID in", values, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDNotIn(List<String> values) {
            addCriterion("MEMBER_ID not in", values, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDBetween(String value1, String value2) {
            addCriterion("MEMBER_ID between", value1, value2, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andMEMBER_IDNotBetween(String value1, String value2) {
            addCriterion("MEMBER_ID not between", value1, value2, "MEMBER_ID");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_IN_QUEUEIsNull() {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE is null");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_IN_QUEUEIsNotNull() {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE is not null");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_IN_QUEUEEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE =", value, "COUNT_TRANSACTIONS_IN_QUEUE");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_IN_QUEUENotEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE <>", value, "COUNT_TRANSACTIONS_IN_QUEUE");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_IN_QUEUEGreaterThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE >", value, "COUNT_TRANSACTIONS_IN_QUEUE");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_IN_QUEUEGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE >=", value, "COUNT_TRANSACTIONS_IN_QUEUE");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_IN_QUEUELessThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE <", value, "COUNT_TRANSACTIONS_IN_QUEUE");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_IN_QUEUELessThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE <=", value, "COUNT_TRANSACTIONS_IN_QUEUE");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_IN_QUEUEIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE in", values, "COUNT_TRANSACTIONS_IN_QUEUE");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_IN_QUEUENotIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE not in", values, "COUNT_TRANSACTIONS_IN_QUEUE");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_IN_QUEUEBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE between", value1, value2, "COUNT_TRANSACTIONS_IN_QUEUE");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_IN_QUEUENotBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_IN_QUEUE not between", value1, value2, "COUNT_TRANSACTIONS_IN_QUEUE");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_CHECKEDIsNull() {
            addCriterion("COUNT_TRANSACTIONS_CHECKED is null");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_CHECKEDIsNotNull() {
            addCriterion("COUNT_TRANSACTIONS_CHECKED is not null");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_CHECKEDEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_CHECKED =", value, "COUNT_TRANSACTIONS_CHECKED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_CHECKEDNotEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_CHECKED <>", value, "COUNT_TRANSACTIONS_CHECKED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_CHECKEDGreaterThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_CHECKED >", value, "COUNT_TRANSACTIONS_CHECKED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_CHECKEDGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_CHECKED >=", value, "COUNT_TRANSACTIONS_CHECKED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_CHECKEDLessThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_CHECKED <", value, "COUNT_TRANSACTIONS_CHECKED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_CHECKEDLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_CHECKED <=", value, "COUNT_TRANSACTIONS_CHECKED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_CHECKEDIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_CHECKED in", values, "COUNT_TRANSACTIONS_CHECKED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_CHECKEDNotIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_CHECKED not in", values, "COUNT_TRANSACTIONS_CHECKED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_CHECKEDBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_CHECKED between", value1, value2, "COUNT_TRANSACTIONS_CHECKED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_CHECKEDNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_CHECKED not between", value1, value2, "COUNT_TRANSACTIONS_CHECKED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_CONFLICTS_DETECTEDIsNull() {
            addCriterion("COUNT_CONFLICTS_DETECTED is null");
            return (Criteria) this;
        }

        public Criteria andCOUNT_CONFLICTS_DETECTEDIsNotNull() {
            addCriterion("COUNT_CONFLICTS_DETECTED is not null");
            return (Criteria) this;
        }

        public Criteria andCOUNT_CONFLICTS_DETECTEDEqualTo(Long value) {
            addCriterion("COUNT_CONFLICTS_DETECTED =", value, "COUNT_CONFLICTS_DETECTED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_CONFLICTS_DETECTEDNotEqualTo(Long value) {
            addCriterion("COUNT_CONFLICTS_DETECTED <>", value, "COUNT_CONFLICTS_DETECTED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_CONFLICTS_DETECTEDGreaterThan(Long value) {
            addCriterion("COUNT_CONFLICTS_DETECTED >", value, "COUNT_CONFLICTS_DETECTED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_CONFLICTS_DETECTEDGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_CONFLICTS_DETECTED >=", value, "COUNT_CONFLICTS_DETECTED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_CONFLICTS_DETECTEDLessThan(Long value) {
            addCriterion("COUNT_CONFLICTS_DETECTED <", value, "COUNT_CONFLICTS_DETECTED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_CONFLICTS_DETECTEDLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_CONFLICTS_DETECTED <=", value, "COUNT_CONFLICTS_DETECTED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_CONFLICTS_DETECTEDIn(List<Long> values) {
            addCriterion("COUNT_CONFLICTS_DETECTED in", values, "COUNT_CONFLICTS_DETECTED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_CONFLICTS_DETECTEDNotIn(List<Long> values) {
            addCriterion("COUNT_CONFLICTS_DETECTED not in", values, "COUNT_CONFLICTS_DETECTED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_CONFLICTS_DETECTEDBetween(Long value1, Long value2) {
            addCriterion("COUNT_CONFLICTS_DETECTED between", value1, value2, "COUNT_CONFLICTS_DETECTED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_CONFLICTS_DETECTEDNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_CONFLICTS_DETECTED not between", value1, value2, "COUNT_CONFLICTS_DETECTED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_ROWS_VALIDATINGIsNull() {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING is null");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_ROWS_VALIDATINGIsNotNull() {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING is not null");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_ROWS_VALIDATINGEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING =", value, "COUNT_TRANSACTIONS_ROWS_VALIDATING");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_ROWS_VALIDATINGNotEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING <>", value, "COUNT_TRANSACTIONS_ROWS_VALIDATING");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_ROWS_VALIDATINGGreaterThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING >", value, "COUNT_TRANSACTIONS_ROWS_VALIDATING");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_ROWS_VALIDATINGGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING >=", value, "COUNT_TRANSACTIONS_ROWS_VALIDATING");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_ROWS_VALIDATINGLessThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING <", value, "COUNT_TRANSACTIONS_ROWS_VALIDATING");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_ROWS_VALIDATINGLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING <=", value, "COUNT_TRANSACTIONS_ROWS_VALIDATING");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_ROWS_VALIDATINGIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING in", values, "COUNT_TRANSACTIONS_ROWS_VALIDATING");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_ROWS_VALIDATINGNotIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING not in", values, "COUNT_TRANSACTIONS_ROWS_VALIDATING");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_ROWS_VALIDATINGBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING between", value1, value2, "COUNT_TRANSACTIONS_ROWS_VALIDATING");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_ROWS_VALIDATINGNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_ROWS_VALIDATING not between", value1, value2, "COUNT_TRANSACTIONS_ROWS_VALIDATING");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUEIsNull() {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE is null");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUEIsNotNull() {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE is not null");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUEEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE =", value, "COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUENotEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE <>", value, "COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUEGreaterThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE >", value, "COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUEGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE >=", value, "COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUELessThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE <", value, "COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUELessThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE <=", value, "COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUEIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE in", values, "COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUENotIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE not in", values, "COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUEBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE between", value1, value2, "COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUENotBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE not between", value1, value2, "COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_APPLIEDIsNull() {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED is null");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_APPLIEDIsNotNull() {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED is not null");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_APPLIEDEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED =", value, "COUNT_TRANSACTIONS_REMOTE_APPLIED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_APPLIEDNotEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED <>", value, "COUNT_TRANSACTIONS_REMOTE_APPLIED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_APPLIEDGreaterThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED >", value, "COUNT_TRANSACTIONS_REMOTE_APPLIED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_APPLIEDGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED >=", value, "COUNT_TRANSACTIONS_REMOTE_APPLIED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_APPLIEDLessThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED <", value, "COUNT_TRANSACTIONS_REMOTE_APPLIED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_APPLIEDLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED <=", value, "COUNT_TRANSACTIONS_REMOTE_APPLIED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_APPLIEDIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED in", values, "COUNT_TRANSACTIONS_REMOTE_APPLIED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_APPLIEDNotIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED not in", values, "COUNT_TRANSACTIONS_REMOTE_APPLIED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_APPLIEDBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED between", value1, value2, "COUNT_TRANSACTIONS_REMOTE_APPLIED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_REMOTE_APPLIEDNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_REMOTE_APPLIED not between", value1, value2, "COUNT_TRANSACTIONS_REMOTE_APPLIED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_PROPOSEDIsNull() {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED is null");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_PROPOSEDIsNotNull() {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED is not null");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_PROPOSEDEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED =", value, "COUNT_TRANSACTIONS_LOCAL_PROPOSED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_PROPOSEDNotEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED <>", value, "COUNT_TRANSACTIONS_LOCAL_PROPOSED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_PROPOSEDGreaterThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED >", value, "COUNT_TRANSACTIONS_LOCAL_PROPOSED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_PROPOSEDGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED >=", value, "COUNT_TRANSACTIONS_LOCAL_PROPOSED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_PROPOSEDLessThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED <", value, "COUNT_TRANSACTIONS_LOCAL_PROPOSED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_PROPOSEDLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED <=", value, "COUNT_TRANSACTIONS_LOCAL_PROPOSED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_PROPOSEDIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED in", values, "COUNT_TRANSACTIONS_LOCAL_PROPOSED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_PROPOSEDNotIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED not in", values, "COUNT_TRANSACTIONS_LOCAL_PROPOSED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_PROPOSEDBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED between", value1, value2, "COUNT_TRANSACTIONS_LOCAL_PROPOSED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_PROPOSEDNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_PROPOSED not between", value1, value2, "COUNT_TRANSACTIONS_LOCAL_PROPOSED");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_ROLLBACKIsNull() {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK is null");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_ROLLBACKIsNotNull() {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK is not null");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_ROLLBACKEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK =", value, "COUNT_TRANSACTIONS_LOCAL_ROLLBACK");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_ROLLBACKNotEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK <>", value, "COUNT_TRANSACTIONS_LOCAL_ROLLBACK");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_ROLLBACKGreaterThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK >", value, "COUNT_TRANSACTIONS_LOCAL_ROLLBACK");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_ROLLBACKGreaterThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK >=", value, "COUNT_TRANSACTIONS_LOCAL_ROLLBACK");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_ROLLBACKLessThan(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK <", value, "COUNT_TRANSACTIONS_LOCAL_ROLLBACK");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_ROLLBACKLessThanOrEqualTo(Long value) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK <=", value, "COUNT_TRANSACTIONS_LOCAL_ROLLBACK");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_ROLLBACKIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK in", values, "COUNT_TRANSACTIONS_LOCAL_ROLLBACK");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_ROLLBACKNotIn(List<Long> values) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK not in", values, "COUNT_TRANSACTIONS_LOCAL_ROLLBACK");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_ROLLBACKBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK between", value1, value2, "COUNT_TRANSACTIONS_LOCAL_ROLLBACK");
            return (Criteria) this;
        }

        public Criteria andCOUNT_TRANSACTIONS_LOCAL_ROLLBACKNotBetween(Long value1, Long value2) {
            addCriterion("COUNT_TRANSACTIONS_LOCAL_ROLLBACK not between", value1, value2, "COUNT_TRANSACTIONS_LOCAL_ROLLBACK");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table replication_group_member_stats
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
     * This class corresponds to the database table replication_group_member_stats
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