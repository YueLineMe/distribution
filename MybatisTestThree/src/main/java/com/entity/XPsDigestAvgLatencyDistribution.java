package com.entity;

import java.math.BigDecimal;

public class XPsDigestAvgLatencyDistribution {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$ps_digest_avg_latency_distribution.cnt
     *
     * @mbg.generated
     */
    private Long cnt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column x$ps_digest_avg_latency_distribution.avg_us
     *
     * @mbg.generated
     */
    private BigDecimal avg_us;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$ps_digest_avg_latency_distribution.cnt
     *
     * @return the value of x$ps_digest_avg_latency_distribution.cnt
     *
     * @mbg.generated
     */
    public Long getCnt() {
        return cnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$ps_digest_avg_latency_distribution.cnt
     *
     * @param cnt the value for x$ps_digest_avg_latency_distribution.cnt
     *
     * @mbg.generated
     */
    public void setCnt(Long cnt) {
        this.cnt = cnt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column x$ps_digest_avg_latency_distribution.avg_us
     *
     * @return the value of x$ps_digest_avg_latency_distribution.avg_us
     *
     * @mbg.generated
     */
    public BigDecimal getAvg_us() {
        return avg_us;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column x$ps_digest_avg_latency_distribution.avg_us
     *
     * @param avg_us the value for x$ps_digest_avg_latency_distribution.avg_us
     *
     * @mbg.generated
     */
    public void setAvg_us(BigDecimal avg_us) {
        this.avg_us = avg_us;
    }
}