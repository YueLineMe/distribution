package com.entity;

import java.math.BigDecimal;

public class XMemoryGlobalTotal {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$memory_global_total.total_allocated
     *
     * @mbg.generated
     */
    private BigDecimal total_allocated;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$memory_global_total.total_allocated
     *
     * @return the value of x$memory_global_total.total_allocated
     *
     * @mbg.generated
     */
    public BigDecimal getTotal_allocated() {
        return total_allocated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$memory_global_total.total_allocated
     *
     * @param total_allocated the value for x$memory_global_total.total_allocated
     *
     * @mbg.generated
     */
    public void setTotal_allocated(BigDecimal total_allocated) {
        this.total_allocated = total_allocated;
    }
}