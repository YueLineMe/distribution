package com.entity;

public class DataLocksKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_locks.ENGINE_LOCK_ID
     *
     * @mbg.generated
     */
    private String ENGINE_LOCK_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column data_locks.ENGINE
     *
     * @mbg.generated
     */
    private String ENGINE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_locks.ENGINE_LOCK_ID
     *
     * @return the value of data_locks.ENGINE_LOCK_ID
     *
     * @mbg.generated
     */
    public String getENGINE_LOCK_ID() {
        return ENGINE_LOCK_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_locks.ENGINE_LOCK_ID
     *
     * @param ENGINE_LOCK_ID the value for data_locks.ENGINE_LOCK_ID
     *
     * @mbg.generated
     */
    public void setENGINE_LOCK_ID(String ENGINE_LOCK_ID) {
        this.ENGINE_LOCK_ID = ENGINE_LOCK_ID == null ? null : ENGINE_LOCK_ID.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column data_locks.ENGINE
     *
     * @return the value of data_locks.ENGINE
     *
     * @mbg.generated
     */
    public String getENGINE() {
        return ENGINE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column data_locks.ENGINE
     *
     * @param ENGINE the value for data_locks.ENGINE
     *
     * @mbg.generated
     */
    public void setENGINE(String ENGINE) {
        this.ENGINE = ENGINE == null ? null : ENGINE.trim();
    }
}