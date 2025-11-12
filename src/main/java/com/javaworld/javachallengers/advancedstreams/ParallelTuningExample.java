package com.javaworld.javachallengers.advancedstreams;

import java.util.concurrent.*;
import java.util.stream.IntStream;

public class ParallelTuningExample {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool(8);

        long result = pool.submit(() ->
                IntStream.range(0, 1_000_000)
                         .parallel()
                         .sum()
        ).join();
    }
}
