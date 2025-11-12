package com.javaworld.javachallengers.advancedstreams;

import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ZippingStreams {

    void main() {
        zip(Stream.of(1, 2, 3),
                Stream.of("Duke", "Juggy", "Moby"),
                (n, s) -> n + " → " + s)
                .forEach(System.out::println);
    }

    public static <A, B, C> Stream<C> zip(
            Stream<A> a, Stream<B> b, BiFunction<A, B, C> combiner) {

        Iterator<A> itA = a.iterator();
        Iterator<B> itB = b.iterator();

        Iterable<C> iterable = () -> new Iterator<>() {
            public boolean hasNext() {
                return itA.hasNext() && itB.hasNext();
            }
            public C next() {
                return combiner.apply(itA.next(), itB.next());
            }
        };

        return StreamSupport.stream(iterable.spliterator(), false);
    }
}
