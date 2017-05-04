/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * LimitRange sets resource usage limits for each kind of resource in a
 * Namespace.
 */
public class V1LimitRange {
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
     * Spec defines the limits enforced. More info:
     * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#spec-and-status.
     */
    @JsonProperty(value = "spec")
    private V1LimitRangeSpec spec;

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
     * @return the V1LimitRange object itself.
     */
    public V1LimitRange withApiVersion(String apiVersion) {
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
     * @return the V1LimitRange object itself.
     */
    public V1LimitRange withKind(String kind) {
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
     * @return the V1LimitRange object itself.
     */
    public V1LimitRange withMetadata(V1ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the spec value.
     *
     * @return the spec value
     */
    public V1LimitRangeSpec spec() {
        return this.spec;
    }

    /**
     * Set the spec value.
     *
     * @param spec the spec value to set
     * @return the V1LimitRange object itself.
     */
    public V1LimitRange withSpec(V1LimitRangeSpec spec) {
        this.spec = spec;
        return this;
    }

}