package com.entity;

public class EcsPostman {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_postman.postman_id
     *
     * @mbg.generated
     */
    private Short postman_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_postman.postman_name
     *
     * @mbg.generated
     */
    private String postman_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_postman.region_id
     *
     * @mbg.generated
     */
    private Integer region_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_postman.mobile
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_postman.postman_id
     *
     * @return the value of ecs_postman.postman_id
     *
     * @mbg.generated
     */
    public Short getPostman_id() {
        return postman_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_postman.postman_id
     *
     * @param postman_id the value for ecs_postman.postman_id
     *
     * @mbg.generated
     */
    public void setPostman_id(Short postman_id) {
        this.postman_id = postman_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_postman.postman_name
     *
     * @return the value of ecs_postman.postman_name
     *
     * @mbg.generated
     */
    public String getPostman_name() {
        return postman_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_postman.postman_name
     *
     * @param postman_name the value for ecs_postman.postman_name
     *
     * @mbg.generated
     */
    public void setPostman_name(String postman_name) {
        this.postman_name = postman_name == null ? null : postman_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_postman.region_id
     *
     * @return the value of ecs_postman.region_id
     *
     * @mbg.generated
     */
    public Integer getRegion_id() {
        return region_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_postman.region_id
     *
     * @param region_id the value for ecs_postman.region_id
     *
     * @mbg.generated
     */
    public void setRegion_id(Integer region_id) {
        this.region_id = region_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_postman.mobile
     *
     * @return the value of ecs_postman.mobile
     *
     * @mbg.generated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_postman.mobile
     *
     * @param mobile the value for ecs_postman.mobile
     *
     * @mbg.generated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }
}