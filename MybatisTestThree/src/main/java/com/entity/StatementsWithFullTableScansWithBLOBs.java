package com.entity;

public class StatementsWithFullTableScansWithBLOBs extends StatementsWithFullTableScans {
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