package com.dao;

import com.entity.EcsWeixinMenu;
import java.util.List;

public interface EcsWeixinMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_menu
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_menu
     *
     * @mbg.generated
     */
    int insert(EcsWeixinMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_menu
     *
     * @mbg.generated
     */
    EcsWeixinMenu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_menu
     *
     * @mbg.generated
     */
    List<EcsWeixinMenu> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_menu
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsWeixinMenu record);
}