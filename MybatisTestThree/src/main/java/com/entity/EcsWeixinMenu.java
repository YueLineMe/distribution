package com.entity;

public class EcsWeixinMenu {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_menu.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_menu.pid
     *
     * @mbg.generated
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_menu.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_menu.type
     *
     * @mbg.generated
     */
    private Boolean type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_menu.value
     *
     * @mbg.generated
     */
    private String value;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_weixin_menu.order
     *
     * @mbg.generated
     */
    private Integer order;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_menu.id
     *
     * @return the value of ecs_weixin_menu.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_menu.id
     *
     * @param id the value for ecs_weixin_menu.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_menu.pid
     *
     * @return the value of ecs_weixin_menu.pid
     *
     * @mbg.generated
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_menu.pid
     *
     * @param pid the value for ecs_weixin_menu.pid
     *
     * @mbg.generated
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_menu.name
     *
     * @return the value of ecs_weixin_menu.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_menu.name
     *
     * @param name the value for ecs_weixin_menu.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_menu.type
     *
     * @return the value of ecs_weixin_menu.type
     *
     * @mbg.generated
     */
    public Boolean getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_menu.type
     *
     * @param type the value for ecs_weixin_menu.type
     *
     * @mbg.generated
     */
    public void setType(Boolean type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_menu.value
     *
     * @return the value of ecs_weixin_menu.value
     *
     * @mbg.generated
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_menu.value
     *
     * @param value the value for ecs_weixin_menu.value
     *
     * @mbg.generated
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_weixin_menu.order
     *
     * @return the value of ecs_weixin_menu.order
     *
     * @mbg.generated
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_weixin_menu.order
     *
     * @param order the value for ecs_weixin_menu.order
     *
     * @mbg.generated
     */
    public void setOrder(Integer order) {
        this.order = order;
    }
}