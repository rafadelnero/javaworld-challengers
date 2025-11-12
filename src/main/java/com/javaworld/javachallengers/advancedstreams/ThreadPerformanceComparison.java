import java.util.concurrent.*;
import java.util.stream.IntStream;

public class ThreadPerformanceComparison {
    public static void main(String[] args) throws Exception {
        int tasks = 1000;

        run("Platform Threads (FixedPool)",
                Executors.newFixedThreadPool(100), tasks);

        run("Virtual Threads (Per Task)",
                Executors.newVirtualThreadPerTaskExecutor(), tasks);
    }

    static void run(String label, ExecutorService executor, int tasks) throws Exception {
        long start = System.nanoTime();

        var futures = IntStream.range(0, tasks)
                .mapToObj(i -> executor.submit(() -> sleep(500)))
                .toList();

        // Wait for all to complete
        for (var future : futures) {
            future.get();
        }

        System.out.printf("%s finished in %.3f s%n",
                label, (System.nanoTime() - start) / 1_000_000_000.0);

        executor.shutdown();
    }

    static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
