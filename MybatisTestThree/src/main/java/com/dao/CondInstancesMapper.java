package com.dao;

import com.entity.CondInstances;
import java.util.List;

public interface CondInstancesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cond_instances
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long OBJECT_INSTANCE_BEGIN);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cond_instances
     *
     * @mbg.generated
     */
    int insert(CondInstances record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cond_instances
     *
     * @mbg.generated
     */
    CondInstances selectByPrimaryKey(Long OBJECT_INSTANCE_BEGIN);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cond_instances
     *
     * @mbg.generated
     */
    List<CondInstances> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cond_instances
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CondInstances record);
}