package com.dao;

import com.entity.ActorInfo;
import java.util.List;

public interface ActorInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_info
     *
     * @mbg.generated
     */
    int insert(ActorInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_info
     *
     * @mbg.generated
     */
    List<ActorInfo> selectAll();
}