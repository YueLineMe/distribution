package com.entity;

import java.util.Date;

public class EcsEgoFollow {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_follow.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_follow.user_id
     *
     * @mbg.generated
     */
    private Long user_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_follow.target_id
     *
     * @mbg.generated
     */
    private Long target_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_follow.target_type
     *
     * @mbg.generated
     */
    private Integer target_type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_ego_follow.created_at
     *
     * @mbg.generated
     */
    private Date created_at;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_follow.id
     *
     * @return the value of ecs_ego_follow.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_follow.id
     *
     * @param id the value for ecs_ego_follow.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_follow.user_id
     *
     * @return the value of ecs_ego_follow.user_id
     *
     * @mbg.generated
     */
    public Long getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_follow.user_id
     *
     * @param user_id the value for ecs_ego_follow.user_id
     *
     * @mbg.generated
     */
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_follow.target_id
     *
     * @return the value of ecs_ego_follow.target_id
     *
     * @mbg.generated
     */
    public Long getTarget_id() {
        return target_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_follow.target_id
     *
     * @param target_id the value for ecs_ego_follow.target_id
     *
     * @mbg.generated
     */
    public void setTarget_id(Long target_id) {
        this.target_id = target_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_follow.target_type
     *
     * @return the value of ecs_ego_follow.target_type
     *
     * @mbg.generated
     */
    public Integer getTarget_type() {
        return target_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_follow.target_type
     *
     * @param target_type the value for ecs_ego_follow.target_type
     *
     * @mbg.generated
     */
    public void setTarget_type(Integer target_type) {
        this.target_type = target_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_ego_follow.created_at
     *
     * @return the value of ecs_ego_follow.created_at
     *
     * @mbg.generated
     */
    public Date getCreated_at() {
        return created_at;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_ego_follow.created_at
     *
     * @param created_at the value for ecs_ego_follow.created_at
     *
     * @mbg.generated
     */
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
}