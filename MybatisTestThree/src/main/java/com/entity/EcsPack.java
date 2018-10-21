package com.entity;

import java.math.BigDecimal;

public class EcsPack {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pack.pack_id
     *
     * @mbg.generated
     */
    private Byte pack_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pack.pack_name
     *
     * @mbg.generated
     */
    private String pack_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pack.pack_img
     *
     * @mbg.generated
     */
    private String pack_img;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pack.pack_fee
     *
     * @mbg.generated
     */
    private BigDecimal pack_fee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pack.free_money
     *
     * @mbg.generated
     */
    private Short free_money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pack.pack_desc
     *
     * @mbg.generated
     */
    private String pack_desc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pack.pack_id
     *
     * @return the value of ecs_pack.pack_id
     *
     * @mbg.generated
     */
    public Byte getPack_id() {
        return pack_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pack.pack_id
     *
     * @param pack_id the value for ecs_pack.pack_id
     *
     * @mbg.generated
     */
    public void setPack_id(Byte pack_id) {
        this.pack_id = pack_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pack.pack_name
     *
     * @return the value of ecs_pack.pack_name
     *
     * @mbg.generated
     */
    public String getPack_name() {
        return pack_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pack.pack_name
     *
     * @param pack_name the value for ecs_pack.pack_name
     *
     * @mbg.generated
     */
    public void setPack_name(String pack_name) {
        this.pack_name = pack_name == null ? null : pack_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pack.pack_img
     *
     * @return the value of ecs_pack.pack_img
     *
     * @mbg.generated
     */
    public String getPack_img() {
        return pack_img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pack.pack_img
     *
     * @param pack_img the value for ecs_pack.pack_img
     *
     * @mbg.generated
     */
    public void setPack_img(String pack_img) {
        this.pack_img = pack_img == null ? null : pack_img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pack.pack_fee
     *
     * @return the value of ecs_pack.pack_fee
     *
     * @mbg.generated
     */
    public BigDecimal getPack_fee() {
        return pack_fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pack.pack_fee
     *
     * @param pack_fee the value for ecs_pack.pack_fee
     *
     * @mbg.generated
     */
    public void setPack_fee(BigDecimal pack_fee) {
        this.pack_fee = pack_fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pack.free_money
     *
     * @return the value of ecs_pack.free_money
     *
     * @mbg.generated
     */
    public Short getFree_money() {
        return free_money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pack.free_money
     *
     * @param free_money the value for ecs_pack.free_money
     *
     * @mbg.generated
     */
    public void setFree_money(Short free_money) {
        this.free_money = free_money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pack.pack_desc
     *
     * @return the value of ecs_pack.pack_desc
     *
     * @mbg.generated
     */
    public String getPack_desc() {
        return pack_desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pack.pack_desc
     *
     * @param pack_desc the value for ecs_pack.pack_desc
     *
     * @mbg.generated
     */
    public void setPack_desc(String pack_desc) {
        this.pack_desc = pack_desc == null ? null : pack_desc.trim();
    }
}