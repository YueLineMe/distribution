package com.entity;

import java.math.BigDecimal;

public class XSchemaTableStatisticsWithBuffer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.table_schema
     *
     * @mbg.generated
     */
    private String table_schema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.table_name
     *
     * @mbg.generated
     */
    private String table_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.rows_fetched
     *
     * @mbg.generated
     */
    private Long rows_fetched;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.fetch_latency
     *
     * @mbg.generated
     */
    private Long fetch_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.rows_inserted
     *
     * @mbg.generated
     */
    private Long rows_inserted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.insert_latency
     *
     * @mbg.generated
     */
    private Long insert_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.rows_updated
     *
     * @mbg.generated
     */
    private Long rows_updated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.update_latency
     *
     * @mbg.generated
     */
    private Long update_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.rows_deleted
     *
     * @mbg.generated
     */
    private Long rows_deleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.delete_latency
     *
     * @mbg.generated
     */
    private Long delete_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.io_read_requests
     *
     * @mbg.generated
     */
    private BigDecimal io_read_requests;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.io_read
     *
     * @mbg.generated
     */
    private BigDecimal io_read;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.io_read_latency
     *
     * @mbg.generated
     */
    private BigDecimal io_read_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.io_write_requests
     *
     * @mbg.generated
     */
    private BigDecimal io_write_requests;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.io_write
     *
     * @mbg.generated
     */
    private BigDecimal io_write;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.io_write_latency
     *
     * @mbg.generated
     */
    private BigDecimal io_write_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.io_misc_requests
     *
     * @mbg.generated
     */
    private BigDecimal io_misc_requests;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.io_misc_latency
     *
     * @mbg.generated
     */
    private BigDecimal io_misc_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.innodb_buffer_allocated
     *
     * @mbg.generated
     */
    private BigDecimal innodb_buffer_allocated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.innodb_buffer_data
     *
     * @mbg.generated
     */
    private BigDecimal innodb_buffer_data;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.innodb_buffer_free
     *
     * @mbg.generated
     */
    private BigDecimal innodb_buffer_free;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.innodb_buffer_pages
     *
     * @mbg.generated
     */
    private Long innodb_buffer_pages;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.innodb_buffer_pages_hashed
     *
     * @mbg.generated
     */
    private Long innodb_buffer_pages_hashed;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.innodb_buffer_pages_old
     *
     * @mbg.generated
     */
    private Long innodb_buffer_pages_old;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$schema_table_statistics_with_buffer.innodb_buffer_rows_cached
     *
     * @mbg.generated
     */
    private BigDecimal innodb_buffer_rows_cached;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.table_schema
     *
     * @return the value of x$schema_table_statistics_with_buffer.table_schema
     *
     * @mbg.generated
     */
    public String getTable_schema() {
        return table_schema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.table_schema
     *
     * @param table_schema the value for x$schema_table_statistics_with_buffer.table_schema
     *
     * @mbg.generated
     */
    public void setTable_schema(String table_schema) {
        this.table_schema = table_schema == null ? null : table_schema.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.table_name
     *
     * @return the value of x$schema_table_statistics_with_buffer.table_name
     *
     * @mbg.generated
     */
    public String getTable_name() {
        return table_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.table_name
     *
     * @param table_name the value for x$schema_table_statistics_with_buffer.table_name
     *
     * @mbg.generated
     */
    public void setTable_name(String table_name) {
        this.table_name = table_name == null ? null : table_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.rows_fetched
     *
     * @return the value of x$schema_table_statistics_with_buffer.rows_fetched
     *
     * @mbg.generated
     */
    public Long getRows_fetched() {
        return rows_fetched;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.rows_fetched
     *
     * @param rows_fetched the value for x$schema_table_statistics_with_buffer.rows_fetched
     *
     * @mbg.generated
     */
    public void setRows_fetched(Long rows_fetched) {
        this.rows_fetched = rows_fetched;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.fetch_latency
     *
     * @return the value of x$schema_table_statistics_with_buffer.fetch_latency
     *
     * @mbg.generated
     */
    public Long getFetch_latency() {
        return fetch_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.fetch_latency
     *
     * @param fetch_latency the value for x$schema_table_statistics_with_buffer.fetch_latency
     *
     * @mbg.generated
     */
    public void setFetch_latency(Long fetch_latency) {
        this.fetch_latency = fetch_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.rows_inserted
     *
     * @return the value of x$schema_table_statistics_with_buffer.rows_inserted
     *
     * @mbg.generated
     */
    public Long getRows_inserted() {
        return rows_inserted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.rows_inserted
     *
     * @param rows_inserted the value for x$schema_table_statistics_with_buffer.rows_inserted
     *
     * @mbg.generated
     */
    public void setRows_inserted(Long rows_inserted) {
        this.rows_inserted = rows_inserted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.insert_latency
     *
     * @return the value of x$schema_table_statistics_with_buffer.insert_latency
     *
     * @mbg.generated
     */
    public Long getInsert_latency() {
        return insert_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.insert_latency
     *
     * @param insert_latency the value for x$schema_table_statistics_with_buffer.insert_latency
     *
     * @mbg.generated
     */
    public void setInsert_latency(Long insert_latency) {
        this.insert_latency = insert_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.rows_updated
     *
     * @return the value of x$schema_table_statistics_with_buffer.rows_updated
     *
     * @mbg.generated
     */
    public Long getRows_updated() {
        return rows_updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.rows_updated
     *
     * @param rows_updated the value for x$schema_table_statistics_with_buffer.rows_updated
     *
     * @mbg.generated
     */
    public void setRows_updated(Long rows_updated) {
        this.rows_updated = rows_updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.update_latency
     *
     * @return the value of x$schema_table_statistics_with_buffer.update_latency
     *
     * @mbg.generated
     */
    public Long getUpdate_latency() {
        return update_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.update_latency
     *
     * @param update_latency the value for x$schema_table_statistics_with_buffer.update_latency
     *
     * @mbg.generated
     */
    public void setUpdate_latency(Long update_latency) {
        this.update_latency = update_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.rows_deleted
     *
     * @return the value of x$schema_table_statistics_with_buffer.rows_deleted
     *
     * @mbg.generated
     */
    public Long getRows_deleted() {
        return rows_deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.rows_deleted
     *
     * @param rows_deleted the value for x$schema_table_statistics_with_buffer.rows_deleted
     *
     * @mbg.generated
     */
    public void setRows_deleted(Long rows_deleted) {
        this.rows_deleted = rows_deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.delete_latency
     *
     * @return the value of x$schema_table_statistics_with_buffer.delete_latency
     *
     * @mbg.generated
     */
    public Long getDelete_latency() {
        return delete_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.delete_latency
     *
     * @param delete_latency the value for x$schema_table_statistics_with_buffer.delete_latency
     *
     * @mbg.generated
     */
    public void setDelete_latency(Long delete_latency) {
        this.delete_latency = delete_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.io_read_requests
     *
     * @return the value of x$schema_table_statistics_with_buffer.io_read_requests
     *
     * @mbg.generated
     */
    public BigDecimal getIo_read_requests() {
        return io_read_requests;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.io_read_requests
     *
     * @param io_read_requests the value for x$schema_table_statistics_with_buffer.io_read_requests
     *
     * @mbg.generated
     */
    public void setIo_read_requests(BigDecimal io_read_requests) {
        this.io_read_requests = io_read_requests;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.io_read
     *
     * @return the value of x$schema_table_statistics_with_buffer.io_read
     *
     * @mbg.generated
     */
    public BigDecimal getIo_read() {
        return io_read;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.io_read
     *
     * @param io_read the value for x$schema_table_statistics_with_buffer.io_read
     *
     * @mbg.generated
     */
    public void setIo_read(BigDecimal io_read) {
        this.io_read = io_read;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.io_read_latency
     *
     * @return the value of x$schema_table_statistics_with_buffer.io_read_latency
     *
     * @mbg.generated
     */
    public BigDecimal getIo_read_latency() {
        return io_read_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.io_read_latency
     *
     * @param io_read_latency the value for x$schema_table_statistics_with_buffer.io_read_latency
     *
     * @mbg.generated
     */
    public void setIo_read_latency(BigDecimal io_read_latency) {
        this.io_read_latency = io_read_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.io_write_requests
     *
     * @return the value of x$schema_table_statistics_with_buffer.io_write_requests
     *
     * @mbg.generated
     */
    public BigDecimal getIo_write_requests() {
        return io_write_requests;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.io_write_requests
     *
     * @param io_write_requests the value for x$schema_table_statistics_with_buffer.io_write_requests
     *
     * @mbg.generated
     */
    public void setIo_write_requests(BigDecimal io_write_requests) {
        this.io_write_requests = io_write_requests;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.io_write
     *
     * @return the value of x$schema_table_statistics_with_buffer.io_write
     *
     * @mbg.generated
     */
    public BigDecimal getIo_write() {
        return io_write;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.io_write
     *
     * @param io_write the value for x$schema_table_statistics_with_buffer.io_write
     *
     * @mbg.generated
     */
    public void setIo_write(BigDecimal io_write) {
        this.io_write = io_write;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.io_write_latency
     *
     * @return the value of x$schema_table_statistics_with_buffer.io_write_latency
     *
     * @mbg.generated
     */
    public BigDecimal getIo_write_latency() {
        return io_write_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.io_write_latency
     *
     * @param io_write_latency the value for x$schema_table_statistics_with_buffer.io_write_latency
     *
     * @mbg.generated
     */
    public void setIo_write_latency(BigDecimal io_write_latency) {
        this.io_write_latency = io_write_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.io_misc_requests
     *
     * @return the value of x$schema_table_statistics_with_buffer.io_misc_requests
     *
     * @mbg.generated
     */
    public BigDecimal getIo_misc_requests() {
        return io_misc_requests;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.io_misc_requests
     *
     * @param io_misc_requests the value for x$schema_table_statistics_with_buffer.io_misc_requests
     *
     * @mbg.generated
     */
    public void setIo_misc_requests(BigDecimal io_misc_requests) {
        this.io_misc_requests = io_misc_requests;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.io_misc_latency
     *
     * @return the value of x$schema_table_statistics_with_buffer.io_misc_latency
     *
     * @mbg.generated
     */
    public BigDecimal getIo_misc_latency() {
        return io_misc_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.io_misc_latency
     *
     * @param io_misc_latency the value for x$schema_table_statistics_with_buffer.io_misc_latency
     *
     * @mbg.generated
     */
    public void setIo_misc_latency(BigDecimal io_misc_latency) {
        this.io_misc_latency = io_misc_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.innodb_buffer_allocated
     *
     * @return the value of x$schema_table_statistics_with_buffer.innodb_buffer_allocated
     *
     * @mbg.generated
     */
    public BigDecimal getInnodb_buffer_allocated() {
        return innodb_buffer_allocated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.innodb_buffer_allocated
     *
     * @param innodb_buffer_allocated the value for x$schema_table_statistics_with_buffer.innodb_buffer_allocated
     *
     * @mbg.generated
     */
    public void setInnodb_buffer_allocated(BigDecimal innodb_buffer_allocated) {
        this.innodb_buffer_allocated = innodb_buffer_allocated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.innodb_buffer_data
     *
     * @return the value of x$schema_table_statistics_with_buffer.innodb_buffer_data
     *
     * @mbg.generated
     */
    public BigDecimal getInnodb_buffer_data() {
        return innodb_buffer_data;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.innodb_buffer_data
     *
     * @param innodb_buffer_data the value for x$schema_table_statistics_with_buffer.innodb_buffer_data
     *
     * @mbg.generated
     */
    public void setInnodb_buffer_data(BigDecimal innodb_buffer_data) {
        this.innodb_buffer_data = innodb_buffer_data;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.innodb_buffer_free
     *
     * @return the value of x$schema_table_statistics_with_buffer.innodb_buffer_free
     *
     * @mbg.generated
     */
    public BigDecimal getInnodb_buffer_free() {
        return innodb_buffer_free;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.innodb_buffer_free
     *
     * @param innodb_buffer_free the value for x$schema_table_statistics_with_buffer.innodb_buffer_free
     *
     * @mbg.generated
     */
    public void setInnodb_buffer_free(BigDecimal innodb_buffer_free) {
        this.innodb_buffer_free = innodb_buffer_free;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.innodb_buffer_pages
     *
     * @return the value of x$schema_table_statistics_with_buffer.innodb_buffer_pages
     *
     * @mbg.generated
     */
    public Long getInnodb_buffer_pages() {
        return innodb_buffer_pages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.innodb_buffer_pages
     *
     * @param innodb_buffer_pages the value for x$schema_table_statistics_with_buffer.innodb_buffer_pages
     *
     * @mbg.generated
     */
    public void setInnodb_buffer_pages(Long innodb_buffer_pages) {
        this.innodb_buffer_pages = innodb_buffer_pages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.innodb_buffer_pages_hashed
     *
     * @return the value of x$schema_table_statistics_with_buffer.innodb_buffer_pages_hashed
     *
     * @mbg.generated
     */
    public Long getInnodb_buffer_pages_hashed() {
        return innodb_buffer_pages_hashed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.innodb_buffer_pages_hashed
     *
     * @param innodb_buffer_pages_hashed the value for x$schema_table_statistics_with_buffer.innodb_buffer_pages_hashed
     *
     * @mbg.generated
     */
    public void setInnodb_buffer_pages_hashed(Long innodb_buffer_pages_hashed) {
        this.innodb_buffer_pages_hashed = innodb_buffer_pages_hashed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.innodb_buffer_pages_old
     *
     * @return the value of x$schema_table_statistics_with_buffer.innodb_buffer_pages_old
     *
     * @mbg.generated
     */
    public Long getInnodb_buffer_pages_old() {
        return innodb_buffer_pages_old;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.innodb_buffer_pages_old
     *
     * @param innodb_buffer_pages_old the value for x$schema_table_statistics_with_buffer.innodb_buffer_pages_old
     *
     * @mbg.generated
     */
    public void setInnodb_buffer_pages_old(Long innodb_buffer_pages_old) {
        this.innodb_buffer_pages_old = innodb_buffer_pages_old;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$schema_table_statistics_with_buffer.innodb_buffer_rows_cached
     *
     * @return the value of x$schema_table_statistics_with_buffer.innodb_buffer_rows_cached
     *
     * @mbg.generated
     */
    public BigDecimal getInnodb_buffer_rows_cached() {
        return innodb_buffer_rows_cached;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$schema_table_statistics_with_buffer.innodb_buffer_rows_cached
     *
     * @param innodb_buffer_rows_cached the value for x$schema_table_statistics_with_buffer.innodb_buffer_rows_cached
     *
     * @mbg.generated
     */
    public void setInnodb_buffer_rows_cached(BigDecimal innodb_buffer_rows_cached) {
        this.innodb_buffer_rows_cached = innodb_buffer_rows_cached;
    }
}