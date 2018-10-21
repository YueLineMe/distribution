package com.dao;

import com.entity.TimeZoneLeapSecond;
import java.util.List;

public interface TimeZoneLeapSecondMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_leap_second
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long transition_time);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_leap_second
     *
     * @mbg.generated
     */
    int insert(TimeZoneLeapSecond record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_leap_second
     *
     * @mbg.generated
     */
    TimeZoneLeapSecond selectByPrimaryKey(Long transition_time);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_leap_second
     *
     * @mbg.generated
     */
    List<TimeZoneLeapSecond> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_leap_second
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TimeZoneLeapSecond record);
}