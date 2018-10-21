package com.dao;

import com.entity.EcsPackageGoods;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcsPackageGoodsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_package_goods
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("package_id") Integer package_id, @Param("goods_id") Integer goods_id, @Param("admin_id") Byte admin_id, @Param("product_id") Integer product_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_package_goods
     *
     * @mbg.generated
     */
    int insert(EcsPackageGoods record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_package_goods
     *
     * @mbg.generated
     */
    EcsPackageGoods selectByPrimaryKey(@Param("package_id") Integer package_id, @Param("goods_id") Integer goods_id, @Param("admin_id") Byte admin_id, @Param("product_id") Integer product_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_package_goods
     *
     * @mbg.generated
     */
    List<EcsPackageGoods> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_package_goods
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsPackageGoods record);
}