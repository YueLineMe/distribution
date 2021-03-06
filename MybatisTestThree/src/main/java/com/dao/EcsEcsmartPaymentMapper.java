package com.dao;

import com.entity.EcsEcsmartPayment;
import com.entity.EcsEcsmartPaymentWithBLOBs;
import java.util.List;

public interface EcsEcsmartPaymentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_payment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Byte pay_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_payment
     *
     * @mbg.generated
     */
    int insert(EcsEcsmartPayment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_payment
     *
     * @mbg.generated
     */
    EcsEcsmartPaymentWithBLOBs selectByPrimaryKey(Byte pay_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_payment
     *
     * @mbg.generated
     */
    List<EcsEcsmartPayment> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_ecsmart_payment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsEcsmartPayment record);
}