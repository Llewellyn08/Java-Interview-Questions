package com.Problems;

import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to store the user input
        int[] a = new int[n];

        // Prompt the user to enter the elements of the array
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Close the scanner to release resources
        scanner.close();

        //Find the last element of the array
        int lastElement = 0;
        for(int num : a){
            lastElement = num;
        }

        // Calculate the sum of the elements in the array
        int actualSum = 0;
        for (int num : a) {
            actualSum += num;
        }
        System.out.println("Sum of actual array: " + actualSum);

        // Calculate the expected sum of the sequence from 1 to n+1
        int expectedSum = 0;
        for (int j = a[0]; j <= lastElement; j++) {
            expectedSum += j;
        }
        System.out.println("Expected sum of array: " + expectedSum);

        // Calculate the missing number in the array by finding the difference between expectedSum and actualSum
        System.out.println("Missing number in the array is " + (expectedSum - actualSum));
    }
}
