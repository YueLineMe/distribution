package com.entity;

public class EcsSupplierCatRecommend {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_cat_recommend.cat_id
     *
     * @mbg.generated
     */
    private Short cat_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_cat_recommend.recommend_type
     *
     * @mbg.generated
     */
    private Boolean recommend_type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_supplier_cat_recommend.supplier_id
     *
     * @mbg.generated
     */
    private Integer supplier_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_cat_recommend.cat_id
     *
     * @return the value of ecs_supplier_cat_recommend.cat_id
     *
     * @mbg.generated
     */
    public Short getCat_id() {
        return cat_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_cat_recommend.cat_id
     *
     * @param cat_id the value for ecs_supplier_cat_recommend.cat_id
     *
     * @mbg.generated
     */
    public void setCat_id(Short cat_id) {
        this.cat_id = cat_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_cat_recommend.recommend_type
     *
     * @return the value of ecs_supplier_cat_recommend.recommend_type
     *
     * @mbg.generated
     */
    public Boolean getRecommend_type() {
        return recommend_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_cat_recommend.recommend_type
     *
     * @param recommend_type the value for ecs_supplier_cat_recommend.recommend_type
     *
     * @mbg.generated
     */
    public void setRecommend_type(Boolean recommend_type) {
        this.recommend_type = recommend_type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_supplier_cat_recommend.supplier_id
     *
     * @return the value of ecs_supplier_cat_recommend.supplier_id
     *
     * @mbg.generated
     */
    public Integer getSupplier_id() {
        return supplier_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_supplier_cat_recommend.supplier_id
     *
     * @param supplier_id the value for ecs_supplier_cat_recommend.supplier_id
     *
     * @mbg.generated
     */
    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }
}