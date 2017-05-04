/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DaemonEndpoint contains information about a single Daemon endpoint.
 */
public class V1DaemonEndpoint {
    /**
     * Port number of the given endpoint.
     */
    @JsonProperty(value = "Port", required = true)
    private int port;

    /**
     * Get the port value.
     *
     * @return the port value
     */
    public int port() {
        return this.port;
    }

    /**
     * Set the port value.
     *
     * @param port the port value to set
     * @return the V1DaemonEndpoint object itself.
     */
    public V1DaemonEndpoint withPort(int port) {
        this.port = port;
        return this;
    }

}