package com.entity;

import java.util.Date;

public class InnodbTrx {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_id
     *
     * @mbg.generated
     */
    private String trx_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_state
     *
     * @mbg.generated
     */
    private String trx_state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_started
     *
     * @mbg.generated
     */
    private Date trx_started;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_requested_lock_id
     *
     * @mbg.generated
     */
    private String trx_requested_lock_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_wait_started
     *
     * @mbg.generated
     */
    private Date trx_wait_started;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_weight
     *
     * @mbg.generated
     */
    private Long trx_weight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_mysql_thread_id
     *
     * @mbg.generated
     */
    private Long trx_mysql_thread_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_query
     *
     * @mbg.generated
     */
    private String trx_query;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_operation_state
     *
     * @mbg.generated
     */
    private String trx_operation_state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_tables_in_use
     *
     * @mbg.generated
     */
    private Long trx_tables_in_use;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_tables_locked
     *
     * @mbg.generated
     */
    private Long trx_tables_locked;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_lock_structs
     *
     * @mbg.generated
     */
    private Long trx_lock_structs;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_lock_memory_bytes
     *
     * @mbg.generated
     */
    private Long trx_lock_memory_bytes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_rows_locked
     *
     * @mbg.generated
     */
    private Long trx_rows_locked;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_rows_modified
     *
     * @mbg.generated
     */
    private Long trx_rows_modified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_concurrency_tickets
     *
     * @mbg.generated
     */
    private Long trx_concurrency_tickets;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_isolation_level
     *
     * @mbg.generated
     */
    private String trx_isolation_level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_unique_checks
     *
     * @mbg.generated
     */
    private Integer trx_unique_checks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_foreign_key_checks
     *
     * @mbg.generated
     */
    private Integer trx_foreign_key_checks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_last_foreign_key_error
     *
     * @mbg.generated
     */
    private String trx_last_foreign_key_error;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_adaptive_hash_latched
     *
     * @mbg.generated
     */
    private Integer trx_adaptive_hash_latched;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_adaptive_hash_timeout
     *
     * @mbg.generated
     */
    private Long trx_adaptive_hash_timeout;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_is_read_only
     *
     * @mbg.generated
     */
    private Integer trx_is_read_only;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_TRX.trx_autocommit_non_locking
     *
     * @mbg.generated
     */
    private Integer trx_autocommit_non_locking;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_id
     *
     * @return the value of INNODB_TRX.trx_id
     *
     * @mbg.generated
     */
    public String getTrx_id() {
        return trx_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_id
     *
     * @param trx_id the value for INNODB_TRX.trx_id
     *
     * @mbg.generated
     */
    public void setTrx_id(String trx_id) {
        this.trx_id = trx_id == null ? null : trx_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_state
     *
     * @return the value of INNODB_TRX.trx_state
     *
     * @mbg.generated
     */
    public String getTrx_state() {
        return trx_state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_state
     *
     * @param trx_state the value for INNODB_TRX.trx_state
     *
     * @mbg.generated
     */
    public void setTrx_state(String trx_state) {
        this.trx_state = trx_state == null ? null : trx_state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_started
     *
     * @return the value of INNODB_TRX.trx_started
     *
     * @mbg.generated
     */
    public Date getTrx_started() {
        return trx_started;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_started
     *
     * @param trx_started the value for INNODB_TRX.trx_started
     *
     * @mbg.generated
     */
    public void setTrx_started(Date trx_started) {
        this.trx_started = trx_started;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_requested_lock_id
     *
     * @return the value of INNODB_TRX.trx_requested_lock_id
     *
     * @mbg.generated
     */
    public String getTrx_requested_lock_id() {
        return trx_requested_lock_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_requested_lock_id
     *
     * @param trx_requested_lock_id the value for INNODB_TRX.trx_requested_lock_id
     *
     * @mbg.generated
     */
    public void setTrx_requested_lock_id(String trx_requested_lock_id) {
        this.trx_requested_lock_id = trx_requested_lock_id == null ? null : trx_requested_lock_id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_wait_started
     *
     * @return the value of INNODB_TRX.trx_wait_started
     *
     * @mbg.generated
     */
    public Date getTrx_wait_started() {
        return trx_wait_started;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_wait_started
     *
     * @param trx_wait_started the value for INNODB_TRX.trx_wait_started
     *
     * @mbg.generated
     */
    public void setTrx_wait_started(Date trx_wait_started) {
        this.trx_wait_started = trx_wait_started;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_weight
     *
     * @return the value of INNODB_TRX.trx_weight
     *
     * @mbg.generated
     */
    public Long getTrx_weight() {
        return trx_weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_weight
     *
     * @param trx_weight the value for INNODB_TRX.trx_weight
     *
     * @mbg.generated
     */
    public void setTrx_weight(Long trx_weight) {
        this.trx_weight = trx_weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_mysql_thread_id
     *
     * @return the value of INNODB_TRX.trx_mysql_thread_id
     *
     * @mbg.generated
     */
    public Long getTrx_mysql_thread_id() {
        return trx_mysql_thread_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_mysql_thread_id
     *
     * @param trx_mysql_thread_id the value for INNODB_TRX.trx_mysql_thread_id
     *
     * @mbg.generated
     */
    public void setTrx_mysql_thread_id(Long trx_mysql_thread_id) {
        this.trx_mysql_thread_id = trx_mysql_thread_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_query
     *
     * @return the value of INNODB_TRX.trx_query
     *
     * @mbg.generated
     */
    public String getTrx_query() {
        return trx_query;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_query
     *
     * @param trx_query the value for INNODB_TRX.trx_query
     *
     * @mbg.generated
     */
    public void setTrx_query(String trx_query) {
        this.trx_query = trx_query == null ? null : trx_query.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_operation_state
     *
     * @return the value of INNODB_TRX.trx_operation_state
     *
     * @mbg.generated
     */
    public String getTrx_operation_state() {
        return trx_operation_state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_operation_state
     *
     * @param trx_operation_state the value for INNODB_TRX.trx_operation_state
     *
     * @mbg.generated
     */
    public void setTrx_operation_state(String trx_operation_state) {
        this.trx_operation_state = trx_operation_state == null ? null : trx_operation_state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_tables_in_use
     *
     * @return the value of INNODB_TRX.trx_tables_in_use
     *
     * @mbg.generated
     */
    public Long getTrx_tables_in_use() {
        return trx_tables_in_use;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_tables_in_use
     *
     * @param trx_tables_in_use the value for INNODB_TRX.trx_tables_in_use
     *
     * @mbg.generated
     */
    public void setTrx_tables_in_use(Long trx_tables_in_use) {
        this.trx_tables_in_use = trx_tables_in_use;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_tables_locked
     *
     * @return the value of INNODB_TRX.trx_tables_locked
     *
     * @mbg.generated
     */
    public Long getTrx_tables_locked() {
        return trx_tables_locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_tables_locked
     *
     * @param trx_tables_locked the value for INNODB_TRX.trx_tables_locked
     *
     * @mbg.generated
     */
    public void setTrx_tables_locked(Long trx_tables_locked) {
        this.trx_tables_locked = trx_tables_locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_lock_structs
     *
     * @return the value of INNODB_TRX.trx_lock_structs
     *
     * @mbg.generated
     */
    public Long getTrx_lock_structs() {
        return trx_lock_structs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_lock_structs
     *
     * @param trx_lock_structs the value for INNODB_TRX.trx_lock_structs
     *
     * @mbg.generated
     */
    public void setTrx_lock_structs(Long trx_lock_structs) {
        this.trx_lock_structs = trx_lock_structs;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_lock_memory_bytes
     *
     * @return the value of INNODB_TRX.trx_lock_memory_bytes
     *
     * @mbg.generated
     */
    public Long getTrx_lock_memory_bytes() {
        return trx_lock_memory_bytes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_lock_memory_bytes
     *
     * @param trx_lock_memory_bytes the value for INNODB_TRX.trx_lock_memory_bytes
     *
     * @mbg.generated
     */
    public void setTrx_lock_memory_bytes(Long trx_lock_memory_bytes) {
        this.trx_lock_memory_bytes = trx_lock_memory_bytes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_rows_locked
     *
     * @return the value of INNODB_TRX.trx_rows_locked
     *
     * @mbg.generated
     */
    public Long getTrx_rows_locked() {
        return trx_rows_locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_rows_locked
     *
     * @param trx_rows_locked the value for INNODB_TRX.trx_rows_locked
     *
     * @mbg.generated
     */
    public void setTrx_rows_locked(Long trx_rows_locked) {
        this.trx_rows_locked = trx_rows_locked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_rows_modified
     *
     * @return the value of INNODB_TRX.trx_rows_modified
     *
     * @mbg.generated
     */
    public Long getTrx_rows_modified() {
        return trx_rows_modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_rows_modified
     *
     * @param trx_rows_modified the value for INNODB_TRX.trx_rows_modified
     *
     * @mbg.generated
     */
    public void setTrx_rows_modified(Long trx_rows_modified) {
        this.trx_rows_modified = trx_rows_modified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_concurrency_tickets
     *
     * @return the value of INNODB_TRX.trx_concurrency_tickets
     *
     * @mbg.generated
     */
    public Long getTrx_concurrency_tickets() {
        return trx_concurrency_tickets;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_concurrency_tickets
     *
     * @param trx_concurrency_tickets the value for INNODB_TRX.trx_concurrency_tickets
     *
     * @mbg.generated
     */
    public void setTrx_concurrency_tickets(Long trx_concurrency_tickets) {
        this.trx_concurrency_tickets = trx_concurrency_tickets;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_isolation_level
     *
     * @return the value of INNODB_TRX.trx_isolation_level
     *
     * @mbg.generated
     */
    public String getTrx_isolation_level() {
        return trx_isolation_level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_isolation_level
     *
     * @param trx_isolation_level the value for INNODB_TRX.trx_isolation_level
     *
     * @mbg.generated
     */
    public void setTrx_isolation_level(String trx_isolation_level) {
        this.trx_isolation_level = trx_isolation_level == null ? null : trx_isolation_level.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_unique_checks
     *
     * @return the value of INNODB_TRX.trx_unique_checks
     *
     * @mbg.generated
     */
    public Integer getTrx_unique_checks() {
        return trx_unique_checks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_unique_checks
     *
     * @param trx_unique_checks the value for INNODB_TRX.trx_unique_checks
     *
     * @mbg.generated
     */
    public void setTrx_unique_checks(Integer trx_unique_checks) {
        this.trx_unique_checks = trx_unique_checks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_foreign_key_checks
     *
     * @return the value of INNODB_TRX.trx_foreign_key_checks
     *
     * @mbg.generated
     */
    public Integer getTrx_foreign_key_checks() {
        return trx_foreign_key_checks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_foreign_key_checks
     *
     * @param trx_foreign_key_checks the value for INNODB_TRX.trx_foreign_key_checks
     *
     * @mbg.generated
     */
    public void setTrx_foreign_key_checks(Integer trx_foreign_key_checks) {
        this.trx_foreign_key_checks = trx_foreign_key_checks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_last_foreign_key_error
     *
     * @return the value of INNODB_TRX.trx_last_foreign_key_error
     *
     * @mbg.generated
     */
    public String getTrx_last_foreign_key_error() {
        return trx_last_foreign_key_error;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_last_foreign_key_error
     *
     * @param trx_last_foreign_key_error the value for INNODB_TRX.trx_last_foreign_key_error
     *
     * @mbg.generated
     */
    public void setTrx_last_foreign_key_error(String trx_last_foreign_key_error) {
        this.trx_last_foreign_key_error = trx_last_foreign_key_error == null ? null : trx_last_foreign_key_error.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_adaptive_hash_latched
     *
     * @return the value of INNODB_TRX.trx_adaptive_hash_latched
     *
     * @mbg.generated
     */
    public Integer getTrx_adaptive_hash_latched() {
        return trx_adaptive_hash_latched;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_adaptive_hash_latched
     *
     * @param trx_adaptive_hash_latched the value for INNODB_TRX.trx_adaptive_hash_latched
     *
     * @mbg.generated
     */
    public void setTrx_adaptive_hash_latched(Integer trx_adaptive_hash_latched) {
        this.trx_adaptive_hash_latched = trx_adaptive_hash_latched;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_adaptive_hash_timeout
     *
     * @return the value of INNODB_TRX.trx_adaptive_hash_timeout
     *
     * @mbg.generated
     */
    public Long getTrx_adaptive_hash_timeout() {
        return trx_adaptive_hash_timeout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_adaptive_hash_timeout
     *
     * @param trx_adaptive_hash_timeout the value for INNODB_TRX.trx_adaptive_hash_timeout
     *
     * @mbg.generated
     */
    public void setTrx_adaptive_hash_timeout(Long trx_adaptive_hash_timeout) {
        this.trx_adaptive_hash_timeout = trx_adaptive_hash_timeout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_is_read_only
     *
     * @return the value of INNODB_TRX.trx_is_read_only
     *
     * @mbg.generated
     */
    public Integer getTrx_is_read_only() {
        return trx_is_read_only;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_is_read_only
     *
     * @param trx_is_read_only the value for INNODB_TRX.trx_is_read_only
     *
     * @mbg.generated
     */
    public void setTrx_is_read_only(Integer trx_is_read_only) {
        this.trx_is_read_only = trx_is_read_only;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_TRX.trx_autocommit_non_locking
     *
     * @return the value of INNODB_TRX.trx_autocommit_non_locking
     *
     * @mbg.generated
     */
    public Integer getTrx_autocommit_non_locking() {
        return trx_autocommit_non_locking;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_TRX.trx_autocommit_non_locking
     *
     * @param trx_autocommit_non_locking the value for INNODB_TRX.trx_autocommit_non_locking
     *
     * @mbg.generated
     */
    public void setTrx_autocommit_non_locking(Integer trx_autocommit_non_locking) {
        this.trx_autocommit_non_locking = trx_autocommit_non_locking;
    }
}