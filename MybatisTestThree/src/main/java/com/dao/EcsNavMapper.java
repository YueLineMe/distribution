package com.dao;

import com.entity.EcsNav;
import java.util.List;

public interface EcsNavMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_nav
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_nav
     *
     * @mbg.generated
     */
    int insert(EcsNav record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_nav
     *
     * @mbg.generated
     */
    EcsNav selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_nav
     *
     * @mbg.generated
     */
    List<EcsNav> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_nav
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsNav record);
}