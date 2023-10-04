public class Student {

    // Data or Attributes or Properties
    String name;
    String batch;
    double psp;
    int age;

    // Behaviours or methods.

    // This method should be able to change the
    // batch of the student object for which the method
    // has been called.
    void changeBatch(String batch) {
        // "this" keyword helps us refer the
        // object for which the method has been called.
        System.out.println("FROM BATCH "  + this);
        this.batch = batch;
    }

}
