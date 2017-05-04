/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * APIGroup contains the name, the supported versions, and the preferred
 * version of a group.
 */
public class V1APIGroup {
    /**
     * APIVersion defines the versioned schema of this representation of an
     * object. Servers should convert recognized schemas to the latest internal
     * value, and may reject unrecognized values. More info:
     * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#resources.
     */
    @JsonProperty(value = "apiVersion")
    private String apiVersion;

    /**
     * Kind is a string value representing the REST resource this object
     * represents. Servers may infer this from the endpoint the client submits
     * requests to. Cannot be updated. In CamelCase. More info:
     * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * name is the name of the group.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * preferredVersion is the version preferred by the API server, which
     * probably is the storage version.
     */
    @JsonProperty(value = "preferredVersion")
    private V1GroupVersionForDiscovery preferredVersion;

    /**
     * a map of client CIDR to server address that is serving this group. This
     * is to help clients reach servers in the most network-efficient way
     * possible. Clients can use the appropriate server address as per the CIDR
     * that they match. In case of multiple matches, clients should use the
     * longest matching CIDR. The server returns only those CIDRs that it
     * thinks that the client can match. For example: the master will return an
     * internal IP CIDR only, if the client reaches the server using an
     * internal IP. Server looks at X-Forwarded-For header or X-Real-Ip header
     * or request.RemoteAddr (in that order) to get the client IP.
     */
    @JsonProperty(value = "serverAddressByClientCIDRs", required = true)
    private List<V1ServerAddressByClientCIDR> serverAddressByClientCIDRs;

    /**
     * versions are the versions supported in this group.
     */
    @JsonProperty(value = "versions", required = true)
    private List<V1GroupVersionForDiscovery> versions;

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
     * @return the V1APIGroup object itself.
     */
    public V1APIGroup withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
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
     * @return the V1APIGroup object itself.
     */
    public V1APIGroup withKind(String kind) {
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
     * @return the V1APIGroup object itself.
     */
    public V1APIGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the preferredVersion value.
     *
     * @return the preferredVersion value
     */
    public V1GroupVersionForDiscovery preferredVersion() {
        return this.preferredVersion;
    }

    /**
     * Set the preferredVersion value.
     *
     * @param preferredVersion the preferredVersion value to set
     * @return the V1APIGroup object itself.
     */
    public V1APIGroup withPreferredVersion(V1GroupVersionForDiscovery preferredVersion) {
        this.preferredVersion = preferredVersion;
        return this;
    }

    /**
     * Get the serverAddressByClientCIDRs value.
     *
     * @return the serverAddressByClientCIDRs value
     */
    public List<V1ServerAddressByClientCIDR> serverAddressByClientCIDRs() {
        return this.serverAddressByClientCIDRs;
    }

    /**
     * Set the serverAddressByClientCIDRs value.
     *
     * @param serverAddressByClientCIDRs the serverAddressByClientCIDRs value to set
     * @return the V1APIGroup object itself.
     */
    public V1APIGroup withServerAddressByClientCIDRs(List<V1ServerAddressByClientCIDR> serverAddressByClientCIDRs) {
        this.serverAddressByClientCIDRs = serverAddressByClientCIDRs;
        return this;
    }

    /**
     * Get the versions value.
     *
     * @return the versions value
     */
    public List<V1GroupVersionForDiscovery> versions() {
        return this.versions;
    }

    /**
     * Set the versions value.
     *
     * @param versions the versions value to set
     * @return the V1APIGroup object itself.
     */
    public V1APIGroup withVersions(List<V1GroupVersionForDiscovery> versions) {
        this.versions = versions;
        return this;
    }

}
