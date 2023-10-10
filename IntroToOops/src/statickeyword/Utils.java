package statickeyword;

public class Utils {

    static final double fun1111 = 1.1;

    int age;

    static double convert(double celsius) {
        // Non-static field 'age' cannot be referenced from a static context
        // System.out.println(age);
        // fun();
        System.out.println(fun1111);
        return celsius*0.5;
    }

    double fun() {
        return 0;
    }
}
