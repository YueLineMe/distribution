package com.dao;

import com.entity.ReplicationApplierConfiguration;
import java.util.List;

public interface ReplicationApplierConfigurationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_configuration
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String CHANNEL_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_configuration
     *
     * @mbg.generated
     */
    int insert(ReplicationApplierConfiguration record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_configuration
     *
     * @mbg.generated
     */
    ReplicationApplierConfiguration selectByPrimaryKey(String CHANNEL_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_configuration
     *
     * @mbg.generated
     */
    List<ReplicationApplierConfiguration> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_configuration
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ReplicationApplierConfiguration record);
}