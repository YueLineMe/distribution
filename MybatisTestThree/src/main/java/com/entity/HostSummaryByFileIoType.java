package com.entity;

public class HostSummaryByFileIoType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host_summary_by_file_io_type.host
     *
     * @mbg.generated
     */
    private String host;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host_summary_by_file_io_type.event_name
     *
     * @mbg.generated
     */
    private String event_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host_summary_by_file_io_type.total
     *
     * @mbg.generated
     */
    private Long total;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host_summary_by_file_io_type.total_latency
     *
     * @mbg.generated
     */
    private String total_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column host_summary_by_file_io_type.max_latency
     *
     * @mbg.generated
     */
    private String max_latency;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host_summary_by_file_io_type.host
     *
     * @return the value of host_summary_by_file_io_type.host
     *
     * @mbg.generated
     */
    public String getHost() {
        return host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host_summary_by_file_io_type.host
     *
     * @param host the value for host_summary_by_file_io_type.host
     *
     * @mbg.generated
     */
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host_summary_by_file_io_type.event_name
     *
     * @return the value of host_summary_by_file_io_type.event_name
     *
     * @mbg.generated
     */
    public String getEvent_name() {
        return event_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host_summary_by_file_io_type.event_name
     *
     * @param event_name the value for host_summary_by_file_io_type.event_name
     *
     * @mbg.generated
     */
    public void setEvent_name(String event_name) {
        this.event_name = event_name == null ? null : event_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host_summary_by_file_io_type.total
     *
     * @return the value of host_summary_by_file_io_type.total
     *
     * @mbg.generated
     */
    public Long getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host_summary_by_file_io_type.total
     *
     * @param total the value for host_summary_by_file_io_type.total
     *
     * @mbg.generated
     */
    public void setTotal(Long total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host_summary_by_file_io_type.total_latency
     *
     * @return the value of host_summary_by_file_io_type.total_latency
     *
     * @mbg.generated
     */
    public String getTotal_latency() {
        return total_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host_summary_by_file_io_type.total_latency
     *
     * @param total_latency the value for host_summary_by_file_io_type.total_latency
     *
     * @mbg.generated
     */
    public void setTotal_latency(String total_latency) {
        this.total_latency = total_latency == null ? null : total_latency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column host_summary_by_file_io_type.max_latency
     *
     * @return the value of host_summary_by_file_io_type.max_latency
     *
     * @mbg.generated
     */
    public String getMax_latency() {
        return max_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column host_summary_by_file_io_type.max_latency
     *
     * @param max_latency the value for host_summary_by_file_io_type.max_latency
     *
     * @mbg.generated
     */
    public void setMax_latency(String max_latency) {
        this.max_latency = max_latency == null ? null : max_latency.trim();
    }
}