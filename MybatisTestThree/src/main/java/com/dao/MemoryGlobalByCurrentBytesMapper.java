package com.dao;

import com.entity.MemoryGlobalByCurrentBytes;
import java.util.List;

public interface MemoryGlobalByCurrentBytesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memory_global_by_current_bytes
     *
     * @mbg.generated
     */
    int insert(MemoryGlobalByCurrentBytes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memory_global_by_current_bytes
     *
     * @mbg.generated
     */
    List<MemoryGlobalByCurrentBytes> selectAll();
}