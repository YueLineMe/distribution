package com.entity;

public class EcsRegion {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_region.region_id
     *
     * @mbg.generated
     */
    private Short region_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_region.parent_id
     *
     * @mbg.generated
     */
    private Short parent_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_region.region_name
     *
     * @mbg.generated
     */
    private String region_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_region.region_type
     *
     * @mbg.generated
     */
    private Boolean region_type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_region.agency_id
     *
     * @mbg.generated
     */
    private Short agency_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_region.region_id
     *
     * @return the value of ecs_region.region_id
     *
     * @mbg.generated
     */
    public Short getRegion_id() {
        return region_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_region.region_id
     *
     * @param region_id the value for ecs_region.region_id
     *
     * @mbg.generated
     */
    public void setRegion_id(Short region_id) {
        this.region_id = region_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_region.parent_id
     *
     * @return the value of ecs_region.parent_id
     *
     * @mbg.generated
     */
    public Short getParent_id() {
        return parent_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_region.parent_id
     *
     * @param parent_id the value for ecs_region.parent_id
     *
     * @mbg.generated
     */
    public void setParent_id(Short parent_id) {
        this.parent_id = parent_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_region.region_name
     *
     * @return the value of ecs_region.region_name
     *
     * @mbg.generated
     */
    public String getRegion_name() {
        return region_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_region.region_name
     *
     * @param region_name the value for ecs_region.region_name
     *
     * @mbg.generated
     */
    public void setRegion_name(String region_name) {
        this.region_name = region_name == null ? null : region_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_region.region_type
     *
     * @return the value of ecs_region.region_type
     *
     * @mbg.generated
     */
    public Boolean getRegion_type() {
        return region_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_region.region_type
     *
     * @param region_type the value for ecs_region.region_type
     *
     * @mbg.generated
     */
    public void setRegion_type(Boolean region_type) {
        this.region_type = region_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_region.agency_id
     *
     * @return the value of ecs_region.agency_id
     *
     * @mbg.generated
     */
    public Short getAgency_id() {
        return agency_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_region.agency_id
     *
     * @param agency_id the value for ecs_region.agency_id
     *
     * @mbg.generated
     */
    public void setAgency_id(Short agency_id) {
        this.agency_id = agency_id;
    }
}