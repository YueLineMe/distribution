package com.dao;

import com.entity.UserSummary;
import java.util.List;

public interface UserSummaryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_summary
     *
     * @mbg.generated
     */
    int insert(UserSummary record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_summary
     *
     * @mbg.generated
     */
    List<UserSummary> selectAll();
}