/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SelfSubjectAccessReviewSpec is a description of the access request.  Exactly
 * one of ResourceAuthorizationAttributes and
 * NonResourceAuthorizationAttributes must be set.
 */
public class V1beta1SelfSubjectAccessReviewSpec {
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
     * @return the V1beta1SelfSubjectAccessReviewSpec object itself.
     */
    public V1beta1SelfSubjectAccessReviewSpec withNonResourceAttributes(V1beta1NonResourceAttributes nonResourceAttributes) {
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
     * @return the V1beta1SelfSubjectAccessReviewSpec object itself.
     */
    public V1beta1SelfSubjectAccessReviewSpec withResourceAttributes(V1beta1ResourceAttributes resourceAttributes) {
        this.resourceAttributes = resourceAttributes;
        return this;
    }

}