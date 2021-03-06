package com.entity;

public class InnodbTableStatsKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_table_stats.database_name
     *
     * @mbg.generated
     */
    private String database_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column innodb_table_stats.table_name
     *
     * @mbg.generated
     */
    private String table_name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_table_stats.database_name
     *
     * @return the value of innodb_table_stats.database_name
     *
     * @mbg.generated
     */
    public String getDatabase_name() {
        return database_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_table_stats.database_name
     *
     * @param database_name the value for innodb_table_stats.database_name
     *
     * @mbg.generated
     */
    public void setDatabase_name(String database_name) {
        this.database_name = database_name == null ? null : database_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column innodb_table_stats.table_name
     *
     * @return the value of innodb_table_stats.table_name
     *
     * @mbg.generated
     */
    public String getTable_name() {
        return table_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column innodb_table_stats.table_name
     *
     * @param table_name the value for innodb_table_stats.table_name
     *
     * @mbg.generated
     */
    public void setTable_name(String table_name) {
        this.table_name = table_name == null ? null : table_name.trim();
    }
}