package com.javaworld.javachallengers.stringcomparison;

public class StringInternComparison {

    public static void main(String... doYourBest) {
        String duke = new String("duke");
        String duke2 = new String("duke");
        System.out.println(duke == duke2); // The result will be false here
        System.out.println(duke.intern() == duke2.intern()); // The result will be true here
    }

}
