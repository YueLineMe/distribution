package com.entity;

public class Accounts {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accounts.USER
     *
     * @mbg.generated
     */
    private String USER;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accounts.HOST
     *
     * @mbg.generated
     */
    private String HOST;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accounts.CURRENT_CONNECTIONS
     *
     * @mbg.generated
     */
    private Long CURRENT_CONNECTIONS;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accounts.TOTAL_CONNECTIONS
     *
     * @mbg.generated
     */
    private Long TOTAL_CONNECTIONS;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accounts.USER
     *
     * @return the value of accounts.USER
     *
     * @mbg.generated
     */
    public String getUSER() {
        return USER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accounts.USER
     *
     * @param USER the value for accounts.USER
     *
     * @mbg.generated
     */
    public void setUSER(String USER) {
        this.USER = USER == null ? null : USER.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accounts.HOST
     *
     * @return the value of accounts.HOST
     *
     * @mbg.generated
     */
    public String getHOST() {
        return HOST;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accounts.HOST
     *
     * @param HOST the value for accounts.HOST
     *
     * @mbg.generated
     */
    public void setHOST(String HOST) {
        this.HOST = HOST == null ? null : HOST.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accounts.CURRENT_CONNECTIONS
     *
     * @return the value of accounts.CURRENT_CONNECTIONS
     *
     * @mbg.generated
     */
    public Long getCURRENT_CONNECTIONS() {
        return CURRENT_CONNECTIONS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accounts.CURRENT_CONNECTIONS
     *
     * @param CURRENT_CONNECTIONS the value for accounts.CURRENT_CONNECTIONS
     *
     * @mbg.generated
     */
    public void setCURRENT_CONNECTIONS(Long CURRENT_CONNECTIONS) {
        this.CURRENT_CONNECTIONS = CURRENT_CONNECTIONS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accounts.TOTAL_CONNECTIONS
     *
     * @return the value of accounts.TOTAL_CONNECTIONS
     *
     * @mbg.generated
     */
    public Long getTOTAL_CONNECTIONS() {
        return TOTAL_CONNECTIONS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accounts.TOTAL_CONNECTIONS
     *
     * @param TOTAL_CONNECTIONS the value for accounts.TOTAL_CONNECTIONS
     *
     * @mbg.generated
     */
    public void setTOTAL_CONNECTIONS(Long TOTAL_CONNECTIONS) {
        this.TOTAL_CONNECTIONS = TOTAL_CONNECTIONS;
    }
}