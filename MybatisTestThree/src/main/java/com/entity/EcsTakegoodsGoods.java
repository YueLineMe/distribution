package com.entity;

public class EcsTakegoodsGoods {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_takegoods_goods.tg_id
     *
     * @mbg.generated
     */
    private Integer tg_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_takegoods_goods.goods_ids
     *
     * @mbg.generated
     */
    private String goods_ids;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_takegoods_goods.tg_id
     *
     * @return the value of ecs_takegoods_goods.tg_id
     *
     * @mbg.generated
     */
    public Integer getTg_id() {
        return tg_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_takegoods_goods.tg_id
     *
     * @param tg_id the value for ecs_takegoods_goods.tg_id
     *
     * @mbg.generated
     */
    public void setTg_id(Integer tg_id) {
        this.tg_id = tg_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_takegoods_goods.goods_ids
     *
     * @return the value of ecs_takegoods_goods.goods_ids
     *
     * @mbg.generated
     */
    public String getGoods_ids() {
        return goods_ids;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_takegoods_goods.goods_ids
     *
     * @param goods_ids the value for ecs_takegoods_goods.goods_ids
     *
     * @mbg.generated
     */
    public void setGoods_ids(String goods_ids) {
        this.goods_ids = goods_ids == null ? null : goods_ids.trim();
    }
}