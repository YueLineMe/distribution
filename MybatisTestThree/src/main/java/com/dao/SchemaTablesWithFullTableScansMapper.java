package com.dao;

import com.entity.SchemaTablesWithFullTableScans;
import java.util.List;

public interface SchemaTablesWithFullTableScansMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_tables_with_full_table_scans
     *
     * @mbg.generated
     */
    int insert(SchemaTablesWithFullTableScans record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schema_tables_with_full_table_scans
     *
     * @mbg.generated
     */
    List<SchemaTablesWithFullTableScans> selectAll();
}