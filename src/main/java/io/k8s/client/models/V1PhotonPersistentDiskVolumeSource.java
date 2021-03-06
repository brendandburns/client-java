/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a Photon Controller persistent disk resource.
 */
public class V1PhotonPersistentDiskVolumeSource {
    /**
     * Filesystem type to mount. Must be a filesystem type supported by the
     * host operating system. Ex. "ext4", "xfs", "ntfs". Implicitly inferred to
     * be "ext4" if unspecified.
     */
    @JsonProperty(value = "fsType")
    private String fsType;

    /**
     * ID that identifies Photon Controller persistent disk.
     */
    @JsonProperty(value = "pdID", required = true)
    private String pdID;

    /**
     * Get the fsType value.
     *
     * @return the fsType value
     */
    public String fsType() {
        return this.fsType;
    }

    /**
     * Set the fsType value.
     *
     * @param fsType the fsType value to set
     * @return the V1PhotonPersistentDiskVolumeSource object itself.
     */
    public V1PhotonPersistentDiskVolumeSource withFsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    /**
     * Get the pdID value.
     *
     * @return the pdID value
     */
    public String pdID() {
        return this.pdID;
    }

    /**
     * Set the pdID value.
     *
     * @param pdID the pdID value to set
     * @return the V1PhotonPersistentDiskVolumeSource object itself.
     */
    public V1PhotonPersistentDiskVolumeSource withPdID(String pdID) {
        this.pdID = pdID;
        return this;
    }

}
