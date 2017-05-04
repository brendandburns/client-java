/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HorizontalPodAutoscalerStatus describes the current status of a horizontal
 * pod autoscaler.
 */
public class V2alpha1HorizontalPodAutoscalerStatus {
    /**
     * currentMetrics is the last read state of the metrics used by this
     * autoscaler.
     */
    @JsonProperty(value = "currentMetrics", required = true)
    private List<V2alpha1MetricStatus> currentMetrics;

    /**
     * currentReplicas is current number of replicas of pods managed by this
     * autoscaler, as last seen by the autoscaler.
     */
    @JsonProperty(value = "currentReplicas", required = true)
    private int currentReplicas;

    /**
     * desiredReplicas is the desired number of replicas of pods managed by
     * this autoscaler, as last calculated by the autoscaler.
     */
    @JsonProperty(value = "desiredReplicas", required = true)
    private int desiredReplicas;

    /**
     * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the
     * number of pods, used by the autoscaler to control how often the number
     * of pods is changed.
     */
    @JsonProperty(value = "lastScaleTime")
    private DateTime lastScaleTime;

    /**
     * observedGeneration is the most recent generation observed by this
     * autoscaler.
     */
    @JsonProperty(value = "observedGeneration")
    private Long observedGeneration;

    /**
     * Get the currentMetrics value.
     *
     * @return the currentMetrics value
     */
    public List<V2alpha1MetricStatus> currentMetrics() {
        return this.currentMetrics;
    }

    /**
     * Set the currentMetrics value.
     *
     * @param currentMetrics the currentMetrics value to set
     * @return the V2alpha1HorizontalPodAutoscalerStatus object itself.
     */
    public V2alpha1HorizontalPodAutoscalerStatus withCurrentMetrics(List<V2alpha1MetricStatus> currentMetrics) {
        this.currentMetrics = currentMetrics;
        return this;
    }

    /**
     * Get the currentReplicas value.
     *
     * @return the currentReplicas value
     */
    public int currentReplicas() {
        return this.currentReplicas;
    }

    /**
     * Set the currentReplicas value.
     *
     * @param currentReplicas the currentReplicas value to set
     * @return the V2alpha1HorizontalPodAutoscalerStatus object itself.
     */
    public V2alpha1HorizontalPodAutoscalerStatus withCurrentReplicas(int currentReplicas) {
        this.currentReplicas = currentReplicas;
        return this;
    }

    /**
     * Get the desiredReplicas value.
     *
     * @return the desiredReplicas value
     */
    public int desiredReplicas() {
        return this.desiredReplicas;
    }

    /**
     * Set the desiredReplicas value.
     *
     * @param desiredReplicas the desiredReplicas value to set
     * @return the V2alpha1HorizontalPodAutoscalerStatus object itself.
     */
    public V2alpha1HorizontalPodAutoscalerStatus withDesiredReplicas(int desiredReplicas) {
        this.desiredReplicas = desiredReplicas;
        return this;
    }

    /**
     * Get the lastScaleTime value.
     *
     * @return the lastScaleTime value
     */
    public DateTime lastScaleTime() {
        return this.lastScaleTime;
    }

    /**
     * Set the lastScaleTime value.
     *
     * @param lastScaleTime the lastScaleTime value to set
     * @return the V2alpha1HorizontalPodAutoscalerStatus object itself.
     */
    public V2alpha1HorizontalPodAutoscalerStatus withLastScaleTime(DateTime lastScaleTime) {
        this.lastScaleTime = lastScaleTime;
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
     * @return the V2alpha1HorizontalPodAutoscalerStatus object itself.
     */
    public V2alpha1HorizontalPodAutoscalerStatus withObservedGeneration(Long observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }

}
