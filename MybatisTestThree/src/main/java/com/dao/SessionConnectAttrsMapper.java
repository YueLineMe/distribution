package com.dao;

import com.entity.SessionConnectAttrs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SessionConnectAttrsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_connect_attrs
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("PROCESSLIST_ID") Long PROCESSLIST_ID, @Param("ATTR_NAME") String ATTR_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_connect_attrs
     *
     * @mbg.generated
     */
    int insert(SessionConnectAttrs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_connect_attrs
     *
     * @mbg.generated
     */
    SessionConnectAttrs selectByPrimaryKey(@Param("PROCESSLIST_ID") Long PROCESSLIST_ID, @Param("ATTR_NAME") String ATTR_NAME);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_connect_attrs
     *
     * @mbg.generated
     */
    List<SessionConnectAttrs> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table session_connect_attrs
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SessionConnectAttrs record);
}