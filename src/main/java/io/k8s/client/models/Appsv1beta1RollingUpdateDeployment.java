/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Spec to control the desired behavior of rolling update.
 */
public class Appsv1beta1RollingUpdateDeployment {
    /**
     * The maximum number of pods that can be scheduled above the desired
     * number of pods. Value can be an absolute number (ex: 5) or a percentage
     * of desired pods (ex: 10%). This can not be 0 if MaxUnavailable is 0.
     * Absolute number is calculated from percentage by rounding up. Defaults
     * to 25%. Example: when this is set to 30%, the new RC can be scaled up
     * immediately when the rolling update starts, such that the total number
     * of old and new pods do not exceed 130% of desired pods. Once old pods
     * have been killed, new RC can be scaled up further, ensuring that total
     * number of pods running at any time during the update is atmost 130% of
     * desired pods.
     */
    @JsonProperty(value = "maxSurge")
    private String maxSurge;

    /**
     * The maximum number of pods that can be unavailable during the update.
     * Value can be an absolute number (ex: 5) or a percentage of desired pods
     * (ex: 10%). Absolute number is calculated from percentage by rounding
     * down. This can not be 0 if MaxSurge is 0. Defaults to 25%. Example: when
     * this is set to 30%, the old RC can be scaled down to 70% of desired pods
     * immediately when the rolling update starts. Once new pods are ready, old
     * RC can be scaled down further, followed by scaling up the new RC,
     * ensuring that the total number of pods available at all times during the
     * update is at least 70% of desired pods.
     */
    @JsonProperty(value = "maxUnavailable")
    private String maxUnavailable;

    /**
     * Get the maxSurge value.
     *
     * @return the maxSurge value
     */
    public String maxSurge() {
        return this.maxSurge;
    }

    /**
     * Set the maxSurge value.
     *
     * @param maxSurge the maxSurge value to set
     * @return the Appsv1beta1RollingUpdateDeployment object itself.
     */
    public Appsv1beta1RollingUpdateDeployment withMaxSurge(String maxSurge) {
        this.maxSurge = maxSurge;
        return this;
    }

    /**
     * Get the maxUnavailable value.
     *
     * @return the maxUnavailable value
     */
    public String maxUnavailable() {
        return this.maxUnavailable;
    }

    /**
     * Set the maxUnavailable value.
     *
     * @param maxUnavailable the maxUnavailable value to set
     * @return the Appsv1beta1RollingUpdateDeployment object itself.
     */
    public Appsv1beta1RollingUpdateDeployment withMaxUnavailable(String maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
        return this;
    }

}