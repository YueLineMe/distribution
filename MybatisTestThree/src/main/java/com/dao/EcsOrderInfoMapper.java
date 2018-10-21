package com.dao;

import com.entity.EcsOrderInfo;
import java.util.List;

public interface EcsOrderInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer order_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_info
     *
     * @mbg.generated
     */
    int insert(EcsOrderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_info
     *
     * @mbg.generated
     */
    EcsOrderInfo selectByPrimaryKey(Integer order_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_info
     *
     * @mbg.generated
     */
    List<EcsOrderInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsOrderInfo record);
}