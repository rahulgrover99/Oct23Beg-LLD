package introtothreads;

public class Client {


    public static void main(String[] args) {
        System.out.println("Hello world by " + Thread.currentThread().getName());
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
//        helloWorldPrinter.run();
        Thread t1 = new Thread(helloWorldPrinter);
        t1.start();
    }
}
