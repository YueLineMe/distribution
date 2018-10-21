package com.dao;

import com.entity.EcsSupplierAdminAction;
import java.util.List;

public interface EcsSupplierAdminActionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_admin_action
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer action_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_admin_action
     *
     * @mbg.generated
     */
    int insert(EcsSupplierAdminAction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_admin_action
     *
     * @mbg.generated
     */
    EcsSupplierAdminAction selectByPrimaryKey(Integer action_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_admin_action
     *
     * @mbg.generated
     */
    List<EcsSupplierAdminAction> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_admin_action
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsSupplierAdminAction record);
}