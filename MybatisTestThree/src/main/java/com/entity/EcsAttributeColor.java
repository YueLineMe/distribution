package com.entity;

public class EcsAttributeColor {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_attribute_color.attr_color_id
     *
     * @mbg.generated
     */
    private Integer attr_color_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_attribute_color.attr_id
     *
     * @mbg.generated
     */
    private Integer attr_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_attribute_color.color_name
     *
     * @mbg.generated
     */
    private String color_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_attribute_color.color_code
     *
     * @mbg.generated
     */
    private String color_code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_attribute_color.image
     *
     * @mbg.generated
     */
    private String image;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_attribute_color.attr_color_id
     *
     * @return the value of ecs_attribute_color.attr_color_id
     *
     * @mbg.generated
     */
    public Integer getAttr_color_id() {
        return attr_color_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_attribute_color.attr_color_id
     *
     * @param attr_color_id the value for ecs_attribute_color.attr_color_id
     *
     * @mbg.generated
     */
    public void setAttr_color_id(Integer attr_color_id) {
        this.attr_color_id = attr_color_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_attribute_color.attr_id
     *
     * @return the value of ecs_attribute_color.attr_id
     *
     * @mbg.generated
     */
    public Integer getAttr_id() {
        return attr_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_attribute_color.attr_id
     *
     * @param attr_id the value for ecs_attribute_color.attr_id
     *
     * @mbg.generated
     */
    public void setAttr_id(Integer attr_id) {
        this.attr_id = attr_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_attribute_color.color_name
     *
     * @return the value of ecs_attribute_color.color_name
     *
     * @mbg.generated
     */
    public String getColor_name() {
        return color_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_attribute_color.color_name
     *
     * @param color_name the value for ecs_attribute_color.color_name
     *
     * @mbg.generated
     */
    public void setColor_name(String color_name) {
        this.color_name = color_name == null ? null : color_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_attribute_color.color_code
     *
     * @return the value of ecs_attribute_color.color_code
     *
     * @mbg.generated
     */
    public String getColor_code() {
        return color_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_attribute_color.color_code
     *
     * @param color_code the value for ecs_attribute_color.color_code
     *
     * @mbg.generated
     */
    public void setColor_code(String color_code) {
        this.color_code = color_code == null ? null : color_code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_attribute_color.image
     *
     * @return the value of ecs_attribute_color.image
     *
     * @mbg.generated
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_attribute_color.image
     *
     * @param image the value for ecs_attribute_color.image
     *
     * @mbg.generated
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }
}