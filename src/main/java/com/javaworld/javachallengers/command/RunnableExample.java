package com.javaworld.javachallengers.command;

import java.awt.event.ActionListener;
import org.junit.Test;

public class RunnableExample {

  @Test
  public void runnableWithAnonymousInnerClass() {
    Runnable command = new Runnable() {
      public void run() {
        System.out.println("Executing command!");
      }
    };

    Thread thread = new Thread(command);
    thread.start();
  }

  @Test
  public void runnableWithLambda() {
    Runnable command = () -> System.out.println("Executing command!");
    Thread thread = new Thread(command);
    thread.start();
  }

}
