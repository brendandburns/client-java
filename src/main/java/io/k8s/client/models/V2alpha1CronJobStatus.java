/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CronJobStatus represents the current state of a cron job.
 */
public class V2alpha1CronJobStatus {
    /**
     * Active holds pointers to currently running jobs.
     */
    @JsonProperty(value = "active")
    private List<V1ObjectReference> active;

    /**
     * LastScheduleTime keeps information of when was the last time the job was
     * successfully scheduled.
     */
    @JsonProperty(value = "lastScheduleTime")
    private DateTime lastScheduleTime;

    /**
     * Get the active value.
     *
     * @return the active value
     */
    public List<V1ObjectReference> active() {
        return this.active;
    }

    /**
     * Set the active value.
     *
     * @param active the active value to set
     * @return the V2alpha1CronJobStatus object itself.
     */
    public V2alpha1CronJobStatus withActive(List<V1ObjectReference> active) {
        this.active = active;
        return this;
    }

    /**
     * Get the lastScheduleTime value.
     *
     * @return the lastScheduleTime value
     */
    public DateTime lastScheduleTime() {
        return this.lastScheduleTime;
    }

    /**
     * Set the lastScheduleTime value.
     *
     * @param lastScheduleTime the lastScheduleTime value to set
     * @return the V2alpha1CronJobStatus object itself.
     */
    public V2alpha1CronJobStatus withLastScheduleTime(DateTime lastScheduleTime) {
        this.lastScheduleTime = lastScheduleTime;
        return this;
    }

}
