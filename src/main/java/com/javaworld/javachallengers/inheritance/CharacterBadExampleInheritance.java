package com.javaworld.javachallengers.inheritance;

import java.util.HashSet;

public class CharacterBadExampleInheritance extends HashSet<Object> {

    public static void main(String... badExampleOfInheritance) {
        CharacterBadExampleInheritance badExampleInheritance = new CharacterBadExampleInheritance();
        badExampleInheritance.add("Homer");
        badExampleInheritance.forEach(System.out::println);
    }

}
