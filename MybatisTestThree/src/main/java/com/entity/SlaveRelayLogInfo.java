package com.entity;

public class SlaveRelayLogInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column slave_relay_log_info.Channel_name
     *
     * @mbg.generated
     */
    private String channel_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column slave_relay_log_info.Number_of_lines
     *
     * @mbg.generated
     */
    private Integer number_of_lines;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column slave_relay_log_info.Relay_log_pos
     *
     * @mbg.generated
     */
    private Long relay_log_pos;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column slave_relay_log_info.Master_log_pos
     *
     * @mbg.generated
     */
    private Long master_log_pos;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column slave_relay_log_info.Sql_delay
     *
     * @mbg.generated
     */
    private Integer sql_delay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column slave_relay_log_info.Number_of_workers
     *
     * @mbg.generated
     */
    private Integer number_of_workers;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column slave_relay_log_info.Id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column slave_relay_log_info.Relay_log_name
     *
     * @mbg.generated
     */
    private String relay_log_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column slave_relay_log_info.Master_log_name
     *
     * @mbg.generated
     */
    private String master_log_name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column slave_relay_log_info.Channel_name
     *
     * @return the value of slave_relay_log_info.Channel_name
     *
     * @mbg.generated
     */
    public String getChannel_name() {
        return channel_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column slave_relay_log_info.Channel_name
     *
     * @param channel_name the value for slave_relay_log_info.Channel_name
     *
     * @mbg.generated
     */
    public void setChannel_name(String channel_name) {
        this.channel_name = channel_name == null ? null : channel_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column slave_relay_log_info.Number_of_lines
     *
     * @return the value of slave_relay_log_info.Number_of_lines
     *
     * @mbg.generated
     */
    public Integer getNumber_of_lines() {
        return number_of_lines;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column slave_relay_log_info.Number_of_lines
     *
     * @param number_of_lines the value for slave_relay_log_info.Number_of_lines
     *
     * @mbg.generated
     */
    public void setNumber_of_lines(Integer number_of_lines) {
        this.number_of_lines = number_of_lines;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column slave_relay_log_info.Relay_log_pos
     *
     * @return the value of slave_relay_log_info.Relay_log_pos
     *
     * @mbg.generated
     */
    public Long getRelay_log_pos() {
        return relay_log_pos;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column slave_relay_log_info.Relay_log_pos
     *
     * @param relay_log_pos the value for slave_relay_log_info.Relay_log_pos
     *
     * @mbg.generated
     */
    public void setRelay_log_pos(Long relay_log_pos) {
        this.relay_log_pos = relay_log_pos;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column slave_relay_log_info.Master_log_pos
     *
     * @return the value of slave_relay_log_info.Master_log_pos
     *
     * @mbg.generated
     */
    public Long getMaster_log_pos() {
        return master_log_pos;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column slave_relay_log_info.Master_log_pos
     *
     * @param master_log_pos the value for slave_relay_log_info.Master_log_pos
     *
     * @mbg.generated
     */
    public void setMaster_log_pos(Long master_log_pos) {
        this.master_log_pos = master_log_pos;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column slave_relay_log_info.Sql_delay
     *
     * @return the value of slave_relay_log_info.Sql_delay
     *
     * @mbg.generated
     */
    public Integer getSql_delay() {
        return sql_delay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column slave_relay_log_info.Sql_delay
     *
     * @param sql_delay the value for slave_relay_log_info.Sql_delay
     *
     * @mbg.generated
     */
    public void setSql_delay(Integer sql_delay) {
        this.sql_delay = sql_delay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column slave_relay_log_info.Number_of_workers
     *
     * @return the value of slave_relay_log_info.Number_of_workers
     *
     * @mbg.generated
     */
    public Integer getNumber_of_workers() {
        return number_of_workers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column slave_relay_log_info.Number_of_workers
     *
     * @param number_of_workers the value for slave_relay_log_info.Number_of_workers
     *
     * @mbg.generated
     */
    public void setNumber_of_workers(Integer number_of_workers) {
        this.number_of_workers = number_of_workers;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column slave_relay_log_info.Id
     *
     * @return the value of slave_relay_log_info.Id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column slave_relay_log_info.Id
     *
     * @param id the value for slave_relay_log_info.Id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column slave_relay_log_info.Relay_log_name
     *
     * @return the value of slave_relay_log_info.Relay_log_name
     *
     * @mbg.generated
     */
    public String getRelay_log_name() {
        return relay_log_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column slave_relay_log_info.Relay_log_name
     *
     * @param relay_log_name the value for slave_relay_log_info.Relay_log_name
     *
     * @mbg.generated
     */
    public void setRelay_log_name(String relay_log_name) {
        this.relay_log_name = relay_log_name == null ? null : relay_log_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column slave_relay_log_info.Master_log_name
     *
     * @return the value of slave_relay_log_info.Master_log_name
     *
     * @mbg.generated
     */
    public String getMaster_log_name() {
        return master_log_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column slave_relay_log_info.Master_log_name
     *
     * @param master_log_name the value for slave_relay_log_info.Master_log_name
     *
     * @mbg.generated
     */
    public void setMaster_log_name(String master_log_name) {
        this.master_log_name = master_log_name == null ? null : master_log_name.trim();
    }
}