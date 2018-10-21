package com.dao;

import com.entity.EcsShipping;
import com.entity.EcsShippingWithBLOBs;
import java.util.List;

public interface EcsShippingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shipping
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Byte shipping_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shipping
     *
     * @mbg.generated
     */
    int insert(EcsShipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shipping
     *
     * @mbg.generated
     */
    EcsShippingWithBLOBs selectByPrimaryKey(Byte shipping_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shipping
     *
     * @mbg.generated
     */
    List<EcsShipping> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shipping
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsShipping record);
}