package com.javaworld.javachallengers.command.custom;

public class Motorcycle implements Vehicle {

  @Override
  public void start() {
    System.out.println("Starting motorcycle...");
  }

  @Override
  public void stop() {
    System.out.println("Stopping motorcycle...");
  }

  @Override
  public void accelerate() {
    System.out.println("Accelerating motorcycle...");
  }

  @Override
  public void decelerate() {
    System.out.println("Decelerating motorcycle...");
  }

}
