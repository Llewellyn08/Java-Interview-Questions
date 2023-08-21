package com.Problems;

import java.util.Scanner;

public class PalindromeNumber {

    // A palindrome number is a number that reads the same forwards as it does backwards.
    // In other words, when the digits of a number are reversed,
    // the result remains the same as the original number.
    //For example:
    //121 is a palindrome number because it reads the same forwards and backwards

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt(); // Read the number from the user

            // Check if the entered number is a palindrome
            if (isPalindrome(number)) {
                System.out.println(number + " is a palindrome number.");
            } else {
                System.out.println(number + " is not a palindrome number.");
            }

            scanner.close(); // Close the scanner to release resources
        }

        // Function to check if a number is a palindrome
        public static boolean isPalindrome(int number) {
            int originalNumber = number; // Store the original number for comparison
            int reversedNumber = 0; // To store the reversed number

            // Reverse the digits of the number
            while (number != 0) {
                int digit = number % 10; // Extract the last digit
                reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
                number /= 10; // Remove the last digit
            }

            // Check if the reversed number is equal to the original number
            return originalNumber == reversedNumber;
        }
    }