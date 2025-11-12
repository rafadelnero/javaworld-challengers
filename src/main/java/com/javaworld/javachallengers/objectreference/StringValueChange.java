package com.javaworld.javachallengers.objectreference;

public class StringValueChange {

    public static void main(String... doYourBest) {
        String name = "";
        new StringValueChange().changeToHomer(name);
        System.out.println(name);
    }

    void changeToHomer(String name) {
        name = "Homer";
    }
}
