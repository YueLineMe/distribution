package com.entity;

public class EventsWaitsCurrentKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_current.THREAD_ID
     *
     * @mbg.generated
     */
    private Long THREAD_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_current.EVENT_ID
     *
     * @mbg.generated
     */
    private Long EVENT_ID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_current.THREAD_ID
     *
     * @return the value of events_waits_current.THREAD_ID
     *
     * @mbg.generated
     */
    public Long getTHREAD_ID() {
        return THREAD_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_current.THREAD_ID
     *
     * @param THREAD_ID the value for events_waits_current.THREAD_ID
     *
     * @mbg.generated
     */
    public void setTHREAD_ID(Long THREAD_ID) {
        this.THREAD_ID = THREAD_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_current.EVENT_ID
     *
     * @return the value of events_waits_current.EVENT_ID
     *
     * @mbg.generated
     */
    public Long getEVENT_ID() {
        return EVENT_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_current.EVENT_ID
     *
     * @param EVENT_ID the value for events_waits_current.EVENT_ID
     *
     * @mbg.generated
     */
    public void setEVENT_ID(Long EVENT_ID) {
        this.EVENT_ID = EVENT_ID;
    }
}