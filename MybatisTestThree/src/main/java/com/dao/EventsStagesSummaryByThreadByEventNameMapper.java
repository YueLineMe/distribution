package com.dao;

import com.entity.EventsStagesSummaryByThreadByEventName;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStagesSummaryByThreadByEventNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_summary_by_thread_by_event_name
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("THREAD_ID") Long THREAD_ID, @Param("EVENT_NAME") String EVENT_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_summary_by_thread_by_event_name
     *
     * @mbg.generated
     */
    int insert(EventsStagesSummaryByThreadByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_summary_by_thread_by_event_name
     *
     * @mbg.generated
     */
    EventsStagesSummaryByThreadByEventName selectByPrimaryKey(@Param("THREAD_ID") Long THREAD_ID, @Param("EVENT_NAME") String EVENT_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_summary_by_thread_by_event_name
     *
     * @mbg.generated
     */
    List<EventsStagesSummaryByThreadByEventName> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_summary_by_thread_by_event_name
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EventsStagesSummaryByThreadByEventName record);
}