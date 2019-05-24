package com.javaworld.javachallengers.inheritance.methodoverriding;

public class Main {

    public static void main(String... doYourBest) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal animal = new Animal();

        cat.emitSound();
        dog.emitSound();
        animal.emitSound();
    }

}
