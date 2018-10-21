package com.dao;

import com.entity.SetupActors;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SetupActorsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_actors
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("HOST") String HOST, @Param("USER") String USER, @Param("ROLE") String ROLE);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_actors
     *
     * @mbg.generated
     */
    int insert(SetupActors record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_actors
     *
     * @mbg.generated
     */
    SetupActors selectByPrimaryKey(@Param("HOST") String HOST, @Param("USER") String USER, @Param("ROLE") String ROLE);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_actors
     *
     * @mbg.generated
     */
    List<SetupActors> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table setup_actors
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SetupActors record);
}