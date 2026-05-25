package com.ib;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuteThread {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(10);
        List<Future<?>> futures = new ArrayList<>();
        for (int i = 1; i <= 15; i++) {
            final int t = i;
            System.out.println("                  Before Submit");
            Future<?> future = exec.submit(() -> {
                System.out.println(Thread.currentThread().getName());
                if (t == 8)
                    throw new RuntimeException("Error in " + t + "th Thread");
                try {
                    Thread.sleep(1000000000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            );
            System.out.println("                After Submit");
            futures.add(future);
            System.out.println("                After future add");
        }
        System.out.println("                  Outside Submit Loop");
        for (int i = 0; i < futures.size(); i++) {
            try {
                futures.get(i).get();
                System.out.println("             Inside get loop" + i);
            } catch (Exception e) {
                System.out.println("Task Failed" + e.getCause().getMessage());
            }
        }
    }
}