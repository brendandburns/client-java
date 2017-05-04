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
 * NodeStatus is information about the current status of a node.
 */
public class V1NodeStatus {
    /**
     * List of addresses reachable to the node. Queried from cloud provider, if
     * available. More info:
     * http://releases.k8s.io/HEAD/docs/admin/node.md#node-addresses.
     */
    @JsonProperty(value = "addresses")
    private List<V1NodeAddress> addresses;

    /**
     * Allocatable represents the resources of a node that are available for
     * scheduling. Defaults to Capacity.
     */
    @JsonProperty(value = "allocatable")
    private Map<String, String> allocatable;

    /**
     * Capacity represents the total resources of a node. More info:
     * http://kubernetes.io/docs/user-guide/persistent-volumes#capacity for
     * more details.
     */
    @JsonProperty(value = "capacity")
    private Map<String, String> capacity;

    /**
     * Conditions is an array of current observed node conditions. More info:
     * http://releases.k8s.io/HEAD/docs/admin/node.md#node-condition.
     */
    @JsonProperty(value = "conditions")
    private List<V1NodeCondition> conditions;

    /**
     * Endpoints of daemons running on the Node.
     */
    @JsonProperty(value = "daemonEndpoints")
    private V1NodeDaemonEndpoints daemonEndpoints;

    /**
     * List of container images on this node.
     */
    @JsonProperty(value = "images")
    private List<V1ContainerImage> images;

    /**
     * Set of ids/uuids to uniquely identify the node. More info:
     * http://releases.k8s.io/HEAD/docs/admin/node.md#node-info.
     */
    @JsonProperty(value = "nodeInfo")
    private V1NodeSystemInfo nodeInfo;

    /**
     * NodePhase is the recently observed lifecycle phase of the node. More
     * info: http://releases.k8s.io/HEAD/docs/admin/node.md#node-phase The
     * field is never populated, and now is deprecated.
     */
    @JsonProperty(value = "phase")
    private String phase;

    /**
     * List of volumes that are attached to the node.
     */
    @JsonProperty(value = "volumesAttached")
    private List<V1AttachedVolume> volumesAttached;

    /**
     * List of attachable volumes in use (mounted) by the node.
     */
    @JsonProperty(value = "volumesInUse")
    private List<String> volumesInUse;

    /**
     * Get the addresses value.
     *
     * @return the addresses value
     */
    public List<V1NodeAddress> addresses() {
        return this.addresses;
    }

    /**
     * Set the addresses value.
     *
     * @param addresses the addresses value to set
     * @return the V1NodeStatus object itself.
     */
    public V1NodeStatus withAddresses(List<V1NodeAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     * Get the allocatable value.
     *
     * @return the allocatable value
     */
    public Map<String, String> allocatable() {
        return this.allocatable;
    }

    /**
     * Set the allocatable value.
     *
     * @param allocatable the allocatable value to set
     * @return the V1NodeStatus object itself.
     */
    public V1NodeStatus withAllocatable(Map<String, String> allocatable) {
        this.allocatable = allocatable;
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
     * @return the V1NodeStatus object itself.
     */
    public V1NodeStatus withCapacity(Map<String, String> capacity) {
        this.capacity = capacity;
        return this;
    }

    /**
     * Get the conditions value.
     *
     * @return the conditions value
     */
    public List<V1NodeCondition> conditions() {
        return this.conditions;
    }

    /**
     * Set the conditions value.
     *
     * @param conditions the conditions value to set
     * @return the V1NodeStatus object itself.
     */
    public V1NodeStatus withConditions(List<V1NodeCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Get the daemonEndpoints value.
     *
     * @return the daemonEndpoints value
     */
    public V1NodeDaemonEndpoints daemonEndpoints() {
        return this.daemonEndpoints;
    }

    /**
     * Set the daemonEndpoints value.
     *
     * @param daemonEndpoints the daemonEndpoints value to set
     * @return the V1NodeStatus object itself.
     */
    public V1NodeStatus withDaemonEndpoints(V1NodeDaemonEndpoints daemonEndpoints) {
        this.daemonEndpoints = daemonEndpoints;
        return this;
    }

    /**
     * Get the images value.
     *
     * @return the images value
     */
    public List<V1ContainerImage> images() {
        return this.images;
    }

    /**
     * Set the images value.
     *
     * @param images the images value to set
     * @return the V1NodeStatus object itself.
     */
    public V1NodeStatus withImages(List<V1ContainerImage> images) {
        this.images = images;
        return this;
    }

    /**
     * Get the nodeInfo value.
     *
     * @return the nodeInfo value
     */
    public V1NodeSystemInfo nodeInfo() {
        return this.nodeInfo;
    }

    /**
     * Set the nodeInfo value.
     *
     * @param nodeInfo the nodeInfo value to set
     * @return the V1NodeStatus object itself.
     */
    public V1NodeStatus withNodeInfo(V1NodeSystemInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
        return this;
    }

    /**
     * Get the phase value.
     *
     * @return the phase value
     */
    public String phase() {
        return this.phase;
    }

    /**
     * Set the phase value.
     *
     * @param phase the phase value to set
     * @return the V1NodeStatus object itself.
     */
    public V1NodeStatus withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * Get the volumesAttached value.
     *
     * @return the volumesAttached value
     */
    public List<V1AttachedVolume> volumesAttached() {
        return this.volumesAttached;
    }

    /**
     * Set the volumesAttached value.
     *
     * @param volumesAttached the volumesAttached value to set
     * @return the V1NodeStatus object itself.
     */
    public V1NodeStatus withVolumesAttached(List<V1AttachedVolume> volumesAttached) {
        this.volumesAttached = volumesAttached;
        return this;
    }

    /**
     * Get the volumesInUse value.
     *
     * @return the volumesInUse value
     */
    public List<String> volumesInUse() {
        return this.volumesInUse;
    }

    /**
     * Set the volumesInUse value.
     *
     * @param volumesInUse the volumesInUse value to set
     * @return the V1NodeStatus object itself.
     */
    public V1NodeStatus withVolumesInUse(List<String> volumesInUse) {
        this.volumesInUse = volumesInUse;
        return this;
    }

}