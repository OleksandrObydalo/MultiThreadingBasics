package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3); // 3 потоки в пулі
        for (int i = 1; i <= 5; i++) {
            executor.execute(new WorkerThread("Задача " + i));
        }
        executor.shutdown();
    }
}
