package com.dao;

import com.entity.HelpRelation;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table help_relation
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("help_keyword_id") Integer help_keyword_id, @Param("help_topic_id") Integer help_topic_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table help_relation
     *
     * @mbg.generated
     */
    int insert(HelpRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table help_relation
     *
     * @mbg.generated
     */
    List<HelpRelation> selectAll();
}