/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ID Range provides a min/max of an allowed range of IDs.
 */
public class V1beta1IDRange {
    /**
     * Max is the end of the range, inclusive.
     */
    @JsonProperty(value = "max", required = true)
    private long max;

    /**
     * Min is the start of the range, inclusive.
     */
    @JsonProperty(value = "min", required = true)
    private long min;

    /**
     * Get the max value.
     *
     * @return the max value
     */
    public long max() {
        return this.max;
    }

    /**
     * Set the max value.
     *
     * @param max the max value to set
     * @return the V1beta1IDRange object itself.
     */
    public V1beta1IDRange withMax(long max) {
        this.max = max;
        return this;
    }

    /**
     * Get the min value.
     *
     * @return the min value
     */
    public long min() {
        return this.min;
    }

    /**
     * Set the min value.
     *
     * @param min the min value to set
     * @return the V1beta1IDRange object itself.
     */
    public V1beta1IDRange withMin(long min) {
        this.min = min;
        return this;
    }

}
