package com.entity;

public class EcsAdminAction {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_admin_action.action_id
     *
     * @mbg.generated
     */
    private Integer action_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_admin_action.parent_id
     *
     * @mbg.generated
     */
    private Integer parent_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_admin_action.action_code
     *
     * @mbg.generated
     */
    private String action_code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_admin_action.relevance
     *
     * @mbg.generated
     */
    private String relevance;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_admin_action.action_id
     *
     * @return the value of ecs_admin_action.action_id
     *
     * @mbg.generated
     */
    public Integer getAction_id() {
        return action_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_admin_action.action_id
     *
     * @param action_id the value for ecs_admin_action.action_id
     *
     * @mbg.generated
     */
    public void setAction_id(Integer action_id) {
        this.action_id = action_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_admin_action.parent_id
     *
     * @return the value of ecs_admin_action.parent_id
     *
     * @mbg.generated
     */
    public Integer getParent_id() {
        return parent_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_admin_action.parent_id
     *
     * @param parent_id the value for ecs_admin_action.parent_id
     *
     * @mbg.generated
     */
    public void setParent_id(Integer parent_id) {
        this.parent_id = parent_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_admin_action.action_code
     *
     * @return the value of ecs_admin_action.action_code
     *
     * @mbg.generated
     */
    public String getAction_code() {
        return action_code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_admin_action.action_code
     *
     * @param action_code the value for ecs_admin_action.action_code
     *
     * @mbg.generated
     */
    public void setAction_code(String action_code) {
        this.action_code = action_code == null ? null : action_code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_admin_action.relevance
     *
     * @return the value of ecs_admin_action.relevance
     *
     * @mbg.generated
     */
    public String getRelevance() {
        return relevance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_admin_action.relevance
     *
     * @param relevance the value for ecs_admin_action.relevance
     *
     * @mbg.generated
     */
    public void setRelevance(String relevance) {
        this.relevance = relevance == null ? null : relevance.trim();
    }
}