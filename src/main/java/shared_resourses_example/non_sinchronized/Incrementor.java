package shared_resourses_example.non_sinchronized;

public class Incrementor implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            App.sum++; // збільшуємо sum
        }
    }
}
