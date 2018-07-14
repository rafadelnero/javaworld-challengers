package com.developerworks.overloading.concept;

/** Type of parameters overloading */
public class TypeOfParameters {

    void calculate(char number1, char number2) {
        System.out.println("void calculate(float number1, float number2)");
    }
    void calculate(double number1, double number2) {
        System.out.println("void calculate(double number1, double number2)");
    }

}
