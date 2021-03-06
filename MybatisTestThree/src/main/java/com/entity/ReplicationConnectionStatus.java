package com.entity;

import java.util.Date;

public class ReplicationConnectionStatus {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_connection_status.CHANNEL_NAME
     *
     * @mbg.generated
     */
    private String CHANNEL_NAME;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_connection_status.GROUP_NAME
     *
     * @mbg.generated
     */
    private String GROUP_NAME;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_connection_status.SOURCE_UUID
     *
     * @mbg.generated
     */
    private String SOURCE_UUID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_connection_status.THREAD_ID
     *
     * @mbg.generated
     */
    private Long THREAD_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_connection_status.SERVICE_STATE
     *
     * @mbg.generated
     */
    private String SERVICE_STATE;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_connection_status.COUNT_RECEIVED_HEARTBEATS
     *
     * @mbg.generated
     */
    private Long COUNT_RECEIVED_HEARTBEATS;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_connection_status.LAST_HEARTBEAT_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date LAST_HEARTBEAT_TIMESTAMP;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_connection_status.LAST_ERROR_NUMBER
     *
     * @mbg.generated
     */
    private Integer LAST_ERROR_NUMBER;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_connection_status.LAST_ERROR_MESSAGE
     *
     * @mbg.generated
     */
    private String LAST_ERROR_MESSAGE;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_connection_status.LAST_ERROR_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date LAST_ERROR_TIMESTAMP;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_connection_status.LAST_QUEUED_TRANSACTION
     *
     * @mbg.generated
     */
    private String LAST_QUEUED_TRANSACTION;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_connection_status.LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_connection_status.LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_connection_status.LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_connection_status.LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_connection_status.QUEUEING_TRANSACTION
     *
     * @mbg.generated
     */
    private String QUEUEING_TRANSACTION;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_connection_status.QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_connection_status.QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_connection_status.QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_connection_status.RECEIVED_TRANSACTION_SET
     *
     * @mbg.generated
     */
    private String RECEIVED_TRANSACTION_SET;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_connection_status.CHANNEL_NAME
     *
     * @return the value of replication_connection_status.CHANNEL_NAME
     *
     * @mbg.generated
     */
    public String getCHANNEL_NAME() {
        return CHANNEL_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_connection_status.CHANNEL_NAME
     *
     * @param CHANNEL_NAME the value for replication_connection_status.CHANNEL_NAME
     *
     * @mbg.generated
     */
    public void setCHANNEL_NAME(String CHANNEL_NAME) {
        this.CHANNEL_NAME = CHANNEL_NAME == null ? null : CHANNEL_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_connection_status.GROUP_NAME
     *
     * @return the value of replication_connection_status.GROUP_NAME
     *
     * @mbg.generated
     */
    public String getGROUP_NAME() {
        return GROUP_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_connection_status.GROUP_NAME
     *
     * @param GROUP_NAME the value for replication_connection_status.GROUP_NAME
     *
     * @mbg.generated
     */
    public void setGROUP_NAME(String GROUP_NAME) {
        this.GROUP_NAME = GROUP_NAME == null ? null : GROUP_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_connection_status.SOURCE_UUID
     *
     * @return the value of replication_connection_status.SOURCE_UUID
     *
     * @mbg.generated
     */
    public String getSOURCE_UUID() {
        return SOURCE_UUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_connection_status.SOURCE_UUID
     *
     * @param SOURCE_UUID the value for replication_connection_status.SOURCE_UUID
     *
     * @mbg.generated
     */
    public void setSOURCE_UUID(String SOURCE_UUID) {
        this.SOURCE_UUID = SOURCE_UUID == null ? null : SOURCE_UUID.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_connection_status.THREAD_ID
     *
     * @return the value of replication_connection_status.THREAD_ID
     *
     * @mbg.generated
     */
    public Long getTHREAD_ID() {
        return THREAD_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_connection_status.THREAD_ID
     *
     * @param THREAD_ID the value for replication_connection_status.THREAD_ID
     *
     * @mbg.generated
     */
    public void setTHREAD_ID(Long THREAD_ID) {
        this.THREAD_ID = THREAD_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_connection_status.SERVICE_STATE
     *
     * @return the value of replication_connection_status.SERVICE_STATE
     *
     * @mbg.generated
     */
    public String getSERVICE_STATE() {
        return SERVICE_STATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_connection_status.SERVICE_STATE
     *
     * @param SERVICE_STATE the value for replication_connection_status.SERVICE_STATE
     *
     * @mbg.generated
     */
    public void setSERVICE_STATE(String SERVICE_STATE) {
        this.SERVICE_STATE = SERVICE_STATE == null ? null : SERVICE_STATE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_connection_status.COUNT_RECEIVED_HEARTBEATS
     *
     * @return the value of replication_connection_status.COUNT_RECEIVED_HEARTBEATS
     *
     * @mbg.generated
     */
    public Long getCOUNT_RECEIVED_HEARTBEATS() {
        return COUNT_RECEIVED_HEARTBEATS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_connection_status.COUNT_RECEIVED_HEARTBEATS
     *
     * @param COUNT_RECEIVED_HEARTBEATS the value for replication_connection_status.COUNT_RECEIVED_HEARTBEATS
     *
     * @mbg.generated
     */
    public void setCOUNT_RECEIVED_HEARTBEATS(Long COUNT_RECEIVED_HEARTBEATS) {
        this.COUNT_RECEIVED_HEARTBEATS = COUNT_RECEIVED_HEARTBEATS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_connection_status.LAST_HEARTBEAT_TIMESTAMP
     *
     * @return the value of replication_connection_status.LAST_HEARTBEAT_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getLAST_HEARTBEAT_TIMESTAMP() {
        return LAST_HEARTBEAT_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_connection_status.LAST_HEARTBEAT_TIMESTAMP
     *
     * @param LAST_HEARTBEAT_TIMESTAMP the value for replication_connection_status.LAST_HEARTBEAT_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setLAST_HEARTBEAT_TIMESTAMP(Date LAST_HEARTBEAT_TIMESTAMP) {
        this.LAST_HEARTBEAT_TIMESTAMP = LAST_HEARTBEAT_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_connection_status.LAST_ERROR_NUMBER
     *
     * @return the value of replication_connection_status.LAST_ERROR_NUMBER
     *
     * @mbg.generated
     */
    public Integer getLAST_ERROR_NUMBER() {
        return LAST_ERROR_NUMBER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_connection_status.LAST_ERROR_NUMBER
     *
     * @param LAST_ERROR_NUMBER the value for replication_connection_status.LAST_ERROR_NUMBER
     *
     * @mbg.generated
     */
    public void setLAST_ERROR_NUMBER(Integer LAST_ERROR_NUMBER) {
        this.LAST_ERROR_NUMBER = LAST_ERROR_NUMBER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_connection_status.LAST_ERROR_MESSAGE
     *
     * @return the value of replication_connection_status.LAST_ERROR_MESSAGE
     *
     * @mbg.generated
     */
    public String getLAST_ERROR_MESSAGE() {
        return LAST_ERROR_MESSAGE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_connection_status.LAST_ERROR_MESSAGE
     *
     * @param LAST_ERROR_MESSAGE the value for replication_connection_status.LAST_ERROR_MESSAGE
     *
     * @mbg.generated
     */
    public void setLAST_ERROR_MESSAGE(String LAST_ERROR_MESSAGE) {
        this.LAST_ERROR_MESSAGE = LAST_ERROR_MESSAGE == null ? null : LAST_ERROR_MESSAGE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_connection_status.LAST_ERROR_TIMESTAMP
     *
     * @return the value of replication_connection_status.LAST_ERROR_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getLAST_ERROR_TIMESTAMP() {
        return LAST_ERROR_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_connection_status.LAST_ERROR_TIMESTAMP
     *
     * @param LAST_ERROR_TIMESTAMP the value for replication_connection_status.LAST_ERROR_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setLAST_ERROR_TIMESTAMP(Date LAST_ERROR_TIMESTAMP) {
        this.LAST_ERROR_TIMESTAMP = LAST_ERROR_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_connection_status.LAST_QUEUED_TRANSACTION
     *
     * @return the value of replication_connection_status.LAST_QUEUED_TRANSACTION
     *
     * @mbg.generated
     */
    public String getLAST_QUEUED_TRANSACTION() {
        return LAST_QUEUED_TRANSACTION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_connection_status.LAST_QUEUED_TRANSACTION
     *
     * @param LAST_QUEUED_TRANSACTION the value for replication_connection_status.LAST_QUEUED_TRANSACTION
     *
     * @mbg.generated
     */
    public void setLAST_QUEUED_TRANSACTION(String LAST_QUEUED_TRANSACTION) {
        this.LAST_QUEUED_TRANSACTION = LAST_QUEUED_TRANSACTION == null ? null : LAST_QUEUED_TRANSACTION.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_connection_status.LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @return the value of replication_connection_status.LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getLAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP() {
        return LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_connection_status.LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @param LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP the value for replication_connection_status.LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setLAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP(Date LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP) {
        this.LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP = LAST_QUEUED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_connection_status.LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @return the value of replication_connection_status.LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getLAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP() {
        return LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_connection_status.LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @param LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP the value for replication_connection_status.LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setLAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP(Date LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP) {
        this.LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP = LAST_QUEUED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_connection_status.LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP
     *
     * @return the value of replication_connection_status.LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getLAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP() {
        return LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_connection_status.LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP
     *
     * @param LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP the value for replication_connection_status.LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setLAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP(Date LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP) {
        this.LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP = LAST_QUEUED_TRANSACTION_START_QUEUE_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_connection_status.LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP
     *
     * @return the value of replication_connection_status.LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getLAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP() {
        return LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_connection_status.LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP
     *
     * @param LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP the value for replication_connection_status.LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setLAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP(Date LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP) {
        this.LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP = LAST_QUEUED_TRANSACTION_END_QUEUE_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_connection_status.QUEUEING_TRANSACTION
     *
     * @return the value of replication_connection_status.QUEUEING_TRANSACTION
     *
     * @mbg.generated
     */
    public String getQUEUEING_TRANSACTION() {
        return QUEUEING_TRANSACTION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_connection_status.QUEUEING_TRANSACTION
     *
     * @param QUEUEING_TRANSACTION the value for replication_connection_status.QUEUEING_TRANSACTION
     *
     * @mbg.generated
     */
    public void setQUEUEING_TRANSACTION(String QUEUEING_TRANSACTION) {
        this.QUEUEING_TRANSACTION = QUEUEING_TRANSACTION == null ? null : QUEUEING_TRANSACTION.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_connection_status.QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @return the value of replication_connection_status.QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getQUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP() {
        return QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_connection_status.QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @param QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP the value for replication_connection_status.QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setQUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP(Date QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP) {
        this.QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP = QUEUEING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_connection_status.QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @return the value of replication_connection_status.QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getQUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP() {
        return QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_connection_status.QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @param QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP the value for replication_connection_status.QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setQUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP(Date QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP) {
        this.QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP = QUEUEING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_connection_status.QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP
     *
     * @return the value of replication_connection_status.QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getQUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP() {
        return QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_connection_status.QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP
     *
     * @param QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP the value for replication_connection_status.QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setQUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP(Date QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP) {
        this.QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP = QUEUEING_TRANSACTION_START_QUEUE_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_connection_status.RECEIVED_TRANSACTION_SET
     *
     * @return the value of replication_connection_status.RECEIVED_TRANSACTION_SET
     *
     * @mbg.generated
     */
    public String getRECEIVED_TRANSACTION_SET() {
        return RECEIVED_TRANSACTION_SET;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_connection_status.RECEIVED_TRANSACTION_SET
     *
     * @param RECEIVED_TRANSACTION_SET the value for replication_connection_status.RECEIVED_TRANSACTION_SET
     *
     * @mbg.generated
     */
    public void setRECEIVED_TRANSACTION_SET(String RECEIVED_TRANSACTION_SET) {
        this.RECEIVED_TRANSACTION_SET = RECEIVED_TRANSACTION_SET == null ? null : RECEIVED_TRANSACTION_SET.trim();
    }
}