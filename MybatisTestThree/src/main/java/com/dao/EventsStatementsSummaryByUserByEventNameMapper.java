package com.dao;

import com.entity.EventsStatementsSummaryByUserByEventName;
import java.util.List;

public interface EventsStatementsSummaryByUserByEventNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_user_by_event_name
     *
     * @mbg.generated
     */
    int insert(EventsStatementsSummaryByUserByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_user_by_event_name
     *
     * @mbg.generated
     */
    List<EventsStatementsSummaryByUserByEventName> selectAll();
}