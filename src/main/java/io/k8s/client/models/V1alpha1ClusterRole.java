/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ClusterRole is a cluster level, logical grouping of PolicyRules that can be
 * referenced as a unit by a RoleBinding or ClusterRoleBinding.
 */
public class V1alpha1ClusterRole {
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
     * Standard object's metadata.
     */
    @JsonProperty(value = "metadata")
    private V1ObjectMeta metadata;

    /**
     * Rules holds all the PolicyRules for this ClusterRole.
     */
    @JsonProperty(value = "rules", required = true)
    private List<V1alpha1PolicyRule> rules;

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
     * @return the V1alpha1ClusterRole object itself.
     */
    public V1alpha1ClusterRole withApiVersion(String apiVersion) {
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
     * @return the V1alpha1ClusterRole object itself.
     */
    public V1alpha1ClusterRole withKind(String kind) {
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
     * @return the V1alpha1ClusterRole object itself.
     */
    public V1alpha1ClusterRole withMetadata(V1ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the rules value.
     *
     * @return the rules value
     */
    public List<V1alpha1PolicyRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules value.
     *
     * @param rules the rules value to set
     * @return the V1alpha1ClusterRole object itself.
     */
    public V1alpha1ClusterRole withRules(List<V1alpha1PolicyRule> rules) {
        this.rules = rules;
        return this;
    }

}
