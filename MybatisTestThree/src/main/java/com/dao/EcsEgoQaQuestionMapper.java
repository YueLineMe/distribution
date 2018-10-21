package com.dao;

import com.entity.EcsEgoQaQuestion;
import java.util.List;

public interface EcsEgoQaQuestionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_qa_question
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_qa_question
     *
     * @mbg.generated
     */
    int insert(EcsEgoQaQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_qa_question
     *
     * @mbg.generated
     */
    EcsEgoQaQuestion selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_qa_question
     *
     * @mbg.generated
     */
    List<EcsEgoQaQuestion> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ego_qa_question
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsEgoQaQuestion record);
}