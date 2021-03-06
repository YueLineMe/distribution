package com.dao;

import com.entity.EcsCart;
import java.util.List;

public interface EcsCartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_cart
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer rec_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_cart
     *
     * @mbg.generated
     */
    int insert(EcsCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_cart
     *
     * @mbg.generated
     */
    EcsCart selectByPrimaryKey(Integer rec_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_cart
     *
     * @mbg.generated
     */
    List<EcsCart> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_cart
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsCart record);
}