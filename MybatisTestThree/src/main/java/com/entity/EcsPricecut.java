package com.entity;

import java.math.BigDecimal;

public class EcsPricecut {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pricecut.pricecut_id
     *
     * @mbg.generated
     */
    private Integer pricecut_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pricecut.goods_id
     *
     * @mbg.generated
     */
    private Integer goods_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pricecut.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pricecut.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pricecut.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pricecut.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pricecut.add_time
     *
     * @mbg.generated
     */
    private Integer add_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_pricecut.status
     *
     * @mbg.generated
     */
    private Boolean status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pricecut.pricecut_id
     *
     * @return the value of ecs_pricecut.pricecut_id
     *
     * @mbg.generated
     */
    public Integer getPricecut_id() {
        return pricecut_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pricecut.pricecut_id
     *
     * @param pricecut_id the value for ecs_pricecut.pricecut_id
     *
     * @mbg.generated
     */
    public void setPricecut_id(Integer pricecut_id) {
        this.pricecut_id = pricecut_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pricecut.goods_id
     *
     * @return the value of ecs_pricecut.goods_id
     *
     * @mbg.generated
     */
    public Integer getGoods_id() {
        return goods_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pricecut.goods_id
     *
     * @param goods_id the value for ecs_pricecut.goods_id
     *
     * @mbg.generated
     */
    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pricecut.price
     *
     * @return the value of ecs_pricecut.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pricecut.price
     *
     * @param price the value for ecs_pricecut.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pricecut.mobile
     *
     * @return the value of ecs_pricecut.mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pricecut.mobile
     *
     * @param mobile the value for ecs_pricecut.mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pricecut.email
     *
     * @return the value of ecs_pricecut.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pricecut.email
     *
     * @param email the value for ecs_pricecut.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pricecut.remark
     *
     * @return the value of ecs_pricecut.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pricecut.remark
     *
     * @param remark the value for ecs_pricecut.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pricecut.add_time
     *
     * @return the value of ecs_pricecut.add_time
     *
     * @mbg.generated
     */
    public Integer getAdd_time() {
        return add_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pricecut.add_time
     *
     * @param add_time the value for ecs_pricecut.add_time
     *
     * @mbg.generated
     */
    public void setAdd_time(Integer add_time) {
        this.add_time = add_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_pricecut.status
     *
     * @return the value of ecs_pricecut.status
     *
     * @mbg.generated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_pricecut.status
     *
     * @param status the value for ecs_pricecut.status
     *
     * @mbg.generated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}