package com.entity;

public class EcsKeywordArea {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_keyword_area.access_time
     *
     * @mbg.generated
     */
    private Integer access_time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_keyword_area.w_id
     *
     * @mbg.generated
     */
    private Long w_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_keyword_area.ip_address
     *
     * @mbg.generated
     */
    private String ip_address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_keyword_area.area
     *
     * @mbg.generated
     */
    private String area;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_keyword_area.access_time
     *
     * @return the value of ecs_keyword_area.access_time
     *
     * @mbg.generated
     */
    public Integer getAccess_time() {
        return access_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_keyword_area.access_time
     *
     * @param access_time the value for ecs_keyword_area.access_time
     *
     * @mbg.generated
     */
    public void setAccess_time(Integer access_time) {
        this.access_time = access_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_keyword_area.w_id
     *
     * @return the value of ecs_keyword_area.w_id
     *
     * @mbg.generated
     */
    public Long getW_id() {
        return w_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_keyword_area.w_id
     *
     * @param w_id the value for ecs_keyword_area.w_id
     *
     * @mbg.generated
     */
    public void setW_id(Long w_id) {
        this.w_id = w_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_keyword_area.ip_address
     *
     * @return the value of ecs_keyword_area.ip_address
     *
     * @mbg.generated
     */
    public String getIp_address() {
        return ip_address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_keyword_area.ip_address
     *
     * @param ip_address the value for ecs_keyword_area.ip_address
     *
     * @mbg.generated
     */
    public void setIp_address(String ip_address) {
        this.ip_address = ip_address == null ? null : ip_address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_keyword_area.area
     *
     * @return the value of ecs_keyword_area.area
     *
     * @mbg.generated
     */
    public String getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_keyword_area.area
     *
     * @param area the value for ecs_keyword_area.area
     *
     * @mbg.generated
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }
}