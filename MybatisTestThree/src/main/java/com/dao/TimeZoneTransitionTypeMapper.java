package com.dao;

import com.entity.TimeZoneTransitionType;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TimeZoneTransitionTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_transition_type
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("time_zone_id") Integer time_zone_id, @Param("transition_type_id") Integer transition_type_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_transition_type
     *
     * @mbg.generated
     */
    int insert(TimeZoneTransitionType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_transition_type
     *
     * @mbg.generated
     */
    TimeZoneTransitionType selectByPrimaryKey(@Param("time_zone_id") Integer time_zone_id, @Param("transition_type_id") Integer transition_type_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_transition_type
     *
     * @mbg.generated
     */
    List<TimeZoneTransitionType> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_zone_transition_type
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TimeZoneTransitionType record);
}