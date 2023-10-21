package synchronized2;

public class Subtractor implements Runnable{
    private NewSharedVariable newSharedVariable;

    public Subtractor(NewSharedVariable newSharedVariable) {
        this.newSharedVariable = newSharedVariable;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            // Critical section
            newSharedVariable.decrement(i);
            System.out.println("Subtractor worked: "  + i);
        }
    }
}
