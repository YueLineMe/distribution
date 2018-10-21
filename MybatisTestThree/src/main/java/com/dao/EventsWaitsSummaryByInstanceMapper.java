package com.dao;

import com.entity.EventsWaitsSummaryByInstance;
import java.util.List;

public interface EventsWaitsSummaryByInstanceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_instance
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long OBJECT_INSTANCE_BEGIN);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_instance
     *
     * @mbg.generated
     */
    int insert(EventsWaitsSummaryByInstance record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_instance
     *
     * @mbg.generated
     */
    EventsWaitsSummaryByInstance selectByPrimaryKey(Long OBJECT_INSTANCE_BEGIN);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_instance
     *
     * @mbg.generated
     */
    List<EventsWaitsSummaryByInstance> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_instance
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EventsWaitsSummaryByInstance record);
}