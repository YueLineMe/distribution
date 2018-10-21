package com.dao;

import com.entity.PasswordHistory;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PasswordHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password_history
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("host") String host, @Param("user") String user, @Param("password_timestamp") Date password_timestamp);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password_history
     *
     * @mbg.generated
     */
    int insert(PasswordHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password_history
     *
     * @mbg.generated
     */
    PasswordHistory selectByPrimaryKey(@Param("host") String host, @Param("user") String user, @Param("password_timestamp") Date password_timestamp);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password_history
     *
     * @mbg.generated
     */
    List<PasswordHistory> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table password_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PasswordHistory record);
}