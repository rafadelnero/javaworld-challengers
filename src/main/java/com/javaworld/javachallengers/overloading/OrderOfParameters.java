package com.javaworld.javachallengers.overloading;

/** Order of parameters overloading */
public class OrderOfParameters {

    void calculate(double number1, int number2) {
        System.out.println("void calculate(double number1, int number2)");
    }

    void calculate(int number1, double number2) {
        System.out.println("void calculate(int number1, double number2)");
    }

}
