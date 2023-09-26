package com.Problems;

public class NotANumber {
    public static void main(String[] args) {
        //System.out.println(2/0); // Arithmetic Exception
        System.out.println(2.0/0.0); // Infinity
        System.out.println(0.0/0.0);
        System.out.println(Math.sqrt(-1));

        System.out.println(Float.NaN == Float.NaN); //False
        System.out.println(Float.NaN != Float.NaN); //True

        double nan = 2.1 % 0; //NaN
        System.out.println((2.1 % 0) == nan); //false
        System.out.println(nan == nan); // false

        // Important Points
        //1. Cannot compare NaN. The answer will always be false
        //2. NaN is defined the same in other programming languages as well
        //3.
    }
}
