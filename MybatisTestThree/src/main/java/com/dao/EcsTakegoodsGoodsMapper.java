package com.dao;

import com.entity.EcsTakegoodsGoods;
import java.util.List;

public interface EcsTakegoodsGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer tg_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_goods
     *
     * @mbg.generated
     */
    int insert(EcsTakegoodsGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_goods
     *
     * @mbg.generated
     */
    EcsTakegoodsGoods selectByPrimaryKey(Integer tg_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_goods
     *
     * @mbg.generated
     */
    List<EcsTakegoodsGoods> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_takegoods_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsTakegoodsGoods record);
}