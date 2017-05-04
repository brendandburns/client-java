/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a host path mapped into a pod. Host path volumes do not support
 * ownership management or SELinux relabeling.
 */
public class V1HostPathVolumeSource {
    /**
     * Path of the directory on the host. More info:
     * http://kubernetes.io/docs/user-guide/volumes#hostpath.
     */
    @JsonProperty(value = "path", required = true)
    private String path;

    /**
     * Get the path value.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path value.
     *
     * @param path the path value to set
     * @return the V1HostPathVolumeSource object itself.
     */
    public V1HostPathVolumeSource withPath(String path) {
        this.path = path;
        return this;
    }

}
