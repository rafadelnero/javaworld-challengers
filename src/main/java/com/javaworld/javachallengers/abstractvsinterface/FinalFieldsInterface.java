package com.javaworld.javachallengers.abstractvsinterface;

import java.util.ArrayList;
import java.util.List;

public class FinalFieldsInterface {

  interface Challenger {
    int number = 7;
    String name = "Java Challenger";
  }

  public static void main(String[] args) {
//    Challenger.number = 8; It won't compile since it's a static final field.
//    Challenger.name = "Another Challenger";

    System.out.println(Challenger.number);
    System.out.println(Challenger.name);
  }
}
