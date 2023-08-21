package OverloadMainMethodConcept;

public class TestBase {

    // What is method overloading?
    //Method overloading is a Java feature that allows a class to have multiple methods with the
    // same name but different parameter lists, enabling the methods to perform
    // different tasks based on the input provided.

    // JVM will search method with --main(Strings[] args) and it has to be public static void
    // If not found JVM will not execute the program

    public static void main(String[] args) {
        System.out.println("main method");

        main("Testing");
        main(10);
        main(10,20);
    }

    // The other main methods will need to be called into Strings[] args method if they have to be run
    // If not called the other main methods will not run

    public static void main(String args) {
        System.out.println("main method-2");
    }

    public static void main(int a) {
        System.out.println("main method-3");
    }

    public static void main(int a, int b) {
        System.out.println("main method-4");
    }
}
