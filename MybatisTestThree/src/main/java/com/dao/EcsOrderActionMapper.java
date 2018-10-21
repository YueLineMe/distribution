package com.dao;

import com.entity.EcsOrderAction;
import java.util.List;

public interface EcsOrderActionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_action
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer action_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_action
     *
     * @mbg.generated
     */
    int insert(EcsOrderAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_action
     *
     * @mbg.generated
     */
    EcsOrderAction selectByPrimaryKey(Integer action_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_action
     *
     * @mbg.generated
     */
    List<EcsOrderAction> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_action
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsOrderAction record);
}