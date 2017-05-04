/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DaemonSet represents the configuration of a daemon set.
 */
public class V1beta1DaemonSet {
    /**
     * APIVersion defines the versioned schema of this representation of an
     * object. Servers should convert recognized schemas to the latest internal
     * value, and may reject unrecognized values. More info:
     * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#resources.
     */
    @JsonProperty(value = "apiVersion")
    private String apiVersion;

    /**
     * Kind is a string value representing the REST resource this object
     * represents. Servers may infer this from the endpoint the client submits
     * requests to. Cannot be updated. In CamelCase. More info:
     * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Standard object's metadata. More info:
     * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#metadata.
     */
    @JsonProperty(value = "metadata")
    private V1ObjectMeta metadata;

    /**
     * The desired behavior of this daemon set. More info:
     * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#spec-and-status.
     */
    @JsonProperty(value = "spec")
    private V1beta1DaemonSetSpec spec;

    /**
     * The current status of this daemon set. This data may be out of date by
     * some window of time. Populated by the system. Read-only. More info:
     * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#spec-and-status.
     */
    @JsonProperty(value = "status")
    private V1beta1DaemonSetStatus status;

    /**
     * Get the apiVersion value.
     *
     * @return the apiVersion value
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /**
     * Set the apiVersion value.
     *
     * @param apiVersion the apiVersion value to set
     * @return the V1beta1DaemonSet object itself.
     */
    public V1beta1DaemonSet withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get the kind value.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind value.
     *
     * @param kind the kind value to set
     * @return the V1beta1DaemonSet object itself.
     */
    public V1beta1DaemonSet withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public V1ObjectMeta metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the V1beta1DaemonSet object itself.
     */
    public V1beta1DaemonSet withMetadata(V1ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the spec value.
     *
     * @return the spec value
     */
    public V1beta1DaemonSetSpec spec() {
        return this.spec;
    }

    /**
     * Set the spec value.
     *
     * @param spec the spec value to set
     * @return the V1beta1DaemonSet object itself.
     */
    public V1beta1DaemonSet withSpec(V1beta1DaemonSetSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public V1beta1DaemonSetStatus status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the V1beta1DaemonSet object itself.
     */
    public V1beta1DaemonSet withStatus(V1beta1DaemonSetStatus status) {
        this.status = status;
        return this;
    }

}
