package com.dao;

import com.entity.HelpTopic;
import com.entity.HelpTopicWithBLOBs;
import java.util.List;

public interface HelpTopicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table help_topic
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer help_topic_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table help_topic
     *
     * @mbg.generated
     */
    int insert(HelpTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table help_topic
     *
     * @mbg.generated
     */
    HelpTopicWithBLOBs selectByPrimaryKey(Integer help_topic_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table help_topic
     *
     * @mbg.generated
     */
    List<HelpTopic> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table help_topic
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(HelpTopic record);
}