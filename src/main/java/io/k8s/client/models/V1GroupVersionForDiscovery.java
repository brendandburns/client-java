/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GroupVersion contains the "group/version" and "version" string of a version.
 * It is made a struct to keep extensibility.
 */
public class V1GroupVersionForDiscovery {
    /**
     * groupVersion specifies the API group and version in the form
     * "group/version".
     */
    @JsonProperty(value = "groupVersion", required = true)
    private String groupVersion;

    /**
     * version specifies the version in the form of "version". This is to save
     * the clients the trouble of splitting the GroupVersion.
     */
    @JsonProperty(value = "version", required = true)
    private String version;

    /**
     * Get the groupVersion value.
     *
     * @return the groupVersion value
     */
    public String groupVersion() {
        return this.groupVersion;
    }

    /**
     * Set the groupVersion value.
     *
     * @param groupVersion the groupVersion value to set
     * @return the V1GroupVersionForDiscovery object itself.
     */
    public V1GroupVersionForDiscovery withGroupVersion(String groupVersion) {
        this.groupVersion = groupVersion;
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
     * @return the V1GroupVersionForDiscovery object itself.
     */
    public V1GroupVersionForDiscovery withVersion(String version) {
        this.version = version;
        return this;
    }

}
