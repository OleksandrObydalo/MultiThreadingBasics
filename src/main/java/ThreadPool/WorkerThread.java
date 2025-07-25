package ThreadPool;

class WorkerThread implements Runnable {
    private final String message;

    WorkerThread(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println("Виконується: " + message + " - " + Thread.currentThread().getName());
    }
}
