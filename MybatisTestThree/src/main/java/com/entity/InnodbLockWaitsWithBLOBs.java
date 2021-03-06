package com.entity;

public class InnodbLockWaitsWithBLOBs extends InnodbLockWaits {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.locked_table
     *
     * @mbg.generated
     */
    private String locked_table;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.waiting_query
     *
     * @mbg.generated
     */
    private String waiting_query;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.blocking_query
     *
     * @mbg.generated
     */
    private String blocking_query;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.locked_table
     *
     * @return the value of innodb_lock_waits.locked_table
     *
     * @mbg.generated
     */
    public String getLocked_table() {
        return locked_table;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.locked_table
     *
     * @param locked_table the value for innodb_lock_waits.locked_table
     *
     * @mbg.generated
     */
    public void setLocked_table(String locked_table) {
        this.locked_table = locked_table == null ? null : locked_table.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.waiting_query
     *
     * @return the value of innodb_lock_waits.waiting_query
     *
     * @mbg.generated
     */
    public String getWaiting_query() {
        return waiting_query;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.waiting_query
     *
     * @param waiting_query the value for innodb_lock_waits.waiting_query
     *
     * @mbg.generated
     */
    public void setWaiting_query(String waiting_query) {
        this.waiting_query = waiting_query == null ? null : waiting_query.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.blocking_query
     *
     * @return the value of innodb_lock_waits.blocking_query
     *
     * @mbg.generated
     */
    public String getBlocking_query() {
        return blocking_query;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.blocking_query
     *
     * @param blocking_query the value for innodb_lock_waits.blocking_query
     *
     * @mbg.generated
     */
    public void setBlocking_query(String blocking_query) {
        this.blocking_query = blocking_query == null ? null : blocking_query.trim();
    }
}