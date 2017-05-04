/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EndpointAddress is a tuple that describes single IP address.
 */
public class V1EndpointAddress {
    /**
     * The Hostname of this endpoint.
     */
    @JsonProperty(value = "hostname")
    private String hostname;

    /**
     * The IP of this endpoint. May not be loopback (127.0.0.0/8), link-local
     * (169.254.0.0/16), or link-local multicast ((224.0.0.0/24). IPv6 is also
     * accepted but not fully supported on all platforms. Also, certain
     * kubernetes components, like kube-proxy, are not IPv6 ready.
     */
    @JsonProperty(value = "ip", required = true)
    private String ip;

    /**
     * Optional: Node hosting this endpoint. This can be used to determine
     * endpoints local to a node.
     */
    @JsonProperty(value = "nodeName")
    private String nodeName;

    /**
     * Reference to object providing the endpoint.
     */
    @JsonProperty(value = "targetRef")
    private V1ObjectReference targetRef;

    /**
     * Get the hostname value.
     *
     * @return the hostname value
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname value.
     *
     * @param hostname the hostname value to set
     * @return the V1EndpointAddress object itself.
     */
    public V1EndpointAddress withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the ip value.
     *
     * @return the ip value
     */
    public String ip() {
        return this.ip;
    }

    /**
     * Set the ip value.
     *
     * @param ip the ip value to set
     * @return the V1EndpointAddress object itself.
     */
    public V1EndpointAddress withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * Get the nodeName value.
     *
     * @return the nodeName value
     */
    public String nodeName() {
        return this.nodeName;
    }

    /**
     * Set the nodeName value.
     *
     * @param nodeName the nodeName value to set
     * @return the V1EndpointAddress object itself.
     */
    public V1EndpointAddress withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * Get the targetRef value.
     *
     * @return the targetRef value
     */
    public V1ObjectReference targetRef() {
        return this.targetRef;
    }

    /**
     * Set the targetRef value.
     *
     * @param targetRef the targetRef value to set
     * @return the V1EndpointAddress object itself.
     */
    public V1EndpointAddress withTargetRef(V1ObjectReference targetRef) {
        this.targetRef = targetRef;
        return this;
    }

}
