package com.dao;

import com.entity.KeyColumnUsage;
import java.util.List;

public interface KeyColumnUsageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KEY_COLUMN_USAGE
     *
     * @mbg.generated
     */
    int insert(KeyColumnUsage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table KEY_COLUMN_USAGE
     *
     * @mbg.generated
     */
    List<KeyColumnUsage> selectAll();
}