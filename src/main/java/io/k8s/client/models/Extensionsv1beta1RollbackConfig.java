/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Extensionsv1beta1RollbackConfig model.
 */
public class Extensionsv1beta1RollbackConfig {
    /**
     * The revision to rollback to. If set to 0, rollbck to the last revision.
     */
    @JsonProperty(value = "revision")
    private Long revision;

    /**
     * Get the revision value.
     *
     * @return the revision value
     */
    public Long revision() {
        return this.revision;
    }

    /**
     * Set the revision value.
     *
     * @param revision the revision value to set
     * @return the Extensionsv1beta1RollbackConfig object itself.
     */
    public Extensionsv1beta1RollbackConfig withRevision(Long revision) {
        this.revision = revision;
        return this;
    }

}
