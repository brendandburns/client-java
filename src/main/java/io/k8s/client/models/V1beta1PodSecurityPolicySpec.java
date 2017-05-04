/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Pod Security Policy Spec defines the policy enforced.
 */
public class V1beta1PodSecurityPolicySpec {
    /**
     * AllowedCapabilities is a list of capabilities that can be requested to
     * add to the container. Capabilities in this field may be added at the pod
     * author's discretion. You must not list a capability in both
     * AllowedCapabilities and RequiredDropCapabilities.
     */
    @JsonProperty(value = "allowedCapabilities")
    private List<String> allowedCapabilities;

    /**
     * DefaultAddCapabilities is the default set of capabilities that will be
     * added to the container unless the pod spec specifically drops the
     * capability.  You may not list a capabiility in both
     * DefaultAddCapabilities and RequiredDropCapabilities.
     */
    @JsonProperty(value = "defaultAddCapabilities")
    private List<String> defaultAddCapabilities;

    /**
     * FSGroup is the strategy that will dictate what fs group is used by the
     * SecurityContext.
     */
    @JsonProperty(value = "fsGroup", required = true)
    private V1beta1FSGroupStrategyOptions fsGroup;

    /**
     * hostIPC determines if the policy allows the use of HostIPC in the pod
     * spec.
     */
    @JsonProperty(value = "hostIPC")
    private Boolean hostIPC;

    /**
     * hostNetwork determines if the policy allows the use of HostNetwork in
     * the pod spec.
     */
    @JsonProperty(value = "hostNetwork")
    private Boolean hostNetwork;

    /**
     * hostPID determines if the policy allows the use of HostPID in the pod
     * spec.
     */
    @JsonProperty(value = "hostPID")
    private Boolean hostPID;

    /**
     * hostPorts determines which host port ranges are allowed to be exposed.
     */
    @JsonProperty(value = "hostPorts")
    private List<V1beta1HostPortRange> hostPorts;

    /**
     * privileged determines if a pod can request to be run as privileged.
     */
    @JsonProperty(value = "privileged")
    private Boolean privileged;

    /**
     * ReadOnlyRootFilesystem when set to true will force containers to run
     * with a read only root file system.  If the container specifically
     * requests to run with a non-read only root file system the PSP should
     * deny the pod. If set to false the container may run with a read only
     * root file system if it wishes but it will not be forced to.
     */
    @JsonProperty(value = "readOnlyRootFilesystem")
    private Boolean readOnlyRootFilesystem;

    /**
     * RequiredDropCapabilities are the capabilities that will be dropped from
     * the container.  These are required to be dropped and cannot be added.
     */
    @JsonProperty(value = "requiredDropCapabilities")
    private List<String> requiredDropCapabilities;

    /**
     * runAsUser is the strategy that will dictate the allowable RunAsUser
     * values that may be set.
     */
    @JsonProperty(value = "runAsUser", required = true)
    private V1beta1RunAsUserStrategyOptions runAsUser;

    /**
     * seLinux is the strategy that will dictate the allowable labels that may
     * be set.
     */
    @JsonProperty(value = "seLinux", required = true)
    private V1beta1SELinuxStrategyOptions seLinux;

    /**
     * SupplementalGroups is the strategy that will dictate what supplemental
     * groups are used by the SecurityContext.
     */
    @JsonProperty(value = "supplementalGroups", required = true)
    private V1beta1SupplementalGroupsStrategyOptions supplementalGroups;

    /**
     * volumes is a white list of allowed volume plugins.  Empty indicates that
     * all plugins may be used.
     */
    @JsonProperty(value = "volumes")
    private List<String> volumes;

    /**
     * Get the allowedCapabilities value.
     *
     * @return the allowedCapabilities value
     */
    public List<String> allowedCapabilities() {
        return this.allowedCapabilities;
    }

    /**
     * Set the allowedCapabilities value.
     *
     * @param allowedCapabilities the allowedCapabilities value to set
     * @return the V1beta1PodSecurityPolicySpec object itself.
     */
    public V1beta1PodSecurityPolicySpec withAllowedCapabilities(List<String> allowedCapabilities) {
        this.allowedCapabilities = allowedCapabilities;
        return this;
    }

    /**
     * Get the defaultAddCapabilities value.
     *
     * @return the defaultAddCapabilities value
     */
    public List<String> defaultAddCapabilities() {
        return this.defaultAddCapabilities;
    }

    /**
     * Set the defaultAddCapabilities value.
     *
     * @param defaultAddCapabilities the defaultAddCapabilities value to set
     * @return the V1beta1PodSecurityPolicySpec object itself.
     */
    public V1beta1PodSecurityPolicySpec withDefaultAddCapabilities(List<String> defaultAddCapabilities) {
        this.defaultAddCapabilities = defaultAddCapabilities;
        return this;
    }

    /**
     * Get the fsGroup value.
     *
     * @return the fsGroup value
     */
    public V1beta1FSGroupStrategyOptions fsGroup() {
        return this.fsGroup;
    }

    /**
     * Set the fsGroup value.
     *
     * @param fsGroup the fsGroup value to set
     * @return the V1beta1PodSecurityPolicySpec object itself.
     */
    public V1beta1PodSecurityPolicySpec withFsGroup(V1beta1FSGroupStrategyOptions fsGroup) {
        this.fsGroup = fsGroup;
        return this;
    }

    /**
     * Get the hostIPC value.
     *
     * @return the hostIPC value
     */
    public Boolean hostIPC() {
        return this.hostIPC;
    }

    /**
     * Set the hostIPC value.
     *
     * @param hostIPC the hostIPC value to set
     * @return the V1beta1PodSecurityPolicySpec object itself.
     */
    public V1beta1PodSecurityPolicySpec withHostIPC(Boolean hostIPC) {
        this.hostIPC = hostIPC;
        return this;
    }

    /**
     * Get the hostNetwork value.
     *
     * @return the hostNetwork value
     */
    public Boolean hostNetwork() {
        return this.hostNetwork;
    }

    /**
     * Set the hostNetwork value.
     *
     * @param hostNetwork the hostNetwork value to set
     * @return the V1beta1PodSecurityPolicySpec object itself.
     */
    public V1beta1PodSecurityPolicySpec withHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
        return this;
    }

    /**
     * Get the hostPID value.
     *
     * @return the hostPID value
     */
    public Boolean hostPID() {
        return this.hostPID;
    }

    /**
     * Set the hostPID value.
     *
     * @param hostPID the hostPID value to set
     * @return the V1beta1PodSecurityPolicySpec object itself.
     */
    public V1beta1PodSecurityPolicySpec withHostPID(Boolean hostPID) {
        this.hostPID = hostPID;
        return this;
    }

    /**
     * Get the hostPorts value.
     *
     * @return the hostPorts value
     */
    public List<V1beta1HostPortRange> hostPorts() {
        return this.hostPorts;
    }

    /**
     * Set the hostPorts value.
     *
     * @param hostPorts the hostPorts value to set
     * @return the V1beta1PodSecurityPolicySpec object itself.
     */
    public V1beta1PodSecurityPolicySpec withHostPorts(List<V1beta1HostPortRange> hostPorts) {
        this.hostPorts = hostPorts;
        return this;
    }

    /**
     * Get the privileged value.
     *
     * @return the privileged value
     */
    public Boolean privileged() {
        return this.privileged;
    }

    /**
     * Set the privileged value.
     *
     * @param privileged the privileged value to set
     * @return the V1beta1PodSecurityPolicySpec object itself.
     */
    public V1beta1PodSecurityPolicySpec withPrivileged(Boolean privileged) {
        this.privileged = privileged;
        return this;
    }

    /**
     * Get the readOnlyRootFilesystem value.
     *
     * @return the readOnlyRootFilesystem value
     */
    public Boolean readOnlyRootFilesystem() {
        return this.readOnlyRootFilesystem;
    }

    /**
     * Set the readOnlyRootFilesystem value.
     *
     * @param readOnlyRootFilesystem the readOnlyRootFilesystem value to set
     * @return the V1beta1PodSecurityPolicySpec object itself.
     */
    public V1beta1PodSecurityPolicySpec withReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
        return this;
    }

    /**
     * Get the requiredDropCapabilities value.
     *
     * @return the requiredDropCapabilities value
     */
    public List<String> requiredDropCapabilities() {
        return this.requiredDropCapabilities;
    }

    /**
     * Set the requiredDropCapabilities value.
     *
     * @param requiredDropCapabilities the requiredDropCapabilities value to set
     * @return the V1beta1PodSecurityPolicySpec object itself.
     */
    public V1beta1PodSecurityPolicySpec withRequiredDropCapabilities(List<String> requiredDropCapabilities) {
        this.requiredDropCapabilities = requiredDropCapabilities;
        return this;
    }

    /**
     * Get the runAsUser value.
     *
     * @return the runAsUser value
     */
    public V1beta1RunAsUserStrategyOptions runAsUser() {
        return this.runAsUser;
    }

    /**
     * Set the runAsUser value.
     *
     * @param runAsUser the runAsUser value to set
     * @return the V1beta1PodSecurityPolicySpec object itself.
     */
    public V1beta1PodSecurityPolicySpec withRunAsUser(V1beta1RunAsUserStrategyOptions runAsUser) {
        this.runAsUser = runAsUser;
        return this;
    }

    /**
     * Get the seLinux value.
     *
     * @return the seLinux value
     */
    public V1beta1SELinuxStrategyOptions seLinux() {
        return this.seLinux;
    }

    /**
     * Set the seLinux value.
     *
     * @param seLinux the seLinux value to set
     * @return the V1beta1PodSecurityPolicySpec object itself.
     */
    public V1beta1PodSecurityPolicySpec withSeLinux(V1beta1SELinuxStrategyOptions seLinux) {
        this.seLinux = seLinux;
        return this;
    }

    /**
     * Get the supplementalGroups value.
     *
     * @return the supplementalGroups value
     */
    public V1beta1SupplementalGroupsStrategyOptions supplementalGroups() {
        return this.supplementalGroups;
    }

    /**
     * Set the supplementalGroups value.
     *
     * @param supplementalGroups the supplementalGroups value to set
     * @return the V1beta1PodSecurityPolicySpec object itself.
     */
    public V1beta1PodSecurityPolicySpec withSupplementalGroups(V1beta1SupplementalGroupsStrategyOptions supplementalGroups) {
        this.supplementalGroups = supplementalGroups;
        return this;
    }

    /**
     * Get the volumes value.
     *
     * @return the volumes value
     */
    public List<String> volumes() {
        return this.volumes;
    }

    /**
     * Set the volumes value.
     *
     * @param volumes the volumes value to set
     * @return the V1beta1PodSecurityPolicySpec object itself.
     */
    public V1beta1PodSecurityPolicySpec withVolumes(List<String> volumes) {
        this.volumes = volumes;
        return this;
    }

}