## Client-Java

An initial (mostly) generated library for interacting with the Kubernetes
API via Java.

### Generating the code

Everything in `src/main/java/io/k8s/client` except the `examples` directory
is generated.

The scripts for (re)generating the code are in the 
[gen](https://github.com/kubernetes-client/gen) project.

TODO: Instructions for regenerating.

### Sample code

```java
package io.k8s.client.examples;

import io.k8s.client.Kubernetes;
import io.k8s.client.implementation.KubernetesImpl;
import io.k8s.client.models.V1Pod;
import io.k8s.client.models.V1PodList;

public class Example {
    public static void main(String[] args) {
        Kubernetes k8s = new KubernetesImpl("http://localhost:8001");
        V1PodList list = k8s.listNamespacedPod("default");
        
        for (V1Pod item : list.items()) {
            System.out.println(item.metadata().name() + "\t" + item.metadata().creationTimestamp());
        }
    }
}
```
