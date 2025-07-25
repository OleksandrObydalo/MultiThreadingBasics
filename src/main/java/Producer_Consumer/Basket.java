package Producer_Consumer;

class Basket {
    private String fruit;
    private boolean available = false;

    public synchronized void put(String fruit) {
        while (available) {
            try { wait(); } catch (InterruptedException ignored) {}
        }
        this.fruit = fruit;
        available = true;
        System.out.println("Кладемо: " + fruit);
        notify();
    }

    public synchronized String get() {
        while (!available) {
            try { wait(); } catch (InterruptedException ignored) {}
        }
        available = false;
        System.out.println("Забираємо: " + fruit);
        notify();
        return fruit;
    }
}
