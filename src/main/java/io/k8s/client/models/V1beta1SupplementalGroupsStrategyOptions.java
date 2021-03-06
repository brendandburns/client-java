/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SupplementalGroupsStrategyOptions defines the strategy type and options used
 * to create the strategy.
 */
public class V1beta1SupplementalGroupsStrategyOptions {
    /**
     * Ranges are the allowed ranges of supplemental groups.  If you would like
     * to force a single supplemental group then supply a single range with the
     * same start and end.
     */
    @JsonProperty(value = "ranges")
    private List<V1beta1IDRange> ranges;

    /**
     * Rule is the strategy that will dictate what supplemental groups is used
     * in the SecurityContext.
     */
    @JsonProperty(value = "rule")
    private String rule;

    /**
     * Get the ranges value.
     *
     * @return the ranges value
     */
    public List<V1beta1IDRange> ranges() {
        return this.ranges;
    }

    /**
     * Set the ranges value.
     *
     * @param ranges the ranges value to set
     * @return the V1beta1SupplementalGroupsStrategyOptions object itself.
     */
    public V1beta1SupplementalGroupsStrategyOptions withRanges(List<V1beta1IDRange> ranges) {
        this.ranges = ranges;
        return this;
    }

    /**
     * Get the rule value.
     *
     * @return the rule value
     */
    public String rule() {
        return this.rule;
    }

    /**
     * Set the rule value.
     *
     * @param rule the rule value to set
     * @return the V1beta1SupplementalGroupsStrategyOptions object itself.
     */
    public V1beta1SupplementalGroupsStrategyOptions withRule(String rule) {
        this.rule = rule;
        return this;
    }

}
