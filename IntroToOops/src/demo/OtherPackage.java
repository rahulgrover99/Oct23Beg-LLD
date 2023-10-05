package demo;


import same.AccessModifier;

public class OtherPackage {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        System.out.println(accessModifier.getData());

//        System.out.println(accessModifier.defaultdata);
        System.out.println(accessModifier.publicdata);
    }
}
