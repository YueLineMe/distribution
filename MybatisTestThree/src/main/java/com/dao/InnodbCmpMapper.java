package com.dao;

import com.entity.InnodbCmp;
import java.util.List;

public interface InnodbCmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP
     *
     * @mbg.generated
     */
    int insert(InnodbCmp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP
     *
     * @mbg.generated
     */
    List<InnodbCmp> selectAll();
}