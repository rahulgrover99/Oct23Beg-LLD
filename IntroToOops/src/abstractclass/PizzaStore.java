package abstractclass;

public abstract class PizzaStore {

    String location;

    public PizzaStore(String location) {
        this.location = location;
    }

    // Declaration
    abstract void kneadDough();


    // Definition or implementation.
    void bake() {
        System.out.println("Baking at 65 degree celsius");
        System.out.println("Bake for 2 mins");
    }
}
