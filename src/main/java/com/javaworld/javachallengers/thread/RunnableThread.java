package com.javaworld.javachallengers.thread;

public class RunnableThread implements Runnable {

    public static void main(String... runnableThread) {
        System.out.println(Thread.currentThread().getName());

        new Thread(new RunnableThread()).start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}
