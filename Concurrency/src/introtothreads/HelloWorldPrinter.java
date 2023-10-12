package introtothreads;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello world by " + Thread.currentThread().getName());
    }
}
