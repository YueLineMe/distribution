package com.entity;

public class EventsWaitsSummaryByThreadByEventNameKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_summary_by_thread_by_event_name.THREAD_ID
     *
     * @mbg.generated
     */
    private Long THREAD_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_summary_by_thread_by_event_name.EVENT_NAME
     *
     * @mbg.generated
     */
    private String EVENT_NAME;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_summary_by_thread_by_event_name.THREAD_ID
     *
     * @return the value of events_waits_summary_by_thread_by_event_name.THREAD_ID
     *
     * @mbg.generated
     */
    public Long getTHREAD_ID() {
        return THREAD_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_summary_by_thread_by_event_name.THREAD_ID
     *
     * @param THREAD_ID the value for events_waits_summary_by_thread_by_event_name.THREAD_ID
     *
     * @mbg.generated
     */
    public void setTHREAD_ID(Long THREAD_ID) {
        this.THREAD_ID = THREAD_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_summary_by_thread_by_event_name.EVENT_NAME
     *
     * @return the value of events_waits_summary_by_thread_by_event_name.EVENT_NAME
     *
     * @mbg.generated
     */
    public String getEVENT_NAME() {
        return EVENT_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_summary_by_thread_by_event_name.EVENT_NAME
     *
     * @param EVENT_NAME the value for events_waits_summary_by_thread_by_event_name.EVENT_NAME
     *
     * @mbg.generated
     */
    public void setEVENT_NAME(String EVENT_NAME) {
        this.EVENT_NAME = EVENT_NAME == null ? null : EVENT_NAME.trim();
    }
}