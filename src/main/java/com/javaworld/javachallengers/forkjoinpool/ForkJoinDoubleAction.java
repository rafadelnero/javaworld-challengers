package com.javaworld.javachallengers.forkjoinpool;

import java.util.ArrayList;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinDoubleAction {

  public static void main(String[] args) {
    ForkJoinPool forkJoinPool = new ForkJoinPool();

    int arrayLimit = 100000000;
    var array = new int[arrayLimit];

    for (int i = 0; i < arrayLimit; i++) {
      array[i] = i;
    }
    DoubleNumber doubleNumberTask = new DoubleNumber(array, 0, array.length);

    // Invokes compute method
    var start = System.currentTimeMillis();
//    doubleNumberTask.computeTest();
    forkJoinPool.invoke(doubleNumberTask);
    var end = System.currentTimeMillis() - start;


    System.out.println("End time:" + end);
    System.out.println(DoubleNumber.result);

  }
}

class DoubleNumber extends RecursiveAction {

  final int PROCESS_THRESHOLD = 10000000;
  int[] array;
  int startIndex, endIndex;
  static int result;

  DoubleNumber(int[] array, int startIndex, int endIndex) {
    this.array = array;
    this.startIndex = startIndex;
    this.endIndex = endIndex;
  }

  @Override
  protected void compute() {
    if (endIndex - startIndex <= PROCESS_THRESHOLD) {
      for (int i = startIndex; i < endIndex; i++) {
        result += array[i] * 2;
      }
    } else {
      int mid = (startIndex + endIndex) / 2;
      DoubleNumber leftArray = new DoubleNumber(array, startIndex, mid);
      DoubleNumber rightArray = new DoubleNumber(array, mid, endIndex);

      invokeAll(leftArray, rightArray);
    }
  }
}
