package com.javaworld.javachallengers.command.custom;

import java.util.List;

public class StartAllVehicles implements Command {

  List<Vehicle> vehicles;

  public StartAllVehicles(List<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }

  public void execute() {
    vehicles.forEach(vehicle -> vehicle.start());
  }

  @Override
  public void revert() {
    vehicles.forEach(vehicle -> vehicle.stop());
  }

}
