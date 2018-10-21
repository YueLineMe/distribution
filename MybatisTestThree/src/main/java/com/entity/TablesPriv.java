package com.entity;

import java.util.Date;

public class TablesPriv {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tables_priv.Host
     *
     * @mbg.generated
     */
    private String host;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tables_priv.Db
     *
     * @mbg.generated
     */
    private String db;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tables_priv.User
     *
     * @mbg.generated
     */
    private String user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tables_priv.Table_name
     *
     * @mbg.generated
     */
    private String table_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tables_priv.Grantor
     *
     * @mbg.generated
     */
    private String grantor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tables_priv.Timestamp
     *
     * @mbg.generated
     */
    private Date timestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tables_priv.Table_priv
     *
     * @mbg.generated
     */
    private String table_priv;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tables_priv.Column_priv
     *
     * @mbg.generated
     */
    private String column_priv;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tables_priv.Host
     *
     * @return the value of tables_priv.Host
     *
     * @mbg.generated
     */
    public String getHost() {
        return host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tables_priv.Host
     *
     * @param host the value for tables_priv.Host
     *
     * @mbg.generated
     */
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tables_priv.Db
     *
     * @return the value of tables_priv.Db
     *
     * @mbg.generated
     */
    public String getDb() {
        return db;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tables_priv.Db
     *
     * @param db the value for tables_priv.Db
     *
     * @mbg.generated
     */
    public void setDb(String db) {
        this.db = db == null ? null : db.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tables_priv.User
     *
     * @return the value of tables_priv.User
     *
     * @mbg.generated
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tables_priv.User
     *
     * @param user the value for tables_priv.User
     *
     * @mbg.generated
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tables_priv.Table_name
     *
     * @return the value of tables_priv.Table_name
     *
     * @mbg.generated
     */
    public String getTable_name() {
        return table_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tables_priv.Table_name
     *
     * @param table_name the value for tables_priv.Table_name
     *
     * @mbg.generated
     */
    public void setTable_name(String table_name) {
        this.table_name = table_name == null ? null : table_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tables_priv.Grantor
     *
     * @return the value of tables_priv.Grantor
     *
     * @mbg.generated
     */
    public String getGrantor() {
        return grantor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tables_priv.Grantor
     *
     * @param grantor the value for tables_priv.Grantor
     *
     * @mbg.generated
     */
    public void setGrantor(String grantor) {
        this.grantor = grantor == null ? null : grantor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tables_priv.Timestamp
     *
     * @return the value of tables_priv.Timestamp
     *
     * @mbg.generated
     */
    public Date getTimestamp() {
        return timestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tables_priv.Timestamp
     *
     * @param timestamp the value for tables_priv.Timestamp
     *
     * @mbg.generated
     */
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tables_priv.Table_priv
     *
     * @return the value of tables_priv.Table_priv
     *
     * @mbg.generated
     */
    public String getTable_priv() {
        return table_priv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tables_priv.Table_priv
     *
     * @param table_priv the value for tables_priv.Table_priv
     *
     * @mbg.generated
     */
    public void setTable_priv(String table_priv) {
        this.table_priv = table_priv == null ? null : table_priv.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tables_priv.Column_priv
     *
     * @return the value of tables_priv.Column_priv
     *
     * @mbg.generated
     */
    public String getColumn_priv() {
        return column_priv;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tables_priv.Column_priv
     *
     * @param column_priv the value for tables_priv.Column_priv
     *
     * @mbg.generated
     */
    public void setColumn_priv(String column_priv) {
        this.column_priv = column_priv == null ? null : column_priv.trim();
    }
}