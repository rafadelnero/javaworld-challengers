package com.javaworld.javachallengers.lazyinstantiation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class LazyHomerBeerCreationChallenge {

  public static int i = 0;
  public static Beer beer;

  static void createBeer() {
    if (beer == null) {
      try {
        Thread.sleep(200);
        beer = new Beer();
        i++;
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {
    ExecutorService executor = Executors.newFixedThreadPool(2);
    executor.submit(LazyHomerBeerCreationChallenge::createBeer);
    executor.submit(LazyHomerBeerCreationChallenge::createBeer);

    executor.awaitTermination(2, TimeUnit.SECONDS);
    executor.shutdown();
    System.out.println(i);
  }

  public static class Beer {}
}
