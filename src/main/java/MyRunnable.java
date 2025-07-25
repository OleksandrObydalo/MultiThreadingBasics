public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Потік через Runnable: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}

