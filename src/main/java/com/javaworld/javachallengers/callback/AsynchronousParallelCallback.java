package com.javaworld.javachallengers.callback;

public class AsynchronousParallelCallback {

  private boolean isTaskCompleted = false;

  public static void main(String[] args) {
    Runnable runnable = () -> System.out.println("Callback executed...");
    AsynchronousParallelCallback asynchronousCallback = new AsynchronousParallelCallback();
    asynchronousCallback.performAsynchronousAction(runnable);
  }

  public void performAsynchronousAction(Runnable runnable) {
    new Thread(() -> {
      System.out.println("Processing Asynchronous Task...");
      new Thread(runnable).start();
    }).start();
  }

}
