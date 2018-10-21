package com.entity;

import java.math.BigDecimal;
import java.util.Date;

public class StatementsWithFullTableScans {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_full_table_scans.db
     *
     * @mbg.generated
     */
    private String db;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_full_table_scans.exec_count
     *
     * @mbg.generated
     */
    private Long exec_count;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_full_table_scans.no_index_used_count
     *
     * @mbg.generated
     */
    private Long no_index_used_count;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_full_table_scans.no_good_index_used_count
     *
     * @mbg.generated
     */
    private Long no_good_index_used_count;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_full_table_scans.no_index_used_pct
     *
     * @mbg.generated
     */
    private BigDecimal no_index_used_pct;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_full_table_scans.rows_sent
     *
     * @mbg.generated
     */
    private Long rows_sent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_full_table_scans.rows_examined
     *
     * @mbg.generated
     */
    private Long rows_examined;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_full_table_scans.rows_sent_avg
     *
     * @mbg.generated
     */
    private BigDecimal rows_sent_avg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_full_table_scans.rows_examined_avg
     *
     * @mbg.generated
     */
    private BigDecimal rows_examined_avg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_full_table_scans.first_seen
     *
     * @mbg.generated
     */
    private Date first_seen;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_full_table_scans.last_seen
     *
     * @mbg.generated
     */
    private Date last_seen;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_full_table_scans.digest
     *
     * @mbg.generated
     */
    private String digest;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_full_table_scans.query
     *
     * @mbg.generated
     */
    private String query;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_full_table_scans.total_latency
     *
     * @mbg.generated
     */
    private String total_latency;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_full_table_scans.db
     *
     * @return the value of statements_with_full_table_scans.db
     *
     * @mbg.generated
     */
    public String getDb() {
        return db;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_full_table_scans.db
     *
     * @param db the value for statements_with_full_table_scans.db
     *
     * @mbg.generated
     */
    public void setDb(String db) {
        this.db = db == null ? null : db.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_full_table_scans.exec_count
     *
     * @return the value of statements_with_full_table_scans.exec_count
     *
     * @mbg.generated
     */
    public Long getExec_count() {
        return exec_count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_full_table_scans.exec_count
     *
     * @param exec_count the value for statements_with_full_table_scans.exec_count
     *
     * @mbg.generated
     */
    public void setExec_count(Long exec_count) {
        this.exec_count = exec_count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_full_table_scans.no_index_used_count
     *
     * @return the value of statements_with_full_table_scans.no_index_used_count
     *
     * @mbg.generated
     */
    public Long getNo_index_used_count() {
        return no_index_used_count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_full_table_scans.no_index_used_count
     *
     * @param no_index_used_count the value for statements_with_full_table_scans.no_index_used_count
     *
     * @mbg.generated
     */
    public void setNo_index_used_count(Long no_index_used_count) {
        this.no_index_used_count = no_index_used_count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_full_table_scans.no_good_index_used_count
     *
     * @return the value of statements_with_full_table_scans.no_good_index_used_count
     *
     * @mbg.generated
     */
    public Long getNo_good_index_used_count() {
        return no_good_index_used_count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_full_table_scans.no_good_index_used_count
     *
     * @param no_good_index_used_count the value for statements_with_full_table_scans.no_good_index_used_count
     *
     * @mbg.generated
     */
    public void setNo_good_index_used_count(Long no_good_index_used_count) {
        this.no_good_index_used_count = no_good_index_used_count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_full_table_scans.no_index_used_pct
     *
     * @return the value of statements_with_full_table_scans.no_index_used_pct
     *
     * @mbg.generated
     */
    public BigDecimal getNo_index_used_pct() {
        return no_index_used_pct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_full_table_scans.no_index_used_pct
     *
     * @param no_index_used_pct the value for statements_with_full_table_scans.no_index_used_pct
     *
     * @mbg.generated
     */
    public void setNo_index_used_pct(BigDecimal no_index_used_pct) {
        this.no_index_used_pct = no_index_used_pct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_full_table_scans.rows_sent
     *
     * @return the value of statements_with_full_table_scans.rows_sent
     *
     * @mbg.generated
     */
    public Long getRows_sent() {
        return rows_sent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_full_table_scans.rows_sent
     *
     * @param rows_sent the value for statements_with_full_table_scans.rows_sent
     *
     * @mbg.generated
     */
    public void setRows_sent(Long rows_sent) {
        this.rows_sent = rows_sent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_full_table_scans.rows_examined
     *
     * @return the value of statements_with_full_table_scans.rows_examined
     *
     * @mbg.generated
     */
    public Long getRows_examined() {
        return rows_examined;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_full_table_scans.rows_examined
     *
     * @param rows_examined the value for statements_with_full_table_scans.rows_examined
     *
     * @mbg.generated
     */
    public void setRows_examined(Long rows_examined) {
        this.rows_examined = rows_examined;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_full_table_scans.rows_sent_avg
     *
     * @return the value of statements_with_full_table_scans.rows_sent_avg
     *
     * @mbg.generated
     */
    public BigDecimal getRows_sent_avg() {
        return rows_sent_avg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_full_table_scans.rows_sent_avg
     *
     * @param rows_sent_avg the value for statements_with_full_table_scans.rows_sent_avg
     *
     * @mbg.generated
     */
    public void setRows_sent_avg(BigDecimal rows_sent_avg) {
        this.rows_sent_avg = rows_sent_avg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_full_table_scans.rows_examined_avg
     *
     * @return the value of statements_with_full_table_scans.rows_examined_avg
     *
     * @mbg.generated
     */
    public BigDecimal getRows_examined_avg() {
        return rows_examined_avg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_full_table_scans.rows_examined_avg
     *
     * @param rows_examined_avg the value for statements_with_full_table_scans.rows_examined_avg
     *
     * @mbg.generated
     */
    public void setRows_examined_avg(BigDecimal rows_examined_avg) {
        this.rows_examined_avg = rows_examined_avg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_full_table_scans.first_seen
     *
     * @return the value of statements_with_full_table_scans.first_seen
     *
     * @mbg.generated
     */
    public Date getFirst_seen() {
        return first_seen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_full_table_scans.first_seen
     *
     * @param first_seen the value for statements_with_full_table_scans.first_seen
     *
     * @mbg.generated
     */
    public void setFirst_seen(Date first_seen) {
        this.first_seen = first_seen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_full_table_scans.last_seen
     *
     * @return the value of statements_with_full_table_scans.last_seen
     *
     * @mbg.generated
     */
    public Date getLast_seen() {
        return last_seen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_full_table_scans.last_seen
     *
     * @param last_seen the value for statements_with_full_table_scans.last_seen
     *
     * @mbg.generated
     */
    public void setLast_seen(Date last_seen) {
        this.last_seen = last_seen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_full_table_scans.digest
     *
     * @return the value of statements_with_full_table_scans.digest
     *
     * @mbg.generated
     */
    public String getDigest() {
        return digest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_full_table_scans.digest
     *
     * @param digest the value for statements_with_full_table_scans.digest
     *
     * @mbg.generated
     */
    public void setDigest(String digest) {
        this.digest = digest == null ? null : digest.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_full_table_scans.query
     *
     * @return the value of statements_with_full_table_scans.query
     *
     * @mbg.generated
     */
    public String getQuery() {
        return query;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_full_table_scans.query
     *
     * @param query the value for statements_with_full_table_scans.query
     *
     * @mbg.generated
     */
    public void setQuery(String query) {
        this.query = query == null ? null : query.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_full_table_scans.total_latency
     *
     * @return the value of statements_with_full_table_scans.total_latency
     *
     * @mbg.generated
     */
    public String getTotal_latency() {
        return total_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_full_table_scans.total_latency
     *
     * @param total_latency the value for statements_with_full_table_scans.total_latency
     *
     * @mbg.generated
     */
    public void setTotal_latency(String total_latency) {
        this.total_latency = total_latency == null ? null : total_latency.trim();
    }
}