package com.dao;

import com.entity.City;
import java.util.List;

public interface CityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated
     */
    int insert(City record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated
     */
    City selectByPrimaryKey(Integer ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated
     */
    List<City> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table city
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(City record);
}