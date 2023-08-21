package com.Problems;

import java.util.Scanner;

public class FactorialNumber {

    /*A factorial number is the product of all positive integers from 1 up to a given number.
    It's denoted by the exclamation mark (!).
    For example, the factorial of a positive integer n is represented as "n!" and calculated as:
    n! = n × (n - 1) × (n - 2) × ... × 2 × 1

    In other words, factorial n! is the product of all positive integers from 1 to n.
    Here's an example to illustrate factorial:
    Let's calculate the factorial of 5: 5!
    5! = 5 × 4 × 3 × 2 × 1 = 120

    So, the factorial of 5 is 120.
    Factorials are often used in various mathematical and combinatorial contexts,
    such as permutations, combinations, and series expansions.*/

    // Without using recursion
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);

        int factorialRecursion = recursionCalculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorialRecursion);

        scanner.close();
    }

    // Without using recursion
   public static int calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Using Recursive Function
    // What is Recursive function: A function is calling itself

    private static int recursionCalculateFactorial(int number){
        // Base case
        if (number == 0) {
            return 1;
        }
        // Recursive case
        return number * recursionCalculateFactorial(number - 1);
    }

    }
