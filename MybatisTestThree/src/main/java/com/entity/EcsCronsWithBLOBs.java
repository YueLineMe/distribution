package com.entity;

public class EcsCronsWithBLOBs extends EcsCrons {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_crons.cron_desc
     *
     * @mbg.generated
     */
    private String cron_desc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_crons.cron_config
     *
     * @mbg.generated
     */
    private String cron_config;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_crons.cron_desc
     *
     * @return the value of ecs_crons.cron_desc
     *
     * @mbg.generated
     */
    public String getCron_desc() {
        return cron_desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_crons.cron_desc
     *
     * @param cron_desc the value for ecs_crons.cron_desc
     *
     * @mbg.generated
     */
    public void setCron_desc(String cron_desc) {
        this.cron_desc = cron_desc == null ? null : cron_desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_crons.cron_config
     *
     * @return the value of ecs_crons.cron_config
     *
     * @mbg.generated
     */
    public String getCron_config() {
        return cron_config;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_crons.cron_config
     *
     * @param cron_config the value for ecs_crons.cron_config
     *
     * @mbg.generated
     */
    public void setCron_config(String cron_config) {
        this.cron_config = cron_config == null ? null : cron_config.trim();
    }
}