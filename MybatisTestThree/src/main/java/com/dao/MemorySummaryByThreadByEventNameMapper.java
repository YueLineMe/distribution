package com.dao;

import com.entity.MemorySummaryByThreadByEventName;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemorySummaryByThreadByEventNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memory_summary_by_thread_by_event_name
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("THREAD_ID") Long THREAD_ID, @Param("EVENT_NAME") String EVENT_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memory_summary_by_thread_by_event_name
     *
     * @mbg.generated
     */
    int insert(MemorySummaryByThreadByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memory_summary_by_thread_by_event_name
     *
     * @mbg.generated
     */
    MemorySummaryByThreadByEventName selectByPrimaryKey(@Param("THREAD_ID") Long THREAD_ID, @Param("EVENT_NAME") String EVENT_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memory_summary_by_thread_by_event_name
     *
     * @mbg.generated
     */
    List<MemorySummaryByThreadByEventName> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memory_summary_by_thread_by_event_name
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MemorySummaryByThreadByEventName record);
}