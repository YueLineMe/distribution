package com.dao;

import com.entity.Triggers;
import java.util.List;

public interface TriggersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRIGGERS
     *
     * @mbg.generated
     */
    int insert(Triggers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRIGGERS
     *
     * @mbg.generated
     */
    List<Triggers> selectAll();
}