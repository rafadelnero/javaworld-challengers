package com.javaworld.javachallengers.sortingcomparable;

import java.util.Arrays;

public class ArraySorting {

    public static void main(String... moeTavern) {
        int[] moesPints = new int[]{9, 8, 7, 6, 1};

        Arrays.sort(moesPints);

        Arrays.stream(moesPints).forEach(System.out::println);

        SimpsonCharacter[] simpsons = new SimpsonCharacter[]{new SimpsonCharacter("Lisa"), new SimpsonCharacter("Homer")};

        Arrays.sort(simpsons);
        Arrays.stream(simpsons).forEach(System.out::println);
    }


}
