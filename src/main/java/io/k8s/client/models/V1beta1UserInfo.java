/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * UserInfo holds the information about the user needed to implement the
 * user.Info interface.
 */
public class V1beta1UserInfo {
    /**
     * Any additional information provided by the authenticator.
     */
    @JsonProperty(value = "extra")
    private Map<String, List<String>> extra;

    /**
     * The names of groups this user is a part of.
     */
    @JsonProperty(value = "groups")
    private List<String> groups;

    /**
     * A unique value that identifies this user across time. If this user is
     * deleted and another user by the same name is added, they will have
     * different UIDs.
     */
    @JsonProperty(value = "uid")
    private String uid;

    /**
     * The name that uniquely identifies this user among all active users.
     */
    @JsonProperty(value = "username")
    private String username;

    /**
     * Get the extra value.
     *
     * @return the extra value
     */
    public Map<String, List<String>> extra() {
        return this.extra;
    }

    /**
     * Set the extra value.
     *
     * @param extra the extra value to set
     * @return the V1beta1UserInfo object itself.
     */
    public V1beta1UserInfo withExtra(Map<String, List<String>> extra) {
        this.extra = extra;
        return this;
    }

    /**
     * Get the groups value.
     *
     * @return the groups value
     */
    public List<String> groups() {
        return this.groups;
    }

    /**
     * Set the groups value.
     *
     * @param groups the groups value to set
     * @return the V1beta1UserInfo object itself.
     */
    public V1beta1UserInfo withGroups(List<String> groups) {
        this.groups = groups;
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
     * @return the V1beta1UserInfo object itself.
     */
    public V1beta1UserInfo withUid(String uid) {
        this.uid = uid;
        return this;
    }

    /**
     * Get the username value.
     *
     * @return the username value
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username value.
     *
     * @param username the username value to set
     * @return the V1beta1UserInfo object itself.
     */
    public V1beta1UserInfo withUsername(String username) {
        this.username = username;
        return this;
    }

}
