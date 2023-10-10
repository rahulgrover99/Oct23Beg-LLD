package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 'Stack' is abstract; cannot be instantiated
        // Stack stack = new Stack();

        Stack stack = new LLStack();

        stack.push(1);
        stack.push(2);
        stack.pop();
        System.out.println(stack.top());

        List<Integer> list = new ArrayList<>();

        System.out.println(list);

    }
}
