package com.dao;

import com.entity.StGeometryColumns;
import java.util.List;

public interface StGeometryColumnsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ST_GEOMETRY_COLUMNS
     *
     * @mbg.generated
     */
    int insert(StGeometryColumns record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ST_GEOMETRY_COLUMNS
     *
     * @mbg.generated
     */
    List<StGeometryColumns> selectAll();
}