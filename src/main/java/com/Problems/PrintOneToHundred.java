package com.Problems;

public class PrintOneToHundred {
    public static void main(String[] args) {
        //Print 1 to 100 without using any numbers in your code

        int one = 'A'/'A'; //1 is the answer
        String s1 = "..........";
        String s2 ="programmin";

        // The first and the second solution use the length of the string to get to the number 100.
        // In both cases the length of the string is 10,
        // 10 * 10 = 100

        // 1st Solution
        for(int i=one; i<= (s1.length() * s1.length()); i++){
            System.out.println(i);
        }

        //2nd Solution
        for(int i = one; i <= (s1.length() * s1.length()); i++){
            System.out.println(i);
        }

        //According to ascii value: a=97,b=98,c=99,d=100.
        //Here we are writing d as 100
        for(int i=one; i<='d'; i+=one){
            System.out.println(i);
        }
    }


}
