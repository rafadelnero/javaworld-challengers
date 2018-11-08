package com.javaworld.javachallengers.sortingcomparable;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String... barney) {
        Set<SimpsonCharacter> simpsonsCharacters = new TreeSet<>();
        simpsonsCharacters.add(new SimpsonCharacter("Moe"));
        simpsonsCharacters.add(new SimpsonCharacter("Lenny"));
        simpsonsCharacters.add(new SimpsonCharacter("Homer"));
        simpsonsCharacters.add(new SimpsonCharacter("Barney"));

        System.out.println(simpsonsCharacters);
    }
}
