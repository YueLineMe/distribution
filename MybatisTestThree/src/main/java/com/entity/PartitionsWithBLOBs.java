package com.entity;

public class PartitionsWithBLOBs extends Partitions {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PARTITIONS.PARTITION_DESCRIPTION
     *
     * @mbg.generated
     */
    private String PARTITION_DESCRIPTION;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PARTITIONS.PARTITION_COMMENT
     *
     * @mbg.generated
     */
    private String PARTITION_COMMENT;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PARTITIONS.PARTITION_DESCRIPTION
     *
     * @return the value of PARTITIONS.PARTITION_DESCRIPTION
     *
     * @mbg.generated
     */
    public String getPARTITION_DESCRIPTION() {
        return PARTITION_DESCRIPTION;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PARTITIONS.PARTITION_DESCRIPTION
     *
     * @param PARTITION_DESCRIPTION the value for PARTITIONS.PARTITION_DESCRIPTION
     *
     * @mbg.generated
     */
    public void setPARTITION_DESCRIPTION(String PARTITION_DESCRIPTION) {
        this.PARTITION_DESCRIPTION = PARTITION_DESCRIPTION == null ? null : PARTITION_DESCRIPTION.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PARTITIONS.PARTITION_COMMENT
     *
     * @return the value of PARTITIONS.PARTITION_COMMENT
     *
     * @mbg.generated
     */
    public String getPARTITION_COMMENT() {
        return PARTITION_COMMENT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PARTITIONS.PARTITION_COMMENT
     *
     * @param PARTITION_COMMENT the value for PARTITIONS.PARTITION_COMMENT
     *
     * @mbg.generated
     */
    public void setPARTITION_COMMENT(String PARTITION_COMMENT) {
        this.PARTITION_COMMENT = PARTITION_COMMENT == null ? null : PARTITION_COMMENT.trim();
    }
}