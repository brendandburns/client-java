/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ObjectMetricStatus indicates the current value of a metric describing a
 * kubernetes object (for example, hits-per-second on an Ingress object).
 */
public class V2alpha1ObjectMetricStatus {
    /**
     * currentValue is the current value of the metric (as a quantity).
     */
    @JsonProperty(value = "currentValue", required = true)
    private String currentValue;

    /**
     * metricName is the name of the metric in question.
     */
    @JsonProperty(value = "metricName", required = true)
    private String metricName;

    /**
     * target is the described Kubernetes object.
     */
    @JsonProperty(value = "target", required = true)
    private V2alpha1CrossVersionObjectReference target;

    /**
     * Get the currentValue value.
     *
     * @return the currentValue value
     */
    public String currentValue() {
        return this.currentValue;
    }

    /**
     * Set the currentValue value.
     *
     * @param currentValue the currentValue value to set
     * @return the V2alpha1ObjectMetricStatus object itself.
     */
    public V2alpha1ObjectMetricStatus withCurrentValue(String currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    /**
     * Get the metricName value.
     *
     * @return the metricName value
     */
    public String metricName() {
        return this.metricName;
    }

    /**
     * Set the metricName value.
     *
     * @param metricName the metricName value to set
     * @return the V2alpha1ObjectMetricStatus object itself.
     */
    public V2alpha1ObjectMetricStatus withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * Get the target value.
     *
     * @return the target value
     */
    public V2alpha1CrossVersionObjectReference target() {
        return this.target;
    }

    /**
     * Set the target value.
     *
     * @param target the target value to set
     * @return the V2alpha1ObjectMetricStatus object itself.
     */
    public V2alpha1ObjectMetricStatus withTarget(V2alpha1CrossVersionObjectReference target) {
        this.target = target;
        return this;
    }

}
