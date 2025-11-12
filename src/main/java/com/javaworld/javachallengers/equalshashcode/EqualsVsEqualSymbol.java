package com.javaworld.javachallengers.equalshashcode;

public class EqualsVsEqualSymbol {

    public static void main(String... equalsTests) {
        Simpson homer = new Simpson("Homer");
        Simpson homer2 = new Simpson("Homer");

        // Two different object references here - false
        System.out.println(homer == homer2);

        // Still different references but same value - true
        System.out.println(homer.equals(homer2));
    }

}

class Simpson {
    String name;

    Simpson(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Simpson anotherSimpson = (Simpson) obj;
        return this.name.equals(anotherSimpson.name);
    }
}
