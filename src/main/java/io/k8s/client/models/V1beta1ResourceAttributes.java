/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ResourceAttributes includes the authorization attributes available for
 * resource requests to the Authorizer interface.
 */
public class V1beta1ResourceAttributes {
    /**
     * Group is the API Group of the Resource.  "*" means all.
     */
    @JsonProperty(value = "group")
    private String group;

    /**
     * Name is the name of the resource being requested for a "get" or deleted
     * for a "delete". "" (empty) means all.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Namespace is the namespace of the action being requested.  Currently,
     * there is no distinction between no namespace and all namespaces ""
     * (empty) is defaulted for LocalSubjectAccessReviews "" (empty) is empty
     * for cluster-scoped resources "" (empty) means "all" for namespace scoped
     * resources from a SubjectAccessReview or SelfSubjectAccessReview.
     */
    @JsonProperty(value = "namespace")
    private String namespace;

    /**
     * Resource is one of the existing resource types.  "*" means all.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /**
     * Subresource is one of the existing resource types.  "" means none.
     */
    @JsonProperty(value = "subresource")
    private String subresource;

    /**
     * Verb is a kubernetes resource API verb, like: get, list, watch, create,
     * update, delete, proxy.  "*" means all.
     */
    @JsonProperty(value = "verb")
    private String verb;

    /**
     * Version is the API Version of the Resource.  "*" means all.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the group value.
     *
     * @return the group value
     */
    public String group() {
        return this.group;
    }

    /**
     * Set the group value.
     *
     * @param group the group value to set
     * @return the V1beta1ResourceAttributes object itself.
     */
    public V1beta1ResourceAttributes withGroup(String group) {
        this.group = group;
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
     * @return the V1beta1ResourceAttributes object itself.
     */
    public V1beta1ResourceAttributes withName(String name) {
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
     * @return the V1beta1ResourceAttributes object itself.
     */
    public V1beta1ResourceAttributes withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Get the resource value.
     *
     * @return the resource value
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource value.
     *
     * @param resource the resource value to set
     * @return the V1beta1ResourceAttributes object itself.
     */
    public V1beta1ResourceAttributes withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the subresource value.
     *
     * @return the subresource value
     */
    public String subresource() {
        return this.subresource;
    }

    /**
     * Set the subresource value.
     *
     * @param subresource the subresource value to set
     * @return the V1beta1ResourceAttributes object itself.
     */
    public V1beta1ResourceAttributes withSubresource(String subresource) {
        this.subresource = subresource;
        return this;
    }

    /**
     * Get the verb value.
     *
     * @return the verb value
     */
    public String verb() {
        return this.verb;
    }

    /**
     * Set the verb value.
     *
     * @param verb the verb value to set
     * @return the V1beta1ResourceAttributes object itself.
     */
    public V1beta1ResourceAttributes withVerb(String verb) {
        this.verb = verb;
        return this;
    }

    /**
     * Get the version value.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set
     * @return the V1beta1ResourceAttributes object itself.
     */
    public V1beta1ResourceAttributes withVersion(String version) {
        this.version = version;
        return this;
    }

}
