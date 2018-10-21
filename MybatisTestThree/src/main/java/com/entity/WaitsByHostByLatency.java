package com.entity;

public class WaitsByHostByLatency {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column waits_by_host_by_latency.host
     *
     * @mbg.generated
     */
    private String host;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column waits_by_host_by_latency.event
     *
     * @mbg.generated
     */
    private String event;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column waits_by_host_by_latency.total
     *
     * @mbg.generated
     */
    private Long total;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column waits_by_host_by_latency.total_latency
     *
     * @mbg.generated
     */
    private String total_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column waits_by_host_by_latency.avg_latency
     *
     * @mbg.generated
     */
    private String avg_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column waits_by_host_by_latency.max_latency
     *
     * @mbg.generated
     */
    private String max_latency;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column waits_by_host_by_latency.host
     *
     * @return the value of waits_by_host_by_latency.host
     *
     * @mbg.generated
     */
    public String getHost() {
        return host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column waits_by_host_by_latency.host
     *
     * @param host the value for waits_by_host_by_latency.host
     *
     * @mbg.generated
     */
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column waits_by_host_by_latency.event
     *
     * @return the value of waits_by_host_by_latency.event
     *
     * @mbg.generated
     */
    public String getEvent() {
        return event;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column waits_by_host_by_latency.event
     *
     * @param event the value for waits_by_host_by_latency.event
     *
     * @mbg.generated
     */
    public void setEvent(String event) {
        this.event = event == null ? null : event.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column waits_by_host_by_latency.total
     *
     * @return the value of waits_by_host_by_latency.total
     *
     * @mbg.generated
     */
    public Long getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column waits_by_host_by_latency.total
     *
     * @param total the value for waits_by_host_by_latency.total
     *
     * @mbg.generated
     */
    public void setTotal(Long total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column waits_by_host_by_latency.total_latency
     *
     * @return the value of waits_by_host_by_latency.total_latency
     *
     * @mbg.generated
     */
    public String getTotal_latency() {
        return total_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column waits_by_host_by_latency.total_latency
     *
     * @param total_latency the value for waits_by_host_by_latency.total_latency
     *
     * @mbg.generated
     */
    public void setTotal_latency(String total_latency) {
        this.total_latency = total_latency == null ? null : total_latency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column waits_by_host_by_latency.avg_latency
     *
     * @return the value of waits_by_host_by_latency.avg_latency
     *
     * @mbg.generated
     */
    public String getAvg_latency() {
        return avg_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column waits_by_host_by_latency.avg_latency
     *
     * @param avg_latency the value for waits_by_host_by_latency.avg_latency
     *
     * @mbg.generated
     */
    public void setAvg_latency(String avg_latency) {
        this.avg_latency = avg_latency == null ? null : avg_latency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column waits_by_host_by_latency.max_latency
     *
     * @return the value of waits_by_host_by_latency.max_latency
     *
     * @mbg.generated
     */
    public String getMax_latency() {
        return max_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column waits_by_host_by_latency.max_latency
     *
     * @param max_latency the value for waits_by_host_by_latency.max_latency
     *
     * @mbg.generated
     */
    public void setMax_latency(String max_latency) {
        this.max_latency = max_latency == null ? null : max_latency.trim();
    }
}