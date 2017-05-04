/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The weights of all of the matched WeightedPodAffinityTerm fields are added
 * per-node to find the most preferred node(s).
 */
public class V1WeightedPodAffinityTerm {
    /**
     * Required. A pod affinity term, associated with the corresponding weight.
     */
    @JsonProperty(value = "podAffinityTerm", required = true)
    private V1PodAffinityTerm podAffinityTerm;

    /**
     * weight associated with matching the corresponding podAffinityTerm, in
     * the range 1-100.
     */
    @JsonProperty(value = "weight", required = true)
    private int weight;

    /**
     * Get the podAffinityTerm value.
     *
     * @return the podAffinityTerm value
     */
    public V1PodAffinityTerm podAffinityTerm() {
        return this.podAffinityTerm;
    }

    /**
     * Set the podAffinityTerm value.
     *
     * @param podAffinityTerm the podAffinityTerm value to set
     * @return the V1WeightedPodAffinityTerm object itself.
     */
    public V1WeightedPodAffinityTerm withPodAffinityTerm(V1PodAffinityTerm podAffinityTerm) {
        this.podAffinityTerm = podAffinityTerm;
        return this;
    }

    /**
     * Get the weight value.
     *
     * @return the weight value
     */
    public int weight() {
        return this.weight;
    }

    /**
     * Set the weight value.
     *
     * @param weight the weight value to set
     * @return the V1WeightedPodAffinityTerm object itself.
     */
    public V1WeightedPodAffinityTerm withWeight(int weight) {
        this.weight = weight;
        return this;
    }

}
