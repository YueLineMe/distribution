package com.entity;

public class EcsSupplierWithBLOBs extends EcsSupplier {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier.nav_list
     *
     * @mbg.generated
     */
    private String nav_list;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier.business_sphere
     *
     * @mbg.generated
     */
    private String business_sphere;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier.nav_list
     *
     * @return the value of ecs_supplier.nav_list
     *
     * @mbg.generated
     */
    public String getNav_list() {
        return nav_list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier.nav_list
     *
     * @param nav_list the value for ecs_supplier.nav_list
     *
     * @mbg.generated
     */
    public void setNav_list(String nav_list) {
        this.nav_list = nav_list == null ? null : nav_list.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier.business_sphere
     *
     * @return the value of ecs_supplier.business_sphere
     *
     * @mbg.generated
     */
    public String getBusiness_sphere() {
        return business_sphere;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier.business_sphere
     *
     * @param business_sphere the value for ecs_supplier.business_sphere
     *
     * @mbg.generated
     */
    public void setBusiness_sphere(String business_sphere) {
        this.business_sphere = business_sphere == null ? null : business_sphere.trim();
    }
}