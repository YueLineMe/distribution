package com.entity;

public class EventsStatementsSummaryByDigestWithBLOBs extends EventsStatementsSummaryByDigest {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_statements_summary_by_digest.DIGEST_TEXT
     *
     * @mbg.generated
     */
    private String DIGEST_TEXT;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_statements_summary_by_digest.QUERY_SAMPLE_TEXT
     *
     * @mbg.generated
     */
    private String QUERY_SAMPLE_TEXT;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_statements_summary_by_digest.DIGEST_TEXT
     *
     * @return the value of events_statements_summary_by_digest.DIGEST_TEXT
     *
     * @mbg.generated
     */
    public String getDIGEST_TEXT() {
        return DIGEST_TEXT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_statements_summary_by_digest.DIGEST_TEXT
     *
     * @param DIGEST_TEXT the value for events_statements_summary_by_digest.DIGEST_TEXT
     *
     * @mbg.generated
     */
    public void setDIGEST_TEXT(String DIGEST_TEXT) {
        this.DIGEST_TEXT = DIGEST_TEXT == null ? null : DIGEST_TEXT.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_statements_summary_by_digest.QUERY_SAMPLE_TEXT
     *
     * @return the value of events_statements_summary_by_digest.QUERY_SAMPLE_TEXT
     *
     * @mbg.generated
     */
    public String getQUERY_SAMPLE_TEXT() {
        return QUERY_SAMPLE_TEXT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_statements_summary_by_digest.QUERY_SAMPLE_TEXT
     *
     * @param QUERY_SAMPLE_TEXT the value for events_statements_summary_by_digest.QUERY_SAMPLE_TEXT
     *
     * @mbg.generated
     */
    public void setQUERY_SAMPLE_TEXT(String QUERY_SAMPLE_TEXT) {
        this.QUERY_SAMPLE_TEXT = QUERY_SAMPLE_TEXT == null ? null : QUERY_SAMPLE_TEXT.trim();
    }
}