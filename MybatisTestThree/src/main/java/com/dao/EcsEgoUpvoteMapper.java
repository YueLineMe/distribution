package com.dao;

import com.entity.EcsEgoUpvote;
import java.util.List;

public interface EcsEgoUpvoteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_upvote
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_upvote
     *
     * @mbg.generated
     */
    int insert(EcsEgoUpvote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_upvote
     *
     * @mbg.generated
     */
    EcsEgoUpvote selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_upvote
     *
     * @mbg.generated
     */
    List<EcsEgoUpvote> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_upvote
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsEgoUpvote record);
}