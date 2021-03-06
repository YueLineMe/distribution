package com.entity;

import java.math.BigDecimal;

public class EcsSnatchLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_snatch_log.log_id
     *
     * @mbg.generated
     */
    private Integer log_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_snatch_log.snatch_id
     *
     * @mbg.generated
     */
    private Byte snatch_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_snatch_log.user_id
     *
     * @mbg.generated
     */
    private Integer user_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_snatch_log.bid_price
     *
     * @mbg.generated
     */
    private BigDecimal bid_price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_snatch_log.bid_time
     *
     * @mbg.generated
     */
    private Integer bid_time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_snatch_log.log_id
     *
     * @return the value of ecs_snatch_log.log_id
     *
     * @mbg.generated
     */
    public Integer getLog_id() {
        return log_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_snatch_log.log_id
     *
     * @param log_id the value for ecs_snatch_log.log_id
     *
     * @mbg.generated
     */
    public void setLog_id(Integer log_id) {
        this.log_id = log_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_snatch_log.snatch_id
     *
     * @return the value of ecs_snatch_log.snatch_id
     *
     * @mbg.generated
     */
    public Byte getSnatch_id() {
        return snatch_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_snatch_log.snatch_id
     *
     * @param snatch_id the value for ecs_snatch_log.snatch_id
     *
     * @mbg.generated
     */
    public void setSnatch_id(Byte snatch_id) {
        this.snatch_id = snatch_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_snatch_log.user_id
     *
     * @return the value of ecs_snatch_log.user_id
     *
     * @mbg.generated
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_snatch_log.user_id
     *
     * @param user_id the value for ecs_snatch_log.user_id
     *
     * @mbg.generated
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_snatch_log.bid_price
     *
     * @return the value of ecs_snatch_log.bid_price
     *
     * @mbg.generated
     */
    public BigDecimal getBid_price() {
        return bid_price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_snatch_log.bid_price
     *
     * @param bid_price the value for ecs_snatch_log.bid_price
     *
     * @mbg.generated
     */
    public void setBid_price(BigDecimal bid_price) {
        this.bid_price = bid_price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_snatch_log.bid_time
     *
     * @return the value of ecs_snatch_log.bid_time
     *
     * @mbg.generated
     */
    public Integer getBid_time() {
        return bid_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_snatch_log.bid_time
     *
     * @param bid_time the value for ecs_snatch_log.bid_time
     *
     * @mbg.generated
     */
    public void setBid_time(Integer bid_time) {
        this.bid_time = bid_time;
    }
}