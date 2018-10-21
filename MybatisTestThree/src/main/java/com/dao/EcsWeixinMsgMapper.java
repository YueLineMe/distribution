package com.dao;

import com.entity.EcsWeixinMsg;
import java.util.List;

public interface EcsWeixinMsgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_msg
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer msgid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_msg
     *
     * @mbg.generated
     */
    int insert(EcsWeixinMsg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_msg
     *
     * @mbg.generated
     */
    EcsWeixinMsg selectByPrimaryKey(Integer msgid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_msg
     *
     * @mbg.generated
     */
    List<EcsWeixinMsg> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_weixin_msg
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsWeixinMsg record);
}