package com.Problems;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        // TOPICS:
        // Reverse a String?
        // Difference between String and String Buffer/String Builder? String Builder is used here.
        // Do we have a reverse function in String?

        // Initialize a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the input string using the custom method and print the result
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        // Reverse the input string using StringBuilder and print the result
        String reverseStringBuilder = reverseStringBuilder(input);
        System.out.println("Reversed stringBuilder: " + reverseStringBuilder);

        // Close the scanner to release resources
        scanner.close();

    }

    // 1. Reverse a string using a custom method
    public static String reverseString(String str) {
        int length = str.length();
        System.out.println(length);
        String reversed = " ";

        // Iterate through the characters of the string in reverse order
        for (int i = length - 1; i >= 0; i--) {
            // Append each character to the reversed StringBuilder
            reversed+=(str.charAt(i));
        }

        // Return Reversed String
        return reversed;
    }

    // 2. Reverse a string using the StringBuffer class
    public static String reverseStringBuilder(String s) {
        // String Builder is mutable and can be changed unlike String
        // Create a StringBuilder instance with the input string
        StringBuilder stringBuilder = new StringBuilder(s);

        // Use the reverse() method of StringBuilder to reverse the content
        stringBuilder.reverse();

        // Convert the reversed StringBuilder back to a string
        return stringBuilder.toString();
    }



}
