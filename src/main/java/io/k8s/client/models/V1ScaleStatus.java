/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ScaleStatus represents the current status of a scale subresource.
 */
public class V1ScaleStatus {
    /**
     * actual number of observed instances of the scaled object.
     */
    @JsonProperty(value = "replicas", required = true)
    private int replicas;

    /**
     * label query over pods that should match the replicas count. This is same
     * as the label selector but in the string format to avoid introspection by
     * clients. The string will be in the same format as the query-param
     * syntax. More info about label selectors:
     * http://kubernetes.io/docs/user-guide/labels#label-selectors.
     */
    @JsonProperty(value = "selector")
    private String selector;

    /**
     * Get the replicas value.
     *
     * @return the replicas value
     */
    public int replicas() {
        return this.replicas;
    }

    /**
     * Set the replicas value.
     *
     * @param replicas the replicas value to set
     * @return the V1ScaleStatus object itself.
     */
    public V1ScaleStatus withReplicas(int replicas) {
        this.replicas = replicas;
        return this;
    }

    /**
     * Get the selector value.
     *
     * @return the selector value
     */
    public String selector() {
        return this.selector;
    }

    /**
     * Set the selector value.
     *
     * @param selector the selector value to set
     * @return the V1ScaleStatus object itself.
     */
    public V1ScaleStatus withSelector(String selector) {
        this.selector = selector;
        return this;
    }

}