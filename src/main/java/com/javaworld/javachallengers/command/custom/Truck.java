package com.javaworld.javachallengers.command.custom;

public class Truck implements Vehicle {

  @Override
  public void start() {
    System.out.println("Starting truck...");
  }

  @Override
  public void stop() {
    System.out.println("Stopping truck...");
  }

  @Override
  public void accelerate() {
    System.out.println("Accelerating truck...");
  }

  @Override
  public void decelerate() {
    System.out.println("Decelerating truck...");
  }

}
