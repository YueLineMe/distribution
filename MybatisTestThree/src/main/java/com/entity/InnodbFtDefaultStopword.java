package com.entity;

public class InnodbFtDefaultStopword {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_FT_DEFAULT_STOPWORD.value
     *
     * @mbg.generated
     */
    private String value;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_FT_DEFAULT_STOPWORD.value
     *
     * @return the value of INNODB_FT_DEFAULT_STOPWORD.value
     *
     * @mbg.generated
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_FT_DEFAULT_STOPWORD.value
     *
     * @param value the value for INNODB_FT_DEFAULT_STOPWORD.value
     *
     * @mbg.generated
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}