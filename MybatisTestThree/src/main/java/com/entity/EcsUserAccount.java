package com.entity;

import java.math.BigDecimal;

public class EcsUserAccount {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_user_account.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_user_account.user_id
     *
     * @mbg.generated
     */
    private Integer user_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_user_account.admin_user
     *
     * @mbg.generated
     */
    private String admin_user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_user_account.amount
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_user_account.add_time
     *
     * @mbg.generated
     */
    private Integer add_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_user_account.paid_time
     *
     * @mbg.generated
     */
    private Integer paid_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_user_account.admin_note
     *
     * @mbg.generated
     */
    private String admin_note;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_user_account.user_note
     *
     * @mbg.generated
     */
    private String user_note;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_user_account.process_type
     *
     * @mbg.generated
     */
    private Boolean process_type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_user_account.payment
     *
     * @mbg.generated
     */
    private String payment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_user_account.is_paid
     *
     * @mbg.generated
     */
    private Boolean is_paid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_user_account.id
     *
     * @return the value of ecs_user_account.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_user_account.id
     *
     * @param id the value for ecs_user_account.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_user_account.user_id
     *
     * @return the value of ecs_user_account.user_id
     *
     * @mbg.generated
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_user_account.user_id
     *
     * @param user_id the value for ecs_user_account.user_id
     *
     * @mbg.generated
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_user_account.admin_user
     *
     * @return the value of ecs_user_account.admin_user
     *
     * @mbg.generated
     */
    public String getAdmin_user() {
        return admin_user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_user_account.admin_user
     *
     * @param admin_user the value for ecs_user_account.admin_user
     *
     * @mbg.generated
     */
    public void setAdmin_user(String admin_user) {
        this.admin_user = admin_user == null ? null : admin_user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_user_account.amount
     *
     * @return the value of ecs_user_account.amount
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_user_account.amount
     *
     * @param amount the value for ecs_user_account.amount
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_user_account.add_time
     *
     * @return the value of ecs_user_account.add_time
     *
     * @mbg.generated
     */
    public Integer getAdd_time() {
        return add_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_user_account.add_time
     *
     * @param add_time the value for ecs_user_account.add_time
     *
     * @mbg.generated
     */
    public void setAdd_time(Integer add_time) {
        this.add_time = add_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_user_account.paid_time
     *
     * @return the value of ecs_user_account.paid_time
     *
     * @mbg.generated
     */
    public Integer getPaid_time() {
        return paid_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_user_account.paid_time
     *
     * @param paid_time the value for ecs_user_account.paid_time
     *
     * @mbg.generated
     */
    public void setPaid_time(Integer paid_time) {
        this.paid_time = paid_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_user_account.admin_note
     *
     * @return the value of ecs_user_account.admin_note
     *
     * @mbg.generated
     */
    public String getAdmin_note() {
        return admin_note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_user_account.admin_note
     *
     * @param admin_note the value for ecs_user_account.admin_note
     *
     * @mbg.generated
     */
    public void setAdmin_note(String admin_note) {
        this.admin_note = admin_note == null ? null : admin_note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_user_account.user_note
     *
     * @return the value of ecs_user_account.user_note
     *
     * @mbg.generated
     */
    public String getUser_note() {
        return user_note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_user_account.user_note
     *
     * @param user_note the value for ecs_user_account.user_note
     *
     * @mbg.generated
     */
    public void setUser_note(String user_note) {
        this.user_note = user_note == null ? null : user_note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_user_account.process_type
     *
     * @return the value of ecs_user_account.process_type
     *
     * @mbg.generated
     */
    public Boolean getProcess_type() {
        return process_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_user_account.process_type
     *
     * @param process_type the value for ecs_user_account.process_type
     *
     * @mbg.generated
     */
    public void setProcess_type(Boolean process_type) {
        this.process_type = process_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_user_account.payment
     *
     * @return the value of ecs_user_account.payment
     *
     * @mbg.generated
     */
    public String getPayment() {
        return payment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_user_account.payment
     *
     * @param payment the value for ecs_user_account.payment
     *
     * @mbg.generated
     */
    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_user_account.is_paid
     *
     * @return the value of ecs_user_account.is_paid
     *
     * @mbg.generated
     */
    public Boolean getIs_paid() {
        return is_paid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_user_account.is_paid
     *
     * @param is_paid the value for ecs_user_account.is_paid
     *
     * @mbg.generated
     */
    public void setIs_paid(Boolean is_paid) {
        this.is_paid = is_paid;
    }
}