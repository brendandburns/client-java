/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PolicyRule holds information that describes a policy rule, but does not
 * contain information about who the rule applies to or which namespace the
 * rule applies to.
 */
public class V1beta1PolicyRule {
    /**
     * APIGroups is the name of the APIGroup that contains the resources.  If
     * multiple API groups are specified, any action requested against one of
     * the enumerated resources in any API group will be allowed.
     */
    @JsonProperty(value = "apiGroups")
    private List<String> apiGroups;

    /**
     * NonResourceURLs is a set of partial urls that a user should have access
     * to.  *s are allowed, but only as the full, final step in the path Since
     * non-resource URLs are not namespaced, this field is only applicable for
     * ClusterRoles referenced from a ClusterRoleBinding. Rules can either
     * apply to API resources (such as "pods" or "secrets") or non-resource URL
     * paths (such as "/api"),  but not both.
     */
    @JsonProperty(value = "nonResourceURLs")
    private List<String> nonResourceURLs;

    /**
     * ResourceNames is an optional white list of names that the rule applies
     * to.  An empty set means that everything is allowed.
     */
    @JsonProperty(value = "resourceNames")
    private List<String> resourceNames;

    /**
     * Resources is a list of resources this rule applies to.  ResourceAll
     * represents all resources.
     */
    @JsonProperty(value = "resources")
    private List<String> resources;

    /**
     * Verbs is a list of Verbs that apply to ALL the ResourceKinds and
     * AttributeRestrictions contained in this rule.  VerbAll represents all
     * kinds.
     */
    @JsonProperty(value = "verbs", required = true)
    private List<String> verbs;

    /**
     * Get the apiGroups value.
     *
     * @return the apiGroups value
     */
    public List<String> apiGroups() {
        return this.apiGroups;
    }

    /**
     * Set the apiGroups value.
     *
     * @param apiGroups the apiGroups value to set
     * @return the V1beta1PolicyRule object itself.
     */
    public V1beta1PolicyRule withApiGroups(List<String> apiGroups) {
        this.apiGroups = apiGroups;
        return this;
    }

    /**
     * Get the nonResourceURLs value.
     *
     * @return the nonResourceURLs value
     */
    public List<String> nonResourceURLs() {
        return this.nonResourceURLs;
    }

    /**
     * Set the nonResourceURLs value.
     *
     * @param nonResourceURLs the nonResourceURLs value to set
     * @return the V1beta1PolicyRule object itself.
     */
    public V1beta1PolicyRule withNonResourceURLs(List<String> nonResourceURLs) {
        this.nonResourceURLs = nonResourceURLs;
        return this;
    }

    /**
     * Get the resourceNames value.
     *
     * @return the resourceNames value
     */
    public List<String> resourceNames() {
        return this.resourceNames;
    }

    /**
     * Set the resourceNames value.
     *
     * @param resourceNames the resourceNames value to set
     * @return the V1beta1PolicyRule object itself.
     */
    public V1beta1PolicyRule withResourceNames(List<String> resourceNames) {
        this.resourceNames = resourceNames;
        return this;
    }

    /**
     * Get the resources value.
     *
     * @return the resources value
     */
    public List<String> resources() {
        return this.resources;
    }

    /**
     * Set the resources value.
     *
     * @param resources the resources value to set
     * @return the V1beta1PolicyRule object itself.
     */
    public V1beta1PolicyRule withResources(List<String> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the verbs value.
     *
     * @return the verbs value
     */
    public List<String> verbs() {
        return this.verbs;
    }

    /**
     * Set the verbs value.
     *
     * @param verbs the verbs value to set
     * @return the V1beta1PolicyRule object itself.
     */
    public V1beta1PolicyRule withVerbs(List<String> verbs) {
        this.verbs = verbs;
        return this;
    }

}