package com.javaworld.javachallengers.command.custom;

public class GhostRider {
  Command command;

  public GhostRider(Command command){
    this.command = command;
  }

  public void setCommand(Command command) {
    this.command = command;
  }

  public void takeAction(){
    command.execute();
  }

  public void revertAction() {
    command.revert();
  }
}
