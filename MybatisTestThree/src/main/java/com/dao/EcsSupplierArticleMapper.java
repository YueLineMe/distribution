package com.dao;

import com.entity.EcsSupplierArticle;
import java.util.List;

public interface EcsSupplierArticleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_article
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer article_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_article
     *
     * @mbg.generated
     */
    int insert(EcsSupplierArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_article
     *
     * @mbg.generated
     */
    EcsSupplierArticle selectByPrimaryKey(Integer article_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_article
     *
     * @mbg.generated
     */
    List<EcsSupplierArticle> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_article
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsSupplierArticle record);
}