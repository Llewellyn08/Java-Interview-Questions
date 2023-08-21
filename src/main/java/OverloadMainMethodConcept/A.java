package OverloadMainMethodConcept;

public class A {

    // Can we call main method from a different class?
    // Yes! Main method is static in nature
    public static void main(String[] args) {
        System.out.println("A--Main Method");
        B.main(args);
    }
}
