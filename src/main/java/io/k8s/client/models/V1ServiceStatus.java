/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ServiceStatus represents the current status of a service.
 */
public class V1ServiceStatus {
    /**
     * LoadBalancer contains the current status of the load-balancer, if one is
     * present.
     */
    @JsonProperty(value = "loadBalancer")
    private V1LoadBalancerStatus loadBalancer;

    /**
     * Get the loadBalancer value.
     *
     * @return the loadBalancer value
     */
    public V1LoadBalancerStatus loadBalancer() {
        return this.loadBalancer;
    }

    /**
     * Set the loadBalancer value.
     *
     * @param loadBalancer the loadBalancer value to set
     * @return the V1ServiceStatus object itself.
     */
    public V1ServiceStatus withLoadBalancer(V1LoadBalancerStatus loadBalancer) {
        this.loadBalancer = loadBalancer;
        return this;
    }

}
