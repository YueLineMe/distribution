package com.entity;

public class IoGlobalByFileByLatencyWithBLOBs extends IoGlobalByFileByLatency {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_latency.total_latency
     *
     * @mbg.generated
     */
    private String total_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_latency.read_latency
     *
     * @mbg.generated
     */
    private String read_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_latency.write_latency
     *
     * @mbg.generated
     */
    private String write_latency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_global_by_file_by_latency.misc_latency
     *
     * @mbg.generated
     */
    private String misc_latency;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_latency.total_latency
     *
     * @return the value of io_global_by_file_by_latency.total_latency
     *
     * @mbg.generated
     */
    public String getTotal_latency() {
        return total_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_latency.total_latency
     *
     * @param total_latency the value for io_global_by_file_by_latency.total_latency
     *
     * @mbg.generated
     */
    public void setTotal_latency(String total_latency) {
        this.total_latency = total_latency == null ? null : total_latency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_latency.read_latency
     *
     * @return the value of io_global_by_file_by_latency.read_latency
     *
     * @mbg.generated
     */
    public String getRead_latency() {
        return read_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_latency.read_latency
     *
     * @param read_latency the value for io_global_by_file_by_latency.read_latency
     *
     * @mbg.generated
     */
    public void setRead_latency(String read_latency) {
        this.read_latency = read_latency == null ? null : read_latency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_latency.write_latency
     *
     * @return the value of io_global_by_file_by_latency.write_latency
     *
     * @mbg.generated
     */
    public String getWrite_latency() {
        return write_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_latency.write_latency
     *
     * @param write_latency the value for io_global_by_file_by_latency.write_latency
     *
     * @mbg.generated
     */
    public void setWrite_latency(String write_latency) {
        this.write_latency = write_latency == null ? null : write_latency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_global_by_file_by_latency.misc_latency
     *
     * @return the value of io_global_by_file_by_latency.misc_latency
     *
     * @mbg.generated
     */
    public String getMisc_latency() {
        return misc_latency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_global_by_file_by_latency.misc_latency
     *
     * @param misc_latency the value for io_global_by_file_by_latency.misc_latency
     *
     * @mbg.generated
     */
    public void setMisc_latency(String misc_latency) {
        this.misc_latency = misc_latency == null ? null : misc_latency.trim();
    }
}