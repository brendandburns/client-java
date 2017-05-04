/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a Rados Block Device mount that lasts the lifetime of a pod. RBD
 * volumes support ownership management and SELinux relabeling.
 */
public class V1RBDVolumeSource {
    /**
     * Filesystem type of the volume that you want to mount. Tip: Ensure that
     * the filesystem type is supported by the host operating system. Examples:
     * "ext4", "xfs", "ntfs". Implicitly inferred to be "ext4" if unspecified.
     * More info: http://kubernetes.io/docs/user-guide/volumes#rbd.
     */
    @JsonProperty(value = "fsType")
    private String fsType;

    /**
     * The rados image name. More info:
     * http://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it.
     */
    @JsonProperty(value = "image", required = true)
    private String image;

    /**
     * Keyring is the path to key ring for RBDUser. Default is
     * /etc/ceph/keyring. More info:
     * http://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it.
     */
    @JsonProperty(value = "keyring")
    private String keyring;

    /**
     * A collection of Ceph monitors. More info:
     * http://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it.
     */
    @JsonProperty(value = "monitors", required = true)
    private List<String> monitors;

    /**
     * The rados pool name. Default is rbd. More info:
     * http://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it.
     */
    @JsonProperty(value = "pool")
    private String pool;

    /**
     * ReadOnly here will force the ReadOnly setting in VolumeMounts. Defaults
     * to false. More info:
     * http://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it.
     */
    @JsonProperty(value = "readOnly")
    private Boolean readOnly;

    /**
     * SecretRef is name of the authentication secret for RBDUser. If provided
     * overrides keyring. Default is nil. More info:
     * http://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it.
     */
    @JsonProperty(value = "secretRef")
    private V1LocalObjectReference secretRef;

    /**
     * The rados user name. Default is admin. More info:
     * http://releases.k8s.io/HEAD/examples/volumes/rbd/README.md#how-to-use-it.
     */
    @JsonProperty(value = "user")
    private String user;

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
     * @return the V1RBDVolumeSource object itself.
     */
    public V1RBDVolumeSource withFsType(String fsType) {
        this.fsType = fsType;
        return this;
    }

    /**
     * Get the image value.
     *
     * @return the image value
     */
    public String image() {
        return this.image;
    }

    /**
     * Set the image value.
     *
     * @param image the image value to set
     * @return the V1RBDVolumeSource object itself.
     */
    public V1RBDVolumeSource withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * Get the keyring value.
     *
     * @return the keyring value
     */
    public String keyring() {
        return this.keyring;
    }

    /**
     * Set the keyring value.
     *
     * @param keyring the keyring value to set
     * @return the V1RBDVolumeSource object itself.
     */
    public V1RBDVolumeSource withKeyring(String keyring) {
        this.keyring = keyring;
        return this;
    }

    /**
     * Get the monitors value.
     *
     * @return the monitors value
     */
    public List<String> monitors() {
        return this.monitors;
    }

    /**
     * Set the monitors value.
     *
     * @param monitors the monitors value to set
     * @return the V1RBDVolumeSource object itself.
     */
    public V1RBDVolumeSource withMonitors(List<String> monitors) {
        this.monitors = monitors;
        return this;
    }

    /**
     * Get the pool value.
     *
     * @return the pool value
     */
    public String pool() {
        return this.pool;
    }

    /**
     * Set the pool value.
     *
     * @param pool the pool value to set
     * @return the V1RBDVolumeSource object itself.
     */
    public V1RBDVolumeSource withPool(String pool) {
        this.pool = pool;
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
     * @return the V1RBDVolumeSource object itself.
     */
    public V1RBDVolumeSource withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * Get the secretRef value.
     *
     * @return the secretRef value
     */
    public V1LocalObjectReference secretRef() {
        return this.secretRef;
    }

    /**
     * Set the secretRef value.
     *
     * @param secretRef the secretRef value to set
     * @return the V1RBDVolumeSource object itself.
     */
    public V1RBDVolumeSource withSecretRef(V1LocalObjectReference secretRef) {
        this.secretRef = secretRef;
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
     * @return the V1RBDVolumeSource object itself.
     */
    public V1RBDVolumeSource withUser(String user) {
        this.user = user;
        return this;
    }

}
