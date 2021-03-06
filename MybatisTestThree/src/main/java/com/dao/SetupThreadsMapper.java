package com.dao;

import com.entity.SetupThreads;
import java.util.List;

public interface SetupThreadsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_threads
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_threads
     *
     * @mbg.generated
     */
    int insert(SetupThreads record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_threads
     *
     * @mbg.generated
     */
    SetupThreads selectByPrimaryKey(String NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_threads
     *
     * @mbg.generated
     */
    List<SetupThreads> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_threads
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SetupThreads record);
}