package com.dao;

import com.entity.DefaultRoles;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DefaultRolesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table default_roles
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("HOST") String HOST, @Param("USER") String USER, @Param("DEFAULT_ROLE_HOST") String DEFAULT_ROLE_HOST, @Param("DEFAULT_ROLE_USER") String DEFAULT_ROLE_USER);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table default_roles
     *
     * @mbg.generated
     */
    int insert(DefaultRoles record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table default_roles
     *
     * @mbg.generated
     */
    List<DefaultRoles> selectAll();
}