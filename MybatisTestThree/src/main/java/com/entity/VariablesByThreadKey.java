package com.entity;

public class VariablesByThreadKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column variables_by_thread.THREAD_ID
     *
     * @mbg.generated
     */
    private Long THREAD_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column variables_by_thread.VARIABLE_NAME
     *
     * @mbg.generated
     */
    private String VARIABLE_NAME;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column variables_by_thread.THREAD_ID
     *
     * @return the value of variables_by_thread.THREAD_ID
     *
     * @mbg.generated
     */
    public Long getTHREAD_ID() {
        return THREAD_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column variables_by_thread.THREAD_ID
     *
     * @param THREAD_ID the value for variables_by_thread.THREAD_ID
     *
     * @mbg.generated
     */
    public void setTHREAD_ID(Long THREAD_ID) {
        this.THREAD_ID = THREAD_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column variables_by_thread.VARIABLE_NAME
     *
     * @return the value of variables_by_thread.VARIABLE_NAME
     *
     * @mbg.generated
     */
    public String getVARIABLE_NAME() {
        return VARIABLE_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column variables_by_thread.VARIABLE_NAME
     *
     * @param VARIABLE_NAME the value for variables_by_thread.VARIABLE_NAME
     *
     * @mbg.generated
     */
    public void setVARIABLE_NAME(String VARIABLE_NAME) {
        this.VARIABLE_NAME = VARIABLE_NAME == null ? null : VARIABLE_NAME.trim();
    }
}