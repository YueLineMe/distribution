package com.dao;

import com.entity.RwlockInstances;
import java.util.List;

public interface RwlockInstancesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long OBJECT_INSTANCE_BEGIN);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated
     */
    int insert(RwlockInstances record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated
     */
    RwlockInstances selectByPrimaryKey(Long OBJECT_INSTANCE_BEGIN);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated
     */
    List<RwlockInstances> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table rwlock_instances
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(RwlockInstances record);
}