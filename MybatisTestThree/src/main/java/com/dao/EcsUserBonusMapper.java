package com.dao;

import com.entity.EcsUserBonus;
import java.util.List;

public interface EcsUserBonusMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_bonus
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer bonus_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_bonus
     *
     * @mbg.generated
     */
    int insert(EcsUserBonus record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_bonus
     *
     * @mbg.generated
     */
    EcsUserBonus selectByPrimaryKey(Integer bonus_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_bonus
     *
     * @mbg.generated
     */
    List<EcsUserBonus> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_user_bonus
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsUserBonus record);
}