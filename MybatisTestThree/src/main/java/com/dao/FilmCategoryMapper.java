package com.dao;

import com.entity.FilmCategory;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FilmCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_category
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("film_id") Short film_id, @Param("category_id") Byte category_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_category
     *
     * @mbg.generated
     */
    int insert(FilmCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_category
     *
     * @mbg.generated
     */
    FilmCategory selectByPrimaryKey(@Param("film_id") Short film_id, @Param("category_id") Byte category_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_category
     *
     * @mbg.generated
     */
    List<FilmCategory> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(FilmCategory record);
}