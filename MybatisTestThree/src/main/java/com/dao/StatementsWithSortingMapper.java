package com.dao;

import com.entity.StatementsWithSorting;
import java.util.List;

public interface StatementsWithSortingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statements_with_sorting
     *
     * @mbg.generated
     */
    int insert(StatementsWithSorting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table statements_with_sorting
     *
     * @mbg.generated
     */
    List<StatementsWithSorting> selectAll();
}