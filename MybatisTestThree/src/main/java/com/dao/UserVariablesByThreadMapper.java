package com.dao;

import com.entity.UserVariablesByThread;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserVariablesByThreadMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_variables_by_thread
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("THREAD_ID") Long THREAD_ID, @Param("VARIABLE_NAME") String VARIABLE_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_variables_by_thread
     *
     * @mbg.generated
     */
    int insert(UserVariablesByThread record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_variables_by_thread
     *
     * @mbg.generated
     */
    UserVariablesByThread selectByPrimaryKey(@Param("THREAD_ID") Long THREAD_ID, @Param("VARIABLE_NAME") String VARIABLE_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_variables_by_thread
     *
     * @mbg.generated
     */
    List<UserVariablesByThread> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_variables_by_thread
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(UserVariablesByThread record);
}