package com.dao;

import com.entity.XHostSummaryByStages;
import java.util.List;

public interface XHostSummaryByStagesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$host_summary_by_stages
     *
     * @mbg.generated
     */
    int insert(XHostSummaryByStages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$host_summary_by_stages
     *
     * @mbg.generated
     */
    List<XHostSummaryByStages> selectAll();
}