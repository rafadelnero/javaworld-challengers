package com.javaworld.javachallengers.sortingcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BadExampleOfComparable {

    public static void main(String... args) {
        List<SimpsonCharacter> characters = new ArrayList<>();

        SimpsonCharacter homer = new SimpsonCharacter("Homer") {
            @Override
            public int compareTo(SimpsonCharacter simpson) {
                return this.name.length() - (simpson.name.length());
            }
        };

        SimpsonCharacter moe = new SimpsonCharacter("Moe") {
            @Override
            public int compareTo(SimpsonCharacter simpson) {
                return this.name.length() - (simpson.name.length());
            }
        };

        characters.add(homer);
        characters.add(moe);

        Collections.sort(characters);

        System.out.println(characters);
    }

}
