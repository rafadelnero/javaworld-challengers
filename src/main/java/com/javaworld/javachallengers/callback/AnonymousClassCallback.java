package com.javaworld.javachallengers.callback;

import java.util.function.Consumer;

public class AnonymousClassCallback {

  public static void main(String[] args) {
    performAction(new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    });
  }

  public static void performAction(Consumer<String> consumer) {
    System.out.println("Action is being performed...");
    consumer.accept("Callback is executed");
  }

}
