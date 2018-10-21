package com.dao;

import com.entity.GlobalVariables;
import java.util.List;

public interface GlobalVariablesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_variables
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String VARIABLE_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_variables
     *
     * @mbg.generated
     */
    int insert(GlobalVariables record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_variables
     *
     * @mbg.generated
     */
    GlobalVariables selectByPrimaryKey(String VARIABLE_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_variables
     *
     * @mbg.generated
     */
    List<GlobalVariables> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_variables
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GlobalVariables record);
}