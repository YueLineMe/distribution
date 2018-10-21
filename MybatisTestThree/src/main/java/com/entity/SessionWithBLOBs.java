package com.entity;

public class SessionWithBLOBs extends Session {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column session.current_statement
     *
     * @mbg.generated
     */
    private String current_statement;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column session.statement_latency
     *
     * @mbg.generated
     */
    private String statement_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column session.lock_latency
     *
     * @mbg.generated
     */
    private String lock_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column session.last_statement
     *
     * @mbg.generated
     */
    private String last_statement;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column session.last_statement_latency
     *
     * @mbg.generated
     */
    private String last_statement_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column session.current_memory
     *
     * @mbg.generated
     */
    private String current_memory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column session.last_wait_latency
     *
     * @mbg.generated
     */
    private String last_wait_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column session.trx_latency
     *
     * @mbg.generated
     */
    private String trx_latency;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column session.current_statement
     *
     * @return the value of session.current_statement
     *
     * @mbg.generated
     */
    public String getCurrent_statement() {
        return current_statement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column session.current_statement
     *
     * @param current_statement the value for session.current_statement
     *
     * @mbg.generated
     */
    public void setCurrent_statement(String current_statement) {
        this.current_statement = current_statement == null ? null : current_statement.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column session.statement_latency
     *
     * @return the value of session.statement_latency
     *
     * @mbg.generated
     */
    public String getStatement_latency() {
        return statement_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column session.statement_latency
     *
     * @param statement_latency the value for session.statement_latency
     *
     * @mbg.generated
     */
    public void setStatement_latency(String statement_latency) {
        this.statement_latency = statement_latency == null ? null : statement_latency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column session.lock_latency
     *
     * @return the value of session.lock_latency
     *
     * @mbg.generated
     */
    public String getLock_latency() {
        return lock_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column session.lock_latency
     *
     * @param lock_latency the value for session.lock_latency
     *
     * @mbg.generated
     */
    public void setLock_latency(String lock_latency) {
        this.lock_latency = lock_latency == null ? null : lock_latency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column session.last_statement
     *
     * @return the value of session.last_statement
     *
     * @mbg.generated
     */
    public String getLast_statement() {
        return last_statement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column session.last_statement
     *
     * @param last_statement the value for session.last_statement
     *
     * @mbg.generated
     */
    public void setLast_statement(String last_statement) {
        this.last_statement = last_statement == null ? null : last_statement.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column session.last_statement_latency
     *
     * @return the value of session.last_statement_latency
     *
     * @mbg.generated
     */
    public String getLast_statement_latency() {
        return last_statement_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column session.last_statement_latency
     *
     * @param last_statement_latency the value for session.last_statement_latency
     *
     * @mbg.generated
     */
    public void setLast_statement_latency(String last_statement_latency) {
        this.last_statement_latency = last_statement_latency == null ? null : last_statement_latency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column session.current_memory
     *
     * @return the value of session.current_memory
     *
     * @mbg.generated
     */
    public String getCurrent_memory() {
        return current_memory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column session.current_memory
     *
     * @param current_memory the value for session.current_memory
     *
     * @mbg.generated
     */
    public void setCurrent_memory(String current_memory) {
        this.current_memory = current_memory == null ? null : current_memory.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column session.last_wait_latency
     *
     * @return the value of session.last_wait_latency
     *
     * @mbg.generated
     */
    public String getLast_wait_latency() {
        return last_wait_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column session.last_wait_latency
     *
     * @param last_wait_latency the value for session.last_wait_latency
     *
     * @mbg.generated
     */
    public void setLast_wait_latency(String last_wait_latency) {
        this.last_wait_latency = last_wait_latency == null ? null : last_wait_latency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column session.trx_latency
     *
     * @return the value of session.trx_latency
     *
     * @mbg.generated
     */
    public String getTrx_latency() {
        return trx_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column session.trx_latency
     *
     * @param trx_latency the value for session.trx_latency
     *
     * @mbg.generated
     */
    public void setTrx_latency(String trx_latency) {
        this.trx_latency = trx_latency == null ? null : trx_latency.trim();
    }
}