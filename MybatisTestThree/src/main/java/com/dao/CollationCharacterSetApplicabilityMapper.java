package com.dao;

import com.entity.CollationCharacterSetApplicability;
import java.util.List;

public interface CollationCharacterSetApplicabilityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLLATION_CHARACTER_SET_APPLICABILITY
     *
     * @mbg.generated
     */
    int insert(CollationCharacterSetApplicability record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLLATION_CHARACTER_SET_APPLICABILITY
     *
     * @mbg.generated
     */
    List<CollationCharacterSetApplicability> selectAll();
}