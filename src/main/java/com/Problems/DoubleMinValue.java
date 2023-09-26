package com.Problems;

public class DoubleMinValue {
    public static void main(String[] args) {
        /*
         * What is the value of double MIN_VALUE?
         * Which one is bigger -> Double MIN_VALUE or 0.0d ?
         * Which one is bigger →>Double MIN_VALUE or NEGATIVE_INFINITY?
         */

        System.out.println(Double.MIN_VALUE); // +ve number

        System.out.println(Long.MIN_VALUE); // -ve number
        System.out.println(Integer.MIN_VALUE); // -ve number

        System.out.println(Math.min(Double.MIN_VALUE, 0.0d)); //Double Min_Value is Bigger
        System.out.println(Math.min(Integer.MIN_VALUE, 0)); // 0 is bigger

        System.out.println(Math.min(Float.MIN_VALUE, 0.0f)); // Float Min_Value is Bigger

        System.out.println(Float.MIN_VALUE); // +ve number

        System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY)); // Double Min_Value is Bigger

    }
}
