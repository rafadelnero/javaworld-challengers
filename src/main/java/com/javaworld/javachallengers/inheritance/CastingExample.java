package com.javaworld.javachallengers.inheritance;

public class CastingExample {

    public static void main(String... castingExample) {
        Animal animal = new Animal();
        Dog dogAnimal = (Dog) animal; // We will get ClassCastException
        Dog dog = new Dog();
        Animal anotherDog = dog; // It's fine here, no need for casting
        System.out.println(((Dog)anotherDog)); // This is another way to cast the object
    }

}

class Animal { }
class Dog extends Animal { }
