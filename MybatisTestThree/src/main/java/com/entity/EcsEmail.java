package com.entity;

public class EcsEmail {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_email.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_email.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_email.hash
     *
     * @mbg.generated
     */
    private String hash;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_email.add_time
     *
     * @mbg.generated
     */
    private Integer add_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_email.user_id
     *
     * @mbg.generated
     */
    private Integer user_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_email.id
     *
     * @return the value of ecs_email.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_email.id
     *
     * @param id the value for ecs_email.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_email.email
     *
     * @return the value of ecs_email.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_email.email
     *
     * @param email the value for ecs_email.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_email.hash
     *
     * @return the value of ecs_email.hash
     *
     * @mbg.generated
     */
    public String getHash() {
        return hash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_email.hash
     *
     * @param hash the value for ecs_email.hash
     *
     * @mbg.generated
     */
    public void setHash(String hash) {
        this.hash = hash == null ? null : hash.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_email.add_time
     *
     * @return the value of ecs_email.add_time
     *
     * @mbg.generated
     */
    public Integer getAdd_time() {
        return add_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_email.add_time
     *
     * @param add_time the value for ecs_email.add_time
     *
     * @mbg.generated
     */
    public void setAdd_time(Integer add_time) {
        this.add_time = add_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_email.user_id
     *
     * @return the value of ecs_email.user_id
     *
     * @mbg.generated
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_email.user_id
     *
     * @param user_id the value for ecs_email.user_id
     *
     * @mbg.generated
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }
}