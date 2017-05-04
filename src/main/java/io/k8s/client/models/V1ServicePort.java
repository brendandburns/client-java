/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServicePort contains information on service's port.
 */
public class V1ServicePort {
    /**
     * The name of this port within the service. This must be a DNS_LABEL. All
     * ports within a ServiceSpec must have unique names. This maps to the
     * 'Name' field in EndpointPort objects. Optional if only one ServicePort
     * is defined on this service.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The port on each node on which this service is exposed when
     * type=NodePort or LoadBalancer. Usually assigned by the system. If
     * specified, it will be allocated to the service if unused or else
     * creation of the service will fail. Default is to auto-allocate a port if
     * the ServiceType of this Service requires one. More info:
     * http://kubernetes.io/docs/user-guide/services#type--nodeport.
     */
    @JsonProperty(value = "nodePort")
    private Integer nodePort;

    /**
     * The port that will be exposed by this service.
     */
    @JsonProperty(value = "port", required = true)
    private int port;

    /**
     * The IP protocol for this port. Supports "TCP" and "UDP". Default is TCP.
     */
    @JsonProperty(value = "protocol")
    private String protocol;

    /**
     * Number or name of the port to access on the pods targeted by the
     * service. Number must be in the range 1 to 65535. Name must be an
     * IANA_SVC_NAME. If this is a string, it will be looked up as a named port
     * in the target Pod's container ports. If this is not specified, the value
     * of the 'port' field is used (an identity map). This field is ignored for
     * services with clusterIP=None, and should be omitted or set equal to the
     * 'port' field. More info:
     * http://kubernetes.io/docs/user-guide/services#defining-a-service.
     */
    @JsonProperty(value = "targetPort")
    private String targetPort;

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
     * @return the V1ServicePort object itself.
     */
    public V1ServicePort withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the nodePort value.
     *
     * @return the nodePort value
     */
    public Integer nodePort() {
        return this.nodePort;
    }

    /**
     * Set the nodePort value.
     *
     * @param nodePort the nodePort value to set
     * @return the V1ServicePort object itself.
     */
    public V1ServicePort withNodePort(Integer nodePort) {
        this.nodePort = nodePort;
        return this;
    }

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
     * @return the V1ServicePort object itself.
     */
    public V1ServicePort withPort(int port) {
        this.port = port;
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
     * @return the V1ServicePort object itself.
     */
    public V1ServicePort withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the targetPort value.
     *
     * @return the targetPort value
     */
    public String targetPort() {
        return this.targetPort;
    }

    /**
     * Set the targetPort value.
     *
     * @param targetPort the targetPort value to set
     * @return the V1ServicePort object itself.
     */
    public V1ServicePort withTargetPort(String targetPort) {
        this.targetPort = targetPort;
        return this;
    }

}