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