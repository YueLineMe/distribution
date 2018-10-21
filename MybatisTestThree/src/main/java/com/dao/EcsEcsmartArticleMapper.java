package com.dao;

import com.entity.EcsEcsmartArticle;
import java.util.List;

public interface EcsEcsmartArticleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_article
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer article_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_article
     *
     * @mbg.generated
     */
    int insert(EcsEcsmartArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_article
     *
     * @mbg.generated
     */
    EcsEcsmartArticle selectByPrimaryKey(Integer article_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_article
     *
     * @mbg.generated
     */
    List<EcsEcsmartArticle> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_article
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsEcsmartArticle record);
}