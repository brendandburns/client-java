/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StatefulSetStatus represents the current state of a StatefulSet.
 */
public class V1beta1StatefulSetStatus {
    /**
     * most recent generation observed by this StatefulSet.
     */
    @JsonProperty(value = "observedGeneration")
    private Long observedGeneration;

    /**
     * Replicas is the number of actual replicas.
     */
    @JsonProperty(value = "replicas", required = true)
    private int replicas;

    /**
     * Get the observedGeneration value.
     *
     * @return the observedGeneration value
     */
    public Long observedGeneration() {
        return this.observedGeneration;
    }

    /**
     * Set the observedGeneration value.
     *
     * @param observedGeneration the observedGeneration value to set
     * @return the V1beta1StatefulSetStatus object itself.
     */
    public V1beta1StatefulSetStatus withObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

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
     * @return the V1beta1StatefulSetStatus object itself.
     */
    public V1beta1StatefulSetStatus withReplicas(int replicas) {
        this.replicas = replicas;
        return this;
    }

}
