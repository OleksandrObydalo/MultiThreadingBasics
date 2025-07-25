package shared_resourses_example.sincrhronized;

public class App {
    public static int sum = 0;

    public static synchronized void increment() {
        sum++;
    }

    public static synchronized void decrement() {
        sum--;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                decrement();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Результат sum = " + sum);
    }
}

