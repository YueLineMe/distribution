package com.dao;

import com.entity.XWaitsGlobalByLatency;
import java.util.List;

public interface XWaitsGlobalByLatencyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$waits_global_by_latency
     *
     * @mbg.generated
     */
    int insert(XWaitsGlobalByLatency record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$waits_global_by_latency
     *
     * @mbg.generated
     */
    List<XWaitsGlobalByLatency> selectAll();
}