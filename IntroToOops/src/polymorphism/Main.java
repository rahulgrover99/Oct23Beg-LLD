package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Bird bird  = new Penguin();
        List<Bird> birds = List.of(new Sparrow(), new Bird(), new Penguin());

        for (Bird bird: birds) {
            bird.fly();
        }
    }
}
