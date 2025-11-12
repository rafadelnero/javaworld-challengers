package com.javaworld.javachallengers.advancedstreams;

import java.util.List;

public class ParallelDemo {
    public static void main(String[] args) {
        List<String> names = List.of("Duke", "Juggy", "Moby", "Tux", "Dash");

        System.out.println("=== Sequential Stream ===");
        names.stream()
             .peek(n -> System.out.println(Thread.currentThread().getName() + " -> " + n))
             .filter(n -> n.length() > 4)
             .count();

        System.out.println("\n=== Parallel Stream ===");
        names.parallelStream()
             .peek(n -> System.out.println(Thread.currentThread().getName() + " -> " + n))
             .filter(n -> n.length() > 4)
             .count();
    }
}
