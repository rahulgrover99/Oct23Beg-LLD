package interfaces;

public class D implements B, C{
    @Override
    public void fun() {
        System.out.println("Diamond no longer a problem");
    }
}
