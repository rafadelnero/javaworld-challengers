package com.javaworld.javachallengers.polymorphism.covariant;

public class Duke extends JavaMascot {

    @Override
    Duke getMascot() {
        return new Duke();
    }

}
