package com.entity;

public class ReplicationGroupMemberStats {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.CHANNEL_NAME
     *
     * @mbg.generated
     */
    private String CHANNEL_NAME;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.VIEW_ID
     *
     * @mbg.generated
     */
    private String VIEW_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.MEMBER_ID
     *
     * @mbg.generated
     */
    private String MEMBER_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.COUNT_TRANSACTIONS_IN_QUEUE
     *
     * @mbg.generated
     */
    private Long COUNT_TRANSACTIONS_IN_QUEUE;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.COUNT_TRANSACTIONS_CHECKED
     *
     * @mbg.generated
     */
    private Long COUNT_TRANSACTIONS_CHECKED;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.COUNT_CONFLICTS_DETECTED
     *
     * @mbg.generated
     */
    private Long COUNT_CONFLICTS_DETECTED;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.COUNT_TRANSACTIONS_ROWS_VALIDATING
     *
     * @mbg.generated
     */
    private Long COUNT_TRANSACTIONS_ROWS_VALIDATING;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE
     *
     * @mbg.generated
     */
    private Long COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_APPLIED
     *
     * @mbg.generated
     */
    private Long COUNT_TRANSACTIONS_REMOTE_APPLIED;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_PROPOSED
     *
     * @mbg.generated
     */
    private Long COUNT_TRANSACTIONS_LOCAL_PROPOSED;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_ROLLBACK
     *
     * @mbg.generated
     */
    private Long COUNT_TRANSACTIONS_LOCAL_ROLLBACK;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.TRANSACTIONS_COMMITTED_ALL_MEMBERS
     *
     * @mbg.generated
     */
    private String TRANSACTIONS_COMMITTED_ALL_MEMBERS;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_group_member_stats.LAST_CONFLICT_FREE_TRANSACTION
     *
     * @mbg.generated
     */
    private String LAST_CONFLICT_FREE_TRANSACTION;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.CHANNEL_NAME
     *
     * @return the value of replication_group_member_stats.CHANNEL_NAME
     *
     * @mbg.generated
     */
    public String getCHANNEL_NAME() {
        return CHANNEL_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.CHANNEL_NAME
     *
     * @param CHANNEL_NAME the value for replication_group_member_stats.CHANNEL_NAME
     *
     * @mbg.generated
     */
    public void setCHANNEL_NAME(String CHANNEL_NAME) {
        this.CHANNEL_NAME = CHANNEL_NAME == null ? null : CHANNEL_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.VIEW_ID
     *
     * @return the value of replication_group_member_stats.VIEW_ID
     *
     * @mbg.generated
     */
    public String getVIEW_ID() {
        return VIEW_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.VIEW_ID
     *
     * @param VIEW_ID the value for replication_group_member_stats.VIEW_ID
     *
     * @mbg.generated
     */
    public void setVIEW_ID(String VIEW_ID) {
        this.VIEW_ID = VIEW_ID == null ? null : VIEW_ID.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.MEMBER_ID
     *
     * @return the value of replication_group_member_stats.MEMBER_ID
     *
     * @mbg.generated
     */
    public String getMEMBER_ID() {
        return MEMBER_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.MEMBER_ID
     *
     * @param MEMBER_ID the value for replication_group_member_stats.MEMBER_ID
     *
     * @mbg.generated
     */
    public void setMEMBER_ID(String MEMBER_ID) {
        this.MEMBER_ID = MEMBER_ID == null ? null : MEMBER_ID.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_IN_QUEUE
     *
     * @return the value of replication_group_member_stats.COUNT_TRANSACTIONS_IN_QUEUE
     *
     * @mbg.generated
     */
    public Long getCOUNT_TRANSACTIONS_IN_QUEUE() {
        return COUNT_TRANSACTIONS_IN_QUEUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_IN_QUEUE
     *
     * @param COUNT_TRANSACTIONS_IN_QUEUE the value for replication_group_member_stats.COUNT_TRANSACTIONS_IN_QUEUE
     *
     * @mbg.generated
     */
    public void setCOUNT_TRANSACTIONS_IN_QUEUE(Long COUNT_TRANSACTIONS_IN_QUEUE) {
        this.COUNT_TRANSACTIONS_IN_QUEUE = COUNT_TRANSACTIONS_IN_QUEUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_CHECKED
     *
     * @return the value of replication_group_member_stats.COUNT_TRANSACTIONS_CHECKED
     *
     * @mbg.generated
     */
    public Long getCOUNT_TRANSACTIONS_CHECKED() {
        return COUNT_TRANSACTIONS_CHECKED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_CHECKED
     *
     * @param COUNT_TRANSACTIONS_CHECKED the value for replication_group_member_stats.COUNT_TRANSACTIONS_CHECKED
     *
     * @mbg.generated
     */
    public void setCOUNT_TRANSACTIONS_CHECKED(Long COUNT_TRANSACTIONS_CHECKED) {
        this.COUNT_TRANSACTIONS_CHECKED = COUNT_TRANSACTIONS_CHECKED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.COUNT_CONFLICTS_DETECTED
     *
     * @return the value of replication_group_member_stats.COUNT_CONFLICTS_DETECTED
     *
     * @mbg.generated
     */
    public Long getCOUNT_CONFLICTS_DETECTED() {
        return COUNT_CONFLICTS_DETECTED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.COUNT_CONFLICTS_DETECTED
     *
     * @param COUNT_CONFLICTS_DETECTED the value for replication_group_member_stats.COUNT_CONFLICTS_DETECTED
     *
     * @mbg.generated
     */
    public void setCOUNT_CONFLICTS_DETECTED(Long COUNT_CONFLICTS_DETECTED) {
        this.COUNT_CONFLICTS_DETECTED = COUNT_CONFLICTS_DETECTED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_ROWS_VALIDATING
     *
     * @return the value of replication_group_member_stats.COUNT_TRANSACTIONS_ROWS_VALIDATING
     *
     * @mbg.generated
     */
    public Long getCOUNT_TRANSACTIONS_ROWS_VALIDATING() {
        return COUNT_TRANSACTIONS_ROWS_VALIDATING;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_ROWS_VALIDATING
     *
     * @param COUNT_TRANSACTIONS_ROWS_VALIDATING the value for replication_group_member_stats.COUNT_TRANSACTIONS_ROWS_VALIDATING
     *
     * @mbg.generated
     */
    public void setCOUNT_TRANSACTIONS_ROWS_VALIDATING(Long COUNT_TRANSACTIONS_ROWS_VALIDATING) {
        this.COUNT_TRANSACTIONS_ROWS_VALIDATING = COUNT_TRANSACTIONS_ROWS_VALIDATING;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE
     *
     * @return the value of replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE
     *
     * @mbg.generated
     */
    public Long getCOUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE() {
        return COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE
     *
     * @param COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE the value for replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE
     *
     * @mbg.generated
     */
    public void setCOUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE(Long COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE) {
        this.COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE = COUNT_TRANSACTIONS_REMOTE_IN_APPLIER_QUEUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_APPLIED
     *
     * @return the value of replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_APPLIED
     *
     * @mbg.generated
     */
    public Long getCOUNT_TRANSACTIONS_REMOTE_APPLIED() {
        return COUNT_TRANSACTIONS_REMOTE_APPLIED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_APPLIED
     *
     * @param COUNT_TRANSACTIONS_REMOTE_APPLIED the value for replication_group_member_stats.COUNT_TRANSACTIONS_REMOTE_APPLIED
     *
     * @mbg.generated
     */
    public void setCOUNT_TRANSACTIONS_REMOTE_APPLIED(Long COUNT_TRANSACTIONS_REMOTE_APPLIED) {
        this.COUNT_TRANSACTIONS_REMOTE_APPLIED = COUNT_TRANSACTIONS_REMOTE_APPLIED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_PROPOSED
     *
     * @return the value of replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_PROPOSED
     *
     * @mbg.generated
     */
    public Long getCOUNT_TRANSACTIONS_LOCAL_PROPOSED() {
        return COUNT_TRANSACTIONS_LOCAL_PROPOSED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_PROPOSED
     *
     * @param COUNT_TRANSACTIONS_LOCAL_PROPOSED the value for replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_PROPOSED
     *
     * @mbg.generated
     */
    public void setCOUNT_TRANSACTIONS_LOCAL_PROPOSED(Long COUNT_TRANSACTIONS_LOCAL_PROPOSED) {
        this.COUNT_TRANSACTIONS_LOCAL_PROPOSED = COUNT_TRANSACTIONS_LOCAL_PROPOSED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_ROLLBACK
     *
     * @return the value of replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_ROLLBACK
     *
     * @mbg.generated
     */
    public Long getCOUNT_TRANSACTIONS_LOCAL_ROLLBACK() {
        return COUNT_TRANSACTIONS_LOCAL_ROLLBACK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_ROLLBACK
     *
     * @param COUNT_TRANSACTIONS_LOCAL_ROLLBACK the value for replication_group_member_stats.COUNT_TRANSACTIONS_LOCAL_ROLLBACK
     *
     * @mbg.generated
     */
    public void setCOUNT_TRANSACTIONS_LOCAL_ROLLBACK(Long COUNT_TRANSACTIONS_LOCAL_ROLLBACK) {
        this.COUNT_TRANSACTIONS_LOCAL_ROLLBACK = COUNT_TRANSACTIONS_LOCAL_ROLLBACK;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.TRANSACTIONS_COMMITTED_ALL_MEMBERS
     *
     * @return the value of replication_group_member_stats.TRANSACTIONS_COMMITTED_ALL_MEMBERS
     *
     * @mbg.generated
     */
    public String getTRANSACTIONS_COMMITTED_ALL_MEMBERS() {
        return TRANSACTIONS_COMMITTED_ALL_MEMBERS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.TRANSACTIONS_COMMITTED_ALL_MEMBERS
     *
     * @param TRANSACTIONS_COMMITTED_ALL_MEMBERS the value for replication_group_member_stats.TRANSACTIONS_COMMITTED_ALL_MEMBERS
     *
     * @mbg.generated
     */
    public void setTRANSACTIONS_COMMITTED_ALL_MEMBERS(String TRANSACTIONS_COMMITTED_ALL_MEMBERS) {
        this.TRANSACTIONS_COMMITTED_ALL_MEMBERS = TRANSACTIONS_COMMITTED_ALL_MEMBERS == null ? null : TRANSACTIONS_COMMITTED_ALL_MEMBERS.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_group_member_stats.LAST_CONFLICT_FREE_TRANSACTION
     *
     * @return the value of replication_group_member_stats.LAST_CONFLICT_FREE_TRANSACTION
     *
     * @mbg.generated
     */
    public String getLAST_CONFLICT_FREE_TRANSACTION() {
        return LAST_CONFLICT_FREE_TRANSACTION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_group_member_stats.LAST_CONFLICT_FREE_TRANSACTION
     *
     * @param LAST_CONFLICT_FREE_TRANSACTION the value for replication_group_member_stats.LAST_CONFLICT_FREE_TRANSACTION
     *
     * @mbg.generated
     */
    public void setLAST_CONFLICT_FREE_TRANSACTION(String LAST_CONFLICT_FREE_TRANSACTION) {
        this.LAST_CONFLICT_FREE_TRANSACTION = LAST_CONFLICT_FREE_TRANSACTION == null ? null : LAST_CONFLICT_FREE_TRANSACTION.trim();
    }
}