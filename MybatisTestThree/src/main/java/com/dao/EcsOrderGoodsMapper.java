package com.dao;

import com.entity.EcsOrderGoods;
import java.util.List;

public interface EcsOrderGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer rec_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_goods
     *
     * @mbg.generated
     */
    int insert(EcsOrderGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_goods
     *
     * @mbg.generated
     */
    EcsOrderGoods selectByPrimaryKey(Integer rec_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_goods
     *
     * @mbg.generated
     */
    List<EcsOrderGoods> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_order_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsOrderGoods record);
}