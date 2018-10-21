package com.dao;

import com.entity.EcsAdminMessage;
import java.util.List;

public interface EcsAdminMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_admin_message
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Short message_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_admin_message
     *
     * @mbg.generated
     */
    int insert(EcsAdminMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_admin_message
     *
     * @mbg.generated
     */
    EcsAdminMessage selectByPrimaryKey(Short message_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_admin_message
     *
     * @mbg.generated
     */
    List<EcsAdminMessage> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_admin_message
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsAdminMessage record);
}