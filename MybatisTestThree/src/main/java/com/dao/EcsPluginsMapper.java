package com.dao;

import com.entity.EcsPlugins;
import java.util.List;

public interface EcsPluginsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_plugins
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_plugins
     *
     * @mbg.generated
     */
    int insert(EcsPlugins record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_plugins
     *
     * @mbg.generated
     */
    EcsPlugins selectByPrimaryKey(String code);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_plugins
     *
     * @mbg.generated
     */
    List<EcsPlugins> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_plugins
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsPlugins record);
}