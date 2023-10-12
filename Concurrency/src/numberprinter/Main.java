package numberprinter;

public class Main {

    public static void main(String[] args)  {
        System.out.println("Lets start the magic: " + Thread.currentThread().getName());

        for (int i = 0; i < 100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i + 1);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }

        System.out.println("Main thread reached the last line.");
    }
}
