package addersubtractor;

public class Subtractor implements Runnable{

    private SharedVariable sharedVariable;

    public Subtractor(SharedVariable sharedVariable) {
        this.sharedVariable = sharedVariable;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            sharedVariable.i -= i;
        }
    }
}
