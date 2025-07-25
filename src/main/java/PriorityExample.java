public class PriorityExample extends Thread {
    public void run() {
        System.out.println("Потік " + getName() + " з пріоритетом " + getPriority());
    }

    public static void main(String[] args) {
        PriorityExample low = new PriorityExample();
        PriorityExample medium = new PriorityExample();
        PriorityExample high = new PriorityExample();

        low.setPriority(Thread.MIN_PRIORITY);
        medium.setPriority(Thread.NORM_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        low.start();
        medium.start();
        high.start();
    }
}

