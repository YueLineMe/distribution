package com.entity;

public class SlaveWorkerInfoWithBLOBs extends SlaveWorkerInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column slave_worker_info.Relay_log_name
     *
     * @mbg.generated
     */
    private String relay_log_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column slave_worker_info.Master_log_name
     *
     * @mbg.generated
     */
    private String master_log_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column slave_worker_info.Checkpoint_relay_log_name
     *
     * @mbg.generated
     */
    private String checkpoint_relay_log_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column slave_worker_info.Checkpoint_master_log_name
     *
     * @mbg.generated
     */
    private String checkpoint_master_log_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column slave_worker_info.Checkpoint_group_bitmap
     *
     * @mbg.generated
     */
    private byte[] checkpoint_group_bitmap;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column slave_worker_info.Relay_log_name
     *
     * @return the value of slave_worker_info.Relay_log_name
     *
     * @mbg.generated
     */
    public String getRelay_log_name() {
        return relay_log_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column slave_worker_info.Relay_log_name
     *
     * @param relay_log_name the value for slave_worker_info.Relay_log_name
     *
     * @mbg.generated
     */
    public void setRelay_log_name(String relay_log_name) {
        this.relay_log_name = relay_log_name == null ? null : relay_log_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column slave_worker_info.Master_log_name
     *
     * @return the value of slave_worker_info.Master_log_name
     *
     * @mbg.generated
     */
    public String getMaster_log_name() {
        return master_log_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column slave_worker_info.Master_log_name
     *
     * @param master_log_name the value for slave_worker_info.Master_log_name
     *
     * @mbg.generated
     */
    public void setMaster_log_name(String master_log_name) {
        this.master_log_name = master_log_name == null ? null : master_log_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column slave_worker_info.Checkpoint_relay_log_name
     *
     * @return the value of slave_worker_info.Checkpoint_relay_log_name
     *
     * @mbg.generated
     */
    public String getCheckpoint_relay_log_name() {
        return checkpoint_relay_log_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column slave_worker_info.Checkpoint_relay_log_name
     *
     * @param checkpoint_relay_log_name the value for slave_worker_info.Checkpoint_relay_log_name
     *
     * @mbg.generated
     */
    public void setCheckpoint_relay_log_name(String checkpoint_relay_log_name) {
        this.checkpoint_relay_log_name = checkpoint_relay_log_name == null ? null : checkpoint_relay_log_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column slave_worker_info.Checkpoint_master_log_name
     *
     * @return the value of slave_worker_info.Checkpoint_master_log_name
     *
     * @mbg.generated
     */
    public String getCheckpoint_master_log_name() {
        return checkpoint_master_log_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column slave_worker_info.Checkpoint_master_log_name
     *
     * @param checkpoint_master_log_name the value for slave_worker_info.Checkpoint_master_log_name
     *
     * @mbg.generated
     */
    public void setCheckpoint_master_log_name(String checkpoint_master_log_name) {
        this.checkpoint_master_log_name = checkpoint_master_log_name == null ? null : checkpoint_master_log_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column slave_worker_info.Checkpoint_group_bitmap
     *
     * @return the value of slave_worker_info.Checkpoint_group_bitmap
     *
     * @mbg.generated
     */
    public byte[] getCheckpoint_group_bitmap() {
        return checkpoint_group_bitmap;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column slave_worker_info.Checkpoint_group_bitmap
     *
     * @param checkpoint_group_bitmap the value for slave_worker_info.Checkpoint_group_bitmap
     *
     * @mbg.generated
     */
    public void setCheckpoint_group_bitmap(byte[] checkpoint_group_bitmap) {
        this.checkpoint_group_bitmap = checkpoint_group_bitmap;
    }
}