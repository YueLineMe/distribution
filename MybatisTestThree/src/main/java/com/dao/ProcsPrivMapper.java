package com.dao;

import com.entity.ProcsPriv;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcsPrivMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procs_priv
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("host") String host, @Param("db") String db, @Param("user") String user, @Param("routine_name") String routine_name, @Param("routine_type") String routine_type);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procs_priv
     *
     * @mbg.generated
     */
    int insert(ProcsPriv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procs_priv
     *
     * @mbg.generated
     */
    ProcsPriv selectByPrimaryKey(@Param("host") String host, @Param("db") String db, @Param("user") String user, @Param("routine_name") String routine_name, @Param("routine_type") String routine_type);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procs_priv
     *
     * @mbg.generated
     */
    List<ProcsPriv> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procs_priv
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ProcsPriv record);
}