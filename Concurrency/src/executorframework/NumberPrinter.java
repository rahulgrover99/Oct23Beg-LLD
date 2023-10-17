package executorframework;

public class NumberPrinter implements Runnable{
    int i;

    public NumberPrinter(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("Printing " + i + " from: " + Thread.currentThread().getName());
    }
}
