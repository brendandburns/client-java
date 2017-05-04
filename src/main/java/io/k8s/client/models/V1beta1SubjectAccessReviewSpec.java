/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SubjectAccessReviewSpec is a description of the access request.  Exactly one
 * of ResourceAuthorizationAttributes and NonResourceAuthorizationAttributes
 * must be set.
 */
public class V1beta1SubjectAccessReviewSpec {
    /**
     * Extra corresponds to the user.Info.GetExtra() method from the
     * authenticator.  Since that is input to the authorizer it needs a
     * reflection here.
     */
    @JsonProperty(value = "extra")
    private Map<String, List<String>> extra;

    /**
     * Groups is the groups you're testing for.
     */
    @JsonProperty(value = "group")
    private List<String> group;

    /**
     * NonResourceAttributes describes information for a non-resource access
     * request.
     */
    @JsonProperty(value = "nonResourceAttributes")
    private V1beta1NonResourceAttributes nonResourceAttributes;

    /**
     * ResourceAuthorizationAttributes describes information for a resource
     * access request.
     */
    @JsonProperty(value = "resourceAttributes")
    private V1beta1ResourceAttributes resourceAttributes;

    /**
     * User is the user you're testing for. If you specify "User" but not
     * "Group", then is it interpreted as "What if User were not a member of
     * any groups.
     */
    @JsonProperty(value = "user")
    private String user;

    /**
     * Get the extra value.
     *
     * @return the extra value
     */
    public Map<String, List<String>> extra() {
        return this.extra;
    }

    /**
     * Set the extra value.
     *
     * @param extra the extra value to set
     * @return the V1beta1SubjectAccessReviewSpec object itself.
     */
    public V1beta1SubjectAccessReviewSpec withExtra(Map<String, List<String>> extra) {
        this.extra = extra;
        return this;
    }

    /**
     * Get the group value.
     *
     * @return the group value
     */
    public List<String> group() {
        return this.group;
    }

    /**
     * Set the group value.
     *
     * @param group the group value to set
     * @return the V1beta1SubjectAccessReviewSpec object itself.
     */
    public V1beta1SubjectAccessReviewSpec withGroup(List<String> group) {
        this.group = group;
        return this;
    }

    /**
     * Get the nonResourceAttributes value.
     *
     * @return the nonResourceAttributes value
     */
    public V1beta1NonResourceAttributes nonResourceAttributes() {
        return this.nonResourceAttributes;
    }

    /**
     * Set the nonResourceAttributes value.
     *
     * @param nonResourceAttributes the nonResourceAttributes value to set
     * @return the V1beta1SubjectAccessReviewSpec object itself.
     */
    public V1beta1SubjectAccessReviewSpec withNonResourceAttributes(V1beta1NonResourceAttributes nonResourceAttributes) {
        this.nonResourceAttributes = nonResourceAttributes;
        return this;
    }

    /**
     * Get the resourceAttributes value.
     *
     * @return the resourceAttributes value
     */
    public V1beta1ResourceAttributes resourceAttributes() {
        return this.resourceAttributes;
    }

    /**
     * Set the resourceAttributes value.
     *
     * @param resourceAttributes the resourceAttributes value to set
     * @return the V1beta1SubjectAccessReviewSpec object itself.
     */
    public V1beta1SubjectAccessReviewSpec withResourceAttributes(V1beta1ResourceAttributes resourceAttributes) {
        this.resourceAttributes = resourceAttributes;
        return this;
    }

    /**
     * Get the user value.
     *
     * @return the user value
     */
    public String user() {
        return this.user;
    }

    /**
     * Set the user value.
     *
     * @param user the user value to set
     * @return the V1beta1SubjectAccessReviewSpec object itself.
     */
    public V1beta1SubjectAccessReviewSpec withUser(String user) {
        this.user = user;
        return this;
    }

}