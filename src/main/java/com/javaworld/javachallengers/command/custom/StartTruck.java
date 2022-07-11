package com.javaworld.javachallengers.command.custom;

public class StartTruck implements Command {

  Vehicle vehicle;

  public StartTruck(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public void execute() {
    vehicle.start();
  }

  @Override
  public void revert() {
    vehicle.stop();
  }

}
