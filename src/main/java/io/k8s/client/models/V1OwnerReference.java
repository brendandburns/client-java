/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * OwnerReference contains enough information to let you identify an owning
 * object. Currently, an owning object must be in the same namespace, so there
 * is no namespace field.
 */
public class V1OwnerReference {
    /**
     * API version of the referent.
     */
    @JsonProperty(value = "apiVersion", required = true)
    private String apiVersion;

    /**
     * If true, AND if the owner has the "foregroundDeletion" finalizer, then
     * the owner cannot be deleted from the key-value store until this
     * reference is removed. Defaults to false. To set this field, a user needs
     * "delete" permission of the owner, otherwise 422 (Unprocessable Entity)
     * will be returned.
     */
    @JsonProperty(value = "blockOwnerDeletion")
    private Boolean blockOwnerDeletion;

    /**
     * If true, this reference points to the managing controller.
     */
    @JsonProperty(value = "controller")
    private Boolean controller;

    /**
     * Kind of the referent. More info:
     * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds.
     */
    @JsonProperty(value = "kind", required = true)
    private String kind;

    /**
     * Name of the referent. More info:
     * http://kubernetes.io/docs/user-guide/identifiers#names.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * UID of the referent. More info:
     * http://kubernetes.io/docs/user-guide/identifiers#uids.
     */
    @JsonProperty(value = "uid", required = true)
    private String uid;

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
     * @return the V1OwnerReference object itself.
     */
    public V1OwnerReference withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get the blockOwnerDeletion value.
     *
     * @return the blockOwnerDeletion value
     */
    public Boolean blockOwnerDeletion() {
        return this.blockOwnerDeletion;
    }

    /**
     * Set the blockOwnerDeletion value.
     *
     * @param blockOwnerDeletion the blockOwnerDeletion value to set
     * @return the V1OwnerReference object itself.
     */
    public V1OwnerReference withBlockOwnerDeletion(Boolean blockOwnerDeletion) {
        this.blockOwnerDeletion = blockOwnerDeletion;
        return this;
    }

    /**
     * Get the controller value.
     *
     * @return the controller value
     */
    public Boolean controller() {
        return this.controller;
    }

    /**
     * Set the controller value.
     *
     * @param controller the controller value to set
     * @return the V1OwnerReference object itself.
     */
    public V1OwnerReference withController(Boolean controller) {
        this.controller = controller;
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
     * @return the V1OwnerReference object itself.
     */
    public V1OwnerReference withKind(String kind) {
        this.kind = kind;
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
     * @return the V1OwnerReference object itself.
     */
    public V1OwnerReference withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the uid value.
     *
     * @return the uid value
     */
    public String uid() {
        return this.uid;
    }

    /**
     * Set the uid value.
     *
     * @param uid the uid value to set
     * @return the V1OwnerReference object itself.
     */
    public V1OwnerReference withUid(String uid) {
        this.uid = uid;
        return this;
    }

}
