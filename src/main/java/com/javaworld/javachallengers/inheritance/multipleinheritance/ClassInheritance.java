package com.javaworld.javachallengers.inheritance.multipleinheritance;

public class ClassInheritance {

    class Animal {}
    class Mammal {}
    //class Dog extends Animal, Mammal {} It won't compile

    // It works
    class AnimalSingleInheritance {}
    class MammalSingleInheritance extends AnimalSingleInheritance {}
    class DogSingleInheritance extends MammalSingleInheritance {}

}
