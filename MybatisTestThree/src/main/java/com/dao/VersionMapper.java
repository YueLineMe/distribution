package com.dao;

import com.entity.Version;
import java.util.List;

public interface VersionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table version
     *
     * @mbg.generated
     */
    int insert(Version record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table version
     *
     * @mbg.generated
     */
    List<Version> selectAll();
}