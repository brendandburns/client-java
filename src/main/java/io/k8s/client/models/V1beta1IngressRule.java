/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IngressRule represents the rules mapping the paths under a specified host to
 * the related backend services. Incoming requests are first evaluated for a
 * host match, then routed to the backend associated with the matching
 * IngressRuleValue.
 */
public class V1beta1IngressRule {
    /**
     * Host is the fully qualified domain name of a network host, as defined by
     * RFC 3986. Note the following deviations from the "host" part of the URI
     * as defined in the RFC: 1. IPs are not allowed. Currently an
     * IngressRuleValue can only apply to the
     * IP in the Spec of the parent Ingress.
     * 2. The `:` delimiter is not respected because ports are not allowed.
     * Currently the port of an Ingress is implicitly :80 for http and
     * :443 for https.
     * Both these may change in the future. Incoming requests are matched
     * against the host before the IngressRuleValue. If the host is
     * unspecified, the Ingress routes all traffic based on the specified
     * IngressRuleValue.
     */
    @JsonProperty(value = "host")
    private String host;

    /**
     * The http property.
     */
    @JsonProperty(value = "http")
    private V1beta1HTTPIngressRuleValue http;

    /**
     * Get the host value.
     *
     * @return the host value
     */
    public String host() {
        return this.host;
    }

    /**
     * Set the host value.
     *
     * @param host the host value to set
     * @return the V1beta1IngressRule object itself.
     */
    public V1beta1IngressRule withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * Get the http value.
     *
     * @return the http value
     */
    public V1beta1HTTPIngressRuleValue http() {
        return this.http;
    }

    /**
     * Set the http value.
     *
     * @param http the http value to set
     * @return the V1beta1IngressRule object itself.
     */
    public V1beta1IngressRule withHttp(V1beta1HTTPIngressRuleValue http) {
        this.http = http;
        return this;
    }

}
