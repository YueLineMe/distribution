package com.dao;

import com.entity.MemoryByUserByCurrentBytes;
import java.util.List;

public interface MemoryByUserByCurrentBytesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memory_by_user_by_current_bytes
     *
     * @mbg.generated
     */
    int insert(MemoryByUserByCurrentBytes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memory_by_user_by_current_bytes
     *
     * @mbg.generated
     */
    List<MemoryByUserByCurrentBytes> selectAll();
}