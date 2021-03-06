package com.entity;

import java.util.Date;

public class Triggers {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.TRIGGER_CATALOG
     *
     * @mbg.generated
     */
    private String TRIGGER_CATALOG;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.TRIGGER_SCHEMA
     *
     * @mbg.generated
     */
    private String TRIGGER_SCHEMA;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.TRIGGER_NAME
     *
     * @mbg.generated
     */
    private String TRIGGER_NAME;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.EVENT_MANIPULATION
     *
     * @mbg.generated
     */
    private String EVENT_MANIPULATION;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.EVENT_OBJECT_CATALOG
     *
     * @mbg.generated
     */
    private String EVENT_OBJECT_CATALOG;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.EVENT_OBJECT_SCHEMA
     *
     * @mbg.generated
     */
    private String EVENT_OBJECT_SCHEMA;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.EVENT_OBJECT_TABLE
     *
     * @mbg.generated
     */
    private String EVENT_OBJECT_TABLE;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.ACTION_ORDER
     *
     * @mbg.generated
     */
    private Integer ACTION_ORDER;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.ACTION_ORIENTATION
     *
     * @mbg.generated
     */
    private String ACTION_ORIENTATION;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.ACTION_TIMING
     *
     * @mbg.generated
     */
    private String ACTION_TIMING;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.ACTION_REFERENCE_OLD_ROW
     *
     * @mbg.generated
     */
    private String ACTION_REFERENCE_OLD_ROW;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.ACTION_REFERENCE_NEW_ROW
     *
     * @mbg.generated
     */
    private String ACTION_REFERENCE_NEW_ROW;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.CREATED
     *
     * @mbg.generated
     */
    private Date CREATED;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.SQL_MODE
     *
     * @mbg.generated
     */
    private String SQL_MODE;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.DEFINER
     *
     * @mbg.generated
     */
    private String DEFINER;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.CHARACTER_SET_CLIENT
     *
     * @mbg.generated
     */
    private String CHARACTER_SET_CLIENT;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.COLLATION_CONNECTION
     *
     * @mbg.generated
     */
    private String COLLATION_CONNECTION;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.DATABASE_COLLATION
     *
     * @mbg.generated
     */
    private String DATABASE_COLLATION;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.ACTION_CONDITION
     *
     * @mbg.generated
     */
    private byte[] ACTION_CONDITION;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.ACTION_STATEMENT
     *
     * @mbg.generated
     */
    private String ACTION_STATEMENT;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.ACTION_REFERENCE_OLD_TABLE
     *
     * @mbg.generated
     */
    private byte[] ACTION_REFERENCE_OLD_TABLE;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRIGGERS.ACTION_REFERENCE_NEW_TABLE
     *
     * @mbg.generated
     */
    private byte[] ACTION_REFERENCE_NEW_TABLE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.TRIGGER_CATALOG
     *
     * @return the value of TRIGGERS.TRIGGER_CATALOG
     *
     * @mbg.generated
     */
    public String getTRIGGER_CATALOG() {
        return TRIGGER_CATALOG;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.TRIGGER_CATALOG
     *
     * @param TRIGGER_CATALOG the value for TRIGGERS.TRIGGER_CATALOG
     *
     * @mbg.generated
     */
    public void setTRIGGER_CATALOG(String TRIGGER_CATALOG) {
        this.TRIGGER_CATALOG = TRIGGER_CATALOG == null ? null : TRIGGER_CATALOG.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.TRIGGER_SCHEMA
     *
     * @return the value of TRIGGERS.TRIGGER_SCHEMA
     *
     * @mbg.generated
     */
    public String getTRIGGER_SCHEMA() {
        return TRIGGER_SCHEMA;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.TRIGGER_SCHEMA
     *
     * @param TRIGGER_SCHEMA the value for TRIGGERS.TRIGGER_SCHEMA
     *
     * @mbg.generated
     */
    public void setTRIGGER_SCHEMA(String TRIGGER_SCHEMA) {
        this.TRIGGER_SCHEMA = TRIGGER_SCHEMA == null ? null : TRIGGER_SCHEMA.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.TRIGGER_NAME
     *
     * @return the value of TRIGGERS.TRIGGER_NAME
     *
     * @mbg.generated
     */
    public String getTRIGGER_NAME() {
        return TRIGGER_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.TRIGGER_NAME
     *
     * @param TRIGGER_NAME the value for TRIGGERS.TRIGGER_NAME
     *
     * @mbg.generated
     */
    public void setTRIGGER_NAME(String TRIGGER_NAME) {
        this.TRIGGER_NAME = TRIGGER_NAME == null ? null : TRIGGER_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.EVENT_MANIPULATION
     *
     * @return the value of TRIGGERS.EVENT_MANIPULATION
     *
     * @mbg.generated
     */
    public String getEVENT_MANIPULATION() {
        return EVENT_MANIPULATION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.EVENT_MANIPULATION
     *
     * @param EVENT_MANIPULATION the value for TRIGGERS.EVENT_MANIPULATION
     *
     * @mbg.generated
     */
    public void setEVENT_MANIPULATION(String EVENT_MANIPULATION) {
        this.EVENT_MANIPULATION = EVENT_MANIPULATION == null ? null : EVENT_MANIPULATION.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.EVENT_OBJECT_CATALOG
     *
     * @return the value of TRIGGERS.EVENT_OBJECT_CATALOG
     *
     * @mbg.generated
     */
    public String getEVENT_OBJECT_CATALOG() {
        return EVENT_OBJECT_CATALOG;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.EVENT_OBJECT_CATALOG
     *
     * @param EVENT_OBJECT_CATALOG the value for TRIGGERS.EVENT_OBJECT_CATALOG
     *
     * @mbg.generated
     */
    public void setEVENT_OBJECT_CATALOG(String EVENT_OBJECT_CATALOG) {
        this.EVENT_OBJECT_CATALOG = EVENT_OBJECT_CATALOG == null ? null : EVENT_OBJECT_CATALOG.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.EVENT_OBJECT_SCHEMA
     *
     * @return the value of TRIGGERS.EVENT_OBJECT_SCHEMA
     *
     * @mbg.generated
     */
    public String getEVENT_OBJECT_SCHEMA() {
        return EVENT_OBJECT_SCHEMA;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.EVENT_OBJECT_SCHEMA
     *
     * @param EVENT_OBJECT_SCHEMA the value for TRIGGERS.EVENT_OBJECT_SCHEMA
     *
     * @mbg.generated
     */
    public void setEVENT_OBJECT_SCHEMA(String EVENT_OBJECT_SCHEMA) {
        this.EVENT_OBJECT_SCHEMA = EVENT_OBJECT_SCHEMA == null ? null : EVENT_OBJECT_SCHEMA.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.EVENT_OBJECT_TABLE
     *
     * @return the value of TRIGGERS.EVENT_OBJECT_TABLE
     *
     * @mbg.generated
     */
    public String getEVENT_OBJECT_TABLE() {
        return EVENT_OBJECT_TABLE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.EVENT_OBJECT_TABLE
     *
     * @param EVENT_OBJECT_TABLE the value for TRIGGERS.EVENT_OBJECT_TABLE
     *
     * @mbg.generated
     */
    public void setEVENT_OBJECT_TABLE(String EVENT_OBJECT_TABLE) {
        this.EVENT_OBJECT_TABLE = EVENT_OBJECT_TABLE == null ? null : EVENT_OBJECT_TABLE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.ACTION_ORDER
     *
     * @return the value of TRIGGERS.ACTION_ORDER
     *
     * @mbg.generated
     */
    public Integer getACTION_ORDER() {
        return ACTION_ORDER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.ACTION_ORDER
     *
     * @param ACTION_ORDER the value for TRIGGERS.ACTION_ORDER
     *
     * @mbg.generated
     */
    public void setACTION_ORDER(Integer ACTION_ORDER) {
        this.ACTION_ORDER = ACTION_ORDER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.ACTION_ORIENTATION
     *
     * @return the value of TRIGGERS.ACTION_ORIENTATION
     *
     * @mbg.generated
     */
    public String getACTION_ORIENTATION() {
        return ACTION_ORIENTATION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.ACTION_ORIENTATION
     *
     * @param ACTION_ORIENTATION the value for TRIGGERS.ACTION_ORIENTATION
     *
     * @mbg.generated
     */
    public void setACTION_ORIENTATION(String ACTION_ORIENTATION) {
        this.ACTION_ORIENTATION = ACTION_ORIENTATION == null ? null : ACTION_ORIENTATION.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.ACTION_TIMING
     *
     * @return the value of TRIGGERS.ACTION_TIMING
     *
     * @mbg.generated
     */
    public String getACTION_TIMING() {
        return ACTION_TIMING;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.ACTION_TIMING
     *
     * @param ACTION_TIMING the value for TRIGGERS.ACTION_TIMING
     *
     * @mbg.generated
     */
    public void setACTION_TIMING(String ACTION_TIMING) {
        this.ACTION_TIMING = ACTION_TIMING == null ? null : ACTION_TIMING.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.ACTION_REFERENCE_OLD_ROW
     *
     * @return the value of TRIGGERS.ACTION_REFERENCE_OLD_ROW
     *
     * @mbg.generated
     */
    public String getACTION_REFERENCE_OLD_ROW() {
        return ACTION_REFERENCE_OLD_ROW;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.ACTION_REFERENCE_OLD_ROW
     *
     * @param ACTION_REFERENCE_OLD_ROW the value for TRIGGERS.ACTION_REFERENCE_OLD_ROW
     *
     * @mbg.generated
     */
    public void setACTION_REFERENCE_OLD_ROW(String ACTION_REFERENCE_OLD_ROW) {
        this.ACTION_REFERENCE_OLD_ROW = ACTION_REFERENCE_OLD_ROW == null ? null : ACTION_REFERENCE_OLD_ROW.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.ACTION_REFERENCE_NEW_ROW
     *
     * @return the value of TRIGGERS.ACTION_REFERENCE_NEW_ROW
     *
     * @mbg.generated
     */
    public String getACTION_REFERENCE_NEW_ROW() {
        return ACTION_REFERENCE_NEW_ROW;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.ACTION_REFERENCE_NEW_ROW
     *
     * @param ACTION_REFERENCE_NEW_ROW the value for TRIGGERS.ACTION_REFERENCE_NEW_ROW
     *
     * @mbg.generated
     */
    public void setACTION_REFERENCE_NEW_ROW(String ACTION_REFERENCE_NEW_ROW) {
        this.ACTION_REFERENCE_NEW_ROW = ACTION_REFERENCE_NEW_ROW == null ? null : ACTION_REFERENCE_NEW_ROW.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.CREATED
     *
     * @return the value of TRIGGERS.CREATED
     *
     * @mbg.generated
     */
    public Date getCREATED() {
        return CREATED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.CREATED
     *
     * @param CREATED the value for TRIGGERS.CREATED
     *
     * @mbg.generated
     */
    public void setCREATED(Date CREATED) {
        this.CREATED = CREATED;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.SQL_MODE
     *
     * @return the value of TRIGGERS.SQL_MODE
     *
     * @mbg.generated
     */
    public String getSQL_MODE() {
        return SQL_MODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.SQL_MODE
     *
     * @param SQL_MODE the value for TRIGGERS.SQL_MODE
     *
     * @mbg.generated
     */
    public void setSQL_MODE(String SQL_MODE) {
        this.SQL_MODE = SQL_MODE == null ? null : SQL_MODE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.DEFINER
     *
     * @return the value of TRIGGERS.DEFINER
     *
     * @mbg.generated
     */
    public String getDEFINER() {
        return DEFINER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.DEFINER
     *
     * @param DEFINER the value for TRIGGERS.DEFINER
     *
     * @mbg.generated
     */
    public void setDEFINER(String DEFINER) {
        this.DEFINER = DEFINER == null ? null : DEFINER.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.CHARACTER_SET_CLIENT
     *
     * @return the value of TRIGGERS.CHARACTER_SET_CLIENT
     *
     * @mbg.generated
     */
    public String getCHARACTER_SET_CLIENT() {
        return CHARACTER_SET_CLIENT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.CHARACTER_SET_CLIENT
     *
     * @param CHARACTER_SET_CLIENT the value for TRIGGERS.CHARACTER_SET_CLIENT
     *
     * @mbg.generated
     */
    public void setCHARACTER_SET_CLIENT(String CHARACTER_SET_CLIENT) {
        this.CHARACTER_SET_CLIENT = CHARACTER_SET_CLIENT == null ? null : CHARACTER_SET_CLIENT.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.COLLATION_CONNECTION
     *
     * @return the value of TRIGGERS.COLLATION_CONNECTION
     *
     * @mbg.generated
     */
    public String getCOLLATION_CONNECTION() {
        return COLLATION_CONNECTION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.COLLATION_CONNECTION
     *
     * @param COLLATION_CONNECTION the value for TRIGGERS.COLLATION_CONNECTION
     *
     * @mbg.generated
     */
    public void setCOLLATION_CONNECTION(String COLLATION_CONNECTION) {
        this.COLLATION_CONNECTION = COLLATION_CONNECTION == null ? null : COLLATION_CONNECTION.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.DATABASE_COLLATION
     *
     * @return the value of TRIGGERS.DATABASE_COLLATION
     *
     * @mbg.generated
     */
    public String getDATABASE_COLLATION() {
        return DATABASE_COLLATION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.DATABASE_COLLATION
     *
     * @param DATABASE_COLLATION the value for TRIGGERS.DATABASE_COLLATION
     *
     * @mbg.generated
     */
    public void setDATABASE_COLLATION(String DATABASE_COLLATION) {
        this.DATABASE_COLLATION = DATABASE_COLLATION == null ? null : DATABASE_COLLATION.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.ACTION_CONDITION
     *
     * @return the value of TRIGGERS.ACTION_CONDITION
     *
     * @mbg.generated
     */
    public byte[] getACTION_CONDITION() {
        return ACTION_CONDITION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.ACTION_CONDITION
     *
     * @param ACTION_CONDITION the value for TRIGGERS.ACTION_CONDITION
     *
     * @mbg.generated
     */
    public void setACTION_CONDITION(byte[] ACTION_CONDITION) {
        this.ACTION_CONDITION = ACTION_CONDITION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.ACTION_STATEMENT
     *
     * @return the value of TRIGGERS.ACTION_STATEMENT
     *
     * @mbg.generated
     */
    public String getACTION_STATEMENT() {
        return ACTION_STATEMENT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.ACTION_STATEMENT
     *
     * @param ACTION_STATEMENT the value for TRIGGERS.ACTION_STATEMENT
     *
     * @mbg.generated
     */
    public void setACTION_STATEMENT(String ACTION_STATEMENT) {
        this.ACTION_STATEMENT = ACTION_STATEMENT == null ? null : ACTION_STATEMENT.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.ACTION_REFERENCE_OLD_TABLE
     *
     * @return the value of TRIGGERS.ACTION_REFERENCE_OLD_TABLE
     *
     * @mbg.generated
     */
    public byte[] getACTION_REFERENCE_OLD_TABLE() {
        return ACTION_REFERENCE_OLD_TABLE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.ACTION_REFERENCE_OLD_TABLE
     *
     * @param ACTION_REFERENCE_OLD_TABLE the value for TRIGGERS.ACTION_REFERENCE_OLD_TABLE
     *
     * @mbg.generated
     */
    public void setACTION_REFERENCE_OLD_TABLE(byte[] ACTION_REFERENCE_OLD_TABLE) {
        this.ACTION_REFERENCE_OLD_TABLE = ACTION_REFERENCE_OLD_TABLE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRIGGERS.ACTION_REFERENCE_NEW_TABLE
     *
     * @return the value of TRIGGERS.ACTION_REFERENCE_NEW_TABLE
     *
     * @mbg.generated
     */
    public byte[] getACTION_REFERENCE_NEW_TABLE() {
        return ACTION_REFERENCE_NEW_TABLE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRIGGERS.ACTION_REFERENCE_NEW_TABLE
     *
     * @param ACTION_REFERENCE_NEW_TABLE the value for TRIGGERS.ACTION_REFERENCE_NEW_TABLE
     *
     * @mbg.generated
     */
    public void setACTION_REFERENCE_NEW_TABLE(byte[] ACTION_REFERENCE_NEW_TABLE) {
        this.ACTION_REFERENCE_NEW_TABLE = ACTION_REFERENCE_NEW_TABLE;
    }
}