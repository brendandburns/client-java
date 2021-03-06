/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The pod this Toleration is attached to tolerates any taint that matches the
 * triple &lt;key,value,effect&gt; using the matching operator
 * &lt;operator&gt;.
 */
public class V1Toleration {
    /**
     * Effect indicates the taint effect to match. Empty means match all taint
     * effects. When specified, allowed values are NoSchedule, PreferNoSchedule
     * and NoExecute.
     */
    @JsonProperty(value = "effect")
    private String effect;

    /**
     * Key is the taint key that the toleration applies to. Empty means match
     * all taint keys. If the key is empty, operator must be Exists; this
     * combination means to match all values and all keys.
     */
    @JsonProperty(value = "key")
    private String key;

    /**
     * Operator represents a key's relationship to the value. Valid operators
     * are Exists and Equal. Defaults to Equal. Exists is equivalent to
     * wildcard for value, so that a pod can tolerate all taints of a
     * particular category.
     */
    @JsonProperty(value = "operator")
    private String operator;

    /**
     * TolerationSeconds represents the period of time the toleration (which
     * must be of effect NoExecute, otherwise this field is ignored) tolerates
     * the taint. By default, it is not set, which means tolerate the taint
     * forever (do not evict). Zero and negative values will be treated as 0
     * (evict immediately) by the system.
     */
    @JsonProperty(value = "tolerationSeconds")
    private Long tolerationSeconds;

    /**
     * Value is the taint value the toleration matches to. If the operator is
     * Exists, the value should be empty, otherwise just a regular string.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the effect value.
     *
     * @return the effect value
     */
    public String effect() {
        return this.effect;
    }

    /**
     * Set the effect value.
     *
     * @param effect the effect value to set
     * @return the V1Toleration object itself.
     */
    public V1Toleration withEffect(String effect) {
        this.effect = effect;
        return this;
    }

    /**
     * Get the key value.
     *
     * @return the key value
     */
    public String key() {
        return this.key;
    }

    /**
     * Set the key value.
     *
     * @param key the key value to set
     * @return the V1Toleration object itself.
     */
    public V1Toleration withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get the operator value.
     *
     * @return the operator value
     */
    public String operator() {
        return this.operator;
    }

    /**
     * Set the operator value.
     *
     * @param operator the operator value to set
     * @return the V1Toleration object itself.
     */
    public V1Toleration withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the tolerationSeconds value.
     *
     * @return the tolerationSeconds value
     */
    public Long tolerationSeconds() {
        return this.tolerationSeconds;
    }

    /**
     * Set the tolerationSeconds value.
     *
     * @param tolerationSeconds the tolerationSeconds value to set
     * @return the V1Toleration object itself.
     */
    public V1Toleration withTolerationSeconds(Long tolerationSeconds) {
        this.tolerationSeconds = tolerationSeconds;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the V1Toleration object itself.
     */
    public V1Toleration withValue(String value) {
        this.value = value;
        return this;
    }

}
