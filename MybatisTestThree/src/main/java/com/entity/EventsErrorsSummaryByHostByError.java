package com.entity;

import java.util.Date;

public class EventsErrorsSummaryByHostByError {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_errors_summary_by_host_by_error.HOST
     *
     * @mbg.generated
     */
    private String HOST;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_errors_summary_by_host_by_error.ERROR_NUMBER
     *
     * @mbg.generated
     */
    private Integer ERROR_NUMBER;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_errors_summary_by_host_by_error.ERROR_NAME
     *
     * @mbg.generated
     */
    private String ERROR_NAME;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_errors_summary_by_host_by_error.SQL_STATE
     *
     * @mbg.generated
     */
    private String SQL_STATE;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_errors_summary_by_host_by_error.SUM_ERROR_RAISED
     *
     * @mbg.generated
     */
    private Long SUM_ERROR_RAISED;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_errors_summary_by_host_by_error.SUM_ERROR_HANDLED
     *
     * @mbg.generated
     */
    private Long SUM_ERROR_HANDLED;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_errors_summary_by_host_by_error.FIRST_SEEN
     *
     * @mbg.generated
     */
    private Date FIRST_SEEN;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_errors_summary_by_host_by_error.LAST_SEEN
     *
     * @mbg.generated
     */
    private Date LAST_SEEN;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_errors_summary_by_host_by_error.HOST
     *
     * @return the value of events_errors_summary_by_host_by_error.HOST
     *
     * @mbg.generated
     */
    public String getHOST() {
        return HOST;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_errors_summary_by_host_by_error.HOST
     *
     * @param HOST the value for events_errors_summary_by_host_by_error.HOST
     *
     * @mbg.generated
     */
    public void setHOST(String HOST) {
        this.HOST = HOST == null ? null : HOST.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_errors_summary_by_host_by_error.ERROR_NUMBER
     *
     * @return the value of events_errors_summary_by_host_by_error.ERROR_NUMBER
     *
     * @mbg.generated
     */
    public Integer getERROR_NUMBER() {
        return ERROR_NUMBER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_errors_summary_by_host_by_error.ERROR_NUMBER
     *
     * @param ERROR_NUMBER the value for events_errors_summary_by_host_by_error.ERROR_NUMBER
     *
     * @mbg.generated
     */
    public void setERROR_NUMBER(Integer ERROR_NUMBER) {
        this.ERROR_NUMBER = ERROR_NUMBER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_errors_summary_by_host_by_error.ERROR_NAME
     *
     * @return the value of events_errors_summary_by_host_by_error.ERROR_NAME
     *
     * @mbg.generated
     */
    public String getERROR_NAME() {
        return ERROR_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_errors_summary_by_host_by_error.ERROR_NAME
     *
     * @param ERROR_NAME the value for events_errors_summary_by_host_by_error.ERROR_NAME
     *
     * @mbg.generated
     */
    public void setERROR_NAME(String ERROR_NAME) {
        this.ERROR_NAME = ERROR_NAME == null ? null : ERROR_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_errors_summary_by_host_by_error.SQL_STATE
     *
     * @return the value of events_errors_summary_by_host_by_error.SQL_STATE
     *
     * @mbg.generated
     */
    public String getSQL_STATE() {
        return SQL_STATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_errors_summary_by_host_by_error.SQL_STATE
     *
     * @param SQL_STATE the value for events_errors_summary_by_host_by_error.SQL_STATE
     *
     * @mbg.generated
     */
    public void setSQL_STATE(String SQL_STATE) {
        this.SQL_STATE = SQL_STATE == null ? null : SQL_STATE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_errors_summary_by_host_by_error.SUM_ERROR_RAISED
     *
     * @return the value of events_errors_summary_by_host_by_error.SUM_ERROR_RAISED
     *
     * @mbg.generated
     */
    public Long getSUM_ERROR_RAISED() {
        return SUM_ERROR_RAISED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_errors_summary_by_host_by_error.SUM_ERROR_RAISED
     *
     * @param SUM_ERROR_RAISED the value for events_errors_summary_by_host_by_error.SUM_ERROR_RAISED
     *
     * @mbg.generated
     */
    public void setSUM_ERROR_RAISED(Long SUM_ERROR_RAISED) {
        this.SUM_ERROR_RAISED = SUM_ERROR_RAISED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_errors_summary_by_host_by_error.SUM_ERROR_HANDLED
     *
     * @return the value of events_errors_summary_by_host_by_error.SUM_ERROR_HANDLED
     *
     * @mbg.generated
     */
    public Long getSUM_ERROR_HANDLED() {
        return SUM_ERROR_HANDLED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_errors_summary_by_host_by_error.SUM_ERROR_HANDLED
     *
     * @param SUM_ERROR_HANDLED the value for events_errors_summary_by_host_by_error.SUM_ERROR_HANDLED
     *
     * @mbg.generated
     */
    public void setSUM_ERROR_HANDLED(Long SUM_ERROR_HANDLED) {
        this.SUM_ERROR_HANDLED = SUM_ERROR_HANDLED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_errors_summary_by_host_by_error.FIRST_SEEN
     *
     * @return the value of events_errors_summary_by_host_by_error.FIRST_SEEN
     *
     * @mbg.generated
     */
    public Date getFIRST_SEEN() {
        return FIRST_SEEN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_errors_summary_by_host_by_error.FIRST_SEEN
     *
     * @param FIRST_SEEN the value for events_errors_summary_by_host_by_error.FIRST_SEEN
     *
     * @mbg.generated
     */
    public void setFIRST_SEEN(Date FIRST_SEEN) {
        this.FIRST_SEEN = FIRST_SEEN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_errors_summary_by_host_by_error.LAST_SEEN
     *
     * @return the value of events_errors_summary_by_host_by_error.LAST_SEEN
     *
     * @mbg.generated
     */
    public Date getLAST_SEEN() {
        return LAST_SEEN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_errors_summary_by_host_by_error.LAST_SEEN
     *
     * @param LAST_SEEN the value for events_errors_summary_by_host_by_error.LAST_SEEN
     *
     * @mbg.generated
     */
    public void setLAST_SEEN(Date LAST_SEEN) {
        this.LAST_SEEN = LAST_SEEN;
    }
}