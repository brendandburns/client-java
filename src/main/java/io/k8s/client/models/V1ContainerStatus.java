/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ContainerStatus contains details for the current status of this container.
 */
public class V1ContainerStatus {
    /**
     * Container's ID in the format 'docker://&lt;container_id&gt;'. More info:
     * http://kubernetes.io/docs/user-guide/container-environment#container-information.
     */
    @JsonProperty(value = "containerID")
    private String containerID;

    /**
     * The image the container is running. More info:
     * http://kubernetes.io/docs/user-guide/images.
     */
    @JsonProperty(value = "image", required = true)
    private String image;

    /**
     * ImageID of the container's image.
     */
    @JsonProperty(value = "imageID", required = true)
    private String imageID;

    /**
     * Details about the container's last termination condition.
     */
    @JsonProperty(value = "lastState")
    private V1ContainerState lastState;

    /**
     * This must be a DNS_LABEL. Each container in a pod must have a unique
     * name. Cannot be updated.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Specifies whether the container has passed its readiness probe.
     */
    @JsonProperty(value = "ready", required = true)
    private boolean ready;

    /**
     * The number of times the container has been restarted, currently based on
     * the number of dead containers that have not yet been removed. Note that
     * this is calculated from dead containers. But those containers are
     * subject to garbage collection. This value will get capped at 5 by GC.
     */
    @JsonProperty(value = "restartCount", required = true)
    private int restartCount;

    /**
     * Details about the container's current condition.
     */
    @JsonProperty(value = "state")
    private V1ContainerState state;

    /**
     * Get the containerID value.
     *
     * @return the containerID value
     */
    public String containerID() {
        return this.containerID;
    }

    /**
     * Set the containerID value.
     *
     * @param containerID the containerID value to set
     * @return the V1ContainerStatus object itself.
     */
    public V1ContainerStatus withContainerID(String containerID) {
        this.containerID = containerID;
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
     * @return the V1ContainerStatus object itself.
     */
    public V1ContainerStatus withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * Get the imageID value.
     *
     * @return the imageID value
     */
    public String imageID() {
        return this.imageID;
    }

    /**
     * Set the imageID value.
     *
     * @param imageID the imageID value to set
     * @return the V1ContainerStatus object itself.
     */
    public V1ContainerStatus withImageID(String imageID) {
        this.imageID = imageID;
        return this;
    }

    /**
     * Get the lastState value.
     *
     * @return the lastState value
     */
    public V1ContainerState lastState() {
        return this.lastState;
    }

    /**
     * Set the lastState value.
     *
     * @param lastState the lastState value to set
     * @return the V1ContainerStatus object itself.
     */
    public V1ContainerStatus withLastState(V1ContainerState lastState) {
        this.lastState = lastState;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the V1ContainerStatus object itself.
     */
    public V1ContainerStatus withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the ready value.
     *
     * @return the ready value
     */
    public boolean ready() {
        return this.ready;
    }

    /**
     * Set the ready value.
     *
     * @param ready the ready value to set
     * @return the V1ContainerStatus object itself.
     */
    public V1ContainerStatus withReady(boolean ready) {
        this.ready = ready;
        return this;
    }

    /**
     * Get the restartCount value.
     *
     * @return the restartCount value
     */
    public int restartCount() {
        return this.restartCount;
    }

    /**
     * Set the restartCount value.
     *
     * @param restartCount the restartCount value to set
     * @return the V1ContainerStatus object itself.
     */
    public V1ContainerStatus withRestartCount(int restartCount) {
        this.restartCount = restartCount;
        return this;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public V1ContainerState state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the V1ContainerStatus object itself.
     */
    public V1ContainerStatus withState(V1ContainerState state) {
        this.state = state;
        return this;
    }

}
