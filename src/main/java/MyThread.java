public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Потік " + getName() + " працює!");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Круто!");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();  // запускаємо потік
        System.out.println("Потік працює паралельно");
    }
}

