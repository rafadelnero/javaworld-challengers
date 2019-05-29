package com.javaworld.javachallengers.overloading;

public class OverloadTest {

    public static void main(String[] args) {
        new ConstructorOverloading(1);
        new ConstructorOverloading(1, 2);

        NumberOfParameters numberOfParameters = new NumberOfParameters();
        numberOfParameters.calculate(1, 1);
        numberOfParameters.calculate(1, 1, 1);

        OrderOfParameters orderOfParameters = new OrderOfParameters();
        orderOfParameters.calculate(1.0, 1);
        orderOfParameters.calculate(1, 1.0);

        TypeOfParameters typeOfParameters = new TypeOfParameters();
        typeOfParameters.calculate(1.0, 1.0);
        typeOfParameters.calculate('a', 'a');
    }

}
