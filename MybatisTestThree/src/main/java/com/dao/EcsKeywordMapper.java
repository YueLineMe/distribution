package com.dao;

import com.entity.EcsKeyword;
import java.util.List;

public interface EcsKeywordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_keyword
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long w_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_keyword
     *
     * @mbg.generated
     */
    int insert(EcsKeyword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_keyword
     *
     * @mbg.generated
     */
    EcsKeyword selectByPrimaryKey(Long w_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_keyword
     *
     * @mbg.generated
     */
    List<EcsKeyword> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_keyword
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsKeyword record);
}