package com.dao;

import com.entity.EventsTransactionsCurrent;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventsTransactionsCurrentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_transactions_current
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("THREAD_ID") Long THREAD_ID, @Param("EVENT_ID") Long EVENT_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_transactions_current
     *
     * @mbg.generated
     */
    int insert(EventsTransactionsCurrent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_transactions_current
     *
     * @mbg.generated
     */
    EventsTransactionsCurrent selectByPrimaryKey(@Param("THREAD_ID") Long THREAD_ID, @Param("EVENT_ID") Long EVENT_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_transactions_current
     *
     * @mbg.generated
     */
    List<EventsTransactionsCurrent> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_transactions_current
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EventsTransactionsCurrent record);
}