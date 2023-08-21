package com.Problems;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int reversedNumber = reverseInteger(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversedNumber);

    //2.  Using StringBuffer method
        System.out.println("Reversed number using StringBuffer: "
                + new StringBuffer(String.valueOf(number)).reverse());

    }

    //1.  Using Algo
    public static int reverseInteger(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            // Remainder of number/10
            int digit = number % 10;
            // reversedNumber * 10 + remainder of number/10
            reversedNumber = reversedNumber * 10 + digit;
            // Divde number/10 and remove the last number(quotient)
            number /= 10;
        }
        return reversedNumber;
    }

}
