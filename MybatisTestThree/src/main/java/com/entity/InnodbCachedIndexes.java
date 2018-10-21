package com.entity;

public class InnodbCachedIndexes {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_CACHED_INDEXES.SPACE_ID
     *
     * @mbg.generated
     */
    private Integer SPACE_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_CACHED_INDEXES.INDEX_ID
     *
     * @mbg.generated
     */
    private Long INDEX_ID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column INNODB_CACHED_INDEXES.N_CACHED_PAGES
     *
     * @mbg.generated
     */
    private Long n_CACHED_PAGES;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_CACHED_INDEXES.SPACE_ID
     *
     * @return the value of INNODB_CACHED_INDEXES.SPACE_ID
     *
     * @mbg.generated
     */
    public Integer getSPACE_ID() {
        return SPACE_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_CACHED_INDEXES.SPACE_ID
     *
     * @param SPACE_ID the value for INNODB_CACHED_INDEXES.SPACE_ID
     *
     * @mbg.generated
     */
    public void setSPACE_ID(Integer SPACE_ID) {
        this.SPACE_ID = SPACE_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_CACHED_INDEXES.INDEX_ID
     *
     * @return the value of INNODB_CACHED_INDEXES.INDEX_ID
     *
     * @mbg.generated
     */
    public Long getINDEX_ID() {
        return INDEX_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_CACHED_INDEXES.INDEX_ID
     *
     * @param INDEX_ID the value for INNODB_CACHED_INDEXES.INDEX_ID
     *
     * @mbg.generated
     */
    public void setINDEX_ID(Long INDEX_ID) {
        this.INDEX_ID = INDEX_ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column INNODB_CACHED_INDEXES.N_CACHED_PAGES
     *
     * @return the value of INNODB_CACHED_INDEXES.N_CACHED_PAGES
     *
     * @mbg.generated
     */
    public Long getN_CACHED_PAGES() {
        return n_CACHED_PAGES;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column INNODB_CACHED_INDEXES.N_CACHED_PAGES
     *
     * @param n_CACHED_PAGES the value for INNODB_CACHED_INDEXES.N_CACHED_PAGES
     *
     * @mbg.generated
     */
    public void setN_CACHED_PAGES(Long n_CACHED_PAGES) {
        this.n_CACHED_PAGES = n_CACHED_PAGES;
    }
}