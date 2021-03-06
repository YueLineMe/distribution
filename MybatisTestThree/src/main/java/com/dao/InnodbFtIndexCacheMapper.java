package com.dao;

import com.entity.InnodbFtIndexCache;
import java.util.List;

public interface InnodbFtIndexCacheMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_INDEX_CACHE
     *
     * @mbg.generated
     */
    int insert(InnodbFtIndexCache record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_INDEX_CACHE
     *
     * @mbg.generated
     */
    List<InnodbFtIndexCache> selectAll();
}