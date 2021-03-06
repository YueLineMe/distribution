package com.entity;

public class EcsWholesale {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_wholesale.act_id
     *
     * @mbg.generated
     */
    private Integer act_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_wholesale.goods_id
     *
     * @mbg.generated
     */
    private Integer goods_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_wholesale.goods_name
     *
     * @mbg.generated
     */
    private String goods_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_wholesale.rank_ids
     *
     * @mbg.generated
     */
    private String rank_ids;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_wholesale.enabled
     *
     * @mbg.generated
     */
    private Byte enabled;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_wholesale.prices
     *
     * @mbg.generated
     */
    private String prices;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_wholesale.act_id
     *
     * @return the value of ecs_wholesale.act_id
     *
     * @mbg.generated
     */
    public Integer getAct_id() {
        return act_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_wholesale.act_id
     *
     * @param act_id the value for ecs_wholesale.act_id
     *
     * @mbg.generated
     */
    public void setAct_id(Integer act_id) {
        this.act_id = act_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_wholesale.goods_id
     *
     * @return the value of ecs_wholesale.goods_id
     *
     * @mbg.generated
     */
    public Integer getGoods_id() {
        return goods_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_wholesale.goods_id
     *
     * @param goods_id the value for ecs_wholesale.goods_id
     *
     * @mbg.generated
     */
    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_wholesale.goods_name
     *
     * @return the value of ecs_wholesale.goods_name
     *
     * @mbg.generated
     */
    public String getGoods_name() {
        return goods_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_wholesale.goods_name
     *
     * @param goods_name the value for ecs_wholesale.goods_name
     *
     * @mbg.generated
     */
    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name == null ? null : goods_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_wholesale.rank_ids
     *
     * @return the value of ecs_wholesale.rank_ids
     *
     * @mbg.generated
     */
    public String getRank_ids() {
        return rank_ids;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_wholesale.rank_ids
     *
     * @param rank_ids the value for ecs_wholesale.rank_ids
     *
     * @mbg.generated
     */
    public void setRank_ids(String rank_ids) {
        this.rank_ids = rank_ids == null ? null : rank_ids.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_wholesale.enabled
     *
     * @return the value of ecs_wholesale.enabled
     *
     * @mbg.generated
     */
    public Byte getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_wholesale.enabled
     *
     * @param enabled the value for ecs_wholesale.enabled
     *
     * @mbg.generated
     */
    public void setEnabled(Byte enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_wholesale.prices
     *
     * @return the value of ecs_wholesale.prices
     *
     * @mbg.generated
     */
    public String getPrices() {
        return prices;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_wholesale.prices
     *
     * @param prices the value for ecs_wholesale.prices
     *
     * @mbg.generated
     */
    public void setPrices(String prices) {
        this.prices = prices == null ? null : prices.trim();
    }
}