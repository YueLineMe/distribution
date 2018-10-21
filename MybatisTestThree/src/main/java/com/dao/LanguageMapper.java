package com.dao;

import com.entity.Language;
import java.util.List;

public interface LanguageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Byte language_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbg.generated
     */
    int insert(Language record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbg.generated
     */
    Language selectByPrimaryKey(Byte language_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbg.generated
     */
    List<Language> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Language record);
}