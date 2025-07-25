public class PauseExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(1000); // 1 секунда
                System.out.println("Потік після сну");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t.start();
        t.join(); // дочекаємось завершення потоку
        System.out.println("Головний потік завершено");
    }
}

