/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContainerStateWaiting is a waiting state of a container.
 */
public class V1ContainerStateWaiting {
    /**
     * Message regarding why the container is not yet running.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * (brief) reason the container is not yet running.
     */
    @JsonProperty(value = "reason")
    private String reason;

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
     * @return the V1ContainerStateWaiting object itself.
     */
    public V1ContainerStateWaiting withMessage(String message) {
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
     * @return the V1ContainerStateWaiting object itself.
     */
    public V1ContainerStateWaiting withReason(String reason) {
        this.reason = reason;
        return this;
    }

}
