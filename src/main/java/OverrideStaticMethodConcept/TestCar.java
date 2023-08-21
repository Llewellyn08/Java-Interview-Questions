package OverrideStaticMethodConcept;

public class TestCar {

    public static void main(String[] args) {
        BMW b = new BMW();
        b.start(); //  Method Hiding
        b.stop(); // Method overriding
        b.refuel();
    }

    public  static void main(int a){

    }

    public  static void main(int a, int b){

    }
}
