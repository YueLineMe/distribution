package com.dao;

import com.entity.HostSummaryByStatementType;
import java.util.List;

public interface HostSummaryByStatementTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary_by_statement_type
     *
     * @mbg.generated
     */
    int insert(HostSummaryByStatementType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host_summary_by_statement_type
     *
     * @mbg.generated
     */
    List<HostSummaryByStatementType> selectAll();
}