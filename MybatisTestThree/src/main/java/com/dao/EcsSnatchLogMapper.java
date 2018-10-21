package com.dao;

import com.entity.EcsSnatchLog;
import java.util.List;

public interface EcsSnatchLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_snatch_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer log_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_snatch_log
     *
     * @mbg.generated
     */
    int insert(EcsSnatchLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_snatch_log
     *
     * @mbg.generated
     */
    EcsSnatchLog selectByPrimaryKey(Integer log_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_snatch_log
     *
     * @mbg.generated
     */
    List<EcsSnatchLog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_snatch_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsSnatchLog record);
}