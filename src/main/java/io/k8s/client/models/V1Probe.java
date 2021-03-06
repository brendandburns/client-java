/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Probe describes a health check to be performed against a container to
 * determine whether it is alive or ready to receive traffic.
 */
public class V1Probe {
    /**
     * One and only one of the following should be specified. Exec specifies
     * the action to take.
     */
    @JsonProperty(value = "exec")
    private V1ExecAction exec;

    /**
     * Minimum consecutive failures for the probe to be considered failed after
     * having succeeded. Defaults to 3. Minimum value is 1.
     */
    @JsonProperty(value = "failureThreshold")
    private Integer failureThreshold;

    /**
     * HTTPGet specifies the http request to perform.
     */
    @JsonProperty(value = "httpGet")
    private V1HTTPGetAction httpGet;

    /**
     * Number of seconds after the container has started before liveness probes
     * are initiated. More info:
     * http://kubernetes.io/docs/user-guide/pod-states#container-probes.
     */
    @JsonProperty(value = "initialDelaySeconds")
    private Integer initialDelaySeconds;

    /**
     * How often (in seconds) to perform the probe. Default to 10 seconds.
     * Minimum value is 1.
     */
    @JsonProperty(value = "periodSeconds")
    private Integer periodSeconds;

    /**
     * Minimum consecutive successes for the probe to be considered successful
     * after having failed. Defaults to 1. Must be 1 for liveness. Minimum
     * value is 1.
     */
    @JsonProperty(value = "successThreshold")
    private Integer successThreshold;

    /**
     * TCPSocket specifies an action involving a TCP port. TCP hooks not yet
     * supported.
     */
    @JsonProperty(value = "tcpSocket")
    private V1TCPSocketAction tcpSocket;

    /**
     * Number of seconds after which the probe times out. Defaults to 1 second.
     * Minimum value is 1. More info:
     * http://kubernetes.io/docs/user-guide/pod-states#container-probes.
     */
    @JsonProperty(value = "timeoutSeconds")
    private Integer timeoutSeconds;

    /**
     * Get the exec value.
     *
     * @return the exec value
     */
    public V1ExecAction exec() {
        return this.exec;
    }

    /**
     * Set the exec value.
     *
     * @param exec the exec value to set
     * @return the V1Probe object itself.
     */
    public V1Probe withExec(V1ExecAction exec) {
        this.exec = exec;
        return this;
    }

    /**
     * Get the failureThreshold value.
     *
     * @return the failureThreshold value
     */
    public Integer failureThreshold() {
        return this.failureThreshold;
    }

    /**
     * Set the failureThreshold value.
     *
     * @param failureThreshold the failureThreshold value to set
     * @return the V1Probe object itself.
     */
    public V1Probe withFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    /**
     * Get the httpGet value.
     *
     * @return the httpGet value
     */
    public V1HTTPGetAction httpGet() {
        return this.httpGet;
    }

    /**
     * Set the httpGet value.
     *
     * @param httpGet the httpGet value to set
     * @return the V1Probe object itself.
     */
    public V1Probe withHttpGet(V1HTTPGetAction httpGet) {
        this.httpGet = httpGet;
        return this;
    }

    /**
     * Get the initialDelaySeconds value.
     *
     * @return the initialDelaySeconds value
     */
    public Integer initialDelaySeconds() {
        return this.initialDelaySeconds;
    }

    /**
     * Set the initialDelaySeconds value.
     *
     * @param initialDelaySeconds the initialDelaySeconds value to set
     * @return the V1Probe object itself.
     */
    public V1Probe withInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }

    /**
     * Get the periodSeconds value.
     *
     * @return the periodSeconds value
     */
    public Integer periodSeconds() {
        return this.periodSeconds;
    }

    /**
     * Set the periodSeconds value.
     *
     * @param periodSeconds the periodSeconds value to set
     * @return the V1Probe object itself.
     */
    public V1Probe withPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    /**
     * Get the successThreshold value.
     *
     * @return the successThreshold value
     */
    public Integer successThreshold() {
        return this.successThreshold;
    }

    /**
     * Set the successThreshold value.
     *
     * @param successThreshold the successThreshold value to set
     * @return the V1Probe object itself.
     */
    public V1Probe withSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }

    /**
     * Get the tcpSocket value.
     *
     * @return the tcpSocket value
     */
    public V1TCPSocketAction tcpSocket() {
        return this.tcpSocket;
    }

    /**
     * Set the tcpSocket value.
     *
     * @param tcpSocket the tcpSocket value to set
     * @return the V1Probe object itself.
     */
    public V1Probe withTcpSocket(V1TCPSocketAction tcpSocket) {
        this.tcpSocket = tcpSocket;
        return this;
    }

    /**
     * Get the timeoutSeconds value.
     *
     * @return the timeoutSeconds value
     */
    public Integer timeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * Set the timeoutSeconds value.
     *
     * @param timeoutSeconds the timeoutSeconds value to set
     * @return the V1Probe object itself.
     */
    public V1Probe withTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

}
