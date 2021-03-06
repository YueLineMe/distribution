package com.entity;

import java.math.BigDecimal;

public class EcsAffiliateLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_affiliate_log.log_id
     *
     * @mbg.generated
     */
    private Integer log_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_affiliate_log.order_id
     *
     * @mbg.generated
     */
    private Integer order_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_affiliate_log.time
     *
     * @mbg.generated
     */
    private Integer time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_affiliate_log.user_id
     *
     * @mbg.generated
     */
    private Integer user_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_affiliate_log.user_name
     *
     * @mbg.generated
     */
    private String user_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_affiliate_log.money
     *
     * @mbg.generated
     */
    private BigDecimal money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_affiliate_log.point
     *
     * @mbg.generated
     */
    private Integer point;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_affiliate_log.separate_type
     *
     * @mbg.generated
     */
    private Boolean separate_type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_affiliate_log.log_id
     *
     * @return the value of ecs_affiliate_log.log_id
     *
     * @mbg.generated
     */
    public Integer getLog_id() {
        return log_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_affiliate_log.log_id
     *
     * @param log_id the value for ecs_affiliate_log.log_id
     *
     * @mbg.generated
     */
    public void setLog_id(Integer log_id) {
        this.log_id = log_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_affiliate_log.order_id
     *
     * @return the value of ecs_affiliate_log.order_id
     *
     * @mbg.generated
     */
    public Integer getOrder_id() {
        return order_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_affiliate_log.order_id
     *
     * @param order_id the value for ecs_affiliate_log.order_id
     *
     * @mbg.generated
     */
    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_affiliate_log.time
     *
     * @return the value of ecs_affiliate_log.time
     *
     * @mbg.generated
     */
    public Integer getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_affiliate_log.time
     *
     * @param time the value for ecs_affiliate_log.time
     *
     * @mbg.generated
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_affiliate_log.user_id
     *
     * @return the value of ecs_affiliate_log.user_id
     *
     * @mbg.generated
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_affiliate_log.user_id
     *
     * @param user_id the value for ecs_affiliate_log.user_id
     *
     * @mbg.generated
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_affiliate_log.user_name
     *
     * @return the value of ecs_affiliate_log.user_name
     *
     * @mbg.generated
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_affiliate_log.user_name
     *
     * @param user_name the value for ecs_affiliate_log.user_name
     *
     * @mbg.generated
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_affiliate_log.money
     *
     * @return the value of ecs_affiliate_log.money
     *
     * @mbg.generated
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_affiliate_log.money
     *
     * @param money the value for ecs_affiliate_log.money
     *
     * @mbg.generated
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_affiliate_log.point
     *
     * @return the value of ecs_affiliate_log.point
     *
     * @mbg.generated
     */
    public Integer getPoint() {
        return point;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_affiliate_log.point
     *
     * @param point the value for ecs_affiliate_log.point
     *
     * @mbg.generated
     */
    public void setPoint(Integer point) {
        this.point = point;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_affiliate_log.separate_type
     *
     * @return the value of ecs_affiliate_log.separate_type
     *
     * @mbg.generated
     */
    public Boolean getSeparate_type() {
        return separate_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_affiliate_log.separate_type
     *
     * @param separate_type the value for ecs_affiliate_log.separate_type
     *
     * @mbg.generated
     */
    public void setSeparate_type(Boolean separate_type) {
        this.separate_type = separate_type;
    }
}