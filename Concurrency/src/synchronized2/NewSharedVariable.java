package synchronized2;

public class NewSharedVariable {
    private int count;

    public synchronized void increment(int offset) {
        this.count += offset;
    }

    public synchronized void decrement(int offset) {
        this.count -= offset;
    }

    public int getCount() {
        return count;
    }
}
