package com.entity;

public class StatusByHost {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column status_by_host.HOST
     *
     * @mbg.generated
     */
    private String HOST;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column status_by_host.VARIABLE_NAME
     *
     * @mbg.generated
     */
    private String VARIABLE_NAME;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column status_by_host.VARIABLE_VALUE
     *
     * @mbg.generated
     */
    private String VARIABLE_VALUE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column status_by_host.HOST
     *
     * @return the value of status_by_host.HOST
     *
     * @mbg.generated
     */
    public String getHOST() {
        return HOST;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column status_by_host.HOST
     *
     * @param HOST the value for status_by_host.HOST
     *
     * @mbg.generated
     */
    public void setHOST(String HOST) {
        this.HOST = HOST == null ? null : HOST.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column status_by_host.VARIABLE_NAME
     *
     * @return the value of status_by_host.VARIABLE_NAME
     *
     * @mbg.generated
     */
    public String getVARIABLE_NAME() {
        return VARIABLE_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column status_by_host.VARIABLE_NAME
     *
     * @param VARIABLE_NAME the value for status_by_host.VARIABLE_NAME
     *
     * @mbg.generated
     */
    public void setVARIABLE_NAME(String VARIABLE_NAME) {
        this.VARIABLE_NAME = VARIABLE_NAME == null ? null : VARIABLE_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column status_by_host.VARIABLE_VALUE
     *
     * @return the value of status_by_host.VARIABLE_VALUE
     *
     * @mbg.generated
     */
    public String getVARIABLE_VALUE() {
        return VARIABLE_VALUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column status_by_host.VARIABLE_VALUE
     *
     * @param VARIABLE_VALUE the value for status_by_host.VARIABLE_VALUE
     *
     * @mbg.generated
     */
    public void setVARIABLE_VALUE(String VARIABLE_VALUE) {
        this.VARIABLE_VALUE = VARIABLE_VALUE == null ? null : VARIABLE_VALUE.trim();
    }
}