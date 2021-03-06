package com.entity;

import java.math.BigDecimal;

public class XSchemaTableStatistics {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics.table_schema
     *
     * @mbg.generated
     */
    private String table_schema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics.table_name
     *
     * @mbg.generated
     */
    private String table_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics.total_latency
     *
     * @mbg.generated
     */
    private Long total_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics.rows_fetched
     *
     * @mbg.generated
     */
    private Long rows_fetched;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics.fetch_latency
     *
     * @mbg.generated
     */
    private Long fetch_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics.rows_inserted
     *
     * @mbg.generated
     */
    private Long rows_inserted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics.insert_latency
     *
     * @mbg.generated
     */
    private Long insert_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics.rows_updated
     *
     * @mbg.generated
     */
    private Long rows_updated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics.update_latency
     *
     * @mbg.generated
     */
    private Long update_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics.rows_deleted
     *
     * @mbg.generated
     */
    private Long rows_deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics.delete_latency
     *
     * @mbg.generated
     */
    private Long delete_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics.io_read_requests
     *
     * @mbg.generated
     */
    private BigDecimal io_read_requests;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics.io_read
     *
     * @mbg.generated
     */
    private BigDecimal io_read;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics.io_read_latency
     *
     * @mbg.generated
     */
    private BigDecimal io_read_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics.io_write_requests
     *
     * @mbg.generated
     */
    private BigDecimal io_write_requests;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics.io_write
     *
     * @mbg.generated
     */
    private BigDecimal io_write;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics.io_write_latency
     *
     * @mbg.generated
     */
    private BigDecimal io_write_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics.io_misc_requests
     *
     * @mbg.generated
     */
    private BigDecimal io_misc_requests;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics.io_misc_latency
     *
     * @mbg.generated
     */
    private BigDecimal io_misc_latency;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics.table_schema
     *
     * @return the value of x$schema_table_statistics.table_schema
     *
     * @mbg.generated
     */
    public String getTable_schema() {
        return table_schema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics.table_schema
     *
     * @param table_schema the value for x$schema_table_statistics.table_schema
     *
     * @mbg.generated
     */
    public void setTable_schema(String table_schema) {
        this.table_schema = table_schema == null ? null : table_schema.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics.table_name
     *
     * @return the value of x$schema_table_statistics.table_name
     *
     * @mbg.generated
     */
    public String getTable_name() {
        return table_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics.table_name
     *
     * @param table_name the value for x$schema_table_statistics.table_name
     *
     * @mbg.generated
     */
    public void setTable_name(String table_name) {
        this.table_name = table_name == null ? null : table_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics.total_latency
     *
     * @return the value of x$schema_table_statistics.total_latency
     *
     * @mbg.generated
     */
    public Long getTotal_latency() {
        return total_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics.total_latency
     *
     * @param total_latency the value for x$schema_table_statistics.total_latency
     *
     * @mbg.generated
     */
    public void setTotal_latency(Long total_latency) {
        this.total_latency = total_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics.rows_fetched
     *
     * @return the value of x$schema_table_statistics.rows_fetched
     *
     * @mbg.generated
     */
    public Long getRows_fetched() {
        return rows_fetched;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics.rows_fetched
     *
     * @param rows_fetched the value for x$schema_table_statistics.rows_fetched
     *
     * @mbg.generated
     */
    public void setRows_fetched(Long rows_fetched) {
        this.rows_fetched = rows_fetched;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics.fetch_latency
     *
     * @return the value of x$schema_table_statistics.fetch_latency
     *
     * @mbg.generated
     */
    public Long getFetch_latency() {
        return fetch_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics.fetch_latency
     *
     * @param fetch_latency the value for x$schema_table_statistics.fetch_latency
     *
     * @mbg.generated
     */
    public void setFetch_latency(Long fetch_latency) {
        this.fetch_latency = fetch_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics.rows_inserted
     *
     * @return the value of x$schema_table_statistics.rows_inserted
     *
     * @mbg.generated
     */
    public Long getRows_inserted() {
        return rows_inserted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics.rows_inserted
     *
     * @param rows_inserted the value for x$schema_table_statistics.rows_inserted
     *
     * @mbg.generated
     */
    public void setRows_inserted(Long rows_inserted) {
        this.rows_inserted = rows_inserted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics.insert_latency
     *
     * @return the value of x$schema_table_statistics.insert_latency
     *
     * @mbg.generated
     */
    public Long getInsert_latency() {
        return insert_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics.insert_latency
     *
     * @param insert_latency the value for x$schema_table_statistics.insert_latency
     *
     * @mbg.generated
     */
    public void setInsert_latency(Long insert_latency) {
        this.insert_latency = insert_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics.rows_updated
     *
     * @return the value of x$schema_table_statistics.rows_updated
     *
     * @mbg.generated
     */
    public Long getRows_updated() {
        return rows_updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics.rows_updated
     *
     * @param rows_updated the value for x$schema_table_statistics.rows_updated
     *
     * @mbg.generated
     */
    public void setRows_updated(Long rows_updated) {
        this.rows_updated = rows_updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics.update_latency
     *
     * @return the value of x$schema_table_statistics.update_latency
     *
     * @mbg.generated
     */
    public Long getUpdate_latency() {
        return update_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics.update_latency
     *
     * @param update_latency the value for x$schema_table_statistics.update_latency
     *
     * @mbg.generated
     */
    public void setUpdate_latency(Long update_latency) {
        this.update_latency = update_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics.rows_deleted
     *
     * @return the value of x$schema_table_statistics.rows_deleted
     *
     * @mbg.generated
     */
    public Long getRows_deleted() {
        return rows_deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics.rows_deleted
     *
     * @param rows_deleted the value for x$schema_table_statistics.rows_deleted
     *
     * @mbg.generated
     */
    public void setRows_deleted(Long rows_deleted) {
        this.rows_deleted = rows_deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics.delete_latency
     *
     * @return the value of x$schema_table_statistics.delete_latency
     *
     * @mbg.generated
     */
    public Long getDelete_latency() {
        return delete_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics.delete_latency
     *
     * @param delete_latency the value for x$schema_table_statistics.delete_latency
     *
     * @mbg.generated
     */
    public void setDelete_latency(Long delete_latency) {
        this.delete_latency = delete_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics.io_read_requests
     *
     * @return the value of x$schema_table_statistics.io_read_requests
     *
     * @mbg.generated
     */
    public BigDecimal getIo_read_requests() {
        return io_read_requests;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics.io_read_requests
     *
     * @param io_read_requests the value for x$schema_table_statistics.io_read_requests
     *
     * @mbg.generated
     */
    public void setIo_read_requests(BigDecimal io_read_requests) {
        this.io_read_requests = io_read_requests;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics.io_read
     *
     * @return the value of x$schema_table_statistics.io_read
     *
     * @mbg.generated
     */
    public BigDecimal getIo_read() {
        return io_read;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics.io_read
     *
     * @param io_read the value for x$schema_table_statistics.io_read
     *
     * @mbg.generated
     */
    public void setIo_read(BigDecimal io_read) {
        this.io_read = io_read;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics.io_read_latency
     *
     * @return the value of x$schema_table_statistics.io_read_latency
     *
     * @mbg.generated
     */
    public BigDecimal getIo_read_latency() {
        return io_read_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics.io_read_latency
     *
     * @param io_read_latency the value for x$schema_table_statistics.io_read_latency
     *
     * @mbg.generated
     */
    public void setIo_read_latency(BigDecimal io_read_latency) {
        this.io_read_latency = io_read_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics.io_write_requests
     *
     * @return the value of x$schema_table_statistics.io_write_requests
     *
     * @mbg.generated
     */
    public BigDecimal getIo_write_requests() {
        return io_write_requests;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics.io_write_requests
     *
     * @param io_write_requests the value for x$schema_table_statistics.io_write_requests
     *
     * @mbg.generated
     */
    public void setIo_write_requests(BigDecimal io_write_requests) {
        this.io_write_requests = io_write_requests;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics.io_write
     *
     * @return the value of x$schema_table_statistics.io_write
     *
     * @mbg.generated
     */
    public BigDecimal getIo_write() {
        return io_write;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics.io_write
     *
     * @param io_write the value for x$schema_table_statistics.io_write
     *
     * @mbg.generated
     */
    public void setIo_write(BigDecimal io_write) {
        this.io_write = io_write;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics.io_write_latency
     *
     * @return the value of x$schema_table_statistics.io_write_latency
     *
     * @mbg.generated
     */
    public BigDecimal getIo_write_latency() {
        return io_write_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics.io_write_latency
     *
     * @param io_write_latency the value for x$schema_table_statistics.io_write_latency
     *
     * @mbg.generated
     */
    public void setIo_write_latency(BigDecimal io_write_latency) {
        this.io_write_latency = io_write_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics.io_misc_requests
     *
     * @return the value of x$schema_table_statistics.io_misc_requests
     *
     * @mbg.generated
     */
    public BigDecimal getIo_misc_requests() {
        return io_misc_requests;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics.io_misc_requests
     *
     * @param io_misc_requests the value for x$schema_table_statistics.io_misc_requests
     *
     * @mbg.generated
     */
    public void setIo_misc_requests(BigDecimal io_misc_requests) {
        this.io_misc_requests = io_misc_requests;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics.io_misc_latency
     *
     * @return the value of x$schema_table_statistics.io_misc_latency
     *
     * @mbg.generated
     */
    public BigDecimal getIo_misc_latency() {
        return io_misc_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics.io_misc_latency
     *
     * @param io_misc_latency the value for x$schema_table_statistics.io_misc_latency
     *
     * @mbg.generated
     */
    public void setIo_misc_latency(BigDecimal io_misc_latency) {
        this.io_misc_latency = io_misc_latency;
    }
}