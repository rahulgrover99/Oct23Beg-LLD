package same;

public class SamePackage {
    public static void main(String[] args) {
        AccessModifier am = new AccessModifier();
        System.out.println(am.getData());
        // data has private access.
        // System.out.println(am.privatedata);
        System.out.println(am.defaultdata);
        System.out.println(am.publicdata);
    }
}
