package com.dao;

import com.entity.InnodbColumns;
import java.util.List;

public interface InnodbColumnsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_COLUMNS
     *
     * @mbg.generated
     */
    int insert(InnodbColumns record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_COLUMNS
     *
     * @mbg.generated
     */
    List<InnodbColumns> selectAll();
}