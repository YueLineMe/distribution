package com.entity;

public class EngineCostKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column engine_cost.cost_name
     *
     * @mbg.generated
     */
    private String cost_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column engine_cost.engine_name
     *
     * @mbg.generated
     */
    private String engine_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column engine_cost.device_type
     *
     * @mbg.generated
     */
    private Integer device_type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column engine_cost.cost_name
     *
     * @return the value of engine_cost.cost_name
     *
     * @mbg.generated
     */
    public String getCost_name() {
        return cost_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column engine_cost.cost_name
     *
     * @param cost_name the value for engine_cost.cost_name
     *
     * @mbg.generated
     */
    public void setCost_name(String cost_name) {
        this.cost_name = cost_name == null ? null : cost_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column engine_cost.engine_name
     *
     * @return the value of engine_cost.engine_name
     *
     * @mbg.generated
     */
    public String getEngine_name() {
        return engine_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column engine_cost.engine_name
     *
     * @param engine_name the value for engine_cost.engine_name
     *
     * @mbg.generated
     */
    public void setEngine_name(String engine_name) {
        this.engine_name = engine_name == null ? null : engine_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column engine_cost.device_type
     *
     * @return the value of engine_cost.device_type
     *
     * @mbg.generated
     */
    public Integer getDevice_type() {
        return device_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column engine_cost.device_type
     *
     * @param device_type the value for engine_cost.device_type
     *
     * @mbg.generated
     */
    public void setDevice_type(Integer device_type) {
        this.device_type = device_type;
    }
}