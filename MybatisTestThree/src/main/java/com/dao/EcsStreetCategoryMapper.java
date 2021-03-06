package com.dao;

import com.entity.EcsStreetCategory;
import java.util.List;

public interface EcsStreetCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_street_category
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short str_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_street_category
     *
     * @mbg.generated
     */
    int insert(EcsStreetCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_street_category
     *
     * @mbg.generated
     */
    EcsStreetCategory selectByPrimaryKey(Short str_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_street_category
     *
     * @mbg.generated
     */
    List<EcsStreetCategory> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_street_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsStreetCategory record);
}