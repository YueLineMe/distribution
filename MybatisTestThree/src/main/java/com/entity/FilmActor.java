package com.entity;

import java.util.Date;

public class FilmActor {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film_actor.actor_id
     *
     * @mbg.generated
     */
    private Short actor_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film_actor.film_id
     *
     * @mbg.generated
     */
    private Short film_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film_actor.last_update
     *
     * @mbg.generated
     */
    private Date last_update;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film_actor.actor_id
     *
     * @return the value of film_actor.actor_id
     *
     * @mbg.generated
     */
    public Short getActor_id() {
        return actor_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film_actor.actor_id
     *
     * @param actor_id the value for film_actor.actor_id
     *
     * @mbg.generated
     */
    public void setActor_id(Short actor_id) {
        this.actor_id = actor_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film_actor.film_id
     *
     * @return the value of film_actor.film_id
     *
     * @mbg.generated
     */
    public Short getFilm_id() {
        return film_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film_actor.film_id
     *
     * @param film_id the value for film_actor.film_id
     *
     * @mbg.generated
     */
    public void setFilm_id(Short film_id) {
        this.film_id = film_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film_actor.last_update
     *
     * @return the value of film_actor.last_update
     *
     * @mbg.generated
     */
    public Date getLast_update() {
        return last_update;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film_actor.last_update
     *
     * @param last_update the value for film_actor.last_update
     *
     * @mbg.generated
     */
    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }
}