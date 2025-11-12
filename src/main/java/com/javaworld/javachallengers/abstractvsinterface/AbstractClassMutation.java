package com.javaworld.javachallengers.abstractvsinterface;

public abstract class AbstractClassMutation {

  private String name = "challenger";

  public static void main(String[] args) {
    AbstractClassMutation abstractClassMutation = new AbstractClassImpl();
    abstractClassMutation.name = "mutated challenger";
    System.out.println(abstractClassMutation.name);
  }

}

class AbstractClassImpl extends AbstractClassMutation { }
