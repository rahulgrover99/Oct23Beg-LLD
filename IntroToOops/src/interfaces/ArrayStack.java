package interfaces;

import java.util.ArrayList;
import java.util.List;

public class ArrayStack implements Stack{

    List<Integer> list = new ArrayList<>();

    @Override
    public void pop() {
        list.remove(list.size() - 1);
    }

    @Override
    public void push(int x) {
        list.add(x);
    }

    @Override
    public int top() {
        return list.get(list.size() - 1);
    }
}
