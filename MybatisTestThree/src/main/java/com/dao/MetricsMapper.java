package com.dao;

import com.entity.Metrics;
import java.util.List;

public interface MetricsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metrics
     *
     * @mbg.generated
     */
    int insert(Metrics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table metrics
     *
     * @mbg.generated
     */
    List<Metrics> selectAll();
}