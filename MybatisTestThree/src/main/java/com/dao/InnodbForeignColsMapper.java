package com.dao;

import com.entity.InnodbForeignCols;
import java.util.List;

public interface InnodbForeignColsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FOREIGN_COLS
     *
     * @mbg.generated
     */
    int insert(InnodbForeignCols record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FOREIGN_COLS
     *
     * @mbg.generated
     */
    List<InnodbForeignCols> selectAll();
}