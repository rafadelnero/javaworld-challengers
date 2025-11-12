package com.javaworld.javachallengers.forkjoinpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinWorkloadAction extends RecursiveAction {
  private final long workLoad;

  public ForkJoinWorkloadAction(long workLoad) {
    this.workLoad = workLoad;
  }

  protected void compute() {
    List<ForkJoinWorkloadAction> subtasks = new ArrayList<>(createSubtasks());
    for (RecursiveAction subtask : subtasks) {
      subtask.fork();
      System.out.println(workLoad);
    }
  }

  private List<ForkJoinWorkloadAction> createSubtasks() {
    ForkJoinWorkloadAction subtask1 = new ForkJoinWorkloadAction(this.workLoad / 2);
    ForkJoinWorkloadAction subtask2 = new ForkJoinWorkloadAction(this.workLoad / 2);
    ForkJoinWorkloadAction subtask3 = new ForkJoinWorkloadAction(this.workLoad / 2);

    return List.of(subtask1, subtask2, subtask3);
  }

  public static void main(String[] args) {
    int processorCores = Runtime.getRuntime().availableProcessors();
    System.out.println("Processor cores: " + processorCores);

    ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
    ForkJoinWorkloadAction task = new ForkJoinWorkloadAction(1000);

    forkJoinPool.invoke(task);

    System.out.println("Pool size: " + forkJoinPool.getPoolSize());
    System.out.println("Worker threads: " + forkJoinPool.getActiveThreadCount());
  }
}
