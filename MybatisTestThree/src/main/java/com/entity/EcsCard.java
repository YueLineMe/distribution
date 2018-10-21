package com.entity;

import java.math.BigDecimal;

public class EcsCard {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_card.card_id
     *
     * @mbg.generated
     */
    private Byte card_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_card.card_name
     *
     * @mbg.generated
     */
    private String card_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_card.card_img
     *
     * @mbg.generated
     */
    private String card_img;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_card.card_fee
     *
     * @mbg.generated
     */
    private BigDecimal card_fee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_card.free_money
     *
     * @mbg.generated
     */
    private BigDecimal free_money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_card.card_desc
     *
     * @mbg.generated
     */
    private String card_desc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_card.card_id
     *
     * @return the value of ecs_card.card_id
     *
     * @mbg.generated
     */
    public Byte getCard_id() {
        return card_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_card.card_id
     *
     * @param card_id the value for ecs_card.card_id
     *
     * @mbg.generated
     */
    public void setCard_id(Byte card_id) {
        this.card_id = card_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_card.card_name
     *
     * @return the value of ecs_card.card_name
     *
     * @mbg.generated
     */
    public String getCard_name() {
        return card_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_card.card_name
     *
     * @param card_name the value for ecs_card.card_name
     *
     * @mbg.generated
     */
    public void setCard_name(String card_name) {
        this.card_name = card_name == null ? null : card_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_card.card_img
     *
     * @return the value of ecs_card.card_img
     *
     * @mbg.generated
     */
    public String getCard_img() {
        return card_img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_card.card_img
     *
     * @param card_img the value for ecs_card.card_img
     *
     * @mbg.generated
     */
    public void setCard_img(String card_img) {
        this.card_img = card_img == null ? null : card_img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_card.card_fee
     *
     * @return the value of ecs_card.card_fee
     *
     * @mbg.generated
     */
    public BigDecimal getCard_fee() {
        return card_fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_card.card_fee
     *
     * @param card_fee the value for ecs_card.card_fee
     *
     * @mbg.generated
     */
    public void setCard_fee(BigDecimal card_fee) {
        this.card_fee = card_fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_card.free_money
     *
     * @return the value of ecs_card.free_money
     *
     * @mbg.generated
     */
    public BigDecimal getFree_money() {
        return free_money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_card.free_money
     *
     * @param free_money the value for ecs_card.free_money
     *
     * @mbg.generated
     */
    public void setFree_money(BigDecimal free_money) {
        this.free_money = free_money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_card.card_desc
     *
     * @return the value of ecs_card.card_desc
     *
     * @mbg.generated
     */
    public String getCard_desc() {
        return card_desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_card.card_desc
     *
     * @param card_desc the value for ecs_card.card_desc
     *
     * @mbg.generated
     */
    public void setCard_desc(String card_desc) {
        this.card_desc = card_desc == null ? null : card_desc.trim();
    }
}