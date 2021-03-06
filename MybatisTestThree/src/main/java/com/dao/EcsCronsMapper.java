package com.dao;

import com.entity.EcsCrons;
import com.entity.EcsCronsWithBLOBs;
import java.util.List;

public interface EcsCronsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_crons
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Byte cron_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_crons
     *
     * @mbg.generated
     */
    int insert(EcsCrons record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_crons
     *
     * @mbg.generated
     */
    EcsCronsWithBLOBs selectByPrimaryKey(Byte cron_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_crons
     *
     * @mbg.generated
     */
    List<EcsCrons> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_crons
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsCrons record);
}