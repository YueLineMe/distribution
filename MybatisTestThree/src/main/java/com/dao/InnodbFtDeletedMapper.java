package com.dao;

import com.entity.InnodbFtDeleted;
import java.util.List;

public interface InnodbFtDeletedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_DELETED
     *
     * @mbg.generated
     */
    int insert(InnodbFtDeleted record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_DELETED
     *
     * @mbg.generated
     */
    List<InnodbFtDeleted> selectAll();
}