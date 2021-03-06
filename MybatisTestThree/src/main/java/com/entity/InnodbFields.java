package com.entity;

public class InnodbFields {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_FIELDS.NAME
     *
     * @mbg.generated
     */
    private String NAME;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_FIELDS.POS
     *
     * @mbg.generated
     */
    private Long POS;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_FIELDS.INDEX_ID
     *
     * @mbg.generated
     */
    private byte[] INDEX_ID;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_FIELDS.NAME
     *
     * @return the value of INNODB_FIELDS.NAME
     *
     * @mbg.generated
     */
    public String getNAME() {
        return NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_FIELDS.NAME
     *
     * @param NAME the value for INNODB_FIELDS.NAME
     *
     * @mbg.generated
     */
    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_FIELDS.POS
     *
     * @return the value of INNODB_FIELDS.POS
     *
     * @mbg.generated
     */
    public Long getPOS() {
        return POS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_FIELDS.POS
     *
     * @param POS the value for INNODB_FIELDS.POS
     *
     * @mbg.generated
     */
    public void setPOS(Long POS) {
        this.POS = POS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_FIELDS.INDEX_ID
     *
     * @return the value of INNODB_FIELDS.INDEX_ID
     *
     * @mbg.generated
     */
    public byte[] getINDEX_ID() {
        return INDEX_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_FIELDS.INDEX_ID
     *
     * @param INDEX_ID the value for INNODB_FIELDS.INDEX_ID
     *
     * @mbg.generated
     */
    public void setINDEX_ID(byte[] INDEX_ID) {
        this.INDEX_ID = INDEX_ID;
    }
}