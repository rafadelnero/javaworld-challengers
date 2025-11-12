package com.javaworld.javachallengers.callback;

import java.util.HashSet;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureCallback {

  public static void main(String[] args) throws Exception {
    CompletableFuture<String> completableFuture
        = CompletableFuture.supplyAsync(() -> "Supply Async...");

    CompletableFuture<String> execution = completableFuture
        .thenApply(s -> s + " Callback executed...");

    System.out.println(execution.get());
  }

}
