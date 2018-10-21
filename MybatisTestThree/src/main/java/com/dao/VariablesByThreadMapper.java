package com.dao;

import com.entity.VariablesByThread;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VariablesByThreadMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table variables_by_thread
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("THREAD_ID") Long THREAD_ID, @Param("VARIABLE_NAME") String VARIABLE_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table variables_by_thread
     *
     * @mbg.generated
     */
    int insert(VariablesByThread record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table variables_by_thread
     *
     * @mbg.generated
     */
    VariablesByThread selectByPrimaryKey(@Param("THREAD_ID") Long THREAD_ID, @Param("VARIABLE_NAME") String VARIABLE_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table variables_by_thread
     *
     * @mbg.generated
     */
    List<VariablesByThread> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table variables_by_thread
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(VariablesByThread record);
}