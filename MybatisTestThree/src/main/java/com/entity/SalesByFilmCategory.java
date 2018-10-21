package com.entity;

import java.math.BigDecimal;

public class SalesByFilmCategory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sales_by_film_category.category
     *
     * @mbg.generated
     */
    private String category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sales_by_film_category.total_sales
     *
     * @mbg.generated
     */
    private BigDecimal total_sales;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sales_by_film_category.category
     *
     * @return the value of sales_by_film_category.category
     *
     * @mbg.generated
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sales_by_film_category.category
     *
     * @param category the value for sales_by_film_category.category
     *
     * @mbg.generated
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sales_by_film_category.total_sales
     *
     * @return the value of sales_by_film_category.total_sales
     *
     * @mbg.generated
     */
    public BigDecimal getTotal_sales() {
        return total_sales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sales_by_film_category.total_sales
     *
     * @param total_sales the value for sales_by_film_category.total_sales
     *
     * @mbg.generated
     */
    public void setTotal_sales(BigDecimal total_sales) {
        this.total_sales = total_sales;
    }
}