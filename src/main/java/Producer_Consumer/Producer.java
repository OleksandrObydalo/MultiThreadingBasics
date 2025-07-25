package Producer_Consumer;

class Producer implements Runnable {
    private final Basket basket;
    private final String[] fruits = {"Яблуко", "Апельсин", "Груша"};

    public Producer(Basket basket) {
        this.basket = basket;
    }

    public void run() {
        for (String fruit : fruits) {
            basket.put(fruit);
        }
    }
}
