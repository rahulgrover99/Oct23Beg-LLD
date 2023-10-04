public class Main {
    public static void main(String[] args) {
        // Creating an object in heap memory
        // student1 simply stores the reference of
        // that created object in the heap memory
       Student student1 = new Student();

       // Update the attributes of that object
       student1.name = "Ajay";
       student1.age = 30;
       student1.psp = 90;
       student1.batch = "X";


        // Creating another object
        Student student2 = new Student();
        // Only changes the name of second object
        student2.name = "Vinay";


       String name = "Rahul";

        System.out.println(student1.batch);

        student1.changeBatch("Y");


        System.out.println(student1.batch);
    }
}