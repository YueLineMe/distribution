package com.dao;

import com.entity.XWaitClassesGlobalByAvgLatency;
import java.util.List;

public interface XWaitClassesGlobalByAvgLatencyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$wait_classes_global_by_avg_latency
     *
     * @mbg.generated
     */
    int insert(XWaitClassesGlobalByAvgLatency record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$wait_classes_global_by_avg_latency
     *
     * @mbg.generated
     */
    List<XWaitClassesGlobalByAvgLatency> selectAll();
}