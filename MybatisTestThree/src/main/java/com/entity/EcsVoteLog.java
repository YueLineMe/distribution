package com.entity;

public class EcsVoteLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_vote_log.log_id
     *
     * @mbg.generated
     */
    private Integer log_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_vote_log.vote_id
     *
     * @mbg.generated
     */
    private Short vote_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_vote_log.ip_address
     *
     * @mbg.generated
     */
    private String ip_address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_vote_log.vote_time
     *
     * @mbg.generated
     */
    private Integer vote_time;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_vote_log.log_id
     *
     * @return the value of ecs_vote_log.log_id
     *
     * @mbg.generated
     */
    public Integer getLog_id() {
        return log_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_vote_log.log_id
     *
     * @param log_id the value for ecs_vote_log.log_id
     *
     * @mbg.generated
     */
    public void setLog_id(Integer log_id) {
        this.log_id = log_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_vote_log.vote_id
     *
     * @return the value of ecs_vote_log.vote_id
     *
     * @mbg.generated
     */
    public Short getVote_id() {
        return vote_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_vote_log.vote_id
     *
     * @param vote_id the value for ecs_vote_log.vote_id
     *
     * @mbg.generated
     */
    public void setVote_id(Short vote_id) {
        this.vote_id = vote_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_vote_log.ip_address
     *
     * @return the value of ecs_vote_log.ip_address
     *
     * @mbg.generated
     */
    public String getIp_address() {
        return ip_address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_vote_log.ip_address
     *
     * @param ip_address the value for ecs_vote_log.ip_address
     *
     * @mbg.generated
     */
    public void setIp_address(String ip_address) {
        this.ip_address = ip_address == null ? null : ip_address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_vote_log.vote_time
     *
     * @return the value of ecs_vote_log.vote_time
     *
     * @mbg.generated
     */
    public Integer getVote_time() {
        return vote_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_vote_log.vote_time
     *
     * @param vote_time the value for ecs_vote_log.vote_time
     *
     * @mbg.generated
     */
    public void setVote_time(Integer vote_time) {
        this.vote_time = vote_time;
    }
}