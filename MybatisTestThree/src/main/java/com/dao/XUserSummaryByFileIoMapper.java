package com.dao;

import com.entity.XUserSummaryByFileIo;
import java.util.List;

public interface XUserSummaryByFileIoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$user_summary_by_file_io
     *
     * @mbg.generated
     */
    int insert(XUserSummaryByFileIo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$user_summary_by_file_io
     *
     * @mbg.generated
     */
    List<XUserSummaryByFileIo> selectAll();
}