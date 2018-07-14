package com.developerworks.overloading.concept;

/** Number of parameters overloading */
public class NumberOfParameters {

    void calculate(int number1, int number2) {
        System.out.println("void calculate(int number1, int number2)");
    }

    void calculate(int number1, int number2, int number3) {
        System.out.println("void calculate(int number1, int number2, int number3)");
    }

}
