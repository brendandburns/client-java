/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * APIGroupList is a list of APIGroup, to allow clients to discover the API at
 * /apis.
 */
public class V1APIGroupList {
    /**
     * APIVersion defines the versioned schema of this representation of an
     * object. Servers should convert recognized schemas to the latest internal
     * value, and may reject unrecognized values. More info:
     * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#resources.
     */
    @JsonProperty(value = "apiVersion")
    private String apiVersion;

    /**
     * groups is a list of APIGroup.
     */
    @JsonProperty(value = "groups", required = true)
    private List<V1APIGroup> groups;

    /**
     * Kind is a string value representing the REST resource this object
     * represents. Servers may infer this from the endpoint the client submits
     * requests to. Cannot be updated. In CamelCase. More info:
     * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds.
     */
    @JsonProperty(value = "kind")
    private String kind;

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
     * @return the V1APIGroupList object itself.
     */
    public V1APIGroupList withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get the groups value.
     *
     * @return the groups value
     */
    public List<V1APIGroup> groups() {
        return this.groups;
    }

    /**
     * Set the groups value.
     *
     * @param groups the groups value to set
     * @return the V1APIGroupList object itself.
     */
    public V1APIGroupList withGroups(List<V1APIGroup> groups) {
        this.groups = groups;
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
     * @return the V1APIGroupList object itself.
     */
    public V1APIGroupList withKind(String kind) {
        this.kind = kind;
        return this;
    }

}
