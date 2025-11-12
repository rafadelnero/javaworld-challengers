package com.javaworld.javachallengers.advancedstreams;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BeforeGatherers {

    void main() {
        List<Integer> data = List.of(1, 2, 3, 4, 5, 6);
        List<Double> movingAverages = new ArrayList<>();
        Deque<Integer> window = new ArrayDeque<>();

        for (int value : data) {
            window.add(value);
            if (window.size() > 3) {
                window.removeFirst();
            }

            if (window.size() == 3) {  // Only calculate when window is full
                double avg = window.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0);
                movingAverages.add(avg);
            }
        }

        System.out.println(movingAverages); // [2.0, 3.0, 4.0, 5.0]
    }

}
