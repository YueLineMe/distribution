package com.dao;

import com.entity.TimeZoneName;
import java.util.List;

public interface TimeZoneNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_name
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_name
     *
     * @mbg.generated
     */
    int insert(TimeZoneName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_name
     *
     * @mbg.generated
     */
    TimeZoneName selectByPrimaryKey(String name);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_name
     *
     * @mbg.generated
     */
    List<TimeZoneName> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_name
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TimeZoneName record);
}