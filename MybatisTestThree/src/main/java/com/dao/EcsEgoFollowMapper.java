package com.dao;

import com.entity.EcsEgoFollow;
import java.util.List;

public interface EcsEgoFollowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_follow
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_follow
     *
     * @mbg.generated
     */
    int insert(EcsEgoFollow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_follow
     *
     * @mbg.generated
     */
    EcsEgoFollow selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_follow
     *
     * @mbg.generated
     */
    List<EcsEgoFollow> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_follow
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsEgoFollow record);
}