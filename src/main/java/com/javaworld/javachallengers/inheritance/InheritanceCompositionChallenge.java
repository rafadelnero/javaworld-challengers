package com.javaworld.javachallengers.inheritance;

public class InheritanceCompositionChallenge {
    private static int result;
    public static void main(String... doYourBest) {
        Character homer = new Homer();
        homer.drink();
        new Character().drink();
        ((Homer)homer).strangleBart();
        Character character = new Character();
        System.out.println(result);
        ((Homer)character).strangleBart();
    }

    static class Character {
        Character() {
            result++;
        }
        void drink() {
            System.out.println("Drink");
        }
    }

    static class Homer extends Character {
        Lung lung = new Lung();

        void strangleBart() {
            System.out.println("Why you little!");
        }
        void drink() {
            System.out.println("Drink beer");
            lung.damageLungs();
        }
    }

    static class Lung {
        void damageLungs() {
            System.out.println("Soon you will need a transplant");
        }
    }

}
