package abstractclass;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new DelhiFranchise();
        pizzaStore.bake();
        pizzaStore.kneadDough();
    }
}
