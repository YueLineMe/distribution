package com.dao;

import com.entity.InnodbFtConfig;
import java.util.List;

public interface InnodbFtConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_CONFIG
     *
     * @mbg.generated
     */
    int insert(InnodbFtConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INNODB_FT_CONFIG
     *
     * @mbg.generated
     */
    List<InnodbFtConfig> selectAll();
}