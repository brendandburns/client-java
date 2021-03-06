/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DeploymentList is a list of Deployments.
 */
public class Extensionsv1beta1DeploymentList {
    /**
     * APIVersion defines the versioned schema of this representation of an
     * object. Servers should convert recognized schemas to the latest internal
     * value, and may reject unrecognized values. More info:
     * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#resources.
     */
    @JsonProperty(value = "apiVersion")
    private String apiVersion;

    /**
     * Items is the list of Deployments.
     */
    @JsonProperty(value = "items", required = true)
    private List<Extensionsv1beta1Deployment> items;

    /**
     * Kind is a string value representing the REST resource this object
     * represents. Servers may infer this from the endpoint the client submits
     * requests to. Cannot be updated. In CamelCase. More info:
     * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Standard list metadata.
     */
    @JsonProperty(value = "metadata")
    private V1ListMeta metadata;

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
     * @return the Extensionsv1beta1DeploymentList object itself.
     */
    public Extensionsv1beta1DeploymentList withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get the items value.
     *
     * @return the items value
     */
    public List<Extensionsv1beta1Deployment> items() {
        return this.items;
    }

    /**
     * Set the items value.
     *
     * @param items the items value to set
     * @return the Extensionsv1beta1DeploymentList object itself.
     */
    public Extensionsv1beta1DeploymentList withItems(List<Extensionsv1beta1Deployment> items) {
        this.items = items;
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
     * @return the Extensionsv1beta1DeploymentList object itself.
     */
    public Extensionsv1beta1DeploymentList withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public V1ListMeta metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the Extensionsv1beta1DeploymentList object itself.
     */
    public Extensionsv1beta1DeploymentList withMetadata(V1ListMeta metadata) {
        this.metadata = metadata;
        return this;
    }

}
