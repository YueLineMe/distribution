package com.dao;

import com.entity.ColumnStatistics;
import java.util.List;

public interface ColumnStatisticsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLUMN_STATISTICS
     *
     * @mbg.generated
     */
    int insert(ColumnStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLUMN_STATISTICS
     *
     * @mbg.generated
     */
    List<ColumnStatistics> selectAll();
}