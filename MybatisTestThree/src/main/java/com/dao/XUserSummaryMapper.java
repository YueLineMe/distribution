package com.dao;

import com.entity.XUserSummary;
import java.util.List;

public interface XUserSummaryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$user_summary
     *
     * @mbg.generated
     */
    int insert(XUserSummary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$user_summary
     *
     * @mbg.generated
     */
    List<XUserSummary> selectAll();
}