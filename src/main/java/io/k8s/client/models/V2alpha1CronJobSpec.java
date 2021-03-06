/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CronJobSpec describes how the job execution will look like and when it will
 * actually run.
 */
public class V2alpha1CronJobSpec {
    /**
     * ConcurrencyPolicy specifies how to treat concurrent executions of a Job.
     */
    @JsonProperty(value = "concurrencyPolicy")
    private String concurrencyPolicy;

    /**
     * The number of failed finished jobs to retain. This is a pointer to
     * distinguish between explicit zero and not specified.
     */
    @JsonProperty(value = "failedJobsHistoryLimit")
    private Integer failedJobsHistoryLimit;

    /**
     * JobTemplate is the object that describes the job that will be created
     * when executing a CronJob.
     */
    @JsonProperty(value = "jobTemplate", required = true)
    private V2alpha1JobTemplateSpec jobTemplate;

    /**
     * Schedule contains the schedule in Cron format, see
     * https://en.wikipedia.org/wiki/Cron.
     */
    @JsonProperty(value = "schedule", required = true)
    private String schedule;

    /**
     * Optional deadline in seconds for starting the job if it misses scheduled
     * time for any reason.  Missed jobs executions will be counted as failed
     * ones.
     */
    @JsonProperty(value = "startingDeadlineSeconds")
    private Long startingDeadlineSeconds;

    /**
     * The number of successful finished jobs to retain. This is a pointer to
     * distinguish between explicit zero and not specified.
     */
    @JsonProperty(value = "successfulJobsHistoryLimit")
    private Integer successfulJobsHistoryLimit;

    /**
     * Suspend flag tells the controller to suspend subsequent executions, it
     * does not apply to already started executions.  Defaults to false.
     */
    @JsonProperty(value = "suspend")
    private Boolean suspend;

    /**
     * Get the concurrencyPolicy value.
     *
     * @return the concurrencyPolicy value
     */
    public String concurrencyPolicy() {
        return this.concurrencyPolicy;
    }

    /**
     * Set the concurrencyPolicy value.
     *
     * @param concurrencyPolicy the concurrencyPolicy value to set
     * @return the V2alpha1CronJobSpec object itself.
     */
    public V2alpha1CronJobSpec withConcurrencyPolicy(String concurrencyPolicy) {
        this.concurrencyPolicy = concurrencyPolicy;
        return this;
    }

    /**
     * Get the failedJobsHistoryLimit value.
     *
     * @return the failedJobsHistoryLimit value
     */
    public Integer failedJobsHistoryLimit() {
        return this.failedJobsHistoryLimit;
    }

    /**
     * Set the failedJobsHistoryLimit value.
     *
     * @param failedJobsHistoryLimit the failedJobsHistoryLimit value to set
     * @return the V2alpha1CronJobSpec object itself.
     */
    public V2alpha1CronJobSpec withFailedJobsHistoryLimit(Integer failedJobsHistoryLimit) {
        this.failedJobsHistoryLimit = failedJobsHistoryLimit;
        return this;
    }

    /**
     * Get the jobTemplate value.
     *
     * @return the jobTemplate value
     */
    public V2alpha1JobTemplateSpec jobTemplate() {
        return this.jobTemplate;
    }

    /**
     * Set the jobTemplate value.
     *
     * @param jobTemplate the jobTemplate value to set
     * @return the V2alpha1CronJobSpec object itself.
     */
    public V2alpha1CronJobSpec withJobTemplate(V2alpha1JobTemplateSpec jobTemplate) {
        this.jobTemplate = jobTemplate;
        return this;
    }

    /**
     * Get the schedule value.
     *
     * @return the schedule value
     */
    public String schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule value.
     *
     * @param schedule the schedule value to set
     * @return the V2alpha1CronJobSpec object itself.
     */
    public V2alpha1CronJobSpec withSchedule(String schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get the startingDeadlineSeconds value.
     *
     * @return the startingDeadlineSeconds value
     */
    public Long startingDeadlineSeconds() {
        return this.startingDeadlineSeconds;
    }

    /**
     * Set the startingDeadlineSeconds value.
     *
     * @param startingDeadlineSeconds the startingDeadlineSeconds value to set
     * @return the V2alpha1CronJobSpec object itself.
     */
    public V2alpha1CronJobSpec withStartingDeadlineSeconds(Long startingDeadlineSeconds) {
        this.startingDeadlineSeconds = startingDeadlineSeconds;
        return this;
    }

    /**
     * Get the successfulJobsHistoryLimit value.
     *
     * @return the successfulJobsHistoryLimit value
     */
    public Integer successfulJobsHistoryLimit() {
        return this.successfulJobsHistoryLimit;
    }

    /**
     * Set the successfulJobsHistoryLimit value.
     *
     * @param successfulJobsHistoryLimit the successfulJobsHistoryLimit value to set
     * @return the V2alpha1CronJobSpec object itself.
     */
    public V2alpha1CronJobSpec withSuccessfulJobsHistoryLimit(Integer successfulJobsHistoryLimit) {
        this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
        return this;
    }

    /**
     * Get the suspend value.
     *
     * @return the suspend value
     */
    public Boolean suspend() {
        return this.suspend;
    }

    /**
     * Set the suspend value.
     *
     * @param suspend the suspend value to set
     * @return the V2alpha1CronJobSpec object itself.
     */
    public V2alpha1CronJobSpec withSuspend(Boolean suspend) {
        this.suspend = suspend;
        return this;
    }

}
