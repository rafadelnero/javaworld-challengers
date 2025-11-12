package com.javaworld.javachallengers.advancedstreams;

import java.util.stream.Gatherers;
import java.util.stream.Stream;

public class ScanGatherer {

    void main() {
        Stream.of(2, 4, 6, 8)
                .gather(Gatherers.scan(() -> 0, Integer::sum))
                .forEach(System.out::println);
                // 2, 6, 12, 20
    }
}
