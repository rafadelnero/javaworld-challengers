package com.javaworld.javachallengers.command.custom;

public class AccelerateMotorcycle implements Command {

  Vehicle vehicle;

  public AccelerateMotorcycle(Vehicle vehicle){
    this.vehicle = vehicle;
  }

  public void execute() {
    vehicle.accelerate();
  }

  @Override
  public void revert() {
    vehicle.decelerate();
  }

}
