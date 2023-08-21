package com.Problems;

import java.util.Scanner;

public class ArmstrongNumber {

    //An Armstrong number
    // (also known as a narcissistic number, pluperfect digital invariant, or pluperfect digital number)
    // is a number that is equal to the sum of its own digits
    // each raised to the power of the number of digits in the number itself.
    //In other words, for an n-digit number,
    // if the sum of its digits each raised to the power of n is equal to the number itself,
    // then the number is considered an Armstrong number.
    //For example:
    //153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
    //371 is an Armstrong number because 3^3 + 7^3 + 1^3 = 371.
    //1634 is an Armstrong number because 1^4 + 6^4 + 3^4 + 4^4 = 1634.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else{
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    public static boolean isArmstrong(int number)  {
        int originalNumber = number;
        int sum = 0;
        int numDigits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        return originalNumber == sum;
    }

}
