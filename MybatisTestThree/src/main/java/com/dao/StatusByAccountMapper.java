package com.dao;

import com.entity.StatusByAccount;
import java.util.List;

public interface StatusByAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_by_account
     *
     * @mbg.generated
     */
    int insert(StatusByAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table status_by_account
     *
     * @mbg.generated
     */
    List<StatusByAccount> selectAll();
}