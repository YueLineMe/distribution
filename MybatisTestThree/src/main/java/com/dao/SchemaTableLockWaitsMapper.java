package com.dao;

import com.entity.SchemaTableLockWaits;
import java.util.List;

public interface SchemaTableLockWaitsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_table_lock_waits
     *
     * @mbg.generated
     */
    int insert(SchemaTableLockWaits record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_table_lock_waits
     *
     * @mbg.generated
     */
    List<SchemaTableLockWaits> selectAll();
}