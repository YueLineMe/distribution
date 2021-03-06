package com.entity;

import java.math.BigDecimal;

public class EcsAuctionLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_auction_log.log_id
     *
     * @mbg.generated
     */
    private Integer log_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_auction_log.act_id
     *
     * @mbg.generated
     */
    private Integer act_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_auction_log.bid_user
     *
     * @mbg.generated
     */
    private Integer bid_user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_auction_log.bid_price
     *
     * @mbg.generated
     */
    private BigDecimal bid_price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_auction_log.bid_time
     *
     * @mbg.generated
     */
    private Integer bid_time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_auction_log.log_id
     *
     * @return the value of ecs_auction_log.log_id
     *
     * @mbg.generated
     */
    public Integer getLog_id() {
        return log_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_auction_log.log_id
     *
     * @param log_id the value for ecs_auction_log.log_id
     *
     * @mbg.generated
     */
    public void setLog_id(Integer log_id) {
        this.log_id = log_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_auction_log.act_id
     *
     * @return the value of ecs_auction_log.act_id
     *
     * @mbg.generated
     */
    public Integer getAct_id() {
        return act_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_auction_log.act_id
     *
     * @param act_id the value for ecs_auction_log.act_id
     *
     * @mbg.generated
     */
    public void setAct_id(Integer act_id) {
        this.act_id = act_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_auction_log.bid_user
     *
     * @return the value of ecs_auction_log.bid_user
     *
     * @mbg.generated
     */
    public Integer getBid_user() {
        return bid_user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_auction_log.bid_user
     *
     * @param bid_user the value for ecs_auction_log.bid_user
     *
     * @mbg.generated
     */
    public void setBid_user(Integer bid_user) {
        this.bid_user = bid_user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_auction_log.bid_price
     *
     * @return the value of ecs_auction_log.bid_price
     *
     * @mbg.generated
     */
    public BigDecimal getBid_price() {
        return bid_price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_auction_log.bid_price
     *
     * @param bid_price the value for ecs_auction_log.bid_price
     *
     * @mbg.generated
     */
    public void setBid_price(BigDecimal bid_price) {
        this.bid_price = bid_price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_auction_log.bid_time
     *
     * @return the value of ecs_auction_log.bid_time
     *
     * @mbg.generated
     */
    public Integer getBid_time() {
        return bid_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_auction_log.bid_time
     *
     * @param bid_time the value for ecs_auction_log.bid_time
     *
     * @mbg.generated
     */
    public void setBid_time(Integer bid_time) {
        this.bid_time = bid_time;
    }
}