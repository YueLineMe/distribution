package com.dao;

import com.entity.ResourceGroups;
import java.util.List;

public interface ResourceGroupsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCE_GROUPS
     *
     * @mbg.generated
     */
    int insert(ResourceGroups record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RESOURCE_GROUPS
     *
     * @mbg.generated
     */
    List<ResourceGroups> selectAll();
}