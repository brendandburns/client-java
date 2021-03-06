/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StatusDetails is a set of additional properties that MAY be set by the
 * server to provide additional information about a response. The Reason field
 * of a Status object defines what attributes will be set. Clients must ignore
 * fields that do not match the defined type of each attribute, and should
 * assume that any attribute may be empty, invalid, or under defined.
 */
public class V1StatusDetails {
    /**
     * The Causes array includes more details associated with the StatusReason
     * failure. Not all StatusReasons may provide detailed causes.
     */
    @JsonProperty(value = "causes")
    private List<V1StatusCause> causes;

    /**
     * The group attribute of the resource associated with the status
     * StatusReason.
     */
    @JsonProperty(value = "group")
    private String group;

    /**
     * The kind attribute of the resource associated with the status
     * StatusReason. On some operations may differ from the requested resource
     * Kind. More info:
     * http://releases.k8s.io/HEAD/docs/devel/api-conventions.md#types-kinds.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * The name attribute of the resource associated with the status
     * StatusReason (when there is a single name which can be described).
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * If specified, the time in seconds before the operation should be
     * retried.
     */
    @JsonProperty(value = "retryAfterSeconds")
    private Integer retryAfterSeconds;

    /**
     * Get the causes value.
     *
     * @return the causes value
     */
    public List<V1StatusCause> causes() {
        return this.causes;
    }

    /**
     * Set the causes value.
     *
     * @param causes the causes value to set
     * @return the V1StatusDetails object itself.
     */
    public V1StatusDetails withCauses(List<V1StatusCause> causes) {
        this.causes = causes;
        return this;
    }

    /**
     * Get the group value.
     *
     * @return the group value
     */
    public String group() {
        return this.group;
    }

    /**
     * Set the group value.
     *
     * @param group the group value to set
     * @return the V1StatusDetails object itself.
     */
    public V1StatusDetails withGroup(String group) {
        this.group = group;
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
     * @return the V1StatusDetails object itself.
     */
    public V1StatusDetails withKind(String kind) {
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
     * @return the V1StatusDetails object itself.
     */
    public V1StatusDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the retryAfterSeconds value.
     *
     * @return the retryAfterSeconds value
     */
    public Integer retryAfterSeconds() {
        return this.retryAfterSeconds;
    }

    /**
     * Set the retryAfterSeconds value.
     *
     * @param retryAfterSeconds the retryAfterSeconds value to set
     * @return the V1StatusDetails object itself.
     */
    public V1StatusDetails withRetryAfterSeconds(Integer retryAfterSeconds) {
        this.retryAfterSeconds = retryAfterSeconds;
        return this;
    }

}
