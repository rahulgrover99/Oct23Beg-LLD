package interfaces;

public class LLStack implements Stack{
    @Override
    public void pop() {
        System.out.println("popped");
    }

    @Override
    public void push(int x) {
        System.out.println("pushed");
    }

    @Override
    public int top() {
        return 0;
    }
}
