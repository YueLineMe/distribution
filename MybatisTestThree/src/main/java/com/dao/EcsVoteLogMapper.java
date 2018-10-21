package com.dao;

import com.entity.EcsVoteLog;
import java.util.List;

public interface EcsVoteLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer log_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote_log
     *
     * @mbg.generated
     */
    int insert(EcsVoteLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote_log
     *
     * @mbg.generated
     */
    EcsVoteLog selectByPrimaryKey(Integer log_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote_log
     *
     * @mbg.generated
     */
    List<EcsVoteLog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_vote_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsVoteLog record);
}