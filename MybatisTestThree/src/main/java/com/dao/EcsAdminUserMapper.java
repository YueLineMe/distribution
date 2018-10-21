package com.dao;

import com.entity.EcsAdminUser;
import com.entity.EcsAdminUserWithBLOBs;
import java.util.List;

public interface EcsAdminUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_admin_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short user_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_admin_user
     *
     * @mbg.generated
     */
    int insert(EcsAdminUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_admin_user
     *
     * @mbg.generated
     */
    EcsAdminUserWithBLOBs selectByPrimaryKey(Short user_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_admin_user
     *
     * @mbg.generated
     */
    List<EcsAdminUser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_admin_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsAdminUser record);
}