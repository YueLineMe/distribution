package com.entity;

public class EcsTakegoods {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_takegoods.tg_id
     *
     * @mbg.generated
     */
    private Integer tg_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_takegoods.type_id
     *
     * @mbg.generated
     */
    private Byte type_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_takegoods.tg_sn
     *
     * @mbg.generated
     */
    private String tg_sn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_takegoods.tg_pwd
     *
     * @mbg.generated
     */
    private String tg_pwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_takegoods.tg_order_id
     *
     * @mbg.generated
     */
    private Integer tg_order_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_takegoods.used_time
     *
     * @mbg.generated
     */
    private String used_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_takegoods.add_time
     *
     * @mbg.generated
     */
    private Integer add_time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_takegoods.tg_id
     *
     * @return the value of ecs_takegoods.tg_id
     *
     * @mbg.generated
     */
    public Integer getTg_id() {
        return tg_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_takegoods.tg_id
     *
     * @param tg_id the value for ecs_takegoods.tg_id
     *
     * @mbg.generated
     */
    public void setTg_id(Integer tg_id) {
        this.tg_id = tg_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_takegoods.type_id
     *
     * @return the value of ecs_takegoods.type_id
     *
     * @mbg.generated
     */
    public Byte getType_id() {
        return type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_takegoods.type_id
     *
     * @param type_id the value for ecs_takegoods.type_id
     *
     * @mbg.generated
     */
    public void setType_id(Byte type_id) {
        this.type_id = type_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_takegoods.tg_sn
     *
     * @return the value of ecs_takegoods.tg_sn
     *
     * @mbg.generated
     */
    public String getTg_sn() {
        return tg_sn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_takegoods.tg_sn
     *
     * @param tg_sn the value for ecs_takegoods.tg_sn
     *
     * @mbg.generated
     */
    public void setTg_sn(String tg_sn) {
        this.tg_sn = tg_sn == null ? null : tg_sn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_takegoods.tg_pwd
     *
     * @return the value of ecs_takegoods.tg_pwd
     *
     * @mbg.generated
     */
    public String getTg_pwd() {
        return tg_pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_takegoods.tg_pwd
     *
     * @param tg_pwd the value for ecs_takegoods.tg_pwd
     *
     * @mbg.generated
     */
    public void setTg_pwd(String tg_pwd) {
        this.tg_pwd = tg_pwd == null ? null : tg_pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_takegoods.tg_order_id
     *
     * @return the value of ecs_takegoods.tg_order_id
     *
     * @mbg.generated
     */
    public Integer getTg_order_id() {
        return tg_order_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_takegoods.tg_order_id
     *
     * @param tg_order_id the value for ecs_takegoods.tg_order_id
     *
     * @mbg.generated
     */
    public void setTg_order_id(Integer tg_order_id) {
        this.tg_order_id = tg_order_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_takegoods.used_time
     *
     * @return the value of ecs_takegoods.used_time
     *
     * @mbg.generated
     */
    public String getUsed_time() {
        return used_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_takegoods.used_time
     *
     * @param used_time the value for ecs_takegoods.used_time
     *
     * @mbg.generated
     */
    public void setUsed_time(String used_time) {
        this.used_time = used_time == null ? null : used_time.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_takegoods.add_time
     *
     * @return the value of ecs_takegoods.add_time
     *
     * @mbg.generated
     */
    public Integer getAdd_time() {
        return add_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_takegoods.add_time
     *
     * @param add_time the value for ecs_takegoods.add_time
     *
     * @mbg.generated
     */
    public void setAdd_time(Integer add_time) {
        this.add_time = add_time;
    }
}