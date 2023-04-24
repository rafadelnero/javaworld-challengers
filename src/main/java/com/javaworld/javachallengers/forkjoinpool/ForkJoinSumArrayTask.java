package com.javaworld.javachallengers.forkjoinpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinSumArrayTask {

  public static void main(String[] args) {
    var forkJoinPool = new ForkJoinPool();

    int arraySize = 100000;
    var numbers = new ArrayList<Integer>();
    for (int i = 0; i < arraySize; i++) {
      numbers.add(i);
    }

    var output = forkJoinPool.invoke(new SumArrayTask(numbers));


    System.out.println(output);
  }
}

class SumArrayTask extends RecursiveTask<Integer> {
  private final List<Integer> numbers;

  public SumArrayTask(List<Integer> numbers) {
    this.numbers = numbers;
  }

  @Override
  protected Integer compute() {
    if (numbers.size() <= 500000) {
      return numbers.stream().mapToInt(e -> e).sum();
    } else {
      int midIndex = numbers.size() / 2;
      var list1 = numbers.subList(0, midIndex);
      var list2 = numbers.subList(midIndex, numbers.size());

      var task1 = new SumArrayTask(list1);
      var task2 = new SumArrayTask(list2);

      task1.fork();

      return task1.join() + task2.compute();
    }
  }

}
