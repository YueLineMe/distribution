package com.dao;

import com.entity.EcsTopic;
import java.util.List;

public interface EcsTopicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_topic
     *
     * @mbg.generated
     */
    int insert(EcsTopic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_topic
     *
     * @mbg.generated
     */
    List<EcsTopic> selectAll();
}