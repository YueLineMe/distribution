package com.entity;

import java.util.Date;

public class ReplicationApplierStatusByCoordinator {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.CHANNEL_NAME
     *
     * @mbg.generated
     */
    private String CHANNEL_NAME;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.THREAD_ID
     *
     * @mbg.generated
     */
    private Long THREAD_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.SERVICE_STATE
     *
     * @mbg.generated
     */
    private String SERVICE_STATE;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.LAST_ERROR_NUMBER
     *
     * @mbg.generated
     */
    private Integer LAST_ERROR_NUMBER;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.LAST_ERROR_MESSAGE
     *
     * @mbg.generated
     */
    private String LAST_ERROR_MESSAGE;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.LAST_ERROR_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date LAST_ERROR_TIMESTAMP;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION
     *
     * @mbg.generated
     */
    private String LAST_PROCESSED_TRANSACTION;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION
     *
     * @mbg.generated
     */
    private String PROCESSING_TRANSACTION;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.CHANNEL_NAME
     *
     * @return the value of replication_applier_status_by_coordinator.CHANNEL_NAME
     *
     * @mbg.generated
     */
    public String getCHANNEL_NAME() {
        return CHANNEL_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.CHANNEL_NAME
     *
     * @param CHANNEL_NAME the value for replication_applier_status_by_coordinator.CHANNEL_NAME
     *
     * @mbg.generated
     */
    public void setCHANNEL_NAME(String CHANNEL_NAME) {
        this.CHANNEL_NAME = CHANNEL_NAME == null ? null : CHANNEL_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.THREAD_ID
     *
     * @return the value of replication_applier_status_by_coordinator.THREAD_ID
     *
     * @mbg.generated
     */
    public Long getTHREAD_ID() {
        return THREAD_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.THREAD_ID
     *
     * @param THREAD_ID the value for replication_applier_status_by_coordinator.THREAD_ID
     *
     * @mbg.generated
     */
    public void setTHREAD_ID(Long THREAD_ID) {
        this.THREAD_ID = THREAD_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.SERVICE_STATE
     *
     * @return the value of replication_applier_status_by_coordinator.SERVICE_STATE
     *
     * @mbg.generated
     */
    public String getSERVICE_STATE() {
        return SERVICE_STATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.SERVICE_STATE
     *
     * @param SERVICE_STATE the value for replication_applier_status_by_coordinator.SERVICE_STATE
     *
     * @mbg.generated
     */
    public void setSERVICE_STATE(String SERVICE_STATE) {
        this.SERVICE_STATE = SERVICE_STATE == null ? null : SERVICE_STATE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.LAST_ERROR_NUMBER
     *
     * @return the value of replication_applier_status_by_coordinator.LAST_ERROR_NUMBER
     *
     * @mbg.generated
     */
    public Integer getLAST_ERROR_NUMBER() {
        return LAST_ERROR_NUMBER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.LAST_ERROR_NUMBER
     *
     * @param LAST_ERROR_NUMBER the value for replication_applier_status_by_coordinator.LAST_ERROR_NUMBER
     *
     * @mbg.generated
     */
    public void setLAST_ERROR_NUMBER(Integer LAST_ERROR_NUMBER) {
        this.LAST_ERROR_NUMBER = LAST_ERROR_NUMBER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.LAST_ERROR_MESSAGE
     *
     * @return the value of replication_applier_status_by_coordinator.LAST_ERROR_MESSAGE
     *
     * @mbg.generated
     */
    public String getLAST_ERROR_MESSAGE() {
        return LAST_ERROR_MESSAGE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.LAST_ERROR_MESSAGE
     *
     * @param LAST_ERROR_MESSAGE the value for replication_applier_status_by_coordinator.LAST_ERROR_MESSAGE
     *
     * @mbg.generated
     */
    public void setLAST_ERROR_MESSAGE(String LAST_ERROR_MESSAGE) {
        this.LAST_ERROR_MESSAGE = LAST_ERROR_MESSAGE == null ? null : LAST_ERROR_MESSAGE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.LAST_ERROR_TIMESTAMP
     *
     * @return the value of replication_applier_status_by_coordinator.LAST_ERROR_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getLAST_ERROR_TIMESTAMP() {
        return LAST_ERROR_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.LAST_ERROR_TIMESTAMP
     *
     * @param LAST_ERROR_TIMESTAMP the value for replication_applier_status_by_coordinator.LAST_ERROR_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setLAST_ERROR_TIMESTAMP(Date LAST_ERROR_TIMESTAMP) {
        this.LAST_ERROR_TIMESTAMP = LAST_ERROR_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION
     *
     * @return the value of replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION
     *
     * @mbg.generated
     */
    public String getLAST_PROCESSED_TRANSACTION() {
        return LAST_PROCESSED_TRANSACTION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION
     *
     * @param LAST_PROCESSED_TRANSACTION the value for replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION
     *
     * @mbg.generated
     */
    public void setLAST_PROCESSED_TRANSACTION(String LAST_PROCESSED_TRANSACTION) {
        this.LAST_PROCESSED_TRANSACTION = LAST_PROCESSED_TRANSACTION == null ? null : LAST_PROCESSED_TRANSACTION.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @return the value of replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getLAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP() {
        return LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @param LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP the value for replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setLAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP(Date LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP) {
        this.LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP = LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @return the value of replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getLAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP() {
        return LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @param LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP the value for replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setLAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP(Date LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP) {
        this.LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP = LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP
     *
     * @return the value of replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getLAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP() {
        return LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP
     *
     * @param LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP the value for replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setLAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP(Date LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP) {
        this.LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP = LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP
     *
     * @return the value of replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getLAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP() {
        return LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP
     *
     * @param LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP the value for replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setLAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP(Date LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP) {
        this.LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP = LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION
     *
     * @return the value of replication_applier_status_by_coordinator.PROCESSING_TRANSACTION
     *
     * @mbg.generated
     */
    public String getPROCESSING_TRANSACTION() {
        return PROCESSING_TRANSACTION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION
     *
     * @param PROCESSING_TRANSACTION the value for replication_applier_status_by_coordinator.PROCESSING_TRANSACTION
     *
     * @mbg.generated
     */
    public void setPROCESSING_TRANSACTION(String PROCESSING_TRANSACTION) {
        this.PROCESSING_TRANSACTION = PROCESSING_TRANSACTION == null ? null : PROCESSING_TRANSACTION.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @return the value of replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getPROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP() {
        return PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @param PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP the value for replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setPROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP(Date PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP) {
        this.PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP = PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @return the value of replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getPROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP() {
        return PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @param PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP the value for replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setPROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP(Date PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP) {
        this.PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP = PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP
     *
     * @return the value of replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getPROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP() {
        return PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP
     *
     * @param PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP the value for replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setPROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP(Date PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP) {
        this.PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP = PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP;
    }
}