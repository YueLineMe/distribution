package com.entity;

public class FilmCategoryKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film_category.film_id
     *
     * @mbg.generated
     */
    private Short film_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film_category.category_id
     *
     * @mbg.generated
     */
    private Byte category_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film_category.film_id
     *
     * @return the value of film_category.film_id
     *
     * @mbg.generated
     */
    public Short getFilm_id() {
        return film_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film_category.film_id
     *
     * @param film_id the value for film_category.film_id
     *
     * @mbg.generated
     */
    public void setFilm_id(Short film_id) {
        this.film_id = film_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film_category.category_id
     *
     * @return the value of film_category.category_id
     *
     * @mbg.generated
     */
    public Byte getCategory_id() {
        return category_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film_category.category_id
     *
     * @param category_id the value for film_category.category_id
     *
     * @mbg.generated
     */
    public void setCategory_id(Byte category_id) {
        this.category_id = category_id;
    }
}