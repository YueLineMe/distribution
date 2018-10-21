package com.entity;

public class LogStatus {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_status.SERVER_UUID
     *
     * @mbg.generated
     */
    private String SERVER_UUID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_status.LOCAL
     *
     * @mbg.generated
     */
    private String LOCAL;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_status.REPLICATION
     *
     * @mbg.generated
     */
    private String REPLICATION;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log_status.STORAGE_ENGINES
     *
     * @mbg.generated
     */
    private String STORAGE_ENGINES;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_status.SERVER_UUID
     *
     * @return the value of log_status.SERVER_UUID
     *
     * @mbg.generated
     */
    public String getSERVER_UUID() {
        return SERVER_UUID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_status.SERVER_UUID
     *
     * @param SERVER_UUID the value for log_status.SERVER_UUID
     *
     * @mbg.generated
     */
    public void setSERVER_UUID(String SERVER_UUID) {
        this.SERVER_UUID = SERVER_UUID == null ? null : SERVER_UUID.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_status.LOCAL
     *
     * @return the value of log_status.LOCAL
     *
     * @mbg.generated
     */
    public String getLOCAL() {
        return LOCAL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_status.LOCAL
     *
     * @param LOCAL the value for log_status.LOCAL
     *
     * @mbg.generated
     */
    public void setLOCAL(String LOCAL) {
        this.LOCAL = LOCAL == null ? null : LOCAL.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_status.REPLICATION
     *
     * @return the value of log_status.REPLICATION
     *
     * @mbg.generated
     */
    public String getREPLICATION() {
        return REPLICATION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_status.REPLICATION
     *
     * @param REPLICATION the value for log_status.REPLICATION
     *
     * @mbg.generated
     */
    public void setREPLICATION(String REPLICATION) {
        this.REPLICATION = REPLICATION == null ? null : REPLICATION.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log_status.STORAGE_ENGINES
     *
     * @return the value of log_status.STORAGE_ENGINES
     *
     * @mbg.generated
     */
    public String getSTORAGE_ENGINES() {
        return STORAGE_ENGINES;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log_status.STORAGE_ENGINES
     *
     * @param STORAGE_ENGINES the value for log_status.STORAGE_ENGINES
     *
     * @mbg.generated
     */
    public void setSTORAGE_ENGINES(String STORAGE_ENGINES) {
        this.STORAGE_ENGINES = STORAGE_ENGINES == null ? null : STORAGE_ENGINES.trim();
    }
}