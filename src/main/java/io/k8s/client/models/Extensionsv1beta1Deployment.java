/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment enables declarative updates for Pods and ReplicaSets.
 */
public class Extensionsv1beta1Deployment {
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
     * Standard object metadata.
     */
    @JsonProperty(value = "metadata")
    private V1ObjectMeta metadata;

    /**
     * Specification of the desired behavior of the Deployment.
     */
    @JsonProperty(value = "spec")
    private Extensionsv1beta1DeploymentSpec spec;

    /**
     * Most recently observed status of the Deployment.
     */
    @JsonProperty(value = "status")
    private Extensionsv1beta1DeploymentStatus status;

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
     * @return the Extensionsv1beta1Deployment object itself.
     */
    public Extensionsv1beta1Deployment withApiVersion(String apiVersion) {
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
     * @return the Extensionsv1beta1Deployment object itself.
     */
    public Extensionsv1beta1Deployment withKind(String kind) {
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
     * @return the Extensionsv1beta1Deployment object itself.
     */
    public Extensionsv1beta1Deployment withMetadata(V1ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the spec value.
     *
     * @return the spec value
     */
    public Extensionsv1beta1DeploymentSpec spec() {
        return this.spec;
    }

    /**
     * Set the spec value.
     *
     * @param spec the spec value to set
     * @return the Extensionsv1beta1Deployment object itself.
     */
    public Extensionsv1beta1Deployment withSpec(Extensionsv1beta1DeploymentSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public Extensionsv1beta1DeploymentStatus status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the Extensionsv1beta1Deployment object itself.
     */
    public Extensionsv1beta1Deployment withStatus(Extensionsv1beta1DeploymentStatus status) {
        this.status = status;
        return this;
    }

}
