/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.Map;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PodDisruptionBudgetStatus represents information about the status of a
 * PodDisruptionBudget. Status may trail the actual state of a system.
 */
public class V1beta1PodDisruptionBudgetStatus {
    /**
     * current number of healthy pods.
     */
    @JsonProperty(value = "currentHealthy", required = true)
    private int currentHealthy;

    /**
     * minimum desired number of healthy pods.
     */
    @JsonProperty(value = "desiredHealthy", required = true)
    private int desiredHealthy;

    /**
     * DisruptedPods contains information about pods whose eviction was
     * processed by the API server eviction subresource handler but has not yet
     * been observed by the PodDisruptionBudget controller. A pod will be in
     * this map from the time when the API server processed the eviction
     * request to the time when the pod is seen by PDB controller as having
     * been marked for deletion (or after a timeout). The key in the map is the
     * name of the pod and the value is the time when the API server processed
     * the eviction request. If the deletion didn't occur and a pod is still
     * there it will be removed from the list automatically by
     * PodDisruptionBudget controller after some time. If everything goes
     * smooth this map should be empty for the most of the time. Large number
     * of entries in the map may indicate problems with pod deletions.
     */
    @JsonProperty(value = "disruptedPods", required = true)
    private Map<String, DateTime> disruptedPods;

    /**
     * Number of pod disruptions that are currently allowed.
     */
    @JsonProperty(value = "disruptionsAllowed", required = true)
    private int disruptionsAllowed;

    /**
     * total number of pods counted by this disruption budget.
     */
    @JsonProperty(value = "expectedPods", required = true)
    private int expectedPods;

    /**
     * Most recent generation observed when updating this PDB status.
     * PodDisruptionsAllowed and other status informatio is valid only if
     * observedGeneration equals to PDB's object generation.
     */
    @JsonProperty(value = "observedGeneration")
    private Long observedGeneration;

    /**
     * Get the currentHealthy value.
     *
     * @return the currentHealthy value
     */
    public int currentHealthy() {
        return this.currentHealthy;
    }

    /**
     * Set the currentHealthy value.
     *
     * @param currentHealthy the currentHealthy value to set
     * @return the V1beta1PodDisruptionBudgetStatus object itself.
     */
    public V1beta1PodDisruptionBudgetStatus withCurrentHealthy(int currentHealthy) {
        this.currentHealthy = currentHealthy;
        return this;
    }

    /**
     * Get the desiredHealthy value.
     *
     * @return the desiredHealthy value
     */
    public int desiredHealthy() {
        return this.desiredHealthy;
    }

    /**
     * Set the desiredHealthy value.
     *
     * @param desiredHealthy the desiredHealthy value to set
     * @return the V1beta1PodDisruptionBudgetStatus object itself.
     */
    public V1beta1PodDisruptionBudgetStatus withDesiredHealthy(int desiredHealthy) {
        this.desiredHealthy = desiredHealthy;
        return this;
    }

    /**
     * Get the disruptedPods value.
     *
     * @return the disruptedPods value
     */
    public Map<String, DateTime> disruptedPods() {
        return this.disruptedPods;
    }

    /**
     * Set the disruptedPods value.
     *
     * @param disruptedPods the disruptedPods value to set
     * @return the V1beta1PodDisruptionBudgetStatus object itself.
     */
    public V1beta1PodDisruptionBudgetStatus withDisruptedPods(Map<String, DateTime> disruptedPods) {
        this.disruptedPods = disruptedPods;
        return this;
    }

    /**
     * Get the disruptionsAllowed value.
     *
     * @return the disruptionsAllowed value
     */
    public int disruptionsAllowed() {
        return this.disruptionsAllowed;
    }

    /**
     * Set the disruptionsAllowed value.
     *
     * @param disruptionsAllowed the disruptionsAllowed value to set
     * @return the V1beta1PodDisruptionBudgetStatus object itself.
     */
    public V1beta1PodDisruptionBudgetStatus withDisruptionsAllowed(int disruptionsAllowed) {
        this.disruptionsAllowed = disruptionsAllowed;
        return this;
    }

    /**
     * Get the expectedPods value.
     *
     * @return the expectedPods value
     */
    public int expectedPods() {
        return this.expectedPods;
    }

    /**
     * Set the expectedPods value.
     *
     * @param expectedPods the expectedPods value to set
     * @return the V1beta1PodDisruptionBudgetStatus object itself.
     */
    public V1beta1PodDisruptionBudgetStatus withExpectedPods(int expectedPods) {
        this.expectedPods = expectedPods;
        return this;
    }

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
     * @return the V1beta1PodDisruptionBudgetStatus object itself.
     */
    public V1beta1PodDisruptionBudgetStatus withObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

}