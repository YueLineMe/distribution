package com.entity;

public class FilmText {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film_text.film_id
     *
     * @mbg.generated
     */
    private Short film_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film_text.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film_text.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film_text.film_id
     *
     * @return the value of film_text.film_id
     *
     * @mbg.generated
     */
    public Short getFilm_id() {
        return film_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film_text.film_id
     *
     * @param film_id the value for film_text.film_id
     *
     * @mbg.generated
     */
    public void setFilm_id(Short film_id) {
        this.film_id = film_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film_text.title
     *
     * @return the value of film_text.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film_text.title
     *
     * @param title the value for film_text.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film_text.description
     *
     * @return the value of film_text.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film_text.description
     *
     * @param description the value for film_text.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}