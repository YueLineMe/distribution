package com.dao;

import com.entity.LogStatus;
import java.util.List;

public interface LogStatusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_status
     *
     * @mbg.generated
     */
    int insert(LogStatus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table log_status
     *
     * @mbg.generated
     */
    List<LogStatus> selectAll();
}