package com.javaworld.javachallengers.command.custom;

public class StartMotorcycle implements Command {

  Vehicle vehicle;

  public StartMotorcycle(Vehicle vehicle) {
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
