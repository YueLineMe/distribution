package com.dao;

import com.entity.InnodbBufferStatsBySchema;
import java.util.List;

public interface InnodbBufferStatsBySchemaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_buffer_stats_by_schema
     *
     * @mbg.generated
     */
    int insert(InnodbBufferStatsBySchema record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_buffer_stats_by_schema
     *
     * @mbg.generated
     */
    List<InnodbBufferStatsBySchema> selectAll();
}