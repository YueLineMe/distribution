package com.entity;

public class EcsBarCode {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_bar_code.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_bar_code.goods_id
     *
     * @mbg.generated
     */
    private Integer goods_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_bar_code.bar_code
     *
     * @mbg.generated
     */
    private String bar_code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_bar_code.taypes
     *
     * @mbg.generated
     */
    private String taypes;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_bar_code.id
     *
     * @return the value of ecs_bar_code.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_bar_code.id
     *
     * @param id the value for ecs_bar_code.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_bar_code.goods_id
     *
     * @return the value of ecs_bar_code.goods_id
     *
     * @mbg.generated
     */
    public Integer getGoods_id() {
        return goods_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_bar_code.goods_id
     *
     * @param goods_id the value for ecs_bar_code.goods_id
     *
     * @mbg.generated
     */
    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_bar_code.bar_code
     *
     * @return the value of ecs_bar_code.bar_code
     *
     * @mbg.generated
     */
    public String getBar_code() {
        return bar_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_bar_code.bar_code
     *
     * @param bar_code the value for ecs_bar_code.bar_code
     *
     * @mbg.generated
     */
    public void setBar_code(String bar_code) {
        this.bar_code = bar_code == null ? null : bar_code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_bar_code.taypes
     *
     * @return the value of ecs_bar_code.taypes
     *
     * @mbg.generated
     */
    public String getTaypes() {
        return taypes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_bar_code.taypes
     *
     * @param taypes the value for ecs_bar_code.taypes
     *
     * @mbg.generated
     */
    public void setTaypes(String taypes) {
        this.taypes = taypes == null ? null : taypes.trim();
    }
}