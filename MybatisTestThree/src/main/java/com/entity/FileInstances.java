package com.entity;

public class FileInstances {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_instances.FILE_NAME
     *
     * @mbg.generated
     */
    private String FILE_NAME;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_instances.EVENT_NAME
     *
     * @mbg.generated
     */
    private String EVENT_NAME;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column file_instances.OPEN_COUNT
     *
     * @mbg.generated
     */
    private Integer OPEN_COUNT;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_instances.FILE_NAME
     *
     * @return the value of file_instances.FILE_NAME
     *
     * @mbg.generated
     */
    public String getFILE_NAME() {
        return FILE_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_instances.FILE_NAME
     *
     * @param FILE_NAME the value for file_instances.FILE_NAME
     *
     * @mbg.generated
     */
    public void setFILE_NAME(String FILE_NAME) {
        this.FILE_NAME = FILE_NAME == null ? null : FILE_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_instances.EVENT_NAME
     *
     * @return the value of file_instances.EVENT_NAME
     *
     * @mbg.generated
     */
    public String getEVENT_NAME() {
        return EVENT_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_instances.EVENT_NAME
     *
     * @param EVENT_NAME the value for file_instances.EVENT_NAME
     *
     * @mbg.generated
     */
    public void setEVENT_NAME(String EVENT_NAME) {
        this.EVENT_NAME = EVENT_NAME == null ? null : EVENT_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column file_instances.OPEN_COUNT
     *
     * @return the value of file_instances.OPEN_COUNT
     *
     * @mbg.generated
     */
    public Integer getOPEN_COUNT() {
        return OPEN_COUNT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column file_instances.OPEN_COUNT
     *
     * @param OPEN_COUNT the value for file_instances.OPEN_COUNT
     *
     * @mbg.generated
     */
    public void setOPEN_COUNT(Integer OPEN_COUNT) {
        this.OPEN_COUNT = OPEN_COUNT;
    }
}