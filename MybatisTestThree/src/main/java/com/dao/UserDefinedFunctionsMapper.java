package com.dao;

import com.entity.UserDefinedFunctions;
import java.util.List;

public interface UserDefinedFunctionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_defined_functions
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String UDF_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_defined_functions
     *
     * @mbg.generated
     */
    int insert(UserDefinedFunctions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_defined_functions
     *
     * @mbg.generated
     */
    UserDefinedFunctions selectByPrimaryKey(String UDF_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_defined_functions
     *
     * @mbg.generated
     */
    List<UserDefinedFunctions> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_defined_functions
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserDefinedFunctions record);
}