package com.dao;

import com.entity.Files;
import java.util.List;

public interface FilesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FILES
     *
     * @mbg.generated
     */
    int insert(Files record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FILES
     *
     * @mbg.generated
     */
    List<Files> selectAll();
}