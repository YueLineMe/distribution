package com.dao;

import com.entity.SocketSummaryByInstance;
import java.util.List;

public interface SocketSummaryByInstanceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table socket_summary_by_instance
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long OBJECT_INSTANCE_BEGIN);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table socket_summary_by_instance
     *
     * @mbg.generated
     */
    int insert(SocketSummaryByInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table socket_summary_by_instance
     *
     * @mbg.generated
     */
    SocketSummaryByInstance selectByPrimaryKey(Long OBJECT_INSTANCE_BEGIN);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table socket_summary_by_instance
     *
     * @mbg.generated
     */
    List<SocketSummaryByInstance> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table socket_summary_by_instance
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SocketSummaryByInstance record);
}