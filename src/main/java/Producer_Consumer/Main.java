package Producer_Consumer;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        new Thread(new Producer(basket)).start();
        new Thread(new Consumer(basket)).start();
    }
}
