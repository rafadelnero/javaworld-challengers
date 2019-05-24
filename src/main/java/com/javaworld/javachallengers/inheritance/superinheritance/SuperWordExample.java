package com.javaworld.javachallengers.inheritance.superinheritance;

public class SuperWordExample {

    class Character {

        Character() {
            System.out.println("A Character has been created");
        }

        void move() {
            System.out.println("Character walking...");
        }

    }

    class Moe extends Character {

        Moe() {
            super();
        }

        void giveBeer() {
            super.move();
            System.out.println("Give beer");
        }
    }

}
