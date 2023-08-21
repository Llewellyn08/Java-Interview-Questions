package OverrideStaticMethodConcept;

public class Car {

    // Method Hiding
    public static void start(){
        System.out.println("Car Start --");
    }

    // Method Overriding
    public void stop(){
        System.out.println("Car Stop --");
    }

    public void refuel(){
        System.out.println("Car Refuel --");
    }

    //Method Overloading
    public static void start(String price){
        System.out.println("Car Start");
    }
}
