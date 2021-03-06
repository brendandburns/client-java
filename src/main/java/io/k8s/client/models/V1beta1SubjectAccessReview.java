/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SubjectAccessReview checks whether or not a user or group can perform an
 * action.
 */
public class V1beta1SubjectAccessReview {
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
     * The metadata property.
     */
    @JsonProperty(value = "metadata")
    private V1ObjectMeta metadata;

    /**
     * Spec holds information about the request being evaluated.
     */
    @JsonProperty(value = "spec", required = true)
    private V1beta1SubjectAccessReviewSpec spec;

    /**
     * Status is filled in by the server and indicates whether the request is
     * allowed or not.
     */
    @JsonProperty(value = "status")
    private V1beta1SubjectAccessReviewStatus status;

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
     * @return the V1beta1SubjectAccessReview object itself.
     */
    public V1beta1SubjectAccessReview withApiVersion(String apiVersion) {
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
     * @return the V1beta1SubjectAccessReview object itself.
     */
    public V1beta1SubjectAccessReview withKind(String kind) {
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
     * @return the V1beta1SubjectAccessReview object itself.
     */
    public V1beta1SubjectAccessReview withMetadata(V1ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the spec value.
     *
     * @return the spec value
     */
    public V1beta1SubjectAccessReviewSpec spec() {
        return this.spec;
    }

    /**
     * Set the spec value.
     *
     * @param spec the spec value to set
     * @return the V1beta1SubjectAccessReview object itself.
     */
    public V1beta1SubjectAccessReview withSpec(V1beta1SubjectAccessReviewSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public V1beta1SubjectAccessReviewStatus status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the V1beta1SubjectAccessReview object itself.
     */
    public V1beta1SubjectAccessReview withStatus(V1beta1SubjectAccessReviewStatus status) {
        this.status = status;
        return this;
    }

}
