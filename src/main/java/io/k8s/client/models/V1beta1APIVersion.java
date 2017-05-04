/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An APIVersion represents a single concrete version of an object model.
 */
public class V1beta1APIVersion {
    /**
     * Name of this version (e.g. 'v1').
     */
    @JsonProperty(value = "name")
    private String name;

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
     * @return the V1beta1APIVersion object itself.
     */
    public V1beta1APIVersion withName(String name) {
        this.name = name;
        return this;
    }

}