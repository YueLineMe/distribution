package com.dao;

import com.entity.UserSummaryByStages;
import java.util.List;

public interface UserSummaryByStagesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_summary_by_stages
     *
     * @mbg.generated
     */
    int insert(UserSummaryByStages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_summary_by_stages
     *
     * @mbg.generated
     */
    List<UserSummaryByStages> selectAll();
}