package com.javaworld.javachallengers.polymorphism.specificinvocation;

public class UseSpecificMethod {

    public static void executeActionWith(MetalGearCharacter metalGearCharacter) {
        metalGearCharacter.useWeapon("SOCOM");

        // The below line won't work
        // metalGearCharacter.giveOrderToTheArmy("Attack!");

        if (metalGearCharacter instanceof BigBoss) {
            ((BigBoss) metalGearCharacter).giveOrderToTheArmy("Attack!");
        }
    }

    public static void main(String... specificPolymorphismInvocation) {
        executeActionWith(new SolidSnake());
        executeActionWith(new BigBoss());
    }

}
