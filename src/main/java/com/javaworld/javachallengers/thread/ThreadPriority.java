package com.javaworld.javachallengers.thread;

public class ThreadPriority {

    public static void main(String... threadPriority) {
        Thread homerThread = new Thread(() -> System.out.println("Homer"));
        Thread moeThread = new Thread(() -> System.out.println("Moe"));
        Thread barneyThread = new Thread(() -> System.out.println("Barney"));

        homerThread.setPriority(Thread.MIN_PRIORITY);
        barneyThread.setPriority(Thread.NORM_PRIORITY);
        moeThread.setPriority(Thread.MAX_PRIORITY);

        homerThread.start();
        barneyThread.start();
        moeThread.start();
    }

}
