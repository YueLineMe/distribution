package com.dao;

import com.entity.ReplicationConnectionStatus;
import java.util.List;

public interface ReplicationConnectionStatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_connection_status
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String CHANNEL_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_connection_status
     *
     * @mbg.generated
     */
    int insert(ReplicationConnectionStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_connection_status
     *
     * @mbg.generated
     */
    ReplicationConnectionStatus selectByPrimaryKey(String CHANNEL_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_connection_status
     *
     * @mbg.generated
     */
    List<ReplicationConnectionStatus> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_connection_status
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ReplicationConnectionStatus record);
}