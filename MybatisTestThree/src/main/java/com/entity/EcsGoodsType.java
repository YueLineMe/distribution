package com.entity;

public class EcsGoodsType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_goods_type.cat_id
     *
     * @mbg.generated
     */
    private Short cat_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_goods_type.cat_name
     *
     * @mbg.generated
     */
    private String cat_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_goods_type.enabled
     *
     * @mbg.generated
     */
    private Boolean enabled;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_goods_type.attr_group
     *
     * @mbg.generated
     */
    private String attr_group;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_goods_type.cat_id
     *
     * @return the value of ecs_goods_type.cat_id
     *
     * @mbg.generated
     */
    public Short getCat_id() {
        return cat_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_goods_type.cat_id
     *
     * @param cat_id the value for ecs_goods_type.cat_id
     *
     * @mbg.generated
     */
    public void setCat_id(Short cat_id) {
        this.cat_id = cat_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_goods_type.cat_name
     *
     * @return the value of ecs_goods_type.cat_name
     *
     * @mbg.generated
     */
    public String getCat_name() {
        return cat_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_goods_type.cat_name
     *
     * @param cat_name the value for ecs_goods_type.cat_name
     *
     * @mbg.generated
     */
    public void setCat_name(String cat_name) {
        this.cat_name = cat_name == null ? null : cat_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_goods_type.enabled
     *
     * @return the value of ecs_goods_type.enabled
     *
     * @mbg.generated
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_goods_type.enabled
     *
     * @param enabled the value for ecs_goods_type.enabled
     *
     * @mbg.generated
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_goods_type.attr_group
     *
     * @return the value of ecs_goods_type.attr_group
     *
     * @mbg.generated
     */
    public String getAttr_group() {
        return attr_group;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_goods_type.attr_group
     *
     * @param attr_group the value for ecs_goods_type.attr_group
     *
     * @mbg.generated
     */
    public void setAttr_group(String attr_group) {
        this.attr_group = attr_group == null ? null : attr_group.trim();
    }
}