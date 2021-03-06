package com.dao;

import com.entity.EcsEcsmartArticleCat;
import java.util.List;

public interface EcsEcsmartArticleCatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_article_cat
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short cat_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_article_cat
     *
     * @mbg.generated
     */
    int insert(EcsEcsmartArticleCat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_article_cat
     *
     * @mbg.generated
     */
    EcsEcsmartArticleCat selectByPrimaryKey(Short cat_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_article_cat
     *
     * @mbg.generated
     */
    List<EcsEcsmartArticleCat> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_article_cat
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsEcsmartArticleCat record);
}