package com.dao;

import com.entity.XUserSummaryByFileIoType;
import java.util.List;

public interface XUserSummaryByFileIoTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$user_summary_by_file_io_type
     *
     * @mbg.generated
     */
    int insert(XUserSummaryByFileIoType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$user_summary_by_file_io_type
     *
     * @mbg.generated
     */
    List<XUserSummaryByFileIoType> selectAll();
}