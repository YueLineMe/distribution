package com.dao;

import com.entity.InnodbDatafiles;
import java.util.List;

public interface InnodbDatafilesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_DATAFILES
     *
     * @mbg.generated
     */
    int insert(InnodbDatafiles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_DATAFILES
     *
     * @mbg.generated
     */
    List<InnodbDatafiles> selectAll();
}