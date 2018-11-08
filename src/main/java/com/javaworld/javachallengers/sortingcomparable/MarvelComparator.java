package com.javaworld.javachallengers.sortingcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MarvelComparator {

    public static void main(String... comparator) {
        List<String> marvel = new ArrayList<>(List.of("SpiderMan ", "Wolverine ", "Xavier ",
                "Cyclops "));

        Collections.sort(marvel, new Comparator<String>() {
            @Override
            public int compare(String hero1, String hero2) {
                return hero1.compareTo(hero2);
            }
        });

        Collections.sort(marvel, (m1, m2) -> m1.compareTo(m2));

        Collections.sort(marvel, Comparator.naturalOrder());

        marvel.forEach(System.out::print);
    }

}
