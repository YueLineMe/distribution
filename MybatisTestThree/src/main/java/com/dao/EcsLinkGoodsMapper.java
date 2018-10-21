package com.dao;

import com.entity.EcsLinkGoods;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsLinkGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_link_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("goods_id") Integer goods_id, @Param("link_goods_id") Integer link_goods_id, @Param("admin_id") Byte admin_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_link_goods
     *
     * @mbg.generated
     */
    int insert(EcsLinkGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_link_goods
     *
     * @mbg.generated
     */
    EcsLinkGoods selectByPrimaryKey(@Param("goods_id") Integer goods_id, @Param("link_goods_id") Integer link_goods_id, @Param("admin_id") Byte admin_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_link_goods
     *
     * @mbg.generated
     */
    List<EcsLinkGoods> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_link_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsLinkGoods record);
}