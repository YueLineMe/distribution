package com.dao;

import com.entity.EcsUsers;
import java.util.List;

public interface EcsUsersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_users
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer user_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_users
     *
     * @mbg.generated
     */
    int insert(EcsUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_users
     *
     * @mbg.generated
     */
    EcsUsers selectByPrimaryKey(Integer user_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_users
     *
     * @mbg.generated
     */
    List<EcsUsers> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_users
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsUsers record);
}