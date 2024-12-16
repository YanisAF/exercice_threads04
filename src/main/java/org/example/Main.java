package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Main {
    public static void main(String[] args) {

        executeTacheService();
    }

    public static void executeTacheService() {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            int tacheId = i;
            executor.submit(() -> System.out.println("Tâche : "+tacheId+ " exécutée par "+Thread.currentThread().getName()));
        }
        executor.shutdown();
    }
}