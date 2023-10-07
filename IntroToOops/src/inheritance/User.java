package inheritance;

public class User {
    protected String name;

//    private -> default -> protected -> public
    // protected the field is accessible outside the package in the CHILD class only.
    // default only in the same package, no dependency on the child class.

    public User() {
        System.out.println("User constructor is called.");
    }

    void login() {
        System.out.println("User is attempting login.");
    }
}
