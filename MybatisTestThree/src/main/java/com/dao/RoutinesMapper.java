package com.dao;

import com.entity.Routines;
import java.util.List;

public interface RoutinesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ROUTINES
     *
     * @mbg.generated
     */
    int insert(Routines record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ROUTINES
     *
     * @mbg.generated
     */
    List<Routines> selectAll();
}