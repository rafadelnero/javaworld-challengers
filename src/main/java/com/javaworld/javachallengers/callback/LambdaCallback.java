package com.javaworld.javachallengers.callback;

public class LambdaCallback {

  public static void main(String[] args) {
    performAction(() -> System.out.println("Callback function executed..."));
  }

  public static void performAction(Runnable runnable) {
    System.out.println("Action is being performed...");
    runnable.run();
  }

}
