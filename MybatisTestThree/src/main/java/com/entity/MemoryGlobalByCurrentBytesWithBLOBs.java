package com.entity;

public class MemoryGlobalByCurrentBytesWithBLOBs extends MemoryGlobalByCurrentBytes {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column memory_global_by_current_bytes.current_alloc
     *
     * @mbg.generated
     */
    private String current_alloc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column memory_global_by_current_bytes.current_avg_alloc
     *
     * @mbg.generated
     */
    private String current_avg_alloc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column memory_global_by_current_bytes.high_alloc
     *
     * @mbg.generated
     */
    private String high_alloc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column memory_global_by_current_bytes.high_avg_alloc
     *
     * @mbg.generated
     */
    private String high_avg_alloc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column memory_global_by_current_bytes.current_alloc
     *
     * @return the value of memory_global_by_current_bytes.current_alloc
     *
     * @mbg.generated
     */
    public String getCurrent_alloc() {
        return current_alloc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column memory_global_by_current_bytes.current_alloc
     *
     * @param current_alloc the value for memory_global_by_current_bytes.current_alloc
     *
     * @mbg.generated
     */
    public void setCurrent_alloc(String current_alloc) {
        this.current_alloc = current_alloc == null ? null : current_alloc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column memory_global_by_current_bytes.current_avg_alloc
     *
     * @return the value of memory_global_by_current_bytes.current_avg_alloc
     *
     * @mbg.generated
     */
    public String getCurrent_avg_alloc() {
        return current_avg_alloc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column memory_global_by_current_bytes.current_avg_alloc
     *
     * @param current_avg_alloc the value for memory_global_by_current_bytes.current_avg_alloc
     *
     * @mbg.generated
     */
    public void setCurrent_avg_alloc(String current_avg_alloc) {
        this.current_avg_alloc = current_avg_alloc == null ? null : current_avg_alloc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column memory_global_by_current_bytes.high_alloc
     *
     * @return the value of memory_global_by_current_bytes.high_alloc
     *
     * @mbg.generated
     */
    public String getHigh_alloc() {
        return high_alloc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column memory_global_by_current_bytes.high_alloc
     *
     * @param high_alloc the value for memory_global_by_current_bytes.high_alloc
     *
     * @mbg.generated
     */
    public void setHigh_alloc(String high_alloc) {
        this.high_alloc = high_alloc == null ? null : high_alloc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column memory_global_by_current_bytes.high_avg_alloc
     *
     * @return the value of memory_global_by_current_bytes.high_avg_alloc
     *
     * @mbg.generated
     */
    public String getHigh_avg_alloc() {
        return high_avg_alloc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column memory_global_by_current_bytes.high_avg_alloc
     *
     * @param high_avg_alloc the value for memory_global_by_current_bytes.high_avg_alloc
     *
     * @mbg.generated
     */
    public void setHigh_avg_alloc(String high_avg_alloc) {
        this.high_avg_alloc = high_avg_alloc == null ? null : high_avg_alloc.trim();
    }
}