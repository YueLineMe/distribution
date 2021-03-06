package com.dao;

import com.entity.EcsEcsmartShopConfig;
import java.util.List;

public interface EcsEcsmartShopConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_shop_config
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_shop_config
     *
     * @mbg.generated
     */
    int insert(EcsEcsmartShopConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_shop_config
     *
     * @mbg.generated
     */
    EcsEcsmartShopConfig selectByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_shop_config
     *
     * @mbg.generated
     */
    List<EcsEcsmartShopConfig> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_shop_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsEcsmartShopConfig record);
}