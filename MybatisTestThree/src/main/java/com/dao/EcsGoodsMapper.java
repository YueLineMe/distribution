package com.dao;

import com.entity.EcsGoods;
import com.entity.EcsGoodsWithBLOBs;
import java.util.List;

public interface EcsGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer goods_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods
     *
     * @mbg.generated
     */
    int insert(EcsGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods
     *
     * @mbg.generated
     */
    EcsGoodsWithBLOBs selectByPrimaryKey(Integer goods_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods
     *
     * @mbg.generated
     */
    List<EcsGoods> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsGoods record);
}