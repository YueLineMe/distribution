package com.dao;

import com.entity.TablePrivileges;
import java.util.List;

public interface TablePrivilegesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE_PRIVILEGES
     *
     * @mbg.generated
     */
    int insert(TablePrivileges record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE_PRIVILEGES
     *
     * @mbg.generated
     */
    List<TablePrivileges> selectAll();
}