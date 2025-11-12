package com.javaworld.javachallengers.sortingcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MarvelComparator {

    public static void main(String... comparator) {
        List<String> marvelHeroes = new ArrayList<>();

        marvelHeroes.add("SpiderMan ");
        marvelHeroes.add("Wolverine ");
        marvelHeroes.add("Xavier ");
        marvelHeroes.add("Cyclops ");


        Collections.sort(marvelHeroes, new Comparator<String>() {
            @Override
            public int compare(String hero1, String hero2) {
                return hero1.compareTo(hero2);
            }
        });

        Collections.sort(marvelHeroes, (m1, m2) -> m1.compareTo(m2));

        Collections.sort(marvelHeroes, Comparator.naturalOrder());

        marvelHeroes.forEach(System.out::print);
    }

}
