package com.dao;

import com.entity.EventsStagesSummaryByAccountByEventName;
import java.util.List;

public interface EventsStagesSummaryByAccountByEventNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_summary_by_account_by_event_name
     *
     * @mbg.generated
     */
    int insert(EventsStagesSummaryByAccountByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_stages_summary_by_account_by_event_name
     *
     * @mbg.generated
     */
    List<EventsStagesSummaryByAccountByEventName> selectAll();
}