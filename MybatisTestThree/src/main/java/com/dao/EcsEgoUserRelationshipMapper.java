package com.dao;

import com.entity.EcsEgoUserRelationship;
import java.util.List;

public interface EcsEgoUserRelationshipMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_user_relationship
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_user_relationship
     *
     * @mbg.generated
     */
    int insert(EcsEgoUserRelationship record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_user_relationship
     *
     * @mbg.generated
     */
    EcsEgoUserRelationship selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_user_relationship
     *
     * @mbg.generated
     */
    List<EcsEgoUserRelationship> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_user_relationship
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsEgoUserRelationship record);
}