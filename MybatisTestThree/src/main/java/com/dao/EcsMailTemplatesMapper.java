package com.dao;

import com.entity.EcsMailTemplates;
import java.util.List;

public interface EcsMailTemplatesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_mail_templates
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Boolean template_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_mail_templates
     *
     * @mbg.generated
     */
    int insert(EcsMailTemplates record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_mail_templates
     *
     * @mbg.generated
     */
    EcsMailTemplates selectByPrimaryKey(Boolean template_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_mail_templates
     *
     * @mbg.generated
     */
    List<EcsMailTemplates> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_mail_templates
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsMailTemplates record);
}