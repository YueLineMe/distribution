package com.dao;

import com.entity.EcsWeixinKeywords;
import java.util.List;

public interface EcsWeixinKeywordsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_keywords
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_keywords
     *
     * @mbg.generated
     */
    int insert(EcsWeixinKeywords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_keywords
     *
     * @mbg.generated
     */
    EcsWeixinKeywords selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_keywords
     *
     * @mbg.generated
     */
    List<EcsWeixinKeywords> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_keywords
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsWeixinKeywords record);
}