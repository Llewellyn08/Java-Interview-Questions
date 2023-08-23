package com.Problems;

import java.util.Scanner;

public class VerifyIfStringIsNumeric {

    // Check if a CharSequence (string) is empty or null
    public static boolean isEmpty(CharSequence cs){
        return cs == null || cs.length() == 0;
    }

    // Check if a CharSequence (string) consists of only numeric digits
    public static boolean isNumeric(CharSequence cs){
        int length = cs.length();
        for(int i = 0; i<length; i++){
            // If any character is not a digit, return false
            if(!Character.isDigit(cs.charAt(i))){
                return false;
            }
        }
        // All characters are digits, return true
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        // Check if input is empty
        if (isEmpty(input)) {
            System.out.println("No input provided.");
        } else {
            // Check if input consists of only digits
            boolean isInputNumeric = isNumeric(input);

            // Display appropriate message based on input
            if (isInputNumeric) {
                System.out.println("The input string consists of only digits.");
            } else {
                System.out.println("The input string contains non-digit characters.");
            }
        }

        // Close the scanner to release resources
        scanner.close();


    }
}
