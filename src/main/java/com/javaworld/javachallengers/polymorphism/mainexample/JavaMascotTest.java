package com.javaworld.javachallengers.polymorphism.mainexample;

public class JavaMascotTest {

    public static void main(String... args) {
        JavaMascot dukeMascot = new Duke();
        JavaMascot juggyMascot = new Juggy();

        dukeMascot.executeAction();
        juggyMascot.executeAction();
    }

}
