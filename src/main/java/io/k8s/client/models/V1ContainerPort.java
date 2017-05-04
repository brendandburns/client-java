/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContainerPort represents a network port in a single container.
 */
public class V1ContainerPort {
    /**
     * Number of port to expose on the pod's IP address. This must be a valid
     * port number, 0 &lt; x &lt; 65536.
     */
    @JsonProperty(value = "containerPort", required = true)
    private int containerPort;

    /**
     * What host IP to bind the external port to.
     */
    @JsonProperty(value = "hostIP")
    private String hostIP;

    /**
     * Number of port to expose on the host. If specified, this must be a valid
     * port number, 0 &lt; x &lt; 65536. If HostNetwork is specified, this must
     * match ContainerPort. Most containers do not need this.
     */
    @JsonProperty(value = "hostPort")
    private Integer hostPort;

    /**
     * If specified, this must be an IANA_SVC_NAME and unique within the pod.
     * Each named port in a pod must have a unique name. Name for the port that
     * can be referred to by services.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Protocol for port. Must be UDP or TCP. Defaults to "TCP".
     */
    @JsonProperty(value = "protocol")
    private String protocol;

    /**
     * Get the containerPort value.
     *
     * @return the containerPort value
     */
    public int containerPort() {
        return this.containerPort;
    }

    /**
     * Set the containerPort value.
     *
     * @param containerPort the containerPort value to set
     * @return the V1ContainerPort object itself.
     */
    public V1ContainerPort withContainerPort(int containerPort) {
        this.containerPort = containerPort;
        return this;
    }

    /**
     * Get the hostIP value.
     *
     * @return the hostIP value
     */
    public String hostIP() {
        return this.hostIP;
    }

    /**
     * Set the hostIP value.
     *
     * @param hostIP the hostIP value to set
     * @return the V1ContainerPort object itself.
     */
    public V1ContainerPort withHostIP(String hostIP) {
        this.hostIP = hostIP;
        return this;
    }

    /**
     * Get the hostPort value.
     *
     * @return the hostPort value
     */
    public Integer hostPort() {
        return this.hostPort;
    }

    /**
     * Set the hostPort value.
     *
     * @param hostPort the hostPort value to set
     * @return the V1ContainerPort object itself.
     */
    public V1ContainerPort withHostPort(Integer hostPort) {
        this.hostPort = hostPort;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the V1ContainerPort object itself.
     */
    public V1ContainerPort withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the protocol value.
     *
     * @return the protocol value
     */
    public String protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol value.
     *
     * @param protocol the protocol value to set
     * @return the V1ContainerPort object itself.
     */
    public V1ContainerPort withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

}