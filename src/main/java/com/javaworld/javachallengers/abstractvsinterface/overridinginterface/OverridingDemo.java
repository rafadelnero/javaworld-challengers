package com.javaworld.javachallengers.abstractvsinterface.overridinginterface;

public class OverridingDemo {

  public static void main(String[] args) {
    Challenger challenger = new JavaChallenger();
    challenger.doChallenge();
  }

}

interface Challenger {
  void doChallenge();
}

class JavaChallenger implements Challenger {
  @Override
  public void doChallenge() {
    System.out.println("Challenge done!");
  }
}

