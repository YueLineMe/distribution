package com.dao;

import com.entity.Hosts;
import java.util.List;

public interface HostsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hosts
     *
     * @mbg.generated
     */
    int insert(Hosts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hosts
     *
     * @mbg.generated
     */
    List<Hosts> selectAll();
}