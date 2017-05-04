/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContainerStateRunning is a running state of a container.
 */
public class V1ContainerStateRunning {
    /**
     * Time at which the container was last (re-)started.
     */
    @JsonProperty(value = "startedAt")
    private DateTime startedAt;

    /**
     * Get the startedAt value.
     *
     * @return the startedAt value
     */
    public DateTime startedAt() {
        return this.startedAt;
    }

    /**
     * Set the startedAt value.
     *
     * @param startedAt the startedAt value to set
     * @return the V1ContainerStateRunning object itself.
     */
    public V1ContainerStateRunning withStartedAt(DateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }

}
