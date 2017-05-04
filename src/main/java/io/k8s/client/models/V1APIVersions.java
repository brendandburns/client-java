/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * APIVersions lists the versions that are available, to allow clients to
 * discover the API at /api, which is the root path of the legacy v1 API.
 */
public class V1APIVersions {
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
     * versions are the api versions that are available.
     */
    @JsonProperty(value = "versions", required = true)
    private List<String> versions;

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
     * @return the V1APIVersions object itself.
     */
    public V1APIVersions withApiVersion(String apiVersion) {
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
     * @return the V1APIVersions object itself.
     */
    public V1APIVersions withKind(String kind) {
        this.kind = kind;
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
     * @return the V1APIVersions object itself.
     */
    public V1APIVersions withServerAddressByClientCIDRs(List<V1ServerAddressByClientCIDR> serverAddressByClientCIDRs) {
        this.serverAddressByClientCIDRs = serverAddressByClientCIDRs;
        return this;
    }

    /**
     * Get the versions value.
     *
     * @return the versions value
     */
    public List<String> versions() {
        return this.versions;
    }

    /**
     * Set the versions value.
     *
     * @param versions the versions value to set
     * @return the V1APIVersions object itself.
     */
    public V1APIVersions withVersions(List<String> versions) {
        this.versions = versions;
        return this;
    }

}
