/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Event represents a single event to a watched resource.
 */
public class V1WatchEvent {
    /**
     * Object is:
     * * If Type is Added or Modified: the new state of the object.
     * * If Type is Deleted: the state of the object immediately before
     * deletion.
     * * If Type is Error: *Status is recommended; other types may make sense
     * depending on context.
     */
    @JsonProperty(value = "object", required = true)
    private RuntimeRawExtension objectProperty;

    /**
     * The type property.
     */
    @JsonProperty(value = "type", required = true)
    private String type;

    /**
     * Get the objectProperty value.
     *
     * @return the objectProperty value
     */
    public RuntimeRawExtension objectProperty() {
        return this.objectProperty;
    }

    /**
     * Set the objectProperty value.
     *
     * @param objectProperty the objectProperty value to set
     * @return the V1WatchEvent object itself.
     */
    public V1WatchEvent withObjectProperty(RuntimeRawExtension objectProperty) {
        this.objectProperty = objectProperty;
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
     * @return the V1WatchEvent object itself.
     */
    public V1WatchEvent withType(String type) {
        this.type = type;
        return this;
    }

}
