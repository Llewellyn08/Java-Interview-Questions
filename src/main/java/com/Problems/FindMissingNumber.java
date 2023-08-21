package com.Problems;

public class FindMissingNumber {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,6};

        // Get the sum of the elements in the array
        int sum = 0;
        for(int i =0;i <a.length; i++){
            sum = sum + a[i];
        }
        System.out.println(sum);

        // Get the sum of the sequence getting by starting from 1 till the end of the sequence
        // Here we will get the sum with the missing number
        int sum1 = 0;
        for(int j=1; j<=6; j++){
            sum1 =sum1 + j;
        }
        System.out.println(sum1);

        // Minus sum1 with sum, this will give the missing number
        System.out.println("Missing number is: " + (sum1-sum));

    }
}
