/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PersistentVolumeClaimSpec describes the common attributes of storage devices
 * and allows a Source for provider-specific attributes.
 */
public class V1PersistentVolumeClaimSpec {
    /**
     * AccessModes contains the desired access modes the volume should have.
     * More info:
     * http://kubernetes.io/docs/user-guide/persistent-volumes#access-modes-1.
     */
    @JsonProperty(value = "accessModes")
    private List<String> accessModes;

    /**
     * Resources represents the minimum resources the volume should have. More
     * info: http://kubernetes.io/docs/user-guide/persistent-volumes#resources.
     */
    @JsonProperty(value = "resources")
    private V1ResourceRequirements resources;

    /**
     * A label query over volumes to consider for binding.
     */
    @JsonProperty(value = "selector")
    private V1LabelSelector selector;

    /**
     * Name of the StorageClass required by the claim. More info:
     * http://kubernetes.io/docs/user-guide/persistent-volumes#class-1.
     */
    @JsonProperty(value = "storageClassName")
    private String storageClassName;

    /**
     * VolumeName is the binding reference to the PersistentVolume backing this
     * claim.
     */
    @JsonProperty(value = "volumeName")
    private String volumeName;

    /**
     * Get the accessModes value.
     *
     * @return the accessModes value
     */
    public List<String> accessModes() {
        return this.accessModes;
    }

    /**
     * Set the accessModes value.
     *
     * @param accessModes the accessModes value to set
     * @return the V1PersistentVolumeClaimSpec object itself.
     */
    public V1PersistentVolumeClaimSpec withAccessModes(List<String> accessModes) {
        this.accessModes = accessModes;
        return this;
    }

    /**
     * Get the resources value.
     *
     * @return the resources value
     */
    public V1ResourceRequirements resources() {
        return this.resources;
    }

    /**
     * Set the resources value.
     *
     * @param resources the resources value to set
     * @return the V1PersistentVolumeClaimSpec object itself.
     */
    public V1PersistentVolumeClaimSpec withResources(V1ResourceRequirements resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the selector value.
     *
     * @return the selector value
     */
    public V1LabelSelector selector() {
        return this.selector;
    }

    /**
     * Set the selector value.
     *
     * @param selector the selector value to set
     * @return the V1PersistentVolumeClaimSpec object itself.
     */
    public V1PersistentVolumeClaimSpec withSelector(V1LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    /**
     * Get the storageClassName value.
     *
     * @return the storageClassName value
     */
    public String storageClassName() {
        return this.storageClassName;
    }

    /**
     * Set the storageClassName value.
     *
     * @param storageClassName the storageClassName value to set
     * @return the V1PersistentVolumeClaimSpec object itself.
     */
    public V1PersistentVolumeClaimSpec withStorageClassName(String storageClassName) {
        this.storageClassName = storageClassName;
        return this;
    }

    /**
     * Get the volumeName value.
     *
     * @return the volumeName value
     */
    public String volumeName() {
        return this.volumeName;
    }

    /**
     * Set the volumeName value.
     *
     * @param volumeName the volumeName value to set
     * @return the V1PersistentVolumeClaimSpec object itself.
     */
    public V1PersistentVolumeClaimSpec withVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }

}
