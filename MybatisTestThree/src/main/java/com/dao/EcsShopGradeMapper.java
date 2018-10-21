package com.dao;

import com.entity.EcsShopGrade;
import java.util.List;

public interface EcsShopGradeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shop_grade
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer grade_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shop_grade
     *
     * @mbg.generated
     */
    int insert(EcsShopGrade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shop_grade
     *
     * @mbg.generated
     */
    EcsShopGrade selectByPrimaryKey(Integer grade_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shop_grade
     *
     * @mbg.generated
     */
    List<EcsShopGrade> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_shop_grade
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsShopGrade record);
}