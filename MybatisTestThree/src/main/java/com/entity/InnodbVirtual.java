package com.entity;

public class InnodbVirtual {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_VIRTUAL.TABLE_ID
     *
     * @mbg.generated
     */
    private Long TABLE_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_VIRTUAL.POS
     *
     * @mbg.generated
     */
    private Integer POS;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_VIRTUAL.BASE_POS
     *
     * @mbg.generated
     */
    private Integer BASE_POS;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_VIRTUAL.TABLE_ID
     *
     * @return the value of INNODB_VIRTUAL.TABLE_ID
     *
     * @mbg.generated
     */
    public Long getTABLE_ID() {
        return TABLE_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_VIRTUAL.TABLE_ID
     *
     * @param TABLE_ID the value for INNODB_VIRTUAL.TABLE_ID
     *
     * @mbg.generated
     */
    public void setTABLE_ID(Long TABLE_ID) {
        this.TABLE_ID = TABLE_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_VIRTUAL.POS
     *
     * @return the value of INNODB_VIRTUAL.POS
     *
     * @mbg.generated
     */
    public Integer getPOS() {
        return POS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_VIRTUAL.POS
     *
     * @param POS the value for INNODB_VIRTUAL.POS
     *
     * @mbg.generated
     */
    public void setPOS(Integer POS) {
        this.POS = POS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_VIRTUAL.BASE_POS
     *
     * @return the value of INNODB_VIRTUAL.BASE_POS
     *
     * @mbg.generated
     */
    public Integer getBASE_POS() {
        return BASE_POS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_VIRTUAL.BASE_POS
     *
     * @param BASE_POS the value for INNODB_VIRTUAL.BASE_POS
     *
     * @mbg.generated
     */
    public void setBASE_POS(Integer BASE_POS) {
        this.BASE_POS = BASE_POS;
    }
}