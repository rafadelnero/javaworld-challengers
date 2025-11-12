package com.javaworld.javachallengers.advancedstreams;

import java.util.*;
import java.util.stream.*;
import java.time.*;

public class ParallelThresholdDemo {
    public static void main(String[] args) {
        List<Integer> sizes = List.of(10_000, 100_000, 1_000_000, 10_000_000);

        for (int size : sizes) {
            List<Integer> data = IntStream.range(0, size).boxed().toList();

            System.out.printf("%nData size: %,d%n", size);
            System.out.printf("Sequential: %d ms%n",
                time(() -> data.stream()
                               .mapToLong(ParallelThresholdDemo::cpuWork)
                               .sum()));
            System.out.printf("Parallel:   %d ms%n",
                time(() -> data.parallelStream()
                               .mapToLong(ParallelThresholdDemo::cpuWork)
                               .sum()));
        }
    }

    static long cpuWork(long n) {
        long r = 0;
        for (int i = 0; i < 200; i++) r += Math.sqrt(n + i);
        return r;
    }

    static long time(Runnable task) {
        Instant start = Instant.now();
        task.run();
        return Duration.between(start, Instant.now()).toMillis();
    }
}
