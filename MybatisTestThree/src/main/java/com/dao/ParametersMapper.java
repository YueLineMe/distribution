package com.dao;

import com.entity.Parameters;
import java.util.List;

public interface ParametersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARAMETERS
     *
     * @mbg.generated
     */
    int insert(Parameters record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PARAMETERS
     *
     * @mbg.generated
     */
    List<Parameters> selectAll();
}