package com.dao;

import com.entity.InnodbLockWaits;
import java.util.List;

public interface InnodbLockWaitsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_lock_waits
     *
     * @mbg.generated
     */
    int insert(InnodbLockWaits record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_lock_waits
     *
     * @mbg.generated
     */
    List<InnodbLockWaits> selectAll();
}