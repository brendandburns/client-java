/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeploymentSpec is the specification of the desired behavior of the
 * Deployment.
 */
public class Extensionsv1beta1DeploymentSpec {
    /**
     * Minimum number of seconds for which a newly created pod should be ready
     * without any of its container crashing, for it to be considered
     * available. Defaults to 0 (pod will be considered available as soon as it
     * is ready).
     */
    @JsonProperty(value = "minReadySeconds")
    private Integer minReadySeconds;

    /**
     * Indicates that the deployment is paused and will not be processed by the
     * deployment controller.
     */
    @JsonProperty(value = "paused")
    private Boolean paused;

    /**
     * The maximum time in seconds for a deployment to make progress before it
     * is considered to be failed. The deployment controller will continue to
     * process failed deployments and a condition with a
     * ProgressDeadlineExceeded reason will be surfaced in the deployment
     * status. Once autoRollback is implemented, the deployment controller will
     * automatically rollback failed deployments. Note that progress will not
     * be estimated during the time a deployment is paused. This is not set by
     * default.
     */
    @JsonProperty(value = "progressDeadlineSeconds")
    private Integer progressDeadlineSeconds;

    /**
     * Number of desired pods. This is a pointer to distinguish between
     * explicit zero and not specified. Defaults to 1.
     */
    @JsonProperty(value = "replicas")
    private Integer replicas;

    /**
     * The number of old ReplicaSets to retain to allow rollback. This is a
     * pointer to distinguish between explicit zero and not specified.
     */
    @JsonProperty(value = "revisionHistoryLimit")
    private Integer revisionHistoryLimit;

    /**
     * The config this deployment is rolling back to. Will be cleared after
     * rollback is done.
     */
    @JsonProperty(value = "rollbackTo")
    private Extensionsv1beta1RollbackConfig rollbackTo;

    /**
     * Label selector for pods. Existing ReplicaSets whose pods are selected by
     * this will be the ones affected by this deployment.
     */
    @JsonProperty(value = "selector")
    private V1LabelSelector selector;

    /**
     * The deployment strategy to use to replace existing pods with new ones.
     */
    @JsonProperty(value = "strategy")
    private Extensionsv1beta1DeploymentStrategy strategy;

    /**
     * Template describes the pods that will be created.
     */
    @JsonProperty(value = "template", required = true)
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
     * @return the Extensionsv1beta1DeploymentSpec object itself.
     */
    public Extensionsv1beta1DeploymentSpec withMinReadySeconds(Integer minReadySeconds) {
        this.minReadySeconds = minReadySeconds;
        return this;
    }

    /**
     * Get the paused value.
     *
     * @return the paused value
     */
    public Boolean paused() {
        return this.paused;
    }

    /**
     * Set the paused value.
     *
     * @param paused the paused value to set
     * @return the Extensionsv1beta1DeploymentSpec object itself.
     */
    public Extensionsv1beta1DeploymentSpec withPaused(Boolean paused) {
        this.paused = paused;
        return this;
    }

    /**
     * Get the progressDeadlineSeconds value.
     *
     * @return the progressDeadlineSeconds value
     */
    public Integer progressDeadlineSeconds() {
        return this.progressDeadlineSeconds;
    }

    /**
     * Set the progressDeadlineSeconds value.
     *
     * @param progressDeadlineSeconds the progressDeadlineSeconds value to set
     * @return the Extensionsv1beta1DeploymentSpec object itself.
     */
    public Extensionsv1beta1DeploymentSpec withProgressDeadlineSeconds(Integer progressDeadlineSeconds) {
        this.progressDeadlineSeconds = progressDeadlineSeconds;
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
     * @return the Extensionsv1beta1DeploymentSpec object itself.
     */
    public Extensionsv1beta1DeploymentSpec withReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    /**
     * Get the revisionHistoryLimit value.
     *
     * @return the revisionHistoryLimit value
     */
    public Integer revisionHistoryLimit() {
        return this.revisionHistoryLimit;
    }

    /**
     * Set the revisionHistoryLimit value.
     *
     * @param revisionHistoryLimit the revisionHistoryLimit value to set
     * @return the Extensionsv1beta1DeploymentSpec object itself.
     */
    public Extensionsv1beta1DeploymentSpec withRevisionHistoryLimit(Integer revisionHistoryLimit) {
        this.revisionHistoryLimit = revisionHistoryLimit;
        return this;
    }

    /**
     * Get the rollbackTo value.
     *
     * @return the rollbackTo value
     */
    public Extensionsv1beta1RollbackConfig rollbackTo() {
        return this.rollbackTo;
    }

    /**
     * Set the rollbackTo value.
     *
     * @param rollbackTo the rollbackTo value to set
     * @return the Extensionsv1beta1DeploymentSpec object itself.
     */
    public Extensionsv1beta1DeploymentSpec withRollbackTo(Extensionsv1beta1RollbackConfig rollbackTo) {
        this.rollbackTo = rollbackTo;
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
     * @return the Extensionsv1beta1DeploymentSpec object itself.
     */
    public Extensionsv1beta1DeploymentSpec withSelector(V1LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    /**
     * Get the strategy value.
     *
     * @return the strategy value
     */
    public Extensionsv1beta1DeploymentStrategy strategy() {
        return this.strategy;
    }

    /**
     * Set the strategy value.
     *
     * @param strategy the strategy value to set
     * @return the Extensionsv1beta1DeploymentSpec object itself.
     */
    public Extensionsv1beta1DeploymentSpec withStrategy(Extensionsv1beta1DeploymentStrategy strategy) {
        this.strategy = strategy;
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
     * @return the Extensionsv1beta1DeploymentSpec object itself.
     */
    public Extensionsv1beta1DeploymentSpec withTemplate(V1PodTemplateSpec template) {
        this.template = template;
        return this;
    }

}
