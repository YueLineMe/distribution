package com.dao;

import com.entity.InnodbFtIndexTable;
import java.util.List;

public interface InnodbFtIndexTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_INDEX_TABLE
     *
     * @mbg.generated
     */
    int insert(InnodbFtIndexTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_INDEX_TABLE
     *
     * @mbg.generated
     */
    List<InnodbFtIndexTable> selectAll();
}