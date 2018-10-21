package com.dao;

import com.entity.EcsGoodsGallery;
import java.util.List;

public interface EcsGoodsGalleryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_gallery
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer img_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_gallery
     *
     * @mbg.generated
     */
    int insert(EcsGoodsGallery record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_gallery
     *
     * @mbg.generated
     */
    EcsGoodsGallery selectByPrimaryKey(Integer img_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_gallery
     *
     * @mbg.generated
     */
    List<EcsGoodsGallery> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_goods_gallery
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsGoodsGallery record);
}