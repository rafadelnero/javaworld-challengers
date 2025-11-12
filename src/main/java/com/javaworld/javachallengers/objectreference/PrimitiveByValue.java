package com.javaworld.javachallengers.objectreference;

public class PrimitiveByValue {

    public static void main(String... primitiveByValue) {
        int homerAge = 30;
        new PrimitiveByValue().changeHomerAge(homerAge);
        System.out.println(homerAge);
    }


    void changeHomerAge(int homerAge) {
        homerAge = 35;
    }
}


