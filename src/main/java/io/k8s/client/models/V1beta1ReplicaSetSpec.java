/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReplicaSetSpec is the specification of a ReplicaSet.
 */
public class V1beta1ReplicaSetSpec {
    /**
     * Minimum number of seconds for which a newly created pod should be ready
     * without any of its container crashing, for it to be considered
     * available. Defaults to 0 (pod will be considered available as soon as it
     * is ready).
     */
    @JsonProperty(value = "minReadySeconds")
    private Integer minReadySeconds;

    /**
     * Replicas is the number of desired replicas. This is a pointer to
     * distinguish between explicit zero and unspecified. Defaults to 1. More
     * info:
     * http://kubernetes.io/docs/user-guide/replication-controller#what-is-a-replication-controller.
     */
    @JsonProperty(value = "replicas")
    private Integer replicas;

    /**
     * Selector is a label query over pods that should match the replica count.
     * If the selector is empty, it is defaulted to the labels present on the
     * pod template. Label keys and values that must match in order to be
     * controlled by this replica set. More info:
     * http://kubernetes.io/docs/user-guide/labels#label-selectors.
     */
    @JsonProperty(value = "selector")
    private V1LabelSelector selector;

    /**
     * Template is the object that describes the pod that will be created if
     * insufficient replicas are detected. More info:
     * http://kubernetes.io/docs/user-guide/replication-controller#pod-template.
     */
    @JsonProperty(value = "template")
    private V1PodTemplateSpec template;

    /**
     * Get the minReadySeconds value.
     *
     * @return the minReadySeconds value
     */
    public Integer minReadySeconds() {
        return this.minReadySeconds;
    }

    /**
     * Set the minReadySeconds value.
     *
     * @param minReadySeconds the minReadySeconds value to set
     * @return the V1beta1ReplicaSetSpec object itself.
     */
    public V1beta1ReplicaSetSpec withMinReadySeconds(Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
        return this;
    }

    /**
     * Get the replicas value.
     *
     * @return the replicas value
     */
    public Integer replicas() {
        return this.replicas;
    }

    /**
     * Set the replicas value.
     *
     * @param replicas the replicas value to set
     * @return the V1beta1ReplicaSetSpec object itself.
     */
    public V1beta1ReplicaSetSpec withReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    /**
     * Get the selector value.
     *
     * @return the selector value
     */
    public V1LabelSelector selector() {
        return this.selector;
    }

    /**
     * Set the selector value.
     *
     * @param selector the selector value to set
     * @return the V1beta1ReplicaSetSpec object itself.
     */
    public V1beta1ReplicaSetSpec withSelector(V1LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    /**
     * Get the template value.
     *
     * @return the template value
     */
    public V1PodTemplateSpec template() {
        return this.template;
    }

    /**
     * Set the template value.
     *
     * @param template the template value to set
     * @return the V1beta1ReplicaSetSpec object itself.
     */
    public V1beta1ReplicaSetSpec withTemplate(V1PodTemplateSpec template) {
        this.template = template;
        return this;
    }

}
