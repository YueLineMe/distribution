package com.dao;

import com.entity.ReplicationApplierFilters;
import java.util.List;

public interface ReplicationApplierFiltersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_filters
     *
     * @mbg.generated
     */
    int insert(ReplicationApplierFilters record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table replication_applier_filters
     *
     * @mbg.generated
     */
    List<ReplicationApplierFilters> selectAll();
}