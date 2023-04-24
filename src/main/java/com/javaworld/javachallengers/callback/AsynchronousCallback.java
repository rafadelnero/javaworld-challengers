package com.javaworld.javachallengers.callback;

public class AsynchronousCallback {

  public static void main(String[] args) {
    Runnable runnable = () -> System.out.println("Callback executed...");
    AsynchronousCallback asynchronousCallback = new AsynchronousCallback();
    asynchronousCallback.performAsynchronousAction(runnable);
  }

  public void performAsynchronousAction(Runnable runnable) {

    new Thread(() -> {
      System.out.println("Processing Asynchronous Task...");
      runnable.run();
    }).start();
  }

}
