package com.javaworld.javachallengers.inheritance.methodoverriding;

class Cat extends Animal {

    @Override
    void emitSound() {
        System.out.println("Meow");
    }
}
