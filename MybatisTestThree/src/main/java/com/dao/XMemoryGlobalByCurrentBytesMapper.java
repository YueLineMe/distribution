package com.dao;

import com.entity.XMemoryGlobalByCurrentBytes;
import java.util.List;

public interface XMemoryGlobalByCurrentBytesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_global_by_current_bytes
     *
     * @mbg.generated
     */
    int insert(XMemoryGlobalByCurrentBytes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$memory_global_by_current_bytes
     *
     * @mbg.generated
     */
    List<XMemoryGlobalByCurrentBytes> selectAll();
}