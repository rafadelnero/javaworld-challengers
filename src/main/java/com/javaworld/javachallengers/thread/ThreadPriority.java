package com.javaworld.javachallengers.thread;

public class ThreadPriority {

    public static void main(String... threadPriority) {
        Thread moeThread = new Thread(() -> System.out.println("Moe"));
        Thread barneyThread = new Thread(() -> System.out.println("Barney"));
        Thread homerThread = new Thread(() -> System.out.println("Homer"));

        moeThread.setPriority(Thread.MAX_PRIORITY);
        barneyThread.setPriority(Thread.NORM_PRIORITY);
        homerThread.setPriority(Thread.MIN_PRIORITY);

        homerThread.start();
        barneyThread.start();
        moeThread.start();
    }

}
