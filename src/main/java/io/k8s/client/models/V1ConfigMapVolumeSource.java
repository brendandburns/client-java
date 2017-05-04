/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Adapts a ConfigMap into a volume.
 *
 * The contents of the target ConfigMap's Data field will be presented in a
 * volume as files using the keys in the Data field as the file names, unless
 * the items element is populated with specific mappings of keys to paths.
 * ConfigMap volumes support ownership management and SELinux relabeling.
 */
public class V1ConfigMapVolumeSource {
    /**
     * Optional: mode bits to use on created files by default. Must be a value
     * between 0 and 0777. Defaults to 0644. Directories within the path are
     * not affected by this setting. This might be in conflict with other
     * options that affect the file mode, like fsGroup, and the result can be
     * other mode bits set.
     */
    @JsonProperty(value = "defaultMode")
    private Integer defaultMode;

    /**
     * If unspecified, each key-value pair in the Data field of the referenced
     * ConfigMap will be projected into the volume as a file whose name is the
     * key and content is the value. If specified, the listed keys will be
     * projected into the specified paths, and unlisted keys will not be
     * present. If a key is specified which is not present in the ConfigMap,
     * the volume setup will error unless it is marked optional. Paths must be
     * relative and may not contain the '..' path or start with '..'.
     */
    @JsonProperty(value = "items")
    private List<V1KeyToPath> items;

    /**
     * Name of the referent. More info:
     * http://kubernetes.io/docs/user-guide/identifiers#names.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Specify whether the ConfigMap or it's keys must be defined.
     */
    @JsonProperty(value = "optional")
    private Boolean optional;

    /**
     * Get the defaultMode value.
     *
     * @return the defaultMode value
     */
    public Integer defaultMode() {
        return this.defaultMode;
    }

    /**
     * Set the defaultMode value.
     *
     * @param defaultMode the defaultMode value to set
     * @return the V1ConfigMapVolumeSource object itself.
     */
    public V1ConfigMapVolumeSource withDefaultMode(Integer defaultMode) {
        this.defaultMode = defaultMode;
        return this;
    }

    /**
     * Get the items value.
     *
     * @return the items value
     */
    public List<V1KeyToPath> items() {
        return this.items;
    }

    /**
     * Set the items value.
     *
     * @param items the items value to set
     * @return the V1ConfigMapVolumeSource object itself.
     */
    public V1ConfigMapVolumeSource withItems(List<V1KeyToPath> items) {
        this.items = items;
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
     * @return the V1ConfigMapVolumeSource object itself.
     */
    public V1ConfigMapVolumeSource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the optional value.
     *
     * @return the optional value
     */
    public Boolean optional() {
        return this.optional;
    }

    /**
     * Set the optional value.
     *
     * @param optional the optional value to set
     * @return the V1ConfigMapVolumeSource object itself.
     */
    public V1ConfigMapVolumeSource withOptional(Boolean optional) {
        this.optional = optional;
        return this;
    }

}