package com.dao;

import com.entity.XPsDigestAvgLatencyDistribution;
import java.util.List;

public interface XPsDigestAvgLatencyDistributionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$ps_digest_avg_latency_distribution
     *
     * @mbg.generated
     */
    int insert(XPsDigestAvgLatencyDistribution record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$ps_digest_avg_latency_distribution
     *
     * @mbg.generated
     */
    List<XPsDigestAvgLatencyDistribution> selectAll();
}