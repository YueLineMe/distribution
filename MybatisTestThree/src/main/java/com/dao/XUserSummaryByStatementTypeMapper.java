package com.dao;

import com.entity.XUserSummaryByStatementType;
import java.util.List;

public interface XUserSummaryByStatementTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$user_summary_by_statement_type
     *
     * @mbg.generated
     */
    int insert(XUserSummaryByStatementType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$user_summary_by_statement_type
     *
     * @mbg.generated
     */
    List<XUserSummaryByStatementType> selectAll();
}