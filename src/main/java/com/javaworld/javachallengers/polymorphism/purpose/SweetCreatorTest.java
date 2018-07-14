package com.javaworld.javachallengers.polymorphism.purpose;

import java.util.Arrays;

public class SweetCreatorTest {

    public static void main(String... args) {
        SweetCreator sweetCreator = new SweetCreator(Arrays.asList(new CakeProducer(),
                new ChocolateProducer(), new CookieProducer()));

        sweetCreator.createSweets();
    }

}
