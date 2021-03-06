package com.entity;

import java.math.BigDecimal;

public class XProcesslist {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.thd_id
     *
     * @mbg.generated
     */
    private Long thd_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.conn_id
     *
     * @mbg.generated
     */
    private Long conn_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.user
     *
     * @mbg.generated
     */
    private String user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.db
     *
     * @mbg.generated
     */
    private String db;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.command
     *
     * @mbg.generated
     */
    private String command;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.state
     *
     * @mbg.generated
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.time
     *
     * @mbg.generated
     */
    private Long time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.statement_latency
     *
     * @mbg.generated
     */
    private Long statement_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.progress
     *
     * @mbg.generated
     */
    private BigDecimal progress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.lock_latency
     *
     * @mbg.generated
     */
    private Long lock_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.rows_examined
     *
     * @mbg.generated
     */
    private Long rows_examined;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.rows_sent
     *
     * @mbg.generated
     */
    private Long rows_sent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.rows_affected
     *
     * @mbg.generated
     */
    private Long rows_affected;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.tmp_tables
     *
     * @mbg.generated
     */
    private Long tmp_tables;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.tmp_disk_tables
     *
     * @mbg.generated
     */
    private Long tmp_disk_tables;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.full_scan
     *
     * @mbg.generated
     */
    private String full_scan;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.last_statement_latency
     *
     * @mbg.generated
     */
    private Long last_statement_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.current_memory
     *
     * @mbg.generated
     */
    private BigDecimal current_memory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.last_wait
     *
     * @mbg.generated
     */
    private String last_wait;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.last_wait_latency
     *
     * @mbg.generated
     */
    private String last_wait_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.source
     *
     * @mbg.generated
     */
    private String source;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.trx_latency
     *
     * @mbg.generated
     */
    private Long trx_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.trx_state
     *
     * @mbg.generated
     */
    private String trx_state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.trx_autocommit
     *
     * @mbg.generated
     */
    private String trx_autocommit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.pid
     *
     * @mbg.generated
     */
    private String pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.program_name
     *
     * @mbg.generated
     */
    private String program_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.current_statement
     *
     * @mbg.generated
     */
    private String current_statement;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$processlist.last_statement
     *
     * @mbg.generated
     */
    private String last_statement;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.thd_id
     *
     * @return the value of x$processlist.thd_id
     *
     * @mbg.generated
     */
    public Long getThd_id() {
        return thd_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.thd_id
     *
     * @param thd_id the value for x$processlist.thd_id
     *
     * @mbg.generated
     */
    public void setThd_id(Long thd_id) {
        this.thd_id = thd_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.conn_id
     *
     * @return the value of x$processlist.conn_id
     *
     * @mbg.generated
     */
    public Long getConn_id() {
        return conn_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.conn_id
     *
     * @param conn_id the value for x$processlist.conn_id
     *
     * @mbg.generated
     */
    public void setConn_id(Long conn_id) {
        this.conn_id = conn_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.user
     *
     * @return the value of x$processlist.user
     *
     * @mbg.generated
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.user
     *
     * @param user the value for x$processlist.user
     *
     * @mbg.generated
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.db
     *
     * @return the value of x$processlist.db
     *
     * @mbg.generated
     */
    public String getDb() {
        return db;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.db
     *
     * @param db the value for x$processlist.db
     *
     * @mbg.generated
     */
    public void setDb(String db) {
        this.db = db == null ? null : db.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.command
     *
     * @return the value of x$processlist.command
     *
     * @mbg.generated
     */
    public String getCommand() {
        return command;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.command
     *
     * @param command the value for x$processlist.command
     *
     * @mbg.generated
     */
    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.state
     *
     * @return the value of x$processlist.state
     *
     * @mbg.generated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.state
     *
     * @param state the value for x$processlist.state
     *
     * @mbg.generated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.time
     *
     * @return the value of x$processlist.time
     *
     * @mbg.generated
     */
    public Long getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.time
     *
     * @param time the value for x$processlist.time
     *
     * @mbg.generated
     */
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.statement_latency
     *
     * @return the value of x$processlist.statement_latency
     *
     * @mbg.generated
     */
    public Long getStatement_latency() {
        return statement_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.statement_latency
     *
     * @param statement_latency the value for x$processlist.statement_latency
     *
     * @mbg.generated
     */
    public void setStatement_latency(Long statement_latency) {
        this.statement_latency = statement_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.progress
     *
     * @return the value of x$processlist.progress
     *
     * @mbg.generated
     */
    public BigDecimal getProgress() {
        return progress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.progress
     *
     * @param progress the value for x$processlist.progress
     *
     * @mbg.generated
     */
    public void setProgress(BigDecimal progress) {
        this.progress = progress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.lock_latency
     *
     * @return the value of x$processlist.lock_latency
     *
     * @mbg.generated
     */
    public Long getLock_latency() {
        return lock_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.lock_latency
     *
     * @param lock_latency the value for x$processlist.lock_latency
     *
     * @mbg.generated
     */
    public void setLock_latency(Long lock_latency) {
        this.lock_latency = lock_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.rows_examined
     *
     * @return the value of x$processlist.rows_examined
     *
     * @mbg.generated
     */
    public Long getRows_examined() {
        return rows_examined;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.rows_examined
     *
     * @param rows_examined the value for x$processlist.rows_examined
     *
     * @mbg.generated
     */
    public void setRows_examined(Long rows_examined) {
        this.rows_examined = rows_examined;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.rows_sent
     *
     * @return the value of x$processlist.rows_sent
     *
     * @mbg.generated
     */
    public Long getRows_sent() {
        return rows_sent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.rows_sent
     *
     * @param rows_sent the value for x$processlist.rows_sent
     *
     * @mbg.generated
     */
    public void setRows_sent(Long rows_sent) {
        this.rows_sent = rows_sent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.rows_affected
     *
     * @return the value of x$processlist.rows_affected
     *
     * @mbg.generated
     */
    public Long getRows_affected() {
        return rows_affected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.rows_affected
     *
     * @param rows_affected the value for x$processlist.rows_affected
     *
     * @mbg.generated
     */
    public void setRows_affected(Long rows_affected) {
        this.rows_affected = rows_affected;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.tmp_tables
     *
     * @return the value of x$processlist.tmp_tables
     *
     * @mbg.generated
     */
    public Long getTmp_tables() {
        return tmp_tables;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.tmp_tables
     *
     * @param tmp_tables the value for x$processlist.tmp_tables
     *
     * @mbg.generated
     */
    public void setTmp_tables(Long tmp_tables) {
        this.tmp_tables = tmp_tables;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.tmp_disk_tables
     *
     * @return the value of x$processlist.tmp_disk_tables
     *
     * @mbg.generated
     */
    public Long getTmp_disk_tables() {
        return tmp_disk_tables;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.tmp_disk_tables
     *
     * @param tmp_disk_tables the value for x$processlist.tmp_disk_tables
     *
     * @mbg.generated
     */
    public void setTmp_disk_tables(Long tmp_disk_tables) {
        this.tmp_disk_tables = tmp_disk_tables;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.full_scan
     *
     * @return the value of x$processlist.full_scan
     *
     * @mbg.generated
     */
    public String getFull_scan() {
        return full_scan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.full_scan
     *
     * @param full_scan the value for x$processlist.full_scan
     *
     * @mbg.generated
     */
    public void setFull_scan(String full_scan) {
        this.full_scan = full_scan == null ? null : full_scan.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.last_statement_latency
     *
     * @return the value of x$processlist.last_statement_latency
     *
     * @mbg.generated
     */
    public Long getLast_statement_latency() {
        return last_statement_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.last_statement_latency
     *
     * @param last_statement_latency the value for x$processlist.last_statement_latency
     *
     * @mbg.generated
     */
    public void setLast_statement_latency(Long last_statement_latency) {
        this.last_statement_latency = last_statement_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.current_memory
     *
     * @return the value of x$processlist.current_memory
     *
     * @mbg.generated
     */
    public BigDecimal getCurrent_memory() {
        return current_memory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.current_memory
     *
     * @param current_memory the value for x$processlist.current_memory
     *
     * @mbg.generated
     */
    public void setCurrent_memory(BigDecimal current_memory) {
        this.current_memory = current_memory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.last_wait
     *
     * @return the value of x$processlist.last_wait
     *
     * @mbg.generated
     */
    public String getLast_wait() {
        return last_wait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.last_wait
     *
     * @param last_wait the value for x$processlist.last_wait
     *
     * @mbg.generated
     */
    public void setLast_wait(String last_wait) {
        this.last_wait = last_wait == null ? null : last_wait.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.last_wait_latency
     *
     * @return the value of x$processlist.last_wait_latency
     *
     * @mbg.generated
     */
    public String getLast_wait_latency() {
        return last_wait_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.last_wait_latency
     *
     * @param last_wait_latency the value for x$processlist.last_wait_latency
     *
     * @mbg.generated
     */
    public void setLast_wait_latency(String last_wait_latency) {
        this.last_wait_latency = last_wait_latency == null ? null : last_wait_latency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.source
     *
     * @return the value of x$processlist.source
     *
     * @mbg.generated
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.source
     *
     * @param source the value for x$processlist.source
     *
     * @mbg.generated
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.trx_latency
     *
     * @return the value of x$processlist.trx_latency
     *
     * @mbg.generated
     */
    public Long getTrx_latency() {
        return trx_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.trx_latency
     *
     * @param trx_latency the value for x$processlist.trx_latency
     *
     * @mbg.generated
     */
    public void setTrx_latency(Long trx_latency) {
        this.trx_latency = trx_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.trx_state
     *
     * @return the value of x$processlist.trx_state
     *
     * @mbg.generated
     */
    public String getTrx_state() {
        return trx_state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.trx_state
     *
     * @param trx_state the value for x$processlist.trx_state
     *
     * @mbg.generated
     */
    public void setTrx_state(String trx_state) {
        this.trx_state = trx_state == null ? null : trx_state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.trx_autocommit
     *
     * @return the value of x$processlist.trx_autocommit
     *
     * @mbg.generated
     */
    public String getTrx_autocommit() {
        return trx_autocommit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.trx_autocommit
     *
     * @param trx_autocommit the value for x$processlist.trx_autocommit
     *
     * @mbg.generated
     */
    public void setTrx_autocommit(String trx_autocommit) {
        this.trx_autocommit = trx_autocommit == null ? null : trx_autocommit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.pid
     *
     * @return the value of x$processlist.pid
     *
     * @mbg.generated
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.pid
     *
     * @param pid the value for x$processlist.pid
     *
     * @mbg.generated
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.program_name
     *
     * @return the value of x$processlist.program_name
     *
     * @mbg.generated
     */
    public String getProgram_name() {
        return program_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.program_name
     *
     * @param program_name the value for x$processlist.program_name
     *
     * @mbg.generated
     */
    public void setProgram_name(String program_name) {
        this.program_name = program_name == null ? null : program_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.current_statement
     *
     * @return the value of x$processlist.current_statement
     *
     * @mbg.generated
     */
    public String getCurrent_statement() {
        return current_statement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.current_statement
     *
     * @param current_statement the value for x$processlist.current_statement
     *
     * @mbg.generated
     */
    public void setCurrent_statement(String current_statement) {
        this.current_statement = current_statement == null ? null : current_statement.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$processlist.last_statement
     *
     * @return the value of x$processlist.last_statement
     *
     * @mbg.generated
     */
    public String getLast_statement() {
        return last_statement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$processlist.last_statement
     *
     * @param last_statement the value for x$processlist.last_statement
     *
     * @mbg.generated
     */
    public void setLast_statement(String last_statement) {
        this.last_statement = last_statement == null ? null : last_statement.trim();
    }
}