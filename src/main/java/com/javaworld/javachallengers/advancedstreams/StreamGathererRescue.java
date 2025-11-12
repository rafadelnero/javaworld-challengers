package com.javaworld.javachallengers.advancedstreams;

import java.util.List;
import java.util.stream.Gatherers;
import java.util.stream.Stream;

public class StreamGathererRescue {

    void main() {
        List<Double> movingAverages = Stream.of(1, 2, 3, 4, 5, 6)
                .gather(Gatherers.windowSliding(3))
                .map(window -> window.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0))
                .toList();

        System.out.println(movingAverages); // [2.0, 3.0, 4.0, 5.0]
    }
}
