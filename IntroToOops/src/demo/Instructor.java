package demo;

import inheritance.User;

public class Instructor extends User {
    double rating;

    public Instructor() {
        System.out.println("Instructor constructor called.");
        System.out.println(name);
    }

    void teach() {
        System.out.println("Teach a session.");
    }
}
