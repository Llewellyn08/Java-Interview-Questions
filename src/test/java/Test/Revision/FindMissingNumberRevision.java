package Test.Revision;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissingNumberRevision {
    public static void main(String[] args) {
        //Creating a scanner class
        Scanner scanner = new Scanner(System.in);

        //Prompt user to enter the number of elements in the array
        System.out.print("Enter the number of elements in an array: ");

        //Store and assign the number of elements to the array
        int n = scanner.nextInt();
        int[] a = new int[n];

        //Prompt user to enter the elements to be included in the array
        System.out.print("Enter the elements of the array: ");

        //Loop to iterate through all elements and add it to the array
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }

        // Close the scanner to release resources
        scanner.close();

        //Finding the last element of the array. Will reduce hardcoding
        int lastElement=0;
        for(int num: a){
            lastElement = num;
        }

        //Calculating the actual sum of the array
        int actualSum=0;
        for(int num : a){
            actualSum += num;
        }
        System.out.println("The actual sum of the array is: " + actualSum);

        //Calculating the expected sum of the array
        int expectedSum=0;
        for(int j=a[0]; j<=lastElement; j++){
            expectedSum += j;
        }
        System.out.println("The expected sum of the array is: " + expectedSum);

        //Finding the missing number
        System.out.println("The missing element is: " + (expectedSum - actualSum));
    }
}
