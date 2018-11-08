package com.javaworld.javachallengers.sortingcomparable;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String... barney) {
        Map<SimpsonCharacter, String> simpsonsCharacters = new TreeMap<>();
        simpsonsCharacters.put(new SimpsonCharacter("Moe"), "shotgun");
        simpsonsCharacters.put(new SimpsonCharacter("Lenny"), "Carl");
        simpsonsCharacters.put(new SimpsonCharacter("Homer"), "television");
        simpsonsCharacters.put(new SimpsonCharacter("Barney"), "beer");

        System.out.println(simpsonsCharacters);
    }
}
