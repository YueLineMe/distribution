package com.dao;

import com.entity.InnodbCmpPerIndex;
import java.util.List;

public interface InnodbCmpPerIndexMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP_PER_INDEX
     *
     * @mbg.generated
     */
    int insert(InnodbCmpPerIndex record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_CMP_PER_INDEX
     *
     * @mbg.generated
     */
    List<InnodbCmpPerIndex> selectAll();
}