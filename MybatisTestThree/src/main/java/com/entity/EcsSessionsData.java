package com.entity;

public class EcsSessionsData {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_sessions_data.sesskey
     *
     * @mbg.generated
     */
    private String sesskey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_sessions_data.expiry
     *
     * @mbg.generated
     */
    private Integer expiry;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_sessions_data.data
     *
     * @mbg.generated
     */
    private String data;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_sessions_data.sesskey
     *
     * @return the value of ecs_sessions_data.sesskey
     *
     * @mbg.generated
     */
    public String getSesskey() {
        return sesskey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_sessions_data.sesskey
     *
     * @param sesskey the value for ecs_sessions_data.sesskey
     *
     * @mbg.generated
     */
    public void setSesskey(String sesskey) {
        this.sesskey = sesskey == null ? null : sesskey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_sessions_data.expiry
     *
     * @return the value of ecs_sessions_data.expiry
     *
     * @mbg.generated
     */
    public Integer getExpiry() {
        return expiry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_sessions_data.expiry
     *
     * @param expiry the value for ecs_sessions_data.expiry
     *
     * @mbg.generated
     */
    public void setExpiry(Integer expiry) {
        this.expiry = expiry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_sessions_data.data
     *
     * @return the value of ecs_sessions_data.data
     *
     * @mbg.generated
     */
    public String getData() {
        return data;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_sessions_data.data
     *
     * @param data the value for ecs_sessions_data.data
     *
     * @mbg.generated
     */
    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }
}