package com.entity;

public class Users {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.USER
     *
     * @mbg.generated
     */
    private String USER;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.CURRENT_CONNECTIONS
     *
     * @mbg.generated
     */
    private Long CURRENT_CONNECTIONS;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.TOTAL_CONNECTIONS
     *
     * @mbg.generated
     */
    private Long TOTAL_CONNECTIONS;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.USER
     *
     * @return the value of users.USER
     *
     * @mbg.generated
     */
    public String getUSER() {
        return USER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.USER
     *
     * @param USER the value for users.USER
     *
     * @mbg.generated
     */
    public void setUSER(String USER) {
        this.USER = USER == null ? null : USER.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.CURRENT_CONNECTIONS
     *
     * @return the value of users.CURRENT_CONNECTIONS
     *
     * @mbg.generated
     */
    public Long getCURRENT_CONNECTIONS() {
        return CURRENT_CONNECTIONS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.CURRENT_CONNECTIONS
     *
     * @param CURRENT_CONNECTIONS the value for users.CURRENT_CONNECTIONS
     *
     * @mbg.generated
     */
    public void setCURRENT_CONNECTIONS(Long CURRENT_CONNECTIONS) {
        this.CURRENT_CONNECTIONS = CURRENT_CONNECTIONS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.TOTAL_CONNECTIONS
     *
     * @return the value of users.TOTAL_CONNECTIONS
     *
     * @mbg.generated
     */
    public Long getTOTAL_CONNECTIONS() {
        return TOTAL_CONNECTIONS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.TOTAL_CONNECTIONS
     *
     * @param TOTAL_CONNECTIONS the value for users.TOTAL_CONNECTIONS
     *
     * @mbg.generated
     */
    public void setTOTAL_CONNECTIONS(Long TOTAL_CONNECTIONS) {
        this.TOTAL_CONNECTIONS = TOTAL_CONNECTIONS;
    }
}