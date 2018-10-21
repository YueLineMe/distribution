package com.dao;

import com.entity.EcsQuestion;
import java.util.List;

public interface EcsQuestionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_question
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer question_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_question
     *
     * @mbg.generated
     */
    int insert(EcsQuestion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_question
     *
     * @mbg.generated
     */
    EcsQuestion selectByPrimaryKey(Integer question_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_question
     *
     * @mbg.generated
     */
    List<EcsQuestion> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_question
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsQuestion record);
}