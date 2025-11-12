package com.javaworld.javachallengers.abstractvsinterface;

public class DefaultMethodExample {

  public static void main(String[] args) {
    Challenger challenger = new JavaChallenger();
    challenger.doChallenge();
  }

}

class JavaChallenger implements Challenger { }

interface Challenger {

  default void doChallenge() {
    System.out.println("Challenger doing a challenge!");
  }

}
