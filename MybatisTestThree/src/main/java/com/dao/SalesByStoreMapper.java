package com.dao;

import com.entity.SalesByStore;
import java.util.List;

public interface SalesByStoreMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_by_store
     *
     * @mbg.generated
     */
    int insert(SalesByStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_by_store
     *
     * @mbg.generated
     */
    List<SalesByStore> selectAll();
}