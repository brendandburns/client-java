/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * HTTPIngressPath associates a path regex with a backend. Incoming urls
 * matching the path are forwarded to the backend.
 */
public class V1beta1HTTPIngressPath {
    /**
     * Backend defines the referenced service endpoint to which the traffic
     * will be forwarded to.
     */
    @JsonProperty(value = "backend", required = true)
    private V1beta1IngressBackend backend;

    /**
     * Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this
     * follows the egrep/unix syntax, not the perl syntax) matched against the
     * path of an incoming request. Currently it can contain characters
     * disallowed from the conventional "path" part of a URL as defined by RFC
     * 3986. Paths must begin with a '/'. If unspecified, the path defaults to
     * a catch all sending traffic to the backend.
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * Get the backend value.
     *
     * @return the backend value
     */
    public V1beta1IngressBackend backend() {
        return this.backend;
    }

    /**
     * Set the backend value.
     *
     * @param backend the backend value to set
     * @return the V1beta1HTTPIngressPath object itself.
     */
    public V1beta1HTTPIngressPath withBackend(V1beta1IngressBackend backend) {
        this.backend = backend;
        return this;
    }

    /**
     * Get the path value.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path value.
     *
     * @param path the path value to set
     * @return the V1beta1HTTPIngressPath object itself.
     */
    public V1beta1HTTPIngressPath withPath(String path) {
        this.path = path;
        return this;
    }

}
