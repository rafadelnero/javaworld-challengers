package com.javaworld.javachallengers.sortingcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GoodExampleOfComparator {

    public static void main(String... args) {
        List<SimpsonCharacter> characters = new ArrayList<>();

        SimpsonCharacter homer = new SimpsonCharacter("Homer");
        SimpsonCharacter moe = new SimpsonCharacter("Moe");

        characters.add(homer);
        characters.add(moe);

        Collections.sort(characters, (Comparator.<SimpsonCharacter>
                        comparingInt(character1 -> character1.name.length())
                        .thenComparingInt(character2 -> character2.name.length())));

        System.out.println(characters);
    }

}
