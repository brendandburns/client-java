/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The V1beta1NetworkPolicySpec model.
 */
public class V1beta1NetworkPolicySpec {
    /**
     * List of ingress rules to be applied to the selected pods. Traffic is
     * allowed to a pod if namespace.networkPolicy.ingress.isolation is
     * undefined and cluster policy allows it, OR if the traffic source is the
     * pod's local node, OR if the traffic matches at least one ingress rule
     * across all of the NetworkPolicy objects whose podSelector matches the
     * pod. If this field is empty then this NetworkPolicy does not affect
     * ingress isolation. If this field is present and contains at least one
     * rule, this policy allows any traffic which matches at least one of the
     * ingress rules in this list.
     */
    @JsonProperty(value = "ingress")
    private List<V1beta1NetworkPolicyIngressRule> ingress;

    /**
     * Selects the pods to which this NetworkPolicy object applies.  The array
     * of ingress rules is applied to any pods selected by this field. Multiple
     * network policies can select the same set of pods.  In this case, the
     * ingress rules for each are combined additively. This field is NOT
     * optional and follows standard label selector semantics. An empty
     * podSelector matches all pods in this namespace.
     */
    @JsonProperty(value = "podSelector", required = true)
    private V1LabelSelector podSelector;

    /**
     * Get the ingress value.
     *
     * @return the ingress value
     */
    public List<V1beta1NetworkPolicyIngressRule> ingress() {
        return this.ingress;
    }

    /**
     * Set the ingress value.
     *
     * @param ingress the ingress value to set
     * @return the V1beta1NetworkPolicySpec object itself.
     */
    public V1beta1NetworkPolicySpec withIngress(List<V1beta1NetworkPolicyIngressRule> ingress) {
        this.ingress = ingress;
        return this;
    }

    /**
     * Get the podSelector value.
     *
     * @return the podSelector value
     */
    public V1LabelSelector podSelector() {
        return this.podSelector;
    }

    /**
     * Set the podSelector value.
     *
     * @param podSelector the podSelector value to set
     * @return the V1beta1NetworkPolicySpec object itself.
     */
    public V1beta1NetworkPolicySpec withPodSelector(V1LabelSelector podSelector) {
        this.podSelector = podSelector;
        return this;
    }

}
