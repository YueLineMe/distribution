package com.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Payment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.payment_id
     *
     * @mbg.generated
     */
    private Short payment_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.customer_id
     *
     * @mbg.generated
     */
    private Short customer_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.staff_id
     *
     * @mbg.generated
     */
    private Byte staff_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.rental_id
     *
     * @mbg.generated
     */
    private Integer rental_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.amount
     *
     * @mbg.generated
     */
    private BigDecimal amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.payment_date
     *
     * @mbg.generated
     */
    private Date payment_date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.last_update
     *
     * @mbg.generated
     */
    private Date last_update;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.payment_id
     *
     * @return the value of payment.payment_id
     *
     * @mbg.generated
     */
    public Short getPayment_id() {
        return payment_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.payment_id
     *
     * @param payment_id the value for payment.payment_id
     *
     * @mbg.generated
     */
    public void setPayment_id(Short payment_id) {
        this.payment_id = payment_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.customer_id
     *
     * @return the value of payment.customer_id
     *
     * @mbg.generated
     */
    public Short getCustomer_id() {
        return customer_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.customer_id
     *
     * @param customer_id the value for payment.customer_id
     *
     * @mbg.generated
     */
    public void setCustomer_id(Short customer_id) {
        this.customer_id = customer_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.staff_id
     *
     * @return the value of payment.staff_id
     *
     * @mbg.generated
     */
    public Byte getStaff_id() {
        return staff_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.staff_id
     *
     * @param staff_id the value for payment.staff_id
     *
     * @mbg.generated
     */
    public void setStaff_id(Byte staff_id) {
        this.staff_id = staff_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.rental_id
     *
     * @return the value of payment.rental_id
     *
     * @mbg.generated
     */
    public Integer getRental_id() {
        return rental_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.rental_id
     *
     * @param rental_id the value for payment.rental_id
     *
     * @mbg.generated
     */
    public void setRental_id(Integer rental_id) {
        this.rental_id = rental_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.amount
     *
     * @return the value of payment.amount
     *
     * @mbg.generated
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.amount
     *
     * @param amount the value for payment.amount
     *
     * @mbg.generated
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.payment_date
     *
     * @return the value of payment.payment_date
     *
     * @mbg.generated
     */
    public Date getPayment_date() {
        return payment_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.payment_date
     *
     * @param payment_date the value for payment.payment_date
     *
     * @mbg.generated
     */
    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.last_update
     *
     * @return the value of payment.last_update
     *
     * @mbg.generated
     */
    public Date getLast_update() {
        return last_update;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.last_update
     *
     * @param last_update the value for payment.last_update
     *
     * @mbg.generated
     */
    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
}