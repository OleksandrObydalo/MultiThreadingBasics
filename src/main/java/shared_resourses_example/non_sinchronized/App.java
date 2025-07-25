package shared_resourses_example.non_sinchronized;

public class App {
    public static int sum = 0;



    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Decrementor());
        Thread t2 = new Thread(new Incrementor());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Результат sum = " + sum);
    }
}
