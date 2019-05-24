package com.javaworld.javachallengers.inheritance;

public class CompositionExample {

    public static void main(String... houseComposition) {
        new House(new Bedroom(), new LivingRoom());
        // The house now is composed with a Bedroom and a LivingRoom
    }

    static class House {

        Bedroom bedroom;
        LivingRoom livingRoom;

        House(Bedroom bedroom, LivingRoom livingRoom) {
            this.bedroom = bedroom;
            this.livingRoom = livingRoom;
        }

    }

    static class Bedroom { }

    static class LivingRoom { }

}
