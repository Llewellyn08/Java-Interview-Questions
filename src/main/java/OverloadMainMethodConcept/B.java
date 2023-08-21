package OverloadMainMethodConcept;

public class B {

    //Do not call main method from A as it will cause stack overflow
    public static void main(String[] args) {
        System.out.println("B--Main Method");
        //A.main(args);
    }
}
