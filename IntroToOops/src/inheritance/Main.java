package inheritance;

public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        instructor.rating = 9.0;
        System.out.println(instructor.name);

        instructor.teach();
        instructor.login();

    }
}
