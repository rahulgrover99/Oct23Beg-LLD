package addersubtractor;

public class Adder implements Runnable{

    private SharedVariable sharedVariable;

    public Adder(SharedVariable sharedVariable) {
        this.sharedVariable = sharedVariable;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            sharedVariable.i += i;
        }
    }
}
