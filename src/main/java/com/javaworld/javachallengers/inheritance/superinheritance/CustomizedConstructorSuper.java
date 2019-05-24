package com.javaworld.javachallengers.inheritance.superinheritance;

public class CustomizedConstructorSuper {

    class Character {

        Character(String name) {
            System.out.println(name + "was invoked");
        }

    }

    class Barney extends Character {

        // We will have compilation error if we don't declare a constructor explicitly

        // We need to add it
        Barney() {
            super("Barney Gumble");
        }

    }

}
