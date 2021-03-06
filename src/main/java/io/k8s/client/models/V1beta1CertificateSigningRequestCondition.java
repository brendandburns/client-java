/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The V1beta1CertificateSigningRequestCondition model.
 */
public class V1beta1CertificateSigningRequestCondition {
    /**
     * timestamp for the last update to this condition.
     */
    @JsonProperty(value = "lastUpdateTime")
    private DateTime lastUpdateTime;

    /**
     * human readable message with details about the request state.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * brief reason for the request state.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * request approval state, currently Approved or Denied.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Get the lastUpdateTime value.
     *
     * @return the lastUpdateTime value
     */
    public DateTime lastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * Set the lastUpdateTime value.
     *
     * @param lastUpdateTime the lastUpdateTime value to set
     * @return the V1beta1CertificateSigningRequestCondition object itself.
     */
    public V1beta1CertificateSigningRequestCondition withLastUpdateTime(DateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the V1beta1CertificateSigningRequestCondition object itself.
     */
    public V1beta1CertificateSigningRequestCondition withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the reason value.
     *
     * @return the reason value
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason value.
     *
     * @param reason the reason value to set
     * @return the V1beta1CertificateSigningRequestCondition object itself.
     */
    public V1beta1CertificateSigningRequestCondition withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the V1beta1CertificateSigningRequestCondition object itself.
     */
    public V1beta1CertificateSigningRequestCondition withType(String type) {
        this.type = type;
        return this;
    }

}
