package com.dao;

import com.entity.SessionVariables;
import java.util.List;

public interface SessionVariablesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_variables
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String VARIABLE_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_variables
     *
     * @mbg.generated
     */
    int insert(SessionVariables record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_variables
     *
     * @mbg.generated
     */
    SessionVariables selectByPrimaryKey(String VARIABLE_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_variables
     *
     * @mbg.generated
     */
    List<SessionVariables> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_variables
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SessionVariables record);
}