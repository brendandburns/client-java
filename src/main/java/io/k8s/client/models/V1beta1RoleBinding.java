/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RoleBinding references a role, but does not contain it.  It can reference a
 * Role in the same namespace or a ClusterRole in the global namespace. It adds
 * who information via Subjects and namespace information by which namespace it
 * exists in.  RoleBindings in a given namespace only have effect in that
 * namespace.
 */
public class V1beta1RoleBinding {
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
     * RoleRef can reference a Role in the current namespace or a ClusterRole
     * in the global namespace. If the RoleRef cannot be resolved, the
     * Authorizer must return an error.
     */
    @JsonProperty(value = "roleRef", required = true)
    private V1beta1RoleRef roleRef;

    /**
     * Subjects holds references to the objects the role applies to.
     */
    @JsonProperty(value = "subjects", required = true)
    private List<V1beta1Subject> subjects;

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
     * @return the V1beta1RoleBinding object itself.
     */
    public V1beta1RoleBinding withApiVersion(String apiVersion) {
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
     * @return the V1beta1RoleBinding object itself.
     */
    public V1beta1RoleBinding withKind(String kind) {
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
     * @return the V1beta1RoleBinding object itself.
     */
    public V1beta1RoleBinding withMetadata(V1ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the roleRef value.
     *
     * @return the roleRef value
     */
    public V1beta1RoleRef roleRef() {
        return this.roleRef;
    }

    /**
     * Set the roleRef value.
     *
     * @param roleRef the roleRef value to set
     * @return the V1beta1RoleBinding object itself.
     */
    public V1beta1RoleBinding withRoleRef(V1beta1RoleRef roleRef) {
        this.roleRef = roleRef;
        return this;
    }

    /**
     * Get the subjects value.
     *
     * @return the subjects value
     */
    public List<V1beta1Subject> subjects() {
        return this.subjects;
    }

    /**
     * Set the subjects value.
     *
     * @param subjects the subjects value to set
     * @return the V1beta1RoleBinding object itself.
     */
    public V1beta1RoleBinding withSubjects(List<V1beta1Subject> subjects) {
        this.subjects = subjects;
        return this;
    }

}
