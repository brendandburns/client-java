/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents downward API info for projecting into a projected volume. Note
 * that this is identical to a downwardAPI volume source without the default
 * mode.
 */
public class V1DownwardAPIProjection {
    /**
     * Items is a list of DownwardAPIVolume file.
     */
    @JsonProperty(value = "items")
    private List<V1DownwardAPIVolumeFile> items;

    /**
     * Get the items value.
     *
     * @return the items value
     */
    public List<V1DownwardAPIVolumeFile> items() {
        return this.items;
    }

    /**
     * Set the items value.
     *
     * @param items the items value to set
     * @return the V1DownwardAPIProjection object itself.
     */
    public V1DownwardAPIProjection withItems(List<V1DownwardAPIVolumeFile> items) {
        this.items = items;
        return this;
    }

}
