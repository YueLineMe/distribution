package com.entity;

public class UserSummaryByFileIoType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_summary_by_file_io_type.user
     *
     * @mbg.generated
     */
    private String user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_summary_by_file_io_type.event_name
     *
     * @mbg.generated
     */
    private String event_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_summary_by_file_io_type.total
     *
     * @mbg.generated
     */
    private Long total;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_summary_by_file_io_type.latency
     *
     * @mbg.generated
     */
    private String latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_summary_by_file_io_type.max_latency
     *
     * @mbg.generated
     */
    private String max_latency;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_summary_by_file_io_type.user
     *
     * @return the value of user_summary_by_file_io_type.user
     *
     * @mbg.generated
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_summary_by_file_io_type.user
     *
     * @param user the value for user_summary_by_file_io_type.user
     *
     * @mbg.generated
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_summary_by_file_io_type.event_name
     *
     * @return the value of user_summary_by_file_io_type.event_name
     *
     * @mbg.generated
     */
    public String getEvent_name() {
        return event_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_summary_by_file_io_type.event_name
     *
     * @param event_name the value for user_summary_by_file_io_type.event_name
     *
     * @mbg.generated
     */
    public void setEvent_name(String event_name) {
        this.event_name = event_name == null ? null : event_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_summary_by_file_io_type.total
     *
     * @return the value of user_summary_by_file_io_type.total
     *
     * @mbg.generated
     */
    public Long getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_summary_by_file_io_type.total
     *
     * @param total the value for user_summary_by_file_io_type.total
     *
     * @mbg.generated
     */
    public void setTotal(Long total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_summary_by_file_io_type.latency
     *
     * @return the value of user_summary_by_file_io_type.latency
     *
     * @mbg.generated
     */
    public String getLatency() {
        return latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_summary_by_file_io_type.latency
     *
     * @param latency the value for user_summary_by_file_io_type.latency
     *
     * @mbg.generated
     */
    public void setLatency(String latency) {
        this.latency = latency == null ? null : latency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_summary_by_file_io_type.max_latency
     *
     * @return the value of user_summary_by_file_io_type.max_latency
     *
     * @mbg.generated
     */
    public String getMax_latency() {
        return max_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_summary_by_file_io_type.max_latency
     *
     * @param max_latency the value for user_summary_by_file_io_type.max_latency
     *
     * @mbg.generated
     */
    public void setMax_latency(String max_latency) {
        this.max_latency = max_latency == null ? null : max_latency.trim();
    }
}