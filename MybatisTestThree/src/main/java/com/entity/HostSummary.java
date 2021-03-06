package com.entity;

import java.math.BigDecimal;

public class HostSummary {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host_summary.host
     *
     * @mbg.generated
     */
    private String host;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host_summary.statements
     *
     * @mbg.generated
     */
    private BigDecimal statements;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host_summary.table_scans
     *
     * @mbg.generated
     */
    private BigDecimal table_scans;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host_summary.file_ios
     *
     * @mbg.generated
     */
    private BigDecimal file_ios;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host_summary.current_connections
     *
     * @mbg.generated
     */
    private BigDecimal current_connections;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host_summary.total_connections
     *
     * @mbg.generated
     */
    private BigDecimal total_connections;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host_summary.unique_users
     *
     * @mbg.generated
     */
    private Long unique_users;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host_summary.statement_latency
     *
     * @mbg.generated
     */
    private String statement_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host_summary.statement_avg_latency
     *
     * @mbg.generated
     */
    private String statement_avg_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host_summary.file_io_latency
     *
     * @mbg.generated
     */
    private String file_io_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host_summary.current_memory
     *
     * @mbg.generated
     */
    private String current_memory;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host_summary.total_memory_allocated
     *
     * @mbg.generated
     */
    private String total_memory_allocated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host_summary.host
     *
     * @return the value of host_summary.host
     *
     * @mbg.generated
     */
    public String getHost() {
        return host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host_summary.host
     *
     * @param host the value for host_summary.host
     *
     * @mbg.generated
     */
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host_summary.statements
     *
     * @return the value of host_summary.statements
     *
     * @mbg.generated
     */
    public BigDecimal getStatements() {
        return statements;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host_summary.statements
     *
     * @param statements the value for host_summary.statements
     *
     * @mbg.generated
     */
    public void setStatements(BigDecimal statements) {
        this.statements = statements;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host_summary.table_scans
     *
     * @return the value of host_summary.table_scans
     *
     * @mbg.generated
     */
    public BigDecimal getTable_scans() {
        return table_scans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host_summary.table_scans
     *
     * @param table_scans the value for host_summary.table_scans
     *
     * @mbg.generated
     */
    public void setTable_scans(BigDecimal table_scans) {
        this.table_scans = table_scans;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host_summary.file_ios
     *
     * @return the value of host_summary.file_ios
     *
     * @mbg.generated
     */
    public BigDecimal getFile_ios() {
        return file_ios;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host_summary.file_ios
     *
     * @param file_ios the value for host_summary.file_ios
     *
     * @mbg.generated
     */
    public void setFile_ios(BigDecimal file_ios) {
        this.file_ios = file_ios;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host_summary.current_connections
     *
     * @return the value of host_summary.current_connections
     *
     * @mbg.generated
     */
    public BigDecimal getCurrent_connections() {
        return current_connections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host_summary.current_connections
     *
     * @param current_connections the value for host_summary.current_connections
     *
     * @mbg.generated
     */
    public void setCurrent_connections(BigDecimal current_connections) {
        this.current_connections = current_connections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host_summary.total_connections
     *
     * @return the value of host_summary.total_connections
     *
     * @mbg.generated
     */
    public BigDecimal getTotal_connections() {
        return total_connections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host_summary.total_connections
     *
     * @param total_connections the value for host_summary.total_connections
     *
     * @mbg.generated
     */
    public void setTotal_connections(BigDecimal total_connections) {
        this.total_connections = total_connections;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host_summary.unique_users
     *
     * @return the value of host_summary.unique_users
     *
     * @mbg.generated
     */
    public Long getUnique_users() {
        return unique_users;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host_summary.unique_users
     *
     * @param unique_users the value for host_summary.unique_users
     *
     * @mbg.generated
     */
    public void setUnique_users(Long unique_users) {
        this.unique_users = unique_users;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host_summary.statement_latency
     *
     * @return the value of host_summary.statement_latency
     *
     * @mbg.generated
     */
    public String getStatement_latency() {
        return statement_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host_summary.statement_latency
     *
     * @param statement_latency the value for host_summary.statement_latency
     *
     * @mbg.generated
     */
    public void setStatement_latency(String statement_latency) {
        this.statement_latency = statement_latency == null ? null : statement_latency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host_summary.statement_avg_latency
     *
     * @return the value of host_summary.statement_avg_latency
     *
     * @mbg.generated
     */
    public String getStatement_avg_latency() {
        return statement_avg_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host_summary.statement_avg_latency
     *
     * @param statement_avg_latency the value for host_summary.statement_avg_latency
     *
     * @mbg.generated
     */
    public void setStatement_avg_latency(String statement_avg_latency) {
        this.statement_avg_latency = statement_avg_latency == null ? null : statement_avg_latency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host_summary.file_io_latency
     *
     * @return the value of host_summary.file_io_latency
     *
     * @mbg.generated
     */
    public String getFile_io_latency() {
        return file_io_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host_summary.file_io_latency
     *
     * @param file_io_latency the value for host_summary.file_io_latency
     *
     * @mbg.generated
     */
    public void setFile_io_latency(String file_io_latency) {
        this.file_io_latency = file_io_latency == null ? null : file_io_latency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host_summary.current_memory
     *
     * @return the value of host_summary.current_memory
     *
     * @mbg.generated
     */
    public String getCurrent_memory() {
        return current_memory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host_summary.current_memory
     *
     * @param current_memory the value for host_summary.current_memory
     *
     * @mbg.generated
     */
    public void setCurrent_memory(String current_memory) {
        this.current_memory = current_memory == null ? null : current_memory.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host_summary.total_memory_allocated
     *
     * @return the value of host_summary.total_memory_allocated
     *
     * @mbg.generated
     */
    public String getTotal_memory_allocated() {
        return total_memory_allocated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host_summary.total_memory_allocated
     *
     * @param total_memory_allocated the value for host_summary.total_memory_allocated
     *
     * @mbg.generated
     */
    public void setTotal_memory_allocated(String total_memory_allocated) {
        this.total_memory_allocated = total_memory_allocated == null ? null : total_memory_allocated.trim();
    }
}