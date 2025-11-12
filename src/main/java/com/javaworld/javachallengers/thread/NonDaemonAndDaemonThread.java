package com.javaworld.javachallengers.thread;

import java.util.stream.IntStream;

public class NonDaemonAndDaemonThread {

    public static void main(String... nonDaemonAndDaemon) throws InterruptedException {
        System.out.println("Starting the execution in the Thread " + Thread.currentThread().getName());

        Thread daemonThread = new Thread(() -> IntStream.rangeClosed(1, 100000)
                .forEach(System.out::println));

        daemonThread.setDaemon(true);
        daemonThread.start();

        Thread.sleep(10);

        System.out.println("End of the execution in the Thread " + Thread.currentThread().getName());
    }

}
