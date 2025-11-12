package com.javaworld.javachallengers.patternmatching;

public class PatternMatchingTests {

    public static void main(String [] args) {
        examineNumber(1);
        test1();
        test2();
        guardedPatternTest("Hello");
    }

    static void test1() {
        int count = 98;
        if (count instanceof byte smallCount) {
            // This executes only if count fits in a byte's range
            System.out.println("Small enough: " + smallCount);
        } else {
            System.out.println("Number too large for byte storage");
        }
    }

    static void test2() {
        double measurement = 17.5;
        if (measurement instanceof float simpleMeasurement) {
            System.out.println("No precision loss: " + simpleMeasurement);
        } else {
            System.out.println("Requires double precision");
        }

    }

    static void guardedPatternTest(Object obj) {
        switch (obj) {
            case String s when s.length() > 5 ->
                    System.out.println("Long string: " + s);
            case String s ->
                    System.out.println("Short string: " + s);
            default ->
                    System.out.println("Not a string");
        }
    }

    static void examineNumber(long input) {
        System.out.println("Examining: " + input);

        if (input instanceof byte b)
            System.out.println("Fits in a byte variable: " + b);
        if (input instanceof short s)
            System.out.println("Fits in a short variable: " + s);
        if (input >= 0 && input <= 65535 && input instanceof char c)
            System.out.println("Represents character: '" + c + "'");
        if (input instanceof int i)
            System.out.println("Fits in an int variable: " + i);
    }

}
