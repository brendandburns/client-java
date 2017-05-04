/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PersistentVolume (PV) is a storage resource provisioned by an administrator.
 * It is analogous to a node. More info:
 * http://kubernetes.io/docs/user-guide/persistent-volumes.
 */
public class V1PersistentVolume {
    /**
     * APIVersion defines the versioned schema of this representation of an
     * object. Servers should convert recognized schemas to the latest internal
     * value, and may reject unrecognized values. More info:
     * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#resources.
     */
    @JsonProperty(value = "apiVersion")
    private String apiVersion;

    /**
     * Kind is a string value representing the REST resource this object
     * represents. Servers may infer this from the endpoint the client submits
     * requests to. Cannot be updated. In CamelCase. More info:
     * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Standard object's metadata. More info:
     * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#metadata.
     */
    @JsonProperty(value = "metadata")
    private V1ObjectMeta metadata;

    /**
     * Spec defines a specification of a persistent volume owned by the
     * cluster. Provisioned by an administrator. More info:
     * http://kubernetes.io/docs/user-guide/persistent-volumes#persistent-volumes.
     */
    @JsonProperty(value = "spec")
    private V1PersistentVolumeSpec spec;

    /**
     * Status represents the current information/status for the persistent
     * volume. Populated by the system. Read-only. More info:
     * http://kubernetes.io/docs/user-guide/persistent-volumes#persistent-volumes.
     */
    @JsonProperty(value = "status")
    private V1PersistentVolumeStatus status;

    /**
     * Get the apiVersion value.
     *
     * @return the apiVersion value
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /**
     * Set the apiVersion value.
     *
     * @param apiVersion the apiVersion value to set
     * @return the V1PersistentVolume object itself.
     */
    public V1PersistentVolume withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get the kind value.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind value.
     *
     * @param kind the kind value to set
     * @return the V1PersistentVolume object itself.
     */
    public V1PersistentVolume withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public V1ObjectMeta metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the V1PersistentVolume object itself.
     */
    public V1PersistentVolume withMetadata(V1ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the spec value.
     *
     * @return the spec value
     */
    public V1PersistentVolumeSpec spec() {
        return this.spec;
    }

    /**
     * Set the spec value.
     *
     * @param spec the spec value to set
     * @return the V1PersistentVolume object itself.
     */
    public V1PersistentVolume withSpec(V1PersistentVolumeSpec spec) {
        this.spec = spec;
        return this;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public V1PersistentVolumeStatus status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the V1PersistentVolume object itself.
     */
    public V1PersistentVolume withStatus(V1PersistentVolumeStatus status) {
        this.status = status;
        return this;
    }

}