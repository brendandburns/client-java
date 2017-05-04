/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a Persistent Disk resource in AWS.
 *
 * An AWS EBS disk must exist before mounting to a container. The disk must
 * also be in the same AWS zone as the kubelet. An AWS EBS disk can only be
 * mounted as read/write once. AWS EBS volumes support ownership management and
 * SELinux relabeling.
 */
public class V1AWSElasticBlockStoreVolumeSource {
    /**
     * Filesystem type of the volume that you want to mount. Tip: Ensure that
     * the filesystem type is supported by the host operating system. Examples:
     * "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * More info:
     * http://kubernetes.io/docs/user-guide/volumes#awselasticblockstore.
     */
    @JsonProperty(value = "fsType")
    private String fsType;

    /**
     * The partition in the volume that you want to mount. If omitted, the
     * default is to mount by volume name. Examples: For volume /dev/sda1, you
     * specify the partition as "1". Similarly, the volume partition for
     * /dev/sda is "0" (or you can leave the property empty).
     */
    @JsonProperty(value = "partition")
    private Integer partition;

    /**
     * Specify "true" to force and set the ReadOnly property in VolumeMounts to
     * "true". If omitted, the default is "false". More info:
     * http://kubernetes.io/docs/user-guide/volumes#awselasticblockstore.
     */
    @JsonProperty(value = "readOnly")
    private Boolean readOnly;

    /**
     * Unique ID of the persistent disk resource in AWS (Amazon EBS volume).
     * More info:
     * http://kubernetes.io/docs/user-guide/volumes#awselasticblockstore.
     */
    @JsonProperty(value = "volumeID", required = true)
    private String volumeID;

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
     * @return the V1AWSElasticBlockStoreVolumeSource object itself.
     */
    public V1AWSElasticBlockStoreVolumeSource withFsType(String fsType) {
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
     * @return the V1AWSElasticBlockStoreVolumeSource object itself.
     */
    public V1AWSElasticBlockStoreVolumeSource withPartition(Integer partition) {
        this.partition = partition;
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
     * @return the V1AWSElasticBlockStoreVolumeSource object itself.
     */
    public V1AWSElasticBlockStoreVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * Get the volumeID value.
     *
     * @return the volumeID value
     */
    public String volumeID() {
        return this.volumeID;
    }

    /**
     * Set the volumeID value.
     *
     * @param volumeID the volumeID value to set
     * @return the V1AWSElasticBlockStoreVolumeSource object itself.
     */
    public V1AWSElasticBlockStoreVolumeSource withVolumeID(String volumeID) {
        this.volumeID = volumeID;
        return this;
    }

}
