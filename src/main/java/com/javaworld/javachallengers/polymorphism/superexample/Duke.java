package com.javaworld.javachallengers.polymorphism.superexample;

public class Duke extends JavaMascot {

    @Override
    void executeAction() {
        super.executeAction();
        System.out.println("Duke is going to punch!");
    }

    public static void main(String... superReservedWord) {
        new Duke().executeAction();
    }
}
