package com.dao;

import com.entity.EcsEgoTerm;
import java.util.List;

public interface EcsEgoTermMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_term
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_term
     *
     * @mbg.generated
     */
    int insert(EcsEgoTerm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_term
     *
     * @mbg.generated
     */
    EcsEgoTerm selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_term
     *
     * @mbg.generated
     */
    List<EcsEgoTerm> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_term
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsEgoTerm record);
}