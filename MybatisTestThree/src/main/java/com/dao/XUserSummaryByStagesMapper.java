package com.dao;

import com.entity.XUserSummaryByStages;
import java.util.List;

public interface XUserSummaryByStagesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$user_summary_by_stages
     *
     * @mbg.generated
     */
    int insert(XUserSummaryByStages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$user_summary_by_stages
     *
     * @mbg.generated
     */
    List<XUserSummaryByStages> selectAll();
}