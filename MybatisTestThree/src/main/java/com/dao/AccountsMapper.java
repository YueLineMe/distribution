package com.dao;

import com.entity.Accounts;
import java.util.List;

public interface AccountsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounts
     *
     * @mbg.generated
     */
    int insert(Accounts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounts
     *
     * @mbg.generated
     */
    List<Accounts> selectAll();
}