package abstractclass;

public class DelhiFranchise extends PizzaStore{
    public DelhiFranchise() {
        super("Delhi");
    }

    @Override
    void kneadDough() {
        System.out.println("Knead dough using wheat");
    }
    // Class 'DelhiFranchise' must either be declared abstract or
    // implement abstract method 'kneadDough()' in 'PizzaStore'
}
