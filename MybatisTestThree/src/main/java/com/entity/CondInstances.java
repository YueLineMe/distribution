package com.entity;

public class CondInstances {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cond_instances.OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated
     */
    private Long OBJECT_INSTANCE_BEGIN;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cond_instances.NAME
     *
     * @mbg.generated
     */
    private String NAME;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cond_instances.OBJECT_INSTANCE_BEGIN
     *
     * @return the value of cond_instances.OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated
     */
    public Long getOBJECT_INSTANCE_BEGIN() {
        return OBJECT_INSTANCE_BEGIN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cond_instances.OBJECT_INSTANCE_BEGIN
     *
     * @param OBJECT_INSTANCE_BEGIN the value for cond_instances.OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated
     */
    public void setOBJECT_INSTANCE_BEGIN(Long OBJECT_INSTANCE_BEGIN) {
        this.OBJECT_INSTANCE_BEGIN = OBJECT_INSTANCE_BEGIN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cond_instances.NAME
     *
     * @return the value of cond_instances.NAME
     *
     * @mbg.generated
     */
    public String getNAME() {
        return NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cond_instances.NAME
     *
     * @param NAME the value for cond_instances.NAME
     *
     * @mbg.generated
     */
    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }
}