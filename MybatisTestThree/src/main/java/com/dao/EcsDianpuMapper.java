package com.dao;

import com.entity.EcsDianpu;
import java.util.List;

public interface EcsDianpuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_dianpu
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_dianpu
     *
     * @mbg.generated
     */
    int insert(EcsDianpu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_dianpu
     *
     * @mbg.generated
     */
    EcsDianpu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_dianpu
     *
     * @mbg.generated
     */
    List<EcsDianpu> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_dianpu
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsDianpu record);
}