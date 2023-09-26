package Test.Revision;

import java.util.Scanner;

public class ReverseIntegerRevision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Integer: ");

        int number = scanner.nextInt();

        int reversedNumber = reverseInteger(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }

    public static int reverseInteger(int number){
        int reversedNumber = 0;

        while(number != 0){
            // To get the remainder
            int digit = number%10;

            // To store remainder and start reversal
            reversedNumber = reversedNumber * 10 + digit;

            // To get quotient and remove last number
            number /= 10;
        }
        return reversedNumber;
    }
}
