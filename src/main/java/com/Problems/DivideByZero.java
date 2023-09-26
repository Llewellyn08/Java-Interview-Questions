package com.Problems;

public class DivideByZero {
    public static void main(String[] args) {
        // If a float or double number is divided by zero, the out put will be infinity as this is how it is defined in java

        System.out.println(9.0/0); // Infinity
        System.out.println (12.33f/0); // Infinity
        System.out.println(10/0.0); // Infinity
        System.out.println (19.99999d/0); // Infinity
//        System.out.println(0/0); // --> Arthimetic Exception
        System.out.println(0.0/0); // NaN
        System.out.println(0.0/0.0); // NaN
        System.out.println(12.33/0.0); // Infinity
    }
}
