package com.entity;

public class TimeZoneTransition {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_zone_transition.Time_zone_id
     *
     * @mbg.generated
     */
    private Integer time_zone_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_zone_transition.Transition_time
     *
     * @mbg.generated
     */
    private Long transition_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_zone_transition.Transition_type_id
     *
     * @mbg.generated
     */
    private Integer transition_type_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_zone_transition.Time_zone_id
     *
     * @return the value of time_zone_transition.Time_zone_id
     *
     * @mbg.generated
     */
    public Integer getTime_zone_id() {
        return time_zone_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_zone_transition.Time_zone_id
     *
     * @param time_zone_id the value for time_zone_transition.Time_zone_id
     *
     * @mbg.generated
     */
    public void setTime_zone_id(Integer time_zone_id) {
        this.time_zone_id = time_zone_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_zone_transition.Transition_time
     *
     * @return the value of time_zone_transition.Transition_time
     *
     * @mbg.generated
     */
    public Long getTransition_time() {
        return transition_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_zone_transition.Transition_time
     *
     * @param transition_time the value for time_zone_transition.Transition_time
     *
     * @mbg.generated
     */
    public void setTransition_time(Long transition_time) {
        this.transition_time = transition_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_zone_transition.Transition_type_id
     *
     * @return the value of time_zone_transition.Transition_type_id
     *
     * @mbg.generated
     */
    public Integer getTransition_type_id() {
        return transition_type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_zone_transition.Transition_type_id
     *
     * @param transition_type_id the value for time_zone_transition.Transition_type_id
     *
     * @mbg.generated
     */
    public void setTransition_type_id(Integer transition_type_id) {
        this.transition_type_id = transition_type_id;
    }
}