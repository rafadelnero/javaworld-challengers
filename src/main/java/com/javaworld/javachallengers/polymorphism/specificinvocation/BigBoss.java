package com.javaworld.javachallengers.polymorphism.specificinvocation;

public class BigBoss extends MetalGearCharacter {

    @Override
    void useWeapon(String weapon) {
        System.out.println("Big Boss is using a " + weapon);
    }

    void giveOrderToTheArmy(String orderMessage) {
        System.out.println(orderMessage);
    }
}
