package com.entity;

import java.util.Date;

public class Inventory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inventory.inventory_id
     *
     * @mbg.generated
     */
    private Integer inventory_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inventory.film_id
     *
     * @mbg.generated
     */
    private Short film_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inventory.store_id
     *
     * @mbg.generated
     */
    private Byte store_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inventory.last_update
     *
     * @mbg.generated
     */
    private Date last_update;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory.inventory_id
     *
     * @return the value of inventory.inventory_id
     *
     * @mbg.generated
     */
    public Integer getInventory_id() {
        return inventory_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory.inventory_id
     *
     * @param inventory_id the value for inventory.inventory_id
     *
     * @mbg.generated
     */
    public void setInventory_id(Integer inventory_id) {
        this.inventory_id = inventory_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory.film_id
     *
     * @return the value of inventory.film_id
     *
     * @mbg.generated
     */
    public Short getFilm_id() {
        return film_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory.film_id
     *
     * @param film_id the value for inventory.film_id
     *
     * @mbg.generated
     */
    public void setFilm_id(Short film_id) {
        this.film_id = film_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory.store_id
     *
     * @return the value of inventory.store_id
     *
     * @mbg.generated
     */
    public Byte getStore_id() {
        return store_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory.store_id
     *
     * @param store_id the value for inventory.store_id
     *
     * @mbg.generated
     */
    public void setStore_id(Byte store_id) {
        this.store_id = store_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory.last_update
     *
     * @return the value of inventory.last_update
     *
     * @mbg.generated
     */
    public Date getLast_update() {
        return last_update;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory.last_update
     *
     * @param last_update the value for inventory.last_update
     *
     * @mbg.generated
     */
    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
}