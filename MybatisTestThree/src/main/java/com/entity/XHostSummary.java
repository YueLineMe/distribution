package com.entity;

import java.math.BigDecimal;

public class XHostSummary {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$host_summary.host
     *
     * @mbg.generated
     */
    private String host;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$host_summary.statements
     *
     * @mbg.generated
     */
    private BigDecimal statements;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$host_summary.statement_latency
     *
     * @mbg.generated
     */
    private BigDecimal statement_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$host_summary.statement_avg_latency
     *
     * @mbg.generated
     */
    private BigDecimal statement_avg_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$host_summary.table_scans
     *
     * @mbg.generated
     */
    private BigDecimal table_scans;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$host_summary.file_ios
     *
     * @mbg.generated
     */
    private BigDecimal file_ios;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$host_summary.file_io_latency
     *
     * @mbg.generated
     */
    private BigDecimal file_io_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$host_summary.current_connections
     *
     * @mbg.generated
     */
    private BigDecimal current_connections;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$host_summary.total_connections
     *
     * @mbg.generated
     */
    private BigDecimal total_connections;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$host_summary.unique_users
     *
     * @mbg.generated
     */
    private Long unique_users;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$host_summary.current_memory
     *
     * @mbg.generated
     */
    private BigDecimal current_memory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$host_summary.total_memory_allocated
     *
     * @mbg.generated
     */
    private BigDecimal total_memory_allocated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$host_summary.host
     *
     * @return the value of x$host_summary.host
     *
     * @mbg.generated
     */
    public String getHost() {
        return host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$host_summary.host
     *
     * @param host the value for x$host_summary.host
     *
     * @mbg.generated
     */
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$host_summary.statements
     *
     * @return the value of x$host_summary.statements
     *
     * @mbg.generated
     */
    public BigDecimal getStatements() {
        return statements;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$host_summary.statements
     *
     * @param statements the value for x$host_summary.statements
     *
     * @mbg.generated
     */
    public void setStatements(BigDecimal statements) {
        this.statements = statements;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$host_summary.statement_latency
     *
     * @return the value of x$host_summary.statement_latency
     *
     * @mbg.generated
     */
    public BigDecimal getStatement_latency() {
        return statement_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$host_summary.statement_latency
     *
     * @param statement_latency the value for x$host_summary.statement_latency
     *
     * @mbg.generated
     */
    public void setStatement_latency(BigDecimal statement_latency) {
        this.statement_latency = statement_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$host_summary.statement_avg_latency
     *
     * @return the value of x$host_summary.statement_avg_latency
     *
     * @mbg.generated
     */
    public BigDecimal getStatement_avg_latency() {
        return statement_avg_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$host_summary.statement_avg_latency
     *
     * @param statement_avg_latency the value for x$host_summary.statement_avg_latency
     *
     * @mbg.generated
     */
    public void setStatement_avg_latency(BigDecimal statement_avg_latency) {
        this.statement_avg_latency = statement_avg_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$host_summary.table_scans
     *
     * @return the value of x$host_summary.table_scans
     *
     * @mbg.generated
     */
    public BigDecimal getTable_scans() {
        return table_scans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$host_summary.table_scans
     *
     * @param table_scans the value for x$host_summary.table_scans
     *
     * @mbg.generated
     */
    public void setTable_scans(BigDecimal table_scans) {
        this.table_scans = table_scans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$host_summary.file_ios
     *
     * @return the value of x$host_summary.file_ios
     *
     * @mbg.generated
     */
    public BigDecimal getFile_ios() {
        return file_ios;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$host_summary.file_ios
     *
     * @param file_ios the value for x$host_summary.file_ios
     *
     * @mbg.generated
     */
    public void setFile_ios(BigDecimal file_ios) {
        this.file_ios = file_ios;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$host_summary.file_io_latency
     *
     * @return the value of x$host_summary.file_io_latency
     *
     * @mbg.generated
     */
    public BigDecimal getFile_io_latency() {
        return file_io_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$host_summary.file_io_latency
     *
     * @param file_io_latency the value for x$host_summary.file_io_latency
     *
     * @mbg.generated
     */
    public void setFile_io_latency(BigDecimal file_io_latency) {
        this.file_io_latency = file_io_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$host_summary.current_connections
     *
     * @return the value of x$host_summary.current_connections
     *
     * @mbg.generated
     */
    public BigDecimal getCurrent_connections() {
        return current_connections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$host_summary.current_connections
     *
     * @param current_connections the value for x$host_summary.current_connections
     *
     * @mbg.generated
     */
    public void setCurrent_connections(BigDecimal current_connections) {
        this.current_connections = current_connections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$host_summary.total_connections
     *
     * @return the value of x$host_summary.total_connections
     *
     * @mbg.generated
     */
    public BigDecimal getTotal_connections() {
        return total_connections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$host_summary.total_connections
     *
     * @param total_connections the value for x$host_summary.total_connections
     *
     * @mbg.generated
     */
    public void setTotal_connections(BigDecimal total_connections) {
        this.total_connections = total_connections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$host_summary.unique_users
     *
     * @return the value of x$host_summary.unique_users
     *
     * @mbg.generated
     */
    public Long getUnique_users() {
        return unique_users;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$host_summary.unique_users
     *
     * @param unique_users the value for x$host_summary.unique_users
     *
     * @mbg.generated
     */
    public void setUnique_users(Long unique_users) {
        this.unique_users = unique_users;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$host_summary.current_memory
     *
     * @return the value of x$host_summary.current_memory
     *
     * @mbg.generated
     */
    public BigDecimal getCurrent_memory() {
        return current_memory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$host_summary.current_memory
     *
     * @param current_memory the value for x$host_summary.current_memory
     *
     * @mbg.generated
     */
    public void setCurrent_memory(BigDecimal current_memory) {
        this.current_memory = current_memory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$host_summary.total_memory_allocated
     *
     * @return the value of x$host_summary.total_memory_allocated
     *
     * @mbg.generated
     */
    public BigDecimal getTotal_memory_allocated() {
        return total_memory_allocated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$host_summary.total_memory_allocated
     *
     * @param total_memory_allocated the value for x$host_summary.total_memory_allocated
     *
     * @mbg.generated
     */
    public void setTotal_memory_allocated(BigDecimal total_memory_allocated) {
        this.total_memory_allocated = total_memory_allocated;
    }
}