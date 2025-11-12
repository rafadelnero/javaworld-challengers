package com.javaworld.javachallengers.inheritance.superinheritance;

public class ConstructorSuper {

    class Character {

        Character() {
            System.out.println("The super constructor was invoked");
        }

    }

    class Barney extends Character {

        // No need to declare the constructor or to invoke the super constructor
        // The JVM will to that

    }

}
