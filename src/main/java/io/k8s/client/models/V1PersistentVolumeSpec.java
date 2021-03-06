/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PersistentVolumeSpec is the specification of a persistent volume.
 */
public class V1PersistentVolumeSpec {
    /**
     * AccessModes contains all ways the volume can be mounted. More info:
     * http://kubernetes.io/docs/user-guide/persistent-volumes#access-modes.
     */
    @JsonProperty(value = "accessModes")
    private List<String> accessModes;

    /**
     * AWSElasticBlockStore represents an AWS Disk resource that is attached to
     * a kubelet's host machine and then exposed to the pod. More info:
     * http://kubernetes.io/docs/user-guide/volumes#awselasticblockstore.
     */
    @JsonProperty(value = "awsElasticBlockStore")
    private V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore;

    /**
     * AzureDisk represents an Azure Data Disk mount on the host and bind mount
     * to the pod.
     */
    @JsonProperty(value = "azureDisk")
    private V1AzureDiskVolumeSource azureDisk;

    /**
     * AzureFile represents an Azure File Service mount on the host and bind
     * mount to the pod.
     */
    @JsonProperty(value = "azureFile")
    private V1AzureFileVolumeSource azureFile;

    /**
     * A description of the persistent volume's resources and capacity. More
     * info: http://kubernetes.io/docs/user-guide/persistent-volumes#capacity.
     */
    @JsonProperty(value = "capacity")
    private Map<String, String> capacity;

    /**
     * CephFS represents a Ceph FS mount on the host that shares a pod's
     * lifetime.
     */
    @JsonProperty(value = "cephfs")
    private V1CephFSVolumeSource cephfs;

    /**
     * Cinder represents a cinder volume attached and mounted on kubelets host
     * machine More info:
     * http://releases.k8s.io/HEAD/examples/mysql-cinder-pd/README.md.
     */
    @JsonProperty(value = "cinder")
    private V1CinderVolumeSource cinder;

    /**
     * ClaimRef is part of a bi-directional binding between PersistentVolume
     * and PersistentVolumeClaim. Expected to be non-nil when bound.
     * claim.VolumeName is the authoritative bind between PV and PVC. More
     * info: http://kubernetes.io/docs/user-guide/persistent-volumes#binding.
     */
    @JsonProperty(value = "claimRef")
    private V1ObjectReference claimRef;

    /**
     * FC represents a Fibre Channel resource that is attached to a kubelet's
     * host machine and then exposed to the pod.
     */
    @JsonProperty(value = "fc")
    private V1FCVolumeSource fc;

    /**
     * FlexVolume represents a generic volume resource that is
     * provisioned/attached using an exec based plugin. This is an alpha
     * feature and may change in future.
     */
    @JsonProperty(value = "flexVolume")
    private V1FlexVolumeSource flexVolume;

    /**
     * Flocker represents a Flocker volume attached to a kubelet's host machine
     * and exposed to the pod for its usage. This depends on the Flocker
     * control service being running.
     */
    @JsonProperty(value = "flocker")
    private V1FlockerVolumeSource flocker;

    /**
     * GCEPersistentDisk represents a GCE Disk resource that is attached to a
     * kubelet's host machine and then exposed to the pod. Provisioned by an
     * admin. More info:
     * http://kubernetes.io/docs/user-guide/volumes#gcepersistentdisk.
     */
    @JsonProperty(value = "gcePersistentDisk")
    private V1GCEPersistentDiskVolumeSource gcePersistentDisk;

    /**
     * Glusterfs represents a Glusterfs volume that is attached to a host and
     * exposed to the pod. Provisioned by an admin. More info:
     * http://releases.k8s.io/HEAD/examples/volumes/glusterfs/README.md.
     */
    @JsonProperty(value = "glusterfs")
    private V1GlusterfsVolumeSource glusterfs;

    /**
     * HostPath represents a directory on the host. Provisioned by a developer
     * or tester. This is useful for single-node development and testing only!
     * On-host storage is not supported in any way and WILL NOT WORK in a
     * multi-node cluster. More info:
     * http://kubernetes.io/docs/user-guide/volumes#hostpath.
     */
    @JsonProperty(value = "hostPath")
    private V1HostPathVolumeSource hostPath;

    /**
     * ISCSI represents an ISCSI Disk resource that is attached to a kubelet's
     * host machine and then exposed to the pod. Provisioned by an admin.
     */
    @JsonProperty(value = "iscsi")
    private V1ISCSIVolumeSource iscsi;

    /**
     * NFS represents an NFS mount on the host. Provisioned by an admin. More
     * info: http://kubernetes.io/docs/user-guide/volumes#nfs.
     */
    @JsonProperty(value = "nfs")
    private V1NFSVolumeSource nfs;

    /**
     * What happens to a persistent volume when released from its claim. Valid
     * options are Retain (default) and Recycle. Recycling must be supported by
     * the volume plugin underlying this persistent volume. More info:
     * http://kubernetes.io/docs/user-guide/persistent-volumes#recycling-policy.
     */
    @JsonProperty(value = "persistentVolumeReclaimPolicy")
    private String persistentVolumeReclaimPolicy;

    /**
     * PhotonPersistentDisk represents a PhotonController persistent disk
     * attached and mounted on kubelets host machine.
     */
    @JsonProperty(value = "photonPersistentDisk")
    private V1PhotonPersistentDiskVolumeSource photonPersistentDisk;

    /**
     * PortworxVolume represents a portworx volume attached and mounted on
     * kubelets host machine.
     */
    @JsonProperty(value = "portworxVolume")
    private V1PortworxVolumeSource portworxVolume;

    /**
     * Quobyte represents a Quobyte mount on the host that shares a pod's
     * lifetime.
     */
    @JsonProperty(value = "quobyte")
    private V1QuobyteVolumeSource quobyte;

    /**
     * RBD represents a Rados Block Device mount on the host that shares a
     * pod's lifetime. More info:
     * http://releases.k8s.io/HEAD/examples/volumes/rbd/README.md.
     */
    @JsonProperty(value = "rbd")
    private V1RBDVolumeSource rbd;

    /**
     * ScaleIO represents a ScaleIO persistent volume attached and mounted on
     * Kubernetes nodes.
     */
    @JsonProperty(value = "scaleIO")
    private V1ScaleIOVolumeSource scaleIO;

    /**
     * Name of StorageClass to which this persistent volume belongs. Empty
     * value means that this volume does not belong to any StorageClass.
     */
    @JsonProperty(value = "storageClassName")
    private String storageClassName;

    /**
     * VsphereVolume represents a vSphere volume attached and mounted on
     * kubelets host machine.
     */
    @JsonProperty(value = "vsphereVolume")
    private V1VsphereVirtualDiskVolumeSource vsphereVolume;

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
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withAccessModes(List<String> accessModes) {
        this.accessModes = accessModes;
        return this;
    }

    /**
     * Get the awsElasticBlockStore value.
     *
     * @return the awsElasticBlockStore value
     */
    public V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore() {
        return this.awsElasticBlockStore;
    }

    /**
     * Set the awsElasticBlockStore value.
     *
     * @param awsElasticBlockStore the awsElasticBlockStore value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withAwsElasticBlockStore(V1AWSElasticBlockStoreVolumeSource awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
        return this;
    }

    /**
     * Get the azureDisk value.
     *
     * @return the azureDisk value
     */
    public V1AzureDiskVolumeSource azureDisk() {
        return this.azureDisk;
    }

    /**
     * Set the azureDisk value.
     *
     * @param azureDisk the azureDisk value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withAzureDisk(V1AzureDiskVolumeSource azureDisk) {
        this.azureDisk = azureDisk;
        return this;
    }

    /**
     * Get the azureFile value.
     *
     * @return the azureFile value
     */
    public V1AzureFileVolumeSource azureFile() {
        return this.azureFile;
    }

    /**
     * Set the azureFile value.
     *
     * @param azureFile the azureFile value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withAzureFile(V1AzureFileVolumeSource azureFile) {
        this.azureFile = azureFile;
        return this;
    }

    /**
     * Get the capacity value.
     *
     * @return the capacity value
     */
    public Map<String, String> capacity() {
        return this.capacity;
    }

    /**
     * Set the capacity value.
     *
     * @param capacity the capacity value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withCapacity(Map<String, String> capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the cephfs value.
     *
     * @return the cephfs value
     */
    public V1CephFSVolumeSource cephfs() {
        return this.cephfs;
    }

    /**
     * Set the cephfs value.
     *
     * @param cephfs the cephfs value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withCephfs(V1CephFSVolumeSource cephfs) {
        this.cephfs = cephfs;
        return this;
    }

    /**
     * Get the cinder value.
     *
     * @return the cinder value
     */
    public V1CinderVolumeSource cinder() {
        return this.cinder;
    }

    /**
     * Set the cinder value.
     *
     * @param cinder the cinder value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withCinder(V1CinderVolumeSource cinder) {
        this.cinder = cinder;
        return this;
    }

    /**
     * Get the claimRef value.
     *
     * @return the claimRef value
     */
    public V1ObjectReference claimRef() {
        return this.claimRef;
    }

    /**
     * Set the claimRef value.
     *
     * @param claimRef the claimRef value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withClaimRef(V1ObjectReference claimRef) {
        this.claimRef = claimRef;
        return this;
    }

    /**
     * Get the fc value.
     *
     * @return the fc value
     */
    public V1FCVolumeSource fc() {
        return this.fc;
    }

    /**
     * Set the fc value.
     *
     * @param fc the fc value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withFc(V1FCVolumeSource fc) {
        this.fc = fc;
        return this;
    }

    /**
     * Get the flexVolume value.
     *
     * @return the flexVolume value
     */
    public V1FlexVolumeSource flexVolume() {
        return this.flexVolume;
    }

    /**
     * Set the flexVolume value.
     *
     * @param flexVolume the flexVolume value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withFlexVolume(V1FlexVolumeSource flexVolume) {
        this.flexVolume = flexVolume;
        return this;
    }

    /**
     * Get the flocker value.
     *
     * @return the flocker value
     */
    public V1FlockerVolumeSource flocker() {
        return this.flocker;
    }

    /**
     * Set the flocker value.
     *
     * @param flocker the flocker value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withFlocker(V1FlockerVolumeSource flocker) {
        this.flocker = flocker;
        return this;
    }

    /**
     * Get the gcePersistentDisk value.
     *
     * @return the gcePersistentDisk value
     */
    public V1GCEPersistentDiskVolumeSource gcePersistentDisk() {
        return this.gcePersistentDisk;
    }

    /**
     * Set the gcePersistentDisk value.
     *
     * @param gcePersistentDisk the gcePersistentDisk value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withGcePersistentDisk(V1GCEPersistentDiskVolumeSource gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
        return this;
    }

    /**
     * Get the glusterfs value.
     *
     * @return the glusterfs value
     */
    public V1GlusterfsVolumeSource glusterfs() {
        return this.glusterfs;
    }

    /**
     * Set the glusterfs value.
     *
     * @param glusterfs the glusterfs value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withGlusterfs(V1GlusterfsVolumeSource glusterfs) {
        this.glusterfs = glusterfs;
        return this;
    }

    /**
     * Get the hostPath value.
     *
     * @return the hostPath value
     */
    public V1HostPathVolumeSource hostPath() {
        return this.hostPath;
    }

    /**
     * Set the hostPath value.
     *
     * @param hostPath the hostPath value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withHostPath(V1HostPathVolumeSource hostPath) {
        this.hostPath = hostPath;
        return this;
    }

    /**
     * Get the iscsi value.
     *
     * @return the iscsi value
     */
    public V1ISCSIVolumeSource iscsi() {
        return this.iscsi;
    }

    /**
     * Set the iscsi value.
     *
     * @param iscsi the iscsi value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withIscsi(V1ISCSIVolumeSource iscsi) {
        this.iscsi = iscsi;
        return this;
    }

    /**
     * Get the nfs value.
     *
     * @return the nfs value
     */
    public V1NFSVolumeSource nfs() {
        return this.nfs;
    }

    /**
     * Set the nfs value.
     *
     * @param nfs the nfs value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withNfs(V1NFSVolumeSource nfs) {
        this.nfs = nfs;
        return this;
    }

    /**
     * Get the persistentVolumeReclaimPolicy value.
     *
     * @return the persistentVolumeReclaimPolicy value
     */
    public String persistentVolumeReclaimPolicy() {
        return this.persistentVolumeReclaimPolicy;
    }

    /**
     * Set the persistentVolumeReclaimPolicy value.
     *
     * @param persistentVolumeReclaimPolicy the persistentVolumeReclaimPolicy value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withPersistentVolumeReclaimPolicy(String persistentVolumeReclaimPolicy) {
        this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
        return this;
    }

    /**
     * Get the photonPersistentDisk value.
     *
     * @return the photonPersistentDisk value
     */
    public V1PhotonPersistentDiskVolumeSource photonPersistentDisk() {
        return this.photonPersistentDisk;
    }

    /**
     * Set the photonPersistentDisk value.
     *
     * @param photonPersistentDisk the photonPersistentDisk value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withPhotonPersistentDisk(V1PhotonPersistentDiskVolumeSource photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
        return this;
    }

    /**
     * Get the portworxVolume value.
     *
     * @return the portworxVolume value
     */
    public V1PortworxVolumeSource portworxVolume() {
        return this.portworxVolume;
    }

    /**
     * Set the portworxVolume value.
     *
     * @param portworxVolume the portworxVolume value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withPortworxVolume(V1PortworxVolumeSource portworxVolume) {
        this.portworxVolume = portworxVolume;
        return this;
    }

    /**
     * Get the quobyte value.
     *
     * @return the quobyte value
     */
    public V1QuobyteVolumeSource quobyte() {
        return this.quobyte;
    }

    /**
     * Set the quobyte value.
     *
     * @param quobyte the quobyte value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withQuobyte(V1QuobyteVolumeSource quobyte) {
        this.quobyte = quobyte;
        return this;
    }

    /**
     * Get the rbd value.
     *
     * @return the rbd value
     */
    public V1RBDVolumeSource rbd() {
        return this.rbd;
    }

    /**
     * Set the rbd value.
     *
     * @param rbd the rbd value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withRbd(V1RBDVolumeSource rbd) {
        this.rbd = rbd;
        return this;
    }

    /**
     * Get the scaleIO value.
     *
     * @return the scaleIO value
     */
    public V1ScaleIOVolumeSource scaleIO() {
        return this.scaleIO;
    }

    /**
     * Set the scaleIO value.
     *
     * @param scaleIO the scaleIO value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withScaleIO(V1ScaleIOVolumeSource scaleIO) {
        this.scaleIO = scaleIO;
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
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withStorageClassName(String storageClassName) {
        this.storageClassName = storageClassName;
        return this;
    }

    /**
     * Get the vsphereVolume value.
     *
     * @return the vsphereVolume value
     */
    public V1VsphereVirtualDiskVolumeSource vsphereVolume() {
        return this.vsphereVolume;
    }

    /**
     * Set the vsphereVolume value.
     *
     * @param vsphereVolume the vsphereVolume value to set
     * @return the V1PersistentVolumeSpec object itself.
     */
    public V1PersistentVolumeSpec withVsphereVolume(V1VsphereVirtualDiskVolumeSource vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
        return this;
    }

}
