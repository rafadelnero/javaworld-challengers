package com.javaworld.javachallengers.thread;

public class InheritingThread extends Thread {

    public static void main(String... inheriting) {
        System.out.println(Thread.currentThread().getName() + " is running.");

        new InheritingThread().start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
    }
}
