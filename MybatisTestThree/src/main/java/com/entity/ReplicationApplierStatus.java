package com.entity;

public class ReplicationApplierStatus {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status.CHANNEL_NAME
     *
     * @mbg.generated
     */
    private String CHANNEL_NAME;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status.SERVICE_STATE
     *
     * @mbg.generated
     */
    private String SERVICE_STATE;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status.REMAINING_DELAY
     *
     * @mbg.generated
     */
    private Integer REMAINING_DELAY;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status.COUNT_TRANSACTIONS_RETRIES
     *
     * @mbg.generated
     */
    private Long COUNT_TRANSACTIONS_RETRIES;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status.CHANNEL_NAME
     *
     * @return the value of replication_applier_status.CHANNEL_NAME
     *
     * @mbg.generated
     */
    public String getCHANNEL_NAME() {
        return CHANNEL_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status.CHANNEL_NAME
     *
     * @param CHANNEL_NAME the value for replication_applier_status.CHANNEL_NAME
     *
     * @mbg.generated
     */
    public void setCHANNEL_NAME(String CHANNEL_NAME) {
        this.CHANNEL_NAME = CHANNEL_NAME == null ? null : CHANNEL_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status.SERVICE_STATE
     *
     * @return the value of replication_applier_status.SERVICE_STATE
     *
     * @mbg.generated
     */
    public String getSERVICE_STATE() {
        return SERVICE_STATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status.SERVICE_STATE
     *
     * @param SERVICE_STATE the value for replication_applier_status.SERVICE_STATE
     *
     * @mbg.generated
     */
    public void setSERVICE_STATE(String SERVICE_STATE) {
        this.SERVICE_STATE = SERVICE_STATE == null ? null : SERVICE_STATE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status.REMAINING_DELAY
     *
     * @return the value of replication_applier_status.REMAINING_DELAY
     *
     * @mbg.generated
     */
    public Integer getREMAINING_DELAY() {
        return REMAINING_DELAY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status.REMAINING_DELAY
     *
     * @param REMAINING_DELAY the value for replication_applier_status.REMAINING_DELAY
     *
     * @mbg.generated
     */
    public void setREMAINING_DELAY(Integer REMAINING_DELAY) {
        this.REMAINING_DELAY = REMAINING_DELAY;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status.COUNT_TRANSACTIONS_RETRIES
     *
     * @return the value of replication_applier_status.COUNT_TRANSACTIONS_RETRIES
     *
     * @mbg.generated
     */
    public Long getCOUNT_TRANSACTIONS_RETRIES() {
        return COUNT_TRANSACTIONS_RETRIES;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status.COUNT_TRANSACTIONS_RETRIES
     *
     * @param COUNT_TRANSACTIONS_RETRIES the value for replication_applier_status.COUNT_TRANSACTIONS_RETRIES
     *
     * @mbg.generated
     */
    public void setCOUNT_TRANSACTIONS_RETRIES(Long COUNT_TRANSACTIONS_RETRIES) {
        this.COUNT_TRANSACTIONS_RETRIES = COUNT_TRANSACTIONS_RETRIES;
    }
}