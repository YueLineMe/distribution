package com.dao;

import com.entity.EcsSupplierRebateLog;
import java.util.List;

public interface EcsSupplierRebateLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_rebate_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer logid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_rebate_log
     *
     * @mbg.generated
     */
    int insert(EcsSupplierRebateLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_rebate_log
     *
     * @mbg.generated
     */
    EcsSupplierRebateLog selectByPrimaryKey(Integer logid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_rebate_log
     *
     * @mbg.generated
     */
    List<EcsSupplierRebateLog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_supplier_rebate_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsSupplierRebateLog record);
}