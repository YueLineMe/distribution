package com.entity;

import java.util.Date;

public class InnodbLockWaits {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.wait_started
     *
     * @mbg.generated
     */
    private Date wait_started;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.wait_age
     *
     * @mbg.generated
     */
    private Date wait_age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.wait_age_secs
     *
     * @mbg.generated
     */
    private Long wait_age_secs;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.locked_table_schema
     *
     * @mbg.generated
     */
    private String locked_table_schema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.locked_table_name
     *
     * @mbg.generated
     */
    private String locked_table_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.locked_table_partition
     *
     * @mbg.generated
     */
    private String locked_table_partition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.locked_table_subpartition
     *
     * @mbg.generated
     */
    private String locked_table_subpartition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.locked_index
     *
     * @mbg.generated
     */
    private String locked_index;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.locked_type
     *
     * @mbg.generated
     */
    private String locked_type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.waiting_trx_id
     *
     * @mbg.generated
     */
    private String waiting_trx_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.waiting_trx_started
     *
     * @mbg.generated
     */
    private Date waiting_trx_started;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.waiting_trx_age
     *
     * @mbg.generated
     */
    private Date waiting_trx_age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.waiting_trx_rows_locked
     *
     * @mbg.generated
     */
    private Long waiting_trx_rows_locked;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.waiting_trx_rows_modified
     *
     * @mbg.generated
     */
    private Long waiting_trx_rows_modified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.waiting_pid
     *
     * @mbg.generated
     */
    private Long waiting_pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.waiting_lock_id
     *
     * @mbg.generated
     */
    private String waiting_lock_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.waiting_lock_mode
     *
     * @mbg.generated
     */
    private String waiting_lock_mode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.blocking_trx_id
     *
     * @mbg.generated
     */
    private String blocking_trx_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.blocking_pid
     *
     * @mbg.generated
     */
    private Long blocking_pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.blocking_lock_id
     *
     * @mbg.generated
     */
    private String blocking_lock_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.blocking_lock_mode
     *
     * @mbg.generated
     */
    private String blocking_lock_mode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.blocking_trx_started
     *
     * @mbg.generated
     */
    private Date blocking_trx_started;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.blocking_trx_age
     *
     * @mbg.generated
     */
    private Date blocking_trx_age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.blocking_trx_rows_locked
     *
     * @mbg.generated
     */
    private Long blocking_trx_rows_locked;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.blocking_trx_rows_modified
     *
     * @mbg.generated
     */
    private Long blocking_trx_rows_modified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.sql_kill_blocking_query
     *
     * @mbg.generated
     */
    private String sql_kill_blocking_query;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_lock_waits.sql_kill_blocking_connection
     *
     * @mbg.generated
     */
    private String sql_kill_blocking_connection;

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
     * This method returns the value of the database column innodb_lock_waits.wait_started
     *
     * @return the value of innodb_lock_waits.wait_started
     *
     * @mbg.generated
     */
    public Date getWait_started() {
        return wait_started;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.wait_started
     *
     * @param wait_started the value for innodb_lock_waits.wait_started
     *
     * @mbg.generated
     */
    public void setWait_started(Date wait_started) {
        this.wait_started = wait_started;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.wait_age
     *
     * @return the value of innodb_lock_waits.wait_age
     *
     * @mbg.generated
     */
    public Date getWait_age() {
        return wait_age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.wait_age
     *
     * @param wait_age the value for innodb_lock_waits.wait_age
     *
     * @mbg.generated
     */
    public void setWait_age(Date wait_age) {
        this.wait_age = wait_age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.wait_age_secs
     *
     * @return the value of innodb_lock_waits.wait_age_secs
     *
     * @mbg.generated
     */
    public Long getWait_age_secs() {
        return wait_age_secs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.wait_age_secs
     *
     * @param wait_age_secs the value for innodb_lock_waits.wait_age_secs
     *
     * @mbg.generated
     */
    public void setWait_age_secs(Long wait_age_secs) {
        this.wait_age_secs = wait_age_secs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.locked_table_schema
     *
     * @return the value of innodb_lock_waits.locked_table_schema
     *
     * @mbg.generated
     */
    public String getLocked_table_schema() {
        return locked_table_schema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.locked_table_schema
     *
     * @param locked_table_schema the value for innodb_lock_waits.locked_table_schema
     *
     * @mbg.generated
     */
    public void setLocked_table_schema(String locked_table_schema) {
        this.locked_table_schema = locked_table_schema == null ? null : locked_table_schema.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.locked_table_name
     *
     * @return the value of innodb_lock_waits.locked_table_name
     *
     * @mbg.generated
     */
    public String getLocked_table_name() {
        return locked_table_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.locked_table_name
     *
     * @param locked_table_name the value for innodb_lock_waits.locked_table_name
     *
     * @mbg.generated
     */
    public void setLocked_table_name(String locked_table_name) {
        this.locked_table_name = locked_table_name == null ? null : locked_table_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.locked_table_partition
     *
     * @return the value of innodb_lock_waits.locked_table_partition
     *
     * @mbg.generated
     */
    public String getLocked_table_partition() {
        return locked_table_partition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.locked_table_partition
     *
     * @param locked_table_partition the value for innodb_lock_waits.locked_table_partition
     *
     * @mbg.generated
     */
    public void setLocked_table_partition(String locked_table_partition) {
        this.locked_table_partition = locked_table_partition == null ? null : locked_table_partition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.locked_table_subpartition
     *
     * @return the value of innodb_lock_waits.locked_table_subpartition
     *
     * @mbg.generated
     */
    public String getLocked_table_subpartition() {
        return locked_table_subpartition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.locked_table_subpartition
     *
     * @param locked_table_subpartition the value for innodb_lock_waits.locked_table_subpartition
     *
     * @mbg.generated
     */
    public void setLocked_table_subpartition(String locked_table_subpartition) {
        this.locked_table_subpartition = locked_table_subpartition == null ? null : locked_table_subpartition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.locked_index
     *
     * @return the value of innodb_lock_waits.locked_index
     *
     * @mbg.generated
     */
    public String getLocked_index() {
        return locked_index;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.locked_index
     *
     * @param locked_index the value for innodb_lock_waits.locked_index
     *
     * @mbg.generated
     */
    public void setLocked_index(String locked_index) {
        this.locked_index = locked_index == null ? null : locked_index.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.locked_type
     *
     * @return the value of innodb_lock_waits.locked_type
     *
     * @mbg.generated
     */
    public String getLocked_type() {
        return locked_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.locked_type
     *
     * @param locked_type the value for innodb_lock_waits.locked_type
     *
     * @mbg.generated
     */
    public void setLocked_type(String locked_type) {
        this.locked_type = locked_type == null ? null : locked_type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.waiting_trx_id
     *
     * @return the value of innodb_lock_waits.waiting_trx_id
     *
     * @mbg.generated
     */
    public String getWaiting_trx_id() {
        return waiting_trx_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.waiting_trx_id
     *
     * @param waiting_trx_id the value for innodb_lock_waits.waiting_trx_id
     *
     * @mbg.generated
     */
    public void setWaiting_trx_id(String waiting_trx_id) {
        this.waiting_trx_id = waiting_trx_id == null ? null : waiting_trx_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.waiting_trx_started
     *
     * @return the value of innodb_lock_waits.waiting_trx_started
     *
     * @mbg.generated
     */
    public Date getWaiting_trx_started() {
        return waiting_trx_started;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.waiting_trx_started
     *
     * @param waiting_trx_started the value for innodb_lock_waits.waiting_trx_started
     *
     * @mbg.generated
     */
    public void setWaiting_trx_started(Date waiting_trx_started) {
        this.waiting_trx_started = waiting_trx_started;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.waiting_trx_age
     *
     * @return the value of innodb_lock_waits.waiting_trx_age
     *
     * @mbg.generated
     */
    public Date getWaiting_trx_age() {
        return waiting_trx_age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.waiting_trx_age
     *
     * @param waiting_trx_age the value for innodb_lock_waits.waiting_trx_age
     *
     * @mbg.generated
     */
    public void setWaiting_trx_age(Date waiting_trx_age) {
        this.waiting_trx_age = waiting_trx_age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.waiting_trx_rows_locked
     *
     * @return the value of innodb_lock_waits.waiting_trx_rows_locked
     *
     * @mbg.generated
     */
    public Long getWaiting_trx_rows_locked() {
        return waiting_trx_rows_locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.waiting_trx_rows_locked
     *
     * @param waiting_trx_rows_locked the value for innodb_lock_waits.waiting_trx_rows_locked
     *
     * @mbg.generated
     */
    public void setWaiting_trx_rows_locked(Long waiting_trx_rows_locked) {
        this.waiting_trx_rows_locked = waiting_trx_rows_locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.waiting_trx_rows_modified
     *
     * @return the value of innodb_lock_waits.waiting_trx_rows_modified
     *
     * @mbg.generated
     */
    public Long getWaiting_trx_rows_modified() {
        return waiting_trx_rows_modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.waiting_trx_rows_modified
     *
     * @param waiting_trx_rows_modified the value for innodb_lock_waits.waiting_trx_rows_modified
     *
     * @mbg.generated
     */
    public void setWaiting_trx_rows_modified(Long waiting_trx_rows_modified) {
        this.waiting_trx_rows_modified = waiting_trx_rows_modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.waiting_pid
     *
     * @return the value of innodb_lock_waits.waiting_pid
     *
     * @mbg.generated
     */
    public Long getWaiting_pid() {
        return waiting_pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.waiting_pid
     *
     * @param waiting_pid the value for innodb_lock_waits.waiting_pid
     *
     * @mbg.generated
     */
    public void setWaiting_pid(Long waiting_pid) {
        this.waiting_pid = waiting_pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.waiting_lock_id
     *
     * @return the value of innodb_lock_waits.waiting_lock_id
     *
     * @mbg.generated
     */
    public String getWaiting_lock_id() {
        return waiting_lock_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.waiting_lock_id
     *
     * @param waiting_lock_id the value for innodb_lock_waits.waiting_lock_id
     *
     * @mbg.generated
     */
    public void setWaiting_lock_id(String waiting_lock_id) {
        this.waiting_lock_id = waiting_lock_id == null ? null : waiting_lock_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.waiting_lock_mode
     *
     * @return the value of innodb_lock_waits.waiting_lock_mode
     *
     * @mbg.generated
     */
    public String getWaiting_lock_mode() {
        return waiting_lock_mode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.waiting_lock_mode
     *
     * @param waiting_lock_mode the value for innodb_lock_waits.waiting_lock_mode
     *
     * @mbg.generated
     */
    public void setWaiting_lock_mode(String waiting_lock_mode) {
        this.waiting_lock_mode = waiting_lock_mode == null ? null : waiting_lock_mode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.blocking_trx_id
     *
     * @return the value of innodb_lock_waits.blocking_trx_id
     *
     * @mbg.generated
     */
    public String getBlocking_trx_id() {
        return blocking_trx_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.blocking_trx_id
     *
     * @param blocking_trx_id the value for innodb_lock_waits.blocking_trx_id
     *
     * @mbg.generated
     */
    public void setBlocking_trx_id(String blocking_trx_id) {
        this.blocking_trx_id = blocking_trx_id == null ? null : blocking_trx_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.blocking_pid
     *
     * @return the value of innodb_lock_waits.blocking_pid
     *
     * @mbg.generated
     */
    public Long getBlocking_pid() {
        return blocking_pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.blocking_pid
     *
     * @param blocking_pid the value for innodb_lock_waits.blocking_pid
     *
     * @mbg.generated
     */
    public void setBlocking_pid(Long blocking_pid) {
        this.blocking_pid = blocking_pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.blocking_lock_id
     *
     * @return the value of innodb_lock_waits.blocking_lock_id
     *
     * @mbg.generated
     */
    public String getBlocking_lock_id() {
        return blocking_lock_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.blocking_lock_id
     *
     * @param blocking_lock_id the value for innodb_lock_waits.blocking_lock_id
     *
     * @mbg.generated
     */
    public void setBlocking_lock_id(String blocking_lock_id) {
        this.blocking_lock_id = blocking_lock_id == null ? null : blocking_lock_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.blocking_lock_mode
     *
     * @return the value of innodb_lock_waits.blocking_lock_mode
     *
     * @mbg.generated
     */
    public String getBlocking_lock_mode() {
        return blocking_lock_mode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.blocking_lock_mode
     *
     * @param blocking_lock_mode the value for innodb_lock_waits.blocking_lock_mode
     *
     * @mbg.generated
     */
    public void setBlocking_lock_mode(String blocking_lock_mode) {
        this.blocking_lock_mode = blocking_lock_mode == null ? null : blocking_lock_mode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.blocking_trx_started
     *
     * @return the value of innodb_lock_waits.blocking_trx_started
     *
     * @mbg.generated
     */
    public Date getBlocking_trx_started() {
        return blocking_trx_started;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.blocking_trx_started
     *
     * @param blocking_trx_started the value for innodb_lock_waits.blocking_trx_started
     *
     * @mbg.generated
     */
    public void setBlocking_trx_started(Date blocking_trx_started) {
        this.blocking_trx_started = blocking_trx_started;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.blocking_trx_age
     *
     * @return the value of innodb_lock_waits.blocking_trx_age
     *
     * @mbg.generated
     */
    public Date getBlocking_trx_age() {
        return blocking_trx_age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.blocking_trx_age
     *
     * @param blocking_trx_age the value for innodb_lock_waits.blocking_trx_age
     *
     * @mbg.generated
     */
    public void setBlocking_trx_age(Date blocking_trx_age) {
        this.blocking_trx_age = blocking_trx_age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.blocking_trx_rows_locked
     *
     * @return the value of innodb_lock_waits.blocking_trx_rows_locked
     *
     * @mbg.generated
     */
    public Long getBlocking_trx_rows_locked() {
        return blocking_trx_rows_locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.blocking_trx_rows_locked
     *
     * @param blocking_trx_rows_locked the value for innodb_lock_waits.blocking_trx_rows_locked
     *
     * @mbg.generated
     */
    public void setBlocking_trx_rows_locked(Long blocking_trx_rows_locked) {
        this.blocking_trx_rows_locked = blocking_trx_rows_locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.blocking_trx_rows_modified
     *
     * @return the value of innodb_lock_waits.blocking_trx_rows_modified
     *
     * @mbg.generated
     */
    public Long getBlocking_trx_rows_modified() {
        return blocking_trx_rows_modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.blocking_trx_rows_modified
     *
     * @param blocking_trx_rows_modified the value for innodb_lock_waits.blocking_trx_rows_modified
     *
     * @mbg.generated
     */
    public void setBlocking_trx_rows_modified(Long blocking_trx_rows_modified) {
        this.blocking_trx_rows_modified = blocking_trx_rows_modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.sql_kill_blocking_query
     *
     * @return the value of innodb_lock_waits.sql_kill_blocking_query
     *
     * @mbg.generated
     */
    public String getSql_kill_blocking_query() {
        return sql_kill_blocking_query;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.sql_kill_blocking_query
     *
     * @param sql_kill_blocking_query the value for innodb_lock_waits.sql_kill_blocking_query
     *
     * @mbg.generated
     */
    public void setSql_kill_blocking_query(String sql_kill_blocking_query) {
        this.sql_kill_blocking_query = sql_kill_blocking_query == null ? null : sql_kill_blocking_query.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_lock_waits.sql_kill_blocking_connection
     *
     * @return the value of innodb_lock_waits.sql_kill_blocking_connection
     *
     * @mbg.generated
     */
    public String getSql_kill_blocking_connection() {
        return sql_kill_blocking_connection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_lock_waits.sql_kill_blocking_connection
     *
     * @param sql_kill_blocking_connection the value for innodb_lock_waits.sql_kill_blocking_connection
     *
     * @mbg.generated
     */
    public void setSql_kill_blocking_connection(String sql_kill_blocking_connection) {
        this.sql_kill_blocking_connection = sql_kill_blocking_connection == null ? null : sql_kill_blocking_connection.trim();
    }

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