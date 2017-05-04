/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a Persistent Disk resource in Google Compute Engine.
 *
 * A GCE PD must exist before mounting to a container. The disk must also be in
 * the same GCE project and zone as the kubelet. A GCE PD can only be mounted
 * as read/write once or read-only many times. GCE PDs support ownership
 * management and SELinux relabeling.
 */
public class V1GCEPersistentDiskVolumeSource {
    /**
     * Filesystem type of the volume that you want to mount. Tip: Ensure that
     * the filesystem type is supported by the host operating system. Examples:
     * "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * More info:
     * http://kubernetes.io/docs/user-guide/volumes#gcepersistentdisk.
     */
    @JsonProperty(value = "fsType")
    private String fsType;

    /**
     * The partition in the volume that you want to mount. If omitted, the
     * default is to mount by volume name. Examples: For volume /dev/sda1, you
     * specify the partition as "1". Similarly, the volume partition for
     * /dev/sda is "0" (or you can leave the property empty). More info:
     * http://kubernetes.io/docs/user-guide/volumes#gcepersistentdisk.
     */
    @JsonProperty(value = "partition")
    private Integer partition;

    /**
     * Unique name of the PD resource in GCE. Used to identify the disk in GCE.
     * More info:
     * http://kubernetes.io/docs/user-guide/volumes#gcepersistentdisk.
     */
    @JsonProperty(value = "pdName", required = true)
    private String pdName;

    /**
     * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults
     * to false. More info:
     * http://kubernetes.io/docs/user-guide/volumes#gcepersistentdisk.
     */
    @JsonProperty(value = "readOnly")
    private Boolean readOnly;

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
     * @return the V1GCEPersistentDiskVolumeSource object itself.
     */
    public V1GCEPersistentDiskVolumeSource withFsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    /**
     * Get the partition value.
     *
     * @return the partition value
     */
    public Integer partition() {
        return this.partition;
    }

    /**
     * Set the partition value.
     *
     * @param partition the partition value to set
     * @return the V1GCEPersistentDiskVolumeSource object itself.
     */
    public V1GCEPersistentDiskVolumeSource withPartition(Integer partition) {
        this.partition = partition;
        return this;
    }

    /**
     * Get the pdName value.
     *
     * @return the pdName value
     */
    public String pdName() {
        return this.pdName;
    }

    /**
     * Set the pdName value.
     *
     * @param pdName the pdName value to set
     * @return the V1GCEPersistentDiskVolumeSource object itself.
     */
    public V1GCEPersistentDiskVolumeSource withPdName(String pdName) {
        this.pdName = pdName;
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
     * @return the V1GCEPersistentDiskVolumeSource object itself.
     */
    public V1GCEPersistentDiskVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

}
