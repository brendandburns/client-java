/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TokenReviewSpec is a description of the token authentication request.
 */
public class V1TokenReviewSpec {
    /**
     * Token is the opaque bearer token.
     */
    @JsonProperty(value = "token")
    private String token;

    /**
     * Get the token value.
     *
     * @return the token value
     */
    public String token() {
        return this.token;
    }

    /**
     * Set the token value.
     *
     * @param token the token value to set
     * @return the V1TokenReviewSpec object itself.
     */
    public V1TokenReviewSpec withToken(String token) {
        this.token = token;
        return this;
    }

}