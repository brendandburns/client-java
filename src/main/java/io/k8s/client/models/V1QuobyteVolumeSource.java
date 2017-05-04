/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes
 * do not support ownership management or SELinux relabeling.
 */
public class V1QuobyteVolumeSource {
    /**
     * Group to map volume access to Default is no group.
     */
    @JsonProperty(value = "group")
    private String group;

    /**
     * ReadOnly here will force the Quobyte volume to be mounted with read-only
     * permissions. Defaults to false.
     */
    @JsonProperty(value = "readOnly")
    private Boolean readOnly;

    /**
     * Registry represents a single or multiple Quobyte Registry services
     * specified as a string as host:port pair (multiple entries are separated
     * with commas) which acts as the central registry for volumes.
     */
    @JsonProperty(value = "registry", required = true)
    private String registry;

    /**
     * User to map volume access to Defaults to serivceaccount user.
     */
    @JsonProperty(value = "user")
    private String user;

    /**
     * Volume is a string that references an already created Quobyte volume by
     * name.
     */
    @JsonProperty(value = "volume", required = true)
    private String volume;

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
     * @return the V1QuobyteVolumeSource object itself.
     */
    public V1QuobyteVolumeSource withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * Get the readOnly value.
     *
     * @return the readOnly value
     */
    public Boolean readOnly() {
        return this.readOnly;
    }

    /**
     * Set the readOnly value.
     *
     * @param readOnly the readOnly value to set
     * @return the V1QuobyteVolumeSource object itself.
     */
    public V1QuobyteVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * Get the registry value.
     *
     * @return the registry value
     */
    public String registry() {
        return this.registry;
    }

    /**
     * Set the registry value.
     *
     * @param registry the registry value to set
     * @return the V1QuobyteVolumeSource object itself.
     */
    public V1QuobyteVolumeSource withRegistry(String registry) {
        this.registry = registry;
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
     * @return the V1QuobyteVolumeSource object itself.
     */
    public V1QuobyteVolumeSource withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * Get the volume value.
     *
     * @return the volume value
     */
    public String volume() {
        return this.volume;
    }

    /**
     * Set the volume value.
     *
     * @param volume the volume value to set
     * @return the V1QuobyteVolumeSource object itself.
     */
    public V1QuobyteVolumeSource withVolume(String volume) {
        this.volume = volume;
        return this;
    }

}