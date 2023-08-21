package com.Problems;

import java.util.Scanner;

public class FindPrimeNumber {

    //Prime numbers are divisible by itself and 1
    //2 is the smallest prime number

    //Interview will ask two questions
    //1. Write the method to find prime numbers
    //2. Write all test cases/scenarios to test the method

    public static boolean isPrimeNumber(int num){
        //Edge/Corner Cases:

        if (num<=1){
            return false;
        }
        for(int i=2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void getPrimeNumbers(int range){
        for(int i = 2; i<=range; i++) {
            if (isPrimeNumber(i))
                System.out.print(i + " ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if(isPrimeNumber(num)){
            System.out.println(num + " is a prime number");
        }
        else{
            System.out.println(num + " is not a prime number");
        }

        System.out.print("Enter the number to get all prime numbers: ");
        int range = sc.nextInt();

        System.out.print("The prime numbers are ");
        getPrimeNumbers(range);

    }
}
