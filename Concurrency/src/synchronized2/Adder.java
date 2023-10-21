package synchronized2;

public class Adder implements Runnable {
    private NewSharedVariable newSharedVariable;

    public Adder(NewSharedVariable newSharedVariable) {
        this.newSharedVariable = newSharedVariable;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            // Critical section
            newSharedVariable.increment(i);
            System.out.println("Adder worked: "  + i);
        }
    }
}
