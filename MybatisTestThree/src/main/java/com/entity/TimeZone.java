package com.entity;

public class TimeZone {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_zone.Time_zone_id
     *
     * @mbg.generated
     */
    private Integer time_zone_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column time_zone.Use_leap_seconds
     *
     * @mbg.generated
     */
    private String use_leap_seconds;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_zone.Time_zone_id
     *
     * @return the value of time_zone.Time_zone_id
     *
     * @mbg.generated
     */
    public Integer getTime_zone_id() {
        return time_zone_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_zone.Time_zone_id
     *
     * @param time_zone_id the value for time_zone.Time_zone_id
     *
     * @mbg.generated
     */
    public void setTime_zone_id(Integer time_zone_id) {
        this.time_zone_id = time_zone_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column time_zone.Use_leap_seconds
     *
     * @return the value of time_zone.Use_leap_seconds
     *
     * @mbg.generated
     */
    public String getUse_leap_seconds() {
        return use_leap_seconds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column time_zone.Use_leap_seconds
     *
     * @param use_leap_seconds the value for time_zone.Use_leap_seconds
     *
     * @mbg.generated
     */
    public void setUse_leap_seconds(String use_leap_seconds) {
        this.use_leap_seconds = use_leap_seconds == null ? null : use_leap_seconds.trim();
    }
}