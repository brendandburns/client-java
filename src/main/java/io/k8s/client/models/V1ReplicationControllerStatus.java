/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReplicationControllerStatus represents the current status of a replication
 * controller.
 */
public class V1ReplicationControllerStatus {
    /**
     * The number of available replicas (ready for at least minReadySeconds)
     * for this replication controller.
     */
    @JsonProperty(value = "availableReplicas")
    private Integer availableReplicas;

    /**
     * Represents the latest available observations of a replication
     * controller's current state.
     */
    @JsonProperty(value = "conditions")
    private List<V1ReplicationControllerCondition> conditions;

    /**
     * The number of pods that have labels matching the labels of the pod
     * template of the replication controller.
     */
    @JsonProperty(value = "fullyLabeledReplicas")
    private Integer fullyLabeledReplicas;

    /**
     * ObservedGeneration reflects the generation of the most recently observed
     * replication controller.
     */
    @JsonProperty(value = "observedGeneration")
    private Long observedGeneration;

    /**
     * The number of ready replicas for this replication controller.
     */
    @JsonProperty(value = "readyReplicas")
    private Integer readyReplicas;

    /**
     * Replicas is the most recently oberved number of replicas. More info:
     * http://kubernetes.io/docs/user-guide/replication-controller#what-is-a-replication-controller.
     */
    @JsonProperty(value = "replicas", required = true)
    private int replicas;

    /**
     * Get the availableReplicas value.
     *
     * @return the availableReplicas value
     */
    public Integer availableReplicas() {
        return this.availableReplicas;
    }

    /**
     * Set the availableReplicas value.
     *
     * @param availableReplicas the availableReplicas value to set
     * @return the V1ReplicationControllerStatus object itself.
     */
    public V1ReplicationControllerStatus withAvailableReplicas(Integer availableReplicas) {
        this.availableReplicas = availableReplicas;
        return this;
    }

    /**
     * Get the conditions value.
     *
     * @return the conditions value
     */
    public List<V1ReplicationControllerCondition> conditions() {
        return this.conditions;
    }

    /**
     * Set the conditions value.
     *
     * @param conditions the conditions value to set
     * @return the V1ReplicationControllerStatus object itself.
     */
    public V1ReplicationControllerStatus withConditions(List<V1ReplicationControllerCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Get the fullyLabeledReplicas value.
     *
     * @return the fullyLabeledReplicas value
     */
    public Integer fullyLabeledReplicas() {
        return this.fullyLabeledReplicas;
    }

    /**
     * Set the fullyLabeledReplicas value.
     *
     * @param fullyLabeledReplicas the fullyLabeledReplicas value to set
     * @return the V1ReplicationControllerStatus object itself.
     */
    public V1ReplicationControllerStatus withFullyLabeledReplicas(Integer fullyLabeledReplicas) {
        this.fullyLabeledReplicas = fullyLabeledReplicas;
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
     * @return the V1ReplicationControllerStatus object itself.
     */
    public V1ReplicationControllerStatus withObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

    /**
     * Get the readyReplicas value.
     *
     * @return the readyReplicas value
     */
    public Integer readyReplicas() {
        return this.readyReplicas;
    }

    /**
     * Set the readyReplicas value.
     *
     * @param readyReplicas the readyReplicas value to set
     * @return the V1ReplicationControllerStatus object itself.
     */
    public V1ReplicationControllerStatus withReadyReplicas(Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
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
     * @return the V1ReplicationControllerStatus object itself.
     */
    public V1ReplicationControllerStatus withReplicas(int replicas) {
        this.replicas = replicas;
        return this;
    }

}
