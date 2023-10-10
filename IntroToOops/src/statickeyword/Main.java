package statickeyword;

public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        System.out.println(Utils.convert(78));
        System.out.println(Utils.fun1111);
        // Static member 'statickeyword.Utils.convert(double)' accessed via instance reference
        utils.convert(89);
    }
}
