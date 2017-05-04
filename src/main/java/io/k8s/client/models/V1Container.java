/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package io.k8s.client.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A single application container that you want to run within a pod.
 */
public class V1Container {
    /**
     * Arguments to the entrypoint. The docker image's CMD is used if this is
     * not provided. Variable references $(VAR_NAME) are expanded using the
     * container's environment. If a variable cannot be resolved, the reference
     * in the input string will be unchanged. The $(VAR_NAME) syntax can be
     * escaped with a double $$, ie: $$(VAR_NAME). Escaped references will
     * never be expanded, regardless of whether the variable exists or not.
     * Cannot be updated. More info:
     * http://kubernetes.io/docs/user-guide/containers#containers-and-commands.
     */
    @JsonProperty(value = "args")
    private List<String> args;

    /**
     * Entrypoint array. Not executed within a shell. The docker image's
     * ENTRYPOINT is used if this is not provided. Variable references
     * $(VAR_NAME) are expanded using the container's environment. If a
     * variable cannot be resolved, the reference in the input string will be
     * unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie:
     * $$(VAR_NAME). Escaped references will never be expanded, regardless of
     * whether the variable exists or not. Cannot be updated. More info:
     * http://kubernetes.io/docs/user-guide/containers#containers-and-commands.
     */
    @JsonProperty(value = "command")
    private List<String> command;

    /**
     * List of environment variables to set in the container. Cannot be
     * updated.
     */
    @JsonProperty(value = "env")
    private List<V1EnvVar> env;

    /**
     * List of sources to populate environment variables in the container. The
     * keys defined within a source must be a C_IDENTIFIER. All invalid keys
     * will be reported as an event when the container is starting. When a key
     * exists in multiple sources, the value associated with the last source
     * will take precedence. Values defined by an Env with a duplicate key will
     * take precedence. Cannot be updated.
     */
    @JsonProperty(value = "envFrom")
    private List<V1EnvFromSource> envFrom;

    /**
     * Docker image name. More info:
     * http://kubernetes.io/docs/user-guide/images.
     */
    @JsonProperty(value = "image")
    private String image;

    /**
     * Image pull policy. One of Always, Never, IfNotPresent. Defaults to
     * Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be
     * updated. More info:
     * http://kubernetes.io/docs/user-guide/images#updating-images.
     */
    @JsonProperty(value = "imagePullPolicy")
    private String imagePullPolicy;

    /**
     * Actions that the management system should take in response to container
     * lifecycle events. Cannot be updated.
     */
    @JsonProperty(value = "lifecycle")
    private V1Lifecycle lifecycle;

    /**
     * Periodic probe of container liveness. Container will be restarted if the
     * probe fails. Cannot be updated. More info:
     * http://kubernetes.io/docs/user-guide/pod-states#container-probes.
     */
    @JsonProperty(value = "livenessProbe")
    private V1Probe livenessProbe;

    /**
     * Name of the container specified as a DNS_LABEL. Each container in a pod
     * must have a unique name (DNS_LABEL). Cannot be updated.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * List of ports to expose from the container. Exposing a port here gives
     * the system additional information about the network connections a
     * container uses, but is primarily informational. Not specifying a port
     * here DOES NOT prevent that port from being exposed. Any port which is
     * listening on the default "0.0.0.0" address inside a container will be
     * accessible from the network. Cannot be updated.
     */
    @JsonProperty(value = "ports")
    private List<V1ContainerPort> ports;

    /**
     * Periodic probe of container service readiness. Container will be removed
     * from service endpoints if the probe fails. Cannot be updated. More info:
     * http://kubernetes.io/docs/user-guide/pod-states#container-probes.
     */
    @JsonProperty(value = "readinessProbe")
    private V1Probe readinessProbe;

    /**
     * Compute Resources required by this container. Cannot be updated. More
     * info: http://kubernetes.io/docs/user-guide/persistent-volumes#resources.
     */
    @JsonProperty(value = "resources")
    private V1ResourceRequirements resources;

    /**
     * Security options the pod should run with. More info:
     * http://releases.k8s.io/HEAD/docs/design/security_context.md.
     */
    @JsonProperty(value = "securityContext")
    private V1SecurityContext securityContext;

    /**
     * Whether this container should allocate a buffer for stdin in the
     * container runtime. If this is not set, reads from stdin in the container
     * will always result in EOF. Default is false.
     */
    @JsonProperty(value = "stdin")
    private Boolean stdin;

    /**
     * Whether the container runtime should close the stdin channel after it
     * has been opened by a single attach. When stdin is true the stdin stream
     * will remain open across multiple attach sessions. If stdinOnce is set to
     * true, stdin is opened on container start, is empty until the first
     * client attaches to stdin, and then remains open and accepts data until
     * the client disconnects, at which time stdin is closed and remains closed
     * until the container is restarted. If this flag is false, a container
     * processes that reads from stdin will never receive an EOF. Default is
     * false.
     */
    @JsonProperty(value = "stdinOnce")
    private Boolean stdinOnce;

    /**
     * Optional: Path at which the file to which the container's termination
     * message will be written is mounted into the container's filesystem.
     * Message written is intended to be brief final status, such as an
     * assertion failure message. Will be truncated by the node if greater than
     * 4096 bytes. The total message length across all containers will be
     * limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
     */
    @JsonProperty(value = "terminationMessagePath")
    private String terminationMessagePath;

    /**
     * Indicate how the termination message should be populated. File will use
     * the contents of terminationMessagePath to populate the container status
     * message on both success and failure. FallbackToLogsOnError will use the
     * last chunk of container log output if the termination message file is
     * empty and the container exited with an error. The log output is limited
     * to 2048 bytes or 80 lines, whichever is smaller. Defaults to File.
     * Cannot be updated.
     */
    @JsonProperty(value = "terminationMessagePolicy")
    private String terminationMessagePolicy;

    /**
     * Whether this container should allocate a TTY for itself, also requires
     * 'stdin' to be true. Default is false.
     */
    @JsonProperty(value = "tty")
    private Boolean tty;

    /**
     * Pod volumes to mount into the container's filesystem. Cannot be updated.
     */
    @JsonProperty(value = "volumeMounts")
    private List<V1VolumeMount> volumeMounts;

    /**
     * Container's working directory. If not specified, the container runtime's
     * default will be used, which might be configured in the container image.
     * Cannot be updated.
     */
    @JsonProperty(value = "workingDir")
    private String workingDir;

    /**
     * Get the args value.
     *
     * @return the args value
     */
    public List<String> args() {
        return this.args;
    }

    /**
     * Set the args value.
     *
     * @param args the args value to set
     * @return the V1Container object itself.
     */
    public V1Container withArgs(List<String> args) {
        this.args = args;
        return this;
    }

    /**
     * Get the command value.
     *
     * @return the command value
     */
    public List<String> command() {
        return this.command;
    }

    /**
     * Set the command value.
     *
     * @param command the command value to set
     * @return the V1Container object itself.
     */
    public V1Container withCommand(List<String> command) {
        this.command = command;
        return this;
    }

    /**
     * Get the env value.
     *
     * @return the env value
     */
    public List<V1EnvVar> env() {
        return this.env;
    }

    /**
     * Set the env value.
     *
     * @param env the env value to set
     * @return the V1Container object itself.
     */
    public V1Container withEnv(List<V1EnvVar> env) {
        this.env = env;
        return this;
    }

    /**
     * Get the envFrom value.
     *
     * @return the envFrom value
     */
    public List<V1EnvFromSource> envFrom() {
        return this.envFrom;
    }

    /**
     * Set the envFrom value.
     *
     * @param envFrom the envFrom value to set
     * @return the V1Container object itself.
     */
    public V1Container withEnvFrom(List<V1EnvFromSource> envFrom) {
        this.envFrom = envFrom;
        return this;
    }

    /**
     * Get the image value.
     *
     * @return the image value
     */
    public String image() {
        return this.image;
    }

    /**
     * Set the image value.
     *
     * @param image the image value to set
     * @return the V1Container object itself.
     */
    public V1Container withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * Get the imagePullPolicy value.
     *
     * @return the imagePullPolicy value
     */
    public String imagePullPolicy() {
        return this.imagePullPolicy;
    }

    /**
     * Set the imagePullPolicy value.
     *
     * @param imagePullPolicy the imagePullPolicy value to set
     * @return the V1Container object itself.
     */
    public V1Container withImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
        return this;
    }

    /**
     * Get the lifecycle value.
     *
     * @return the lifecycle value
     */
    public V1Lifecycle lifecycle() {
        return this.lifecycle;
    }

    /**
     * Set the lifecycle value.
     *
     * @param lifecycle the lifecycle value to set
     * @return the V1Container object itself.
     */
    public V1Container withLifecycle(V1Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    /**
     * Get the livenessProbe value.
     *
     * @return the livenessProbe value
     */
    public V1Probe livenessProbe() {
        return this.livenessProbe;
    }

    /**
     * Set the livenessProbe value.
     *
     * @param livenessProbe the livenessProbe value to set
     * @return the V1Container object itself.
     */
    public V1Container withLivenessProbe(V1Probe livenessProbe) {
        this.livenessProbe = livenessProbe;
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
     * @return the V1Container object itself.
     */
    public V1Container withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the ports value.
     *
     * @return the ports value
     */
    public List<V1ContainerPort> ports() {
        return this.ports;
    }

    /**
     * Set the ports value.
     *
     * @param ports the ports value to set
     * @return the V1Container object itself.
     */
    public V1Container withPorts(List<V1ContainerPort> ports) {
        this.ports = ports;
        return this;
    }

    /**
     * Get the readinessProbe value.
     *
     * @return the readinessProbe value
     */
    public V1Probe readinessProbe() {
        return this.readinessProbe;
    }

    /**
     * Set the readinessProbe value.
     *
     * @param readinessProbe the readinessProbe value to set
     * @return the V1Container object itself.
     */
    public V1Container withReadinessProbe(V1Probe readinessProbe) {
        this.readinessProbe = readinessProbe;
        return this;
    }

    /**
     * Get the resources value.
     *
     * @return the resources value
     */
    public V1ResourceRequirements resources() {
        return this.resources;
    }

    /**
     * Set the resources value.
     *
     * @param resources the resources value to set
     * @return the V1Container object itself.
     */
    public V1Container withResources(V1ResourceRequirements resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get the securityContext value.
     *
     * @return the securityContext value
     */
    public V1SecurityContext securityContext() {
        return this.securityContext;
    }

    /**
     * Set the securityContext value.
     *
     * @param securityContext the securityContext value to set
     * @return the V1Container object itself.
     */
    public V1Container withSecurityContext(V1SecurityContext securityContext) {
        this.securityContext = securityContext;
        return this;
    }

    /**
     * Get the stdin value.
     *
     * @return the stdin value
     */
    public Boolean stdin() {
        return this.stdin;
    }

    /**
     * Set the stdin value.
     *
     * @param stdin the stdin value to set
     * @return the V1Container object itself.
     */
    public V1Container withStdin(Boolean stdin) {
        this.stdin = stdin;
        return this;
    }

    /**
     * Get the stdinOnce value.
     *
     * @return the stdinOnce value
     */
    public Boolean stdinOnce() {
        return this.stdinOnce;
    }

    /**
     * Set the stdinOnce value.
     *
     * @param stdinOnce the stdinOnce value to set
     * @return the V1Container object itself.
     */
    public V1Container withStdinOnce(Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
        return this;
    }

    /**
     * Get the terminationMessagePath value.
     *
     * @return the terminationMessagePath value
     */
    public String terminationMessagePath() {
        return this.terminationMessagePath;
    }

    /**
     * Set the terminationMessagePath value.
     *
     * @param terminationMessagePath the terminationMessagePath value to set
     * @return the V1Container object itself.
     */
    public V1Container withTerminationMessagePath(String terminationMessagePath) {
        this.terminationMessagePath = terminationMessagePath;
        return this;
    }

    /**
     * Get the terminationMessagePolicy value.
     *
     * @return the terminationMessagePolicy value
     */
    public String terminationMessagePolicy() {
        return this.terminationMessagePolicy;
    }

    /**
     * Set the terminationMessagePolicy value.
     *
     * @param terminationMessagePolicy the terminationMessagePolicy value to set
     * @return the V1Container object itself.
     */
    public V1Container withTerminationMessagePolicy(String terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
        return this;
    }

    /**
     * Get the tty value.
     *
     * @return the tty value
     */
    public Boolean tty() {
        return this.tty;
    }

    /**
     * Set the tty value.
     *
     * @param tty the tty value to set
     * @return the V1Container object itself.
     */
    public V1Container withTty(Boolean tty) {
        this.tty = tty;
        return this;
    }

    /**
     * Get the volumeMounts value.
     *
     * @return the volumeMounts value
     */
    public List<V1VolumeMount> volumeMounts() {
        return this.volumeMounts;
    }

    /**
     * Set the volumeMounts value.
     *
     * @param volumeMounts the volumeMounts value to set
     * @return the V1Container object itself.
     */
    public V1Container withVolumeMounts(List<V1VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
        return this;
    }

    /**
     * Get the workingDir value.
     *
     * @return the workingDir value
     */
    public String workingDir() {
        return this.workingDir;
    }

    /**
     * Set the workingDir value.
     *
     * @param workingDir the workingDir value to set
     * @return the V1Container object itself.
     */
    public V1Container withWorkingDir(String workingDir) {
        this.workingDir = workingDir;
        return this;
    }

}