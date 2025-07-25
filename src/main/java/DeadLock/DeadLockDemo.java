package DeadLock;

public class DeadLockDemo {
    final static Object first = new Object();
    final static Object second = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (first) {
                try { Thread.sleep(10); } catch (Exception e) {}
                synchronized (second) {
                    System.out.println("Thread 1: Success!");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (second) {
                try { Thread.sleep(10); } catch (Exception e) {}
                synchronized (first) {
                    System.out.println("Thread 2: Success!");
                }
            }
        });

        t1.start();
        t2.start();

        try {
            Thread.sleep(20);
        } catch (Exception e) {}

        System.out.println("Thread 1 state: " + t1.getState()); // BLOCKED
        System.out.println("Thread 2 state: " + t2.getState()); // BLOCKED
    }
}

