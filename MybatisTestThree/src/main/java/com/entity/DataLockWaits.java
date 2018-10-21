package com.entity;

public class DataLockWaits {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_lock_waits.ENGINE
     *
     * @mbg.generated
     */
    private String ENGINE;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_lock_waits.REQUESTING_ENGINE_LOCK_ID
     *
     * @mbg.generated
     */
    private String REQUESTING_ENGINE_LOCK_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_lock_waits.REQUESTING_ENGINE_TRANSACTION_ID
     *
     * @mbg.generated
     */
    private Long REQUESTING_ENGINE_TRANSACTION_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_lock_waits.REQUESTING_THREAD_ID
     *
     * @mbg.generated
     */
    private Long REQUESTING_THREAD_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_lock_waits.REQUESTING_EVENT_ID
     *
     * @mbg.generated
     */
    private Long REQUESTING_EVENT_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_lock_waits.REQUESTING_OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated
     */
    private Long REQUESTING_OBJECT_INSTANCE_BEGIN;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_lock_waits.BLOCKING_ENGINE_LOCK_ID
     *
     * @mbg.generated
     */
    private String BLOCKING_ENGINE_LOCK_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_lock_waits.BLOCKING_ENGINE_TRANSACTION_ID
     *
     * @mbg.generated
     */
    private Long BLOCKING_ENGINE_TRANSACTION_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_lock_waits.BLOCKING_THREAD_ID
     *
     * @mbg.generated
     */
    private Long BLOCKING_THREAD_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_lock_waits.BLOCKING_EVENT_ID
     *
     * @mbg.generated
     */
    private Long BLOCKING_EVENT_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_lock_waits.BLOCKING_OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated
     */
    private Long BLOCKING_OBJECT_INSTANCE_BEGIN;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_lock_waits.ENGINE
     *
     * @return the value of data_lock_waits.ENGINE
     *
     * @mbg.generated
     */
    public String getENGINE() {
        return ENGINE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_lock_waits.ENGINE
     *
     * @param ENGINE the value for data_lock_waits.ENGINE
     *
     * @mbg.generated
     */
    public void setENGINE(String ENGINE) {
        this.ENGINE = ENGINE == null ? null : ENGINE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_lock_waits.REQUESTING_ENGINE_LOCK_ID
     *
     * @return the value of data_lock_waits.REQUESTING_ENGINE_LOCK_ID
     *
     * @mbg.generated
     */
    public String getREQUESTING_ENGINE_LOCK_ID() {
        return REQUESTING_ENGINE_LOCK_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_lock_waits.REQUESTING_ENGINE_LOCK_ID
     *
     * @param REQUESTING_ENGINE_LOCK_ID the value for data_lock_waits.REQUESTING_ENGINE_LOCK_ID
     *
     * @mbg.generated
     */
    public void setREQUESTING_ENGINE_LOCK_ID(String REQUESTING_ENGINE_LOCK_ID) {
        this.REQUESTING_ENGINE_LOCK_ID = REQUESTING_ENGINE_LOCK_ID == null ? null : REQUESTING_ENGINE_LOCK_ID.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_lock_waits.REQUESTING_ENGINE_TRANSACTION_ID
     *
     * @return the value of data_lock_waits.REQUESTING_ENGINE_TRANSACTION_ID
     *
     * @mbg.generated
     */
    public Long getREQUESTING_ENGINE_TRANSACTION_ID() {
        return REQUESTING_ENGINE_TRANSACTION_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_lock_waits.REQUESTING_ENGINE_TRANSACTION_ID
     *
     * @param REQUESTING_ENGINE_TRANSACTION_ID the value for data_lock_waits.REQUESTING_ENGINE_TRANSACTION_ID
     *
     * @mbg.generated
     */
    public void setREQUESTING_ENGINE_TRANSACTION_ID(Long REQUESTING_ENGINE_TRANSACTION_ID) {
        this.REQUESTING_ENGINE_TRANSACTION_ID = REQUESTING_ENGINE_TRANSACTION_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_lock_waits.REQUESTING_THREAD_ID
     *
     * @return the value of data_lock_waits.REQUESTING_THREAD_ID
     *
     * @mbg.generated
     */
    public Long getREQUESTING_THREAD_ID() {
        return REQUESTING_THREAD_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_lock_waits.REQUESTING_THREAD_ID
     *
     * @param REQUESTING_THREAD_ID the value for data_lock_waits.REQUESTING_THREAD_ID
     *
     * @mbg.generated
     */
    public void setREQUESTING_THREAD_ID(Long REQUESTING_THREAD_ID) {
        this.REQUESTING_THREAD_ID = REQUESTING_THREAD_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_lock_waits.REQUESTING_EVENT_ID
     *
     * @return the value of data_lock_waits.REQUESTING_EVENT_ID
     *
     * @mbg.generated
     */
    public Long getREQUESTING_EVENT_ID() {
        return REQUESTING_EVENT_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_lock_waits.REQUESTING_EVENT_ID
     *
     * @param REQUESTING_EVENT_ID the value for data_lock_waits.REQUESTING_EVENT_ID
     *
     * @mbg.generated
     */
    public void setREQUESTING_EVENT_ID(Long REQUESTING_EVENT_ID) {
        this.REQUESTING_EVENT_ID = REQUESTING_EVENT_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_lock_waits.REQUESTING_OBJECT_INSTANCE_BEGIN
     *
     * @return the value of data_lock_waits.REQUESTING_OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated
     */
    public Long getREQUESTING_OBJECT_INSTANCE_BEGIN() {
        return REQUESTING_OBJECT_INSTANCE_BEGIN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_lock_waits.REQUESTING_OBJECT_INSTANCE_BEGIN
     *
     * @param REQUESTING_OBJECT_INSTANCE_BEGIN the value for data_lock_waits.REQUESTING_OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated
     */
    public void setREQUESTING_OBJECT_INSTANCE_BEGIN(Long REQUESTING_OBJECT_INSTANCE_BEGIN) {
        this.REQUESTING_OBJECT_INSTANCE_BEGIN = REQUESTING_OBJECT_INSTANCE_BEGIN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_lock_waits.BLOCKING_ENGINE_LOCK_ID
     *
     * @return the value of data_lock_waits.BLOCKING_ENGINE_LOCK_ID
     *
     * @mbg.generated
     */
    public String getBLOCKING_ENGINE_LOCK_ID() {
        return BLOCKING_ENGINE_LOCK_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_lock_waits.BLOCKING_ENGINE_LOCK_ID
     *
     * @param BLOCKING_ENGINE_LOCK_ID the value for data_lock_waits.BLOCKING_ENGINE_LOCK_ID
     *
     * @mbg.generated
     */
    public void setBLOCKING_ENGINE_LOCK_ID(String BLOCKING_ENGINE_LOCK_ID) {
        this.BLOCKING_ENGINE_LOCK_ID = BLOCKING_ENGINE_LOCK_ID == null ? null : BLOCKING_ENGINE_LOCK_ID.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_lock_waits.BLOCKING_ENGINE_TRANSACTION_ID
     *
     * @return the value of data_lock_waits.BLOCKING_ENGINE_TRANSACTION_ID
     *
     * @mbg.generated
     */
    public Long getBLOCKING_ENGINE_TRANSACTION_ID() {
        return BLOCKING_ENGINE_TRANSACTION_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_lock_waits.BLOCKING_ENGINE_TRANSACTION_ID
     *
     * @param BLOCKING_ENGINE_TRANSACTION_ID the value for data_lock_waits.BLOCKING_ENGINE_TRANSACTION_ID
     *
     * @mbg.generated
     */
    public void setBLOCKING_ENGINE_TRANSACTION_ID(Long BLOCKING_ENGINE_TRANSACTION_ID) {
        this.BLOCKING_ENGINE_TRANSACTION_ID = BLOCKING_ENGINE_TRANSACTION_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_lock_waits.BLOCKING_THREAD_ID
     *
     * @return the value of data_lock_waits.BLOCKING_THREAD_ID
     *
     * @mbg.generated
     */
    public Long getBLOCKING_THREAD_ID() {
        return BLOCKING_THREAD_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_lock_waits.BLOCKING_THREAD_ID
     *
     * @param BLOCKING_THREAD_ID the value for data_lock_waits.BLOCKING_THREAD_ID
     *
     * @mbg.generated
     */
    public void setBLOCKING_THREAD_ID(Long BLOCKING_THREAD_ID) {
        this.BLOCKING_THREAD_ID = BLOCKING_THREAD_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_lock_waits.BLOCKING_EVENT_ID
     *
     * @return the value of data_lock_waits.BLOCKING_EVENT_ID
     *
     * @mbg.generated
     */
    public Long getBLOCKING_EVENT_ID() {
        return BLOCKING_EVENT_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_lock_waits.BLOCKING_EVENT_ID
     *
     * @param BLOCKING_EVENT_ID the value for data_lock_waits.BLOCKING_EVENT_ID
     *
     * @mbg.generated
     */
    public void setBLOCKING_EVENT_ID(Long BLOCKING_EVENT_ID) {
        this.BLOCKING_EVENT_ID = BLOCKING_EVENT_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_lock_waits.BLOCKING_OBJECT_INSTANCE_BEGIN
     *
     * @return the value of data_lock_waits.BLOCKING_OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated
     */
    public Long getBLOCKING_OBJECT_INSTANCE_BEGIN() {
        return BLOCKING_OBJECT_INSTANCE_BEGIN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_lock_waits.BLOCKING_OBJECT_INSTANCE_BEGIN
     *
     * @param BLOCKING_OBJECT_INSTANCE_BEGIN the value for data_lock_waits.BLOCKING_OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated
     */
    public void setBLOCKING_OBJECT_INSTANCE_BEGIN(Long BLOCKING_OBJECT_INSTANCE_BEGIN) {
        this.BLOCKING_OBJECT_INSTANCE_BEGIN = BLOCKING_OBJECT_INSTANCE_BEGIN;
    }
}