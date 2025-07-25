public class CounterApp {
    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Runnable incrementTask = () -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (CounterApp.class) {
                    counter++;
                }
            }
        };

        Thread t1 = new Thread(incrementTask);
        Thread t2 = new Thread(incrementTask);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Загальне значення лічильника: " + counter);
    }
}

