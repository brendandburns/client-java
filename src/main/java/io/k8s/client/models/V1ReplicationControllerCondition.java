/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReplicationControllerCondition describes the state of a replication
 * controller at a certain point.
 */
public class V1ReplicationControllerCondition {
    /**
     * The last time the condition transitioned from one status to another.
     */
    @JsonProperty(value = "lastTransitionTime")
    private DateTime lastTransitionTime;

    /**
     * A human readable message indicating details about the transition.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * The reason for the condition's last transition.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Status of the condition, one of True, False, Unknown.
     */
    @JsonProperty(value = "status", required = true)
    private String status;

    /**
     * Type of replication controller condition.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Get the lastTransitionTime value.
     *
     * @return the lastTransitionTime value
     */
    public DateTime lastTransitionTime() {
        return this.lastTransitionTime;
    }

    /**
     * Set the lastTransitionTime value.
     *
     * @param lastTransitionTime the lastTransitionTime value to set
     * @return the V1ReplicationControllerCondition object itself.
     */
    public V1ReplicationControllerCondition withLastTransitionTime(DateTime lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the V1ReplicationControllerCondition object itself.
     */
    public V1ReplicationControllerCondition withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the reason value.
     *
     * @return the reason value
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason value.
     *
     * @param reason the reason value to set
     * @return the V1ReplicationControllerCondition object itself.
     */
    public V1ReplicationControllerCondition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the V1ReplicationControllerCondition object itself.
     */
    public V1ReplicationControllerCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the V1ReplicationControllerCondition object itself.
     */
    public V1ReplicationControllerCondition withType(String type) {
        this.type = type;
        return this;
    }

}
