/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TokenReviewStatus is the result of the token authentication request.
 */
public class V1beta1TokenReviewStatus {
    /**
     * Authenticated indicates that the token was associated with a known user.
     */
    @JsonProperty(value = "authenticated")
    private Boolean authenticated;

    /**
     * Error indicates that the token couldn't be checked.
     */
    @JsonProperty(value = "error")
    private String error;

    /**
     * User is the UserInfo associated with the provided token.
     */
    @JsonProperty(value = "user")
    private V1beta1UserInfo user;

    /**
     * Get the authenticated value.
     *
     * @return the authenticated value
     */
    public Boolean authenticated() {
        return this.authenticated;
    }

    /**
     * Set the authenticated value.
     *
     * @param authenticated the authenticated value to set
     * @return the V1beta1TokenReviewStatus object itself.
     */
    public V1beta1TokenReviewStatus withAuthenticated(Boolean authenticated) {
        this.authenticated = authenticated;
        return this;
    }

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public String error() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     * @return the V1beta1TokenReviewStatus object itself.
     */
    public V1beta1TokenReviewStatus withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * Get the user value.
     *
     * @return the user value
     */
    public V1beta1UserInfo user() {
        return this.user;
    }

    /**
     * Set the user value.
     *
     * @param user the user value to set
     * @return the V1beta1TokenReviewStatus object itself.
     */
    public V1beta1TokenReviewStatus withUser(V1beta1UserInfo user) {
        this.user = user;
        return this;
    }

}
