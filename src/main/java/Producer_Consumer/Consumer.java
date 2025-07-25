package Producer_Consumer;

class Consumer implements Runnable {
    private final Basket basket;

    public Consumer(Basket basket) {
        this.basket = basket;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            basket.get();
        }
    }
}
