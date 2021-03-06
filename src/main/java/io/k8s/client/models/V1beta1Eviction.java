/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Eviction evicts a pod from its node subject to certain policies and safety
 * constraints. This is a subresource of Pod.  A request to cause such an
 * eviction is created by POSTing to .../pods/&lt;pod name&gt;/evictions.
 */
public class V1beta1Eviction {
    /**
     * APIVersion defines the versioned schema of this representation of an
     * object. Servers should convert recognized schemas to the latest internal
     * value, and may reject unrecognized values. More info:
     * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#resources.
     */
    @JsonProperty(value = "apiVersion")
    private String apiVersion;

    /**
     * DeleteOptions may be provided.
     */
    @JsonProperty(value = "deleteOptions")
    private V1DeleteOptions deleteOptions;

    /**
     * Kind is a string value representing the REST resource this object
     * represents. Servers may infer this from the endpoint the client submits
     * requests to. Cannot be updated. In CamelCase. More info:
     * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * ObjectMeta describes the pod that is being evicted.
     */
    @JsonProperty(value = "metadata")
    private V1ObjectMeta metadata;

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
     * @return the V1beta1Eviction object itself.
     */
    public V1beta1Eviction withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get the deleteOptions value.
     *
     * @return the deleteOptions value
     */
    public V1DeleteOptions deleteOptions() {
        return this.deleteOptions;
    }

    /**
     * Set the deleteOptions value.
     *
     * @param deleteOptions the deleteOptions value to set
     * @return the V1beta1Eviction object itself.
     */
    public V1beta1Eviction withDeleteOptions(V1DeleteOptions deleteOptions) {
        this.deleteOptions = deleteOptions;
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
     * @return the V1beta1Eviction object itself.
     */
    public V1beta1Eviction withKind(String kind) {
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
     * @return the V1beta1Eviction object itself.
     */
    public V1beta1Eviction withMetadata(V1ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

}
