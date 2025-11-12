package com.javaworld.javachallengers.inheritance;

import java.util.HashSet;
import java.util.Set;

public class CharacterCompositionExample {

    static Set<String> set = new HashSet<>();

    public static void main(String... goodExampleOfComposition) {
        set.add("Homer");
        set.forEach(System.out::println);
    }

}
