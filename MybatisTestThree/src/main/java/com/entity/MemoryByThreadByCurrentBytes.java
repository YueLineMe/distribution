package com.entity;

import java.math.BigDecimal;

public class MemoryByThreadByCurrentBytes {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column memory_by_thread_by_current_bytes.thread_id
     *
     * @mbg.generated
     */
    private Long thread_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column memory_by_thread_by_current_bytes.user
     *
     * @mbg.generated
     */
    private String user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column memory_by_thread_by_current_bytes.current_count_used
     *
     * @mbg.generated
     */
    private BigDecimal current_count_used;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column memory_by_thread_by_current_bytes.current_allocated
     *
     * @mbg.generated
     */
    private String current_allocated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column memory_by_thread_by_current_bytes.current_avg_alloc
     *
     * @mbg.generated
     */
    private String current_avg_alloc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column memory_by_thread_by_current_bytes.current_max_alloc
     *
     * @mbg.generated
     */
    private String current_max_alloc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column memory_by_thread_by_current_bytes.total_allocated
     *
     * @mbg.generated
     */
    private String total_allocated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column memory_by_thread_by_current_bytes.thread_id
     *
     * @return the value of memory_by_thread_by_current_bytes.thread_id
     *
     * @mbg.generated
     */
    public Long getThread_id() {
        return thread_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column memory_by_thread_by_current_bytes.thread_id
     *
     * @param thread_id the value for memory_by_thread_by_current_bytes.thread_id
     *
     * @mbg.generated
     */
    public void setThread_id(Long thread_id) {
        this.thread_id = thread_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column memory_by_thread_by_current_bytes.user
     *
     * @return the value of memory_by_thread_by_current_bytes.user
     *
     * @mbg.generated
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column memory_by_thread_by_current_bytes.user
     *
     * @param user the value for memory_by_thread_by_current_bytes.user
     *
     * @mbg.generated
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column memory_by_thread_by_current_bytes.current_count_used
     *
     * @return the value of memory_by_thread_by_current_bytes.current_count_used
     *
     * @mbg.generated
     */
    public BigDecimal getCurrent_count_used() {
        return current_count_used;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column memory_by_thread_by_current_bytes.current_count_used
     *
     * @param current_count_used the value for memory_by_thread_by_current_bytes.current_count_used
     *
     * @mbg.generated
     */
    public void setCurrent_count_used(BigDecimal current_count_used) {
        this.current_count_used = current_count_used;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column memory_by_thread_by_current_bytes.current_allocated
     *
     * @return the value of memory_by_thread_by_current_bytes.current_allocated
     *
     * @mbg.generated
     */
    public String getCurrent_allocated() {
        return current_allocated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column memory_by_thread_by_current_bytes.current_allocated
     *
     * @param current_allocated the value for memory_by_thread_by_current_bytes.current_allocated
     *
     * @mbg.generated
     */
    public void setCurrent_allocated(String current_allocated) {
        this.current_allocated = current_allocated == null ? null : current_allocated.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column memory_by_thread_by_current_bytes.current_avg_alloc
     *
     * @return the value of memory_by_thread_by_current_bytes.current_avg_alloc
     *
     * @mbg.generated
     */
    public String getCurrent_avg_alloc() {
        return current_avg_alloc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column memory_by_thread_by_current_bytes.current_avg_alloc
     *
     * @param current_avg_alloc the value for memory_by_thread_by_current_bytes.current_avg_alloc
     *
     * @mbg.generated
     */
    public void setCurrent_avg_alloc(String current_avg_alloc) {
        this.current_avg_alloc = current_avg_alloc == null ? null : current_avg_alloc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column memory_by_thread_by_current_bytes.current_max_alloc
     *
     * @return the value of memory_by_thread_by_current_bytes.current_max_alloc
     *
     * @mbg.generated
     */
    public String getCurrent_max_alloc() {
        return current_max_alloc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column memory_by_thread_by_current_bytes.current_max_alloc
     *
     * @param current_max_alloc the value for memory_by_thread_by_current_bytes.current_max_alloc
     *
     * @mbg.generated
     */
    public void setCurrent_max_alloc(String current_max_alloc) {
        this.current_max_alloc = current_max_alloc == null ? null : current_max_alloc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column memory_by_thread_by_current_bytes.total_allocated
     *
     * @return the value of memory_by_thread_by_current_bytes.total_allocated
     *
     * @mbg.generated
     */
    public String getTotal_allocated() {
        return total_allocated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column memory_by_thread_by_current_bytes.total_allocated
     *
     * @param total_allocated the value for memory_by_thread_by_current_bytes.total_allocated
     *
     * @mbg.generated
     */
    public void setTotal_allocated(String total_allocated) {
        this.total_allocated = total_allocated == null ? null : total_allocated.trim();
    }
}