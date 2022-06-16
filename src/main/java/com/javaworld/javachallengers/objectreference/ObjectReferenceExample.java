package com.javaworld.javachallengers.objectreference;

public class ObjectReferenceExample {

    public static void main(String... doYourBest) {
        Simpson simpson = new Simpson();
        new ObjectReferenceExample().transformIntoHomer(simpson);
        System.out.println(simpson.name);
    }

    void transformIntoHomer(Simpson simpson) {
        simpson.name = "Homer";
    }

}

class Simpson {

    String name;

}
