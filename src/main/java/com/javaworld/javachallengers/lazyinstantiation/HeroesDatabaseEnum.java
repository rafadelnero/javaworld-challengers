package com.javaworld.javachallengers.lazyinstantiation;

public enum HeroesDatabaseEnum {

  INSTANCE;

  int value;

  HeroesDatabaseEnum() {
    System.out.println("Creating instance...");
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public static void main(String[] args) {
    System.out.println(HeroesDatabaseEnum.INSTANCE);
  }
}
