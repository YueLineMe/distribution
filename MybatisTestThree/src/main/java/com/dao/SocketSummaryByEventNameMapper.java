package com.dao;

import com.entity.SocketSummaryByEventName;
import java.util.List;

public interface SocketSummaryByEventNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table socket_summary_by_event_name
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String EVENT_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table socket_summary_by_event_name
     *
     * @mbg.generated
     */
    int insert(SocketSummaryByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table socket_summary_by_event_name
     *
     * @mbg.generated
     */
    SocketSummaryByEventName selectByPrimaryKey(String EVENT_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table socket_summary_by_event_name
     *
     * @mbg.generated
     */
    List<SocketSummaryByEventName> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table socket_summary_by_event_name
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SocketSummaryByEventName record);
}