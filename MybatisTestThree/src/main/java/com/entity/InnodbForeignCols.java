package com.entity;

public class InnodbForeignCols {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_FOREIGN_COLS.ID
     *
     * @mbg.generated
     */
    private String ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_FOREIGN_COLS.FOR_COL_NAME
     *
     * @mbg.generated
     */
    private String FOR_COL_NAME;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_FOREIGN_COLS.REF_COL_NAME
     *
     * @mbg.generated
     */
    private String REF_COL_NAME;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_FOREIGN_COLS.POS
     *
     * @mbg.generated
     */
    private Integer POS;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_FOREIGN_COLS.ID
     *
     * @return the value of INNODB_FOREIGN_COLS.ID
     *
     * @mbg.generated
     */
    public String getID() {
        return ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_FOREIGN_COLS.ID
     *
     * @param ID the value for INNODB_FOREIGN_COLS.ID
     *
     * @mbg.generated
     */
    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_FOREIGN_COLS.FOR_COL_NAME
     *
     * @return the value of INNODB_FOREIGN_COLS.FOR_COL_NAME
     *
     * @mbg.generated
     */
    public String getFOR_COL_NAME() {
        return FOR_COL_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_FOREIGN_COLS.FOR_COL_NAME
     *
     * @param FOR_COL_NAME the value for INNODB_FOREIGN_COLS.FOR_COL_NAME
     *
     * @mbg.generated
     */
    public void setFOR_COL_NAME(String FOR_COL_NAME) {
        this.FOR_COL_NAME = FOR_COL_NAME == null ? null : FOR_COL_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_FOREIGN_COLS.REF_COL_NAME
     *
     * @return the value of INNODB_FOREIGN_COLS.REF_COL_NAME
     *
     * @mbg.generated
     */
    public String getREF_COL_NAME() {
        return REF_COL_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_FOREIGN_COLS.REF_COL_NAME
     *
     * @param REF_COL_NAME the value for INNODB_FOREIGN_COLS.REF_COL_NAME
     *
     * @mbg.generated
     */
    public void setREF_COL_NAME(String REF_COL_NAME) {
        this.REF_COL_NAME = REF_COL_NAME == null ? null : REF_COL_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_FOREIGN_COLS.POS
     *
     * @return the value of INNODB_FOREIGN_COLS.POS
     *
     * @mbg.generated
     */
    public Integer getPOS() {
        return POS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_FOREIGN_COLS.POS
     *
     * @param POS the value for INNODB_FOREIGN_COLS.POS
     *
     * @mbg.generated
     */
    public void setPOS(Integer POS) {
        this.POS = POS;
    }
}