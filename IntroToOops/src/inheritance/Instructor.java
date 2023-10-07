package inheritance;

public class Instructor extends User {
    double rating;

    public Instructor() {
        System.out.println("Instructor constructor called.");
        System.out.println(name);
        login();
    }

    void teach() {
        System.out.println("Teach a session.");
    }
}
