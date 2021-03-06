/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Subject contains a reference to the object or user identities a role binding
 * applies to.  This can either hold a direct API object reference, or a value
 * for non-objects such as user and group names.
 */
public class V1beta1Subject {
    /**
     * APIGroup holds the API group of the referenced subject. Defaults to ""
     * for ServiceAccount subjects. Defaults to "rbac.authorization.k8s.io" for
     * User and Group subjects.
     */
    @JsonProperty(value = "apiGroup")
    private String apiGroup;

    /**
     * Kind of object being referenced. Values defined by this API group are
     * "User", "Group", and "ServiceAccount". If the Authorizer does not
     * recognized the kind value, the Authorizer should report an error.
     */
    @JsonProperty(value = "kind", required = true)
    private String kind;

    /**
     * Name of the object being referenced.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Namespace of the referenced object.  If the object kind is
     * non-namespace, such as "User" or "Group", and this value is not empty
     * the Authorizer should report an error.
     */
    @JsonProperty(value = "namespace")
    private String namespace;

    /**
     * Get the apiGroup value.
     *
     * @return the apiGroup value
     */
    public String apiGroup() {
        return this.apiGroup;
    }

    /**
     * Set the apiGroup value.
     *
     * @param apiGroup the apiGroup value to set
     * @return the V1beta1Subject object itself.
     */
    public V1beta1Subject withApiGroup(String apiGroup) {
        this.apiGroup = apiGroup;
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
     * @return the V1beta1Subject object itself.
     */
    public V1beta1Subject withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the V1beta1Subject object itself.
     */
    public V1beta1Subject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the namespace value.
     *
     * @return the namespace value
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Set the namespace value.
     *
     * @param namespace the namespace value to set
     * @return the V1beta1Subject object itself.
     */
    public V1beta1Subject withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
