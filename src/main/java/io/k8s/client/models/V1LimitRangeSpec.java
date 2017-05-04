/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LimitRangeSpec defines a min/max usage limit for resources that match on
 * kind.
 */
public class V1LimitRangeSpec {
    /**
     * Limits is the list of LimitRangeItem objects that are enforced.
     */
    @JsonProperty(value = "limits", required = true)
    private List<V1LimitRangeItem> limits;

    /**
     * Get the limits value.
     *
     * @return the limits value
     */
    public List<V1LimitRangeItem> limits() {
        return this.limits;
    }

    /**
     * Set the limits value.
     *
     * @param limits the limits value to set
     * @return the V1LimitRangeSpec object itself.
     */
    public V1LimitRangeSpec withLimits(List<V1LimitRangeItem> limits) {
        this.limits = limits;
        return this;
    }

}
