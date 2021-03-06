package com.dao;

import com.entity.EventsStatementsHistory;
import com.entity.EventsStatementsHistoryWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsStatementsHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_history
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("THREAD_ID") Long THREAD_ID, @Param("EVENT_ID") Long EVENT_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_history
     *
     * @mbg.generated
     */
    int insert(EventsStatementsHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_history
     *
     * @mbg.generated
     */
    EventsStatementsHistoryWithBLOBs selectByPrimaryKey(@Param("THREAD_ID") Long THREAD_ID, @Param("EVENT_ID") Long EVENT_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_history
     *
     * @mbg.generated
     */
    List<EventsStatementsHistory> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EventsStatementsHistory record);
}